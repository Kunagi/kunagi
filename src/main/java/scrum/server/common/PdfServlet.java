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

import ilarkesto.base.PermissionDeniedException;
import ilarkesto.core.time.Date;
import ilarkesto.integration.itext.PdfBuilder;
import ilarkesto.webapp.RequestWrapper;

import java.io.IOException;

import scrum.server.WebSession;
import scrum.server.calendar.CalendarPdfCreator;
import scrum.server.collaboration.Wikipage;
import scrum.server.collaboration.WikipagePdfCreator;
import scrum.server.impediments.ImpedimentListPdfCreator;
import scrum.server.issues.BugListPdfCreator;
import scrum.server.issues.IdeaListPdfCreator;
import scrum.server.project.ProductBacklogPdfCreator;
import scrum.server.project.QualityBacklogPdfCreator;
import scrum.server.release.ReleaseHistoryPdfCreator;
import scrum.server.release.ReleasePlanPdfCreator;
import scrum.server.risks.RiskListPdfCreator;
import scrum.server.sprint.Sprint;
import scrum.server.sprint.SprintBacklogPdfCreator;
import scrum.server.sprint.SprintReportPdfCreator;
import scrum.server.sprint.SprintStorysCardsPdfCreator;

public class PdfServlet extends AKunagiServlet {

	private APdfCreator getPdfCreator(String pdfId, RequestWrapper<WebSession> req) {
		if (pdfId.equals("sprintReport")) return createSprintReport(req);
		if (pdfId.equals("wikipage")) return createWikipage(req);
		if (pdfId.equals("productBacklog")) return createProductBacklog(req);
		if (pdfId.equals("sprintBacklog")) return createSprintBacklog(req);
		if (pdfId.equals("sprintStorysCards")) return createSprintStorysCards(req);
		if (pdfId.equals("qualityBacklog")) return createQualityBacklog(req);
		if (pdfId.equals("impedimentList")) return createImpedimentList(req);
		if (pdfId.equals("riskList")) return createRiskList(req);
		if (pdfId.equals("calendar")) return createCalendar(req);
		if (pdfId.equals("bugList")) return createBugList(req);
		if (pdfId.equals("ideaList")) return createIdeaList(req);
		if (pdfId.equals("releasePlan")) return createReleasePlan(req);
		if (pdfId.equals("releaseHistory")) return createReleaseHistory(req);
		throw new RuntimeException("Unknown pdfId: " + pdfId);
	}

	private APdfCreator createCalendar(RequestWrapper<WebSession> req) {
		Date from = req.getDate("from");
		Date to = req.getDate("to");
		return new CalendarPdfCreator(getProject(req), from, to);
	}

	private APdfCreator createReleasePlan(RequestWrapper<WebSession> req) {
		return new ReleasePlanPdfCreator(getProject(req));
	}

	private APdfCreator createReleaseHistory(RequestWrapper<WebSession> req) {
		return new ReleaseHistoryPdfCreator(getProject(req));
	}

	private APdfCreator createRiskList(RequestWrapper<WebSession> req) {
		return new RiskListPdfCreator(getProject(req));
	}

	private APdfCreator createImpedimentList(RequestWrapper<WebSession> req) {
		return new ImpedimentListPdfCreator(getProject(req));
	}

	private APdfCreator createSprintBacklog(RequestWrapper<WebSession> req) {
		return new SprintBacklogPdfCreator(getProject(req));
	}

	private APdfCreator createSprintStorysCards(RequestWrapper<WebSession> req) {
		return new SprintStorysCardsPdfCreator(getProject(req));
	}

	private APdfCreator createQualityBacklog(RequestWrapper<WebSession> req) {
		return new QualityBacklogPdfCreator(getProject(req));
	}

	private APdfCreator createProductBacklog(RequestWrapper<WebSession> req) {
		return new ProductBacklogPdfCreator(getProject(req));
	}

	private APdfCreator createBugList(RequestWrapper<WebSession> req) {
		return new BugListPdfCreator(getProject(req));
	}

	private APdfCreator createIdeaList(RequestWrapper<WebSession> req) {
		return new IdeaListPdfCreator(getProject(req));
	}

	private APdfCreator createWikipage(RequestWrapper<WebSession> req) {
		Wikipage wikipage = getEntityByParameter(req, Wikipage.class);
		if (!wikipage.isProject(getProject(req))) throw new PermissionDeniedException();
		return new WikipagePdfCreator(wikipage);
	}

	private APdfCreator createSprintReport(RequestWrapper<WebSession> req) {
		Sprint sprint = getEntityByParameter(req, Sprint.class);
		if (!sprint.isProject(getProject(req))) throw new PermissionDeniedException();
		return new SprintReportPdfCreator(sprint);
	}

	@Override
	protected void onRequest(RequestWrapper<WebSession> req) throws IOException {
		String pdfId = req.getMandatory("pdfId");
		APdfCreator creator = getPdfCreator(pdfId, req);

		req.setContentTypePdf();
		req.setFilename(creator.getFilename() + ".pdf");

		PdfBuilder pdf = new PdfBuilder();
		creator.build(pdf);
		req.write(pdf);
	}
}
