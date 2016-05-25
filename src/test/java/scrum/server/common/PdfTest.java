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

import ilarkesto.base.Str;
import ilarkesto.base.Utl;
import ilarkesto.core.time.Date;
import ilarkesto.integration.itext.PdfBuilder;
import ilarkesto.testng.ATest;

import java.io.File;
import java.util.Arrays;

import org.testng.annotations.Test;

import scrum.TestUtil;
import scrum.server.calendar.CalendarPdfCreator;
import scrum.server.collaboration.Wikipage;
import scrum.server.collaboration.WikipagePdfCreator;
import scrum.server.impediments.Impediment;
import scrum.server.impediments.ImpedimentListPdfCreator;
import scrum.server.issues.BugListPdfCreator;
import scrum.server.issues.IdeaListPdfCreator;
import scrum.server.issues.Issue;
import scrum.server.project.ProductBacklogPdfCreator;
import scrum.server.project.Project;
import scrum.server.project.QualityBacklogPdfCreator;
import scrum.server.project.Requirement;
import scrum.server.release.ReleaseHistoryPdfCreator;
import scrum.server.release.ReleasePlanPdfCreator;
import scrum.server.risks.RiskListPdfCreator;
import scrum.server.sprint.Sprint;
import scrum.server.sprint.SprintBacklogPdfCreator;
import scrum.server.sprint.SprintReportPdfCreator;
import scrum.server.sprint.SprintStorysCardsPdfCreator;
import scrum.server.sprint.Task;

public class PdfTest extends ATest {

	@Test
	public void calendar() {
		Project project = TestUtil.createProject(TestUtil.getDuke());

		TestUtil.createSimpleEvent(project, 0);
		TestUtil.createSimpleEvent(project, 10);
		TestUtil.createSimpleEvent(project, 20);

		createPdf(new CalendarPdfCreator(project, Date.today(), Date.inDays(30)));
	}

	@Test
	public void riskList() {
		Project project = TestUtil.createProject();

		TestUtil.createRisk(project, 1);
		TestUtil.createRisk(project, 2);
		TestUtil.createRisk(project, 3);
		TestUtil.createRisk(project, 4);
		TestUtil.createRisk(project, 5);

		createPdf(new RiskListPdfCreator(project));
	}

	@Test
	public void impedimentList() {
		Project project = TestUtil.createProject();

		TestUtil.createImpediment(project, 1);
		TestUtil.createImpediment(project, 2);

		Impediment imp3 = TestUtil.createImpediment(project, 3);
		imp3.setSolution(Str.generateRandomParagraphs(2));

		Impediment imp4 = TestUtil.createImpediment(project, 4);
		Requirement req1 = TestUtil.createRequirement(project, 1);
		TestUtil.createTask(req1, 1, 3, 0).addImpediment(imp4);
		TestUtil.createTask(req1, 2, 1, 0).addImpediment(imp4);

		TestUtil.createImpediment(project, 5);

		createPdf(new ImpedimentListPdfCreator(project));
	}

	@Test(enabled = true)
	public void sprintBacklog() {
		Project project = TestUtil.createProject();

		Sprint sprint = TestUtil.createSprint(project, Date.today());
		project.setCurrentSprint(sprint);

		Requirement req1 = TestUtil.createRequirement(project, 1);
		req1.setEstimatedWork(3f);
		req1.setDirty(false);
		TestUtil.createTasks(req1, Utl.randomInt(1, 10));
		req1.setSprint(sprint);

		Requirement req2 = TestUtil.createRequirement(project, 2);
		req2.setEstimatedWork(0.5f);
		req2.setDirty(false);
		TestUtil.createTasks(req1, Utl.randomInt(0, 2));
		TestUtil.createTask(req2, 666, 1, 0).addImpediment(TestUtil.createImpediment(project, 666));
		req2.setSprint(sprint);

		createPdf(new SprintBacklogPdfCreator(project));
	}

	@Test
	public void sprintStorysCards() {
		Project project = TestUtil.createProject();

		Sprint sprint = TestUtil.createSprint(project, Date.today());
		project.setCurrentSprint(sprint);

		Requirement req1 = TestUtil.createRequirement(project, 1);
		req1.setEstimatedWork(3f);
		req1.setDirty(false);
		TestUtil.createTasks(req1, Utl.randomInt(1, 10));
		req1.setSprint(sprint);

		Requirement req2 = TestUtil.createRequirement(project, 2);
		req2.setEstimatedWork(0.5f);
		req2.setDirty(false);
		TestUtil.createTasks(req1, Utl.randomInt(0, 2));
		TestUtil.createTask(req2, 666, 1, 0).addImpediment(TestUtil.createImpediment(project, 666));
		req2.setSprint(sprint);

		createPdf(new SprintStorysCardsPdfCreator(project));
	}

