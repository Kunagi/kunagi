package scrum.server.common;

import ilarkesto.base.Utl;

import java.awt.Color;
import java.util.List;

import scrum.server.css.ScreenCssBuilder;
import scrum.server.sprint.SprintDao;

public abstract class BurndownChart {

	protected static final Color COLOR_PAST_LINE = Utl.parseHtmlColor(ScreenCssBuilder.cBurndownLine);
	protected static final Color COLOR_PROJECTION_LINE = Utl.parseHtmlColor(ScreenCssBuilder.cBurndownProjectionLine);
	protected static final Color COLOR_OPTIMUM_LINE = Utl.parseHtmlColor(ScreenCssBuilder.cBurndownOptimalLine);

	protected SprintDao sprintDao;

	public void setSprintDao(SprintDao sprintDao) {
		this.sprintDao = sprintDao;
	}

	protected static double[][] toArray(List<Double> a, List<Double> b) {
		int min = Math.min(a.size(), b.size());
		double[][] array = new double[2][min];
		for (int i = 0; i < min; i++) {
			array[0][i] = a.get(i);
			array[1][i] = b.get(i);
		}
		return array;
	}

}
