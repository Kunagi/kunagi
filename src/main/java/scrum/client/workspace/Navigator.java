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

import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.scope.Scope;
import ilarkesto.gwt.client.AGwtEntity;
import ilarkesto.gwt.client.Gwt;

import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Widget;

import scrum.client.ScrumGwt;
import scrum.client.ScrumScopeManager;
import scrum.client.admin.User;
import scrum.client.collaboration.ForumSupport;
import scrum.client.communication.TouchLastActivityServiceCall;
import scrum.client.project.Project;
import scrum.client.project.SelectProjectServiceCall;
import scrum.client.search.SearchInputWidget;
import scrum.client.search.SearchResultsWidget;
import scrum.client.workspace.history.HistoryToken;

public class Navigator extends GNavigator {

	private static final char SEPARATOR = Gwt.HISTORY_TOKEN_SEPARATOR;

	public static enum Mode {
		USER, PROJECT
	}

	private HistoryToken historyToken;
	private Mode currentMode;
	private SearchInputWidget search;

	@Override
	public void initialize() {
		historyToken = new HistoryToken(this);
	}

	public void evalHistoryToken(String token) {
		historyToken.evalHistoryToken(token);
	}

	public static String createToken(String projectId, String page, String entityId) {
		StringBuilder sb = new StringBuilder();
		sb.append("project=").append(projectId);

		if (!Str.isBlank(page)) sb.append(SEPARATOR).append("page=").append(page);

		if (!Str.isBlank(entityId)) sb.append(SEPARATOR).append("entity=").append(entityId);

		String token = sb.toString();
		return token;
	}

	public void onProjectChanged(String projectId) {
		if (projectId == null) {
			showUserMode(historyToken.getPage());
		} else {
			try {
				showProject(projectId, historyToken.getPage(), historyToken.getEntityId());
			} catch (Exception ex) {
				log.error("Opening project failed:", projectId, ex);
				showUserMode(historyToken.getPage());
			}
		}
	}

	public void onPageOrEntityChanged() {
		showPageAndEntity();
	}

	public void start() {
		evalHistoryToken(History.getToken());
		if (!historyToken.isProjectIdSet()) {
			User user = auth.getUser();
			Project project = user.getCurrentProject();
			if (project == null || user.isAdmin()) {
				gotoProjectSelector();
			} else {
				gotoProject(project.getId());
			}
		}
	}

	public void gotoProjectSelector() {
		History.newItem("projectSelector", true);
	}

	public void gotoProject(String projectId) {
		History.newItem(createToken(projectId, HistoryToken.START_PAGE, null), true);
	}

	public void gotoCurrentProjectSearch() {
		showPageAndEntity(Page.getPageName(SearchResultsWidget.class), null);
	}

	private void showProject(String projectId, String page, String entityId) {
		Project project = Scope.get().getComponent(Project.class);
		if (project != null && !projectId.equals(project.getId())) {
			// currently other project selected

			ScrumScopeManager.destroyProjectScope();
			showProject(projectId, page, entityId);
			// History.newItem(createToken(projectId, page, entityId), true);
			return;
		}

		if (project == null) {
			project = Project.getById(projectId);
			if (project == null) throw new RuntimeException("Project does not exist: " + projectId);
			acitvateProjectMode(project, page, entityId);
			return;
		}

		showPageAndEntity(page, entityId);
	}

	private void acitvateProjectMode(final Project project, final String page, final String entityId) {
		assert project != null;

		if (currentMode == Mode.PROJECT) ScrumScopeManager.destroyProjectScope();

		log.info("Activating PROJECT mode");
		Scope.get().getComponent(Ui.class).lock("Loading " + project.getLabel() + "...");
		new SelectProjectServiceCall(project.getId()).execute(new Runnable() {

			@Override
			public void run() {
				ScrumScopeManager.createProjectScope(project);
				currentMode = Mode.PROJECT;
				Scope.get().getComponent(ProjectWorkspaceWidgets.class).projectDataReceived();
				showPageAndEntity(page, entityId);
			}
		});
	}

