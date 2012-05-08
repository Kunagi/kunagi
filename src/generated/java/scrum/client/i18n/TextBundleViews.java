// // ----------> GENERATED FILE - DON'T TOUCH! <----------

package scrum.client.i18n;

public class TextBundleViews {

    protected static ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(TextBundleViews.class);

    public String blog() {
        return "<p>The blog can be used to communicate project related information, such as release notes\nor development roadmaps, to the public.</p>\n\n<h3>Creating and publishing Blog Entries</h3>\n<p>Every project member can create and edit Blog Entries. Once created, Entries are\nnot published by default, to allow for preparation in advance. The Product Owner can\nchoose to publish Blog Entries. Only published Entries will be taken into account when\nproject data is exported.</p>";
    }

    public String calendar() {
        return "<p>The calendar can be used to schedule project-related events.</p>\n\n<h3>Scrum Meetings: Daily Scrums</h3>\n<p>There are a number of Scrum-related meetings to be scheduled.</p>\n\n<p>Every Day at the same time (and the same place) a <strong>Daily Scrum</strong>\nshould be held (and supervised by the Scrum Master). In this status meeting everybody\nanswers three questions:</p>\n<ul>\n\t<li>What did you do yesterday?</li>\n\t<li>What are you going to do today?</li>\n\t<li>Are there any impediments?</li>\n</ul>\n\n<h3>Scrum Meetings: Reviews and Retrospectives</h3>\n<p>At the beginning of a Sprint, the Product Owner invites the Team to do a\n<strong>Scrum Planning Meeting</strong>, in which the Team selects Stories from the\nProduct Backlog and commits to complete them during the upcoming Sprint.</p>\n\n<p>At the end of Sprints, <strong>Sprint Review</strong> and <strong>Sprint\nRetrospective Meetings</strong> are held. In Sprint Review Meetings the Team presents their\nwork results to the Product Owner, who then decides to accept or reject the work. In\nSprint Retrospectives the Team and the Scrum Master reflect on the past Sprint\'s work and\ndiscuss possible improvements that can be made to future Sprints.</p>";
    }

    public String courtRoom() {
        return "<p>The courtroom can be used to keep track of project participant\'s rule violations.</p>\n\n<h3>Agree on punishment, use the revenue</h3>\n<p>For example, you could agree on Team Members having to pay one Euro when they are\nlate to Daily Scrum Meetings. Every time a Team Member is late, the number of violations\nis then increased. When you reach a sufficient amount of money, you can throw a party\nand use it to buy cake and beer.</p>";
    }

    public String fileRepository() {
        return "<p>The File Repository can be used to upload files that can then be conveniently linked\nwithin the project.</p>\n\n<h3>Linking uploaded Files</h3>\n<p>An uploaded file is assigned an ID <tt>fleN</tt> (where <tt>N</tt> is some number).\nWhen you use this ID somewhere within Kunagi (like in entity descriptions or the chat),\na link to the corresponding file is automatically created.</p>\n\n<h3>Upload from forms</h3>\n<p>You can use the upload feature not only in the File Repository view, but also, when\nediting other entities within the project, using the text editor toolbar.</p>";
    }

    public String forum() {
        return "<p>The forum is a place to have discussions with other project participants.</p>\n\n<h3>Types of Subjects</h3>\n<p>There are two kinds of Subjects visible in the Forum view. Firstly, Subjects created\nin the Forum view and secondly, discussions that are attached to other entities. You can\ndistinguish them by looking at the entity ID. Independent discussions have IDs like\n<tt>sbjN</tt> (where <tt>N</tt> is some number), whereas discussions attached to some\nentity have the same ID as the corresponding entity (for example <tt>sto42</tt> for a\ndiscussion for the Story with the ID <tt>sto42</tt>).</p>";
    }

    public String impediments() {
        return "<p>The Scrum Master uses the Impediment view to keep track of Impediments that encumber\nthe project.</p>\n\n<h3>The lifecycle of Impediments</h3>\n<p>When impediments come up (e. g. are given by a Team Member during a Daily Scrum Meeting),\nthe Scrum Master creates an Impediment to document its existence. He then works to\nremove Impediments that obstruct the Team\'s work. As soon as a solution is found, he\ncloses the Impediment by selecting <tt>Close</tt> from the entity menu and documents the\nsolution, so then Team Members can check back to see if and how an Impediment was\nsolved.</p>";
    }