	@Test
	public void productBacklog() {
		Project project = TestUtil.createProject();

		TestUtil.createRequirement(project, 1).setEstimatedWork(3f);
		TestUtil.createRequirement(project, 2);

		createPdf(new ProductBacklogPdfCreator(project));
	}

	@Test
	public void qualityBacklog() {
		Project project = TestUtil.createProject();

		TestUtil.createQuality(project, 1);
		TestUtil.createQuality(project, 2);
		TestUtil.createQuality(project, 3);

		createPdf(new QualityBacklogPdfCreator(project));
	}

	@Test
	public void bugList() {
		Project project = TestUtil.createProject();

		TestUtil.createBug(project, 1);
		TestUtil.createBug(project, 2).setOwner(TestUtil.getDuke());

		Issue bug3 = TestUtil.createBug(project, 3);
		bug3.setOwner(TestUtil.getDuke());
		bug3.setFixDate(Date.beforeDays(2));

		createPdf(new BugListPdfCreator(project));
	}

	@Test
	public void ideaList() {
		Project project = TestUtil.createProject();

		TestUtil.createIssue(project, 1).setAcceptDate(Date.today());
		TestUtil.createIssue(project, 2).setAcceptDate(Date.today());
		TestUtil.createIssue(project, 3).setAcceptDate(Date.today());

		createPdf(new IdeaListPdfCreator(project));
	}

	@Test
	public void releasePlan() {
		Project project = TestUtil.createProject();

		TestUtil.createRelease(project, 1);
		TestUtil.createRelease(project, 2);
		TestUtil.createRelease(project, 3);

		createPdf(new ReleasePlanPdfCreator(project));
	}

	@Test
	public void releaseHistory() {
		Project project = TestUtil.createProject();

		TestUtil.createRelease(project, 1).setReleased(true);
		TestUtil.createRelease(project, 2).setReleased(true);
		TestUtil.createRelease(project, 3).setReleased(true);

		createPdf(new ReleaseHistoryPdfCreator(project));
	}

	@Test(enabled = false)
	public void sprintReport() {
		Project project = TestUtil.createProject();
		project.addProductOwners(Arrays.asList(TestUtil.createUser("Cartman")));
		project.addScrumMasters(Arrays.asList(TestUtil.createUser("Homer")));
		project.addTeamMembers(Arrays.asList(TestUtil.createUser("Alfred"), TestUtil.createUser("Duke")));

		Sprint sprint = new Sprint();
		sprint.setProject(project);
		sprint.setEnd(Date.beforeDays(3));
		sprint.setBegin(sprint.getEnd().addDays(-30));
		sprint.setLabel("Productivity Boost Sprint ä ü ö ß Mirosław");
		sprint.setGoal(Str.generateRandomSentence(3, 15));
		sprint.setPlanningNote(Str.generateRandomParagraphs(2));
		sprint.setReviewNote(Str.generateRandomParagraphs(2));
		sprint.setRetrospectiveNote(Str.generateRandomParagraphs(2));
		sprint.setVelocity(666f);

		Requirement req1 = TestUtil.createRequirement(sprint, 1, 0.5f);
		Task tsk1 = TestUtil.createTask(req1, 1, 0, 1);
		tsk1.setDescription(Str.generateRandomParagraphs(3));
		req1.setClosed(true);

		Requirement req2 = TestUtil.createRequirement(sprint, 2, 1f);

		Requirement req3 = TestUtil.createRequirement(sprint, 3, 5f);
		TestUtil.createTask(req3, 2, 1, 1);
		TestUtil.createTask(req3, 3, 2, 2);

		sprint.close();

		createPdf(new SprintReportPdfCreator(sprint));
	}

	@Test
	public void wikipage() {
		Wikipage wikipage = new Wikipage();
		wikipage.setName("wikipage");
		wikipage.setText(
			"= Test Wiki Page =\n\nTest wiki page.\nTest wiki page. Test wiki page. Test wiki page. Test wiki page. Test wiki page. Test wiki page. Test wiki page. Test wiki page. Test wiki page. ");
		createPdf(new WikipagePdfCreator(wikipage));
	}

	private void createPdf(APdfCreator creator) {
		PdfBuilder pdf = new PdfBuilder();
		creator.build(pdf);
		File file = new File(OUTPUT_DIR + "/" + creator.getFilename() + ".pdf");
		pdf.write(file);
		log.info("PDF created:", file.getAbsolutePath());
	}

}