	private void showPageAndEntity() {
		showPageAndEntity(historyToken.getPage(), historyToken.getEntityId());
	}

	private void showPageAndEntity(String page, String entityId) {
		new TouchLastActivityServiceCall().execute();
		ProjectWorkspaceWidgets workspace = Scope.get().getComponent(ProjectWorkspaceWidgets.class);

		if (historyToken.getPage() == null && page == null) page = HistoryToken.START_PAGE;

		if (page != null) workspace.showPage(page);

		if (entityId != null) {
			if (ScrumGwt.isEntityReferenceOrWikiPage(entityId)) {
				workspace.showEntityByReference(entityId);
			} else {
				if ("Forum".equals(historyToken.getPage())) {
					ForumSupport entity = (ForumSupport) AEntity.getById(entityId);
					workspace.showForum(entity);
				} else {
					workspace.showEntityById(entityId);
				}
			}
		}

		// if (search != null && !Page.getPageName(SearchResultsWidget.class).equals(historyToken.getPage()))
		// {
		// search.clear();
		// }
	}

	private void showUserMode(String page) {
		if (currentMode == Mode.PROJECT) {
			ScrumScopeManager.destroyProjectScope();
		}

		log.info("Activating USER mode");
		UsersWorkspaceWidgets usersWorkspaceWidgets = Scope.get().getComponent(UsersWorkspaceWidgets.class);
		usersWorkspaceWidgets.activate(page);
		currentMode = Mode.USER;
	}

	public static String getPageHref(String page) {
		return '#' + getPageHistoryToken(page);
	}

	public static String getPageHistoryToken(String page) {
		StringBuilder sb = new StringBuilder();
		Project project = Scope.get().getComponent(Project.class);
		if (project != null) sb.append("project=").append(project.getId()).append(SEPARATOR);
		sb.append("page=").append(page);
		return sb.toString();
	}

	public static String getPageHref(Class<? extends Widget> pageClass) {
		return getPageHref(Page.getPageName(pageClass));
	}

	public static String getEntityHistoryToken(AGwtEntity entity) {
		String page = null;
		ProjectWorkspaceWidgets workspace = Scope.get().getComponent(ProjectWorkspaceWidgets.class);
		if (workspace != null) page = workspace.getPageForEntity(entity);
		String id = entity.getId();
		return getEntityHistoryToken(page, id);
	}

	public static String getEntityHref(AGwtEntity entity) {
		String page = null;
		ProjectWorkspaceWidgets workspace = Scope.get().getComponent(ProjectWorkspaceWidgets.class);
		if (workspace != null) page = workspace.getPageForEntity(entity);
		String id = entity.getId();
		return '#' + getEntityHistoryToken(page, id);
	}

	public static String getEntityHref(String entityId) {
		return '#' + getEntityHistoryToken(null, entityId);
	}

	public static String getEntityHistoryToken(String page, String entityId) {
		StringBuilder sb = new StringBuilder();

		Project project = Scope.get().getComponent(Project.class);
		if (project != null) sb.append("project=").append(project.getId()).append(SEPARATOR);

		Navigator navigator = Scope.get().getComponent(Navigator.class);
		if (page == null) {
			ProjectWorkspaceWidgets workspace = Scope.get().getComponent(ProjectWorkspaceWidgets.class);
			if (workspace != null) page = workspace.getPageForEntity(entityId);
			if (page == null && navigator != null) page = navigator.historyToken.getPage();
		}
		if (page != null) sb.append("page=").append(page).append(SEPARATOR);

		sb.append("entity=").append(entityId);
		return sb.toString();
	}

	public boolean isToggleMode() {
		return historyToken.isToggle();
	}

	public void updateHistoryTokenWithoutChangingUi(String page, AGwtEntity entity) {
		historyToken.updatePageAndEntity(page, entity, false);
	}

	public void gotoPageWithEntity(String page, AGwtEntity entity) {
		historyToken.updatePageAndEntity(page, entity, true);
	}

	public void setSearch(SearchInputWidget search) {
		this.search = search;
	}

}