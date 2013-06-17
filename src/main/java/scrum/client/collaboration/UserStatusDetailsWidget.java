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
package scrum.client.collaboration;

import ilarkesto.core.scope.Scope;
import ilarkesto.gwt.client.AFieldValueWidget;
import ilarkesto.gwt.client.TableBuilder;

import java.util.List;

import scrum.client.ScrumGwt;
import scrum.client.admin.ProjectUserConfig;
import scrum.client.admin.User;
import scrum.client.common.AScrumWidget;
import scrum.client.issues.Issue;
import scrum.client.project.Project;
import scrum.client.sprint.Task;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class UserStatusDetailsWidget extends AScrumWidget {

	private User user;

	public UserStatusDetailsWidget(User user) {
		super();
		this.user = user;
	}

	@Override
	protected Widget onInitialization() {
		final Project project = Scope.get().getComponent(Project.class);
		TableBuilder tb = ScrumGwt.createFieldTable();
		tb.setColumnWidths(40);
		if (user.getFullName() != null) tb.addRow(new Label(user.getFullName()), 2);
		if (user != getCurrentUser()) {
			tb.addFieldRow("Idle", new AFieldValueWidget() {

				@Override
				protected void onUpdate() {
					ProjectUserConfig config = project.getUserConfig(user);
					setText(config.getIdleTimeAsString());
				}
			});
		}
		tb.addFieldRow("Tasks", new AFieldValueWidget() {

			@Override
			protected void onUpdate() {
				List<Task> tasks = project.getCurrentSprint().getClaimedTasks(user);
				setContent(ScrumGwt.createReferencesWidget(tasks));
			}
		});
		tb.addFieldRow("Issues", new AFieldValueWidget() {

			@Override
			protected void onUpdate() {
				List<Issue> issues = project.getClaimedBugs(user);
				setContent(ScrumGwt.createReferencesWidget(issues));
			}
		});
		tb.addFieldRow("Work left", new AFieldValueWidget() {

			@Override
			protected void onUpdate() {
				List<Task> tasks = project.getCurrentSprint().getClaimedTasks(user);
				setText(Integer.toString(Task.sumRemainingWork(tasks)));
			}
		});
		return tb.createTable();
	}

}
