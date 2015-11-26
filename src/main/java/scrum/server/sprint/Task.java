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
package scrum.server.sprint;

import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.TransferBus;

import scrum.client.common.LabelSupport;
import scrum.client.common.ReferenceSupport;
import scrum.server.admin.User;
import scrum.server.common.Numbered;
import scrum.server.impediments.Impediment;
import scrum.server.project.Project;

public class Task extends GTask implements Numbered, ReferenceSupport, LabelSupport {

	@Override
	public void collectPassengers(TransferBus bus) {
		super.collectPassengers(bus);
		bus.add(getRequirement());
	}

	public String getImpedimentLabelsAsText() {
		if (isImpedimentsEmpty()) return null;
		StringBuilder sb = new StringBuilder();
		for (Impediment impediment : getImpediments()) {
			if (impediment.isClosed()) continue;
			if (sb.length() > 0) sb.append(", ");
			sb.append(impediment.getReference() + " " + impediment.getLabel());
		}
		return sb.toString();
	}

	public void appendToDescription(String text) {
		if (Str.isBlank(text)) return;
		String description = getDescription();
		if (Str.isBlank(description)) {
			description = text;
		} else {
			description += "\n\n" + text;
		}
		setDescription(description);
	}

	public String getReferenceAndLabel() {
		return getReference() + " " + getLabel();
	}

	@Override
	public String getReference() {
		return scrum.client.sprint.Task.REFERENCE_PREFIX + getNumber();
	}

	@Override
	public void updateNumber() {
		if (getNumber() == 0) setNumber(getRequirement().getProject().generateTaskNumber());
	}

	public boolean isProject(Project project) {
		return getRequirement().isProject(project);
	}

	public boolean isClosed() {
		return getRemainingWork() == 0;
	}

	public boolean isSprint(Sprint sprint) {
		if (isClosedInPastSprintSet()) return false;
		return getRequirement().isSprint(sprint);
	}

	public void reset() {
		setOwner(null);
		setBurnedWork(0);
	}

	@Override
	public void onEnsureIntegrity() {
		super.onEnsureIntegrity();
		updateNumber();
		if (getRemainingWork() < 0) setRemainingWork(0);
		if (getBurnedWork() < 0) setBurnedWork(0);
	}

	public Project getProject() {
		return getRequirement().getProject();
	}

	@Override
	public boolean isVisibleFor(User user) {
		return getProject().isVisibleFor(user);
	}

	@Override
	public String asString() {
		return getReferenceAndLabel();
	}

}
