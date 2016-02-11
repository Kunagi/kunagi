package scrum.server.common;

import ilarkesto.base.Utl;
import ilarkesto.core.base.Str;
import ilarkesto.core.logging.Log;
import ilarkesto.integration.kunagi.KunagiConnector;
import ilarkesto.webapp.RequestWrapper;

import scrum.server.WebSession;

public class SpamChecker {

	private static final Log log = Log.get(SpamChecker.class);

	private static int score(String text, String name, String email, RequestWrapper<WebSession> req) {
		String spamPreventionCode = req.get(KunagiConnector.PARAM_SPAM_PREVENTION_CODE);
		if (!KunagiConnector.SPAM_PREVENTION_CODE.equals(spamPreventionCode)) return 100;

		int spamScore = 0;

		if (Str.isBlank(name)) spamScore += 10;
		if (Str.isBlank(email)) spamScore += 10;

		if (name != null) {
			name = name.toLowerCase();
			if (name.contains("pharm")) spamScore += 25;
			if (Str.containsDigit(name)) spamScore += 10;
		}

		if (text != null) {
			text = text.toLowerCase();
			if (text.contains("http://") || text.contains("https://")) spamScore += 25;
			if (text.contains("very nice site!")) spamScore += 25;
			if (text.contains("cheap goods")) spamScore += 25;
			if (text.contains("opeaixy2.com")) spamScore += 49;
		}

		return spamScore;
	}

	public static void check(String text, String name, String email, RequestWrapper<WebSession> req) {
		int score = score(text, name, email, req);
		if (score >= 50) {
			log.info("SPAM identified:", name, email, text);
			Utl.sleep(10000);
			throw new RuntimeException("HTTP Request identified as SPAM.");
		}
	}

}
