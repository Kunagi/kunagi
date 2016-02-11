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
package scrum.server.issues;

import ilarkesto.base.Str;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.integration.kunagi.KunagiConnector;
import ilarkesto.webapp.RequestWrapper;
import ilarkesto.webapp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;

import scrum.server.WebSession;
import scrum.server.common.AKunagiServlet;
import scrum.server.common.KunagiUtl;
import scrum.server.common.SpamChecker;
import scrum.server.journal.ProjectEvent;
import scrum.server.journal.ProjectEventDao;
import scrum.server.pr.SubscriptionService;
import scrum.server.project.Project;
import scrum.server.project.ProjectDao;

public class IssueServlet extends AKunagiServlet {

	private static final long serialVersionUID = 1;

	private static Log log = Log.get(IssueServlet.class);

	private transient IssueDao issueDao;
	private transient ProjectDao projectDao;
	private transient ProjectEventDao projectEventDao;
	private transient SubscriptionService subscriptionService;

	@Override
	protected void onRequest(RequestWrapper<WebSession> req) throws IOException {

		String projectId = req.get("projectId");
		String subject = req.get("subject");
		String text = req.get("text");
		String additionalInfo = req.get("additionalInfo");
		String externalTrackerId = req.get("externalTrackerId");
		String name = Str.cutRight(req.get("name"), 33);
		if (Str.isBlank(name)) name = null;
		String email = Str.cutRight(req.get("email"), 66);
		if (Str.isBlank(email)) email = null;
		boolean publish = Str.isTrue(req.get("publish"));
		boolean wiki = Str.isTrue(req.get("wiki"));

		log.info("Message from the internets");
		log.info("    projectId: " + projectId);
		log.info("    name: " + name);
		log.info("    email: " + email);
		log.info("    publish: " + publish);
		log.info("    wiki: " + wiki);
		log.info("    subject: " + subject);
		log.info("    text: " + text);
		log.info("    additionalInfo: " + additionalInfo);
		log.info("    externalTrackerId: " + externalTrackerId);
		log.info("  Request-Data:");
		log.info(Servlet.toString(req.getHttpRequest(), "        "));

		String message;
		if (text != null && text.contains(KunagiConnector.SPAM_PREVENTION_TEXT)) {
			text = text.replace(KunagiConnector.SPAM_PREVENTION_TEXT, "");
			message = submitIssue(projectId, subject, text, additionalInfo, externalTrackerId, name, email, wiki,
				publish, req.getRemoteHost());
		} else {
			try {
				SpamChecker.check(text, name, email, req);
				message = submitIssue(projectId, subject, text, additionalInfo, externalTrackerId, name, email, wiki,
					publish, req.getRemoteHost());
			} catch (Exception ex) {
				log.error("Submitting issue failed.", "\n" + Servlet.toString(req.getHttpRequest(), "  "), ex);
				message = "<h2>Failure</h2><p>Submitting your feedback failed: <strong>" + Utl.getRootCauseMessage(ex)
						+ "</strong></p><p>We are sorry, please try again later.</p>";
			}
		}

		String returnUrl = req.get("returnUrl");
		if (returnUrl != null) {
			returnUrl = returnUrl.replace("{message}", Str.encodeUrlParameter(message));
			req.sendRedirect(returnUrl);
			return;
		}

		req.setContentType("text/html");
		PrintWriter out = req.getWriter();
		out.print(message);
	}

	private String submitIssue(String projectId, String label, String text, String additionalInfo,
			String externalTrackerId, String name, String email, boolean wiki, boolean publish, String remoteHost) {
		if (projectId == null) throw new RuntimeException("projectId == null");
		if (Str.isBlank(label))
			throw new RuntimeException("Subject is empty, but required. Please write a short title for your issue.");
		if (Str.isBlank(text))
			throw new RuntimeException("Text is empty, but required. Please wirte a short description of your issue.");
		Project project = projectDao.getById(projectId);
		String textAsWiki = wiki ? text : "<nowiki>" + text + "</nowiki>";
		Issue issue = issueDao.postIssue(project, label, textAsWiki, additionalInfo, externalTrackerId, name, email,
			publish);
		if (publish) {
			project.updateHomepage(issue);
		}
		String issuer = issue.getIssuer();
		if (Str.isBlank(issuer)) issuer = "anonymous";
		ProjectEvent event = projectEventDao.postEvent(project, issuer + " submitted " + issue.getReferenceAndLabel(),
			issue);
		if (Str.isEmail(email)) subscriptionService.subscribe(email, issue);

		webApplication.sendToConversationsByProject(project, issue);
		webApplication.sendToConversationsByProject(project, event);

		String issueLink = publish ? KunagiUtl.createExternalRelativeHtmlAnchor(issue) : "<code>"
				+ issue.getReference() + "</code>";
		return "<h2>Feedback submitted</h2><p>Thank you for your feedback!</p><p>Your issue is now known as "
				+ issueLink + " and will be reviewed by our Product Owner.</p>";
	}

	@Override
	protected void onInit(ServletConfig config) {
		super.onInit(config);
		issueDao = webApplication.getIssueDao();
		projectDao = webApplication.getProjectDao();
		projectEventDao = webApplication.getProjectEventDao();
		subscriptionService = webApplication.getSubscriptionService();
	}

}