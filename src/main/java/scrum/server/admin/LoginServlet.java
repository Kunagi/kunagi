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

import ilarkesto.auth.Auth;
import ilarkesto.auth.AuthenticationFailedException;
import ilarkesto.auth.OpenId;
import ilarkesto.base.Str;
import ilarkesto.base.Utl;
import ilarkesto.core.base.UserInputException;
import ilarkesto.core.logging.Log;
import ilarkesto.core.time.DateAndTime;
import ilarkesto.integration.ldap.Ldap;
import ilarkesto.io.IO;
import ilarkesto.ui.web.HtmlBuilder;
import ilarkesto.webapp.RequestWrapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpSession;

import org.openid4java.consumer.VerificationResult;

import scrum.client.ScrumGwtApplication;
import scrum.server.WebSession;
import scrum.server.common.AKunagiServlet;

public class LoginServlet extends AKunagiServlet {

	private static final long serialVersionUID = 1;

	private static Log log = Log.get(LoginServlet.class);

	@Override
	protected void onRequest(RequestWrapper<WebSession> req) throws IOException {
		String historyToken = req.get("historyToken");

		if (req.getSession().getUser() != null) {
			req.sendRedirect(getStartPage(historyToken));
			return;
		}

		if (tokenLogin(req)) {
			req.sendRedirect(getStartPage(historyToken));
			return;
		}

		if (OpenId.isOpenIdCallback(req.getHttpRequest())) {
			loginOpenId(req);
			return;
		}

		if (req.get("createAccount") != null) {
			createAccount(req.get("username"), req.get("email"), req.get("password"), historyToken, req);
			return;
		}

		if (req.get("passwordRequest") != null) {
			passwordRequest(req.get("email"), historyToken, req);
			return;
		}

		String openId = req.get("openid");
		if (openId != null) {
			redirectOpenId(openId, req.get("keepmeloggedin") != null, historyToken, req);
			return;
		}

		String username = req.get("username");
		if (username != null) {
			login(username, req.get("password"), req.get("keepmeloggedin") != null, historyToken, req);
			return;
		}

		renderLoginPage(req, null, null, historyToken, null, req.get("showPasswordRequest") != null,
			req.get("showCreateAccount") != null);
	}

	private void passwordRequest(String login, String historyToken, RequestWrapper<WebSession> req)
			throws UnsupportedEncodingException, IOException {
		if (login == null || Str.isBlank(login)) {
			renderLoginPage(req, login, null, historyToken, "E-Mail required.", true, false);
			return;
		}

		User user = null;
		if (login.contains("@")) {
			user = userDao.getUserByEmail(login.toLowerCase());
		}
		if (user == null) {
			user = userDao.getUserByName(login);
		}

		if (user == null) {
			renderLoginPage(req, login, login, historyToken, "User '" + login + "' does not exist.", true, false);
			return;
		}

		if (user.isAdmin()) {
			renderLoginPage(req, login, login, historyToken, "Admins can not request new passwords.", true, false);
			return;
		}

		if (!user.isEmailVerified()) {
			renderLoginPage(req, login, login, historyToken,
				"User '" + login + "' has no verified email. Please contact the admin: " + systemConfig.getAdminEmail(),
				true, false);
			return;
		}

		user.triggerNewPasswordRequest();
		renderLoginPage(req, login, login, historyToken, "New password has been sent to " + login, false, false);
	}

