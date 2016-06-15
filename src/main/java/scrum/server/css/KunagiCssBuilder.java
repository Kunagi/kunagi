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
package scrum.server.css;

import ilarkesto.base.Colors;
import ilarkesto.ui.web.CssBuilder;

import java.io.PrintWriter;
import java.io.StringWriter;

public class KunagiCssBuilder implements ICssBuilder {

	// http://www.colorcombos.com/color-scheme-203.html

	public static String fontFamily = "Arial Unicode MS, Arial, sans-serif";
	public static int fontSize = 12;
	public static int lineHeight = 16;

	public static int fontSizeSmall = 9;
	public static int lineHeightSmall = 9;

	public static int fontSizeTitle = 14;
	public static int lineHeightTitle = 18;

	public static String cBackground = "#F2F5FE";

	public static String cHeaderBackground = "#667B99";
	public static String cHeaderLink = "#D6E4E1";

	public static String cEstimationBar0 = cHeaderBackground;
	public static String cEstimationBar1 = "#669976";

	public static String cLink = "#2956B2";
	public static String cErrorBackground = "#FEE";
	public static String cError = "darkred";
	public static String cHeaderText = "#FFFFFF";

	public static String cNavigatorSeparator = "#D9DEE6";
	public static String cNavigatorLink = "#465B79";
	public static String cNavigatorSelectedItemBackground = "#CCD5E6";
	public static String cNavigatorHoverItemBackground = "#E9EEF6";

	public static String cFieldBackground = "#FFFFFF";

	public static String cBlockHeaderBackground = cNavigatorHoverItemBackground;
	public static String cBlockBackground = "#FAFDFF";
	public static String cBlockSelectionBorder = cHeaderBackground;
	public static String cBlockHeaderHoverBackground = cBackground;
	public static String cBlockHeaderDragHandleBackground = "#FBFBFF";
	public static String cBlockHeaderCellSecondary = "gray";

	public static String cToolbarBackground = cNavigatorHoverItemBackground;

	public static String cPagePanelHeaderBackground = "#FFF7F0";
	public static String cPagePanelHeader = "#FF6637";
	public static String cPagePanelBorder = cNavigatorSeparator;

	public static String cChatBackground = "#FFFFFF";
	public static String cChatBorder = cPagePanelBorder;

	public static String cTrashBackground = cNavigatorHoverItemBackground;
	public static String cTrashBorder = cPagePanelBorder;

	public static String cWaitBackground = cFieldBackground;
	public static String cWait = cLink;

	public static String cButtonText = "#444";
	public static String cButtonTextHover = "#500";
	public static String cButtonTextDisabled = "lightgray";
	public static String cButtonBorder = "#666";
	public static String cButtonBorderHover = "#866";
	public static String cButtonBorderDisabled = cButtonTextDisabled;

	public static String cCommentsBackground = "#F8FFF8";
	public static String cCommentsBorder = "#EAFFEA";
	public static String cCommentDate = "darkgray";

	// public static String cUserguideBackground = "#F8F8FF";
	// public static String cUserguide = "#000066";
	// public static String cUserguideBorder = "#E0E0FF";

	public static String cUserguideBackground = cPagePanelHeaderBackground;
	public static String cUserguide = "#330000";
	public static String cUserguideBorder = "#E0E0E0";
	public static String cUserguideTableHeaderBackground = cUserguideBorder;

	public static String cChangesBackground = "#FFFFF8";
	public static String cChangesBorder = "#FFFFEA";
	public static String cChangeDate = cCommentDate;
	public static String cChangesCommentBackground = "#F7F7F0";

	public static String cActionsBackground = cPagePanelHeaderBackground;
	public static String cActionsBorder = "#FFC697";

	public static String cPlanningPokerTableLines = "#EEE";

	public static String cBurndownLine = Colors.darken(cHeaderBackground);
	public static String cBurndownProjectionLine = Colors.lighten(Colors.lighten(cBurndownLine));
	public static String cBurndownOptimalLine = cPagePanelBorder;

