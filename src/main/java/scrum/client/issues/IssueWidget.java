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
package scrum.client.issues;

import ilarkesto.core.base.Str;
import ilarkesto.core.base.Utl;
import ilarkesto.gwt.client.AMultiSelectionViewEditWidget;
import ilarkesto.gwt.client.AOutputViewEditWidget;
import ilarkesto.gwt.client.ButtonWidget;
import ilarkesto.gwt.client.Gwt;
import ilarkesto.gwt.client.TableBuilder;
import ilarkesto.gwt.client.desktop.Widgets;
import ilarkesto.gwt.client.editor.AFieldModel;
import ilarkesto.gwt.client.editor.DropdownEditorWidget;
import ilarkesto.gwt.client.editor.TextOutputWidget;

import java.util.Collections;
import java.util.List;

import scrum.client.ScrumGwt;
import scrum.client.collaboration.CommentsWidget;
import scrum.client.collaboration.EmoticonSelectorWidget;
import scrum.client.common.AScrumWidget;
import scrum.client.common.ThemesWidget;
import scrum.client.journal.ChangeHistoryWidget;
import scrum.client.project.Project;
import scrum.client.release.Release;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class IssueWidget extends AScrumWidget {

	private Issue issue;
	private boolean fixedOnInitialization;

	public IssueWidget(Issue issue) {
		super();
		this.issue = issue;
	}

	@Override
	protected Widget onInitialization() {
		fixedOnInitialization = issue.isFixed();

		TableBuilder left = ScrumGwt.createFieldTable();
		left.addFieldRow("Label", issue.getLabelModel());

		Project project = issue.getProject();
		if (!Str.isBlank(project.getExternalTrackerUrlTemplate())) {
			left.addFieldRow(project.getExternalTrackerLabelOrDefault() + " ID", issue.getExternalTrackerIdModel());
		}

		if (issue.isBug()) {
			left.addFieldRow("Severity", new DropdownEditorWidget<Integer>(issue.getSeverityModel(),
					Issue.SEVERITY_LABELS));
		}
		left.addFieldRow("Description", issue.getDescriptionModel());
		left.addFieldRow("Additional info", issue.getAdditionalInfoModel());
		left.addFieldRow("Themes", new ThemesWidget(issue));
		left.addFieldRow("Issuer", new TextOutputWidget(new AFieldModel<String>() {

			@Override
			public String getValue() {
				return issue.getIssuer();
			}

			@Override
			public String getTooltip() {
				return "Person who created this issue.";
			}
		}));
		left.addFieldRow("Date", new TextOutputWidget(new AFieldModel<String>() {

			@Override
			public String getValue() {
				return issue.getDate().toString();
			}

			@Override
			public String getTooltip() {
				return "Person who created this issue.";
			}
		}));
		left.addFieldRow("Statement", issue.getStatementModel());
		left.addFieldRow("Affected releases", new AMultiSelectionViewEditWidget<Release>() {

			@Override
			protected void onViewerUpdate() {
				setViewerItemsAsHtml(issue.getAffectedReleases());
			}

			@Override
			protected void onEditorUpdate() {
				List<Release> releases = issue.getProject().getReleasedReleases();
				Collections.sort(releases, Release.DATE_REVERSE_COMPARATOR);
				setEditorItems(releases);
				setEditorSelectedItems(issue.getAffectedReleases());
			}

			@Override
			protected void onEditorSubmit() {
				issue.setAffectedReleases(getEditorSelectedItems());
			}

			@Override
			public boolean isEditable() {
				return true;
			}

			@Override
			public String getTooltip() {
				return "Releases on which this issue is related to. This could be the release, where the issue was discovered.";
			}
		});
		left.addFieldRow("Fix releases", new AMultiSelectionViewEditWidget<Release>() {

			@Override
			protected void onViewerUpdate() {
				setViewerItemsAsHtml(issue.getFixReleases());
			}

			@Override
			protected void onEditorUpdate() {
				List<Release> releases = Utl.sort(issue.getProject().getReleases(), Release.DATE_REVERSE_COMPARATOR);
				setEditorItems(releases);
				setEditorSelectedItems(issue.getFixReleases());
			}

			@Override
			protected void onEditorSubmit() {
				issue.setFixReleases(getEditorSelectedItems());
			}

			@Override
			public boolean isEditable() {
				return true;
			}

			@Override
			public String getTooltip() {
				return "Releases to which this issue is or will be fixed.";
			}
		});

		left.addFieldRow("Related Issues", new AOutputViewEditWidget() {

			@Override
			protected void onViewerUpdate() {
				setViewer(ScrumGwt.createToHtmlItemsWidget(issue.getRelatedIssues()));
			}
		});

		left.addFieldRow("Related Stories", new AOutputViewEditWidget() {

			@Override
			protected void onViewerUpdate() {
				setViewer(ScrumGwt.createToHtmlItemsWidget(issue.getRelatedRequirements()));
			}
		});

		if (issue.getProject().getHomepageDir() != null) {
			left.addFieldRow("Published", new AOutputViewEditWidget() {

				@Override
				protected void onViewerUpdate() {
					if (issue.isPublished()) {
						String url = issue.getProject().getHomepageUrl();
						if (Str.isBlank(url)) {
							setViewer(new Label("Yes"));
						} else {
							if (!url.endsWith("/")) url += "/";
							url += issue.getReference() + ".html";
							setViewer(Widgets.link(url));
						}
					} else {
						setViewer(new Label("No"));
					}
				}
			});
		}
		left.addRow(new ChangeHistoryWidget(issue), 2);

		TableBuilder right = ScrumGwt.createFieldTable();
		if (issue.isOpen() && issue.getProject().isProductOwner(getCurrentUser())) {
			right.addRow(createActionsPanelForOpenIssue(), 2);
			right.addRow(ScrumGwt.createSpacer(1, 10), 2);
		} else if (issue.isBug() && issue.isFixed() && issue.getProject().isProductOwner(getCurrentUser())) {
			right.addRow(createActionsPanelForFixedIssue(), 2);
			right.addRow(ScrumGwt.createSpacer(1, 10), 2);
		}
		right.addFieldRow("My emoticon", new EmoticonSelectorWidget(issue));
		right.addRow(new CommentsWidget(issue), 2);

		return TableBuilder.row(20, left.createTable(), right.createTable());
	}

	@Override
	protected boolean isResetRequired() {
		return fixedOnInitialization && !issue.isFixed();
	}

	private Widget createActionsPanelForOpenIssue() {
		TableBuilder tb = new TableBuilder();
		tb.setWidth(null);
		tb.setColumnWidths("30%", "10", "30%", "10", "30%");

		tb.addRow(new Label("This issue is open. As Product Owner, you have to decide:"), 5);
		tb.addRow(Gwt.createSpacer(1, 10));

		tb.add(new ButtonWidget(new AcceptIssueAsIdeaAction(issue)));
		tb.add(Gwt.createSpacer(10, 1));
		tb.add(new ButtonWidget(new AcceptIssueAsBugAction(issue)));
		tb.add(Gwt.createSpacer(10, 1));
		tb.add(new ButtonWidget(new CloseIssueAction(issue)));
		tb.nextRow();
		tb.addRow(Gwt.createSpacer(1, 10));

		tb.add(new Label("If this Issue is an idea, which needs to by converted to a Story by the Product Owner."));
		tb.add(Gwt.createSpacer(10, 1));
		tb.add(new Label("If this Issue is a bug, which needs to be fixed by the Team."));
		tb.add(Gwt.createSpacer(10, 1));
		tb.add(new Label("If this Issue makes no sense, is a duplicate or is already fixed."));

		return ScrumGwt.createActionsPanel(tb.createTable());
	}

	private Widget createActionsPanelForFixedIssue() {
		TableBuilder tb = new TableBuilder();
		tb.setWidth(null);
		tb.setColumnWidths("48%", "10", "48%");

		tb.addRow(new Label("This issue is fixed. As Product Owner, you have to decide:"), 3);
		tb.addRow(Gwt.createSpacer(1, 10));

		tb.add(new ButtonWidget(new CloseIssueAction(issue)));
		tb.add(Gwt.createSpacer(10, 1));
		tb.add(new ButtonWidget(new RejectFixIssueAction(issue)));
		tb.nextRow();
		tb.addRow(Gwt.createSpacer(1, 10));

		tb.add(new Label("If this issue is fixed sufficiently."));
		tb.add(Gwt.createSpacer(10, 1));
		tb.add(new Label("If this issue is fixed insufficient. Please provide a comment in this case."));

		return ScrumGwt.createActionsPanel(tb.createTable());
	}
}
