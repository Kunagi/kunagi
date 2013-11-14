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
package scrum.client.sprint;

import ilarkesto.core.base.Utl;
import ilarkesto.core.scope.Scope;
import ilarkesto.core.time.Date;
import ilarkesto.core.time.TimePeriod;
import ilarkesto.gwt.client.Gwt;
import ilarkesto.gwt.client.HyperlinkWidget;
import ilarkesto.gwt.client.editor.ATextEditorModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import scrum.client.ScrumGwt;
import scrum.client.admin.Auth;
import scrum.client.admin.User;
import scrum.client.collaboration.ForumSupport;
import scrum.client.collaboration.Wiki;
import scrum.client.common.LabelSupport;
import scrum.client.common.ReferenceSupport;
import scrum.client.common.ShowEntityAction;
import scrum.client.impediments.Impediment;
import scrum.client.project.Project;
import scrum.client.project.Requirement;
import scrum.client.sprint.SprintHistoryHelper.StoryInfo;
import scrum.client.sprint.SprintHistoryHelper.TaskInfo;
import scrum.client.tasks.WhiteboardWidget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;

public class Sprint extends GSprint implements ForumSupport, ReferenceSupport, LabelSupport {

	public static final String REFERENCE_PREFIX = "spr";

	private transient Comparator<Task> tasksOrderComparator;
	private transient RequirementsOrderComparator requirementsOrderComparator;

	public Sprint(Project project, String label) {
		setProject(project);
		setLabel(label);
	}

	public Sprint(Map data) {
		super(data);
	}

	public void updateRequirementsOrder() {
		List<Requirement> requirements = getRequirements();
		Collections.sort(requirements, getRequirementsOrderComparator());
		updateRequirementsOrder(requirements);
	}

	public void updateRequirementsOrder(List<Requirement> requirements) {
		setRequirementsOrderIds(Gwt.getIdsAsList(requirements));
	}

	public List<Requirement> getCompletedUnclosedRequirements() {
		List<Requirement> ret = new ArrayList<Requirement>();
		for (Requirement req : getRequirements()) {
			if (req.isTasksClosed() && !req.isClosed() && !req.isRejected()) ret.add(req);
		}
		return ret;
	}

	public List<Requirement> getIncompletedRequirements() {
		List<Requirement> ret = new ArrayList<Requirement>();
		for (Requirement req : getRequirements()) {
			if (!req.isTasksClosed()) ret.add(req);
		}
		return ret;
	}

	public Integer getLengthInDays() {
		TimePeriod lenght = getLength();
		return lenght == null ? null : lenght.toDays();
	}

	public TimePeriod getLength() {
		Date begin = getBegin();
		Date end = getEnd();
		if (begin == null || end == null) return null;
		return getBegin().getPeriodTo(getEnd()).addDays(1);
	}

	public void setLengthInDays(Integer lenght) {
		if (lenght == null || lenght <= 0) return;
		Date begin = getBegin();
		if (begin == null) {
			begin = getProject().getCurrentSprint().getEnd();
			setBegin(begin);
		}
		Date end = begin.addDays(lenght - 1);
		setEnd(end);
	}

	public List<Task> getTasksBlockedBy(Impediment impediment) {
		List<Task> ret = new ArrayList<Task>();
		for (Requirement requirement : getRequirements()) {
			ret.addAll(requirement.getTasksBlockedBy(impediment));
		}
		return ret;
	}

	public String getChartUrl(int width, int height) {
		return GWT.getModuleBaseURL() + "sprintBurndownChart.png?sprintId=" + getId() + "&width=" + width + "&height="
				+ height;
	}

	public String getStoryBurndown(int width, int height) {
		return GWT.getModuleBaseURL() + "storyBurndownChart.png?sprintId=" + getId() + "&width=" + width + "&height="
				+ height;
	}

	public boolean isCompleted() {
		return getVelocity() != null;
	}

	public float getEstimatedRequirementWork() {
		float sum = 0;
		for (Requirement requirement : getRequirements()) {
			Float work = requirement.getEstimatedWork();
			if (work != null) sum += work;
		}
		return sum;
	}

