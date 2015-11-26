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
package scrum.server.collaboration;

import ilarkesto.core.fp.Predicate;
import ilarkesto.persistence.AEntity;

import java.util.Set;

import scrum.server.impediments.Impediment;
import scrum.server.issues.Issue;
import scrum.server.pr.BlogEntry;
import scrum.server.project.Project;
import scrum.server.project.Quality;
import scrum.server.project.Requirement;
import scrum.server.release.Release;
import scrum.server.risks.Risk;
import scrum.server.sprint.Sprint;
import scrum.server.sprint.Task;

public class EmoticonDao extends GEmoticonDao {

	public Set<Emoticon> getByProject(final Project project) {
		return getEntities(new Predicate<Emoticon>() {

			@Override
			public boolean test(Emoticon e) {
				AEntity parent = e.getParent();
				if (parent == null) return false;
				if (parent instanceof Requirement) return ((Requirement) parent).isProject(project);
				if (parent instanceof Task) return ((Task) parent).getRequirement().isProject(project);
				if (parent instanceof Issue) return ((Issue) parent).isProject(project);
				if (parent instanceof Quality) return ((Quality) parent).isProject(project);
				if (parent instanceof Release) return ((Release) parent).isProject(project);
				if (parent instanceof BlogEntry) return ((BlogEntry) parent).isProject(project);
				if (parent instanceof Impediment) return ((Impediment) parent).isProject(project);
				if (parent instanceof Risk) return ((Risk) parent).isProject(project);
				if (parent instanceof Sprint) return ((Sprint) parent).isProject(project);
				return false;
			}
		});
	}

}