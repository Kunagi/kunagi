package scrum.server.sprint;

import ilarkesto.webapp.RequestWrapper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import scrum.client.project.ProjectOverviewWidget;
import scrum.server.ScrumWebApplication;
import scrum.server.WebSession;
import scrum.server.common.AKunagiServlet;

public class StoryBurndownChartServlet extends AKunagiServlet {

	@Override
	protected void onRequest(RequestWrapper<WebSession> req) throws IOException {
		String sprintId = req.get("sprintId");
		String width = req.get("width");
		if (width == null) width = String.valueOf(ProjectOverviewWidget.CHART_WIDTH);
		String height = req.get("height");
		if (height == null) height = String.valueOf(ProjectOverviewWidget.CHART_HEIGHT);

		req.preventCaching();
		req.setContentType("image/png");

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		ScrumWebApplication.get().getStoryBurndownChart()
				.writeStoryBurndownChart(out, sprintId, Integer.parseInt(width), Integer.parseInt(height));

		req.write(out.toByteArray());
	}

}
