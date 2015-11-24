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

import ilarkesto.base.Str;
import ilarkesto.base.Utl;
import ilarkesto.core.money.Money;
import ilarkesto.core.search.SearchText;
import ilarkesto.core.search.Searchable;
import ilarkesto.core.time.Date;
import ilarkesto.core.time.DateAndTime;
import ilarkesto.core.time.Time;
import ilarkesto.feeds.Feed;
import ilarkesto.feeds.FeedItem;
import ilarkesto.persistence.AEntity;
import ilarkesto.persistence.Persist;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import scrum.client.common.WeekdaySelector;
import scrum.client.workspace.history.HistoryToken;
import scrum.server.KunagiRootConfig;
import scrum.server.ScrumWebApplication;
import scrum.server.admin.ProjectUserConfig;
import scrum.server.admin.User;
import scrum.server.calendar.SimpleEvent;
import scrum.server.collaboration.Comment;
import scrum.server.collaboration.CommentDao;
import scrum.server.collaboration.Subject;
import scrum.server.collaboration.Wikipage;
import scrum.server.estimation.RequirementEstimationVote;
import scrum.server.files.File;
import scrum.server.impediments.Impediment;
import scrum.server.issues.Issue;
import scrum.server.journal.ProjectEvent;
import scrum.server.pr.BlogEntry;
import scrum.server.release.Release;
import scrum.server.risks.Risk;
import scrum.server.sprint.Sprint;
import scrum.server.sprint.SprintDaySnapshot;
import scrum.server.sprint.SprintReport;
import scrum.server.sprint.SprintReportDao;
import scrum.server.sprint.Task;
import scrum.server.sprint.TaskDao;

public class Project extends GProject {

	private transient Comparator<Requirement> requirementsOrderComparator;

	private static final String NEXT_SPRINT_LABEL = "Next Sprint";
	private static final String CURRENT_SPRINT_LABEL = "Current Sprint";

	// --- dependencies ---

	private static transient ProjectSprintSnapshotDao projectSprintSnapshotDao;
	private static transient TaskDao taskDao;
	private static transient KunagiRootConfig config;
	private static transient CommentDao commentDao;
	private static transient SprintReportDao sprintReportDao;
	private static transient ScrumWebApplication webApplication;

	public static void setWebApplication(ScrumWebApplication webApplication) {
		Project.webApplication = webApplication;
	}

	public static void setSprintReportDao(SprintReportDao sprintReportDao) {
		Project.sprintReportDao = sprintReportDao;
	}

	public static void setCommentDao(CommentDao commentDao) {
		Project.commentDao = commentDao;
	}

	public static void setConfig(KunagiRootConfig config) {
		Project.config = config;
	}

	public static void setTaskDao(TaskDao taskDao) {
		Project.taskDao = taskDao;
	}

	public static void setProjectSprintSnapshotDao(ProjectSprintSnapshotDao projectSprintSnapshotDao) {
		Project.projectSprintSnapshotDao = projectSprintSnapshotDao;
	}

	// --- ---

	public boolean isInHistory(Requirement requirement) {
		for (SprintReport report : getSprintReports()) {
			if (report.containsCompletedRequirement(requirement)) return true;
			if (report.containsRejectedRequirement(requirement)) return true;
		}
		return false;
	}

	public Set<Sprint> getRelevantSprints() {
		Set<Sprint> ret = new HashSet<Sprint>();
		ret.add(getCurrentSprint());
		ret.add(getNextSprint());
		return ret;
	}

	public Set<Requirement> getProductBacklogRequirements() {
		Set<Requirement> requirements = getRequirements();
		Iterator<Requirement> iterator = requirements.iterator();
		while (iterator.hasNext()) {
			Requirement requirement = iterator.next();
			if (requirement.isDeleted() || requirement.isClosed() || requirement.isInCurrentSprint())
				iterator.remove();
		}
		return requirements;
	}

	public Set<SprintReport> getSprintReports() {
		return sprintReportDao.getSprintReportsByProject(this);
	}

	public void moveRequirementToTop(Requirement requirement) {
		List<String> orderIds = getRequirementsOrderIds();
		String id = requirement.getId();
		orderIds.remove(id);
		orderIds.add(0, id);
		setRequirementsOrderIds(orderIds);
	}

	public void addRequirementsOrderId(int index, String id) {
		List<String> ids = getRequirementsOrderIds();
		ids.add(index, id);
		setRequirementsOrderIds(ids);
	}

	public WeekdaySelector getFreeDaysAsWeekdaySelector() {
		return new WeekdaySelector(getFreeDays());
	}

