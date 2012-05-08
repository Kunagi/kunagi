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

import scrum.client.common.TooltipBuilder;

public class DeleteSubjectAction extends GDeleteSubjectAction {

	public DeleteSubjectAction(scrum.client.collaboration.Subject subject) {
		super(subject);
	}

	@Override
	public String getLabel() {
		return "Delete";
	}

	@Override
	protected void updateTooltip(TooltipBuilder tb) {
		tb.setText("Delete this Subject and all its comments permanently.");
		if (!subject.getProject().isScrumMaster(getCurrentUser())) tb.addRemark(TooltipBuilder.NOT_SCRUMMASTER);
	}

	@Override
	public boolean isExecutable() {
		return true;
	}

	@Override
	public boolean isPermitted() {
		if (!getCurrentProject().isScrumMaster(getCurrentUser())) return false;
		return true;
	}

	@Override
	protected void onExecute() {
		getDao().deleteSubject(subject);
		addUndo(new Undo());
	}

	class Undo extends ALocalUndo {

		@Override
		public String getLabel() {
			return "Undo Delete " + subject.getReference() + " " + subject.getLabel();
		}

		@Override
		protected void onUndo() {
			getDao().createSubject(subject);
		}

	}

}
