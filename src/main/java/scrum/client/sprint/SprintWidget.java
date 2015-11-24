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
package scrum.client.sprint;

import ilarkesto.gwt.client.AFieldValueWidget;
import ilarkesto.gwt.client.TableBuilder;
import ilarkesto.gwt.client.editor.RichtextEditorWidget;
import ilarkesto.gwt.client.editor.TextOutputWidget;

import scrum.client.ScrumGwt;
import scrum.client.common.AScrumWidget;

import com.google.gwt.user.client.ui.Widget;

public class SprintWidget extends AScrumWidget {

	private Sprint sprint;

	public SprintWidget(Sprint sprint) {
		super();
		this.sprint = sprint;
	}

	@Override
	protected Widget onInitialization() {
		boolean completed = sprint.isCompleted();

		TableBuilder tb = ScrumGwt.createFieldTable();
		tb.setColumnWidths("80px", "100px", "80px", "100px", "80px");

		int cols = 6;
		tb.addFieldRow("Label", sprint.getLabelModel(), cols - 1);
		tb.addFieldRow("Goal", new RichtextEditorWidget(sprint.getGoalModel()), cols - 1);
		tb.addFieldRow("Releases", new AFieldValueWidget() {

			@Override
			protected void onUpdate() {
				setContent(ScrumGwt.createToHtmlItemsWidget(sprint.getReleases()));
			}
		});

		if (completed) {
			tb.addFieldRow("Velocity", new TextOutputWidget(sprint.getVelocityModel()), cols - 1);
		}

		tb.addField("Begin", sprint.getBeginModel());
		tb.addField("Length", sprint.getLengthInDaysModel());
		tb.addFieldRow("End", sprint.getEndModel());

		if (!completed) {
			tb.addFieldLabel("Stories");
			tb.addField("Completed", new AFieldValueWidget() {

				@Override
				protected void onUpdate() {
					setText(getCurrentProject().formatEfford(getSprint().getCompletedRequirementWork()));
				}
			});
			tb.addField("Estimated", new AFieldValueWidget() {

				@Override
				protected void onUpdate() {
					setText(getCurrentProject().formatEfford(getSprint().getEstimatedRequirementWork()));
				}
			});
			tb.nextRow();

			tb.addFieldLabel("Tasks");
			tb.addField("Burned", new AFieldValueWidget() {

				@Override
				protected void onUpdate() {
					setHours(getSprint().getBurnedWork());
				}
			});
			tb.addField("Remaining", new AFieldValueWidget() {

				@Override
				protected void onUpdate() {
					setHours(getSprint().getRemainingWork());
				}
			}, 2);
			tb.nextRow();
		} else {
			// completed
			if (sprint.getSprintReport() == null) {
				tb.addFieldRow("Completed Stories", new RichtextEditorWidget(getSprint()
					.getCompletedRequirementLabelsModel()), cols - 1);
			}
		}

		tb.addFieldRow("Planning Note", new RichtextEditorWidget(sprint.getPlanningNoteModel()), cols - 1);
		tb.addFieldRow("Review Note", new RichtextEditorWidget(sprint.getReviewNoteModel()), cols - 1);
		tb.addFieldRow("Retrospective Note", new RichtextEditorWidget(sprint.getRetrospectiveNoteModel()), cols - 1);

		return TableBuilder.row(10, tb.createTable(), ScrumGwt.createEmoticonsAndComments(sprint));
	}

	public Sprint getSprint() {
		return sprint;
	}

}
