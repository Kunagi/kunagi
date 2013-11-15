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

import ilarkesto.core.time.Date;
import ilarkesto.fp.Predicate;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import scrum.server.project.Requirement;

public class SprintDaySnapshotDao extends GSprintDaySnapshotDao {

	public SprintDaySnapshot getSprintDaySnapshot(final Sprint sprint, final Date date, boolean autoCreate) {
		SprintDaySnapshot snapshot = getEntity(new Predicate<SprintDaySnapshot>() {

			@Override
			public boolean test(SprintDaySnapshot e) {
				return e.isSprint(sprint) && e.isDate(date);
			}
		});

		if (snapshot != null && snapshot.getDate().isToday()) {
			updateStoryCount(sprint, snapshot);
			saveEntity(snapshot);
		}

		if (autoCreate && snapshot == null) {
			snapshot = newEntityInstance();
			snapshot.setSprint(sprint);
			snapshot.setDate(date);

			updateStoryCount(sprint, snapshot);

			saveEntity(snapshot);
		}

		return snapshot;
	}

	private void updateStoryCount(final Sprint sprint, SprintDaySnapshot snapshot) {
		Set<Requirement> requirements = sprint.getRequirements();

		int closedStories = 0;
		for (Requirement req : requirements) {
			if (req.isClosed()) {
				closedStories++;
			}
		}
		snapshot.setClosedStories(closedStories);

		int totalStories = requirements.size();
		snapshot.setTotalStories(totalStories);
	}

	public List<SprintDaySnapshot> getSprintDaySnapshots(Sprint sprint) {
		List<SprintDaySnapshot> ret = new LinkedList<SprintDaySnapshot>();
		Date date = sprint.getBegin();
		Date end = sprint.getEnd();
		SprintDaySnapshot previousSnapshot = null;
		while (date.isBeforeOrSame(end) && date.isPastOrToday()) {
			SprintDaySnapshot snapshot = getSprintDaySnapshot(sprint, date, false);
			if (snapshot == null) {
				snapshot = new SprintDaySnapshot();
				snapshot.setSprint(sprint);
				snapshot.setDate(date);
				if (previousSnapshot != null) {
					snapshot.setRemainingWork(previousSnapshot.getRemainingWork());
					snapshot.setBurnedWork(previousSnapshot.getBurnedWork());
				}
			}

			ret.add(snapshot);
			previousSnapshot = snapshot;
			date = date.nextDay();
		}
		return ret;
	}
}