	@Override
	public void buildCss(CssBuilder css) {
		html(css);
		gwt(css);
		ilarkesto(css);
		loginPage(css);
		systemMessage(css);
		blockList(css);
		comments(css);
		userGuide(css);
		actions(css);
		changeHistory(css);
		workspace(css);
		navigator(css);
		chat(css);
		pagePanel(css);
		whiteboard(css);
		dashboard(css);
		calendar(css);
		planningPoker(css);
		userStatus(css);

		css.style("#body .EmoticonSelectorWidget-emoticon").border(1, "white").borderRadius(2).padding(2, 1, 0, 1)
				.cursorPointer();
		css.style("#body .EmoticonSelectorWidget-emoticon-selected").background(cBlockHeaderBackground)
				.border(1, cBlockSelectionBorder).padding(2, 3, 0, 2);

		css.style("#body .ToolbarWidget").background(cToolbarBackground).padding(3, 0, 3, 3);
		css.style("#body .ToolbarWidget .FloatingFlowPanel-element-left").marginRight(3);
		css.style("#body .ToolbarWidget .FloatingFlowPanel-element-right").marginLeft(3);

		css.style("#body .fieldLabel").color(cHeaderBackground).lineHeight(22).whiteSpaceNowrap();
		css.style("#body .AFieldValueWidget").background("white").border(1, "dotted", "white").minWidth(16)
				.minHeight(16).displayBlock().padding(3);
		css.style("#body .FieldsWidget-fieldLabel").color(cHeaderBackground).lineHeight(22).whiteSpaceNowrap();

		css.style("#body .dnd-drop-allowed").background(cHeaderBackground);

		css.style("#body .WidgetsTesterWidget .test-content").background("white").color("black").border(1, "#AAA");

		css.style("#body .highlighted .ABlockWidget-title").border(1, cError);

		css.style("#body .LockInfoWidget-icon").marginRight(10);

		css.style("#body .WaitWidget").background(cWaitBackground).margin(200, 0, 200, 0).borderTop(1, cPagePanelBorder)
				.borderBottom(1, cPagePanelBorder).fontSize(fontSize + 2);
		css.style("#body .LoginWidget-errorMessage").background(cErrorBackground).color(cError).border(1, cError)
				.fontSize(fontSize + 2).padding(5);

		css.style("#body .PunishmentsWidget-tableHeader").padding(10).fontSize(fontSizeTitle)
				.lineHeight(lineHeightTitle);

		css.style("#body .AViewEditWidget-viewer").minWidth(16).minHeight(16).displayBlock().padding(3);
		css.style("#body .AViewEditWidget-viewer-editable").background(cFieldBackground)
				.border(1, "dotted", cNavigatorSelectedItemBackground).cursorPointer();
		css.style("#body .ARichtextViewEditWidget-viewer .codeBlock").displayBlock().padding(5).margin(0, 10, 10, 10)
				.border(1, "#EEE").background(Colors.lighten(cFieldBackground)).maxWidth(350).maxHeight(400)
				.overflowScroll();
		css.style("#body .ARichtextViewEditWidget-viewer div.toc").border(1, cPagePanelBorder).background("#EEE")
				.floatRight().padding(10, 10, 3, 5).margin(10);
		css.style("#body .ARichtextViewEditWidget-editor").border(1, cPagePanelBorder);
		css.style("#body .ARichtextViewEditWidget-editor .html-editor-toolbar").displayNone();
		css.style("#body .AEditableTextareaWidget-editorPanel").width100();
		css.style("#body .Integer-editor").width(10, "%");
		css.style("#body .AViewEditWidget-error").color(cError).background(cErrorBackground).border(1, cError).margin(2)
				.padding(2);
		css.style("#body .data-table").borderCollapseCollapse();
		css.style("#body .data-table td").border(1, "#ccc").padding(5);
		css.style("#body .data-table th").border(1, "#ccc").padding(5).fontWeightBold().textAlignCenter()
				.background("#eee");

		css.style("#body .AIntegerViewEditWidget .gwt-Button").padding(0, 3, 0, 3).fontSize(fontSizeSmall);

		css.style("#body .TaskRemainingWorkWidget").marginLeft(3);
		css.style("#body .TaskRemainingWorkWidget .gwt-Button").fontSize(fontSizeSmall);

		css.style("#body .RequirementEstimatedWorkWidget").marginLeft(3);
		css.style("#body 9*+.RequirementEstimatedWorkWidget .gwt-Button").fontSize(fontSizeSmall);

		css.style("#body .EstimationBarWidget").marginTop(8).border(1, cNavigatorSelectedItemBackground);
		css.style("#body .EstimationBarWidget-bar0").background(cEstimationBar0).lineHeight(1).fontSize(1);
		css.style("#body .EstimationBarWidget-bar1").background(cEstimationBar1).lineHeight(1).fontSize(1);

		css.style("#body .SprintBorderIndicatorWidget-certain").background(cPagePanelHeaderBackground)
				.color(cPagePanelHeader).border(1, cPagePanelBorder).textAlignCenter().borderRadius(10)
				.fontSize(fontSizeSmall).margin(3, 100, 3, 100);
		css.style("#body .SprintBorderIndicatorWidget-uncertain").background(cPagePanelHeaderBackground).colorGray()
				.border(1, cPagePanelBorder).textAlignCenter().borderRadius(10).fontSize(fontSizeSmall)
				.margin(3, 100, 3, 100);

		css.style("#body ul.toc");// .displayInline().floatRight();

		css.style("#body a.reference, a.reference:visited").fontFamilyMonospace().color(cLink);
		css.style("#body a.reference-unavailable").color("darkgray");

		css.style("#body input.InputMandatory").border(1, "black");

		css.style("#body .CreateTaskButtonWrapper").marginTop(5);
		css.style("#body .CreateTaskButtonWrapper .ButtonWidget .gwt-Button").fontSize(fontSizeSmall).margin(0)
				.padding(1);

		css.style("#body .CreateStoryButtonWidget").marginTop(1).width(140);
		css.style("#body .CreateStoryButtonWidget-dragHandle").marginTop(0).width(40).colorBlack();

		css.style("#body .ReleaseWidget-script-running").fontFamilyMonospace().overflowHidden().color("red")
				.fontWeightBold().textDecorationBlink();
		css.style("#body .ReleaseWidget-script-ok").fontFamilyMonospace().overflowHidden();
		css.style("#body .ReleaseWidget-script-empty").fontFamilyMonospace().overflowHidden();
		css.style("#body .ReleaseWidget-script-failed").fontFamilyMonospace().overflowHidden().color("red");

		css.style("#body .draggable").cursorMove();
	}

