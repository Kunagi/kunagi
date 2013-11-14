package scrum.client.dashboard;

import ilarkesto.core.time.Tm;
import scrum.client.common.AScrumWidget;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

public class StoryBurndownWidget extends AScrumWidget {

	public static final int CHART_WIDTH = 800;
	public static final int CHART_HEIGHT = 270;

	private Image sprintChart;

	@Override
	protected Widget onInitialization() {
		sprintChart = new Image(getChartUrl(200));
		return sprintChart;
	}

	@Override
	protected void onUpdate() {
		int width = getChartWidth();
		sprintChart.setWidth(width + "px");
		sprintChart.setUrl(getChartUrl(width) + "&timestamp=" + Tm.getCurrentTimeMillis());
	}

	private String getChartUrl(int width) {
		return getCurrentSprint().getStoryBurndown(width, CHART_HEIGHT);
	}

	private int getChartWidth() {
		int width = Window.getClientWidth() - 280;
		width = width / 2;
		if (width < 100) width = 100;
		return width;
	}

}
