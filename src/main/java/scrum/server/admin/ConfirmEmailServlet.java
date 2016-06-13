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
package scrum.server.admin;

import ilarkesto.core.base.Str;
import ilarkesto.core.logging.Log;
import ilarkesto.io.IO;
import ilarkesto.ui.web.HtmlBuilder;
import ilarkesto.webapp.RequestWrapper;

import java.io.IOException;

import scrum.server.WebSession;
import scrum.server.common.AKunagiServlet;

public class ConfirmEmailServlet extends AKunagiServlet {

	private static Log log = Log.get(ConfirmEmailServlet.class);
	private static final long serialVersionUID = 1;

	@Override
	protected void onRequest(RequestWrapper<WebSession> req) throws IOException {
		User user = getEntityByParameter(req, "user", User.class);
		if (user == null) {
			req.sendErrorForbidden();
			return;
		}
		String email = req.get("email");
		if (Str.isBlank(email) || !user.isEmail(email)) {
			req.sendErrorForbidden();
			return;
		}

		user.setEmailVerified(true);
		log.info("Email verified:", user);

		returnConfirmationPage(req);
	}

	private void returnConfirmationPage(RequestWrapper<WebSession> req) throws IOException {
		req.setContentTypeHtml();
		String url = webApplication.createUrl(null);
		HtmlBuilder html = new HtmlBuilder(req.getWriter(), IO.UTF_8);
		html.startHTML("en");
		html.startHEAD("Email confirmed");
		html.METArefresh(3, url);
		html.endHEAD();
		html.startBODY();
		html.startDIV().setStyle("width: 200px", "border: 1px solid lightgray", "padding: 10px", "margin: 100px auto",
			"text-align: center", "font-family: sans-serif;");
		html.text("Email confirmed. ");
		html.A(url, "Continue...");
		html.endDIV();
		html.endBODY();
		html.endHTML();
		html.flush();
	}
}