	private void loginPage(CssBuilder css) {
		css.style(".loginPage");
		css.style(".loginPage a").color("moccasin");
		css.style(".loginPage code").color("#FFA");
		css.style(".loginPage .panel").background(cHeaderBackground).width(380).margin("50px auto").padding(20)
				.borderRadius(15);
		css.style(".loginPage .panel img").marginBottom(-20);
		css.style(".loginPage .message").color("gold").fontWeightBold().marginBottom(10).fontSize(fontSizeTitle);
		String labelColor = Colors.lighten(Colors.lighten(Colors.lighten(cHeaderBackground)));

		css.style(".loginPage .inputButton, .loginPage a.openid .button").background(Colors.darken(cHeaderBackground))
				.border(1, cPagePanelBorder).borderRadius(5).color(labelColor).fontWeightBold().padding(1, 10)
				.cursorPointer().textShadow(-1, -1, 0, "#444");
		css.style(".loginPage .inputButton").marginRight(10);
		css.style(".loginPage a.openid .button").margin(0, 5, 5, 0).floatLeft();
		css.style(".loginPage input:hover.inputButton, .loginPage a.openid:hover .button")
				.color(Colors.lighten(labelColor));

		css.style(".loginPage .inputCheckbox").marginLeft(0);
		css.style(".loginPage .panel label").color(labelColor).marginRight(5);
		css.style(".loginPage .panel .optionalLabel label").color(Colors.lighten(cHeaderBackground));
		css.style(".loginPage h2").color("#fff").margin(30, 0, 20, 0).fontSize(fontSizeTitle + 4).textShadow(1, 1, 0,
			"#222");
		css.style(".loginPage input").marginBottom(5);
		css.style("#username, #email, #password").width(150).marginRight(10);
		css.style("#openid").width(309).marginRight(10);
		css.style(".loginPage .separator").borderTop(1, Colors.lighten(cHeaderBackground)).margin(20, 0, 20, 0);
		css.style(".loginPage .configMessage").colorWhite();
		css.style(".loginPage .kunagiLink").textAlignRight().fontSize(fontSizeSmall).color(labelColor);
		css.style(".loginPage .kunagiLink a").color(Colors.lighten(labelColor));
	}

