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
package scrum.client.workspace;

import ilarkesto.core.base.Str;
import ilarkesto.core.scope.Scope;
import ilarkesto.core.time.TimePeriod;
import ilarkesto.core.time.Tm;
import ilarkesto.gwt.client.AServiceCall;

import java.util.List;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Widget;

import scrum.client.common.AScrumWidget;
import scrum.client.communication.Pinger;
import scrum.client.test.ScrumStatusWidget;

public class CommunicationIndicatorWidget extends AScrumWidget implements Runnable {

	private Pinger pinger;

	private FocusPanel focusPanel;
	private Style statusStyle;

	private long onTime;
	private boolean colorFlipper;

	@Override
	protected Widget onInitialization() {
		AServiceCall.listener = this;
		pinger = Scope.get().getComponent(Pinger.class);

		focusPanel = new FocusPanel();
		focusPanel.setSize("12px", "12px");
		statusStyle = focusPanel.getElement().getStyle();
		statusStyle.setBackgroundColor("#090");
		statusStyle.setProperty("borderRadius", "4px");
		focusPanel.addClickHandler(new StatusClickHandler());

		new Timer() {

			@Override
			public void run() {
				// if (onTime > 0) {
				// long onDuration = Tm.getCurrentTimeMillis() - onTime;
				// if (onDuration > 3000) {
				// statusStyle.setBackgroundColor("#f00");
				// focusPanel.setTitle("Waiting for server response since " + (onDuration / 1000) + "
				// seconds...");
				// return;
				// }
				// }

				if (pinger.isInErrorMode()) {
					statusStyle.setBackgroundColor(colorFlipper ? "#f00" : "#ff0");
					colorFlipper = !colorFlipper;
					focusPanel.setTitle("Communication problem since "
							+ new TimePeriod(Tm.getCurrentTimeMillis() - pinger.getErrorsTime()).toShortestString()
							+ ": " + Str.concat(pinger.getErrors(), ", "));
					return;
				}

				focusPanel.setTitle(pinger.getAvaragePingTimeMessage());
			}
		}.scheduleRepeating(1000);

		return focusPanel;
	}

	@Override
	public void run() {
		update();
	}

	@Override
	protected void onUpdate() {
		List<AServiceCall> calls = AServiceCall.getActiveServiceCalls();
		if (calls.isEmpty()) {
			if (isOn()) switchOff();
		} else {
			if (!isOn()) switchOn();
		}
	}

	private void switchOn() {
		onTime = Tm.getCurrentTimeMillis();
		statusStyle.setBackgroundColor("#aa6");
	}

	private void switchOff() {
		onTime = 0;
		statusStyle.setBackgroundColor("#666");
	}

	private boolean isOn() {
		return onTime > 0;
	}

	class StatusClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			Scope.get().getComponent(Ui.class).getWorkspace().getWorkarea().show(new ScrumStatusWidget());
			focusPanel.setFocus(false);
		}

	}

}