	private void createAccount(String username, String email, String password, String historyToken,
			RequestWrapper<WebSession> req) throws UnsupportedEncodingException, IOException {

		if (webApplication.getSystemConfig().isRegistrationDisabled()) {
			renderLoginPage(req, username, email, historyToken, "Creating account failed. Feature is disabled.", false,
				false);
			return;
		}

		if (Str.isBlank(username)) username = null;
		if (Str.isBlank(email)) email = null;
		if (Str.isBlank(password)) password = null;

		if (username == null) {
			renderLoginPage(req, username, email, historyToken, "Creating account failed. Username required.", false,
				true);
			return;
		}
		if (systemConfig.isUserEmailMandatory() && email == null) {
			renderLoginPage(req, username, email, historyToken, "Creating account failed. E-Mail required.", false,
				true);
			return;
		}
		if (password == null) {
			renderLoginPage(req, username, email, historyToken, "Creating account failed. Password required.", false,
				true);
			return;
		}

		if (Str.containsNonLetterOrDigit(username)) {
			renderLoginPage(req, username, email, historyToken, "Creating account failed. Name '" + username
					+ "' contains an illegal character. Only letters and digits allowed.",
				false, true);
			return;
		}

		if (email != null && !Str.isEmail(email)) {
			renderLoginPage(req, username, email, historyToken, "Creating account failed. Illegal email address.",
				false, true);
			return;
		}

		if (userDao.getUserByName(username) != null) {
			renderLoginPage(req, username, email, historyToken,
				"Creating account failed. Name '" + username + "' is already used.", false, true);
			log.warn("Registration failed. User name already exists:", username);
			return;
		}

		if (email != null && userDao.getUserByEmail(email) != null) {
			renderLoginPage(req, username, email, historyToken,
				"Creating account failed. Email '" + email + "' is already used.", false, true);
			log.warn("Registration failed. User email already exists:", email);
			return;
		}

		User user;
		try {
			user = userDao.postUser(email, username, password);
		} catch (UserInputException ex) {
			renderLoginPage(req, username, email, historyToken,
				"Creating account failed. Password rejected: " + ex.getMessage() + ".", false, true);
			return;
		}
		user.setLastLoginDateAndTime(DateAndTime.now());
		user.triggerEmailVerification();
		webApplication.triggerRegisterNotification(user, req.getRemoteHost());
		webApplication.sendToClients(user);

		req.getSession().setUser(user);
		req.sendRedirect(getStartPage(historyToken));
	}

	private String getStartPage(String historyToken) {
		String url = getDefaultStartPage();
		if (historyToken != null) url += "#" + historyToken;
		url = webApplication.createUrl(url);
		return url;
	}

	private void loginOpenId(RequestWrapper<WebSession> req) throws UnsupportedEncodingException, IOException {
		HttpSession httpSession = req.getHttpSession();
		String historyToken = req.getSessionAttributeAsString("openidHistoryToken");
		boolean keepmeloggedin = req.getSessionAttribute("openidKeepmeloggedin") != null;

		VerificationResult openIdResult;
		try {
			openIdResult = OpenId.getVerificationFromCallback(req.getHttpRequest());
		} catch (RuntimeException ex) {
			log.error("OpenID authentication failed.", ex);
			renderLoginPage(req, null, null, historyToken,
				"OpenID authentication failed: " + Str.format(Utl.getRootCause(ex)), false, false);
			return;
		}
		String openId = OpenId.getOpenId(openIdResult);
		if (openId == null) {
			renderLoginPage(req, null, null, historyToken, "OpenID authentication failed.", false, false);
			return;
		}

		String email = OpenId.getEmail(openIdResult);
		String nickname = OpenId.getNickname(openIdResult);
		String fullName = OpenId.getFullname(openIdResult);

		User user = userDao.getUserByOpenId(openId);

		if (user == null) {
			if (webApplication.getSystemConfig().isRegistrationDisabled()) {
				renderLoginPage(req, null, null, historyToken,
					"There is no user with the OpenID " + openId + " and creating new users is disabled.", false,
					false);
				return;
			}

			if (!webApplication.getSystemConfig().isOpenIdDomainAllowed(openId)) {
				renderLoginPage(req, null, null, historyToken, "Registration failed. OpenID domains are limited to: "
						+ webApplication.getSystemConfig().getOpenIdDomains(),
					false, false);
				log.warn("Registration failed. OpenID domains are limited to:",
					webApplication.getSystemConfig().getOpenIdDomains());
				return;
			}

			if (email != null) {
				if (userDao.getUserByEmail(email) != null) {
					renderLoginPage(req, null, null, historyToken,
						"Creating account failed. Email '" + email + "' is already used.", false, false);
					log.warn("Registration failed. Email already exists:", email);
					return;
				}
			}

			if (email == null && webApplication.getSystemConfig().isUserEmailMandatory()) {
				renderLoginPage(req, null, null, historyToken,
					"Creating account failed. Required email address was not included in OpenID response.", false,
					false);
				return;
			}

			user = userDao.postUserWithOpenId(openId, nickname, fullName, email);
			webApplication.triggerRegisterNotification(user, req.getRemoteHost());
		}

		log.info("User authenticated by OpenID:", openId, "->", user);

		if (user.isDisabled()) {
			renderLoginPage(req, null, null, historyToken, "User is disabled.", false, false);
			return;
		}

		user.setLastLoginDateAndTime(DateAndTime.now());
		if (!user.isEmailSet()) user.setEmail(email);
		req.getSession().setUser(user);

		if (keepmeloggedin)
			req.setCookie(ScrumGwtApplication.LOGIN_TOKEN_COOKIE, user.getLoginToken(), LOGIN_TOKEN_COOKIE_MAXAGE);

		req.sendRedirect(getStartPage(historyToken));
	}