    public String issues() {
        return "<p>The Issue view is a place to keep track of feedback, bugs and ideas for the project.</p>\n\n<h3>Types of Issues</h3>\n<p>It is divided into four parts, namely <strong>Issue Inbox</strong>,\n<strong>Bugs</strong>, <strong>Ideas</strong> and <strong>Closed Issues</strong>.\nWhen an Issue is submitted, it is created in the Inbox.</p>\n\n<h3>Product Owner processes the Inbox</h3>\n<p>The Product Owner reviews all Issues in the Inbox and decides how to handle them.\nHe can choose to postpone a decision by selecting <tt>Suspend</tt> from the entity\nmenu. Otherwise he selects to convert the Issue to a <strong>Bug</strong> or an\n<strong>Idea</strong>.</p>\n\n<h3>Team fixes Bugs</h3>\n<p>Bugs are the Team\'s domain and are usually flaws of past work results that have been\ndiscovered in later Sprints. When a Sprint Planning Meeting is held and the Team decides\non how much work they can handle during the next Sprint, they should also take into\naccount the work that has to be invested into bug solving. In case a bug\'s scope is too\nbig or otherwise unclear, it might be a better idea to create a Story from it.</p>\n\n<h3>Product Owner manages Ideas</h3>\n<p>Ideas on the other hand are to be handled by the Product Owner. When an Issue is\nconverted to an Idea, it is accepted, but a Story for the Product Backlog is yet to be\ncreated.</p>\n\n<h3>Closed Issues</h3>\n<p>Closed Issues are all Issues that have been sufficiently addressed. Solutions of\nissues include an actual resolution of an issue, identifying it as a duplicate of another\nissue, creating a story from it or refusing to address it.</p>";
    }

    public String journal() {
        return "<p>The Project Journal chronologically records all of the important events in the\nproject.</p>\n\n<h3>Events in the Project Journal</h3>\n<p>When users make important changes to project data, the event is recorded and placed in\nthe Project Journal. The Journal is mainly used to show the latest events in the Dashboard.\nOlder actions can be looked up in the Project Journal view.</p>\n\n<h3>Change Log vs. Project Journal</h3>\n<p>Changes done to Entities are not recorded here. Instead, they can be viewed by selecting\n<tt>Show Change Log</tt> from the entity menu.</p>";
    }

    public String nextSprint() {
        return "<p>The Next Sprint view is used to prepare the next Sprint in advance.</p>\n\n<h3>Product Owner prepares Next Sprint</h3>\n<p>The Product Owner can select a start date and Sprint duration and should give the Sprint a\nname based on the Sprint Goal. After the Sprint Review Meeting of the current Sprint,\nthe Product Owner selects <i>Switch to this Sprint</i> in order to finish and file the\ncurrent Sprint and replace it\'s Sprint Backlog with the new one. All unfinished Stories\nare then moved back to the Product Backlog and all unfinished Tasks are deleted.</p>";
    }

    public String personalPreferences() {
        return null;
    }

    public String productBacklog() {
        return "<p>The Product Backlog is a prioritized list of desired product features.</p>\n\n<h3>Product Owner creates and prioritizes Product Backlog</h3>\n<p>The Product Owner is responsible for creating the Product Backlog and keeping it up to\ndate. It contains Stories that describe desired product features. Furthermore, the\nStories are prioritized: the more important the feature the higher in the Product Backlog\nit is placed.</p>\n\n<h3>Team select Stories during Sprint Planning</h3>\n<p>During Sprint Planning Meetings, the Team picks Stories from the top (and only the\ntop) of the Product Backlog and commits to implement them during the upcoming Sprint.\nBy placing the features he wants to see implemented next on top of the Product Backlog,\nthe Product Owner can decide the direction of the project.</p>\n\n<h3>Estimating the Product Backlog</h3>\n<p>Before the Team can start working on Stories, Team Members have to estimate them\nrelative to each other (i. e. a Story estimated with 2 points presumably takes twice\nas much effort as a 1 point Story). In order for this to be possible, the Product Owner\nneeds to provide a sufficient description and explanation of the Story. Once Stories\nare pulled to a Sprint, they may not be changed any further. Therefore, the Product Owner\nshould always be present for estimation and explain the Stories to the team (and adjust\nthe it\'s description and scope if necessary).</p>\n\n<p>As a rule of thumb, there should be enough detailed and estimated Stories for the\nnext two to three Sprints. Putting too much detail into low priotized Stories should\nbe avoided, as details are likely to change in the future.</p>\n\n<h3>The Team\'s Velocity</h3>\n<p>The Velocity history and average Velocity values show how many Story Points the Team\nwas able to complete in past Sprints and on average. By adjusting the anticipated Velocity\nvalue, the Product Owner and other project members can project an approximation of what\nwill be completed in the following Sprints. It also helps the Team to decide, how many\nStories they can commit to during the Sprint Planning Meeting.</p>";
    }

