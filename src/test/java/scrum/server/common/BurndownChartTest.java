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
package scrum.server.common;

import ilarkesto.base.Sys;
import ilarkesto.core.time.Date;
import ilarkesto.io.IO;
import ilarkesto.testng.ATest;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import scrum.client.common.WeekdaySelector;
import scrum.server.sprint.SprintDaySnapshot;

public class BurndownChartTest extends ATest {

	@BeforeSuite
	public void init() {
		Sys.setHeadless(true);
	}

	@Test
	public void sprintBurndown() throws IOException {
		// WeekdaySelector freeDays = new WeekdaySelector(65);
		WeekdaySelector freeDays = new WeekdaySelector(1);

		List<BurndownSnapshot> shots = new ArrayList<BurndownSnapshot>();

		// shots.add(shot(new Date(2008, 7, 1), 0, 0));
		// shots.add(shot(new Date(2008, 7, 2), 0, 0));
		// shots.add(shot(new Date(2008, 7, 3), 0, 0));
		// shots.add(shot(new Date(2008, 7, 4), 5, 45));
		// shots.add(shot(new Date(2008, 7, 5), 10, 35));
		// shots.add(shot(new Date(2008, 7, 6), 0, 35));
		// shots.add(shot(new Date(2008, 7, 7), 18, 25));
		// shots.add(shot(new Date(2008, 7, 8), 10, 15));
		// shots.add(shot(new Date(2008, 7, 9), 2, 15));

		// shots.add(shot(new Date(2008, 7, 1), 0, 0));
		// shots.add(shot(new Date(2008, 7, 2), 0, 5));
		// shots.add(shot(new Date(2008, 7, 3), 1, 4));
		// shots.add(shot(new Date(2008, 7, 4), 1, 5));
		// shots.add(shot(new Date(2008, 7, 5), 2, 3));
		// shots.add(shot(new Date(2008, 7, 6), 1, 2));
		// shots.add(shot(new Date(2008, 7, 7), 2, 0));
		// shots.add(shot(new Date(2008, 7, 8), 0, 0));

		// shots.add(shot(new Date(2008, 7, 1), 0, 5));
		// shots.add(shot(new Date(2008, 7, 2), 2, 3));

		shots.add(shot(new Date(2008, 7, 1), 0, 5));
		shots.add(shot(new Date(2008, 7, 2), 2, 4));
		shots.add(shot(new Date(2008, 7, 3), 2, 4));
		shots.add(shot(new Date(2008, 7, 4), 2, 4));

		Date sprintBeginDate = shots.get(0).getDate();
		Date sprintEndDate = shots.get(shots.size() - 1).getDate().addDays(23);
		Date sprintOriginallyEndDate = sprintEndDate.addDays(-3);

		File file = new File(OUTPUT_DIR + "/sprintBurndownChart.png");
		log.info(file.getAbsolutePath());
		IO.createDirectory(file.getParentFile());
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
		TaskBurndownChart.writeSprintBurndownChart(out, shots, sprintBeginDate, sprintEndDate, sprintOriginallyEndDate,
			freeDays, 1000, 500);
		out.close();
	}

	private static SprintDaySnapshot shot(Date d, int b, int r) {
		SprintDaySnapshot s = new SprintDaySnapshot();
		try {
			s.setDate(d);
		} catch (NullPointerException e) {}
		try {
			s.setBurnedWork(b);
		} catch (NullPointerException e) {}
		try {
			s.setRemainingWork(r);
		} catch (NullPointerException e) {}
		return s;
	}

}