	public String getUsersRolesAsString(User user, String prefix, String suffix) {
		StringBuilder sb = new StringBuilder();
		List<String> roles = new ArrayList<String>();
		if (containsProductOwner(user)) roles.add("PO");
		if (containsScrumMaster(user)) roles.add("SM");
		if (containsTeamMember(user)) roles.add("T");
		boolean first = true;
		if (!roles.isEmpty()) {
			for (String role : roles) {
				if (first) {
					first = false;
					if (prefix != null) sb.append(prefix);
				} else {
					sb.append(",");
				}
				sb.append(role);
			}
			if (suffix != null) sb.append(suffix);
		}
		return sb.toString();
	}

	public boolean containsParticipantWithVerifiedEmail() {
		for (User user : getParticipants()) {
			if (user.isEmailVerified()) return true;
		}
		return false;
	}

	public void updateRequirementsOrder(List<Requirement> requirements) {
		setRequirementsOrderIds(Persist.getIdsAsList(requirements));
	}

	public synchronized void updateHomepage() {
		if (!isHomepageDirSet()) return;
		getHomepageUpdater().processAll();
	}

	public synchronized void updateHomepage(AEntity entity) {
		if (!isHomepageDirSet()) return;
		getHomepageUpdater().processEntityTemplate(entity);
	}

	public java.io.File getHomepageDirFile() {
		if (!isHomepageDirSet()) return null;
		return new java.io.File(getHomepageDir());
	}

	public String getHomepageVelocityDir() {
		if (!isHomepageDirSet()) return null;
		return getHomepageDir() + "/velocity";
	}

	public String getHomepageScriptsDir() {
		if (!isHomepageDirSet()) return null;
		return getHomepageDir() + "/scripts";
	}

	public HomepageUpdater getHomepageUpdater() {
		return new HomepageUpdater(this);
	}

	public void scanFiles() {
		java.io.File dir = new java.io.File(getFileRepositoryPath());
		java.io.File[] files = dir.listFiles();
		if (files != null) {

			for (java.io.File f : files) {
				File file = fileDao.getFilesByName(f.getName(), this);
				if (file == null) {
					file = fileDao.postFile(f, this);
				}
			}
		}
	}

