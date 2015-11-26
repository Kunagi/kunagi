/*
 * Copyright 2011 Witoslaw Koczewsi <wi@koczewski.de>
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program. If not,
 * see <http://www.gnu.org/licenses/>.
 */
package scrum.client.sprint;

import ilarkesto.core.base.ChangeIndicator;
import ilarkesto.gwt.client.ButtonWidget;
import ilarkesto.gwt.client.Gwt;

import java.util.Set;

import scrum.client.ScrumGwt;
import scrum.client.common.AScrumWidget;
import scrum.client.common.BlockListWidget;
import scrum.client.project.Requirement;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class SprintHistorySprintWidget extends AScrumWidget {

	private Sprint sprint;
	private BlockListWidget<Requirement> requirementList;
	private ChangeIndicator changeIndicator = new ChangeIndicator();
	private SimplePanel wrapper;
	private boolean uiCreated;

	public SprintHistorySprintWidget(Sprint sprint) {
		super();
		this.sprint = sprint;
	}

	@Override
	protected Widget onInitialization() {
		requirementList = new BlockListWidget<Requirement>(RequirementInHistoryBlock.createFactory(sprint));

		wrapper = new SimplePanel();

		HTML pdfLink = ScrumGwt.createPdfLink("Download Report as PDF", "sprintReport", sprint);
		wrapper.setWidget(Gwt.createHorizontalPanel(10, pdfLink,
			new ButtonWidget(new LoadSprintHistoryAction(sprint)).update()));

		return wrapper;
	}

	@Override
	protected void onUpdate() {
		if (!sprint.historyLoaded) return;

		if (!uiCreated) {
			SprintReport report = sprint.getSprintReport();
			if (report != null) {
				requirementList.setAutoSorter(report.getRequirementsOrderComparator());
				Set<Requirement> allRequirements = report.getAllRequirements();
				if (changeIndicator.update(allRequirements)) {
					requirementList.setObjects(allRequirements);
				}
			}

			HTML pdfLink = ScrumGwt.createPdfLink("Download Report as PDF", "sprintReport", sprint);
			wrapper.setWidget(Gwt.createFlowPanel(new SprintWidget(sprint), requirementList, pdfLink));

			uiCreated = true;
		}

		super.onUpdate();
	}

	public boolean selectRequirement(Requirement r) {
		return requirementList.showObject(r);
	}

	public boolean selectTask(Task task) {
		update();
		RequirementInHistoryBlock rBlock = (RequirementInHistoryBlock) requirementList.getBlock(task.getRequirement());
		requirementList.extendBlock(rBlock, true);
		return rBlock.selectTask(task);
	}

}
