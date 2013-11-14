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

import scrum.server.admin.User;
import scrum.server.common.BurndownSnapshot;
import scrum.server.project.Project;

public class SprintDaySnapshot extends GSprintDaySnapshot implements BurndownSnapshot {

	public int getClosedStories() {
		return closedStories;
	}

	public int getTotalStories() {
		return totalStories;
	}

	private int closedStories;
	private int totalStories;

	public void addBurnedWorkFromDeleted(int work) {
		setBurnedWorkFromDeleted(getBurnedWorkFromDeleted() + work);
	}

	@Override
	public int getBurnedWorkTotal() {
		return getBurnedWork() + getBurnedWorkFromDeleted();
	}

	public void updateWithCurrentSprint() {
		setRemainingWork(getSprint().getRemainingWork());
		setBurnedWork(getSprint().getBurnedWork());
	}

	public Project getProject() {
		return getSprint().getProject();
	}

	@Override
	public boolean isVisibleFor(User user) {
		return getProject().isVisibleFor(user);
	}

	@Override
	public String toString() {
		return getDate() + ": " + getBurnedWorkTotal() + ", " + getRemainingWork();
	}

	public void setClosedStories(int closedStories) {
		this.closedStories = closedStories;
		updateLastModified();
		fireModified("closedStories=" + closedStories);
	}

	public void setTotalStories(int totalStories) {
		this.totalStories = totalStories;
		updateLastModified();
		fireModified("totalStories=" + totalStories);
	}

}
