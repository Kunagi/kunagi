/*
 * Copyright 2009, 2010, 2011 Fabian Hager, Witoslaw Koczewsi <wi@koczewski.de>
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

import ilarkesto.base.Str;
import ilarkesto.base.Sys;
import ilarkesto.core.logging.Log;
import ilarkesto.core.time.Date;

import java.awt.BasicStroke;
import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultXYDataset;

import scrum.client.common.WeekdaySelector;
import scrum.server.sprint.Sprint;
import scrum.server.sprint.SprintDaySnapshot;

public class TaskBurndownChart extends BurndownChart {

	private static final Log LOG = Log.get(TaskBurndownChart.class);

	public static byte[] createBurndownChartAsByteArray(Sprint sprint, int width, int height) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		new TaskBurndownChart().writeSprintBurndownChart(out, sprint, width, height);
		return out.toByteArray();
	}

	public void writeSprintBurndownChart(OutputStream out, String sprintId, int width, int height) {
		Sprint sprint = sprintDao.getById(sprintId);
		if (sprint == null) throw new IllegalArgumentException("Sprint " + sprintId + " does not exist.");
		writeSprintBurndownChart(out, sprint, width, height);
	}

	public void writeSprintBurndownChart(OutputStream out, Sprint sprint, int width, int height) {
		List<SprintDaySnapshot> snapshots = sprint.getDaySnapshots();
		if (snapshots.isEmpty()) {
			Date date = Date.today();
			date = Date.latest(date, sprint.getBegin());
			date = Date.earliest(date, sprint.getEnd());
			sprint.getDaySnapshot(date).updateWithCurrentSprint();
			snapshots = sprint.getDaySnapshots();
		}

		WeekdaySelector freeDays = sprint.getProject().getFreeDaysAsWeekdaySelector();

		writeSprintBurndownChart(out, snapshots, sprint.getBegin(), sprint.getEnd(), sprint.getOriginallyEnd(),
			freeDays, width, height);
	}

	static void writeSprintBurndownChart(OutputStream out, List<? extends BurndownSnapshot> snapshots, Date firstDay,
			Date lastDay, Date originallyLastDay, WeekdaySelector freeDays, int width, int height) {
		LOG.debug("Creating burndown chart:", snapshots.size(), "snapshots from", firstDay, "to", lastDay, "(" + width
				+ "x" + height + " px)");

		int dayCount = firstDay.getPeriodTo(lastDay).toDays();
		int dateMarkTickUnit = 1;
		float widthPerDay = (float) width / (float) dayCount * dateMarkTickUnit;
		while (widthPerDay < 20) {
			dateMarkTickUnit++;
			widthPerDay = (float) width / (float) dayCount * dateMarkTickUnit;
		}

		List<BurndownSnapshot> burndownSnapshots = new ArrayList<BurndownSnapshot>(snapshots);
		JFreeChart chart = createSprintBurndownChart(burndownSnapshots, firstDay, lastDay, originallyLastDay, freeDays,
			dateMarkTickUnit, widthPerDay);
		try {
			ChartUtilities.writeScaledChartAsPNG(out, chart, width, height, 1, 1);
			out.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static JFreeChart createSprintBurndownChart(List<BurndownSnapshot> snapshots, Date firstDay, Date lastDay,
			Date originallyLastDay, WeekdaySelector freeDays, int dateMarkTickUnit, float widthPerDay) {
		DefaultXYDataset data = createSprintBurndownChartDataset(snapshots, firstDay, lastDay, originallyLastDay,
			freeDays);

		double tick = 1.0;
		double max = DefaultXYDatasetUtil.getMaximum(data);

		while (max / tick > 25) {
			tick *= 2;
			if (max / tick <= 25) break;
			tick *= 2.5;
			if (max / tick <= 25) break;
			tick *= 2;
		}
		double valueLabelTickUnit = tick;
		double upperBoundary = Math.min(max * 1.1f, max + 3);

		if (!Sys.isHeadless()) LOG.warn("GraphicsEnvironment is not headless");
		JFreeChart chart = ChartFactory.createXYLineChart("", "", "", data, PlotOrientation.VERTICAL, false, true,
			false);

		XYItemRenderer renderer = chart.getXYPlot().getRenderer();

		renderer.setSeriesPaint(0, COLOR_PAST_LINE);
		renderer.setSeriesStroke(0, new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
		renderer.setSeriesPaint(1, COLOR_PROJECTION_LINE);
		renderer.setSeriesStroke(1, new BasicStroke(1.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL, 1.0f,
				new float[] { 3f }, 0));
		renderer.setSeriesPaint(2, COLOR_OPTIMUM_LINE);
		renderer.setSeriesStroke(2, new BasicStroke(2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));

		DateAxis domainAxis1 = new DateAxis();
		String dateFormat = "d.";
		widthPerDay -= 5;
		if (widthPerDay > 40) {
			dateFormat = "EE " + dateFormat;
		}
		if (widthPerDay > 10) {
			float spaces = widthPerDay / 2.7f;
			dateFormat = Str.multiply(" ", (int) spaces) + dateFormat;
		}
		domainAxis1.setDateFormatOverride(new SimpleDateFormat(dateFormat, Locale.US));
		domainAxis1.setTickUnit(new DateTickUnit(DateTickUnit.DAY, dateMarkTickUnit));
		domainAxis1.setAxisLineVisible(false);
		Range range = new Range(firstDay.toMillis(), lastDay.nextDay().toMillis());
		domainAxis1.setRange(range);

		DateAxis domainAxis2 = new DateAxis();
		domainAxis2.setTickUnit(new DateTickUnit(DateTickUnit.DAY, 1));
		domainAxis2.setTickMarksVisible(false);
		domainAxis2.setTickLabelsVisible(false);
		domainAxis2.setRange(range);

		chart.getXYPlot().setDomainAxis(0, domainAxis2);
		chart.getXYPlot().setDomainAxis(1, domainAxis1);
		chart.getXYPlot().setDomainAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT);

		NumberAxis rangeAxis = new NumberAxis();
		rangeAxis.setNumberFormatOverride(NumberFormat.getIntegerInstance());
		rangeAxis.setTickUnit(new NumberTickUnit(valueLabelTickUnit));

		rangeAxis.setLowerBound(0);
		rangeAxis.setUpperBound(upperBoundary);

		chart.getXYPlot().setRangeAxis(rangeAxis);

		chart.getXYPlot().getRenderer().setBaseStroke(new BasicStroke(2f));

		chart.setBackgroundPaint(Color.WHITE);

		return chart;
	}

	static DefaultXYDataset createSprintBurndownChartDataset(final List<BurndownSnapshot> snapshots,
			final Date firstDay, final Date lastDay, Date originallyLastDay, final WeekdaySelector freeDays) {

		ChartDataFactory factory = new ChartDataFactory();
		factory.createDataset(snapshots, firstDay, lastDay, originallyLastDay, freeDays);
		return factory.getDataset();
	}

	static class ChartDataFactory {

		List<Double> mainDates = new ArrayList<Double>();
		List<Double> mainValues = new ArrayList<Double>();

		List<Double> extrapolationDates = new ArrayList<Double>();
		List<Double> extrapolationValues = new ArrayList<Double>();

		List<Double> idealDates = new ArrayList<Double>();
		List<Double> idealValues = new ArrayList<Double>();

		List<BurndownSnapshot> snapshots;
		WeekdaySelector freeDays;

		Date date;
		long millisBegin;
		long millisEnd;
		boolean freeDay;
		BurndownSnapshot snapshot;
		boolean workStarted;
		boolean workFinished;

		int totalBurned;
		int totalBefore;
		int totalAfter;
		int burned;
		int jump;
		double totalRemaining;
		int workDays;
		double burnPerDay;
		double idealRemaining;
		double idealBurnPerDay;
		int totalWorkDays = 0;
		int totalOriginallyWorkDays = 0;
		boolean extrapolationFinished;

		DefaultXYDataset dataset;

		public void createDataset(final List<BurndownSnapshot> snapshots, final Date firstDay, final Date lastDay,
				final Date originallyLastDay, final WeekdaySelector freeDays) {
			this.snapshots = snapshots;
			this.freeDays = freeDays;

			date = firstDay;
			while (date.isBeforeOrSame(lastDay)) {
				if (!freeDays.isFree(date.getWeekday().getDayOfWeek())) {
					totalWorkDays++;
					if (date.isBeforeOrSame(originallyLastDay)) totalOriginallyWorkDays++;
				}
				date = date.nextDay();
			}

			setDate(firstDay);
			while (true) {
				if (!workFinished) {
					burned = snapshot.getBurnedWorkTotal() - totalBurned;
					totalBurned = snapshot.getBurnedWorkTotal();
					totalAfter = snapshot.getRemainingWork();
					jump = totalAfter - totalBefore + burned;
				}

				if (workFinished) {
					processSuffix();
				} else if (workStarted) {
					processCenter();
				} else {
					processPrefix();
				}
				if (date.equals(lastDay)) break;
				setDate(date.nextDay());
				totalBefore = totalAfter;
			}

			dataset = new DefaultXYDataset();
			dataset.addSeries("Main", toArray(mainDates, mainValues));
			dataset.addSeries("Extrapolation", toArray(extrapolationDates, extrapolationValues));
			dataset.addSeries("Ideal", toArray(idealDates, idealValues));
		}

		private void setDate(Date newDate) {
			date = newDate;
			millisBegin = date.toMillis();
			millisEnd = date.nextDay().toMillis();
			freeDay = freeDays.isFree(date.getWeekday().getDayOfWeek());
			if (!workFinished) snapshot = getSnapshot();
		}

		private void processPrefix() {
			if (totalAfter > 0 || totalBurned > 0) {
				workStarted = true;
				idealRemaining = totalAfter + burned;
				idealDates.add((double) millisBegin);
				idealValues.add(idealRemaining);

				if (totalOriginallyWorkDays > 0) {
					idealBurnPerDay = (double) jump / (double) totalOriginallyWorkDays;
				}

				processCenter();
				return;
			}
			totalWorkDays--;
			totalOriginallyWorkDays--;
		}

		private void processCenter() {
			mainDates.add((double) millisBegin);
			mainValues.add((double) totalBefore);
			if (jump != 0) {
				mainDates.add((double) millisBegin);
				mainValues.add((double) totalBefore + jump);
			}
			mainDates.add((double) millisEnd);
			mainValues.add((double) totalAfter);

			if (!freeDay) {
				workDays++;
				idealRemaining -= idealBurnPerDay;
			}

			if (idealRemaining > 0) {
				idealDates.add((double) millisEnd);
				idealValues.add(idealRemaining);
			}
		}

		private void processSuffix() {
			if (!freeDay) {
				totalRemaining -= burnPerDay;
				idealRemaining -= idealBurnPerDay;
			}
			if (!extrapolationFinished) {
				extrapolationDates.add((double) millisEnd);
				extrapolationValues.add(totalRemaining);
			}
			idealDates.add((double) millisEnd);
			idealValues.add(idealRemaining);
			if (totalRemaining <= 0) extrapolationFinished = true;
		}

		private BurndownSnapshot getSnapshot() {
			for (BurndownSnapshot snapshot : snapshots) {
				if (snapshot.getDate().equals(date)) return snapshot;
			}
			workFinished = true;
			totalRemaining = totalAfter;
			burnPerDay = (double) totalBurned / (double) workDays;
			extrapolationDates.add((double) millisBegin);
			extrapolationValues.add(totalRemaining);
			return null;
		}

		public DefaultXYDataset getDataset() {
			return dataset;
		}

	}

}
