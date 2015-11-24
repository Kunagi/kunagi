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
package scrum.client;

import ilarkesto.core.base.Str;
import ilarkesto.core.logging.Log;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.Entity;
import ilarkesto.core.scope.Scope;
import ilarkesto.gwt.client.AGwtApplication;
import ilarkesto.gwt.client.AGwtEntity;
import ilarkesto.gwt.client.ErrorWrapper;
import ilarkesto.gwt.client.desktop.AActivityCatalog;
import ilarkesto.gwt.client.persistence.AGwtEntityFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import scrum.client.admin.Auth;
import scrum.client.admin.LogoutServiceCall;
import scrum.client.admin.SystemMessageManager;
import scrum.client.base.UpdateEntitiesServiceCall;
import scrum.client.calendar.SimpleEvent;
import scrum.client.collaboration.Chat;
import scrum.client.collaboration.ChatMessage;
import scrum.client.collaboration.Comment;
import scrum.client.collaboration.Subject;
import scrum.client.communication.Pinger;
import scrum.client.communication.ServerErrorManager;
import scrum.client.communication.StartConversationServiceCall;
import scrum.client.core.EventBus;
import scrum.client.core.RichtextAutosaver;
import scrum.client.files.File;
import scrum.client.impediments.Impediment;
import scrum.client.issues.Issue;
import scrum.client.journal.Change;
import scrum.client.pr.BlogEntry;
import scrum.client.project.Quality;
import scrum.client.project.Requirement;
import scrum.client.release.Release;
import scrum.client.risks.Risk;
import scrum.client.sprint.Sprint;
import scrum.client.sprint.Task;
import scrum.client.workspace.Navigator;
import scrum.client.workspace.Ui;
import scrum.client.workspace.WorkspaceWidget;

import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

public class ScrumGwtApplication extends AGwtApplication<DataTransferObject> {

	public static final String LOGIN_TOKEN_COOKIE = "kunagiLoginToken";

	public static final String[] REFERENCE_PREFIXES = new String[] { Requirement.REFERENCE_PREFIX,
		Task.REFERENCE_PREFIX, Quality.REFERENCE_PREFIX, Issue.REFERENCE_PREFIX, Impediment.REFERENCE_PREFIX,
		Risk.REFERENCE_PREFIX, File.REFERENCE_PREFIX, Subject.REFERENCE_PREFIX, SimpleEvent.REFERENCE_PREFIX,
		Release.REFERENCE_PREFIX, BlogEntry.REFERENCE_PREFIX, Sprint.REFERENCE_PREFIX };

	private final Log log = Log.get(getClass());

	public ApplicationInfo applicationInfo;

	@Override
	protected void init() {
		ScrumScopeManager.initialize();

		// if (true) {
		// RootPanel.get().add(new WidgetsTesterWidget().update());
		// return;
		// }

		final WorkspaceWidget workspace = Scope.get().getComponent(Ui.class).getWorkspace();
		workspace.lock("Loading...");

		RootPanel rootPanel = RootPanel.get();
		rootPanel.getElement().getStyle().setProperty("position", "relative");
		rootPanel.add(workspace);
		ScrumJs.initialize();

		new StartConversationServiceCall().execute(new Runnable() {

			@Override
			public void run() {
				Scope.get().getComponent(Pinger.class).start();
				Scope.get().getComponent(RichtextAutosaver.class).start();
				Scope.get().getComponent(Navigator.class).start();
			}
		});

	}

	@Override
	protected void onHistoryTokenChanged(String token) {
		Scope.get().getComponent(Navigator.class).evalHistoryToken(token);
	}

	@Override
	public String getTokenForEntityActivity(Entity entity) {
		return Navigator.getEntityHistoryToken((AGwtEntity) entity);
	}

	@Override
	public AActivityCatalog createActivityCatalog() {
		return null;
	}

	@Override
	protected void onServerDataReceived(DataTransferObject data) {
		super.onServerDataReceived(data);

		if (data.applicationInfo != null) {
			applicationInfo = data.applicationInfo;
			log.debug("applicationInfo:", data.applicationInfo);
			// Scope.get().putComponent(data.applicationInfo);
		} else {
			assert applicationInfo != null;
		}

		if (data.containsEntities() || data.containsDeletedEntities()) {
			EventBus.get().visibleDataChanged();
		}

		String userId = data.getUserId();
		if (userId != null) {
			log.info("User id received:", userId);
			Scope.get().getComponent(Auth.class).setUser(userId);
		}
		Scope.get().getComponent(Pinger.class).dataReceived();
		Scope.get().getComponent(ServerErrorManager.class).handleErrors(data.getErrors());
		Scope.get().getComponent(SystemMessageManager.class).updateMessage(data.systemMessage);
	}

	@Override
	protected void onEntitiesReceived(Set<AEntity> entities) {
		super.onEntitiesReceived(entities);
		for (AEntity entity : entities) {
			if (entity instanceof ChatMessage) {
				Scope.get().getComponent(Chat.class).addChatMessage((ChatMessage) entity);
			}
			if (entity instanceof File) {
				EventBus.get().fileReceived((File) entity);
			}
			if (entity instanceof Comment) {
				((Comment) entity).getParent().updateLastModified();
			}
			if (entity instanceof Change) {
				((Change) entity).getParent().updateLastModified();
			}
		}
	}

	public ApplicationInfo getApplicationInfo() {
		return applicationInfo;
	}

	public void logout() {
		log.info("Logging out");

		Cookies.removeCookie(LOGIN_TOKEN_COOKIE);

		Scope.get().getComponent(Ui.class).lock("Logging out...");
		Scope.get().getComponent(Auth.class).logout();
		Scope.get().getComponent(Pinger.class).shutdown();

		new LogoutServiceCall().execute(new Runnable() {

			@Override
			public void run() {
				Window.Location.replace(ScrumGwt.getLoginUrl());
			}
		});

	}

	@Override
	public void handleServiceCallError(String serviceCall, List<ErrorWrapper> errors) {
		for (ErrorWrapper error : errors) {
			if ("ilarkesto.webapp.GwtConversationDoesNotExist".equals(error.getName())) {
				abort("Session timed out.");
				return;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<strong>Server service call error</strong><br>");
		sb.append("Calling service <em>").append(serviceCall).append("</em> failed.<br>");
		for (ErrorWrapper error : errors) {
			sb.append(Str.toHtml(error.toString())).append("<br>");
		}
		abort(sb.toString());
	}

	@Override
	protected void onAborted(String message) {
		super.onAborted(message);
		Scope.get().getComponent(Pinger.class).shutdown();
		Scope.get().getComponent(Ui.class).getWorkspace().abort(message);
	}

	@Override
	protected void handleUnexpectedError(Throwable ex) {
		log.error("Unexpected error", ex);
		StringBuilder sb = new StringBuilder();
		sb.append("<strong>Unexpected Error</strong><br>");
		sb.append(Str.toHtml(Str.formatException(ex)));
		abort(sb.toString());
	}

	@Override
	protected AGwtEntityFactory createEntityFactory() {
		return new GwtEntityFactory();
	}

	@Override
	public void sendChangesToServer(Collection<AEntity> modified, Collection<String> deleted,
			Map<String, Map<String, String>> modifiedProperties, Runnable callback) {
		new UpdateEntitiesServiceCall(modifiedProperties == null ? null : new ArrayList<Map<String, String>>(
				modifiedProperties.values()), deleted).execute(callback);
	}

	public static ScrumGwtApplication get() {
		return (ScrumGwtApplication) AGwtApplication.get();
	}

}
