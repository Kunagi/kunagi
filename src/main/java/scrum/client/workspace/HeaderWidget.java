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
package scrum.client.workspace;

import ilarkesto.core.base.Utl;
import ilarkesto.core.scope.Scope;
import ilarkesto.gwt.client.DropdownMenuButtonWidget;
import ilarkesto.gwt.client.Gwt;
import ilarkesto.gwt.client.HyperlinkWidget;
import ilarkesto.gwt.client.TableBuilder;
import ilarkesto.gwt.client.undo.UndoButtonWidget;

import java.util.List;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

import scrum.client.ApplicationInfo;
import scrum.client.ScrumScopeManager;
import scrum.client.admin.LogoutAction;
import scrum.client.common.AScrumWidget;
import scrum.client.project.ChangeProjectAction;
import scrum.client.project.Project;
import scrum.client.search.SearchInputWidget;
import scrum.client.undo.Undo;

public class HeaderWidget extends AScrumWidget {

	private SimplePanel wrapper;
	private Label title;
	private UndoButtonWidget undoButton;
	private DropdownMenuButtonWidget switchProjectButton;
	private SearchInputWidget search;
	private CommunicationIndicatorWidget status;

	@Override
	protected Widget onInitialization() {

		title = new Label("");
		title.setStyleName("HeaderWidget-title");

		status = new CommunicationIndicatorWidget();

		undoButton = new UndoButtonWidget();

		switchProjectButton = new DropdownMenuButtonWidget();
		switchProjectButton.setLabel("Switch Project");

		search = new SearchInputWidget();

		wrapper = Gwt.createDiv("HeaderWidget", title);
		return wrapper;
	}

	private HTML createLinksHtml() {
		StringBuilder sb = new StringBuilder();
		sb.append("<a href='http://kunagi.org/support.html' target='_blank'>Support/Feedback</a>");
		if (getAuth().isUserLoggedIn() && getCurrentUser().isAdmin())
			sb.append(" <a href='admin.html' target='_blank'>Administration/Monitoring</a>");
		return new HTML(sb.toString());
	}

	@Override
	protected void onUpdate() {
		boolean projectOpen = ScrumScopeManager.isProjectScope();

		undoButton.setUndoManager(null);
		Widget upgrade = null;

		ApplicationInfo applicationInfo = getApp().getApplicationInfo();
		if (applicationInfo != null) {
			title.setTitle(applicationInfo.getVersionDescription());
			if (applicationInfo.isNewReleaseAvailable()) {
				upgrade = createUpgrade(applicationInfo);
			}
		}

		if (projectOpen) {
			switchProjectButton.clear();
			switchProjectButton.addAction("ProjectSelectorLink", new CloseProjectAction());
			switchProjectButton.addSeparator();
			List<Project> projects = Utl.sort(Project.listAll(), Project.LAST_OPENED_COMPARATOR);
			for (Project p : projects) {
				if (p == getCurrentProject()) continue;
				switchProjectButton.addAction("QuickLinks", new ChangeProjectAction(p));
			}
		}

		TableBuilder tb = new TableBuilder();
		tb.setCellPadding(2);
		tb.setColumnWidths("70px", "30px", "200px", "", "", "60px", "100px", "150px", "50px");
		Widget searchWidget = projectOpen ? search : Gwt.createEmptyDiv();
		Widget undoWidget = projectOpen ? undoButton : Gwt.createEmptyDiv();
		// Widget changeProjectWidget = projectOpen ? new HyperlinkWidget(new ChangeProjectAction()) : Gwt
		// .createEmptyDiv();
		Widget changeProjectWidget = projectOpen ? switchProjectButton : Gwt.createEmptyDiv();
		tb.add(createLogo(), status, upgrade, searchWidget, createLinksHtml(), undoWidget, changeProjectWidget,
			createCurrentUserWidget(), new HyperlinkWidget(new LogoutAction()));
		wrapper.setWidget(tb.createTable());

		super.onUpdate();
	}

	private Widget createCurrentUserWidget() {
		boolean loggedIn = getAuth().isUserLoggedIn();
		if (!loggedIn) return Gwt.createEmptyDiv();

		ProjectWorkspaceWidgets widgets = Scope.get().getComponent(ProjectWorkspaceWidgets.class);
		if (!ScrumScopeManager.isProjectScope()) return new Label(createCurrentUserText());

		ScrumNavigatorWidget.SwitchAction action = widgets.getSidebar().getNavigator()
				.createSwitchAction(widgets.getProjectUserConfig());
		action.setLabel(createCurrentUserText());
		return new HyperlinkWidget(action);
	}

	private String createCurrentUserText() {
		boolean loggedIn = getAuth().isUserLoggedIn();
		StringBuilder text = new StringBuilder();
		if (loggedIn) {
			text.append(getCurrentUser().getName());
			if (ScrumScopeManager.isProjectScope()) {
				text.append(getCurrentProject().getUsersRolesAsString(getCurrentUser(), " (", ")"));
				text.append(" @ " + getCurrentProject().getLabel());
				undoButton.setUndoManager(Scope.get().getComponent(Undo.class).getManager());
			}
		}
		return text.toString();
	}

	private Widget createLogo() {
		// SimplePanel div = Gwt.createDiv("HeaderWidget-logo", Img.bundle.logo25().createImage());
		SimplePanel div = Gwt.createDiv("HeaderWidget-logo", new Image("img/logo25.png"));
		ApplicationInfo applicationInfo = getApp().getApplicationInfo();
		if (applicationInfo != null) div.setTitle(applicationInfo.getVersionDescription());
		return div;
	}

	private Widget createUpgrade(ApplicationInfo ai) {
		String info = "You are using Kunagi release " + ai.getRelease() + " while release " + ai.getCurrentRelease()
				+ " is available.";
		return new HTML(
				"<a href=\"http://kunagi.org/download.html\" target=\"_blank\"><img src=\"newReleaseAvailable.png\" alt=\"Upgrade\" width=\"16px\" height=\"16px\" title=\""
						+ info + "\" style=\"margin-top: 2px;\"></a>");
	}

}
