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
package scrum.client.project;

import ilarkesto.core.base.Str;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.scope.Scope;
import ilarkesto.core.time.Date;
import ilarkesto.core.time.DateAndTime;
import ilarkesto.core.time.Time;
import ilarkesto.gwt.client.AGwtEntity;
import ilarkesto.gwt.client.Gwt;
import ilarkesto.gwt.client.HyperlinkWidget;
import ilarkesto.gwt.client.editor.AEditorModel;
import ilarkesto.gwt.client.editor.AFieldModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import scrum.client.ScrumGwt;
import scrum.client.admin.Auth;
import scrum.client.admin.ProjectUserConfig;
import scrum.client.admin.User;
import scrum.client.collaboration.Comment;
import scrum.client.collaboration.ForumSupport;
import scrum.client.collaboration.Subject;
import scrum.client.collaboration.Wikipage;
import scrum.client.common.ShowEntityAction;
import scrum.client.common.WeekdaySelector;
import scrum.client.dashboard.DashboardWidget;
import scrum.client.files.File;
import scrum.client.impediments.Impediment;
import scrum.client.issues.Issue;
import scrum.client.journal.ProjectEvent;
import scrum.client.pr.BlogEntry;
import scrum.client.release.Release;
import scrum.client.risks.Risk;
import scrum.client.sprint.RequirementsOrderComparator;
import scrum.client.sprint.Sprint;
import scrum.client.sprint.SprintReport;
import scrum.client.sprint.Task;

import com.google.gwt.user.client.ui.Widget;

public class Project extends GProject implements ForumSupport {

	private static transient final Log LOG = Log.get(Project.class);

	private static final String effortUnit = "pts";
	public static final String INIT_LABEL = "New Project";

	public transient boolean historyLoaded;
	private transient RequirementsOrderComparator requirementsOrderComparator;
	private transient Comparator<Issue> issuesOrderComparator;

	public Project(User creator) {
		setLabel(INIT_LABEL + " " + DateAndTime.now());
		addParticipant(creator);
		addAdmin(creator);
		addProductOwner(creator);
		addScrumMaster(creator);
		addTeamMember(creator);
		setLastOpenedDateAndTime(DateAndTime.now());
	}

	public Project(Map data) {
		super(data);
	}

	public boolean isInHistory(Requirement requirement) {
		for (SprintReport report : getSprintReports()) {
			if (report.containsCompletedRequirement(requirement)) return true;
			if (report.containsRejectedRequirement(requirement)) return true;
		}
		return false;
	}

	public Set<SprintReport> getSprintReports() {
		Set<SprintReport> reports = new HashSet<SprintReport>();
		for (Sprint sprint : getSprints()) {
			SprintReport report = sprint.getSprintReport();
			if (report != null) reports.add(report);
		}
		return reports;
	}

	public boolean isHomepagePublishingEnabled() {
		return !Str.isBlank(getHomepageDir());
	}

	public int getTotalMisconducts() {
		int sum = 0;
		for (ProjectUserConfig config : getProjectUserConfigs()) {
			sum += config.getMisconducts();
		}
		return sum;
	}

	public Requirement getNextProductBacklogRequirement() {
		List<Requirement> requirements = getProductBacklogRequirements();
		if (requirements.isEmpty()) return null;
		Collections.sort(requirements, getRequirementsOrderComparator());
		return requirements.get(0);
	}

	public List<String> getThemes() {
		Set<String> themes = new HashSet<String>();
		for (Requirement requirement : getRequirements()) {
			if (requirement.isClosed()) continue;
			themes.addAll(requirement.getThemes());
		}
		for (Issue issue : getIssues()) {
			if (issue.isClosed()) continue;
			themes.addAll(issue.getThemes());
		}
		List<String> ret = new ArrayList<String>(themes);
		Collections.sort(ret);
		return ret;
	}

	public void updateRequirementsModificationTimes() {
		for (Requirement requirement : getRequirements()) {
			requirement.updateLocalModificationTime();
		}
	}

