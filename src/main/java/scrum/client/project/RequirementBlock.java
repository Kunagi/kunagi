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
package scrum.client.project;

import ilarkesto.core.time.Date;
import ilarkesto.core.time.TimePeriod;
import ilarkesto.gwt.client.AnchorPanel;
import scrum.client.collaboration.EmoticonsWidget;
import scrum.client.common.ABlockWidget;
import scrum.client.common.AScrumAction;
import scrum.client.common.BlockHeaderWidget;
import scrum.client.common.BlockWidgetFactory;
import scrum.client.dnd.TrashSupport;
import scrum.client.img.Img;
import scrum.client.journal.ActivateChangeHistoryAction;
import scrum.client.sprint.Sprint;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

public class RequirementBlock extends ABlockWidget<Requirement> implements TrashSupport {

	public RequirementBlock() {}

	private AnchorPanel statusIcon;
	private SprintSwitchIndicatorWidget sprintBorderIndicator;

	@Override
	protected void onInitializationHeader(BlockHeaderWidget header) {
		Requirement requirement = getObject();
		statusIcon = header.addIconWrapper();
		header.addText(requirement.getLabelModel());
		header.addText(requirement.getThemesAsStringModel(), true, false);
		header.addText(requirement.getEstimatedWorkWithUnitModel(), true);

		header.appendOuterCell(new EmoticonsWidget(requirement), null, true);
		header.appendOuterCell(new EstimationBarWidget(requirement), "150px", true);

		header.addMenuAction(new AddRequirementToCurrentSprintAction(requirement));
		header.addMenuAction(new RemoveRequirementFromSprintAction(requirement));
		header.addMenuAction(new MoveRequirementToTopAction(requirement));
		header.addMenuAction(new MoveRequirementToBottomAction(requirement));
		header.addMenuAction(new SetRequirementDirtyAction(requirement));
		header.addMenuAction(new SetRequirementCleanAction(requirement));
		header.addMenuAction(new StartRequirementEstimationVotingAction(requirement));
		header.addMenuAction(new SplitRequirementAction(requirement));
		header.addMenuAction(new ActivateChangeHistoryAction(requirement));
		header.addMenuAction(new RemoveRequirementFromBacklogAction(requirement));
		header.addMenuAction(new DeleteRequirementAction(requirement));
	}

	@Override
	protected void onUpdateHeader(BlockHeaderWidget header) {
		Requirement requirement = getObject();
		header.setDragHandle(requirement.getReference());
		Image statusImage = null;
		if (requirement.isWorkEstimationVotingActive()) {
			statusImage = Img.bundle.reqPoker().createImage();
			statusImage.setTitle("Estimation game \"Planning Poker\" active.");
		} else if (requirement.isInCurrentSprint()) {
			statusImage = Img.bundle.reqInSprint().createImage();
			statusImage.setTitle("In current sprint.");
		} else if (requirement.isClosed()) {
			statusImage = Img.bundle.reqClosed().createImage();
			statusImage.setTitle("Closed.");
		} else if (!requirement.isEstimatedWorkValid()) {
			statusImage = Img.bundle.reqDirty().createImage();
			statusImage.setTitle("Needs estimation.");
		}
		statusIcon.setWidget(statusImage);

		boolean sprintBorder = false;
		Requirement previous = getList().getPrevious(requirement);
		if (previous != null) {
			EstimationBar previousEstimationBar = previous.getEstimationBar();
			sprintBorder = !requirement.getEstimationBar().isCompetedOnSameSprint(previousEstimationBar);
		}

		if (previous != null && sprintBorder) {
			if (sprintBorderIndicator == null) {
				sprintBorderIndicator = new SprintSwitchIndicatorWidget();
				getPreHeaderPanel().add(sprintBorderIndicator);
			}
			Sprint sprint = getCurrentProject().getNextSprint();
			int sprints = previous.getEstimationBar().getEndSprintOffset();
			TimePeriod sprintLength = sprint.getLength();
			int sprintLengthInDays = sprintLength == null ? 14 : sprintLength.toDays();
			Date begin = sprint.getBegin();
			if (begin == null || begin.isPast()) begin = new Date();
			int totalLength = sprintLengthInDays * (sprints + 1);
			Date date = begin.addDays(totalLength);
			sprintBorderIndicator.updateLabel(sprints + 1, date, isUncertain(previous));
			requirement.updateLocalModificationTime();
		} else {
			if (sprintBorderIndicator != null) {
				getPreHeaderPanel().remove(sprintBorderIndicator);
				sprintBorderIndicator = null;
				requirement.updateLocalModificationTime();
			}
		}
	}

	private boolean isUncertain(Requirement requirement) {
		if (requirement == null) return false;
		if (!requirement.isEstimatedWorkValid()) return true;
		return isUncertain(getList().getPrevious(requirement));
	}

	@Override
	protected String getUpdateSignature() {
		// if (true) return null;
		if (isExtended()) return null;
		Requirement r = getObject();
		EstimationBar eb = r.getEstimationBar();
		return super.getUpdateSignature() + r.getLabel() + r.getEstimatedWork() + r.isEstimatedWorkValid()
				+ r.isWorkEstimationVotingActive() + eb.getSprintOffset() + eb.getEndSprintOffset()
				+ r.getProject().getVelocity();
	}

	@Override
	protected Widget onExtendedInitialization() {
		return new RequirementWidget(getObject(), true, false, false, true, true, true, false);
	}

	@Override
	public AScrumAction getTrashAction() {
		return new DeleteRequirementAction(getObject());
	}

	public static final BlockWidgetFactory<Requirement> FACTORY = new BlockWidgetFactory<Requirement>() {

		@Override
		public RequirementBlock createBlock() {
			return new RequirementBlock();
		}
	};

}