	private void planningPoker(CssBuilder css) {
		css.style("#body .PlanningPokerWidget-table-border").background("#333").border(2, "#2A2A2A").padding(12)
				.borderRadius(60).marginBottom(10);
		css.style("#body .PlanningPokerWidget-table").border(2, "#2A2A2A").borderRadius(45)
				.background("#5A5 url(pokertable_bg.jpg)").padding(40);
		css.style("#body .PlanningPokerWidget-table-branding").color(cPlanningPokerTableLines)
				.fontFamily("Times New Roman").fontWeightBold().fontSize(30).textAlignCenter().marginBottom(30);
		css.style(
			"#body .PlanningPokerWidget-table .gwt-Hyperlink, .PlanningPokerWidget-table a, .PlanningPokerTableWidget-estimationHelp ul li a.reference")
				.color(cPlanningPokerTableLines);

		int cardWidth = 40;
		int cardHeight = 60;
		css.style("#body .PlanningPokerCardSlotWidget-slot").width(cardWidth - 8).height(cardHeight - 8)
				.border(5, "solid", cPlanningPokerTableLines).borderRadius(5);
		css.style("#body .PlanningPokerCardSlotWidget-text").color(cPlanningPokerTableLines).fontSize(fontSizeSmall)
				.textAlignCenter();

		css.style("#body .PlanningPokerCardWidget").borderRadius(5).width(cardWidth).height(cardHeight)
				.background("#FFF").border(1, "#333");
		css.style("#body .PlanningPokerCardWidget-clickable").cursorPointer();
		css.style("#body .PlanningPokerCardWidget-text").fontSize(23).lineHeight(60).fontFamily("Times New Roman")
				.textAlignCenter();
		css.style("#body .PlanningPokerCardWidget-back").height100()
				.background(cHeaderBackground + " url(pokercard_bg.jpg)");

	}

	private void calendar(CssBuilder css) {
		css.style(".DateSelectorWidget").background("white").textAlignCenter().border(1, "white");
		css.style(".DateSelectorWidget-weekday").background("white").textAlignCenter().color(cBlockHeaderCellSecondary)
				.border(1, "white");
		css.style(".DateSelectorWidget-weeknumber").background("white").color(cBlockHeaderCellSecondary).width(20)
				.border(1, "white");
		css.style(".DateSelectorWidget-spacer").background("white").textAlignCenter().height(20).border(1, "solid",
			"white");
		css.style(".DateSelectorWidget-selected").background(cNavigatorHoverItemBackground).textAlignCenter().border(1,
			cNavigatorHoverItemBackground);
		css.style(".DateSelectorWidget-visible").background(cBackground).textAlignCenter().border(1, "solid",
			cBackground);
		css.style(".DateSelectorWidget-today").border(1, cNavigatorSelectedItemBackground);
		css.style(".DateSelectorWidget-events").color("red").fontSize(fontSizeSmall).lineHeight(lineHeightSmall)
				.textAlignCenter();
		css.style(".DayListWidget-date").color(cBlockHeaderCellSecondary);
		css.style(".DayListWidget-date-info").padding(2);
		css.style(".DayListWidget-week").color(cBlockHeaderCellSecondary);
		css.style(".DayListWidget-month").color(cBlockHeaderCellSecondary);
	}

