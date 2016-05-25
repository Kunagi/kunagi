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

import ilarkesto.base.Tm;
import ilarkesto.core.base.Color;
import ilarkesto.core.base.Str;
import ilarkesto.core.time.Date;
import ilarkesto.pdf.ACell;
import ilarkesto.pdf.AParagraph;
import ilarkesto.pdf.APdfBuilder;
import ilarkesto.pdf.APdfContainerElement;
import ilarkesto.pdf.ARow;
import ilarkesto.pdf.ATable;
import ilarkesto.pdf.FontStyle;

import java.util.Collection;

import scrum.server.issues.Issue;
import scrum.server.project.Project;
import scrum.server.project.Quality;
import scrum.server.project.Requirement;
import scrum.server.release.Release;
import scrum.server.sprint.Sprint;
import scrum.server.sprint.Task;

public abstract class APdfCreator {

	protected FontStyle defaultFont;
	protected FontStyle smallerFont;
	protected FontStyle tableHeaderFont;
	protected FontStyle codeFont;
	protected FontStyle referenceFont;
	protected FontStyle fieldLabelFont;
	protected FontStyle miniLabelFont;
	protected FontStyle spacerFont;
	protected FontStyle[] headerFonts = new FontStyle[4];
	protected Color tableHeaderBackground = Color.LIGHT_GRAY;

	protected Project project;

	protected abstract void build(APdfContainerElement pdf);

	protected abstract String getFilename();

	public APdfCreator(Project project) {
		this.project = project;

		defaultFont = new FontStyle().setSize(3);
		smallerFont = new FontStyle(defaultFont).setSize(defaultFont.getSize() - 0.5f);
		tableHeaderFont = new FontStyle(defaultFont).setBold(true);
		codeFont = new FontStyle(defaultFont).setFont(FontStyle.FONT_DEFAULT_FIXED);
		referenceFont = new FontStyle(defaultFont).setSize(defaultFont.getSize() - 0.5f)
				.setFont(FontStyle.FONT_DEFAULT_FIXED).setItalic(true);
		fieldLabelFont = new FontStyle(defaultFont).setItalic(true);
		miniLabelFont = new FontStyle(defaultFont).setSize(defaultFont.getSize() - 1f).setItalic(true);
		spacerFont = new FontStyle(defaultFont).setSize(defaultFont.getSize() - 3.5f);
		headerFonts[3] = new FontStyle(defaultFont).setSize(defaultFont.getSize() + 0.2f).setBold(true);
		headerFonts[2] = new FontStyle(defaultFont).setSize(headerFonts[3].getSize() + 0.7f).setBold(true);
		headerFonts[1] = new FontStyle(defaultFont).setSize(headerFonts[2].getSize() + 0.7f).setBold(true);
		headerFonts[0] = new FontStyle(defaultFont).setSize(headerFonts[1].getSize() + 1.5f).setBold(true);
	}

	public void createPdf(APdfBuilder pdf) {
		pdf.setFontStyle(defaultFont);
		build(pdf);
	}

	// --- helper ---

	protected void reportHeader(APdfContainerElement pdf, String title, String projectLabel) {
		pdf.paragraph().setDefaultFontStyle(headerFonts[0]).text(projectLabel);
		pdf.nl(spacerFont);
		pdf.paragraph().setDefaultFontStyle(miniLabelFont).text(title + ", ")
				.text(Tm.FORMAT_LONGMONTH_DAY_YEAR.format(Date.today()));
	}

	protected void sectionHeader(APdfContainerElement pdf, String label) {
		pdf.paragraph().nl().text(label, headerFonts[1]).nl();
		pdf.nl(spacerFont);
	}

	protected void wiki(APdfContainerElement parent, String wikiCode) {
		WikiToPdfConverter.buildPdf(parent, wikiCode, new ScrumPdfContext(project));
	}

	protected void card(APdfContainerElement pdf, String text) {
		pdf.paragraph().setDefaultFontStyle(headerFonts[0]).text(text).nl().nl();
	}

	protected void requirement(APdfContainerElement pdf, Requirement req, Collection<Task> openTasks,
			Collection<Task> closedTasks) {
		requirement(pdf, req, openTasks, closedTasks, null);
	}

	protected void requirement(APdfContainerElement pdf, Requirement req, Collection<Task> openTasks,
			Collection<Task> closedTasks, Sprint pastSprint) {
		pdf.nl();

		ATable table = pdf.table(3, 20, 3);

		ARow rowHeader = table.row().setDefaultBackgroundColor(Color.LIGHT_GRAY);
		rowHeader.cell().setFontStyle(referenceFont).text(req.getReference());
		rowHeader.cell().setFontStyle(new FontStyle(defaultFont).setBold(true)).text(req.getHistoryLabel(pastSprint));
		rowHeader.cell().setFontStyle(smallerFont).text(req.getWorkDescriptionAsString());

		richtextRow(table, "Story description", req.getDescription());
		richtextRow(table, "Acceptance tests", req.getTestDescription());

		tasksRow(table, "Closed tasks", closedTasks);
		tasksRow(table, "Open tasks", openTasks);

		table.createCellBorders(Color.GRAY, 0.2f);
	}

