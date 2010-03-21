package scrum.client.admin;

import ilarkesto.core.scope.Scope;
import scrum.client.ComponentManager;
import scrum.client.DataTransferObject;
import scrum.client.ScrumScopeManager;
import scrum.client.ServerDataReceivedListener;
import scrum.client.workspace.Ui;

public class Auth extends GAuth implements ServerDataReceivedListener {

	private ComponentManager cm = ComponentManager.get();
	private User user;

	public void onServerDataReceived(DataTransferObject data) {
		if (data.isUserSet()) {
			user = dao.getUser(data.getUserId());
			log.info("User logged in:", user);
			cm.getEventBus().fireLogin();
		}
	}

	public void logout() {
		log.info("Logging out");
		Scope.get().getComponent(Ui.class).lock("Logging out..."); // TODO dependency
		user = null;
		ScrumScopeManager.destroyUserScope();
		app.callLogout();
		dao.clearAllEntities();
		publicWorkspaceWidgets.activate();
	}

	public boolean isUserLoggedIn() {
		return user != null;
	}

	public User getUser() {
		return user;
	}

}