	private void dashboard(CssBuilder css) {
		css.style(
			".TeamTasksWidget, .UpcomingTasksWidget, .AcceptedIssuesWidget, .OpenImpedimentsWidget, .HighestRisksWidget, .LatestEventsWidget td")
				.lineHeight(lineHeight + 4);
		css.style(".TeamTasksWidget-user").borderTop(1, cBlockHeaderBackground).margin(3, 0);
		css.style(".TeamTasksWidget").borderBottom(1, cBlockHeaderBackground);
		css.style(".LatestEventsWidget td").borderTop(1, cBlockHeaderBackground).padding(3);
		css.style(".LatestEventsWidget table").borderBottom(1, cBlockHeaderBackground);
		css.style(".LatestEventsWidget-time").whiteSpaceNowrap().color(cCommentDate);
	}

	private void whiteboard(CssBuilder css) {
		css.style(".WhiteboardWidget-columnLabel").fontSize(fontSizeTitle).lineHeight(lineHeightTitle);
		css.style(".WhiteboardWidget-requirement-list").padding(0).paddingTop(10);
	}

	private void ilarkesto(CssBuilder css) {
		css.style("#body .AWidget-height100").height100();
		css.style("#body .ImageAnchor img").floatLeft().marginRight(3);
		css.style("#body .ImageAnchor .text").displayInline();

		css.style("#body .FloatingFlowPanel-element-left").floatLeft();
		css.style("#body .FloatingFlowPanel-element-right").floatRight();
		css.style("#body .floatClear").clearBoth();

		css.style("#body .BugMarker").border(1, cError).background(cErrorBackground).color(cError).displayBlock()
				.margin(3).padding(3).fontWeightBold().fontSize(fontSizeSmall);

		css.style("#body .Tooltip").background(cUserguideBackground).color(cUserguide).padding(10)
				.border(1, cUserguideBorder).maxWidth(400);

		css.style("#body .DropdownMenuButtonWidget .gwt-MenuBar-horizontal").paddingLeft(1).border(1, cPagePanelBorder);
		css.style("#body .DropdownMenuButtonWidget .gwt-MenuBar-horizontal td").fontSize(fontSizeSmall)
				.lineHeight(lineHeightSmall).padding(0, 3, 0, 3).whiteSpaceNowrap().cursorPointer();
		css.style("#body .DropdownMenuButtonWidget .gwt-MenuItem-selected").backgroundNone();
	}

	private void gwt(CssBuilder css) {
		css.style("#body .gwt-Hyperlink a").whiteSpaceNowrap();
		css.style("#body .gwt-Button").fontFamily(fontFamily).fontSize(fontSize).fontWeightBold().color(cButtonText)
				.padding(2).margin(0).whiteSpaceNowrap().border(1, cButtonBorder);
		css.style("#body .gwt-Button:hover").color(cButtonTextHover).border(1, cButtonBorderHover);
		css.style("#body .gwt-Button[disabled], .gwt-Button[disabled]:hover").color(cButtonTextDisabled).border(1,
			"solid", cButtonBorderDisabled);
		css.style("#body .MenuItem-disabled").color(cButtonTextDisabled);
	}

	private void html(CssBuilder css) {
		css.style("#body").background(cBackground);
	}