	private void tasksRow(ATable table, String label, Collection<Task> tasks) {
		if (tasks == null || tasks.isEmpty()) return;
		ARow row = table.row();

		ACell valueCell = row.cell().setColspan(3);
		valueCell.paragraph().setDefaultFontStyle(miniLabelFont).text(label);

		tasks(valueCell, tasks);
		valueCell.setPaddingBottom(3);
	}

	private void tasks(APdfContainerElement container, Collection<Task> tasks) {
		for (Task task : tasks) {
			container.nl(miniLabelFont);
			ATable table = container.table(3, 20);

			ARow rowHeader = table.row().setDefaultBackgroundColor(new Color(223, 223, 223));
			rowHeader.cell().setFontStyle(referenceFont).text(task.getReference());
			rowHeader.cell().setFontStyle(new FontStyle(defaultFont).setBold(true)).text(task.getLabel());

			if (task.isDescriptionSet()) richtextRow(table, "Description", task.getDescription());

			String impedimentLabelsAsText = task.getImpedimentLabelsAsText();
			if (!Str.isBlank(impedimentLabelsAsText)) {
				AParagraph p = richtextRow(table, null, null).paragraph();
				p.text("Blocked by ", fieldLabelFont);
				p.text(impedimentLabelsAsText, defaultFont);
			}

			table.createCellBorders(Color.LIGHT_GRAY, 0.2f);
		}

	}

	protected void quality(APdfContainerElement pdf, Quality quality) {
		pdf.nl();

		ATable table = pdf.table(3, 20, 6);

		ARow rowHeader = table.row().setDefaultBackgroundColor(Color.LIGHT_GRAY);
		rowHeader.cell().setFontStyle(referenceFont).text(quality.getReference());
		rowHeader.cell().setFontStyle(new FontStyle(defaultFont).setBold(true)).text(quality.getLabel());
		rowHeader.cell();

		richtextRow(table, "Quality description", quality.getDescription());
		richtextRow(table, "Acceptance tests", quality.getTestDescription());

		table.createCellBorders(Color.GRAY, 0.2f);
	}

	protected void release(APdfContainerElement pdf, Release release) {
		pdf.nl();

		ATable table = pdf.table(3, 20, 3);

		ARow rowHeader = table.row().setDefaultBackgroundColor(Color.LIGHT_GRAY);
		rowHeader.cell().setFontStyle(referenceFont).text(release.getReference());
		rowHeader.cell().setFontStyle(new FontStyle(defaultFont).setBold(true)).text(release.getLabel());
		rowHeader.cell().setFontStyle(defaultFont).text(release.getReleaseDate());

		richtextRow(table, "Development notes", release.getNote());
		richtextRow(table, "Release notes", release.getReleaseNotes());

		table.createCellBorders(Color.GRAY, 0.2f);
	}

	protected void issue(APdfContainerElement pdf, Issue issue) {
		pdf.nl();

		ATable table = pdf.table(3, 20, 6);

		ARow rowHeader = table.row().setDefaultBackgroundColor(Color.LIGHT_GRAY);
		rowHeader.cell().setFontStyle(referenceFont).text(issue.getReference());
		rowHeader.cell().setFontStyle(new FontStyle(defaultFont).setBold(true)).text(issue.getLabel());
		String sideinfo;
		if (issue.isBug()) {
			if (issue.isFixed()) {
				sideinfo = issue.getSeverityLabel() + ", fixed by " + issue.getOwner().getName() + " on "
						+ issue.getFixDate();
			} else if (issue.isOwnerSet()) {
				sideinfo = issue.getSeverityLabel() + ", claimed by " + issue.getOwner().getName();
			} else {
				sideinfo = issue.getSeverityLabel();
			}
		} else {
			sideinfo = issue.getAcceptDate().toString();
		}
		rowHeader.cell().setFontStyle(defaultFont).text(sideinfo);

		richtextRow(table, "Description", issue.getDescription());
		richtextRow(table, "Statement", issue.getStatement());

		table.createCellBorders(Color.GRAY, 0.2f);
	}

	protected ACell richtextRow(ATable table, String label, String value) {
		int colspan = table.getColumnCount();
		ARow row = table.row();

		ACell valueCell = row.cell().setColspan(colspan);
		if (!Str.isBlank(label)) valueCell.paragraph().setDefaultFontStyle(miniLabelFont).text(label);
		if (value != null) wiki(valueCell, value);
		valueCell.setPaddingBottom(3);
		return valueCell;
	}

}