    public String projectAdministration() {
        return null;
    }

    public String qualities() {
        return "<p>Qualities are requirements that affect multiple Stories.</p>\n\n<h3>What are Qualities?</h3>\n<p>Some requirements put general demands on the implementation of the project. In that\ncase, those specific requirements are likely to appear in multiple Stories. In order to\navoid repetition, Qualities can be created and linked to Stories in the Product\nBacklog.</p>\n\n<h3>Non-functional requirements</h3>\n<p>Popular examples of such requirements are non-functional requirements in software.\nWhen listing functional requirements in a table, non-functional requirements are best\nimagined on another axis, affecting one or more of the functional requirements.</p>\n\n<p>\nFor example, with Stories listed on the left and Qualities on top and X indicating that\na Story and Quality are linked:\n</p>\n\n<table>\n\t<tr>\n\t\t<td class=\"emptyCell headerCell\">&nbsp;</td>\n\t\t<td class=\"headerCell\">User Documentation</td>\n\t\t<td class=\"headerCell\">Thread Safety</td>\n\t</tr>\n\t<tr>\n\t\t<td class=\"headerCell\">Create User Framework</td>\n\t\t<td style=\"text-align:center;\">&nbsp;</td>\n\t\t<td style=\"text-align:center;\">X</td>\n\t</tr>\n\t<tr>\n\t\t<td class=\"headerCell\">Create Administration View</td>\n\t\t<td style=\"text-align:center;\">X</td>\n\t\t<td style=\"text-align:center;\">&nbsp;</td>\n\t</tr>\n\t<tr>\n\t\t<td class=\"headerCell\">Create Login View</td>\n\t\t<td style=\"text-align:center;\">X</td>\n\t\t<td style=\"text-align:center;\">&nbsp;</td>\n\t</tr>\n</table>";
    }

    public String releases() {
        return "<p>Releases can be used to keep track of product versions and their specifics.</p>\n\n<h3>Types of Releases</h3>\n<p>The Product Owner can create Releases that represent product versions that are released\nto the public. There are two types of Releases: <strong>Releases</strong> and \n<strong>Bugfix Releases</strong>. The former represent a major product version while\nthe latter are a minor change to the associated Release (that might be necessary if bugs\nare found that have to be fixed quickly).</p>\n\n<h3>Associating Releases with work results</h3>\n<p>A Release usually spans a number of Sprints and includes all Stories completed during\nthose Sprints. Additionally, known Bugs can be associated with both types of releases\nas known (but not fixed) and fixed.</p>";
    }