	private void workspace(CssBuilder css) {
		int headerHeight = 25;
		css.style("#body .Workspace");

		css.style("#body .Workspace-header").height(headerHeight).background(cHeaderBackground).width100();

		css.style("#body .Workspace-sidebar").width(200).overflowAuto();
		css.style("#body .Workspace-sidebar .PagePanel").padding(0);
		css.style("#body .Workspace-sidebar .PagePanel-header").color(cHeaderText);
		css.style("#body .Workspace-sidebar .PagePanel-content").border("0");
		css.style("#body .ProjectSidebarWidget").marginLeft(10);

		css.style("#body .Workspace-workarea").marginTop(headerHeight + 10).marginRight(10).minHeight(2000);

		css.style("#body .HeaderWidget-logo").marginLeft(5).marginRight(10); // .positionFixed().top(0).left(40).zIndex(100);
		css.style("#body .HeaderWidget-title").color(cHeaderText).fontSize(12).fontWeightBold().paddingLeft(5)
				.paddingTop(3);
		css.style("#body .HeaderWidget-user").color(cHeaderText).fontSize(12).textAlignCenter().marginTop(3)
				.marginRight(5);
		css.style("#body .HeaderWidget .ToolbarWidget").background("none").margin(0).textAlignRight();
		css.style("#body .HeaderWidget .ToolbarWidget .FloatingFlowPanel-element").floatRight();
		css.style("#body .HeaderWidget a").color(cHeaderLink);

		css.style("#body .SearchInputWidget input").fontSize(fontSizeSmall).lineHeight(lineHeightSmall)
				.margin(0, 10, 0, 10).padding(1);
	}

	private void systemMessage(CssBuilder css) {
		css.style(".SystemMessageWidget-box").background(cErrorBackground).color(cError).border(1, cError).padding(10)
				.marginBottom(10);
		css.style(".SystemMessageWidget-box-title").fontWeightBold().marginBottom(5);
		css.style(".SystemMessageWidget-box-time").fontStyleItalic().marginTop(5).textAlignRight();
	}

	private void chat(CssBuilder css) {
		css.style("#body .ChatWidget-outputScroller").background(cChatBackground).border(1, cChatBorder).padding(5);
		css.style("#body .ChatWidget-output .author").color("green").fontStyleItalic();
		css.style("#body .ChatWidget-output .author-system").color("red").fontStyleItalic();
		css.style("#body .ChatWidget-output .author-me").color("gray").fontStyleItalic();
		css.style("#body .ChatWidget-output a").textDecorationUnderline();
		css.style("#body .ChatWidget-message").margin(0, 0, 0, 5);
		css.style("#body .ChatWidget-input").marginTop(5).width(97, "%");
	}

	private void navigator(CssBuilder css) {
		css.style(".NavigatorWidget");
		css.style(".NavigatorWidget-head").borderBottom(1, cNavigatorSeparator).overflowHidden();
		css.style(".NavigatorWidget-item-link").borderBottom(1, cNavigatorSeparator).overflowHidden();
		css.style("#body .NavigatorWidget-item-link a").color(cNavigatorLink).displayBlock().padding(5, 3, 5, 3)
				.textDecorationNone().overflowHidden();
		css.style("#body .NavigatorWidget-item-link a:hover").background(cNavigatorHoverItemBackground);
		css.style("#body .NavigatorWidget-item-link-selected a").background(cNavigatorSelectedItemBackground);
		css.style("#body .NavigatorWidget-item-link-selected a:hover").background(cNavigatorSelectedItemBackground);

		css.style("#body .NavigatorWidget-submenu .NavigatorWidget-item-link a").paddingLeft(30).overflowHidden();
	}

	private void actions(CssBuilder css) {
		css.style(".ActionsPanel").background(cActionsBackground, "specialarea-bg.png", "repeat-x")
				.border(1, cActionsBorder).padding(7).borderRadius(10);
		css.style(".ProjectList").width100();
	}

