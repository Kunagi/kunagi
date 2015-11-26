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

import ilarkesto.core.base.ChangeIndicator;
import ilarkesto.core.base.Utl;
import ilarkesto.gwt.client.Gwt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import scrum.client.common.AScrumWidget;
import scrum.client.core.EventBus;
import scrum.client.project.Requirement;
import scrum.client.workspace.PagePanel;

import com.google.gwt.user.client.ui.Widget;

public class SprintHistoryWidget extends AScrumWidget {

	private Map<Sprint, SprintHistorySprintWidget> sprintWidgets = new HashMap<Sprint, SprintHistorySprintWidget>();
	private ChangeIndicator changeIndicator = new ChangeIndicator();
	private PagePanel page = new PagePanel();

	@Override
	protected Widget onInitialization() {
		new RequestHistoryServiceCall().execute(new Runnable() {

			@Override
			public void run() {
				update();
			}
		});
		return page;
	}

	@Override
	protected void onUpdate() {
		List<Sprint> sprints = getCurrentProject().getCompletedSprintsInReverseOrder();
		if (changeIndicator.update(sprints)) {
			page.clear();
			for (Sprint sprint : sprints) {
				page.addHeader(sprint.getReferenceAndLabel() + " | " + sprint.getBegin().format() + " - "
						+ sprint.getEnd());

				SprintHistorySprintWidget widget = sprintWidgets.get(sprint);
				if (widget == null) {
					widget = new SprintHistorySprintWidget(sprint);
					sprintWidgets.put(sprint, widget);
				}

				page.addSection(widget);
			}
		}
		super.onUpdate();
	}

	private Sprint getSprint(Requirement requirement) {
		List<Sprint> sprints = Utl.sort(Sprint.listAll(), Sprint.END_DATE_COMPARATOR);
		for (Sprint sprint : sprints) {
			SprintReport report = sprint.getSprintReport();
			if (report == null) {
				continue; // TODO legacy workaround
			}
			if (report.containsCompletedRequirement(requirement) || report.containsRejectedRequirement(requirement))
				return sprint;
		}
		return null;
	}

	public boolean select(final Task task) {
		final Sprint sprint = getSprint(task.getRequirement());
		if (sprint == null) {
			new RequestHistoryServiceCall().execute(new Runnable() {

				@Override
				public void run() {
					EventBus.get().visibleDataChanged();
					select(task);
				}
			});
			return false;
		}

		if (!sprint.historyLoaded) {
			new RequestHistorySprintServiceCall(sprint.getId()).execute(new Runnable() {

				@Override
				public void run() {
					sprint.historyLoaded = true;
					EventBus.get().visibleDataChanged();
					SprintHistorySprintWidget sprintHistorySprintWidget = sprintWidgets.get(sprint);
					sprintHistorySprintWidget.selectTask(task);
				}
			});
			return false;
		}

		SprintHistorySprintWidget sprintHistorySprintWidget = sprintWidgets.get(sprint);
		return sprintHistorySprintWidget.selectTask(task);
	}

	public boolean select(final Requirement requirement) {
		final Sprint sprint = getSprint(requirement);
		if (sprint == null) {
			new RequestHistoryServiceCall().execute(new Runnable() {

				@Override
				public void run() {
					EventBus.get().visibleDataChanged();
					select(requirement);
				}
			});
			return false;
		}

		if (!sprint.historyLoaded) {
			new RequestHistorySprintServiceCall(sprint.getId()).execute(new Runnable() {

				@Override
				public void run() {
					sprint.historyLoaded = true;
					EventBus.get().visibleDataChanged();
					SprintHistorySprintWidget sprintHistorySprintWidget = sprintWidgets.get(sprint);
					sprintHistorySprintWidget.selectRequirement(requirement);
				}
			});
			return false;
		}

		SprintHistorySprintWidget sprintHistorySprintWidget = sprintWidgets.get(sprint);
		return sprintHistorySprintWidget.selectRequirement(requirement);
	}

	public boolean select(Sprint sprint) {
		update();
		Gwt.scrollTo(sprintWidgets.get(sprint));
		return true;
	}
}