	public ArrayList<AEntity> search(String text) {
		SearchText search = new SearchText(text);
		ArrayList<AEntity> ret = new ArrayList<AEntity>();
		addMatching(getRequirements(), search, ret);
		addMatching(getQualitys(), search, ret);
		addMatching(getTasks(), search, ret);
		addMatching(getWikipages(), search, ret);
		addMatching(getIssues(), search, ret);
		addMatching(getImpediments(), search, ret);
		addMatching(getRisks(), search, ret);
		addMatching(getFiles(), search, ret);
		addMatching(getReleases(), search, ret);
		addMatching(getBlogEntrys(), search, ret);
		return ret;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private <T extends Searchable> void addMatching(Collection<T> entities, SearchText search, Collection ret) {
		for (T entity : entities) {
			if (entity.matches(search)) ret.add(entity);
		}
	}

	public void writeJournalAsRss(OutputStream out, String encoding) {
		Feed feed = new Feed(getLabel() + " Event Journal", webApplication.createUrl(this, null), null);
		feed.setLanguage("en");
		// Rss20Builder rss = new Rss20Builder();
		// rss.setTitle(getLabel() + " Event Journal");
		// rss.setLanguage("en");
		// rss.setLink(webApplication.createUrl(this, null));
		for (ProjectEvent event : getLatestProjectEvents(30)) {
			FeedItem item = new FeedItem(event.getLabel(), event.getLabel());
			feed.addItem(item);
			// Rss20Builder.Item item = rss.addItem();
			// item.setTitle(event.getLabel());
			// item.setDescription(event.getLabel());
			String link = webApplication.createUrl(this, event.getSubject()) + HistoryToken.SEPARATOR + "fromEvent="
					+ event.getId();
			item.setLink(link);
			item.setGuid(link);
			item.setPubDate(event.getDateAndTime());
		}
		feed.sortItems();
		feed.writeRss(out, encoding);
	}

	public String getFileRepositoryPath() {
		return config.getFileRepositoryPath() + "/" + getId();
	}

	public Set<SimpleEvent> getCalendarEvents() {
		return simpleEventDao.getSimpleEventsByProject(this);
	}

	public List<ProjectEvent> getLatestProjectEvents(int min) {
		List<ProjectEvent> events = Utl.sort(projectEventDao.getProjectEventsByProject(this));

		DateAndTime deadline = new DateAndTime(Date.today().prevDay(), Time.now());
		List<ProjectEvent> ret = new ArrayList<ProjectEvent>();
		int count = 0;
		for (ProjectEvent event : events) {
			ret.add(event);
			count++;
			DateAndTime dateAndTime = event.getDateAndTime();
			if (count > min && dateAndTime.isBefore(deadline)) break;
		}
		return ret;
	}

	public Set<ProjectUserConfig> getUserConfigs() {
		Set<ProjectUserConfig> configs = new HashSet<ProjectUserConfig>();
		for (User user : getParticipants()) {
			configs.add(getUserConfig(user));
		}
		return configs;
	}

	public ProjectUserConfig getUserConfig(User user) {
		return projectUserConfigDao.getProjectUserConfig(this, user);
	}

	public Set<Task> getTasks() {
		return taskDao.getTasksByProject(this);
	}

	public AEntity getEntityByReference(String reference) {
		if (reference.length() > 4 && reference.startsWith("[[")) {
			String pageName = reference.substring(2, reference.length() - 2);
			return getWikipageByName(pageName);
		}

		int number = Integer.parseInt(reference.substring(scrum.client.project.Requirement.REFERENCE_PREFIX.length()));

		if (reference.startsWith(scrum.client.project.Requirement.REFERENCE_PREFIX)) {
			return getRequirementByNumber(number);
		} else if (reference.startsWith(scrum.client.project.Quality.REFERENCE_PREFIX)) {
			return getQualityByNumber(number);
		} else if (reference.startsWith(scrum.client.sprint.Task.REFERENCE_PREFIX)) {
			return getTaskByNumber(number);
		} else if (reference.startsWith(scrum.client.impediments.Impediment.REFERENCE_PREFIX)) {
			return getImpedimentByNumber(number);
		} else if (reference.startsWith(scrum.client.issues.Issue.REFERENCE_PREFIX)) {
			return getIssueByNumber(number);
		} else if (reference.startsWith(scrum.client.sprint.Sprint.REFERENCE_PREFIX)) {
			return getSprintByNumber(number);
		} else if (reference.startsWith(scrum.client.collaboration.Subject.REFERENCE_PREFIX)) {
			return getSubjectByNumber(number);
		} else if (reference.startsWith(scrum.client.files.File.REFERENCE_PREFIX)) {
			return getFileByNumber(number);
		} else if (reference.startsWith(scrum.client.calendar.SimpleEvent.REFERENCE_PREFIX)) {
			return getSimpleEventByNumber(number);
		} else if (reference.startsWith(scrum.client.release.Release.REFERENCE_PREFIX)) {
			return getReleaseByNumber(number);
		} else if (reference.startsWith(scrum.client.pr.BlogEntry.REFERENCE_PREFIX)) { return getBlogEntryByNumber(number); }

		return null;
	}

	public Requirement getRequirementByNumber(int number) {
		return requirementDao.getRequirementByNumber(number, this);
	}

	public Task getTaskByNumber(int number) {
		return taskDao.getTaskByNumber(number, this);
	}

	public Quality getQualityByNumber(int number) {
		return qualityDao.getQualityByNumber(number, this);
	}

	public Issue getIssueByNumber(int number) {
		return issueDao.getIssueByNumber(number, this);
	}

	public Sprint getSprintByNumber(int number) {
		return sprintDao.getSprintByNumber(number, this);
	}

	public Impediment getImpedimentByNumber(int number) {
		return impedimentDao.getImpedimentByNumber(number, this);
	}

	public Subject getSubjectByNumber(int number) {
		return subjectDao.getSubjectsByNumber(number, this);
	}

	public File getFileByNumber(int number) {
		return fileDao.getFileByNumber(number, this);
	}

	public File getFileByReference(String reference) {
		return getFileByNumber(Integer.parseInt(reference.substring(3)));
	}

	public SimpleEvent getSimpleEventByNumber(int number) {
		return simpleEventDao.getSimpleEventByNumber(number, this);
	}

	public Release getReleaseByNumber(int number) {
		return releaseDao.getReleaseByNumber(number, this);
	}

	public BlogEntry getBlogEntryByNumber(int number) {
		return blogEntryDao.getBlogEntryByNumber(number, this);
	}

	public Wikipage getWikipageByName(String name) {
		return wikipageDao.getWikipageByName(name, this);
	}

	public synchronized int generateTaskNumber() {
		int number = getLastTaskNumber() + 1;
		setLastTaskNumber(number);
		return number;
	}

	public synchronized int generateEventNumber() {
		int number = getLastEventNumber() + 1;
		setLastEventNumber(number);
		return number;
	}

	public synchronized int generateFileNumber() {
		int number = getLastFileNumber() + 1;
		setLastFileNumber(number);
		return number;
	}

	public synchronized int generateRequirementNumber() {
		int number = getLastRequirementNumber() + 1;
		setLastRequirementNumber(number);
		return number;
	}

	public synchronized int generateImpedimentNumber() {
		int number = getLastImpedimentNumber() + 1;
		setLastImpedimentNumber(number);
		return number;
	}

	public synchronized int generateSubjectNumber() {
		int number = getLastSubjectNumber() + 1;
		setLastSubjectNumber(number);
		return number;
	}

	public synchronized int generateRiskNumber() {
		int number = getLastRiskNumber() + 1;
		setLastRiskNumber(number);
		return number;
	}

	public synchronized int generateIssueNumber() {
		int number = getLastIssueNumber() + 1;
		setLastIssueNumber(number);
		return number;
	}

	public synchronized int generateSprintNumber() {
		int number = getLastSprintNumber() + 1;
		setLastSprintNumber(number);
		return number;
	}

	public synchronized int generateReleaseNumber() {
		int number = getLastReleaseNumber() + 1;
		setLastReleaseNumber(number);
		return number;
	}

	public synchronized int generateQualityNumber() {
		int number = getLastQualityNumber() + 1;
		setLastQualityNumber(number);
		return number;
	}

	public synchronized int generateBlogEntryNumber() {
		int number = getLastBlogEntryNumber() + 1;
		setLastBlogEntryNumber(number);
		return number;
	}

	public Release getCurrentRelease() {
		return releaseDao.getCurrentRelease(this);
	}

	public Release getNextRelease() {
		return releaseDao.getNextRelease(this);
	}

	public ProjectSprintSnapshot getCurrentSprintSnapshot() {
		ProjectSprintSnapshot snapshot = projectSprintSnapshotDao.getProjectSprintSnapshotBySprint(getCurrentSprint());
		if (snapshot == null) snapshot = createSprintSnapshot();
		return snapshot;
	}

	// public int getRemainingWork() {
	// int sum = 0;
	// for (Requirement requirement : getRequirements()) {
	// if (requirement.isClosed()) continue;
	// Integer work = requirement.getEstimatedWork();
	// if (work != null) sum += work;
	// }
	// return sum;
	// }
	//
	// public int getBurnedWork() {
	// int sum = 0;
	// for (Requirement requirement : getRequirements()) {
	// if (!requirement.isClosed()) continue;
	// Integer work = requirement.getEstimatedWork();
	// if (work != null) sum += work;
	// }
	// return sum;
	// }

	public List<ProjectSprintSnapshot> getSprintSnapshots() {
		return projectSprintSnapshotDao.getProjectSprintSnapshotsByProject(this);
	}

	public Sprint switchToNextSprint() {
		Sprint oldSprint = getCurrentSprint();
		oldSprint.close();
		oldSprint.setEnd(Date.today());

		getCurrentSprintSnapshot().update();

		Sprint newSprint = getNextSprint();
		if (newSprint == null) newSprint = createNextSprint();
		if (!newSprint.isBeginSet() || newSprint.getBegin().isPast()) newSprint.setBegin(Date.today());
		if (!newSprint.isEndSet() || newSprint.getEnd().isBeforeOrSame(newSprint.getBegin()))
			newSprint.setEnd(newSprint.getBegin().addDays(oldSprint.getLengthInDays()));
		newSprint.setOriginallyEnd(newSprint.getEnd());

		if (newSprint.isLabel(NEXT_SPRINT_LABEL)) newSprint.setLabel(CURRENT_SPRINT_LABEL);
		setCurrentSprint(newSprint);
		createNextSprint();

		createSprintSnapshot();

		for (Task task : oldSprint.getTasks()) {
			if (task.isClosed()) {
				task.delete();
			}
		}

		return newSprint;
	}

	private ProjectSprintSnapshot createSprintSnapshot() {
		ProjectSprintSnapshot snapshot = projectSprintSnapshotDao.newEntityInstance();
		snapshot.setSprint(getCurrentSprint());
		snapshot.update();
		projectSprintSnapshotDao.persist(snapshot);
		return snapshot;
	}

	public Sprint createNextSprint() {
		Sprint sprint = sprintDao.newEntityInstance();
		sprint.setProject(this);
		sprint.setLabel(NEXT_SPRINT_LABEL);
		if (isCurrentSprintSet()) {
			sprint.setBegin(getCurrentSprint().getEnd());
			Integer length = getCurrentSprint().getLengthInDays();
			if (length != null) sprint.setEnd(sprint.getBegin().addDays(length));
		}
		sprintDao.persist(sprint);
		setNextSprint(sprint);
		return sprint;
	}

	public Set<Issue> getAcceptedIssues() {
		return issueDao.getAcceptedIssues(this);
	}

	public Set<Issue> getClosedIssues() {
		return issueDao.getClosedIssues(this);
	}

	public Set<Issue> getOpenIssues() {
		return issueDao.getOpenIssues(this);
	}

	public Set<Issue> getPublishedIssues() {
		return issueDao.getPublishedIssues(this);
	}

	public Set<Issue> getBugsInCurrentRelease() {
		Release release = getCurrentRelease();
		Release nextRelease = getNextRelease();
		if (release == null) return getOpenBugs();
		Set<Issue> ret = new HashSet<Issue>();
		ret.addAll(getOpenBugs());
		for (Issue issue : getClosedIssues()) {
			if (issue.containsFixRelease(nextRelease) && !issue.containsFixRelease(release)) ret.add(issue);
		}
		return ret;
	}

	public Set<Issue> getOpenBugs() {
		return issueDao.getOpenBugs(this);
	}

	public Set<Issue> getOpenIdeas() {
		return issueDao.getOpenIdeas(this);
	}

	public Set<RequirementEstimationVote> getRequirementEstimationVotes() {
		Set<RequirementEstimationVote> ret = new HashSet<RequirementEstimationVote>();
		for (Requirement requirement : getRequirements()) {
			ret.addAll(requirement.getEstimationVotes());
		}
		return ret;
	}

	public Set<SprintDaySnapshot> getSprintDaySnapshots() {
		Set<SprintDaySnapshot> ret = new HashSet<SprintDaySnapshot>();
		for (Sprint sprint : getSprints()) {
			ret.addAll(sprint.getDaySnapshots());
		}
		return ret;
	}

	public Set<SprintDaySnapshot> getExistingSprintDaySnapshots() {
		Set<SprintDaySnapshot> ret = new HashSet<SprintDaySnapshot>();
		for (Sprint sprint : getSprints()) {
			ret.addAll(sprint.getExistingDaySnapshots());
		}
		return ret;
	}

	public Set<Comment> getLatestComments() {
		return getComments(true);
	}

	private Set<Comment> getComments(boolean latestOnly) {
		Set<Comment> ret = new HashSet<Comment>();
		ret.addAll(getComments(Arrays.asList(this), latestOnly));
		ret.addAll(getComments(getSprints(), latestOnly));
		ret.addAll(getComments(getParticipants(), latestOnly));
		ret.addAll(getComments(getRequirements(), latestOnly));
		ret.addAll(getComments(getQualitys(), latestOnly));
		ret.addAll(getComments(getTasks(), latestOnly));
		ret.addAll(getComments(getImpediments(), latestOnly));
		ret.addAll(getComments(getIssues(), latestOnly));
		ret.addAll(getComments(getRisks(), latestOnly));
		ret.addAll(getComments(getWikipages(), latestOnly));
		ret.addAll(getComments(getSimpleEvents(), latestOnly));
		ret.addAll(getComments(getFiles(), latestOnly));
		ret.addAll(getComments(getReleases(), latestOnly));
		ret.addAll(getComments(getSprintSnapshots(), latestOnly));
		ret.addAll(getComments(getRequirementEstimationVotes(), latestOnly));
		ret.addAll(getComments(getUserConfigs(), latestOnly));
		ret.addAll(getComments(getProjectEvents(), latestOnly));
		ret.addAll(getComments(getSubjects(), latestOnly));
		ret.addAll(getComments(getReleases(), latestOnly));
		ret.addAll(getComments(getBlogEntrys(), latestOnly));
		return ret;
	}

	private Set<Comment> getComments(Collection<? extends AEntity> entities, boolean latestOnly) {
		Set<Comment> ret = new HashSet<Comment>();
		for (AEntity entity : entities) {
			Set<Comment> comments = commentDao.getCommentsByParent(entity);
			ret.addAll(latestOnly ? getLatest(comments) : comments);
		}
		return ret;
	}

	private Set<Comment> getLatest(Set<Comment> comments) {
		if (comments.size() < 2) return comments;
		Comment latest = null;
		for (Comment comment : comments) {
			DateAndTime dateAndTime = comment.getDateAndTime();
			if (latest == null || dateAndTime.isAfter(latest.getDateAndTime())) latest = comment;
		}
		assert latest != null;
		return Utl.toSet(latest);
	}

	@Override
	public String asString() {
		return getLabel();
	}

	@Override
	public void onEnsureIntegrity() {
		super.onEnsureIntegrity();
		addParticipants(getAdmins());
		addParticipants(getProductOwners());
		addParticipants(getScrumMasters());
		addParticipants(getTeamMembers());
		if (!isCurrentSprintSet()) {
			Sprint sprint = sprintDao.newEntityInstance();
			sprint.setProject(this);
			sprintDao.persist(sprint);
			setCurrentSprint(sprint);
		}
		if (!isNextSprintSet()) {
			createNextSprint();
		}
		updateRequirementsOrder();
		if (!isPunishmentUnitSet()) {
			setPunishmentUnit(Money.EUR);
		}
		if (getPunishmentFactor() == 0) {
			setPunishmentFactor(1);
		}
		if (!isHomepageDirSet()) setAutoUpdateHomepage(false);
		if (!isIssueReplyTemplateSet()) setIssueReplyTemplate(createDefaultIssueReplyTemplate());
		if (!isSubscriberNotificationTemplateSet())
			setSubscriberNotificationTemplate(createDefaultSubscriberNotificationTemplate());
	}

	private void updateRequirementsOrder() {
		List<Requirement> requirements = new ArrayList<Requirement>(getProductBacklogRequirements());
		Collections.sort(requirements, getRequirementsOrderComparator());
		setRequirementsOrderIds(AEntity.getIdsAsList(requirements));
	}

	private String createDefaultIssueReplyTemplate() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ${issuer.name},\n");
		sb.append("\n");
		sb.append("thank you very much for your feedback.\n");
		sb.append("\n");
		sb.append("Your issue is now known as ${issue.reference}. You can view it on our homepage: ${homepage.url}/${issue.reference}.html\n");
		return sb.toString();
	}

