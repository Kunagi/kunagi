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

import scrum.client.common.TooltipBuilder;

public class UnclaimTaskAction extends GReopenTaskAction {

	public UnclaimTaskAction(Task task) {
		super(task);
	}

	@Override
	public String getLabel() {
		return "Unclaim";
	}

	@Override
	public void updateTooltip(TooltipBuilder tb) {
		tb.setText("Unclaim ownership for this Task.");
		if (!getCurrentProject().isTeamMember(getCurrentUser())) {
			tb.addRemark(TooltipBuilder.NOT_TEAM);
		} else {
			if (task.isClosed()) tb.addRemark("Task is already closed.");
		}
	}

	@Override
	public boolean isExecutable() {
		if (task.isClosed() || !task.isOwnerSet()) return false;
		if (!getCurrentProject().isTeamMember(getCurrentUser())) return false;
		return true;
	}

	@Override
	public boolean isPermitted() {
		return true;
	}

	@Override
	protected void onExecute() {
		task.setUnOwned();
		addUndo(new Undo());
	}

	class Undo extends ALocalUndo {

		@Override
		public String getLabel() {
			return "Undo Unclaim " + task.getReference() + " " + task.getLabel();
		}

		@Override
		protected void onUndo() {
			task.claim();
		}

	}

}
