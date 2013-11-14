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
package scrum.client.project;

import scrum.client.common.TooltipBuilder;

public class SuspendRequirementAction extends GSuspendRequirementAction {

	protected SuspendRequirementAction(Requirement requirement) {
		super(requirement);
	}

	@Override
	public String getLabel() {
		return "Delete";
	}

	@Override
	protected void updateTooltip(TooltipBuilder tb) {
		tb.setText("Delete this Story from Backlog.");
		if (!requirement.getProject().isProductOwner(getCurrentUser())) tb.addRemark(TooltipBuilder.NOT_PRODUCT_OWNER);
	}

	@Override
	public boolean isExecutable() {
		Project project = getCurrentProject();
		if (!project.getProductBacklogRequirements().contains(requirement)) return false;
		if (project.isCurrentSprint(requirement.getSprint())) return false;
		if (requirement.isSuspended()) return false;
		if (!project.isInHistory(requirement)) return false;
		return true;
	}

	@Override
	public boolean isPermitted() {
		if (!requirement.getProject().isProductOwner(getCurrentUser())) return false;
		return true;
	}

	@Override
	protected void onExecute() {
		requirement.getProject().removeRequirement(requirement);
		addUndo(new Undo());
	}

	class Undo extends ALocalUndo {

		@Override
		public String getLabel() {
			return "Undo Remove " + requirement.getReferenceAndLabel();
		}

		@Override
		protected void onUndo() {
			requirement.setSuspended(false);
			// getDao().createRequirement(requirement);
		}

	}

}