	public float getCompletedRequirementWork() {
		float sum = 0;
		for (Requirement requirement : getRequirements()) {
			if (!requirement.isClosed()) continue;
			Float work = requirement.getEstimatedWork();
			if (work != null) sum += work;
		}
		return sum;
	}

	public List<Requirement> getDecidableUndecidedRequirements() {
		List<Requirement> ret = new ArrayList<Requirement>();
		for (Requirement requirement : getRequirements()) {
			if (requirement.isDecidable() && !requirement.isClosed()) ret.add(requirement);
		}
		return ret;
	}

	public List<Task> getUnclaimedTasks(boolean sorted) {
		List<Task> ret = new ArrayList<Task>();
		List<Requirement> requirements = getRequirements();
		if (sorted) Collections.sort(requirements, getRequirementsOrderComparator());
		for (Requirement requirement : requirements) {
			ret.addAll(requirement.getUnclaimedTasks());
		}
		return ret;
	}

	public List<Task> getTasks(User user) {
		List<Task> ret = new ArrayList<Task>();
		for (Requirement requirement : getRequirements()) {
			for (Task task : requirement.getTasksInSprint()) {
				if (user == null) {
					if (!task.isOwnerSet()) {
						ret.add(task);
					}
				} else {
					if (task.isOwner(user)) {
						ret.add(task);
					}
				}
			}
		}
		return ret;
	}

	public List<Task> getClaimedTasks(User user) {
		List<Task> ret = new ArrayList<Task>();
		for (Requirement requirement : getRequirements()) {
			ret.addAll(requirement.getClaimedTasks(user));
		}
		return ret;
	}

	public int getBurnedWorkInClosedTasks() {
		int sum = 0;
		for (Requirement requirement : getRequirements()) {
			sum += requirement.getBurnedWorkInClosedTasks();
		}
		return sum;
	}

	public int getBurnedWork() {
		return Requirement.sumBurnedWork(getRequirements());
	}

	public int getBurnedWorkInClaimedTasks() {
		int sum = 0;
		for (Requirement requirement : getRequirements()) {
			sum += requirement.getBurnedWorkInClaimedTasks();
		}
		return sum;
	}

	public int getRemainingWorkInClaimedTasks() {
		int sum = 0;
		for (Requirement requirement : getRequirements()) {
			sum += requirement.getRemainingWorkInClaimedTasks();
		}
		return sum;
	}

	public int getRemainingWorkInUnclaimedTasks() {
		int sum = 0;
		for (Requirement requirement : getRequirements()) {
			sum += requirement.getRemainingWorkInUnclaimedTasks();
		}
		return sum;
	}

	public int getRemainingWork() {
		int sum = 0;
		for (Requirement requirement : getRequirements()) {
			sum += requirement.getRemainingWork();
		}
		return sum;
	}

	@Override
	public String toHtml() {
		return ScrumGwt.toHtml(this, getLabel());
	}

	@Override
	public String toString() {
		return getReferenceAndLabel();
	}

	@Override
	public boolean isEditable() {
		if (isCompleted()) return false;
		if (!getProject().isProductOwner(Scope.get().getComponent(Auth.class).getUser())) return false;
		return true;
	}

	@Override
	public boolean isPlanningEditable() {
		if (isCompleted()) return false;
		return true;
	}

	@Override
	public boolean isRetrospectiveEditable() {
		if (!getProject().isScrumMaster(Scope.get().getComponent(Auth.class).getUser())) return false;
		return true;
	}

	@Override
	public boolean isReviewEditable() {
		if (!getProject().isProductOwner(Scope.get().getComponent(Auth.class).getUser())) return false;
		return true;
	}

	@Override
	public boolean isDatesEditable() {
		if (isCompleted()) return false;
		if (!getProject().isProductOwner(Scope.get().getComponent(Auth.class).getUser())) return false;
		return true;
	}

	@Override
	public String getGoalTemplate() {
		return Scope.get().getComponent(Wiki.class).getTemplate("sprint.goal");
	}

	@Override
	public String getPlanningNoteTemplate() {
		return Scope.get().getComponent(Wiki.class).getTemplate("sprint.planning");
	}

	@Override
	public String getRetrospectiveNoteTemplate() {
		return Scope.get().getComponent(Wiki.class).getTemplate("sprint.retrospective");
	}

