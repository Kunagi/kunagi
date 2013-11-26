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

import ilarkesto.core.logging.Log;
import scrum.client.collaboration.Comment;
import scrum.client.common.AScrumGwtEntity;
import scrum.client.common.TooltipBuilder;
import scrum.client.issues.Issue;

public class ConvertTaskToIssueAction extends GConvertTaskToIssueAction {

	private static final Log LOG = Log.get(ConvertTaskToIssueAction.class);

	public ConvertTaskToIssueAction(scrum.client.sprint.Task task) {
		super(task);
	}

	@Override
	public String getLabel() {
		return "Convert to Issue";
	}

	@Override
	protected void updateTooltip(TooltipBuilder tb) {
		tb.setText("Convert current Task to Issue.");
		if (!getCurrentProject().isTeamMember(getCurrentUser())) tb.addRemark(TooltipBuilder.NOT_TEAM);
	}

	@Override
	public boolean isExecutable() {
		if (task.isClosed()) return false;
		if (task.isImpedimentSet()) return false;
		return true;
	}

	@Override
	public boolean isPermitted() {
		if (!getCurrentProject().isTeamMember(getCurrentUser())) return false;
		return true;
	}

	@Override
	protected void onExecute() {
		Issue issue = createIssueTask(task);
		copyComments(task, issue);
		task.deleteOrCloseIfBurned(getCurrentUser());
		addUndo(new Undo(issue));
	}

	private Issue createIssueTask(Task task) {
		Issue issue = getCurrentProject().createNewIssue();
		issue.setCreator(getCurrentUser());
		issue.setDescription(task.getDescription());
		issue.setLabel(task.getLabel());
		return issue;
	}

	private void copyComments(AScrumGwtEntity source, AScrumGwtEntity destination) {
		for (Comment sourceComment : source.getComments()) {
			Comment destinationComment = new Comment(destination, sourceComment.getAuthor(), sourceComment.getText());
			destinationComment.setDateAndTime(sourceComment.getDateAndTime());
			getDao().createComment(destinationComment);
		}
	}

	class Undo extends ALocalUndo {

		private Issue issue;

		public Undo(Issue issue) {
			this.issue = issue;
		}

		@Override
		public String getLabel() {
			return "Undo conversion of " + task.getReference() + " into issue " + issue.getReferenceAndLabel();
		}

		@Override
		protected void onUndo() {
			if (task.isClosed()) {
				task.setUnDone(getAuth().getUser());
			} else {
				getDao().createTask(task);
			}
			getDao().deleteIssue(issue);
		}

	}

}