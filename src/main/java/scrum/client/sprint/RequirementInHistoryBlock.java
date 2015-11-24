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

import java.util.ArrayList;
import java.util.List;

import scrum.client.common.ABlockWidget;
import scrum.client.common.BlockHeaderWidget;
import scrum.client.common.BlockListWidget;
import scrum.client.common.BlockWidgetFactory;
import scrum.client.img.Img;
import scrum.client.journal.ActivateChangeHistoryAction;
import scrum.client.journal.ChangeHistoryWidget;
import scrum.client.project.Requirement;
import scrum.client.project.RequirementWidget;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

public class RequirementInHistoryBlock extends ABlockWidget<Requirement> {

	private Sprint sprint;
	private BlockListWidget<Task> taskList;
	private RequirementWidget requirementWidget;
	private ChangeHistoryWidget changeHistoryWidget;

	public RequirementInHistoryBlock(Sprint sprint) {
		this.sprint = sprint;
	}

	@Override
	protected void onInitializationHeader(BlockHeaderWidget header) {
		Requirement requirement = getObject();

		SprintReport report = sprint.getSprintReport();
		boolean completed = report.containsCompletedRequirement(requirement);
		Image statusImage = null;
		if (completed) {
			statusImage = Img.reqClosed();
			statusImage.setTitle("Completed.");
		} else {
			statusImage = Img.reqRejected();
			statusImage.setTitle("Rejected.");
		}
		header.addIconWrapper().setWidget(statusImage);
		header.addText(requirement.getHistoryLabelModel(sprint));
		header.addText(requirement.getThemesAsStringModel(), true, false);
		header.addMenuAction(new ActivateChangeHistoryAction(requirement));

		header.setDragHandle(requirement.getReference());
	}

	@Override
	protected void onUpdateHeader(BlockHeaderWidget header) {}

	@Override
	protected Widget onExtendedInitialization() {
		Requirement requirement = getObject();
		SprintReport report = sprint.getSprintReport();

		List<Task> tasks = new ArrayList<Task>();
		tasks.addAll(report.getOpenTasks(requirement));
		tasks.addAll(report.getClosedTasks(requirement));

		requirementWidget = new RequirementWidget(requirement, true, false, false, true, false, false, false);

		taskList = new BlockListWidget<Task>(TaskInHistoryBlock.createFactory(sprint));
		taskList.setAutoSorter(sprint.getTasksOrderComparator());
		taskList.setObjects(tasks);

		changeHistoryWidget = new ChangeHistoryWidget(requirement);

		FlowPanel panel = new FlowPanel();
		panel.add(requirementWidget);
		panel.add(taskList);
		panel.add(changeHistoryWidget);
		return panel;
	}

	@Override
	protected void onUpdateBody() {
		requirementWidget.update();
		taskList.update();
		changeHistoryWidget.update();
	}

	public boolean selectTask(Task task) {
		return taskList.showObject(task);
	}

	public static BlockWidgetFactory<Requirement> createFactory(final Sprint sprint) {
		return new BlockWidgetFactory<Requirement>() {

			@Override
			public RequirementInHistoryBlock createBlock() {
				return new RequirementInHistoryBlock(sprint);
			}
		};
	}

}