	private void redirectOpenId(String openId, boolean keepmeloggedin, String historyToken,
			RequestWrapper<WebSession> req) throws UnsupportedEncodingException, IOException {
		if (Str.isBlank(openId)) openId = null;

		if (openId == null) {
			renderLoginPage(req, null, null, historyToken, "Login failed. OpenID required.", false, true);
			return;
		}

		String returnUrl = webApplication.createUrl("login.html");
		if (!returnUrl.startsWith("http")) {
			returnUrl = req.getUrl();
		}

		String openIdUrl;
		try {
			openIdUrl = OpenId.createAuthenticationRequestUrl(openId, returnUrl, req.getHttpSession(), true, false,
				false, false, true, webApplication.getSystemConfig().isUserEmailMandatory());
		} catch (RuntimeException ex) {
			log.error("OpenID authentication failed.", ex);
			renderLoginPage(req, null, null, historyToken,
				"OpenID authentication failed: " + Str.format(Utl.getRootCause(ex)), false, false);
			return;
		}

		req.setSessionAttribute("openidHistoryToken", historyToken);
		req.setSessionAttribute("openidKeepmeloggedin", keepmeloggedin ? "true" : null);

		req.sendRedirect(openIdUrl);
	}

	private void login(String username, String password, boolean keepmeloggedin, String historyToken,
			RequestWrapper<WebSession> req) throws UnsupportedEncodingException, IOException {
		User user = null;
		if (username.contains("@")) user = userDao.getUserByEmail(username.toLowerCase());
		if (user == null) user = userDao.getUserByName(username);

		boolean admin = user != null && user.isAdmin();
		boolean authenticated;
		if (systemConfig.isLdapEnabled(true) && !admin) {
			// LDAP authentication
			String email = null;
			try {
				email = Ldap.authenticateUserGetEmail(systemConfig.getLdapUrl(), systemConfig.getLdapUser(),
					systemConfig.getLdapPassword(), systemConfig.getLdapBaseDn(), systemConfig.getLdapUserFilterRegex(),
					username, password);
				authenticated = true;
			} catch (AuthenticationFailedException ex) {
				authenticated = false;
			} catch (Exception ex) {
				log.error("LDAP authentication failed.", ex);
				renderLoginPage(req, username, null, historyToken,
					"LDAP authentication failed: " + Utl.getRootCauseMessage(ex), false, false);
				return;
			}

			if (authenticated && user == null) {
				if (webApplication.getSystemConfig().isRegistrationDisabled()) {
					renderLoginPage(req, null, null, historyToken,
						"There is no user " + username + " and creating new users is disabled.", false, false);
					return;
				}

				if (userDao.getUserByEmail(email) != null) {
					renderLoginPage(req, null, null, historyToken,
						"User with email " + email + " already exists: " + email, false, false);
					return;
				}

				try {
					user = userDao.postUser(email, username, Str.generatePassword(23));
				} catch (Exception ex) {
					log.warn(ex);
					renderLoginPage(req, username, null, historyToken, "Creating a new user <" + username
							+ "> with email <" + email + "> failed: " + Utl.getRootCauseMessage(ex),
						false, false);
					return;
				}
				if (Str.isEmail(email)) user.setEmail(email);
				webApplication.triggerRegisterNotification(user, req.getRemoteHost());
			}
		} else {
			// default password authentication
			authenticated = user != null && Auth.isPasswordMatching(password, user, new KunagiAuthenticationContext());
		}

		if (!authenticated || user == null) {
			renderLoginPage(req, username, null, historyToken, "Login failed.", false, false);
			return;
		}

		if (user.isDisabled()) {
			renderLoginPage(req, username, null, historyToken, "Login failed.", false, false);
			return;
		}

		user.setLastLoginDateAndTime(DateAndTime.now());
		req.getSession().setUser(user);

		if (keepmeloggedin)
			req.setCookie(ScrumGwtApplication.LOGIN_TOKEN_COOKIE, user.getLoginToken(), LOGIN_TOKEN_COOKIE_MAXAGE);

		req.sendRedirect(getStartPage(historyToken));
	}

