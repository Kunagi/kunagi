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

import ilarkesto.core.base.Args;
import ilarkesto.core.base.Str;
import ilarkesto.core.base.Utl;
import ilarkesto.core.scope.Scope;
import ilarkesto.core.time.Date;
import ilarkesto.gwt.client.Gwt;
import ilarkesto.gwt.client.HyperlinkWidget;
import ilarkesto.gwt.client.editor.AFieldModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import scrum.client.ScrumGwt;
import scrum.client.admin.Auth;
import scrum.client.admin.User;
import scrum.client.collaboration.ForumSupport;
import scrum.client.common.LabelSupport;
import scrum.client.common.ReferenceSupport;
import scrum.client.common.ShowEntityAction;
import scrum.client.common.ThemesContainer;
import scrum.client.estimation.RequirementEstimationVote;
import scrum.client.impediments.Impediment;
import scrum.client.issues.Issue;
import scrum.client.journal.Change;
import scrum.client.sprint.Sprint;
import scrum.client.sprint.Task;
import scrum.client.tasks.WhiteboardWidget;

import com.google.gwt.user.client.ui.Widget;

public class Requirement extends GRequirement implements ReferenceSupport, LabelSupport, ForumSupport, ThemesContainer {

	public static final String REFERENCE_PREFIX = "sto";
	public static String[] WORK_ESTIMATION_VALUES = new String[] { "", "0", "0.5", "1", "2", "3", "5", "8", "13", "20",
		"40", "100" };
	public static Float[] WORK_ESTIMATION_FLOAT_VALUES = new Float[] { 0.5f, 0f, 1f, 2f, 3f, 5f, 8f, 13f, 20f, 40f,
		100f };

	private transient EstimationBar estimationBar;
	private transient AFieldModel<String> taskStatusLabelModel;
	private transient AFieldModel<String> themesAsStringModel;
	private transient AFieldModel<String> estimatedWorkWithUnitModel;

	public static Requirement post(Project project) {
		Args.assertNotNull(project, "project");

		Requirement story = new Requirement();
		story.setProject(project);
		story.setDirty(true);

		story.persist();
		return story;
	}

	public String getBlockingImpedimentLabelsAsText() {
		StringBuilder sb = new StringBuilder();
		for (Impediment impediment : getBlockingImpediments()) {
			if (sb.length() > 0) sb.append(", ");
			sb.append(impediment.getReference() + " " + impediment.getLabel());
		}
		return sb.toString();
	}

	public String getExternalTrackerUrl() {
		String id = getExternalTrackerId();
		if (Str.isBlank(id)) return null;
		String template = getProject().getExternalTrackerUrlTemplate();
		if (Str.isBlank(template)) return null;
		return template.replace("${id}", id);
	}

	public String getHistoryLabel(final Sprint sprint) {
		for (Change change : Change.listByParent(this)) {
			String key = change.getKey();
			if (!change.isNewValue(sprint.getId())) continue;
			if (Change.REQ_COMPLETED_IN_SPRINT.equals(key) || Change.REQ_REJECTED_IN_SPRINT.equals(key))
				return change.getOldValue();
		}
		return getLabel();
	}

	public boolean isBlocked() {
		return !getBlockingImpediments().isEmpty();
	}

	public Set<Impediment> getBlockingImpediments() {
		HashSet<Impediment> ret = new HashSet<Impediment>();
		for (Task task : getTasksInSprint()) {
			ret.addAll(task.getBlockingImpediments());
		}
		return ret;
	}

	public Set<Impediment> getImpediments() {
		Set<Impediment> impediments = new HashSet<Impediment>();
		for (Task task : getTasksInSprint()) {
			impediments.addAll(task.getBlockingImpediments());
		}
		return impediments;
	}

	@Override
	public List<String> getAvailableThemes() {
		return getProject().getThemes();
	}

	@Override
	public boolean isThemesEditable() {
		return getLabelModel().isEditable();
	}

	@Override
	public boolean isThemesCreatable() {
		return ScrumGwt.isCurrentUserProductOwner();
	}

	public List<Requirement> getRelatedRequirements() {
		List<Requirement> ret = getProject().getRequirementsByThemes(getThemes());
		ret.remove(this);
		return ret;
	}

	public List<Issue> getRelatedIssues() {
		return getProject().getIssuesByThemes(getThemes());
	}

	public void removeFromSprint() {
		setSprint(null);
		for (Task task : getTasksInSprint()) {
			task.setOwner(null);
			task.setBurnedWork(0);
		}
	}

	public Set<Task> getTasksInSprint() {
		return getTasksInSprint(getProject().getCurrentSprint());
	}

	public Set<Task> getTasksInSprint(Sprint sprint) {
		HashSet<Task> ret = new HashSet<Task>();
		for (Task task : getTasks()) {
			if (task.isClosedInPastSprintSet()) continue;
			if (!task.isSprint(sprint)) continue;
			ret.add(task);
		}
		return ret;
	}

	public boolean isDecidable() {
		if (getRejectDate() != null) return false;
		return isTasksClosed();
	}

