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

import ilarkesto.core.scope.Scope;
import ilarkesto.gwt.client.Gwt;

import java.util.List;

import scrum.client.common.TooltipBuilder;
import scrum.client.project.Requirement;
import scrum.client.workspace.ProjectWorkspaceWidgets;
import scrum.client.workspace.Ui;

public class SwitchToNextSprintAction extends GSwitchToNextSprintAction {

	@Override
	public String getLabel() {
		return "Switch to next Sprint";
	}

	@Override
	protected void updateTooltip(TooltipBuilder tb) {
		tb.setText("Finish the current Sprint and replace it by the next one.");
		if (!getCurrentProject().isProductOwner(getCurrentUser())) tb.addRemark(TooltipBuilder.NOT_PRODUCT_OWNER);
	}

	@Override
	public boolean isExecutable() {
		return true;
	}

	@Override
	public boolean isPermitted() {
		if (!getCurrentProject().isProductOwner(getCurrentUser())) return false;
		return true;
	}

	@Override
	protected void onExecute() {
		Sprint sprint = getCurrentProject().getCurrentSprint();
		StringBuilder sb = new StringBuilder();

		List<Requirement> incompletedRequirements = sprint.getIncompletedRequirements();
		if (!incompletedRequirements.isEmpty()) {
			if (incompletedRequirements.size() == 1) {
				sb.append("Story ").append(incompletedRequirements.get(0).getReference())
				.append(" is not completed. It will be rejected and goes back to the product backlog.\n\n");
			} else {
				sb.append("Stories ");
				appendStories(sb, incompletedRequirements);
				sb.append(" are not completed. They will be rejected and go back to the product backlog.\n\n");
			}
		}

		List<Requirement> undecidedRequirements = sprint.getCompletedUnclosedRequirements();
		if (!undecidedRequirements.isEmpty()) {
			if (undecidedRequirements.size() == 1) {
				sb.append("Story ")
				.append(undecidedRequirements.get(0).getReference())
				.append(
					" is completed but not accepted and not rejected. It will be rejected and goes back to the product backlog.\n\n");
			} else {
				sb.append("Stories ");
				appendStories(sb, undecidedRequirements);
				sb.append(" are completed but not accepted and not rejected. They will be rejected and go back to the product backlog.\n\n");
			}
		}
		sb.append("Switch to next Sprint?");
		if (!Gwt.confirm(sb.toString())) return;

		Scope.get().getComponent(Ui.class).lock("Switching to next Sprint");
		new SwitchToNextSprintServiceCall().execute(new Runnable() {

			@Override
			public void run() {
				Scope.get().getComponent(ProjectWorkspaceWidgets.class).showProductBacklog((Requirement) null);
				Scope.get().getComponent(Ui.class).unlock();
			}
		});
	}

	public void appendStories(StringBuilder sb, List<Requirement> stories) {
		boolean first = true;
		for (Requirement req : stories) {
			if (first) {
				first = false;
			} else {
				sb.append(", ");
			}
			sb.append(req.getReference());
		}
	}
}
