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
package scrum.client.search;

import ilarkesto.core.base.Str;
import ilarkesto.core.scope.Scope;

import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import scrum.client.common.AScrumWidget;
import scrum.client.workspace.Navigator;

public class SearchInputWidget extends AScrumWidget {

	private TextBox input;
	private boolean dirty;

	@Override
	protected Widget onInitialization() {

		Scope.get().getComponent(Navigator.class).setSearch(this);

		input = new TextBox();
		input.getElement().setAttribute("placeholder", "Search...");
		input.removeStyleName("gwt-TextBox");
		input.addStyleName("form-control form-control-sm");
		input.addKeyUpHandler(new InputHandler());
		input.addKeyDownHandler(new SubmitHandler());

		SearchTimer timer = new SearchTimer();
		timer.scheduleRepeating(1000);

		return input;
	}

	@Override
	protected void onUpdate() {
		if (!Str.isBlank(input.getText())) input.setFocus(true);
	}

	private void submitSearch() {
		dirty = false;
		Scope.get().getComponent(Search.class).search(input.getText());
	}

	public void clear() {
		if (input != null) input.setText(null);
	}

	class InputHandler implements KeyUpHandler {

		@Override
		public void onKeyUp(KeyUpEvent event) {
			dirty = true;
		}

	}

	class SubmitHandler implements KeyDownHandler {

		@Override
		public void onKeyDown(KeyDownEvent event) {
			if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) submitSearch();
		}
	}

	class SearchTimer extends Timer {

		@Override
		public void run() {
			if (dirty && input.getText().length() > 3) {
				submitSearch();
			}
		}

	}

}
