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
package scrum.server;

import ilarkesto.auth.Auth;
import ilarkesto.auth.WrongPasswordInputException;
import ilarkesto.base.PermissionDeniedException;
import ilarkesto.base.Reflect;
import ilarkesto.base.Utl;
import ilarkesto.core.base.Str;
import ilarkesto.core.base.UserInputException;
import ilarkesto.core.persistance.EntityDoesNotExistException;
import ilarkesto.core.scope.In;
import ilarkesto.core.time.Date;
import ilarkesto.core.time.DateAndTime;
import ilarkesto.gwt.client.ErrorWrapper;
import ilarkesto.integration.ldap.Ldap;
import ilarkesto.persistence.ADao;
import ilarkesto.persistence.AEntity;
import ilarkesto.webapp.AWebApplication;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import scrum.client.DataTransferObject;
import scrum.client.admin.SystemMessage;
import scrum.server.admin.KunagiAuthenticationContext;
import scrum.server.admin.ProjectUserConfig;
import scrum.server.admin.SystemConfig;
import scrum.server.admin.User;
import scrum.server.admin.UserDao;
import scrum.server.collaboration.ChatMessage;
import scrum.server.collaboration.Comment;
import scrum.server.collaboration.CommentDao;
import scrum.server.collaboration.Subject;
import scrum.server.collaboration.Wikipage;
import scrum.server.common.Numbered;
import scrum.server.files.File;
import scrum.server.impediments.Impediment;
import scrum.server.issues.Issue;
import scrum.server.issues.IssueDao;
import scrum.server.journal.Change;
import scrum.server.journal.ChangeDao;
import scrum.server.pr.BlogEntry;
import scrum.server.pr.EmailHelper;
import scrum.server.pr.EmailSender;
import scrum.server.pr.SubscriptionService;
import scrum.server.project.Project;
import scrum.server.project.ProjectDao;
import scrum.server.project.Requirement;
import scrum.server.project.RequirementDao;
import scrum.server.release.Release;
import scrum.server.release.ReleaseDao;
import scrum.server.risks.Risk;
import scrum.server.sprint.Sprint;
import scrum.server.sprint.SprintDao;
import scrum.server.sprint.SprintReport;
import scrum.server.sprint.SprintReportDao;
import scrum.server.sprint.Task;
import scrum.server.sprint.TaskDao;

public class ScrumServiceImpl extends GScrumServiceImpl {

	private static final long serialVersionUID = 1;

	// --- dependencies ---

	private transient ProjectDao projectDao;
	private transient UserDao userDao;
	private transient RequirementDao requirementDao;
	private transient IssueDao issueDao;
	private transient ReleaseDao releaseDao;
	private transient CommentDao commentDao;
	private transient ScrumWebApplication webApplication;
	private transient ChangeDao changeDao;

	@In
	private transient SprintDao sprintDao;

	@In
	private transient SubscriptionService subscriptionService;

	@In
	private transient SprintReportDao sprintReportDao;

	@In
	private transient EmailSender emailSender;

	@In
	private transient TaskDao taskDao;

	public void setReleaseDao(ReleaseDao releaseDao) {
		this.releaseDao = releaseDao;
	}

	public void setChangeDao(ChangeDao changeDao) {
		this.changeDao = changeDao;
	}

	public void setWebApplication(ScrumWebApplication webApplication) {
		this.webApplication = webApplication;
	}

	public void setRequirementDao(RequirementDao requirementDao) {
		this.requirementDao = requirementDao;
	}

	public void setIssueDao(IssueDao issueDao) {
		this.issueDao = issueDao;
	}

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	// --- ---

	@Override
	protected long getMaxServiceCallExecutionTime(String methodName) {
		return 2000;
	}

	@Override
	protected void onStartConversation(GwtConversation conversation) {
		User user = conversation.getSession().getUser();
		if (user == null) throw new PermissionDeniedException("Login required.");
		conversation.clearRemoteEntities();
		conversation.getNextData().applicationInfo = webApplication.getApplicationInfo();
		conversation.sendToClient(webApplication.getSystemConfig());
		conversation.getNextData().setUserId(user.getId());
		conversation.sendUserScopeDataToClient(user);
	}

	@Override
	protected void onException(GwtConversation conversation) {
		throw new RuntimeException("Test-Exception");
	}

	@Override
	public void onCreateIssueFromTask(GwtConversation conversation, String taskId) {
		assertProjectSelected(conversation);
		Task task = taskDao.getById(taskId);
		User currentUser = conversation.getSession().getUser();

		Issue issue = issueDao.postIssue(task);
		issue.appendToDescription("Created from " + task.getReferenceAndLabel() + " in "
				+ conversation.getProject().getCurrentSprint().getReferenceAndLabel() + ".");
		issue.setCreator(currentUser);
		sendToClients(conversation, issue);

		task.appendToDescription(issue.getReferenceAndLabel() + " created.");
		if (task.getBurnedWork() == 0) {
			task.delete();
			for (GwtConversation c : webApplication.getConversationsByProject(conversation.getProject(), null)) {
				c.getNextData().addDeletedEntity(task.getId());
			}
		} else {
			if (!task.isClosed()) {
				task.setOwner(currentUser);
				task.setRemainingWork(0);
			}
			sendToClients(conversation, task);
		}
		changeDao.postChange(task, currentUser, "issueId", null, issue.getId());
		changeDao.postChange(issue, currentUser, "taskId", null, task.getId());
		postProjectEvent(conversation,
			currentUser + " created " + issue.getReferenceAndLabel() + " from " + task.getReferenceAndLabel(), issue);
	}

	@Override
	public void onDeleteStory(GwtConversation conversation, String storyId) {
		assertProjectSelected(conversation);
		Requirement requirement = requirementDao.getById(storyId);
		deleteRequirement(conversation, requirement);
	}

