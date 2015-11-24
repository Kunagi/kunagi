/*
 * Copyright 2011 Witoslaw Koczewsi <wi@koczewski.de>, Artjom Kochtchi
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package scrum.server.project;

import ilarkesto.base.Proc;
import ilarkesto.base.Str;
import ilarkesto.base.Sys;
import ilarkesto.base.Tm;
import ilarkesto.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.time.Date;
import ilarkesto.core.time.DateAndTime;
import ilarkesto.integration.velocity.ContextBuilder;
import ilarkesto.integration.velocity.Velocity;
import ilarkesto.io.IO;
import ilarkesto.persistence.AEntity;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import scrum.client.wiki.Header;
import scrum.client.wiki.HtmlContext;
import scrum.client.wiki.WikiModel;
import scrum.client.wiki.WikiParser;
import scrum.server.ScrumWebApplication;
import scrum.server.admin.SystemConfig;
import scrum.server.admin.User;
import scrum.server.collaboration.Comment;
import scrum.server.collaboration.CommentDao;
import scrum.server.collaboration.Wikipage;
import scrum.server.common.BurndownChart;
import scrum.server.issues.Issue;
import scrum.server.pr.BlogEntry;
import scrum.server.release.Release;
import scrum.server.sprint.Sprint;
import scrum.server.sprint.SprintReport;

public class HomepageUpdater {

	private static Log log = Log.get(HomepageUpdater.class);

	private Project project;
	private MyHtmlContext htmlContext;
	private File templateDir;
	private File outputDir;
	private Velocity velocity;
	private Properties properties;

	public HomepageUpdater(Project project, String templatePath, String outputPath) {
		super();
		assert project != null;
		this.project = project;
		this.templateDir = new File(templatePath);
		this.outputDir = new File(outputPath);
		htmlContext = new MyHtmlContext(project);
		velocity = new Velocity(templateDir);

		loadProperties();
	}

	public HomepageUpdater(Project project) {
		this(project, project.getHomepageVelocityDir(), Sys.isDevelopmentMode() ? "runtimedata/homepage" : project
				.getHomepageDir());
	}

	public void processAll() {
		executeScript("pre-update");
		processDefaultTemplates();
		processIssueTemplates();
		processStoryTemplates();
		processReleaseTemplates();
		processBlogEntryTemplates();
		processSprintTemplates();
		createSprintBurndownChart(700, 200);
		executeScript("post-update");
	}

	public void processEntityTemplate(AEntity entity) {
		executeScript("pre-update");
		if (entity instanceof Issue) {
			Issue issue = (Issue) entity;
			if (!issue.isPublished()) return;
			processIssueTemplate(issue);
		} else if (entity instanceof Requirement) {
			Requirement story = (Requirement) entity;
			processStoryTemplate(story);
		} else if (entity instanceof BlogEntry) {
			BlogEntry blogEntry = (BlogEntry) entity;
			if (!blogEntry.isPublished()) return;
			processBlogEntryTemplate(blogEntry);
		}
		executeScript("post-update");
	}

	private void executeScript(String name) {
		File file = null;
		File dir = new File(project.getHomepageDir() + "/scripts");
		if (!dir.exists()) return;
		for (File f : dir.listFiles()) {
			if (!f.isFile()) continue;
			if (!f.getName().startsWith(name)) continue;
			file = f;
			break;
		}
		if (file == null) return;
		log.info("Executing script:", file.getAbsolutePath());
		String output = Proc.execute(project.getHomepageDirFile(), file.getAbsolutePath());
		log.info(" ", file.getName() + ":", output);
	}

	private void processDefaultTemplates() {
		ContextBuilder context = new ContextBuilder();

		fillConfig(context.putSubContext("config"));
		fillProject(context.putSubContext("project"));
		fillWiki(context.putSubContext("wiki"));
		fillBlog(context.putSubContext("blog"));
		fillSprint(context.putSubContext("sprintBacklog"), project.getCurrentSprint());
		fillProductBacklog(context.putSubContext("productBacklog"));
		fillBugs(context);
		fillIdeas(context);
		fillClosedIssues(context);
		fillReleases(context);
		fillIssues(context);
		fillStories(context);

		File[] templateFiles = templateDir.listFiles();
		if (templateFiles == null) return;
		for (File templateFile : templateFiles) {
			String templateName = templateFile.getName();
			if (!templateName.endsWith(".vm")) continue;
			if (templateName.equals(Velocity.LIB_TEMPLATE_NAME)) continue;
			if (templateName.startsWith("iss.")) continue;
			if (templateName.startsWith("blg.")) continue;
			if (templateName.startsWith("sto.")) continue;
			String outputFileName = Str.removeSuffix(templateName, ".vm");
			velocity.processTemplate(templateName, new File(outputDir.getPath() + "/" + outputFileName), context);
		}
	}

	private void processEntityTemplate(ContextBuilder context, String reference) {
		fillConfig(context.putSubContext("config"));
		fillProject(context.putSubContext("project"));
		fillProductBacklog(context.putSubContext("productBacklog"));
		fillSprint(context.putSubContext("sprintBacklog"), project.getCurrentSprint());
		fillWiki(context.putSubContext("wiki"));

		String prefix = reference.substring(0, 3);
		File[] templateFiles = templateDir.listFiles();
		if (templateFiles == null) return;
		for (File templateFile : templateFiles) {
			String templateName = templateFile.getName();
			if (!templateName.endsWith(".vm")) continue;
			if (!templateName.startsWith(prefix + ".")) continue;
			String outputFileName = Str.removeSuffix(templateName, ".vm");
			outputFileName = Str.removePrefix(outputFileName, prefix + ".");
			outputFileName = reference + "." + outputFileName;
			velocity.processTemplate(templateName, new File(outputDir.getPath() + "/" + outputFileName), context);
		}
	}

	private void fillConfig(ContextBuilder context) {
		SystemConfig config = ScrumWebApplication.get().getSystemConfig();
		context.put("kunagiUrl", config.getUrl());
		context.put("kunagiAdminEmail", config.getAdminEmail());
		context.put("kunagiInstanceName", config.getInstanceName());
	}

	private void processReleaseTemplates() {
		List<Release> releases = new ArrayList<Release>(project.getReleases());
		Collections.sort(releases, Release.DATE_REVERSE_COMPARATOR);
		for (Release release : releases) {
			if (!release.isReleased()) continue;
			ContextBuilder context = new ContextBuilder();
			fillRelease(context.putSubContext("release"), release);
			String reference = release.getReference();
			processEntityTemplate(context, reference);
		}
	}

	private void processIssueTemplates() {
		List<Issue> issues = new ArrayList<Issue>(project.getPublishedIssues());
		for (Issue issue : issues) {
			processIssueTemplate(issue);
		}
	}

	private void processIssueTemplate(Issue issue) {
		ContextBuilder context = new ContextBuilder();
		fillIssue(context.putSubContext("issue"), issue);
		processEntityTemplate(context, issue.getReference());
	}

	private void processSprintTemplates() {
		for (Sprint sprint : project.getCompletedSprintsInReverseOrder()) {
			processSprintTemplate(sprint);
		}
	}

	private void processSprintTemplate(Sprint sprint) {
		ContextBuilder context = new ContextBuilder();
		fillSprint(context.putSubContext("sprint"), sprint);
		processEntityTemplate(context, sprint.getReference());
	}

	private void processStoryTemplates() {
		List<Requirement> requirements = new ArrayList<Requirement>(project.getRequirements());
		for (Requirement requirement : requirements) {
			// if (requirement.isClosed()) continue;
			processStoryTemplate(requirement);
		}
	}

	private void processStoryTemplate(Requirement requirement) {
		ContextBuilder context = new ContextBuilder();
		fillStory(context.putSubContext("story"), requirement);
		processEntityTemplate(context, requirement.getReference());
	}

	private void processBlogEntryTemplates() {
		List<BlogEntry> entries = new ArrayList<BlogEntry>(project.getBlogEntrys());
		for (BlogEntry entry : entries) {
			if (!entry.isPublished()) continue;
			processBlogEntryTemplate(entry);
		}
	}

	private void processBlogEntryTemplate(BlogEntry entry) {
		ContextBuilder context = new ContextBuilder();
		fillBlogEntry(context.putSubContext("entry"), entry);
		processEntityTemplate(context, entry.getReference());
	}

	private void createSprintBurndownChart(int width, int height) {
		byte[] imageData = BurndownChart.createBurndownChartAsByteArray(project.getCurrentSprint(), width, height);
		IO.copyDataToFile(imageData,
			new File(outputDir.getPath() + "/sprint-burndown-" + width + "x" + height + ".png"));
	}

	private void fillIssues(ContextBuilder context) {
		List<Issue> issues = new ArrayList<Issue>(project.getBugsInCurrentRelease());
		Collections.sort(issues, Issue.ACCEPT_DATE_COMPARATOR);
		for (Issue issue : project.getIssues()) {
			if (!issue.isPublished()) continue;
			fillIssue(context.addSubContext("issues"), issue);
		}
	}

	private void fillBugs(ContextBuilder context) {
		List<Issue> issues = new ArrayList<Issue>(project.getBugsInCurrentRelease());
		Collections.sort(issues, Issue.ACCEPT_DATE_COMPARATOR);
		for (Issue issue : issues) {
			fillIssue(context.addSubContext("bugs"), issue);
		}
	}

	private void fillIdeas(ContextBuilder context) {
		List<Issue> issues = new ArrayList<Issue>(project.getOpenIdeas());
		Collections.sort(issues, Issue.ACCEPT_DATE_COMPARATOR);
		for (Issue issue : issues) {
			fillIssue(context.addSubContext("ideas"), issue);
		}
	}

	private void fillClosedIssues(ContextBuilder context) {
		List<Issue> issues = new ArrayList<Issue>(project.getClosedIssues());
		Collections.sort(issues, Issue.CLOSE_DATE_COMPARATOR);
		for (Issue issue : issues) {
			fillIssue(context.addSubContext("closedIssues"), issue);
		}
	}

	private void fillReleases(ContextBuilder context) {
		List<Release> releases = new ArrayList<Release>(project.getReleases());
		Collections.sort(releases, Release.DATE_REVERSE_COMPARATOR);
		for (Release release : releases) {
			fillRelease(context.addSubContext("releases"), release);
		}
	}

	private void fillIssue(ContextBuilder context, Issue issue) {
		context.put("id", issue.getId());
		context.put("reference", issue.getReference());
		context.put("label", toHtml(issue.getLabel()));
		context.put("description", wikiToHtml(issue.getDescription()));
		context.put("statement", wikiToHtml(issue.getStatement()));
		context.put("statusText", toHtml(issue.getStatusText()));
		if (issue.isOwnerSet()) context.put("owner", issue.getOwner().getPublicName());
		if (issue.isFixed()) context.put("fixed", "true");
		context.put("themes", toHtml(issue.getThemes()));
		context.put("fixReleasesAsString", issue.getFixReleasesAsString());
		context.put("externalTrackerId", issue.getExternalTrackerId());
		fillComments(context, issue);
	}

	private void fillComments(ContextBuilder context, AEntity entity) {
		CommentDao commentDao = (CommentDao) entity.getDaoService().getDaoByClass(Comment.class);
		Collection<Comment> comments = commentDao.getPublishedCommentsByParent(entity);
		comments = Utl.sort(comments);
		for (Comment comment : comments) {
			fillComment(context.addSubContext("comments"), comment);
		}
	}

	private void fillComment(ContextBuilder context, Comment comment) {
		context.put("id", comment.getId());
		context.put("text", wikiToHtml(comment.getText()));
		context.put("author", toHtml(comment.getAuthorLabel()));
		User author = comment.getAuthor();
		if (author != null) {
			context.put("authorRoles", toHtml(project.getUsersRolesAsString(author, null, null)));
		}
		context.put("date", Tm.FORMAT_WEEKDAY_LONGMONTH_DAY_YEAR_HOUR_MINUTE.format(comment.getDateAndTime()));
		context.put("dateDe", new SimpleDateFormat("EEE, d. MMMMM yyyy, HH:mm", Locale.GERMANY).format(comment
			.getDateAndTime().toJavaDate()));
	}

	private void fillRelease(ContextBuilder context, Release release) {
		context.put("id", release.getId());
		context.put("reference", release.getReference());
		context.put("label", toHtml(release.getLabel()));
		context.put("note", wikiToHtml(release.getNote()));
		context.put("releaseNotes", wikiToHtml(release.getReleaseNotes()));
		context.put("releaseDate", Tm.FORMAT_LONGMONTH_DAY_YEAR.format(release.getReleaseDate()));
		context.put("released", release.isReleased());
		context.put("major", release.isMajor());
		context.put("bugfix", release.isBugfix());

		for (Requirement requirement : release.getClosedRequirements()) {
			ContextBuilder reqContext = context.addSubContext("finishedStories");
			reqContext.put("reference", requirement.getReference());
			reqContext.put("label", requirement.getLabel());
		}

		for (Issue issue : release.getAffectedIssues()) {
			fillIssue(context.addSubContext("affectedByIssues"), issue);
		}

		for (Issue issue : release.getFixIssues()) {
			if (issue.isFixed() || issue.isClosed()) {
				fillIssue(context.addSubContext("fixedIssues"), issue);
			} else {
				fillIssue(context.addSubContext("plannedIssues"), issue);
			}
		}

		fillComments(context, release);
	}

	private void fillSprint(ContextBuilder context, Sprint sprint) {
		context.put("id", sprint.getId());
		context.put("reference", sprint.getReference());
		context.put("label", toHtml(sprint.getLabel()));
		context.put("goal", wikiToHtml(sprint.getGoal()));
		context.put("goal", wikiToHtml(sprint.getGoal()));
		if (sprint.isBeginSet()) {
			context.put("begin", Tm.FORMAT_LONGMONTH_DAY_YEAR.format(sprint.getBegin()));
			context.put("beginDe", sprint.getBegin().formatDayMonthYear());
		}
		if (sprint.isEndSet()) {
			context.put("end", Tm.FORMAT_LONGMONTH_DAY_YEAR.format(sprint.getEnd()));
			context.put("endDe", sprint.getEnd().formatDayMonthYear());
		}

		SprintReport report = sprint.getSprintReport();
		if (sprint.isCompleted() && report != null) {
			for (Requirement requirement : Utl.sort(report.getCompletedRequirements(),
				sprint.getRequirementsOrderComparator())) {
				fillStory(context.addSubContext("completedStories"), requirement);
			}
			for (Requirement requirement : Utl.sort(report.getRejectedRequirements(),
				sprint.getRequirementsOrderComparator())) {
				fillStory(context.addSubContext("rejectedStories"), requirement);
			}
		} else {
			for (Requirement requirement : Utl.sort(sprint.getRequirements(), sprint.getRequirementsOrderComparator())) {
				fillStory(context.addSubContext("stories"), requirement);
			}
		}

		fillComments(context, sprint);
	}

	private void fillBlog(ContextBuilder context) {
		List<BlogEntry> entries = new ArrayList<BlogEntry>(project.getBlogEntrys());
		Collections.sort(entries);
		for (BlogEntry entry : entries) {
			if (!entry.isPublished()) continue;
			fillBlogEntry(context.addSubContext("entries"), entry);
		}
	}

	private void fillBlogEntry(ContextBuilder context, BlogEntry entry) {
		context.put("id", entry.getId());
		context.put("reference", entry.getReference());
		context.put("url", entry.getUrl());
		context.put("urlEncodedForUrl", Str.encodeUrlParameter(entry.getUrl()));
		context.put("title", toHtml(entry.getTitle()));
		context.put("text", wikiToHtml(entry.getText()));
		context.put("textShort", wikiToHtml(Str.getFirstParagraph(entry.getText())));
		context.put("plainText", wikiToText(entry.getText()));
		DateAndTime date = entry.getDateAndTime();
		context.put("date", Tm.FORMAT_LONGMONTH_DAY_YEAR.format(date));
		context.put("dateDe", dateDe(date));
		context.put("rssDate", Tm.FORMAT_RFC822.format(date));
		fillComments(context, entry);
	}

	private String dateDe(DateAndTime dateAndTime) {
		return new SimpleDateFormat("dd. MMMM yyyy", Locale.GERMANY).format(dateAndTime.toJavaDate());
	}

	private String dateDe(Date date) {
		return new SimpleDateFormat("dd. MMMM yyyy", Locale.GERMANY).format(date.toJavaDate());
	}

	private void fillProductBacklog(ContextBuilder context) {
		List<Requirement> requirements = new ArrayList<Requirement>(project.getProductBacklogRequirements());
		Collections.sort(requirements, project.getRequirementsOrderComparator());
		for (Requirement requirement : requirements) {
			fillStory(context.addSubContext("stories"), requirement);
		}
	}

	private void fillStories(ContextBuilder context) {
		for (Requirement requirement : project.getRequirements()) {
			// if (requirement.isClosed()) continue;
			fillStory(context.addSubContext("stories"), requirement);
		}
	}

	private void fillStory(ContextBuilder context, Requirement requirement) {
		context.put("id", requirement.getId());
		context.put("reference", requirement.getReference());
		context.put("label", toHtml(requirement.getLabel()));
		context.put("description", wikiToHtml(requirement.getDescription()));
		context.put("testDescription", wikiToHtml(requirement.getTestDescription()));
		if (requirement.isEstimatedWorkSet() && !requirement.isDirty())
			context.put("estimatedWork", requirement.getEstimatedWorkAsString());
		context.put("themes", toHtml(requirement.getThemes()));
		context.put("tasksClosed", requirement.isTasksClosed());
		context.put("closed", requirement.isClosed());
		context.put("burnedWork", requirement.getBurnedWork());
		context.put("remainingWork", requirement.getRemainingWork());
		context.put("externalTrackerId", requirement.getExternalTrackerId());
		fillComments(context, requirement);
	}

	private void fillWiki(ContextBuilder context) {
		for (Wikipage page : project.getWikipages()) {
			context.put(page.getName(), wikiToHtml(page.getText()));
		}
	}

	private void fillProject(ContextBuilder context) {
		context.put("id", project.getId());
		context.put("label", toHtml(project.getLabel()));
		context.put("vision", project.getVision());
		context.put("shortDescription", toHtml(project.getShortDescription()));
		context.put("description", wikiToHtml(project.getDescription()));
		context.put("longDescription", wikiToHtml(project.getLongDescription()));
		context.put("homepageUrl", project.getHomepageUrl());
		for (Sprint sprint : project.getCompletedSprintsInReverseOrder()) {
			fillSprint(context.addSubContext("completedSprints"), sprint);
		}
		for (User user : project.getProductOwners()) {
			fillProjectParticipant(context.addSubContext("productOwners"), user);
		}
		for (User user : project.getScrumMasters()) {
			fillProjectParticipant(context.addSubContext("scrumMasters"), user);
		}
		for (User user : project.getTeamMembers()) {
			fillProjectParticipant(context.addSubContext("teamMembers"), user);
		}
		Release currentRelease = project.getCurrentRelease();
		context.put("currentRelease", currentRelease == null ? "?" : toHtml(currentRelease.getLabel()));
	}

	private void fillProjectParticipant(ContextBuilder context, User user) {
		context.put("name", toHtml(user.getName()));
		context.put("fullName", toHtml(user.getFullName()));
		context.put("publicName", toHtml(user.getPublicName()));
	}

	public String wikiToHtml(String wikitext) {
		if (Str.isBlank(wikitext)) return null;
		WikiParser wikiParser = new WikiParser(wikitext);
		WikiModel model = wikiParser.parse(false);
		return model.toHtml(htmlContext);
	}

	public static String wikiToText(String wikitext) {
		if (Str.isBlank(wikitext)) return null;
		return wikitext;
	}

	public static List<String> toHtml(Collection<String> strings) {
		List<String> ret = new ArrayList<String>(strings.size());
		for (String string : strings) {
			ret.add(toHtml(string));
		}
		return ret;
	}

	public static String toHtml(String text) {
		if (text == null) return null;
		text = Str.toHtml(text);
		return text;
	}

	private void loadProperties() {
		File file = new File(outputDir.getPath() + "/kunagi.properties");
		if (!file.exists()) file = new File(templateDir.getPath() + "/kunagi.properties");
		if (!file.exists()) {
			properties = new Properties();
			return;
		}
		properties = IO.loadProperties(file, IO.UTF_8);
	}

	private static class MyHtmlContext implements HtmlContext {

		private Project project;

		public MyHtmlContext(Project project) {
			super();
			this.project = project;
		}

		@Override
		public boolean isEntityReferenceAvailable(String reference) {
			return true;
		}

		@Override
		public String getEntityReferenceHrefOrOnclickAParameter(String reference) {
			return "href=\"" + reference + ".html\"";
		}

		@Override
		public String getTocHrefOrOnclickAParameter(Header h) {
			return "href=\"#" + h.getAnchor() + "\"";
		}

		@Override
		public String getDownloadUrlByReference(String reference) {
			return reference;
		}

		@Override
		public String getEntityLabelByReference(String reference) {
			AEntity entity = project.getEntityByReference(reference);
			return entity == null ? null : entity.toString();
		}

	}

}