	public boolean isRejected() {
		if (isClosed()) return false;
		if (!isTasksClosed()) return false;
		if (!isInCurrentSprint()) return false;
		return getRejectDate() != null;
	}

	public void reject() {
		setRejectDate(Date.today());
	}

	public void fix() {
		setRejectDate(null);
	}

	public String getEstimatedWorkAsString() {
		return ScrumGwt.getEstimationAsString(getEstimatedWork());
	}

	public String getEstimatedWorkWithUnit() {
		return ScrumGwt.getEstimationAsString(getEstimatedWork(), getProject().getEffortUnit());
	}

	public boolean containsWorkEstimationVotes() {
		for (RequirementEstimationVote vote : getRequirementEstimationVotes()) {
			if (vote.getEstimatedWork() != null) return true;
		}
		return false;
	}

	public RequirementEstimationVote getEstimationVote(User user) {
		for (RequirementEstimationVote vote : getRequirementEstimationVotes()) {
			if (vote.isUser(user)) return vote;
		}
		return null;
	}

	public void setVote(Float estimatedWork) {
		RequirementEstimationVote vote = getEstimationVote(Scope.get().getComponent(Auth.class).getUser());
		if (vote == null) throw new IllegalStateException("vote == null");
		vote.setEstimatedWork(estimatedWork);
		if (estimatedWork != null && isWorkEstimationVotingComplete()) activateWorkEstimationVotingShowoff();
		updateLastModified();
	}

	public boolean isWorkEstimationVotingComplete() {
		for (User user : getProject().getTeamMembers()) {
			RequirementEstimationVote vote = getEstimationVote(user);
			if (vote == null || vote.getEstimatedWork() == null) return false;
		}
		return true;
	}

	public void deactivateWorkEstimationVoting() {
		setWorkEstimationVotingActive(false);
	}

	public void activateWorkEstimationVotingShowoff() {
		setWorkEstimationVotingShowoff(true);
	}

	public String getTaskStatusLabel() {
		Set<Task> tasks = getTasksInSprint();
		int burned = Task.sumBurnedWork(tasks);
		int remaining = Task.sumRemainingWork(getTasksInSprint());
		if (remaining == 0)
			return tasks.isEmpty() ? "no tasks planned yet" : "100% completed, " + burned + " hrs burned";
		int burnedPercent = Gwt.percent(burned + remaining, burned);
		return burnedPercent + "% completed, " + remaining + " hrs left";
	}

	public void setEstimationBar(EstimationBar estimationBar) {
		if (Utl.equals(this.estimationBar, estimationBar)) return;
		this.estimationBar = estimationBar;
		updateLastModified();
	}

	public EstimationBar getEstimationBar() {
		return estimationBar;
	}

	public boolean isValidForSprint() {
		if (!isEstimatedWorkValid()) return false;
		return true;
	}

	public boolean isEstimatedWorkValid() {
		return !isDirty() && getEstimatedWork() != null;
	}

	public String getLongLabel() {
		StringBuilder sb = new StringBuilder();
		sb.append(getLabel());
		if (!isEstimatedWorkValid()) sb.append(" [requires estimation]");
		if (isInCurrentSprint()) sb.append(" [In Sprint]");
		return sb.toString();
	}

	public boolean isInCurrentSprint() {
		return isSprintSet() && getProject().isCurrentSprint(getSprint());
	}

	public String getReferenceAndLabel() {
		return getReference() + " " + getLabel();
	}

	@Override
	public String getReference() {
		return REFERENCE_PREFIX + getNumber();
	}

	/**
	 * No tasks created yet.
	 */
	public boolean isPlanned() {
		return !getTasksInSprint().isEmpty();
	}

	/**
	 * All tasks are done. Not closed yet.
	 */
	public boolean isTasksClosed() {
		Collection<Task> tasks = getTasksInSprint();
		if (tasks.isEmpty()) return false;
		for (Task task : tasks) {
			if (!task.isClosed()) return false;
		}
		return true;
	}

	/**
	 * Summary to show in the product backlog.
	 */
	public String getProductBacklogSummary() {
		String summary = isDirty() ? "[dirty] " : "[not dirty] ";
		if (isClosed()) return summary += "Closed.";
		if (isTasksClosed()) return summary += "Done. Test required.";
		if (getEstimatedWork() == null) return summary += "No effort estimated.";
		if (!isSprintSet()) return summary += getEstimatedWorkWithUnit() + " to do. No sprint assigned.";
		Sprint sprint = getSprint();
		return summary += getEstimatedWorkWithUnit() + " to do in sprint " + sprint.getLabel() + ".";
	}

	/**
	 * Summary to show in the sprint backlog.
	 */
	public String getSprintBacklogSummary() {
		if (isClosed()) return "Closed.";
		if (!isPlanned()) return "Not planned yet.";
		if (isTasksClosed()) return "Done. Test required.";
		int taskCount = 0;
		int openTaskCount = 0;
		int effort = 0;
		for (Task task : getTasksInSprint()) {
			taskCount++;
			if (!task.isClosed()) {
				openTaskCount++;
				effort += task.getRemainingWork();
			}
		}
		return openTaskCount + " of " + taskCount + " Tasks open. About " + effort + " hours to do.";
	}

