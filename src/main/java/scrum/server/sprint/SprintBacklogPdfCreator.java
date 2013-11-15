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

import ilarkesto.base.Tm;
import ilarkesto.pdf.APdfContainerElement;
import ilarkesto.pdf.FieldList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import scrum.server.common.APdfCreator;
import scrum.server.common.TaskBurndownChart;
import scrum.server.project.Project;
import scrum.server.project.Requirement;

public class SprintBacklogPdfCreator extends APdfCreator {

	public SprintBacklogPdfCreator(Project project) {
		super(project);
	}

	@Override
	protected void build(APdfContainerElement pdf) {
		Sprint sprint = project.getCurrentSprint();

		reportHeader(pdf, "Sprint Backlog", project.getLabel());

		pdf.nl();
		FieldList fields = pdf.fieldList().setLabelFontStyle(fieldLabelFont);
		fields.field("Sprint").paragraph().text(sprint.getReference() + " ", referenceFont).text(sprint.getLabel());
		fields.field("Period").text(
			Tm.FORMAT_SHORTWEEKDAY_SHORTMONTH_DAY.format(sprint.getBegin()) + "  -  "
					+ Tm.FORMAT_SHORTWEEKDAY_SHORTMONTH_DAY.format(sprint.getEnd()) + "   (" + sprint.getLengthInDays()
					+ " days)");
		int burned = sprint.getBurnedWork();
		int remaining = sprint.getRemainingWork();
		int total = remaining + burned;
		float percent = burned * 100f / total;
		fields.field("Work progress").text(burned + " of " + total + " hours   (" + Math.round(percent) + "%)");
		fields.field("Product Owner").text(sprint.getProductOwnersAsString());
		fields.field("Scrum Master").text(sprint.getScrumMastersAsString());
		fields.field("Team").text(sprint.getTeamMembersAsString());

		pdf.nl();
		pdf.image(TaskBurndownChart.createBurndownChartAsByteArray(sprint, 1000, 500)).setScaleByWidth(150f);

		pdf.nl();
		List<Requirement> requirements = new ArrayList<Requirement>(sprint.getRequirements());
		Collections.sort(requirements, project.getRequirementsOrderComparator());
		for (Requirement req : requirements) {
			requirement(pdf, req, req.getOpenTasksAsList(), req.getClosedTasksAsList());
		}

	}

	@Override
	protected String getFilename() {
		return "sprintbacklog-" + project.getCurrentSprint().getReference();
	}

}
