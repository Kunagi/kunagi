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
package scrum.client.dashboard;

import ilarkesto.core.scope.Scope;
import ilarkesto.gwt.client.HyperlinkWidget;
import ilarkesto.gwt.client.TableBuilder;
import scrum.client.common.AScrumWidget;
import scrum.client.workspace.PagePanel;
import scrum.client.workspace.ProjectWorkspaceWidgets;
import scrum.client.workspace.ScrumNavigatorWidget;

import com.google.gwt.user.client.ui.Widget;

public class DashboardWidget extends AScrumWidget {

	@Override
	protected Widget onInitialization() {
		ProjectWorkspaceWidgets widgets = Scope.get().getComponent(ProjectWorkspaceWidgets.class);

		ScrumNavigatorWidget nav = widgets.getSidebar().getNavigator();

		PagePanel sprintBurndown = new PagePanel();
		sprintBurndown.addHeader("Sprint Burndown",
			new HyperlinkWidget(nav.createSwitchAction(widgets.getSprintBacklog())));
		sprintBurndown.addSection(new SprintBurndownWidget());

		PagePanel storyBurndown = new PagePanel();
		storyBurndown.addHeader("Story Burndown",
			new HyperlinkWidget(nav.createSwitchAction(widgets.getSprintBacklog())));
		storyBurndown.addSection(new StoryBurndownWidget());

		PagePanel teamsTasks = new PagePanel();
		teamsTasks.addHeader("Teams current work",
			new HyperlinkWidget(nav.createSwitchAction(widgets.getWhiteboard())),
			new HyperlinkWidget(nav.createSwitchAction(widgets.getIssueList())));
		teamsTasks.addSection(new TeamTasksWidget());
		teamsTasks.addHeader("Teams next work", new HyperlinkWidget(nav.createSwitchAction(widgets.getWhiteboard())),
			new HyperlinkWidget(nav.createSwitchAction(widgets.getIssueList())));
		teamsTasks.addSection(new UpcomingTeamTasksWidget());

		PagePanel posTasks = new PagePanel();
		posTasks.addHeader("Product Owners work",
			new HyperlinkWidget(nav.createSwitchAction(widgets.getProductBacklog())),
			new HyperlinkWidget(nav.createSwitchAction(widgets.getSprintBacklog())),
			new HyperlinkWidget(nav.createSwitchAction(widgets.getIssueList())));
		posTasks.addSection(new UpcomingPoWorkWidget());

		PagePanel impediments = new PagePanel();
		impediments.addHeader("Open Impediments",
			new HyperlinkWidget(nav.createSwitchAction(widgets.getImpedimentList())));
		impediments.addSection(new OpenImpedimentsWidget());

		PagePanel risks = new PagePanel();
		risks.addHeader("High Priority Risks", new HyperlinkWidget(nav.createSwitchAction(widgets.getRiskList())));
		risks.addSection(new HighestRisksWidget());

		PagePanel events = new PagePanel();
		events.addHeader("Latest Events", new HyperlinkWidget(nav.createSwitchAction(widgets.getProjectEventList())));
		events.addSection(new LatestEventsWidget());

		Widget left = TableBuilder.column(5, sprintBurndown, storyBurndown, teamsTasks, posTasks);
		Widget right = TableBuilder.column(5, impediments, risks, events);

		return TableBuilder.row(5, left, right);
	}

}