	private String createDefaultSubscriberNotificationTemplate() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello,\n");
		sb.append("\n");
		sb.append("there is news on an entity you are subscribed to:\n");
		sb.append("\n");
		sb.append("    ${entity.reference} ${entity.label}\n");
		sb.append("    ${homepage.url}/${entity.reference}.html\n");
		sb.append("\n");
		sb.append("    ${change.message}\n");
		sb.append("\n");
		sb.append("---\n");
		sb.append("Unsubscribe from ${entity.reference}: ${unsubscribe.url}\n");
		sb.append("\n");
		sb.append("Unsubscribe from all entities: ${unsubscribeall.url}\n");
		return sb.toString();
	}

	@Override
	public boolean isVisibleFor(User user) {
		return (user != null && user.isAdmin()) || containsParticipant(user) || containsAdmin(user);
	}

	public boolean isEditableBy(User user) {
		return isVisibleFor(user);
	}

	@Override
	public boolean isDeletableBy(User user) {
		if (user != null && user.isAdmin()) return true;
		return containsAdmin(user);
	}

	// --- test data ---

	public void addTestImpediments() {
		Impediment imp = null;

		// no documentation
		imp = impedimentDao.postImpediment(this, randomPast(5), "There is no documentation. Seriously.", false);
		imp.setDescription("Someone promised that, I remember. Where is it?");

		// no daily scrums
		imp = impedimentDao.postImpediment(this, randomPast(5), "Daily Scrums are not daily", true);
		imp.setDescription("\"Daily Scrums\" are supposed to be daily. That's why they are called DAILY Scrums.");
		imp.setSolution("Fixed time and place to 09.00 p. m. at Starbucks every morning (except weekdays, weekends and holydays).");

		// no coffee
		imp = impedimentDao.postImpediment(this, randomPast(5), "There is no coffee machine", false);
	}

	private static Date randomPast(int beforeMaxDays) {
		return Date.beforeDays(Utl.randomInt(0, beforeMaxDays));
	}

	public void addTestRisks() {
		Risk rsk = null;

		// god
		rsk = riskDao.postRisk(this, "God comes to judge the living and the dead", 0, 100);
		rsk.setImpactMitigation("Nothing we can do here.");

		// duke
		rsk = riskDao.postRisk(this, "Duke Nukem Forever is released", 20, 100);
		rsk.setProbabilityMitigation("Nothing to mitigate here. The probability is close to nothing.");
		rsk.setImpactMitigation("Nothing to mitigate here. Everyone will be playing. Everything will be lost.");

		// sudden death
		rsk = riskDao.postRisk(this, "Sudden Death", 50, 40);
		rsk.setImpactMitigation("Go to the roof if it's by rising sea level.");
	}

	public void addTestSimpleEvents() {
		// let people generate their own events
	}

	public void addTestEvents() {
		// no test events
	}

	public void addTestIssues() {
		Issue iss = null;

		// noobs
		iss = issueDao.postIssue(this, "thiz cr4p don't work, n00bz!!1");
		iss.setDescription("go home, u noobz ..#");

		// eclipse integration
		iss = issueDao.postIssue(this, "I want eclipse integration");
		iss.setDescription("I would be really nice if eclipse commits would be represented in Kunagi! Thank you!");

		// link bug
		iss = issueDao.postIssue(this, "Bug: Links don't work");
		iss.setDescription("When I try to post links to other pages, I get links to the Wiki. WTF?");

		// date crash
		iss = issueDao.postIssue(this, "Crash when using Dates after 2012");
		iss.setDescription("The program crashes whenever I enter dates after 2012. Can't figure out what the problem is though.");
		iss.setAcceptDate(Date.beforeDays(2));
		iss.setUrgent(true);
		iss.setSeverity(scrum.client.issues.Issue.SEVERE);

		// gui bug
		iss = issueDao.postIssue(this, "GUI inconsistency between PB and SB");
		iss.setDescription("The order of Qualities and Tests is different between widgets in the PB and SB. It should be the same.");
		iss.setAcceptDate(Date.beforeDays(35));
		iss.setUrgent(true);
		iss.setSeverity(scrum.client.issues.Issue.MINOR);

		// navi display bug
		iss = issueDao.postIssue(this, "navigation displays wrong current view");
		iss.setDescription("When I open the Whiteboard, \"Sprint Backlog\" is selected in the navigation. Same for other jumps.");
		iss.setAcceptDate(Date.today());
		iss.setUrgent(true);
		iss.setSeverity(scrum.client.issues.Issue.MINOR);
		iss.setIssuerName("Witek");
		iss.setIssuerEmail("wi@koczewski.de");

		// terrific pb suggestion
		iss = issueDao.postIssue(this, "Product Backlog should be terrific, not amazing");
		iss.setDescription("56% of users want a terrific PB, not an amazing one. We should change that in one of the upcoming releases.");
		iss.setAcceptDate(Date.today());

		// flattr
		iss = issueDao.postIssue(this, "Add a flattr-button");
		iss.setDescription("See [http://flattr.com].");
		iss.setCloseDate(Date.beforeDays(1));

		// thank you
		iss = issueDao.postIssue(this, "I like this software, thank you!");
		iss.setDescription("I'm using Kunagi for my own project now. Thanks for the great work.");
		iss.setCloseDate(Date.today());
	}

	public void addTestReleases() {
		Release r1 = releaseDao.postRelease(this, Date.beforeDays(30), "1.0");
		r1.setReleased(true);

		Release r2 = releaseDao.postRelease(this, Date.inDays(5), "1.1");
		r2.addSprint(getCurrentSprint());
	}

	public void addTestRequirements() {
		Requirement req = null;
		List<Requirement> reqOrder = new LinkedList<Requirement>();

		// Unsurpassed Concept
		req = requirementDao.postRequirement(this, "Unsurpassed Concept", 3f);
		req.addTheme("Vision");
		req.setDescription("As a Product Owner I want the concept to be unsurpassable so I don't have to worry about ROI anymore.");
		reqOrder.add(req);
		req.setSprint(getCurrentSprint());
		taskDao.postTask(req, "Create Concept", 20);
		taskDao.postTask(req, "Make Sure All Others Are Inferior", 50);

		// Amazing Product Backlog
		req = requirementDao.postRequirement(this, "Amazing Product Backlog", 2f);
		req.addTheme("Vision");
		req.setDescription("As a Product Owner I want my Backlog to be amazing so that people stand in awe.");
		reqOrder.add(req);
		req.setSprint(getCurrentSprint());
		taskDao.postTask(req, "Creation of Storys", 10);
		taskDao.postTask(req, "Intelligent Design of Storys", 10);
		taskDao.postTask(req, "Deletion of Storys", 10);

		// Functional Quality Backlog
		req = requirementDao.postRequirement(this, "Functional Quality Backlog", 1f);
		req.setDescription("As a Product Owner I want my non-functional Requirements to be functional, so I can use them.");
		reqOrder.add(req);
		req.setSprint(getCurrentSprint());
		taskDao.postTask(req, "Copy And Paste Product Backlog", 10);
		taskDao.postTask(req, "Marry Storys and Qualitys", 10);

		// Groundbraking Scrum Backlog
		req = requirementDao.postRequirement(this, "Groundbraking Scrum Backlog", 1f);
		req.addTheme("Vision");
		req.setDescription("As a Team member I want the Scrum Backlog to be groundbreaking, so that everybody can see that I am the most important here.");
		reqOrder.add(req);
		req.setSprint(getCurrentSprint());
		taskDao.postTask(req, "Create Tasks", 10);
		taskDao.postTask(req, "Create More Tasks", 10);

		// Breathtaking Whiteboard
		req = requirementDao.postRequirement(this, "Breathtaking Whiteboard", 8f);
		req.addTheme("Vision");
		req.addTheme("Whiteboard");
		req.setDescription("As a Team member I want the current state of things to be displayed on a Whiteboard, so I can play around when I am bored.");
		reqOrder.add(req);

		// Empowering Impediment List
		req = requirementDao.postRequirement(this, "Empowering Impediment List", 2f);
		req.setDescription("As a Scrum Master I want the Impedimen List to be empowering. Best thing would be self-resolving Impediments.");
		reqOrder.add(req);

		// Divine Risk Management
		req = requirementDao.postRequirement(this, "Divine Risk Management", 5f);
		req.setDescription("As a Team member, I want Risk Management to be devine. Wait, that makes Risk Management superfluous, I guess.");
		reqOrder.add(req);

		// Miraculous Issue Management
		req = requirementDao.postRequirement(this, "Miraculous Issue Management", 3f);
		req.setDescription("As a Product Owner I want my Issue Management to be miraculous, so that Issues close themselves AND sometimes even each other.");
		reqOrder.add(req);

		// Immaculate Bug Tracking
		req = requirementDao.postRequirement(this, "Immaculate Bug Tracking", 2f);
		req.setDescription("As a Team member I want immaculate Bug Tracking. A Bug Tracking containing no bugs would be suitable.");
		reqOrder.add(req);

		// Unbeatable Planning Poker
		req = requirementDao.postRequirement(this, "Unbeatable Planning Poker", null);
		req.setDescription("As I User I want Planning Poker to be so good that nobody can beat it.");
		reqOrder.add(req);

		// Enlightening Wiki
		req = requirementDao.postRequirement(this, "Enlightening Wiki", 5f);
		req.setDescription("As a User I want the Wiki to enlighten me so that I am enlightened after reading (makes sense, doesn't it?).");
		reqOrder.add(req);

		// Absorbing Discussion Board
		req = requirementDao.postRequirement(this, "Absorbing Discussion Board", 5f);
		req.setDescription("As a User I want the Discussion Board to be absorbing, so that I never have time to do my work.");
		reqOrder.add(req);

		// Irresistable User Interface
		req = requirementDao.postRequirement(this, "Irresistable User Interface", 20f);
		req.setDescription("As a User I want the User Interface to be irresistable so that I can experience Orgasmic Joy-of-Use.");
		reqOrder.add(req);

		// Succulent Documentation
		req = requirementDao.postRequirement(this, "Succulent Documentation", null);
		req.setDescription("As a Noob I want Succulent Documentation. Yammy!");
		reqOrder.add(req);

		// Outlasting Collaboration
		req = requirementDao.postRequirement(this, "Outlasting Collaboration", null);
		req.setDescription("This is still an epic. Nothing to see, really.");
		reqOrder.add(req);

		updateRequirementsOrder(reqOrder);
	}

	public void addTestQualitys() {
		Quality qly = null;

		qly = qualityDao.postQuality(this, "Undeniable Success");
		qly = qualityDao.postQuality(this, "Orgasmic Joy-of-Use");
		qly = qualityDao.postQuality(this, "Effervescent Happiness");
		qly = qualityDao.postQuality(this, "Supersonic Communication");
		qly = qualityDao.postQuality(this, "Endless Freedom");
		qly = qualityDao.postQuality(this, "Flawless Integration");
	}

	public void addTestSprints() {
		sprintDao.createTestHistorySprint(this, Date.beforeDays(45), Date.beforeDays(15));
		sprintDao.createTestSprint(this);
	}

	public Comparator<Requirement> getRequirementsOrderComparator() {
		if (requirementsOrderComparator == null) requirementsOrderComparator = new Comparator<Requirement>() {

			@Override
			public int compare(Requirement a, Requirement b) {
				if (a.isInCurrentSprint() && !b.isInCurrentSprint()) return -1;
				if (b.isInCurrentSprint() && !a.isInCurrentSprint()) return 1;
				List<String> order = getRequirementsOrderIds();
				int additional = order.size();
				int ia = order.indexOf(a.getId());
				if (ia < 0) {
					ia = additional;
					additional++;
				}
				int ib = order.indexOf(b.getId());
				if (ib < 0) {
					ib = additional;
					additional++;
				}
				return ia - ib;
			}
		};
		return requirementsOrderComparator;
	}

	public Quality getQualityByLabel(String label) {
		for (Quality quality : getQualitys()) {
			if (quality.isLabel(label)) return quality;
		}
		return null;
	}

	public String getProductOwnersAsString() {
		return Str.concat(User.getNames(getProductOwners()), ", ");
	}

	public String getScrumMastersAsString() {
		return Str.concat(User.getNames(getScrumMasters()), ", ");
	}

	public String getTeamMembersAsString() {
		return Str.concat(User.getNames(getTeamMembers()), ", ");
	}

	public List<Sprint> getCompletedSprintsInReverseOrder() {
		ArrayList<Sprint> ret = new ArrayList<Sprint>();
		for (Sprint sprint : getSprints()) {
			if (sprint.isCompleted()) ret.add(sprint);
		}
		Collections.sort(ret, Sprint.END_DATE_REVERSE_COMPARATOR);
		return ret;
	}

}