	public int getBurnedWorkInClosedTasks() {
		return Task.sumBurnedWork(getClosedTasks());
	}

	public int getBurnedWork() {
		return Task.sumBurnedWork(getTasksInSprint());
	}

	public int getBurnedWorkInClaimedTasks() {
		return Task.sumBurnedWork(getClaimedTasks());
	}

	public int getRemainingWorkInClaimedTasks() {
		return Task.sumRemainingWork(getClaimedTasks());
	}

	public int getRemainingWorkInUnclaimedTasks() {
		return Task.sumRemainingWork(getUnclaimedTasks());
	}

	public int getRemainingWork() {
		return Task.sumRemainingWork(getTasksInSprint());
	}

	public List<Task> getClaimedTasks() {
		List<Task> ret = new ArrayList<Task>();
		for (Task task : getTasksInSprint()) {
			if (task.isOwnerSet() && !task.isClosed()) ret.add(task);
		}
		return ret;
	}

	public List<Task> getClaimedTasks(User owner) {
		List<Task> ret = new ArrayList<Task>();
		for (Task task : getTasksInSprint()) {
			if (task.isOwner(owner) && !task.isClosed()) ret.add(task);
		}
		return ret;
	}

	public List<Task> getClosedTasks() {
		List<Task> ret = new ArrayList<Task>();
		for (Task task : getTasksInSprint()) {
			if (task.isClosed()) ret.add(task);
		}
		return ret;
	}

	public List<Task> getUnclaimedTasks() {
		List<Task> ret = new ArrayList<Task>();
		for (Task task : getTasksInSprint()) {
			if (task.isClosed() || task.isOwnerSet()) continue;
			ret.add(task);
		}
		return ret;
	}

	public List<Task> getTasksBlockedBy(Impediment impediment) {
		List<Task> ret = new ArrayList<Task>();
		for (Task task : getTasksInSprint()) {
			if (task.containsImpediment(impediment)) ret.add(task);
		}
		return ret;
	}

	public static int sumBurnedWork(Iterable<Requirement> requirements) {
		int sum = 0;
		for (Requirement requirement : requirements) {
			sum += requirement.getBurnedWork();
		}
		return sum;
	}

	public Task createNewTask() {
		Task task = Task.post(this);
		updateTasksOrder();
		return task;
	}

	@Override
	public boolean isEditable() {
		if (isClosed()) return false;
		if (isInCurrentSprint()) return false;
		if (!getProject().isProductOwner(Scope.get().getComponent(Auth.class).getUser())) return false;
		return true;
	}

	@Override
	public String toHtml() {
		return ScrumGwt.toHtml(this, getLabel());
	}

	@Override
	public String asString() {
		return getReferenceAndLabel();
	}

	@Override
	public Widget createForumItemWidget() {
		return new HyperlinkWidget(new ShowEntityAction(isInCurrentSprint() ? WhiteboardWidget.class
				: ProductBacklogWidget.class, this, getLabel()));
	}

	private void updateTasksOrder() {
		updateTasksOrder(Utl.sort(getTasksInSprint(), getTasksOrderComparator()));
	}

	public void updateTasksOrder(List<Task> tasks) {
		setTasksOrderIds(Gwt.getIdsAsList(tasks));
	}

	public String getThemesAsString() {
		return Str.concat(getThemes(), ", ");
	}

	public Comparator<Task> getTasksOrderComparator() {
		return getSprint().getTasksOrderComparator();
	}

	public AFieldModel<String> getEstimatedWorkWithUnitModel() {
		if (estimatedWorkWithUnitModel == null) estimatedWorkWithUnitModel = new AFieldModel<String>() {

			@Override
			public String getValue() {
				return getEstimatedWorkWithUnit();
			}
		};
		return estimatedWorkWithUnitModel;
	}

	public AFieldModel<String> getTaskStatusLabelModel() {
		if (taskStatusLabelModel == null) taskStatusLabelModel = new AFieldModel<String>() {

			@Override
			public String getValue() {
				return getTaskStatusLabel();
			}
		};
		return taskStatusLabelModel;
	}

	public AFieldModel<String> getThemesAsStringModel() {
		if (themesAsStringModel == null) themesAsStringModel = new AFieldModel<String>() {

			@Override
			public String getValue() {
				return getThemesAsString();
			}
		};
		return themesAsStringModel;
	}

	public AFieldModel<String> getHistoryLabelModel(final Sprint sprint) {
		return new AFieldModel<String>() {

			@Override
			public String getValue() {
				return getHistoryLabel(sprint);
			}
		};
	}

	@Override
	protected ExternalTrackerIdModel createExternalTrackerIdModel() {
		return new ExternalTrackerIdModel() {

			@Override
			public String getDisplayValue() {
				String url = getExternalTrackerUrl();
				if (Str.isBlank(url)) return super.getDisplayValue();
				return "[" + url + " " + getExternalTrackerId() + "]";
			}

		};
	}

	@Override
	protected LabelModel createLabelModel() {
		return new LabelModel() {

			@Override
			public boolean isSwitchToEditModeIfNull() {
				return true;
			}
		};

	}

}