	@Override
	public String getReviewNoteTemplate() {
		return Scope.get().getComponent(Wiki.class).getTemplate("sprint.review");
	}

	public boolean isCurrent() {
		return getProject().isCurrentSprint(this);
	}

	public static final Comparator<Sprint> END_DATE_COMPARATOR = new Comparator<Sprint>() {

		@Override
		public int compare(Sprint a, Sprint b) {
			return Utl.compare(a.getEnd(), b.getEnd());
		}

	};

	public static final Comparator<Sprint> END_DATE_REVERSE_COMPARATOR = new Comparator<Sprint>() {

		@Override
		public int compare(Sprint a, Sprint b) {
			return Utl.compare(b.getEnd(), a.getEnd());
		}

	};

	@Override
	public Widget createForumItemWidget() {
		String label = isCurrent() ? "Sprint Backlog" : "Sprint";
		return new HyperlinkWidget(new ShowEntityAction(isCurrent() ? WhiteboardWidget.class
				: SprintHistoryWidget.class, this, label));
	}

	@Override
	public String getReference() {
		return REFERENCE_PREFIX + getNumber();
	}

	private transient LengthInDaysModel lengthInDaysModel;

	public LengthInDaysModel getLengthInDaysModel() {
		if (lengthInDaysModel == null) lengthInDaysModel = new LengthInDaysModel();
		return lengthInDaysModel;
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

	public Comparator<Task> getTasksOrderComparator() {
		if (tasksOrderComparator == null) tasksOrderComparator = new Comparator<Task>() {

			@Override
			public int compare(Task a, Task b) {
				Requirement ar = a.getRequirement();
				Requirement br = b.getRequirement();
				if (ar != br) return getRequirementsOrderComparator().compare(ar, br);
				List<String> order = ar.getTasksOrderIds();
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
		return tasksOrderComparator;
	}

	protected class LengthInDaysModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

		@Override
		public String getId() {
			return "Sprint_lengthInDays";
		}

		@Override
		public java.lang.Integer getValue() {
			Integer length = getLengthInDays();
			return length == null || length <= 0 ? null : length;
		}

		@Override
		public void setValue(java.lang.Integer value) {
			setLengthInDays(value);
		}

		@Override
		public void increment() {
			Integer length = getValue();
			if (length == null) length = 0;
			setLengthInDays(length + 1);
		}

		@Override
		public void decrement() {
			Integer lenght = getValue();
			if (lenght == null || lenght < 2) return;
			setLengthInDays(lenght - 1);
		}

		@Override
		public boolean isEditable() {
			return Sprint.this.isEditable();
		}

		@Override
		public boolean isMandatory() {
			return true;
		}

		@Override
		public String getTooltip() {
			return "The lenght of the sprint in days.";
		}

		@Override
		protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
			super.onChangeValue(oldValue, newValue);
			addUndo(this, oldValue);
		}

	}

	private transient ATextEditorModel completedRequirementLabelsModel;

	public ATextEditorModel getCompletedRequirementLabelsModel() {
		if (completedRequirementLabelsModel == null) completedRequirementLabelsModel = new ATextEditorModel() {

			@Override
			public String getValue() {
				StringBuilder sb = new StringBuilder();
				List<StoryInfo> stories = SprintHistoryHelper.parseRequirementsAndTasks(getCompletedRequirementsData());
				for (StoryInfo story : stories) {
					sb.append("\n* ").append(story.getReference()).append(" ").append(story.getLabel());
					sb.append(" ''").append(story.getEstimatedWorkAsString()).append(", ")
							.append(story.getBurnedWorkAsString()).append("''");
					for (TaskInfo task : story.getTasks()) {
						sb.append("\n  * ").append(task.getReference()).append(" ").append(task.getLabel());
						sb.append(" ''").append(task.getBurnedWork()).append(" hrs.''");
					}
				}
				return sb.toString();
			}

			@Override
			public void setValue(String value) {}

			@Override
			public boolean isEditable() {
				return false;
			}
		};
		return completedRequirementLabelsModel;
	}

	public String getReferenceAndLabel() {
		return getReference() + " " + getLabel();
	}
}