	@Override
	public boolean isEditable() {
		User currentUser = Scope.get().getComponent(Auth.class).getUser();
		return currentUser.isAdmin() || isAdmin(currentUser);
	}

	public List<Issue> getClaimedBugs(User user) {
		List<Issue> issues = new ArrayList<Issue>();
		for (Issue issue : getOpenBugs()) {
			if (issue.isOwner(user) && !issue.isFixed()) issues.add(issue);
		}
		return issues;
	}

	public List<Task> getClaimedTasks(User user) {
		List<Task> tasks = new ArrayList<Task>();
		for (Requirement req : getRequirements()) {
			tasks.addAll(req.getClaimedTasks(user));
		}
		return tasks;
	}

	public Float getVelocityFromLastSprint() {
		Sprint latest = getLatestCompletedSprint();
		return latest == null ? null : latest.getVelocity();
	}

	public Sprint getLatestCompletedSprint() {
		Sprint latest = null;
		for (Sprint sprint : getSprints()) {
			if (!sprint.isCompleted()) continue;
			if (latest == null || sprint.getEnd().isAfter(latest.getEnd())) latest = sprint;
		}
		return latest;
	}

	public Set<Sprint> getCompletedSprints() {
		Set<Sprint> ret = new HashSet<Sprint>();
		for (Sprint sprint : getSprints()) {
			if (sprint.isCompleted()) ret.add(sprint);
		}
		return ret;
	}

	public List<Sprint> getCompletedSprintsInOrder() {
		return Utl.sort(getCompletedSprints(), Sprint.END_DATE_COMPARATOR);
	}

	public List<Sprint> getCompletedSprintsInReverseOrder() {
		return Utl.sort(getCompletedSprints(), Sprint.END_DATE_REVERSE_COMPARATOR);
	}