	private void userGuide(CssBuilder css) {
		css.style(".UserGuideWidget").color(cUserguide)
				.background(cUserguideBackground, "specialarea-bg.png", "repeat-x").border(1, cUserguideBorder)
				.borderRadius(10);
		css.style(".UserGuideWidget-header").padding(7);
		css.style(".UserGuideWidget-content").margin(0, 7, 7, 7).paddingTop(7).borderTop(1, cUserguideBorder)
				.columnWidth(310).columnGap(25).textAlignJustify();
		css.style("#body .UserGuideWidget-content table").width100().marginBottom(10);
		css.style("#body .UserGuideWidget-content table td").fontSize(fontSizeSmall);
		css.style("#body .UserGuideWidget-content table td.headerCell").background(cUserguideTableHeaderBackground)
				.fontWeightBold();
	}

	private void comments(CssBuilder css) {
		css.style("#body .CommentsWidget").background(cCommentsBackground, "specialarea-bg.png", "repeat-x")
				.border(1, cCommentsBorder).padding(7).borderRadius(10);
		css.style("#body .CommentsWidget-pageNavigator").borderTop(1, cPagePanelBorder).paddingTop(3);
		css.style("#body .CommentsWidget-pageNavigator-currentPage").border(1, cPagePanelBorder).padding(1, 5)
				.background(Colors.darken(cCommentsBackground));
		css.style("#body .CommentsWidget-pageNavigator-page a").displayBlock().border(1, cPagePanelBorder).padding(1, 5)
				.textDecorationNone().fontWeightBold();
		css.style(".CommentsWidget-pageNavigator-page-disabled").displayBlock().border(1, cPagePanelBorder)
				.padding(1, 5).textDecorationNone().fontWeightBold().color(cPagePanelBorder);
		css.style("#body .CommentsWidget .AViewEditWidget-viewer").padding(0);
		css.style("#body .CommentsWidget .AViewEditWidget-viewer-editable").padding(3);

		css.style("#body .CommentWidget").margin(15, 0, 10, 0).borderTop(1, cPagePanelBorder);
		css.style("#body .CommentWidget-header").margin(4, 0, 2, 0).width100();
		css.style("#body .CommentWidget-header-author").floatLeft().marginRight(5);
		css.style("#body .CommentWidget-header-date").color(cCommentDate);
		css.style("#body .CommentWidget-editor");

		css.style("#body .Comment-Widget-header-pub").floatRight();
		css.style("#body .Comment-Widget-header-pub .gwt-Button").fontSize(fontSizeSmall);
	}

	private void changeHistory(CssBuilder css) {
		css.style(".ChangeHistoryWidget").background(cChangesBackground, "specialarea-bg.png", "repeat-x")
				.border(1, cChangesBorder).padding(7).borderRadius(10);
		css.style(".ChangeWidget").margin(15, 0, 10, 0).borderTop(1, cPagePanelBorder);
		css.style(".ChangeWidget-header").margin(4, 0, 2, 0);
		css.style(".ChangeWidget-header-author").floatLeft().marginRight(5);
		css.style(".ChangeWidget-header-date").floatLeft().marginRight(5).color(cChangeDate);
		css.style(".ChangeWidget-comment").marginTop(4);
		css.style(".ChangeWidget-comment .AViewEditWidget-viewer").background(cChangesCommentBackground);
		css.style(".ChangeWidget-diff span.added").color("green");
		css.style(".ChangeWidget-diff span.removed").color("darkred").textDecorationLineThrough();
	}