	private void renderLoginPage(RequestWrapper<WebSession> req, String username, String email, String historyToken,
			String message, boolean passwordRequest, boolean createAccount)
			throws UnsupportedEncodingException, IOException {
		if (webApplication.getSystemConfig().isRegistrationDisabled()) createAccount = false;

		String charset = IO.UTF_8;
		req.setContentTypeHtml();

		HtmlBuilder html = new HtmlBuilder(req.getWriter(), charset);
		html.startHTML("en");

		String title = "Kunagi Login";
		if (webApplication.getConfig().isShowRelease()) title += " " + applicationInfo.getRelease();
		if (systemConfig.isInstanceNameSet()) title += " @ " + systemConfig.getInstanceName();
		html.startHEAD(title);
		html.LINKfavicon();
		html.startSTYLEcss();
		html.html(getCss());
		html.endSTYLE();
		html.endHEAD();

		html.startBODY().setId("body");
		html.startDIV("loginPage");
		html.startDIV("panel");
		String logoUrl = webApplication.getSystemConfig().getLoginPageLogoUrl();
		if (Str.isBlank(logoUrl)) logoUrl = "kunagi.png";
		html.IMG(logoUrl, "Kunagi", null, null, null, null);
		html.DIV("separator", null);
		if (message != null) renderMessage(html, message);
		if (!createAccount && !passwordRequest) renderLogin(html, username, historyToken);
		if (passwordRequest) renderPasswordRequest(html, username, historyToken);
		if (createAccount) renderCreateAccount(html, username, email, historyToken);
		html.DIV("separator", null);
		html.startDIV("kunagiLink");
		html.text("Kunagi " + webApplication.getBuildProperties().getReleaseLabel() + " | ");
		html.A("http://kunagi.org", "kunagi.org");
		html.endDIV();
		html.endDIV();

		html.endDIV();
		html.comment(applicationInfo.toString());

		html.SCRIPTjavascript(null, "document.getElementById('username').focus();");

		String analyticsId = systemConfig.getGoogleAnalyticsId();
		if (analyticsId != null) html.googleAnalytics(analyticsId);
		html.endBODY();
		html.endHTML();
		html.flush();
	}

	private void renderLogin(HtmlBuilder html, String username, String historyToken) {
		if (!webApplication.getSystemConfig().isOpenIdDisabled()) {
			html.H2("Login with OpenID");
			renderOpenIdLoginForm(html, historyToken);
			html.DIV("separator", null);
			html.H2("Login with Password");
		}

		renderRetroLoginForm(html, username, historyToken);
		html.BR();
		html.A("login.html?showPasswordRequest=true", "Forgot your password?");
		if (!systemConfig.isRegistrationDisabled()) {
			html.nbsp();
			html.nbsp();
			html.A("login.html?showCreateAccount=true", "Create new account");
		}

		if (webApplication.isAdminPasswordDefault()) {
			html.DIV("separator", null);
			html.startDIV("configMessage");
			html.html("<h2>Warning!</h2>The administrator user <code>admin</code> has the default password <code>"
					+ systemConfig.getDefaultUserPassword() + "</code>. Please change it.");
			html.endDIV();
		}

		if (systemConfig.isLoginPageMessageSet()) {
			html.DIV("separator", null);
			html.startDIV("configMessage");
			html.html(systemConfig.getLoginPageMessage());
			html.endDIV();
		}
	}

	public void renderRetroLoginForm(HtmlBuilder html, String username, String historyToken) {
		html.startFORM(null, "loginForm", false);
		html.INPUThidden("historyToken", historyToken);
		html.startTABLE().setAlignCenter();

		html.startTR();
		html.startTD();
		html.LABEL("username", "Username / E-Mail");
		html.endTD();
		html.startTD();
		html.LABEL("password", "Password");
		html.endTD();
		html.endTR();

		html.startTR();
		html.startTD();
		html.INPUTtext("username", "username", username, 80);
		html.endTD();
		html.startTD();
		html.INPUTpassword("password", "password", null, 80, "");
		html.endTD();
		html.endTR();

		html.startTR();
		html.startTD();
		html.INPUTcheckbox("keepmeloggedin", "keepmeloggedin", true, null);
		html.LABEL("keepmeloggedin", "Keep me logged in");
		html.endTD();
		html.startTD().setAlignRight();
		html.INPUTsubmit("login", "Login", null, 's');
		html.endTD();
		html.endTR();

		html.endTABLE();
		html.endFORM();
	}

