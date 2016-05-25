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
import ilarkesto.core.time.Date;
import ilarkesto.pdf.APdfContainerElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import scrum.server.common.APdfCreator;
import scrum.server.project.Project;
import scrum.server.project.Requirement;

public class SprintStorysCardsPdfCreator extends APdfCreator {

	public SprintStorysCardsPdfCreator(Project project) {
		super(project);
	}

	@Override
	protected void build(APdfContainerElement pdf) {
		Sprint sprint = project.getCurrentSprint();

		List<Requirement> requirements = new ArrayList<Requirement>(sprint.getRequirements());
		Collections.sort(requirements, project.getRequirementsOrderComparator());
		for (Requirement req : requirements) {
			card(pdf, req.getReferenceAndLabel());
		}

	}

	@Override
	protected String getFilename() {
		return "kunagi-sprint-story-cards_" + project.getCurrentSprint().getReference() + "_" + Date.today().toString()
				+ "_" + Str.toFileCompatibleString(project.getLabel());
	}

}
