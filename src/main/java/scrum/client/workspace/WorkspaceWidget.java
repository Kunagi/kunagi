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

import ilarkesto.core.logging.Log;
import ilarkesto.gwt.client.Gwt;
import ilarkesto.gwt.client.LockWidget;
import ilarkesto.gwt.client.SwitcherWidget;
import ilarkesto.gwt.client.bootstrap.NavbarWidget;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

import scrum.client.common.AScrumWidget;

public class WorkspaceWidget extends AScrumWidget {

	private static final Log LOG = Log.get(WorkspaceWidget.class);

	public static final int HEADER_HEIGHT = 25;

	private LockWidget locker;
	private LockInfoWidget lockInfo;
	private SwitcherWidget sidebar;
	private SwitcherWidget workarea = new SwitcherWidget(false);

	@Override
	protected Widget onInitialization() {

		lockInfo = new LockInfoWidget();

		HeaderWidget header = new HeaderWidget();
		SimplePanel workspaceHeader = Gwt.createDiv("Workspace-header", header);

		sidebar = new SwitcherWidget(false);
		sidebar.addStyleName("Workspace-sidebar");

		workarea.addStyleName("Workspace-workarea");

		HorizontalPanel workspaceBody = Gwt.createHorizontalPanel(10, sidebar, workarea);
		workspaceBody.setCellWidth(sidebar, "200px");

		FlowPanel workspace = Gwt.createFlowPanel(new NavbarWidget(), workspaceHeader, workspaceBody);
		workspace.setStyleName("Workspace");

		locker = new LockWidget(workspace);

		return locker;
	}

	public void abort(String messageHtml) {
		lockInfo.showBug(messageHtml);
		locker.lock(lockInfo);
	}

	public void lock(String message) {
		initialize();
		lockInfo.showWait(message);
		locker.lock(lockInfo);
	}

	public void lock(Widget widget) {
		initialize();
		locker.lock(widget);
	}

	public void unlock() {
		locker.unlock();
	}

	public void showError(String message) {
		final DialogBox db = new DialogBox();
		db.setSize("200", "150");
		db.setPopupPosition(100, 100);

		FlowPanel panel = new FlowPanel();
		Label text = new Label(message);
		panel.add(text);

		Button close = new Button("close");
		close.addClickListener(new ClickListener() {

			@Override
			public void onClick(Widget sender) {
				db.hide();
			}
		});
		panel.add(close);

		db.add(panel);
		db.show();
	}

	public SwitcherWidget getWorkarea() {
		return workarea;
	}

	public SwitcherWidget getSidebar() {
		return sidebar;
	}

}