	private void blockList(CssBuilder css) {
		css.style("#body .ABlockWidget-extended").border(2, cBlockSelectionBorder).padding(3).backgroundWhite();
		css.style("#body .ABlockWidget-body").padding(10).border(1, cBlockHeaderBackground)
				.background(cBlockBackground);

		// css.style(".BlockListWidget").border(1, "yellow").minHeight(50, "px");
		css.style("#body .BlockHeaderWidget").background(cBlockHeaderBackground, "blockheader-bg.png", "repeat-x");
		css.style("#body .BlockHeaderWidget:hover").background(cBlockHeaderHoverBackground);
		css.style("#body .BlockHeaderWidget-dragHandle, .CreateStoryButtonWidget-dragHandle").margin(2).padding(2)
				.fontSize(fontSize - 1).lineHeight(lineHeight - 2).textAlignCenter()
				.background(cBlockHeaderDragHandleBackground, "blockdraghandle-bg.png").border(1, cNavigatorSeparator)
				.borderRadius(5);
		css.style("#body .BlockHeaderWidget-anchor").displayBlock().floatLeft().width100().textDecorationNone();
		css.style("#body .BlockHeaderWidget-dragHandle:hover").background("white", "blockdraghandle-hover-bg.png");

		css.style("#body .BlockHeaderWidget-cell").fontWeightBold().color(cHeaderBackground).padding(4, 5, 0, 5);

		css.style("#body a.BlockHeaderWidget-anchor:hover, a.BlockHeaderWidget-anchor:visited")
				.color(cHeaderBackground);
		css.style(
			"#body .BlockHeaderWidget-cell-secondary, a.BlockHeaderWidget-cell-secondary:visited, a.BlockHeaderWidget-cell-secondary:hover")
				.color(cBlockHeaderCellSecondary).fontWeightNormal();
		css.style(
			"#body .BlockHeaderWidget-cell-small, a.BlockHeaderWidget-cell-small:visited, a.BlockHeaderWidget-cell-small:hover")
				.color(cBlockHeaderCellSecondary).fontSize(fontSizeSmall).fontWeightNormal().paddingTop(6);

		css.style("#body .BlockHeaderWidget .ButtonWidget").padding(2, 5, 0, 5).margin(0);
		css.style("#body .BlockHeaderWidget .ButtonWidget .gwt-Button").fontSize(fontSizeSmall).margin(0).padding(1);
		css.style("#body .BlockHeaderWidget .EmoticonsWidget").padding(3, 5, 0, 5);
		css.style("#body .BlockHeaderWidget .DropdownMenuButtonWidget").padding(2, 3, 0, 5);

		css.style("#body .BlockDndMarkerWidget").background("none");
		css.style("#body .BlockDndMarkerWidget-active").background(cError);

		css.style(".UsersOnBlockWidget").padding(3, 5, 0, 5).textAlignRight();
	}

	private void userStatus(CssBuilder css) {
		css.style("#body .UsersStatusWidget").borderBottom(1, cNavigatorSeparator);

		css.style("#body .UserStatusWidget").padding(3).borderTop(1, cNavigatorSeparator);
		css.style("#body .UserStatusWidget-name").floatLeft().textDecorationLineThrough().fontStyleItalic()
				.cursorPointer();
		css.style("#body .UserStatusWidget-name-online").textDecorationNone().fontStyleNormal();
		css.style("#body .UserStatusWidget-selectedEntities a").fontFamilyMonospace();
		css.style("#body .UserStatusWidget-selectedEntities").floatRight().fontSize(fontSizeSmall + 1);
		css.style("#body .UserStatusWidget .AFieldValueWidget").backgroundNone().borderNone();
	}

	private void pagePanel(CssBuilder css) {
		css.style("#body .PagePanel");// .padding(10);
		css.style("#body .PagePanel-content").background("white").border(1, cPagePanelBorder);
		css.style("#body .PagePanel-header").padding(6, 10, 6, 10).fontSize(fontSizeTitle).lineHeight(lineHeightTitle)
				.background(cPagePanelHeaderBackground, "page-header-bg.png").color(cPagePanelHeader);
		css.style("#body .PagePanel-header .gwt-Button").fontSize(fontSizeSmall);
		css.style("#body .PagePanel-header input").fontSize(fontSizeSmall);
		css.style("#body .PagePanel-header .gwt-Hyperlink").fontSize(fontSizeSmall);
		css.style("#body .PagePanel-section").margin(0, 10, 0, 10);
		css.style("#body .PagePanel-spacer").height(10);
	}

	@Override
	public String toString() {
		StringWriter out = new StringWriter();
		CssBuilder renderer = new CssBuilder(new PrintWriter(out));
		buildCss(renderer);
		renderer.flush();
		return out.toString();
	}
}
