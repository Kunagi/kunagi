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

import ilarkesto.gwt.client.ButtonWidget;
import ilarkesto.gwt.client.Gwt;

import com.google.gwt.user.client.ui.Widget;

import scrum.client.ScrumGwt;
import scrum.client.common.AScrumWidget;
import scrum.client.common.BlockListWidget;
import scrum.client.common.UserGuideWidget;
import scrum.client.project.Requirement;
import scrum.client.workspace.PagePanel;

public class SprintBacklogWidget extends AScrumWidget {

	private BlockListWidget<Requirement> requirementList;
	private Sprint sprint;

	@Override
	protected Widget onInitialization() {
		sprint = getCurrentSprint();

		requirementList = new BlockListWidget<Requirement>(RequirementInSprintBlock.FACTORY);
		requirementList.setAutoSorter(sprint.getRequirementsOrderComparator());

		PagePanel page = new PagePanel();
		page.addHeader("Stories in this Sprint", new ButtonWidget(new PullNextRequirementAction(sprint)));
		page.addSection(requirementList);
		page.addHeader("Sprint Properties");
		page.addSection(Gwt.createFlowPanel(new SprintWidget(sprint),
			ScrumGwt.createPdfLink("Sprint Backlog as PDF", "sprintBacklog", sprint),
			ScrumGwt.createPdfLink("Story Cards as PDF", "sprintStorysCards", sprint)));
		page.addSection(new UserGuideWidget(getLocalizer().views().sprintBacklog(),
				getCurrentProject().getCurrentSprint().getRequirements().size() < 3,
				getCurrentUser().getHideUserGuideSprintBacklogModel()));
		return page;
	}

	@Override
	protected void onUpdate() {
		if (sprint != getCurrentSprint()) reset();
		requirementList.setObjects(getCurrentSprint().getRequirements());
		super.onUpdate();
	}

	@Override
	protected boolean isResetRequired() {
		return sprint != getCurrentSprint();
	}

	public void selectRequirement(Requirement r) {
		requirementList.showObject(r);
	}

	public void selectTask(Task task) {
		update();
		RequirementInSprintBlock rBlock = (RequirementInSprintBlock) requirementList.getBlock(task.getRequirement());
		requirementList.extendBlock(rBlock, true);
		rBlock.selectTask(task);
	}

}