    public String risks() {
        return "<p>Risks are anticipated events that can have an adverse impact on the project.</p>\n\n<h3>Risk Management</h3>\n<p>Project Members should do Risk Management to avoid project failure due to unexpected\noccurrence of problems. By anticipating and evaluating possible problems, risk\nmanagement allows for the project to continue smoothly, even when problems occur.</p>\n\n<h3>Evaluating Risks</h3>\n<p>Risks are evaluated by estimating probability and impact. The probability of a Risk\nis the likeliness of the risk becoming a problem, while the impact is the damage to the\nproject that might be induced by the problem. By developing probability and impact\nmitigation plans the Team can reduce probability and impact, thus making a favourable\nproject outcome more likely.</p>\n\n<h3>Prioritization of Risks</h3>\n<p>Risks are prioritized automatically based on probability and impact values according to\nthe following table:</p>\n\n<table id=\"riskPrioTable\">\n\t<tr>\n\t\t<td class=\"headerCell emptyCell\">&nbsp;</td>\n\t\t<td class=\"headerCell\">very likely</td>\n\t\t<td class=\"headerCell\">likely</td>\n\t\t<td class=\"headerCell\">possible</td>\n\t\t<td class=\"headerCell\">unlikely</td>\n\t\t<td class=\"headerCell\">very unlikely</td>\n\t</tr>\n\t<tr>\n\t\t<td class=\"headerCell\">extreme</td>\n\t\t<td>Severe</td>\n\t\t<td>Severe</td>\n\t\t<td>High</td>\n\t\t<td>Significant</td>\n\t\t<td>Moderate</td>\n\t</tr>\n\t<tr>\n\t\t<td class=\"headerCell\">substantial</td>\n\t\t<td>Very High</td>\n\t\t<td>High</td>\n\t\t<td>Significant</td>\n\t\t<td>Moderate</td>\n\t\t<td>Moderate</td>\n\t</tr>\n\t<tr>\n\t\t<td class=\"headerCell\">medium</td>\n\t\t<td>High</td>\n\t\t<td>Significant</td>\n\t\t<td>Moderate</td>\n\t\t<td>Moderate</td>\n\t\t<td>Moderate</td>\n\t</tr>\n\t<tr>\n\t\t<td class=\"headerCell\">minor</td>\n\t\t<td>Significant</td>\n\t\t<td>Moderate</td>\n\t\t<td>Moderate</td>\n\t\t<td>Low</td>\n\t\t<td>Very Low</td>\n\t</tr>\n\t<tr>\n\t\t<td class=\"headerCell\">negligible</td>\n\t\t<td>Moderate</td>\n\t\t<td>Moderate</td>\n\t\t<td>Low</td>\n\t\t<td>Very Low</td>\n\t\t<td>Very Low</td>\n\t</tr>\n</table>\n\n<h3>Monitoring Risks</h3>\n<p>Risk should be constantly monitored and reviewed at least once a month. The\neffectiveness of Risk Management depends on the data being up to date and project\nmembers adhering to existing mitigation plans.</p>";
    }

    public String sprintBacklog() {
        return "<p>The Sprint Backlog is used by the Team to organize their current work.</p>\n\n<h3>Select Stories, create Tasks</h3>\n<p>It consists of Stories selected from the Product Backlog during the preceding Sprint\nPlanning Meeting. For every Story, the Team creates Tasks that &mdash; once completed\n&mdash; complete the corresponding Story.</p>\n\n<h3>Burning the Sprint Backlog</h3>\n<p>Only completed Stories count towards the Team\'s success, therefore work should be\nconcentrated rather than spread across Stories. Figuratively speaking, completing half\nof each Story means a success rate of 0% while completing half of the Stories means a\nsuccess rate of 50%.</p>\n\n<h3>Product Owner accepts or rejects results</h3>\n<p>Once there are no Tasks left to do in a Story, the Product Owner can review and accept\nit as solved during the Sprint Review. When the Sprint ends, only Stories that have been\naccepted by the Product Owner count towards the Team\'s Velocity. Stories that are not\naccepted are moved back to the Product Backlog.</p>";
    }

    public String sprintHistory() {
        return null;
    }

    public String whiteboard() {
        return "<p>The Whiteboard is a visual representation of the current Sprint\'s progress.</p>\n\n<h3>Moving Tasks on the Whiteboard</h3>\n<p>It displays the current Sprint Backlog, arranging Tasks to indicate the Sprint\'s\nprogress. Tasks that are yet untouched are on the left, Tasks that are currently being\nworked on can be found in the middle and finished Tasks on the right. Like moving sticky\nnotes on a real whiteboard, Team members can move Tasks around, setting them as claimed or\ncompleted as they do so.</p>\n\n<p>The Sprint approaches completion as Tasks move from left to right.</p>";
    }

    public String wiki() {
        return null;
    }

}