	public List<ProjectEvent> getLatestProjectEvents(int min) {
		List<ProjectEvent> events = getProjectEvents();
		Collections.sort(events, ProjectEvent.DATE_AND_TIME_COMPARATOR);

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

	public Wikipage getWikipage(String name) {
		name = name.toLowerCase();
		for (Wikipage page : getDao().getWikipagesByProject(this)) {
			if (page.getName().toLowerCase().equals(name)) return page;
		}
		return null;
	}

	public ProjectUserConfig getUserConfig(User user) {
		for (ProjectUserConfig config : getDao().getProjectUserConfigsByProject(this)) {
			if (config.isUser(user)) return config;
		}
		return null;
	}

	public boolean isScrumTeamMember(User user) {
		return isProductOwner(user) || isScrumMaster(user) || isTeamMember(user);
	}

	public boolean isProductOwnerOrScrumMaster(User user) {
		return isProductOwner(user) || isScrumMaster(user);
	}

	public boolean isProductOwnerOrTeamMember(User user) {
		return isProductOwner(user) || isTeamMember(user);
	}

	public boolean isTeamMember(User user) {
		return getTeamMembers().contains(user);
	}

	public boolean isScrumMaster(User user) {
		return getScrumMasters().contains(user);
	}

	public boolean isProductOwner(User user) {
		return getProductOwners().contains(user);
	}

	public boolean isAdmin(User user) {
		return getAdmins().contains(user);
	}

	public String getUsersRolesAsString(User user, String prefix, String suffix) {
		StringBuilder sb = new StringBuilder();
		List<String> roles = new ArrayList<String>();
		if (isProductOwner(user)) roles.add("PO");
		if (isScrumMaster(user)) roles.add("SM");
		if (isTeamMember(user)) roles.add("T");
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

	private void updateRequirementsOrder() {
		List<Requirement> requirements = getProductBacklogRequirements();
		Collections.sort(requirements, getRequirementsOrderComparator());
		updateRequirementsOrder(requirements);
	}

	public void updateRequirementsOrder(List<Requirement> requirements) {
		setRequirementsOrderIds(Gwt.getIdsAsList(requirements));
		updateRequirementsModificationTimes();
	}

	public void updateUrgentIssuesOrder(List<Issue> issues) {
		setUrgentIssuesOrderIds(Gwt.getIdsAsList(issues));
	}

	public void setParticipantsConfigured(Collection<User> users) {
		users.addAll(getTeamMembers());
		users.addAll(getAdmins());
		users.addAll(getProductOwners());
		users.addAll(getScrumMasters());
		setParticipants(users);
	}

	public String getEffortUnit() {
		return effortUnit;
	}

	public Wikipage createNewWikipage(String name) {
		Wikipage page = new Wikipage(this, name);
		getDao().createWikipage(page);
		return page;
	}

	public Subject createNewSubject() {
		Subject subject = new Subject(this);
		getDao().createSubject(subject);
		return subject;
	}

	public Issue createNewIssue() {
		Issue issue = new Issue(this);
		getDao().createIssue(issue);
		return issue;
	}

	public Impediment createNewImpediment() {
		Impediment impediment = new Impediment(this);
		getDao().createImpediment(impediment);
		return impediment;
	}

	public void deleteImpediment(Impediment impediment) {
		for (Task task : getDao().getTasksByImpediment(impediment)) {
			task.setImpediment(null);
		}
		getDao().deleteImpediment(impediment);
	}

	public void deleteFile(File file) {
		getDao().deleteFile(file);
	}

	public void deleteIssue(Issue issue) {
		getDao().deleteIssue(issue);
	}

	public void deleteRisk(Risk risk) {
		getDao().deleteRisk(risk);
	}

	public Set<ForumSupport> getEntitiesWithComments() {
		Set<ForumSupport> ret = new HashSet<ForumSupport>();
		ret.addAll(getSubjects());
		for (Comment comment : getDao().getComments()) {
			AGwtEntity entity = comment.getParent();
			if (!(entity instanceof ForumSupport)) {
				LOG.error(entity.getClass().getName() + " needs to implement ForumSupport");
				continue;
			}
			ret.add((ForumSupport) comment.getParent());
		}
		return ret;
	}

	public List<Impediment> getOpenImpediments() {
		List<Impediment> ret = new ArrayList<Impediment>();
		for (Impediment impediment : getImpediments()) {
			if (impediment.isClosed()) continue;
			ret.add(impediment);
		}
		return ret;
	}

	public List<Issue> getOpenIssues(boolean includeSuspended) {
		List<Issue> ret = new ArrayList<Issue>();
		for (Issue issue : getIssues()) {
			if (!issue.isOpen()) continue;
			if (!includeSuspended && issue.isSuspended()) continue;
			ret.add(issue);
		}
		return ret;
	}

	public List<Issue> getIdeas() {
		List<Issue> ret = new ArrayList<Issue>();
		for (Issue issue : getIssues()) {
			if (issue.isIdea()) ret.add(issue);
		}
		return ret;
	}

	public List<Issue> getUnclaimedBugs(int severity) {
		List<Issue> ret = new ArrayList<Issue>();
		for (Issue issue : getOpenBugs()) {
			if (issue.getOwner() == null && issue.isSeverity(severity)) ret.add(issue);
		}
		return ret;
	}

	public List<Issue> getOpenBugs() {
		List<Issue> ret = new ArrayList<Issue>();
		for (Issue issue : getIssues()) {
			if (issue.isUnclosedBug()) ret.add(issue);
		}
		return ret;
	}

	public List<Issue> getUnclosedFixedBugs() {
		List<Issue> ret = new ArrayList<Issue>();
		for (Issue issue : getIssues()) {
			if (issue.isBug() && issue.isFixed() && !issue.isClosed()) ret.add(issue);
		}
		return ret;
	}

	public List<Issue> getClosedIssues() {
		List<Issue> ret = new ArrayList<Issue>();
		for (Issue issue : getIssues()) {
			if (issue.isClosed()) ret.add(issue);
		}
		return ret;
	}

	public List<Release> getReleasedReleases() {
		List<Release> ret = new ArrayList<Release>();
		for (Release release : getReleases()) {
			if (release.isReleased()) ret.add(release);
		}
		return ret;
	}

	public List<Release> getPlannedReleases() {
		List<Release> ret = new ArrayList<Release>();
		for (Release release : getReleases()) {
			if (!release.isReleased()) ret.add(release);
		}
		return ret;
	}

	public List<Risk> getHighestRisks(int max) {
		List<Risk> ret = getRisks();
		Collections.sort(ret, Risk.PRIORITY_COMPARATOR);
		while (ret.size() > max) {
			ret.remove(ret.size() - 1);
		}
		return ret;
	}

	public Risk createNewRisk() {
		Risk risk = new Risk(this);
		getDao().createRisk(risk);
		return risk;
	}

	public BlogEntry createNewBlogEntry() {
		BlogEntry blogEntry = new BlogEntry(this);
		getDao().createBlogEntry(blogEntry);
		return blogEntry;
	}

	public BlogEntry createNewBlogEntry(Release release) {
		BlogEntry blogEntry = new BlogEntry(this);
		blogEntry.setTitle("Release " + release.getLabel());
		String text = release.isReleased() ? release.getReleaseNotes() : release.createIzemizedReleaseNotes();
		blogEntry.setText(text);
		getDao().createBlogEntry(blogEntry);
		return blogEntry;
	}

	public Release createNewRelease(Release parentRelease) {
		Release release = new Release(this);
		Date date = Date.today();
		if (parentRelease != null) {
			release.setParentRelease(parentRelease);
			release.setLabel(parentRelease.getLabel() + " Bugfix " + (parentRelease.getBugfixReleases().size() + 1));
			Date parentDate = parentRelease.getReleaseDate();
			if (parentDate != null && parentDate.isAfter(date)) date = parentDate;
		}
		release.setReleaseDate(date);
		getDao().createRelease(release);
		return release;
	}

	/**
	 * @param relative The story, before which the new story should be placed. Optional.
	 */
	public Requirement createNewRequirement(Requirement relative, boolean before, boolean split) {
		Requirement item = new Requirement(this);

		if (split) {
			String theme = relative.getLabel();
			List<String> themes = relative.getThemes();
			if (!themes.contains(theme)) themes.add(theme);

			relative.setThemes(themes);
			relative.setDirty(true);

			item.setEpic(relative);
			item.setThemes(themes);
			item.setDescription(relative.getDescription());
			item.setTestDescription(relative.getTestDescription());
			item.setQualitys(relative.getQualitys());
		}

		if (relative == null) {
			updateRequirementsOrder();
		} else {
			List<Requirement> requirements = getProductBacklogRequirements();
			requirements.remove(item);
			Collections.sort(requirements, getRequirementsOrderComparator());
			int idx = requirements.indexOf(relative);
			if (!before) idx++;
			requirements.add(idx, item);
			updateRequirementsOrder(requirements);
		}

		getDao().createRequirement(item);
		return item;
	}

	public Quality createNewQuality() {
		Quality item = new Quality(this);
		getDao().createQuality(item);
		return item;
	}

	public void deleteRequirement(Requirement item) {
		getDao().deleteRequirement(item);
	}

	public void deleteQuality(Quality item) {
		getDao().deleteQuality(item);
	}

	public List<Requirement> getProductBacklogRequirements() {
		List<Requirement> ret = new ArrayList<Requirement>();
		for (Requirement requirement : getRequirements()) {
			if (requirement.isClosed()) continue;
			if (requirement.isSuspended()) continue;
			if (requirement.isInCurrentSprint()) continue;
			ret.add(requirement);
		}
		return ret;
	}

	public List<Task> getTasks() {
		return getDao().getTasks();
	}

	public List<Issue> getIssuesByThemes(Collection<String> themes) {
		List<Issue> ret = new ArrayList<Issue>();
		for (Issue issue : getIssues()) {
			for (String theme : themes) {
				if (issue.containsTheme(theme) && !ret.contains(issue)) ret.add(issue);
			}
		}
		return ret;
	}

	public List<Requirement> getRequirementsByThemes(Collection<String> themes) {
		List<Requirement> ret = new ArrayList<Requirement>();
		for (Requirement requirement : getRequirements()) {
			for (String theme : themes) {
				if (requirement.containsTheme(theme) && !ret.contains(requirement)) ret.add(requirement);
			}
		}
		return ret;
	}

	public List<Requirement> getRequirementsOrdered() {
		List<Requirement> requirements = getRequirements();
		Collections.sort(requirements, getRequirementsOrderComparator());
		return requirements;
	}

	public Sprint createNewSprint() {
		Sprint sprint = new Sprint(this, "New Sprint");
		getDao().createSprint(sprint);
		return sprint;
	}

	public boolean deleteTask(Task task) {
		for (Requirement requirement : getRequirements()) {
			boolean b = requirement.getTasks().remove(task);
			if (b) return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return getLabel();
	}

	public Comparator<Issue> getIssuesOrderComparator() {
		if (issuesOrderComparator == null) issuesOrderComparator = new Comparator<Issue>() {

			@Override
			public int compare(Issue a, Issue b) {
				List<String> order = getUrgentIssuesOrderIds();
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
		return issuesOrderComparator;
	}

	public RequirementsOrderComparator getRequirementsOrderComparator() {
		if (requirementsOrderComparator == null) requirementsOrderComparator = new RequirementsOrderComparator() {

			@Override
			protected List<String> getOrder() {
				return getRequirementsOrderIds();
			}

		};
		return requirementsOrderComparator;
	}

	public String formatEfford(Float i) {
		if (i == null || i == 0) return "nothing";
		String unit = getEffortUnit();
		if (i == 1) {
			if (unit.endsWith("s")) unit = unit.substring(0, unit.length() - 2);
			return "1 " + unit;
		}
		return i + " " + unit;
	}

	public static final Comparator<Project> LABEL_COMPARATOR = new Comparator<Project>() {

		@Override
		public int compare(Project a, Project b) {
			return a.getLabel().compareTo(b.getLabel());
		}
	};

	public static final Comparator<Project> LAST_OPENED_COMPARATOR = new Comparator<Project>() {

		@Override
		public int compare(Project a, Project b) {
			return Utl.compare(a.getLastOpenedDateAndTime(), b.getLastOpenedDateAndTime()) * -1;
		}
	};

	public Set<User> getUsersSelecting(AGwtEntity entity) {
		Set<User> users = new HashSet<User>();
		for (ProjectUserConfig config : getUserConfigs()) {
			if (config.getSelectedEntitysIds().contains(entity.getId())) users.add(config.getUser());
		}
		return users;
	}

	public List<ProjectUserConfig> getUserConfigs() {
		return getDao().getProjectUserConfigsByProject(this);
	}

	@Override
	public Widget createForumItemWidget() {
		return new HyperlinkWidget(new ShowEntityAction(DashboardWidget.class, this, "Project Dashboard"));
	}

	@Override
	public String getReference() {
		return "prj";
	}

	private transient AFieldModel<String> lastOpenedAgoModel;

	public AFieldModel<String> getLastOpenedAgoModel() {
		if (lastOpenedAgoModel == null) lastOpenedAgoModel = new AFieldModel<String>() {

			@Override
			public String getValue() {
				return ScrumGwt.getPeriodToAsShortestString("last opened ", getLastOpenedDateAndTime(), " ago");
			}
		};
		return lastOpenedAgoModel;
	}

	private transient AEditorModel<WeekdaySelector> freeDaysWeekdaySelectorModel;

	public AEditorModel<WeekdaySelector> getFreeDaysWeekdaySelectorModel() {
		if (freeDaysWeekdaySelectorModel == null) freeDaysWeekdaySelectorModel = new AEditorModel<WeekdaySelector>() {

			@Override
			public WeekdaySelector getValue() {
				return new WeekdaySelector(getFreeDays());
			}

			@Override
			public void setValue(WeekdaySelector value) {
				if (value != null && value.isSelectedAll())
					throw new RuntimeException("At least one work day required.");
				setFreeDays(value == null ? 0 : value.createBitmask());
			}

			@Override
			public String getId() {
				return "freeDaysWeekdaySelector";
			}

		};
		return freeDaysWeekdaySelectorModel;
	}

	public void suspendRequirement(Requirement requirement) {
		requirement.setSuspended(true);
	}
}