	private void deleteRequirement(GwtConversation conversation, Requirement requirement) {
		Project project = requirement.getProject();
		if (requirement.isInCurrentSprint()) throw new IllegalStateException("Story is in sprint. Cannot be deleted");
		requirement.setDeleted(true);
		if (project.isInHistory(requirement)) {
			requirement.setDirty(false);
			requirement.setIssue(null);
			requirement.setDeleted(true);
			sendToClients(conversation, requirement);
		} else {
			requirement.delete();
			for (GwtConversation c : webApplication.getConversationsByProject(project, null)) {
				c.getNextData().addDeletedEntity(requirement.getId());
			}
		}
		project.removeRequirementsOrderId(requirement.getId());
		sendToClients(conversation, project);
	}

	@Override
	public void onRequestHistory(GwtConversation conversation) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();
		Set<SprintReport> reports = project.getSprintReports();
		Set<AEntity> entities = new HashSet<AEntity>();
		entities.addAll(reports);
		for (SprintReport report : reports) {
			entities.addAll(getAssociatedEntities(report));
		}
		conversation.sendToClient(entities);
	}

	@Override
	public void onRequestHistorySprint(GwtConversation conversation, String sprintId) {
		assertProjectSelected(conversation);
		Sprint sprint = sprintDao.getById(sprintId);
		SprintReport report = sprint.getSprintReport();
		if (report != null) {
			conversation.sendToClient(report);
			conversation.sendToClient(getAssociatedEntities(report));
			conversation.sendToClient(report.getCompletedRequirements());
			conversation.sendToClient(report.getRejectedRequirements());
			conversation.sendToClient(report.getSprintSwitchRequirementChanges());
			conversation.sendToClient(report.getClosedTasks());
			conversation.sendToClient(report.getOpenTasks());
		}
	}

	@Override
	public void onPullStoryToSprint(GwtConversation conversation, String storyId) {
		assertProjectSelected(conversation);
		Requirement story = requirementDao.getById(storyId);
		Project project = conversation.getProject();
		Sprint sprint = project.getCurrentSprint();
		User currentUser = conversation.getSession().getUser();

		sprint.pullStory(story, currentUser);

		postProjectEvent(conversation, currentUser.getName() + " pulled " + story.getReferenceAndLabel()
			+ " to current sprint", story);

		sendToClients(conversation, sprint);
		sendToClients(conversation, story);
		sendToClients(conversation, story.getTasksInSprint());
	}

	@Override
	public void onKickStoryFromSprint(GwtConversation conversation, String storyId) {
		assertProjectSelected(conversation);
		Requirement story = requirementDao.getById(storyId);
		Sprint sprint = story.getSprint();
		User currentUser = conversation.getSession().getUser();

		sprint.kickRequirement(story, currentUser);

		postProjectEvent(conversation, currentUser.getName() + " kicked " + story.getReferenceAndLabel()
			+ " from current sprint", story);

		sendToClients(conversation, story.getTasksInSprint());
		sendToClients(conversation, story);
		sendToClients(conversation, sprint);
		sendToClients(conversation, sprint.getProject());
	}

	@Override
	public void onSendIssueReplyEmail(GwtConversation conversation, String issueId, String from, String to,
			String subject, String text) {
		assertProjectSelected(conversation);
		Issue issue = issueDao.getById(issueId);
		if (Str.isEmail(from)) {
			emailSender.sendEmail(conversation.getProject(), to, subject, text);
		} else {
			emailSender.sendEmail(from, to, subject, text);
		}
		User user = conversation.getSession().getUser();
		postProjectEvent(conversation, user.getName() + " emailed a response to " + issue.getReferenceAndLabel(), issue);
		Change change = changeDao.postChange(issue, user, "@reply", null, text);
		conversation.sendToClient(change);
	}

	@Override
	public void onCreateExampleProject(GwtConversation conversation) {
		User user = conversation.getSession().getUser();
		Project project = projectDao.postExampleProject(user, user, user);
		conversation.sendToClient(project);
	}

	@Override
	public void onSearch(GwtConversation conversation, String text) {
		Project project = conversation.getProject();
		if (project == null) return;
		List<AEntity> foundEntities = project.search(text);
		log.debug("Found entities for search", "\"" + text + "\"", "->", foundEntities);
		conversation.sendToClient(foundEntities);
		for (AEntity entity : foundEntities) {
			if (entity instanceof Task) {
				Task task = (Task) entity;
				conversation.sendToClient(task.getRequirement());
			}
		}
	}

	@Override
	public void onUpdateSystemMessage(GwtConversation conversation, SystemMessage systemMessage) {
		User user = conversation.getSession().getUser();
		if (user == null || user.isAdmin() == false) throw new PermissionDeniedException();
		webApplication.updateSystemMessage(systemMessage);
	}

	@Override
	public void onLogout(GwtConversation conversation) {
		WebSession session = conversation.getSession();
		webApplication.destroyWebSession(session, getThreadLocalRequest().getSession());
	}

	@Override
	public void onResetPassword(GwtConversation conversation, String userId) {
		if (!conversation.getSession().getUser().isAdmin()) throw new PermissionDeniedException();
		User user = userDao.getById(userId);
		if (webApplication.getSystemConfig().isSmtpServerSet() && user.isEmailSet() && user.isEmailVerified()) {
			user.triggerPasswordReset();
		} else {
			Auth.resetPasswordToDefault(user, new KunagiAuthenticationContext());
		}
	}

	@Override
	public void onChangePassword(GwtConversation conversation, String oldPassword, String newPassword) {
		User user = conversation.getSession().getUser();
		try {
			Auth.changePasswordWithCheck(oldPassword, newPassword, user, new KunagiAuthenticationContext());
		} catch (UserInputException ex) {
			conversation.getNextData().addError(ErrorWrapper.createUserInput(ex.getMessage()));
		}
	}

	private void onEntityCreatedOnClient(GwtConversation conversation, AEntity entity, Map<String, String> properties) {
		entity.updateProperties(properties);
		entity.persist();
		User currentUser = conversation.getSession().getUser();
		Project currentProject = conversation.getProject();

		if (entity instanceof Numbered) {
			((Numbered) entity).updateNumber();
		}

		if (entity instanceof Project) {
			Project project = (Project) entity;
			project.addParticipant(currentUser);
			project.addAdmin(currentUser);
			project.addProductOwner(currentUser);
			project.addScrumMaster(currentUser);
			project.addTeamMember(currentUser);
		}

		if (entity instanceof Comment) {
			Comment comment = (Comment) entity;
			comment.setDateAndTime(DateAndTime.now());
			postProjectEvent(conversation, comment.getAuthor().getName() + " commented on " + comment.getParent(),
				comment.getParent());
			currentProject.updateHomepage(comment.getParent());
		}

		if (entity instanceof ChatMessage) {
			ChatMessage chatMessage = (ChatMessage) entity;
			chatMessage.setDateAndTime(DateAndTime.now());
		}

		if (entity instanceof Impediment) {
			Impediment impediment = (Impediment) entity;
			impediment.setDate(Date.today());
		}

		if (entity instanceof Issue) {
			Issue issue = (Issue) entity;
			issue.setDate(DateAndTime.now());
			issue.setCreator(currentUser);
		}

		if (entity instanceof Task) {
			Task task = (Task) entity;
			Requirement requirement = task.getRequirement();
			requirement.setRejectDate(null);
			requirement.setClosed(false);
			sendToClients(conversation, requirement);
		}

		if (entity instanceof BlogEntry) {
			BlogEntry blogEntry = (BlogEntry) entity;
			blogEntry.addAuthor(currentUser);
		}

		if (entity instanceof Change) {
			Change change = (Change) entity;
			change.setDateAndTime(DateAndTime.now());
			change.setUser(currentUser);
		}

		sendToClients(conversation, entity);

		if (entity instanceof Requirement) {
			Requirement requirement = (Requirement) entity;
			Requirement epic = requirement.getEpic();
			String value = null;
			if (epic != null) {
				value = epic.getReferenceAndLabel();
				Change change = changeDao.postChange(epic, currentUser, "@split", null, requirement.getReference());
				conversation.sendToClient(change);
			}
			Change change = changeDao.postChange(requirement, currentUser, "@created", null, value);
			conversation.sendToClient(change);
		}

		if (entity instanceof Task || entity instanceof Wikipage || entity instanceof Risk
				|| entity instanceof Impediment || entity instanceof Issue || entity instanceof BlogEntry) {
			Change change = changeDao.postChange(entity, currentUser, "@created", null, null);
			conversation.sendToClient(change);
		}

		if (currentUser != null && currentProject != null) {
			ProjectUserConfig config = currentProject.getUserConfig(currentUser);
			config.touch();
			sendToClients(conversation, config);
		}
	}

	private void onEntityDeletedOnClient(GwtConversation conversation, AEntity entity) {
		String entityId = entity.getId();

		User user = conversation.getSession().getUser();

		if (entity instanceof File) {
			File file = (File) entity;
			file.deleteFile();
		}

		if (entity instanceof Task) {
			// update sprint day snapshot before delete
			conversation.getProject().getCurrentSprint().getDaySnapshot(Date.today()).updateWithCurrentSprint();
		}

		if (entity instanceof Project) {
			Project project = (Project) entity;
			Set<User> users = project.getCurrentProjectUsers();
			for (User u : users) {
				u.setCurrentProject(null);
			}
		}

		entity.delete();

		if (entity instanceof Task) onTaskDeleted(conversation, (Task) entity);

		Project project = conversation.getProject();
		if (project != null) {
			for (GwtConversation c : webApplication.getConversationsByProject(project, conversation)) {
				c.getNextData().addDeletedEntity(entityId);
			}
		}

		if (user != null && project != null) {
			ProjectUserConfig config = project.getUserConfig(user);
			config.touch();
			sendToClients(conversation, config);
		}
	}

	private void onTaskDeleted(GwtConversation conversation, Task task) {
		// update sprint day snapshot after delete
		conversation.getProject().getCurrentSprint().getDaySnapshot(Date.today()).updateWithCurrentSprint();
		Requirement requirement = task.getRequirement();
		if (requirement.isInCurrentSprint()) {
			if (task.isOwnerSet()) {
				postProjectEvent(conversation,
					conversation.getSession().getUser().getName() + " deleted " + task.getReferenceAndLabel(), task);
			}
		}
	}

	private void onEntityModifiedOnClient(GwtConversation conversation, AEntity entity, Map<String, String> properties) {
		User currentUser = conversation.getSession().getUser();

		Sprint previousRequirementSprint = entity instanceof Requirement ? ((Requirement) entity).getSprint() : null;

		if (entity instanceof Requirement) {
			postChangeIfChanged(conversation, entity, properties, currentUser, "label");
			postChangeIfChanged(conversation, entity, properties, currentUser, "description");
			postChangeIfChanged(conversation, entity, properties, currentUser, "testDescription");
			postChangeIfChanged(conversation, entity, properties, currentUser, "sprintId");
			postChangeIfChanged(conversation, entity, properties, currentUser, "closed");
			postChangeIfChanged(conversation, entity, properties, currentUser, "issueId");
		}
		Project project = conversation.getProject();
		if (entity instanceof Task) {
			// update sprint day snapshot before change
			if (project.isCurrentSprintSet())
				project.getCurrentSprint().getDaySnapshot(Date.today()).updateWithCurrentSprint();
			postChangeIfChanged(conversation, entity, properties, currentUser, "label");
			postChangeIfChanged(conversation, entity, properties, currentUser, "description");
		}
		if (entity instanceof Wikipage) {
			postChangeIfChanged(conversation, entity, properties, currentUser, "text");
		}
		if (entity instanceof Risk) {
			postChangeIfChanged(conversation, entity, properties, currentUser, "description");
			postChangeIfChanged(conversation, entity, properties, currentUser, "probability");
			postChangeIfChanged(conversation, entity, properties, currentUser, "impact");
			postChangeIfChanged(conversation, entity, properties, currentUser, "probabilityMitigation");
			postChangeIfChanged(conversation, entity, properties, currentUser, "impactMitigation");
		}
		if (entity instanceof Impediment) {
			postChangeIfChanged(conversation, entity, properties, currentUser, "description");
			postChangeIfChanged(conversation, entity, properties, currentUser, "solution");
			postChangeIfChanged(conversation, entity, properties, currentUser, "closed");
		}
		if (entity instanceof Issue) {
			postChangeIfChanged(conversation, entity, properties, currentUser, "description");
			postChangeIfChanged(conversation, entity, properties, currentUser, "statement");
			postChangeIfChanged(conversation, entity, properties, currentUser, "closeDate");
			postChangeIfChanged(conversation, entity, properties, currentUser, "storyId");
		}
		if (entity instanceof BlogEntry) {
			postChangeIfChanged(conversation, entity, properties, currentUser, "text");
		}

		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// !!!!!! Übernahme der Änderungen in die Entity !!!!!!
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		entity.updateProperties(properties);

		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// !!!!!! Nach der Übernahme der Änderungen in die Entity !!!!!!
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		if (entity instanceof Task) onTaskChanged(conversation, (Task) entity, properties);
		if (entity instanceof Requirement)
			onRequirementChanged(conversation, (Requirement) entity, properties, previousRequirementSprint);
		if (entity instanceof Impediment) onImpedimentChanged(conversation, (Impediment) entity, properties);
		if (entity instanceof Issue) onIssueChanged(conversation, (Issue) entity, properties);
		if (entity instanceof BlogEntry) onBlogEntryChanged(conversation, (BlogEntry) entity, properties);
		if (entity instanceof Comment) onCommentChanged(conversation, (Comment) entity, properties);
		if (entity instanceof SystemConfig) onSystemConfigChanged(conversation, (SystemConfig) entity, properties);
		if (entity instanceof Wikipage) onWikipageChanged(conversation, (Wikipage) entity, properties);
		if (entity instanceof Sprint) onSprintChanged(conversation, (Sprint) entity, properties);
		if (entity instanceof Project) onProjectChanged(conversation, (Project) entity, properties);

		Project currentProject = project;
		if (currentUser != null && currentProject != null) {
			ProjectUserConfig config = currentProject.getUserConfig(currentUser);
			config.touch();
			sendToClients(conversation, config);
		}

		conversation.clearRemoteEntitiesByType(Change.class);
		sendToClients(conversation, entity);
	}

	@Override
	protected void onUpdateEntities(GwtConversation conversation, Collection<Map<String, String>> modified,
			Collection<String> deleted) {
		log.info("onUpdateEntities()", modified, deleted);
		// run security checks first
		User user = conversation.getSession().getUser();
		if (modified != null) {
			for (Map<String, String> properties : modified) {
				String id = properties.get("id");
				if (id == null)
					throw new IllegalArgumentException("Missing id property in entity properties map:"
							+ Str.format(properties));
				if (AEntity.exists(id)) {
					AEntity entity = AEntity.getById(id);
					if (!Auth.isEntityEditable(user, entity, properties)) {
						log.warn("Permission denied: EDIT", user.getName(), entity.getId(), entity);
						throw new PermissionDeniedException("Entity " + id + " is not editable by " + user);
					}
				} else {
					String typeName = properties.get("@type");
					if (typeName == null)
						throw new IllegalStateException("Missing @type property for new entity: "
								+ Str.format(properties));
				}
			}
		}
		if (deleted != null) {
			for (String id : deleted) {
				try {
					AEntity entity = AEntity.getById(id);
					if (!Auth.isEntityDeletable(user, entity)) {
						log.warn("Permission denied: DELETE", user.getName(), entity.getId(), entity);
						throw new PermissionDeniedException("Entity " + id + " is not deletable by " + user);
					}
				} catch (EntityDoesNotExistException ex) {
					// already deleted
				}
			}
		}

		// check if deleting possible
		// if (deleted != null) {
		// for (String id : deleted) {
		// try {
		// AEntity entity = AEntity.getById(id);
		// String veto = entity.getDeleteVeto();
		// if (veto != null) {
		// conversation.getNextData().addUserInputError("Löschung nicht möglich: " + veto);
		// return;
		// }
		// } catch (EntityDoesNotExistException ex) {
		// // already deleted
		// }
		// }
		// }

		// make changes
		if (modified != null) {
			for (Map<String, String> properties : modified) {
				String id = properties.get("id");
				if (AEntity.exists(id)) {
					AEntity entity = AEntity.getById(id);
					log.debug("    Entity modified on client:", properties);
					onEntityModifiedOnClient(conversation, entity, properties);
				} else {
					ADao<AEntity> dao = getDaoService().getDaoByName(properties.get("@type"));
					AEntity entity = dao.newEntityInstance(id);
					log.debug("    Entity created on client:", properties);
					onEntityCreatedOnClient(conversation, entity, properties);
				}
			}
		}
		if (deleted != null) {
			for (String entityId : deleted) {
				AEntity entity;
				try {
					entity = AEntity.getById(entityId);
				} catch (EntityDoesNotExistException ex) {
					// already deleted
					entity = null;
				}
				if (entity != null) {
					onEntityDeletedOnClient(conversation, entity);
				}
			}
		}
	}

	private void onProjectChanged(GwtConversation conversation, Project project, Map properties) {
		if (properties.containsKey("participants")) {
			sendToClients(conversation, project.getUserConfigs());
		}
	}

	private void onSprintChanged(GwtConversation conversation, Sprint sprint, Map properties) {
		Project project = sprint.getProject();
		if (project.isCurrentSprint(sprint)) {
			sprint.updateNextSprintDates();
			sendToClients(conversation, project.getNextSprint());
		}
	}

	private void onSystemConfigChanged(GwtConversation conversation, SystemConfig config, Map properties) {
		if (properties.containsKey("url")) {
			webApplication.getConfig().setUrl(config.getUrl());
		}
	}

	private void onCommentChanged(GwtConversation conversation, Comment comment, Map properties) {
		conversation.getProject().updateHomepage(comment.getParent());
		if (comment.isPublished() && properties.containsKey("published")) {
			subscriptionService.notifySubscribers(comment.getParent(),
				"New comment posted by " + comment.getAuthorLabel(), conversation.getProject(), null);
		}
	}

	private void onBlogEntryChanged(GwtConversation conversation, BlogEntry blogEntry, Map properties) {
		User currentUser = conversation.getSession().getUser();
		boolean homepageUpdated = false;

		if (properties.containsKey("text")) {
			blogEntry.addAuthor(currentUser);
		}

		if (properties.containsKey("published")) {
			if (blogEntry.isPublished()) {
				postProjectEvent(conversation,
					currentUser.getName() + " published " + blogEntry.getReferenceAndLabel(), blogEntry);
			}
			blogEntry.getProject().updateHomepage();
			homepageUpdated = true;
		}

		if (blogEntry.isPublished() && !homepageUpdated) {
			blogEntry.getProject().updateHomepage(blogEntry);
		}
	}

	private void onWikipageChanged(GwtConversation conversation, Wikipage wikipage, Map properties) {
		conversation.getProject().updateHomepage(wikipage);
	}

	private void onIssueChanged(GwtConversation conversation, Issue issue, Map properties) {
		User currentUser = conversation.getSession().getUser();

		if (properties.containsKey("closeDate")) {
			if (issue.isClosed()) {
				issue.setCloseDate(Date.today());
				postProjectEvent(conversation, currentUser.getName() + " closed " + issue.getReferenceAndLabel(), issue);
				subscriptionService.notifySubscribers(issue, "Issue closed", conversation.getProject(), null);
			} else {
				postProjectEvent(conversation, currentUser.getName() + " reopened " + issue.getReferenceAndLabel(),
					issue);
				subscriptionService.notifySubscribers(issue, "Issue reopened", conversation.getProject(), null);
			}
		}

		if (properties.containsKey("ownerId")) {
			if (issue.isOwnerSet()) {
				if (!issue.isFixed()) {
					postProjectEvent(conversation, currentUser.getName() + " claimed " + issue.getReferenceAndLabel(),
						issue);
				}

				Release nextRelease = issue.getProject().getNextRelease();
				if (nextRelease != null && issue.isFixReleasesEmpty()) {
					issue.setFixReleases(Collections.singleton(nextRelease));
				}
			} else {
				if (!issue.isClosed())
					postProjectEvent(conversation,
						currentUser.getName() + " unclaimed " + issue.getReferenceAndLabel(), issue);
			}
		}

		if (properties.containsKey("fixDate")) {
			if (issue.isFixed()) {
				postProjectEvent(conversation, currentUser.getName() + " fixed " + issue.getReferenceAndLabel(), issue);
			} else {
				postProjectEvent(conversation,
					currentUser.getName() + " rejected fix for " + issue.getReferenceAndLabel(), issue);
			}
		}

		if (properties.containsKey("urgent")) {
			if (issue.isBug()) {
				Release currentRelease = issue.getProject().getCurrentRelease();
				if (issue.isAffectedReleasesEmpty() && currentRelease != null) {
					issue.setAffectedReleases(Collections.singleton(currentRelease));
				}
			}
		}

		if (properties.containsKey("acceptDate")) {
			if (issue.isIdea() || issue.isBug()) {
				postProjectEvent(conversation, currentUser.getName() + " accepted " + issue.getReferenceAndLabel(),
					issue);
				subscriptionService.notifySubscribers(issue, "Issue accepted", conversation.getProject(), null);
			}
		}

		issue.getProject().updateHomepage(issue);
	}

	private void onImpedimentChanged(GwtConversation conversation, Impediment impediment, Map properties) {
		User currentUser = conversation.getSession().getUser();
		if (properties.containsKey("closed")) {
			if (impediment.isClosed()) {
				impediment.setDate(Date.today());
				postProjectEvent(conversation, currentUser.getName() + " closed " + impediment.getReferenceAndLabel(),
					impediment);
			} else {
				postProjectEvent(conversation,
					currentUser.getName() + " reopened " + impediment.getReferenceAndLabel(), impediment);
			}
		}
	}

	private void onRequirementChanged(GwtConversation conversation, Requirement requirement, Map properties,
			Sprint previousRequirementSprint) {
		Project currentProject = conversation.getProject();
		Sprint sprint = requirement.getSprint();
		boolean inCurrentSprint = sprint != null && currentProject.isCurrentSprint(sprint);
		User currentUser = conversation.getSession().getUser();

		if (properties.containsKey("description") || properties.containsKey("testDescription")
				|| properties.containsKey("qualitysIds")) {
			requirement.setDirty(true);
			conversation.sendToClient(requirement);
		}

		if (properties.containsKey("rejectDate") && requirement.isRejectDateSet()) {
			postProjectEvent(conversation, currentUser.getName() + " rejected " + requirement.getReferenceAndLabel(),
				requirement);
		}

		if (properties.containsKey("accepted") && requirement.isRejectDateSet()) {
			postProjectEvent(conversation, currentUser.getName() + " accepted " + requirement.getReferenceAndLabel(),
				requirement);
		}

		if (sprint != previousRequirementSprint) {
			if (properties.containsKey("sprintId")) {
				if (inCurrentSprint) {
					postProjectEvent(conversation,
						currentUser.getName() + " pulled " + requirement.getReferenceAndLabel() + " to current sprint",
						requirement);
					subscriptionService.notifySubscribers(requirement, "Story pulled to current Sprint",
						conversation.getProject(), null);
				} else {
					postProjectEvent(conversation,
						currentUser.getName() + " kicked " + requirement.getReferenceAndLabel()
						+ " from current sprint", requirement);
					subscriptionService.notifySubscribers(requirement, "Story kicked from current Sprint",
						conversation.getProject(), null);
				}
			}
		}

		if (properties.containsKey("estimatedWork")) {
			requirement.initializeEstimationVotes();
			requirement.setDirty(false);
			requirement.setWorkEstimationVotingShowoff(false);
			requirement.setWorkEstimationVotingActive(false);
			conversation.sendToClient(requirement);
		}

		requirement.getProject().getCurrentSprintSnapshot().update();
	}

	private void onTaskChanged(GwtConversation conversation, Task task, Map properties) {
		// update sprint day snapshot after change
		Sprint sprint = conversation.getProject().getCurrentSprint();
		sprint.getDaySnapshot(Date.today()).updateWithCurrentSprint();
		Requirement requirement = task.getRequirement();
		if (requirement.isInCurrentSprint()) {
			User currentUser = conversation.getSession().getUser();
			if (task.isClosed() && properties.containsKey("remainingWork")) {
				String event = currentUser.getName() + " closed " + task.getReferenceAndLabel();
				if (requirement.isTasksClosed()) {
					event += ", all tasks closed in " + requirement.getReferenceAndLabel();
				}
				postProjectEvent(conversation, event, task);
			} else if (task.isOwnerSet() && properties.containsKey("ownerId")) {
				postProjectEvent(conversation, currentUser.getName() + " claimed " + task.getReferenceAndLabel(), task);
			}
			if (!task.isOwnerSet() && properties.containsKey("ownerId")) {
				postProjectEvent(conversation, currentUser.getName() + " unclaimed " + task.getReferenceAndLabel(),
					task);
			}
			if (!task.isClosed() && requirement.isRejectDateSet()) {
				requirement.setRejectDate(null);
				sendToClients(conversation, requirement);
			}
			if (properties.containsKey("remainingWork") && sprint.getEnd().isPast()) {
				sprint.setEnd(Date.today());
			}
		}
	}

	@Override
	public void onRequestProjectEvents(GwtConversation conversation) {
		assertProjectSelected(conversation);
		conversation.sendToClient(conversation.getProject().getLatestProjectEvents(50));
	}

	@Override
	public void onCloseProject(GwtConversation conversation) {
		Project project = conversation.getProject();
		if (project != null && conversation.getSession().getGwtConversations().size() < 2) {
			ProjectUserConfig config = project.getUserConfig(conversation.getSession().getUser());
			config.reset();
			sendToClients(conversation, config);
		}
		conversation.clearRemoteEntities();
		conversation.setProject(null);
	}

	@Override
	public void onRequestForum(GwtConversation conversation, boolean all) {
		Project project = conversation.getProject();
		Set<AEntity> parents = new HashSet<AEntity>();
		for (Subject subject : project.getSubjects()) {
			if (subject.getComments().isEmpty()) parents.add(subject);
		}
		for (Comment comment : project.getLatestComments()) {
			AEntity parent = comment.getParent();
			if (!all && !conversation.isAvailableOnClient(parent)
					&& comment.getDateAndTime().getPeriodToNow().abs().toDays() > 7) continue;
			conversation.sendToClient(comment);
			parents.add(parent);
		}
		conversation.sendToClient(parents);
	}

	@Override
	public void onRequestImpediments(GwtConversation conversation) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();
		conversation.sendToClient(project.getImpediments());
	}

	@Override
	public void onRequestRisks(GwtConversation conversation) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();
		conversation.sendToClient(project.getRisks());
	}

	@Override
	public void onRequestAcceptedIssues(GwtConversation conversation) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();
		conversation.sendToClient(project.getAcceptedIssues());
	}

	@Override
	public void onRequestClosedIssues(GwtConversation conversation) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();
		conversation.sendToClient(project.getClosedIssues());
	}

	@Override
	public void onRequestReleaseIssues(GwtConversation conversation, String releaseId) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();
		Release release;
		try {
			release = releaseDao.getById(releaseId);
		} catch (EntityDoesNotExistException ex) {
			// release does not exist yet (timing problem directly after creating a new release)
			return;
		}
		if (!release.isProject(project)) throw new PermissionDeniedException();
		conversation.sendToClient(release.getIssues());
	}

	@Override
	public void onRequestEntity(GwtConversation conversation, String entityId) {
		assertProjectSelected(conversation);

		try {
			AEntity entity = getDaoService().getById(entityId);
			if (!Auth.isVisible(entity, conversation.getSession().getUser())) throw new PermissionDeniedException();
			// TODO check if entity is from project
			conversation.sendToClient(entity);
			conversation.sendToClient(getAssociatedEntities(entity));
		} catch (EntityDoesNotExistException ex) {
			log.info("Requested entity not found:", entityId);
			// nop
		}
	}

	@Override
	public void onRequestEntityByReference(GwtConversation conversation, String reference) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();

		AEntity entity = project.getEntityByReference(reference);
		if (entity == null) {
			log.info("Requested entity not found:", reference);
		} else {
			conversation.sendToClient(entity);
			conversation.sendToClient(getAssociatedEntities(entity));
		}
	}

	private Set<AEntity> getAssociatedEntities(AEntity entity) {
		Set<AEntity> ret = new HashSet<AEntity>();

		if (entity instanceof Task) {
			Task task = (Task) entity;
			Set<SprintReport> reports = sprintReportDao.getSprintReportsByClosedTask(task);
			reports.addAll(sprintReportDao.getSprintReportsByOpenTask(task));
			for (SprintReport report : reports) {
				ret.addAll(getAssociatedEntities(report));
			}
		}

		if (entity instanceof Requirement) {
			Requirement requirement = (Requirement) entity;
			Set<SprintReport> reports = sprintReportDao.getSprintReportsByCompletedRequirement(requirement);
			reports.addAll(sprintReportDao.getSprintReportsByRejectedRequirement(requirement));
			for (SprintReport report : reports) {
				ret.addAll(getAssociatedEntities(report));
			}
		}

		if (entity instanceof SprintReport) {
			SprintReport report = (SprintReport) entity;
			ret.add(report.getSprint());
		}

		return ret;
	}

	@Override
	public void onRequestComments(GwtConversation conversation, String parentId) {
		conversation.sendToClient(commentDao.getCommentsByParentId(parentId));
	}

	@Override
	public void onRequestChanges(GwtConversation conversation, String parentId) {
		conversation.sendToClient(changeDao.getChangesByParentId(parentId));
	}

	@Override
	public void onRequestRequirementEstimationVotes(GwtConversation conversation, String requirementId) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();
		Requirement requirement = requirementDao.getById(requirementId);
		if (!requirement.isProject(project)) throw new PermissionDeniedException();
		conversation.sendToClient(requirement.getEstimationVotes());
	}

	@Override
	public void onActivateRequirementEstimationVoting(GwtConversation conversation, String requirementId) {
		Requirement requirement = requirementDao.getById(requirementId);
		if (requirement == null || !requirement.isProject(conversation.getProject()))
			throw new PermissionDeniedException();
		requirement.initializeEstimationVotes();
		requirement.setWorkEstimationVotingActive(true);
		requirement.setWorkEstimationVotingShowoff(false);
		sendToClients(conversation, requirement);
		sendToClients(conversation, requirement.getEstimationVotes());
	}

	@Override
	public void onSwitchToNextSprint(GwtConversation conversation) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();
		Sprint oldSprint = project.getCurrentSprint();
		for (Requirement requirement : oldSprint.getRequirements()) {
			if (!requirement.isClosed()) {
				requirement.setDirty(true);
			}
		}
		Sprint newSprint = project.switchToNextSprint();
		postProjectEvent(conversation, conversation.getSession().getUser() + " switched to next sprint ", newSprint);

		Set<Sprint> relevantSprints = project.getRelevantSprints();
		relevantSprints.add(oldSprint);
		relevantSprints.add(newSprint);
		for (Sprint sprint : relevantSprints) {
			sendToClients(conversation, sprint);
			sendToClients(conversation, sprint.getSprintReport());
			sendToClients(conversation, sprint.getRequirements());
			sendToClients(conversation, sprint.getTasks());
		}

		for (Requirement requirement : project.getRequirements()) {
			sendToClients(conversation, requirement);
			sendToClients(conversation, requirement.getTasks());
		}

		sendToClients(conversation, oldSprint.getReleases());
		sendToClients(conversation, project);
	}

	@Override
	public void onSelectProject(GwtConversation conversation, String projectId) {
		Project project = projectDao.getById(projectId);
		User user = conversation.getSession().getUser();
		if (!project.isVisibleFor(user))
			throw new PermissionDeniedException("Project '" + project + "' is not visible for user '" + user + "'");

		project.setLastOpenedDateAndTime(DateAndTime.now());
		conversation.setProject(project);
		user.setCurrentProject(project);
		ProjectUserConfig config = project.getUserConfig(user);
		config.touch();

		conversation.sendToClient(project);
		conversation.sendToClient(project.getSprints());
		conversation.sendToClient(project.getParticipants());
		for (Requirement requirement : project.getProductBacklogRequirements()) {
			conversation.sendToClient(requirement);
			conversation.sendToClient(requirement.getEstimationVotes());
		}
		for (Requirement requirement : project.getCurrentSprint().getRequirements()) {
			conversation.sendToClient(requirement);
			conversation.sendToClient(requirement.getTasksInSprint());
		}
		conversation.sendToClient(project.getQualitys());
		conversation.sendToClient(project.getUserConfigs());
		conversation.sendToClient(project.getWikipages());
		conversation.sendToClient(project.getImpediments());
		conversation.sendToClient(project.getRisks());
		conversation.sendToClient(project.getLatestProjectEvents(5));
		conversation.sendToClient(project.getCalendarEvents());
		conversation.sendToClient(project.getFiles());
		conversation.sendToClient(project.getOpenIssues());
		conversation.sendToClient(project.getReleases());
		conversation.sendToClient(project.getBlogEntrys());

		sendToClients(conversation, config);
	}

	@Override
	public void onUpdateProjectHomepage(GwtConversation conversation) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();
		project.updateHomepage();
	}

	@Override
	public void onSendTestEmail(GwtConversation conversation) {
		// if (true) throw new GwtConversationDoesNotExist(666); // TODO remove!!!!!
		emailSender.sendEmail((String) null, null, "Kunagi email test", "Kunagi email test");
	}

	@Override
	public void onTestLdap(GwtConversation conversation) {
		SystemConfig config = webApplication.getSystemConfig();
		try {
			Ldap.authenticateUserGetEmail(config.getLdapUrl(), config.getLdapUser(), config.getLdapPassword(),
				config.getLdapBaseDn(), config.getLdapUserFilterRegex(), "dummyUser", "dummyPassword");
		} catch (WrongPasswordInputException ex) {}
	}

	@Override
	public void onTouchLastActivity(GwtConversation conversation) {
		Project project = conversation.getProject();
		if (project == null) return;
		project.getUserConfig(conversation.getSession().getUser()).touch();
	}

	@Override
	public void onPublishRelease(GwtConversation conversation, String releaseId) {
		Project project = conversation.getProject();
		Release release = (Release) getDaoService().getEntityById(releaseId);
		if (!release.isProject(project)) throw new PermissionDeniedException();
		release.release(project, conversation.getSession().getUser(), webApplication);
		project.updateHomepage();
	}

	@Override
	public void onPing(GwtConversation conversation) {
		// nop
	}

	@Override
	public void onSleep(GwtConversation conversation, long millis) {
		Utl.sleep(millis);
	}

	// --- helper ---

	@Override
	public DataTransferObject startConversation(int conversationNumber) {
		log.debug("startConversation");
		WebSession session = (WebSession) getSession();
		GwtConversation conversation = session.getGwtConversation(-1);
		ilarkesto.di.Context context = ilarkesto.di.Context.get();
		context.setName("gwt-srv:startConversation");
		context.bindCurrentThread();
		try {
			onStartConversation(conversation);
			onServiceMethodExecuted(context);
		} catch (Throwable t) {
			handleServiceMethodException(conversation.getNumber(), "startConversation", t, context);
		}
		return (scrum.client.DataTransferObject) conversation.popNextData();
	}

	private void postChangeIfChanged(GwtConversation conversation, AEntity entity, Map properties, User user,
			String property) {
		if (properties.containsKey(property)) {
			Object oldValue = Reflect.getProperty(entity, property);
			Object newValue = properties.get(property);
			Change change = changeDao.postChange(entity, user, property, oldValue, newValue);
			conversation.sendToClient(change);
		}
	}

	private void postProjectEvent(GwtConversation conversation, String message, AEntity subject) {
		assertProjectSelected(conversation);
		Project project = conversation.getProject();
		postProjectEvent(conversation, project, message, subject);
	}

	private void postProjectEvent(GwtConversation conversation, Project project, String message, AEntity subject) {
		webApplication.postProjectEvent(project, message, subject);

		try {
			sendProjectEventEmails(message, subject, project, conversation.getSession().getUser().getEmail());
		} catch (Throwable ex) {
			log.error("Sending project event notification emails failed.", ex);
		}
	}

	public void sendProjectEventEmails(String message, AEntity subject, Project project, String exceptionEmail) {
		if (exceptionEmail != null) exceptionEmail = exceptionEmail.toLowerCase();
		String subjectText = EmailHelper.createSubject(project, message);
		String emailText = createProjectEventEmailText(project, message, subject);
		for (ProjectUserConfig config : project.getUserConfigs()) {
			if (!config.isReceiveEmailsOnProjectEvents()) continue;
			String email = config.getUser().getEmail();
			if (!Str.isEmail(email)) continue;
			if (email.toLowerCase().equals(exceptionEmail)) continue;
			emailSender.sendEmail(project, email, subjectText, emailText);
		}
	}

	private String createProjectEventEmailText(Project project, String message, AEntity subject) {
		StringBuilder sb = new StringBuilder();
		sb.append(message).append("\n");
		sb.append(webApplication.createUrl(project, subject)).append("\n");
		return sb.toString();
	}

	private void sendToClients(GwtConversation conversation, Collection<? extends AEntity> entities) {
		for (AEntity entity : entities) {
			sendToClients(conversation, entity);
		}
	}

	private void sendToClients(GwtConversation conversation, AEntity entity) {
		webApplication.sendToConversationsByProject(conversation, entity);
	}

	private void assertProjectSelected(GwtConversation conversation) {
		if (conversation.getProject() == null) throw new RuntimeException("No project selected.");
	}

	@Override
	protected AWebApplication getWebApplication() {
		return webApplication;
	}

	@Override
	public void onConvertIssueToStory(GwtConversation conversation, String issueId) {
		Issue issue = issueDao.getById(issueId);
		Requirement story = requirementDao.postRequirement(issue);
		issue.appendToStatement("Created Story " + story.getReference() + " in Product Backlog.");
		issue.setUrgent(false);
		issue.clearFixReleases();
		issue.setCloseDate(Date.today());
		sendToClients(conversation, story);
		sendToClients(conversation, issue);
		User currentUser = conversation.getSession().getUser();
		postProjectEvent(conversation,
			currentUser.getName() + " created " + story.getReference() + " from " + issue.getReferenceAndLabel(), issue);
		changeDao.postChange(issue, currentUser, "storyId", null, story.getId());
		changeDao.postChange(story, currentUser, "issueId", null, issue.getId());
		subscriptionService.copySubscribers(issue, story);
		subscriptionService.notifySubscribers(story, "Story created from " + issue, conversation.getProject(), null);
	}

	@Override
	public void onMoveRequirementToProject(GwtConversation conversation, String destinationProjectId,
			String requirementId) {
		assertProjectSelected(conversation);
		User currentUser = conversation.getSession().getUser();
		Requirement requirement = requirementDao.getById(requirementId);

		Project destinationProject = projectDao.getById(destinationProjectId);

		AEntity newRequirement;
		if (destinationProject.containsProductOwner(currentUser)) {
			newRequirement = requirementDao.postRequirement(destinationProject, requirement);
		} else {
			newRequirement = issueDao.postIssue(destinationProject, requirement);
			Issue issue = (Issue) newRequirement;
			issue.setCreator(currentUser);
			postProjectEvent(conversation, destinationProject,
				currentUser.getName() + " created " + issue.getReferenceAndLabel(), issue);
		}
		subscriptionService.copySubscribers(requirement, newRequirement);
		changeDao.postChange(newRequirement, currentUser, "@moved", null, conversation.getProject().getId());

		webApplication.sendToConversationsByProject(destinationProject, newRequirement);
		webApplication.sendToConversationsByProject(destinationProject, destinationProject);

		deleteRequirement(conversation, requirement);
	}
}