	public void renderOpenIdLoginForm(HtmlBuilder html, String historyToken) {
		renderOpenIdLink(OpenId.MYOPENID, "MyOpenID", historyToken, html);
		renderOpenIdLink(OpenId.GOOGLE, "Google", historyToken, html);
		renderOpenIdLink(OpenId.YAHOO, "Yahoo!", historyToken, html);
		renderOpenIdLink(OpenId.LAUNCHPAD, "Launchpad", historyToken, html);
		renderOpenIdLink(OpenId.AOL, "AOL", historyToken, html);
		renderOpenIdLink(OpenId.VERISIGN, "Verisign", historyToken, html);
		renderOpenIdLink(OpenId.WORDPRESS, "WordPress", historyToken, html);
		renderOpenIdLink(OpenId.FLICKR, "Flickr", historyToken, html);
		// renderOpenIdLink(OpenId.BLOGSPOT, "Blogger", historyToken, html);
		renderOpenIdLink(OpenId.MYVIDOOP, "Vidoop", historyToken, html);
		html.DIVclear();
		html.BR();

		html.startFORM(null, "openIdForm", false);
		html.INPUThidden("historyToken", historyToken);
		html.startTABLE().setAlignCenter();

		html.startTR();
		html.startTD();
		html.LABEL("openid", "Custom OpenID");
		html.endTD();
		html.TD("");
		html.endTR();

		html.startTR();
		html.startTD(null, 2);
		html.INPUTtext("openid", "openid", null, 80);
		html.endTD();
		html.endTR();

		html.startTR();
		html.startTD();
		html.INPUTcheckbox("keepmeloggedinOpenId", "keepmeloggedin", true, null);
		html.LABEL("keepmeloggedinOpenId", "Keep me logged in");
		html.endTD();
		html.startTD().setAlignRight();
		html.INPUTsubmit("login", "Login", null, 's');
		html.endTD();
		html.endTR();

		html.endTABLE();
		html.BR();
		html.A("http://openid.net/get-an-openid/", "Don't have an OpenID?", true);
		html.endFORM();
	}

	private void renderOpenIdLink(String openId, String label, String historyToken, HtmlBuilder html) {
		StringBuilder sb = new StringBuilder();
		sb.append("login.html?openid=").append(Str.encodeUrlParameter(openId));
		sb.append("&login=Login");
		if (historyToken != null) sb.append("&historyToken=").append(Str.encodeUrlParameter(historyToken));
		html.startA("openid", sb.toString());
		html.startDIV("button");
		html.text(label);
		html.endDIV();
		html.endA();
	}

	private void renderPasswordRequest(HtmlBuilder html, String username, String historyToken) {
		html.H2("Request new password");
		html.startFORM(null, "passwordRequestForm", false);
		html.INPUThidden("historyToken", historyToken);
		html.startTABLE().setAlignCenter();

		html.startTR();
		html.startTD();
		html.LABEL("email", "E-Mail");
		html.endTD();
		html.TD(" ");
		html.endTR();

		html.startTR();
		html.startTD();
		html.INPUTtext("email", "email", username, 80);
		html.endTD();
		html.startTD();
		html.INPUTsubmit("passwordRequest", "Request password", null, 's');
		html.endTD();
		html.endTR();

		html.endTABLE();
		html.endFORM();

		html.BR();
		html.A("login.html", "Back to Login");
	}

	private void renderCreateAccount(HtmlBuilder html, String username, String email, String historyToken) {
		html.H2("Create account");
		html.startDIV("createAccount");
		html.startFORM(null, "loginForm", false);
		html.INPUThidden("historyToken", historyToken);
		html.startTABLE().setAlignCenter();

		html.startTR();
		html.startTD();
		html.LABEL("username", "Username");
		html.endTD();
		html.startTD();
		html.INPUTtext("username", "username", username, 80);
		html.endTD();
		html.endTR();

		html.startTR();
		html.startTD();
		if (!webApplication.getSystemConfig().isUserEmailMandatory()) html.startDIV("optionalLabel");
		html.LABEL("email", "E-Mail");
		if (!webApplication.getSystemConfig().isUserEmailMandatory()) html.endDIV();
		html.endTD();
		html.startTD();
		html.INPUTtext("email", "email", email, 80);
		html.endTD();
		html.endTR();

		html.startTR();
		html.startTD();
		html.LABEL("password", "Password");
		html.endTD();
		html.startTD();
		html.INPUTpassword("password", "password", null, 80, "");
		html.endTD();
		html.endTR();

		html.startTR();
		html.TD("");
		html.startTD();
		html.INPUTsubmit("createAccount", "Create account", null, 's');
		html.endTD();
		html.endTR();

		html.endTABLE();
		html.endFORM();
		html.endDIV();

		html.BR();
		html.A("login.html", "Back to Login");

		if (systemConfig.isRegisterPageMessageSet()) {
			html.DIV("separator", null);
			html.startDIV("configMessage");
			html.html(systemConfig.getRegisterPageMessage());
			html.endDIV();
		}
	}

	private void renderMessage(HtmlBuilder html, String message) {
		html.startDIV("message");
		html.text(message);
		html.endDIV();
		html.DIV("separator", null);
	}

}
