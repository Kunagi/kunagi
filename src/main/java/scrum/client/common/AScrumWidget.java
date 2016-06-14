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
package scrum.client.common;

import ilarkesto.core.scope.Scope;
import ilarkesto.gwt.client.AWidget;

import scrum.client.ScrumGwtApplication;
import scrum.client.ScrumScopeManager;
import scrum.client.admin.Auth;
import scrum.client.admin.User;
import scrum.client.i18n.Localizer;
import scrum.client.project.Project;
import scrum.client.sprint.Sprint;
import scrum.client.workspace.Ui;

public abstract class AScrumWidget extends AWidget {

	// --- helper ---

	// protected static final Navigator getNavigator() {
	// return Scope.get().getComponent(Navigator.class);
	// }

	protected static final User getCurrentUser() {
		assert getAuth().isUserLoggedIn();
		return getAuth().getUser();
	}

	public static final Localizer getLocalizer() {
		return Scope.get().getComponent(Localizer.class);
	}

	protected static final Auth getAuth() {
		return Scope.get().getComponent(Auth.class);
	}

	protected static final Project getCurrentProject() {
		assert ScrumScopeManager.isProjectScope();
		return ScrumScopeManager.getProject();
	}

	protected static final Project getCurrentProjectOrNull() {
		return ScrumScopeManager.getProject();
	}

	protected static final Sprint getCurrentSprint() {
		return getCurrentProject().getCurrentSprint();
	}

	protected static final Ui getUi() {
		return Scope.get().getComponent(Ui.class);
	}

	protected static final ScrumGwtApplication getApp() {
		return (ScrumGwtApplication) Scope.get().getComponent("app");
	}
}
