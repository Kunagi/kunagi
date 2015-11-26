// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.admin;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GUser
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, ilarkesto.auth.EditProtected<scrum.server.admin.User>, java.lang.Comparable<User>, ilarkesto.core.search.Searchable {

    public static class UserMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata name = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "name";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getName();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata password = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "password";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getPassword();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata passwordSalt = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "passwordSalt";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getPasswordSalt();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata publicName = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "publicName";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getPublicName();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata fullName = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "fullName";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getFullName();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata admin = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "admin";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isAdmin();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata emailVerified = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "emailVerified";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isEmailVerified();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata email = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "email";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getEmail();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata currentProject = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "currentProject";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getCurrentProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata color = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "color";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getColor();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastLoginDateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastLoginDateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getLastLoginDateAndTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata registrationDateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "registrationDateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getRegistrationDateAndTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata disabled = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "disabled";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isDisabled();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideBlog = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideBlog";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideBlog();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideCalendar = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideCalendar";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideCalendar();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideFiles = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideFiles";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideFiles();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideForum = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideForum";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideForum();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideImpediments = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideImpediments";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideImpediments();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideIssues = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideIssues";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideIssues();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideJournal = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideJournal";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideJournal();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideNextSprint = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideNextSprint";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideNextSprint();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideProductBacklog = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideProductBacklog";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideProductBacklog();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideCourtroom = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideCourtroom";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideCourtroom();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideQualityBacklog = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideQualityBacklog";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideQualityBacklog();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideReleases = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideReleases";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideReleases();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideRisks = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideRisks";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideRisks();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideSprintBacklog = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideSprintBacklog";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideSprintBacklog();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata hideUserGuideWhiteboard = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "hideUserGuideWhiteboard";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).isHideUserGuideWhiteboard();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata loginToken = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "loginToken";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getLoginToken();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata openId = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "openId";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((User)entity).getOpenId();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            name
            ,password
            ,passwordSalt
            ,publicName
            ,fullName
            ,admin
            ,emailVerified
            ,email
            ,currentProject
            ,color
            ,lastLoginDateAndTime
            ,registrationDateAndTime
            ,disabled
            ,hideUserGuideBlog
            ,hideUserGuideCalendar
            ,hideUserGuideFiles
            ,hideUserGuideForum
            ,hideUserGuideImpediments
            ,hideUserGuideIssues
            ,hideUserGuideJournal
            ,hideUserGuideNextSprint
            ,hideUserGuideProductBacklog
            ,hideUserGuideCourtroom
            ,hideUserGuideQualityBacklog
            ,hideUserGuideReleases
            ,hideUserGuideRisks
            ,hideUserGuideSprintBacklog
            ,hideUserGuideWhiteboard
            ,loginToken
            ,openId
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("name".equals(fieldName)) return name;
            if ("password".equals(fieldName)) return password;
            if ("passwordSalt".equals(fieldName)) return passwordSalt;
            if ("publicName".equals(fieldName)) return publicName;
            if ("fullName".equals(fieldName)) return fullName;
            if ("admin".equals(fieldName)) return admin;
            if ("emailVerified".equals(fieldName)) return emailVerified;
            if ("email".equals(fieldName)) return email;
            if ("currentProject".equals(fieldName)) return currentProject;
            if ("currentProjectId".equals(fieldName)) return currentProject;
            if ("color".equals(fieldName)) return color;
            if ("lastLoginDateAndTime".equals(fieldName)) return lastLoginDateAndTime;
            if ("registrationDateAndTime".equals(fieldName)) return registrationDateAndTime;
            if ("disabled".equals(fieldName)) return disabled;
            if ("hideUserGuideBlog".equals(fieldName)) return hideUserGuideBlog;
            if ("hideUserGuideCalendar".equals(fieldName)) return hideUserGuideCalendar;
            if ("hideUserGuideFiles".equals(fieldName)) return hideUserGuideFiles;
            if ("hideUserGuideForum".equals(fieldName)) return hideUserGuideForum;
            if ("hideUserGuideImpediments".equals(fieldName)) return hideUserGuideImpediments;
            if ("hideUserGuideIssues".equals(fieldName)) return hideUserGuideIssues;
            if ("hideUserGuideJournal".equals(fieldName)) return hideUserGuideJournal;
            if ("hideUserGuideNextSprint".equals(fieldName)) return hideUserGuideNextSprint;
            if ("hideUserGuideProductBacklog".equals(fieldName)) return hideUserGuideProductBacklog;
            if ("hideUserGuideCourtroom".equals(fieldName)) return hideUserGuideCourtroom;
            if ("hideUserGuideQualityBacklog".equals(fieldName)) return hideUserGuideQualityBacklog;
            if ("hideUserGuideReleases".equals(fieldName)) return hideUserGuideReleases;
            if ("hideUserGuideRisks".equals(fieldName)) return hideUserGuideRisks;
            if ("hideUserGuideSprintBacklog".equals(fieldName)) return hideUserGuideSprintBacklog;
            if ("hideUserGuideWhiteboard".equals(fieldName)) return hideUserGuideWhiteboard;
            if ("loginToken".equals(fieldName)) return loginToken;
            if ("openId".equals(fieldName)) return openId;
            return null;
        }

    }

    public static transient final UserMetadata metadata = new UserMetadata();

    @Override
    public UserMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(User.class);

    // --- AEntity ---

    public final scrum.server.admin.UserDao getDao() {
        return userDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class AUserQuery extends ilarkesto.core.persistance.AEntityQuery<User> {
    @Override
        public Class<User> getType() {
            return User.class;
        }
    }

    public static Set<User> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(User.class).list();
    }

    public static User getById(String id) {
        return (User) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getCurrentProject()); } catch(EntityDoesNotExistException ex) {}
    // --- back references ---
        ret.addAll(getProjects());
        ret.addAll(getProjectWithAdminss());
        ret.addAll(getProjectWithProductOwnerss());
        ret.addAll(getProjectWithScrumMasterss());
        ret.addAll(getProjectWithTeamMemberss());
        ret.addAll(getSprints());
        ret.addAll(getSprintWithScrumMasterss());
        ret.addAll(getSprintWithTeamMemberss());
        ret.addAll(getEmoticons());
        ret.addAll(getProjectUserConfigs());
        ret.addAll(getIssues());
        ret.addAll(getIssueWithOwners());
        ret.addAll(getTasks());
        ret.addAll(getChanges());
        ret.addAll(getComments());
        ret.addAll(getChatMessages());
        ret.addAll(getBlogEntrys());
        ret.addAll(getRequirementEstimationVotes());
        ret.addAll(getEmoticonWithOwners());
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("name", ilarkesto.core.persistance.Persistence.propertyAsString(this.name));
        properties.put("password", ilarkesto.core.persistance.Persistence.propertyAsString(this.password));
        properties.put("passwordSalt", ilarkesto.core.persistance.Persistence.propertyAsString(this.passwordSalt));
        properties.put("publicName", ilarkesto.core.persistance.Persistence.propertyAsString(this.publicName));
        properties.put("fullName", ilarkesto.core.persistance.Persistence.propertyAsString(this.fullName));
        properties.put("admin", ilarkesto.core.persistance.Persistence.propertyAsString(this.admin));
        properties.put("emailVerified", ilarkesto.core.persistance.Persistence.propertyAsString(this.emailVerified));
        properties.put("email", ilarkesto.core.persistance.Persistence.propertyAsString(this.email));
        properties.put("currentProjectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.currentProjectId));
        properties.put("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
        properties.put("lastLoginDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastLoginDateAndTime));
        properties.put("registrationDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.registrationDateAndTime));
        properties.put("disabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.disabled));
        properties.put("hideUserGuideBlog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideBlog));
        properties.put("hideUserGuideCalendar", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCalendar));
        properties.put("hideUserGuideFiles", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideFiles));
        properties.put("hideUserGuideForum", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideForum));
        properties.put("hideUserGuideImpediments", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideImpediments));
        properties.put("hideUserGuideIssues", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideIssues));
        properties.put("hideUserGuideJournal", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideJournal));
        properties.put("hideUserGuideNextSprint", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideNextSprint));
        properties.put("hideUserGuideProductBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideProductBacklog));
        properties.put("hideUserGuideCourtroom", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCourtroom));
        properties.put("hideUserGuideQualityBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideQualityBacklog));
        properties.put("hideUserGuideReleases", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideReleases));
        properties.put("hideUserGuideRisks", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideRisks));
        properties.put("hideUserGuideSprintBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideSprintBacklog));
        properties.put("hideUserGuideWhiteboard", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideWhiteboard));
        properties.put("loginToken", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginToken));
        properties.put("openId", ilarkesto.core.persistance.Persistence.propertyAsString(this.openId));
    }

    @Override
    public int compareTo(User other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    public final java.util.Set<scrum.server.project.Project> getProjects() {
        return projectDao.getProjectsByParticipant((User)this);
    }

    public final java.util.Set<scrum.server.project.Project> getProjectWithAdminss() {
        return projectDao.getProjectsByAdmin((User)this);
    }

    public final java.util.Set<scrum.server.project.Project> getProjectWithProductOwnerss() {
        return projectDao.getProjectsByProductOwner((User)this);
    }

    public final java.util.Set<scrum.server.project.Project> getProjectWithScrumMasterss() {
        return projectDao.getProjectsByScrumMaster((User)this);
    }

    public final java.util.Set<scrum.server.project.Project> getProjectWithTeamMemberss() {
        return projectDao.getProjectsByTeamMember((User)this);
    }

    public final java.util.Set<scrum.server.sprint.Sprint> getSprints() {
        return sprintDao.getSprintsByProductOwner((User)this);
    }

    public final java.util.Set<scrum.server.sprint.Sprint> getSprintWithScrumMasterss() {
        return sprintDao.getSprintsByScrumMaster((User)this);
    }

    public final java.util.Set<scrum.server.sprint.Sprint> getSprintWithTeamMemberss() {
        return sprintDao.getSprintsByTeamMember((User)this);
    }

    public final java.util.Set<scrum.server.collaboration.Emoticon> getEmoticons() {
        return emoticonDao.getEmoticonsByOwner((User)this);
    }

    public final java.util.Set<scrum.server.admin.ProjectUserConfig> getProjectUserConfigs() {
        return projectUserConfigDao.getProjectUserConfigsByUser((User)this);
    }

    public final java.util.Set<scrum.server.issues.Issue> getIssues() {
        return issueDao.getIssuesByCreator((User)this);
    }

    public final java.util.Set<scrum.server.issues.Issue> getIssueWithOwners() {
        return issueDao.getIssuesByOwner((User)this);
    }

    public final java.util.Set<scrum.server.sprint.Task> getTasks() {
        return taskDao.getTasksByOwner((User)this);
    }

    public final java.util.Set<scrum.server.journal.Change> getChanges() {
        return changeDao.getChangesByUser((User)this);
    }

    public final java.util.Set<scrum.server.collaboration.Comment> getComments() {
        return commentDao.getCommentsByAuthor((User)this);
    }

    public final java.util.Set<scrum.server.collaboration.ChatMessage> getChatMessages() {
        return chatMessageDao.getChatMessagesByAuthor((User)this);
    }

    public final java.util.Set<scrum.server.pr.BlogEntry> getBlogEntrys() {
        return blogEntryDao.getBlogEntrysByAuthor((User)this);
    }

    public final java.util.Set<scrum.server.estimation.RequirementEstimationVote> getRequirementEstimationVotes() {
        return requirementEstimationVoteDao.getRequirementEstimationVotesByUser((User)this);
    }

    public final java.util.Set<scrum.server.collaboration.Emoticon> getEmoticonWithOwners() {
        return emoticonDao.getEmoticonsByOwner((User)this);
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GUser.class);

    public static final String TYPE = "User";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getName(), getPublicName(), getFullName(), getEmail());
    }
    // -----------------------------------------------------------
    // - name
    // -----------------------------------------------------------

    private java.lang.String name;

    public final java.lang.String getName() {
        return name;
    }

    public final void setName(java.lang.String name) {
        name = prepareName(name);
        if (isName(name)) return;
        if (name != null) {
            Object existing = getDao().getUserByName(name);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"name", name);
        }
        this.name = name;
            updateLastModified();
            fireModified("name", ilarkesto.core.persistance.Persistence.propertyAsString(this.name));
    }

    private final void updateName(java.lang.String name) {
        if (isName(name)) return;
        if (name != null) {
            Object existing = getDao().getUserByName(name);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"name", name);
        }
        this.name = name;
            updateLastModified();
            fireModified("name", ilarkesto.core.persistance.Persistence.propertyAsString(this.name));
    }

    protected java.lang.String prepareName(java.lang.String name) {
         name = Str.removeControlChars(name);
        return name;
    }

    public final boolean isNameSet() {
        return this.name != null;
    }

    public final boolean isName(java.lang.String name) {
        if (this.name == null && name == null) return true;
        return this.name != null && this.name.equals(name);
    }

    protected final void updateName(Object value) {
        setName((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - password
    // -----------------------------------------------------------

    private java.lang.String password;

    public final java.lang.String getPassword() {
        return password;
    }

    public final void setPassword(java.lang.String password) {
        password = preparePassword(password);
        if (isPassword(password)) return;
        this.password = password;
            updateLastModified();
            fireModified("password", ilarkesto.core.persistance.Persistence.propertyAsString(this.password));
    }

    private final void updatePassword(java.lang.String password) {
        if (isPassword(password)) return;
        this.password = password;
            updateLastModified();
            fireModified("password", ilarkesto.core.persistance.Persistence.propertyAsString(this.password));
    }

    protected java.lang.String preparePassword(java.lang.String password) {
         password = Str.removeControlChars(password);
        return password;
    }

    public final boolean isPasswordSet() {
        return this.password != null;
    }

    public final boolean isPassword(java.lang.String password) {
        if (this.password == null && password == null) return true;
        return this.password != null && this.password.equals(password);
    }

    protected final void updatePassword(Object value) {
        setPassword((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - passwordSalt
    // -----------------------------------------------------------

    private java.lang.String passwordSalt;

    public final java.lang.String getPasswordSalt() {
        return passwordSalt;
    }

    public final void setPasswordSalt(java.lang.String passwordSalt) {
        passwordSalt = preparePasswordSalt(passwordSalt);
        if (isPasswordSalt(passwordSalt)) return;
        this.passwordSalt = passwordSalt;
            updateLastModified();
            fireModified("passwordSalt", ilarkesto.core.persistance.Persistence.propertyAsString(this.passwordSalt));
    }

    private final void updatePasswordSalt(java.lang.String passwordSalt) {
        if (isPasswordSalt(passwordSalt)) return;
        this.passwordSalt = passwordSalt;
            updateLastModified();
            fireModified("passwordSalt", ilarkesto.core.persistance.Persistence.propertyAsString(this.passwordSalt));
    }

    protected java.lang.String preparePasswordSalt(java.lang.String passwordSalt) {
         passwordSalt = Str.removeControlChars(passwordSalt);
        return passwordSalt;
    }

    public final boolean isPasswordSaltSet() {
        return this.passwordSalt != null;
    }

    public final boolean isPasswordSalt(java.lang.String passwordSalt) {
        if (this.passwordSalt == null && passwordSalt == null) return true;
        return this.passwordSalt != null && this.passwordSalt.equals(passwordSalt);
    }

    protected final void updatePasswordSalt(Object value) {
        setPasswordSalt((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - publicName
    // -----------------------------------------------------------

    private java.lang.String publicName;

    public final java.lang.String getPublicName() {
        return publicName;
    }

    public final void setPublicName(java.lang.String publicName) {
        publicName = preparePublicName(publicName);
        if (isPublicName(publicName)) return;
        this.publicName = publicName;
            updateLastModified();
            fireModified("publicName", ilarkesto.core.persistance.Persistence.propertyAsString(this.publicName));
    }

    private final void updatePublicName(java.lang.String publicName) {
        if (isPublicName(publicName)) return;
        this.publicName = publicName;
            updateLastModified();
            fireModified("publicName", ilarkesto.core.persistance.Persistence.propertyAsString(this.publicName));
    }

    protected java.lang.String preparePublicName(java.lang.String publicName) {
         publicName = Str.removeControlChars(publicName);
        return publicName;
    }

    public final boolean isPublicNameSet() {
        return this.publicName != null;
    }

    public final boolean isPublicName(java.lang.String publicName) {
        if (this.publicName == null && publicName == null) return true;
        return this.publicName != null && this.publicName.equals(publicName);
    }

    protected final void updatePublicName(Object value) {
        setPublicName((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - fullName
    // -----------------------------------------------------------

    private java.lang.String fullName;

    public final java.lang.String getFullName() {
        return fullName;
    }

    public final void setFullName(java.lang.String fullName) {
        fullName = prepareFullName(fullName);
        if (isFullName(fullName)) return;
        this.fullName = fullName;
            updateLastModified();
            fireModified("fullName", ilarkesto.core.persistance.Persistence.propertyAsString(this.fullName));
    }

    private final void updateFullName(java.lang.String fullName) {
        if (isFullName(fullName)) return;
        this.fullName = fullName;
            updateLastModified();
            fireModified("fullName", ilarkesto.core.persistance.Persistence.propertyAsString(this.fullName));
    }

    protected java.lang.String prepareFullName(java.lang.String fullName) {
         fullName = Str.removeControlChars(fullName);
        return fullName;
    }

    public final boolean isFullNameSet() {
        return this.fullName != null;
    }

    public final boolean isFullName(java.lang.String fullName) {
        if (this.fullName == null && fullName == null) return true;
        return this.fullName != null && this.fullName.equals(fullName);
    }

    protected final void updateFullName(Object value) {
        setFullName((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - admin
    // -----------------------------------------------------------

    private boolean admin;

    public final boolean isAdmin() {
        return admin;
    }

    public final void setAdmin(boolean admin) {
        admin = prepareAdmin(admin);
        if (isAdmin(admin)) return;
        this.admin = admin;
            updateLastModified();
            fireModified("admin", ilarkesto.core.persistance.Persistence.propertyAsString(this.admin));
    }

    private final void updateAdmin(boolean admin) {
        if (isAdmin(admin)) return;
        this.admin = admin;
            updateLastModified();
            fireModified("admin", ilarkesto.core.persistance.Persistence.propertyAsString(this.admin));
    }

    protected boolean prepareAdmin(boolean admin) {
        return admin;
    }

    public final boolean isAdmin(boolean admin) {
        return this.admin == admin;
    }

    protected final void updateAdmin(Object value) {
        setAdmin((Boolean)value);
    }
    // -----------------------------------------------------------
    // - emailVerified
    // -----------------------------------------------------------

    private boolean emailVerified;

    public final boolean isEmailVerified() {
        return emailVerified;
    }

    public final void setEmailVerified(boolean emailVerified) {
        emailVerified = prepareEmailVerified(emailVerified);
        if (isEmailVerified(emailVerified)) return;
        this.emailVerified = emailVerified;
            updateLastModified();
            fireModified("emailVerified", ilarkesto.core.persistance.Persistence.propertyAsString(this.emailVerified));
    }

    private final void updateEmailVerified(boolean emailVerified) {
        if (isEmailVerified(emailVerified)) return;
        this.emailVerified = emailVerified;
            updateLastModified();
            fireModified("emailVerified", ilarkesto.core.persistance.Persistence.propertyAsString(this.emailVerified));
    }

    protected boolean prepareEmailVerified(boolean emailVerified) {
        return emailVerified;
    }

    public final boolean isEmailVerified(boolean emailVerified) {
        return this.emailVerified == emailVerified;
    }

    protected final void updateEmailVerified(Object value) {
        setEmailVerified((Boolean)value);
    }
    // -----------------------------------------------------------
    // - email
    // -----------------------------------------------------------

    private java.lang.String email;

    public final java.lang.String getEmail() {
        return email;
    }

    public final void setEmail(java.lang.String email) {
        email = prepareEmail(email);
        if (isEmail(email)) return;
        if (email != null) {
            Object existing = getDao().getUserByEmail(email);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"email", email);
        }
        this.email = email;
            updateLastModified();
            fireModified("email", ilarkesto.core.persistance.Persistence.propertyAsString(this.email));
    }

    private final void updateEmail(java.lang.String email) {
        if (isEmail(email)) return;
        if (email != null) {
            Object existing = getDao().getUserByEmail(email);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"email", email);
        }
        this.email = email;
            updateLastModified();
            fireModified("email", ilarkesto.core.persistance.Persistence.propertyAsString(this.email));
    }

    protected java.lang.String prepareEmail(java.lang.String email) {
         email = Str.removeControlChars(email);
        return email;
    }

    public final boolean isEmailSet() {
        return this.email != null;
    }

    public final boolean isEmail(java.lang.String email) {
        if (this.email == null && email == null) return true;
        return this.email != null && this.email.equals(email);
    }

    protected final void updateEmail(Object value) {
        setEmail((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - currentProject
    // -----------------------------------------------------------

    private String currentProjectId;

    public final String getCurrentProjectId() {
        return this.currentProjectId;
    }

    public final scrum.server.project.Project getCurrentProject() {
        try {
            return this.currentProjectId == null ? null : (scrum.server.project.Project) AEntity.getById(this.currentProjectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("User.currentProject");
        }
    }

    public final void setCurrentProject(scrum.server.project.Project currentProject) {
        currentProject = prepareCurrentProject(currentProject);
        if (isCurrentProject(currentProject)) return;
        setCurrentProjectId(currentProject == null ? null : currentProject.getId());
    }

    public final void setCurrentProjectId(String id) {
        if (Utl.equals(currentProjectId, id)) return;
        this.currentProjectId = id;
            updateLastModified();
            fireModified("currentProjectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.currentProjectId));
    }

    private final void updateCurrentProjectId(String id) {
        setCurrentProjectId(id);
    }

    protected scrum.server.project.Project prepareCurrentProject(scrum.server.project.Project currentProject) {
        return currentProject;
    }

    protected void repairDeadCurrentProjectReference(String entityId) {
        if (!isPersisted()) return;
        if (this.currentProjectId == null || entityId.equals(this.currentProjectId)) {
            setCurrentProject(null);
        }
    }

    public final boolean isCurrentProjectSet() {
        return this.currentProjectId != null;
    }

    public final boolean isCurrentProject(scrum.server.project.Project currentProject) {
        if (this.currentProjectId == null && currentProject == null) return true;
        return currentProject != null && currentProject.getId().equals(this.currentProjectId);
    }

    protected final void updateCurrentProject(Object value) {
        setCurrentProject(value == null ? null : (scrum.server.project.Project)projectDao.getById((String)value));
    }
    // -----------------------------------------------------------
    // - color
    // -----------------------------------------------------------

    private java.lang.String color;

    public final java.lang.String getColor() {
        return color;
    }

    public final void setColor(java.lang.String color) {
        color = prepareColor(color);
        if (isColor(color)) return;
        this.color = color;
            updateLastModified();
            fireModified("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
    }

    private final void updateColor(java.lang.String color) {
        if (isColor(color)) return;
        this.color = color;
            updateLastModified();
            fireModified("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
    }

    protected java.lang.String prepareColor(java.lang.String color) {
         color = Str.removeControlChars(color);
        return color;
    }

    public final boolean isColorSet() {
        return this.color != null;
    }

    public final boolean isColor(java.lang.String color) {
        if (this.color == null && color == null) return true;
        return this.color != null && this.color.equals(color);
    }

    protected final void updateColor(Object value) {
        setColor((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - lastLoginDateAndTime
    // -----------------------------------------------------------

    private ilarkesto.core.time.DateAndTime lastLoginDateAndTime;

    public final ilarkesto.core.time.DateAndTime getLastLoginDateAndTime() {
        return lastLoginDateAndTime;
    }

    public final void setLastLoginDateAndTime(ilarkesto.core.time.DateAndTime lastLoginDateAndTime) {
        lastLoginDateAndTime = prepareLastLoginDateAndTime(lastLoginDateAndTime);
        if (isLastLoginDateAndTime(lastLoginDateAndTime)) return;
        this.lastLoginDateAndTime = lastLoginDateAndTime;
            updateLastModified();
            fireModified("lastLoginDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastLoginDateAndTime));
    }

    private final void updateLastLoginDateAndTime(ilarkesto.core.time.DateAndTime lastLoginDateAndTime) {
        if (isLastLoginDateAndTime(lastLoginDateAndTime)) return;
        this.lastLoginDateAndTime = lastLoginDateAndTime;
            updateLastModified();
            fireModified("lastLoginDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastLoginDateAndTime));
    }

    protected ilarkesto.core.time.DateAndTime prepareLastLoginDateAndTime(ilarkesto.core.time.DateAndTime lastLoginDateAndTime) {
        return lastLoginDateAndTime;
    }

    public final boolean isLastLoginDateAndTimeSet() {
        return this.lastLoginDateAndTime != null;
    }

    public final boolean isLastLoginDateAndTime(ilarkesto.core.time.DateAndTime lastLoginDateAndTime) {
        if (this.lastLoginDateAndTime == null && lastLoginDateAndTime == null) return true;
        return this.lastLoginDateAndTime != null && this.lastLoginDateAndTime.equals(lastLoginDateAndTime);
    }

    protected final void updateLastLoginDateAndTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.DateAndTime((String)value);
        setLastLoginDateAndTime((ilarkesto.core.time.DateAndTime)value);
    }
    // -----------------------------------------------------------
    // - registrationDateAndTime
    // -----------------------------------------------------------

    private ilarkesto.core.time.DateAndTime registrationDateAndTime;

    public final ilarkesto.core.time.DateAndTime getRegistrationDateAndTime() {
        return registrationDateAndTime;
    }

    public final void setRegistrationDateAndTime(ilarkesto.core.time.DateAndTime registrationDateAndTime) {
        registrationDateAndTime = prepareRegistrationDateAndTime(registrationDateAndTime);
        if (isRegistrationDateAndTime(registrationDateAndTime)) return;
        this.registrationDateAndTime = registrationDateAndTime;
            updateLastModified();
            fireModified("registrationDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.registrationDateAndTime));
    }

    private final void updateRegistrationDateAndTime(ilarkesto.core.time.DateAndTime registrationDateAndTime) {
        if (isRegistrationDateAndTime(registrationDateAndTime)) return;
        this.registrationDateAndTime = registrationDateAndTime;
            updateLastModified();
            fireModified("registrationDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.registrationDateAndTime));
    }

    protected ilarkesto.core.time.DateAndTime prepareRegistrationDateAndTime(ilarkesto.core.time.DateAndTime registrationDateAndTime) {
        return registrationDateAndTime;
    }

    public final boolean isRegistrationDateAndTimeSet() {
        return this.registrationDateAndTime != null;
    }

    public final boolean isRegistrationDateAndTime(ilarkesto.core.time.DateAndTime registrationDateAndTime) {
        if (this.registrationDateAndTime == null && registrationDateAndTime == null) return true;
        return this.registrationDateAndTime != null && this.registrationDateAndTime.equals(registrationDateAndTime);
    }

    protected final void updateRegistrationDateAndTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.DateAndTime((String)value);
        setRegistrationDateAndTime((ilarkesto.core.time.DateAndTime)value);
    }
    // -----------------------------------------------------------
    // - disabled
    // -----------------------------------------------------------

    private boolean disabled;

    public final boolean isDisabled() {
        return disabled;
    }

    public final void setDisabled(boolean disabled) {
        disabled = prepareDisabled(disabled);
        if (isDisabled(disabled)) return;
        this.disabled = disabled;
            updateLastModified();
            fireModified("disabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.disabled));
    }

    private final void updateDisabled(boolean disabled) {
        if (isDisabled(disabled)) return;
        this.disabled = disabled;
            updateLastModified();
            fireModified("disabled", ilarkesto.core.persistance.Persistence.propertyAsString(this.disabled));
    }

    protected boolean prepareDisabled(boolean disabled) {
        return disabled;
    }

    public final boolean isDisabled(boolean disabled) {
        return this.disabled == disabled;
    }

    protected final void updateDisabled(Object value) {
        setDisabled((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideBlog
    // -----------------------------------------------------------

    private boolean hideUserGuideBlog;

    public final boolean isHideUserGuideBlog() {
        return hideUserGuideBlog;
    }

    public final void setHideUserGuideBlog(boolean hideUserGuideBlog) {
        hideUserGuideBlog = prepareHideUserGuideBlog(hideUserGuideBlog);
        if (isHideUserGuideBlog(hideUserGuideBlog)) return;
        this.hideUserGuideBlog = hideUserGuideBlog;
            updateLastModified();
            fireModified("hideUserGuideBlog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideBlog));
    }

    private final void updateHideUserGuideBlog(boolean hideUserGuideBlog) {
        if (isHideUserGuideBlog(hideUserGuideBlog)) return;
        this.hideUserGuideBlog = hideUserGuideBlog;
            updateLastModified();
            fireModified("hideUserGuideBlog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideBlog));
    }

    protected boolean prepareHideUserGuideBlog(boolean hideUserGuideBlog) {
        return hideUserGuideBlog;
    }

    public final boolean isHideUserGuideBlog(boolean hideUserGuideBlog) {
        return this.hideUserGuideBlog == hideUserGuideBlog;
    }

    protected final void updateHideUserGuideBlog(Object value) {
        setHideUserGuideBlog((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideCalendar
    // -----------------------------------------------------------

    private boolean hideUserGuideCalendar;

    public final boolean isHideUserGuideCalendar() {
        return hideUserGuideCalendar;
    }

    public final void setHideUserGuideCalendar(boolean hideUserGuideCalendar) {
        hideUserGuideCalendar = prepareHideUserGuideCalendar(hideUserGuideCalendar);
        if (isHideUserGuideCalendar(hideUserGuideCalendar)) return;
        this.hideUserGuideCalendar = hideUserGuideCalendar;
            updateLastModified();
            fireModified("hideUserGuideCalendar", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCalendar));
    }

    private final void updateHideUserGuideCalendar(boolean hideUserGuideCalendar) {
        if (isHideUserGuideCalendar(hideUserGuideCalendar)) return;
        this.hideUserGuideCalendar = hideUserGuideCalendar;
            updateLastModified();
            fireModified("hideUserGuideCalendar", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCalendar));
    }

    protected boolean prepareHideUserGuideCalendar(boolean hideUserGuideCalendar) {
        return hideUserGuideCalendar;
    }

    public final boolean isHideUserGuideCalendar(boolean hideUserGuideCalendar) {
        return this.hideUserGuideCalendar == hideUserGuideCalendar;
    }

    protected final void updateHideUserGuideCalendar(Object value) {
        setHideUserGuideCalendar((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideFiles
    // -----------------------------------------------------------

    private boolean hideUserGuideFiles;

    public final boolean isHideUserGuideFiles() {
        return hideUserGuideFiles;
    }

    public final void setHideUserGuideFiles(boolean hideUserGuideFiles) {
        hideUserGuideFiles = prepareHideUserGuideFiles(hideUserGuideFiles);
        if (isHideUserGuideFiles(hideUserGuideFiles)) return;
        this.hideUserGuideFiles = hideUserGuideFiles;
            updateLastModified();
            fireModified("hideUserGuideFiles", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideFiles));
    }

    private final void updateHideUserGuideFiles(boolean hideUserGuideFiles) {
        if (isHideUserGuideFiles(hideUserGuideFiles)) return;
        this.hideUserGuideFiles = hideUserGuideFiles;
            updateLastModified();
            fireModified("hideUserGuideFiles", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideFiles));
    }

    protected boolean prepareHideUserGuideFiles(boolean hideUserGuideFiles) {
        return hideUserGuideFiles;
    }

    public final boolean isHideUserGuideFiles(boolean hideUserGuideFiles) {
        return this.hideUserGuideFiles == hideUserGuideFiles;
    }

    protected final void updateHideUserGuideFiles(Object value) {
        setHideUserGuideFiles((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideForum
    // -----------------------------------------------------------

    private boolean hideUserGuideForum;

    public final boolean isHideUserGuideForum() {
        return hideUserGuideForum;
    }

    public final void setHideUserGuideForum(boolean hideUserGuideForum) {
        hideUserGuideForum = prepareHideUserGuideForum(hideUserGuideForum);
        if (isHideUserGuideForum(hideUserGuideForum)) return;
        this.hideUserGuideForum = hideUserGuideForum;
            updateLastModified();
            fireModified("hideUserGuideForum", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideForum));
    }

    private final void updateHideUserGuideForum(boolean hideUserGuideForum) {
        if (isHideUserGuideForum(hideUserGuideForum)) return;
        this.hideUserGuideForum = hideUserGuideForum;
            updateLastModified();
            fireModified("hideUserGuideForum", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideForum));
    }

    protected boolean prepareHideUserGuideForum(boolean hideUserGuideForum) {
        return hideUserGuideForum;
    }

    public final boolean isHideUserGuideForum(boolean hideUserGuideForum) {
        return this.hideUserGuideForum == hideUserGuideForum;
    }

    protected final void updateHideUserGuideForum(Object value) {
        setHideUserGuideForum((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideImpediments
    // -----------------------------------------------------------

    private boolean hideUserGuideImpediments;

    public final boolean isHideUserGuideImpediments() {
        return hideUserGuideImpediments;
    }

    public final void setHideUserGuideImpediments(boolean hideUserGuideImpediments) {
        hideUserGuideImpediments = prepareHideUserGuideImpediments(hideUserGuideImpediments);
        if (isHideUserGuideImpediments(hideUserGuideImpediments)) return;
        this.hideUserGuideImpediments = hideUserGuideImpediments;
            updateLastModified();
            fireModified("hideUserGuideImpediments", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideImpediments));
    }

    private final void updateHideUserGuideImpediments(boolean hideUserGuideImpediments) {
        if (isHideUserGuideImpediments(hideUserGuideImpediments)) return;
        this.hideUserGuideImpediments = hideUserGuideImpediments;
            updateLastModified();
            fireModified("hideUserGuideImpediments", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideImpediments));
    }

    protected boolean prepareHideUserGuideImpediments(boolean hideUserGuideImpediments) {
        return hideUserGuideImpediments;
    }

    public final boolean isHideUserGuideImpediments(boolean hideUserGuideImpediments) {
        return this.hideUserGuideImpediments == hideUserGuideImpediments;
    }

    protected final void updateHideUserGuideImpediments(Object value) {
        setHideUserGuideImpediments((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideIssues
    // -----------------------------------------------------------

    private boolean hideUserGuideIssues;

    public final boolean isHideUserGuideIssues() {
        return hideUserGuideIssues;
    }

    public final void setHideUserGuideIssues(boolean hideUserGuideIssues) {
        hideUserGuideIssues = prepareHideUserGuideIssues(hideUserGuideIssues);
        if (isHideUserGuideIssues(hideUserGuideIssues)) return;
        this.hideUserGuideIssues = hideUserGuideIssues;
            updateLastModified();
            fireModified("hideUserGuideIssues", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideIssues));
    }

    private final void updateHideUserGuideIssues(boolean hideUserGuideIssues) {
        if (isHideUserGuideIssues(hideUserGuideIssues)) return;
        this.hideUserGuideIssues = hideUserGuideIssues;
            updateLastModified();
            fireModified("hideUserGuideIssues", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideIssues));
    }

    protected boolean prepareHideUserGuideIssues(boolean hideUserGuideIssues) {
        return hideUserGuideIssues;
    }

    public final boolean isHideUserGuideIssues(boolean hideUserGuideIssues) {
        return this.hideUserGuideIssues == hideUserGuideIssues;
    }

    protected final void updateHideUserGuideIssues(Object value) {
        setHideUserGuideIssues((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideJournal
    // -----------------------------------------------------------

    private boolean hideUserGuideJournal;

    public final boolean isHideUserGuideJournal() {
        return hideUserGuideJournal;
    }

    public final void setHideUserGuideJournal(boolean hideUserGuideJournal) {
        hideUserGuideJournal = prepareHideUserGuideJournal(hideUserGuideJournal);
        if (isHideUserGuideJournal(hideUserGuideJournal)) return;
        this.hideUserGuideJournal = hideUserGuideJournal;
            updateLastModified();
            fireModified("hideUserGuideJournal", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideJournal));
    }

    private final void updateHideUserGuideJournal(boolean hideUserGuideJournal) {
        if (isHideUserGuideJournal(hideUserGuideJournal)) return;
        this.hideUserGuideJournal = hideUserGuideJournal;
            updateLastModified();
            fireModified("hideUserGuideJournal", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideJournal));
    }

    protected boolean prepareHideUserGuideJournal(boolean hideUserGuideJournal) {
        return hideUserGuideJournal;
    }

    public final boolean isHideUserGuideJournal(boolean hideUserGuideJournal) {
        return this.hideUserGuideJournal == hideUserGuideJournal;
    }

    protected final void updateHideUserGuideJournal(Object value) {
        setHideUserGuideJournal((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideNextSprint
    // -----------------------------------------------------------

    private boolean hideUserGuideNextSprint;

    public final boolean isHideUserGuideNextSprint() {
        return hideUserGuideNextSprint;
    }

    public final void setHideUserGuideNextSprint(boolean hideUserGuideNextSprint) {
        hideUserGuideNextSprint = prepareHideUserGuideNextSprint(hideUserGuideNextSprint);
        if (isHideUserGuideNextSprint(hideUserGuideNextSprint)) return;
        this.hideUserGuideNextSprint = hideUserGuideNextSprint;
            updateLastModified();
            fireModified("hideUserGuideNextSprint", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideNextSprint));
    }

    private final void updateHideUserGuideNextSprint(boolean hideUserGuideNextSprint) {
        if (isHideUserGuideNextSprint(hideUserGuideNextSprint)) return;
        this.hideUserGuideNextSprint = hideUserGuideNextSprint;
            updateLastModified();
            fireModified("hideUserGuideNextSprint", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideNextSprint));
    }

    protected boolean prepareHideUserGuideNextSprint(boolean hideUserGuideNextSprint) {
        return hideUserGuideNextSprint;
    }

    public final boolean isHideUserGuideNextSprint(boolean hideUserGuideNextSprint) {
        return this.hideUserGuideNextSprint == hideUserGuideNextSprint;
    }

    protected final void updateHideUserGuideNextSprint(Object value) {
        setHideUserGuideNextSprint((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideProductBacklog
    // -----------------------------------------------------------

    private boolean hideUserGuideProductBacklog;

    public final boolean isHideUserGuideProductBacklog() {
        return hideUserGuideProductBacklog;
    }

    public final void setHideUserGuideProductBacklog(boolean hideUserGuideProductBacklog) {
        hideUserGuideProductBacklog = prepareHideUserGuideProductBacklog(hideUserGuideProductBacklog);
        if (isHideUserGuideProductBacklog(hideUserGuideProductBacklog)) return;
        this.hideUserGuideProductBacklog = hideUserGuideProductBacklog;
            updateLastModified();
            fireModified("hideUserGuideProductBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideProductBacklog));
    }

    private final void updateHideUserGuideProductBacklog(boolean hideUserGuideProductBacklog) {
        if (isHideUserGuideProductBacklog(hideUserGuideProductBacklog)) return;
        this.hideUserGuideProductBacklog = hideUserGuideProductBacklog;
            updateLastModified();
            fireModified("hideUserGuideProductBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideProductBacklog));
    }

    protected boolean prepareHideUserGuideProductBacklog(boolean hideUserGuideProductBacklog) {
        return hideUserGuideProductBacklog;
    }

    public final boolean isHideUserGuideProductBacklog(boolean hideUserGuideProductBacklog) {
        return this.hideUserGuideProductBacklog == hideUserGuideProductBacklog;
    }

    protected final void updateHideUserGuideProductBacklog(Object value) {
        setHideUserGuideProductBacklog((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideCourtroom
    // -----------------------------------------------------------

    private boolean hideUserGuideCourtroom;

    public final boolean isHideUserGuideCourtroom() {
        return hideUserGuideCourtroom;
    }

    public final void setHideUserGuideCourtroom(boolean hideUserGuideCourtroom) {
        hideUserGuideCourtroom = prepareHideUserGuideCourtroom(hideUserGuideCourtroom);
        if (isHideUserGuideCourtroom(hideUserGuideCourtroom)) return;
        this.hideUserGuideCourtroom = hideUserGuideCourtroom;
            updateLastModified();
            fireModified("hideUserGuideCourtroom", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCourtroom));
    }

    private final void updateHideUserGuideCourtroom(boolean hideUserGuideCourtroom) {
        if (isHideUserGuideCourtroom(hideUserGuideCourtroom)) return;
        this.hideUserGuideCourtroom = hideUserGuideCourtroom;
            updateLastModified();
            fireModified("hideUserGuideCourtroom", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideCourtroom));
    }

    protected boolean prepareHideUserGuideCourtroom(boolean hideUserGuideCourtroom) {
        return hideUserGuideCourtroom;
    }

    public final boolean isHideUserGuideCourtroom(boolean hideUserGuideCourtroom) {
        return this.hideUserGuideCourtroom == hideUserGuideCourtroom;
    }

    protected final void updateHideUserGuideCourtroom(Object value) {
        setHideUserGuideCourtroom((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideQualityBacklog
    // -----------------------------------------------------------

    private boolean hideUserGuideQualityBacklog;

    public final boolean isHideUserGuideQualityBacklog() {
        return hideUserGuideQualityBacklog;
    }

    public final void setHideUserGuideQualityBacklog(boolean hideUserGuideQualityBacklog) {
        hideUserGuideQualityBacklog = prepareHideUserGuideQualityBacklog(hideUserGuideQualityBacklog);
        if (isHideUserGuideQualityBacklog(hideUserGuideQualityBacklog)) return;
        this.hideUserGuideQualityBacklog = hideUserGuideQualityBacklog;
            updateLastModified();
            fireModified("hideUserGuideQualityBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideQualityBacklog));
    }

    private final void updateHideUserGuideQualityBacklog(boolean hideUserGuideQualityBacklog) {
        if (isHideUserGuideQualityBacklog(hideUserGuideQualityBacklog)) return;
        this.hideUserGuideQualityBacklog = hideUserGuideQualityBacklog;
            updateLastModified();
            fireModified("hideUserGuideQualityBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideQualityBacklog));
    }

    protected boolean prepareHideUserGuideQualityBacklog(boolean hideUserGuideQualityBacklog) {
        return hideUserGuideQualityBacklog;
    }

    public final boolean isHideUserGuideQualityBacklog(boolean hideUserGuideQualityBacklog) {
        return this.hideUserGuideQualityBacklog == hideUserGuideQualityBacklog;
    }

    protected final void updateHideUserGuideQualityBacklog(Object value) {
        setHideUserGuideQualityBacklog((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideReleases
    // -----------------------------------------------------------

    private boolean hideUserGuideReleases;

    public final boolean isHideUserGuideReleases() {
        return hideUserGuideReleases;
    }

    public final void setHideUserGuideReleases(boolean hideUserGuideReleases) {
        hideUserGuideReleases = prepareHideUserGuideReleases(hideUserGuideReleases);
        if (isHideUserGuideReleases(hideUserGuideReleases)) return;
        this.hideUserGuideReleases = hideUserGuideReleases;
            updateLastModified();
            fireModified("hideUserGuideReleases", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideReleases));
    }

    private final void updateHideUserGuideReleases(boolean hideUserGuideReleases) {
        if (isHideUserGuideReleases(hideUserGuideReleases)) return;
        this.hideUserGuideReleases = hideUserGuideReleases;
            updateLastModified();
            fireModified("hideUserGuideReleases", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideReleases));
    }

    protected boolean prepareHideUserGuideReleases(boolean hideUserGuideReleases) {
        return hideUserGuideReleases;
    }

    public final boolean isHideUserGuideReleases(boolean hideUserGuideReleases) {
        return this.hideUserGuideReleases == hideUserGuideReleases;
    }

    protected final void updateHideUserGuideReleases(Object value) {
        setHideUserGuideReleases((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideRisks
    // -----------------------------------------------------------

    private boolean hideUserGuideRisks;

    public final boolean isHideUserGuideRisks() {
        return hideUserGuideRisks;
    }

    public final void setHideUserGuideRisks(boolean hideUserGuideRisks) {
        hideUserGuideRisks = prepareHideUserGuideRisks(hideUserGuideRisks);
        if (isHideUserGuideRisks(hideUserGuideRisks)) return;
        this.hideUserGuideRisks = hideUserGuideRisks;
            updateLastModified();
            fireModified("hideUserGuideRisks", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideRisks));
    }

    private final void updateHideUserGuideRisks(boolean hideUserGuideRisks) {
        if (isHideUserGuideRisks(hideUserGuideRisks)) return;
        this.hideUserGuideRisks = hideUserGuideRisks;
            updateLastModified();
            fireModified("hideUserGuideRisks", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideRisks));
    }

    protected boolean prepareHideUserGuideRisks(boolean hideUserGuideRisks) {
        return hideUserGuideRisks;
    }

    public final boolean isHideUserGuideRisks(boolean hideUserGuideRisks) {
        return this.hideUserGuideRisks == hideUserGuideRisks;
    }

    protected final void updateHideUserGuideRisks(Object value) {
        setHideUserGuideRisks((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideSprintBacklog
    // -----------------------------------------------------------

    private boolean hideUserGuideSprintBacklog;

    public final boolean isHideUserGuideSprintBacklog() {
        return hideUserGuideSprintBacklog;
    }

    public final void setHideUserGuideSprintBacklog(boolean hideUserGuideSprintBacklog) {
        hideUserGuideSprintBacklog = prepareHideUserGuideSprintBacklog(hideUserGuideSprintBacklog);
        if (isHideUserGuideSprintBacklog(hideUserGuideSprintBacklog)) return;
        this.hideUserGuideSprintBacklog = hideUserGuideSprintBacklog;
            updateLastModified();
            fireModified("hideUserGuideSprintBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideSprintBacklog));
    }

    private final void updateHideUserGuideSprintBacklog(boolean hideUserGuideSprintBacklog) {
        if (isHideUserGuideSprintBacklog(hideUserGuideSprintBacklog)) return;
        this.hideUserGuideSprintBacklog = hideUserGuideSprintBacklog;
            updateLastModified();
            fireModified("hideUserGuideSprintBacklog", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideSprintBacklog));
    }

    protected boolean prepareHideUserGuideSprintBacklog(boolean hideUserGuideSprintBacklog) {
        return hideUserGuideSprintBacklog;
    }

    public final boolean isHideUserGuideSprintBacklog(boolean hideUserGuideSprintBacklog) {
        return this.hideUserGuideSprintBacklog == hideUserGuideSprintBacklog;
    }

    protected final void updateHideUserGuideSprintBacklog(Object value) {
        setHideUserGuideSprintBacklog((Boolean)value);
    }
    // -----------------------------------------------------------
    // - hideUserGuideWhiteboard
    // -----------------------------------------------------------

    private boolean hideUserGuideWhiteboard;

    public final boolean isHideUserGuideWhiteboard() {
        return hideUserGuideWhiteboard;
    }

    public final void setHideUserGuideWhiteboard(boolean hideUserGuideWhiteboard) {
        hideUserGuideWhiteboard = prepareHideUserGuideWhiteboard(hideUserGuideWhiteboard);
        if (isHideUserGuideWhiteboard(hideUserGuideWhiteboard)) return;
        this.hideUserGuideWhiteboard = hideUserGuideWhiteboard;
            updateLastModified();
            fireModified("hideUserGuideWhiteboard", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideWhiteboard));
    }

    private final void updateHideUserGuideWhiteboard(boolean hideUserGuideWhiteboard) {
        if (isHideUserGuideWhiteboard(hideUserGuideWhiteboard)) return;
        this.hideUserGuideWhiteboard = hideUserGuideWhiteboard;
            updateLastModified();
            fireModified("hideUserGuideWhiteboard", ilarkesto.core.persistance.Persistence.propertyAsString(this.hideUserGuideWhiteboard));
    }

    protected boolean prepareHideUserGuideWhiteboard(boolean hideUserGuideWhiteboard) {
        return hideUserGuideWhiteboard;
    }

    public final boolean isHideUserGuideWhiteboard(boolean hideUserGuideWhiteboard) {
        return this.hideUserGuideWhiteboard == hideUserGuideWhiteboard;
    }

    protected final void updateHideUserGuideWhiteboard(Object value) {
        setHideUserGuideWhiteboard((Boolean)value);
    }
    // -----------------------------------------------------------
    // - loginToken
    // -----------------------------------------------------------

    private java.lang.String loginToken;

    public final java.lang.String getLoginToken() {
        return loginToken;
    }

    public final void setLoginToken(java.lang.String loginToken) {
        loginToken = prepareLoginToken(loginToken);
        if (isLoginToken(loginToken)) return;
        if (loginToken != null) {
            Object existing = getDao().getUserByLoginToken(loginToken);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"loginToken", loginToken);
        }
        this.loginToken = loginToken;
            updateLastModified();
            fireModified("loginToken", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginToken));
    }

    private final void updateLoginToken(java.lang.String loginToken) {
        if (isLoginToken(loginToken)) return;
        if (loginToken != null) {
            Object existing = getDao().getUserByLoginToken(loginToken);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"loginToken", loginToken);
        }
        this.loginToken = loginToken;
            updateLastModified();
            fireModified("loginToken", ilarkesto.core.persistance.Persistence.propertyAsString(this.loginToken));
    }

    protected java.lang.String prepareLoginToken(java.lang.String loginToken) {
         loginToken = Str.removeControlChars(loginToken);
        return loginToken;
    }

    public final boolean isLoginTokenSet() {
        return this.loginToken != null;
    }

    public final boolean isLoginToken(java.lang.String loginToken) {
        if (this.loginToken == null && loginToken == null) return true;
        return this.loginToken != null && this.loginToken.equals(loginToken);
    }

    protected final void updateLoginToken(Object value) {
        setLoginToken((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - openId
    // -----------------------------------------------------------

    private java.lang.String openId;

    public final java.lang.String getOpenId() {
        return openId;
    }

    public final void setOpenId(java.lang.String openId) {
        openId = prepareOpenId(openId);
        if (isOpenId(openId)) return;
        if (openId != null) {
            Object existing = getDao().getUserByOpenId(openId);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"openId", openId);
        }
        this.openId = openId;
            updateLastModified();
            fireModified("openId", ilarkesto.core.persistance.Persistence.propertyAsString(this.openId));
    }

    private final void updateOpenId(java.lang.String openId) {
        if (isOpenId(openId)) return;
        if (openId != null) {
            Object existing = getDao().getUserByOpenId(openId);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("User" ,"openId", openId);
        }
        this.openId = openId;
            updateLastModified();
            fireModified("openId", ilarkesto.core.persistance.Persistence.propertyAsString(this.openId));
    }

    protected java.lang.String prepareOpenId(java.lang.String openId) {
         openId = Str.removeControlChars(openId);
        return openId;
    }

    public final boolean isOpenIdSet() {
        return this.openId != null;
    }

    public final boolean isOpenId(java.lang.String openId) {
        if (this.openId == null && openId == null) return true;
        return this.openId != null && this.openId.equals(openId);
    }

    protected final void updateOpenId(Object value) {
        setOpenId((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("name")) updateName(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("password")) updatePassword(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("passwordSalt")) updatePasswordSalt(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("publicName")) updatePublicName(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("fullName")) updateFullName(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("admin")) updateAdmin(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("emailVerified")) updateEmailVerified(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("email")) updateEmail(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("currentProjectId")) updateCurrentProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("color")) updateColor(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("lastLoginDateAndTime")) updateLastLoginDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
            if (property.equals("registrationDateAndTime")) updateRegistrationDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
            if (property.equals("disabled")) updateDisabled(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideBlog")) updateHideUserGuideBlog(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideCalendar")) updateHideUserGuideCalendar(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideFiles")) updateHideUserGuideFiles(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideForum")) updateHideUserGuideForum(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideImpediments")) updateHideUserGuideImpediments(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideIssues")) updateHideUserGuideIssues(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideJournal")) updateHideUserGuideJournal(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideNextSprint")) updateHideUserGuideNextSprint(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideProductBacklog")) updateHideUserGuideProductBacklog(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideCourtroom")) updateHideUserGuideCourtroom(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideQualityBacklog")) updateHideUserGuideQualityBacklog(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideReleases")) updateHideUserGuideReleases(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideRisks")) updateHideUserGuideRisks(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideSprintBacklog")) updateHideUserGuideSprintBacklog(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("hideUserGuideWhiteboard")) updateHideUserGuideWhiteboard(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("loginToken")) updateLoginToken(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("openId")) updateOpenId(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadCurrentProjectReference(entityId);
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        try {
            getCurrentProject();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead currentProject reference");
            repairDeadCurrentProjectReference(this.currentProjectId);
        }
        Collection<scrum.server.project.Project> project = getProjects();
        Collection<scrum.server.project.Project> projectWithAdmins = getProjectWithAdminss();
        Collection<scrum.server.project.Project> projectWithProductOwners = getProjectWithProductOwnerss();
        Collection<scrum.server.project.Project> projectWithScrumMasters = getProjectWithScrumMasterss();
        Collection<scrum.server.project.Project> projectWithTeamMembers = getProjectWithTeamMemberss();
        Collection<scrum.server.sprint.Sprint> sprint = getSprints();
        Collection<scrum.server.sprint.Sprint> sprintWithScrumMasters = getSprintWithScrumMasterss();
        Collection<scrum.server.sprint.Sprint> sprintWithTeamMembers = getSprintWithTeamMemberss();
        Collection<scrum.server.collaboration.Emoticon> emoticon = getEmoticons();
        Collection<scrum.server.admin.ProjectUserConfig> projectUserConfig = getProjectUserConfigs();
        Collection<scrum.server.issues.Issue> issue = getIssues();
        Collection<scrum.server.issues.Issue> issueWithOwner = getIssueWithOwners();
        Collection<scrum.server.sprint.Task> task = getTasks();
        Collection<scrum.server.journal.Change> change = getChanges();
        Collection<scrum.server.collaboration.Comment> comment = getComments();
        Collection<scrum.server.collaboration.ChatMessage> chatMessage = getChatMessages();
        Collection<scrum.server.pr.BlogEntry> blogEntry = getBlogEntrys();
        Collection<scrum.server.estimation.RequirementEstimationVote> requirementEstimationVote = getRequirementEstimationVotes();
        Collection<scrum.server.collaboration.Emoticon> emoticonWithOwner = getEmoticonWithOwners();
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.project.ProjectDao projectDao;

    public static final void setProjectDao(scrum.server.project.ProjectDao projectDao) {
        GUser.projectDao = projectDao;
    }

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GUser.userDao = userDao;
    }

    static scrum.server.sprint.SprintDao sprintDao;

    public static final void setSprintDao(scrum.server.sprint.SprintDao sprintDao) {
        GUser.sprintDao = sprintDao;
    }

    static scrum.server.collaboration.EmoticonDao emoticonDao;

    public static final void setEmoticonDao(scrum.server.collaboration.EmoticonDao emoticonDao) {
        GUser.emoticonDao = emoticonDao;
    }

    static scrum.server.admin.ProjectUserConfigDao projectUserConfigDao;

    public static final void setProjectUserConfigDao(scrum.server.admin.ProjectUserConfigDao projectUserConfigDao) {
        GUser.projectUserConfigDao = projectUserConfigDao;
    }

    static scrum.server.issues.IssueDao issueDao;

    public static final void setIssueDao(scrum.server.issues.IssueDao issueDao) {
        GUser.issueDao = issueDao;
    }

    static scrum.server.sprint.TaskDao taskDao;

    public static final void setTaskDao(scrum.server.sprint.TaskDao taskDao) {
        GUser.taskDao = taskDao;
    }

    static scrum.server.journal.ChangeDao changeDao;

    public static final void setChangeDao(scrum.server.journal.ChangeDao changeDao) {
        GUser.changeDao = changeDao;
    }

    static scrum.server.collaboration.CommentDao commentDao;

    public static final void setCommentDao(scrum.server.collaboration.CommentDao commentDao) {
        GUser.commentDao = commentDao;
    }

    static scrum.server.collaboration.ChatMessageDao chatMessageDao;

    public static final void setChatMessageDao(scrum.server.collaboration.ChatMessageDao chatMessageDao) {
        GUser.chatMessageDao = chatMessageDao;
    }

    static scrum.server.pr.BlogEntryDao blogEntryDao;

    public static final void setBlogEntryDao(scrum.server.pr.BlogEntryDao blogEntryDao) {
        GUser.blogEntryDao = blogEntryDao;
    }

    static scrum.server.estimation.RequirementEstimationVoteDao requirementEstimationVoteDao;

    public static final void setRequirementEstimationVoteDao(scrum.server.estimation.RequirementEstimationVoteDao requirementEstimationVoteDao) {
        GUser.requirementEstimationVoteDao = requirementEstimationVoteDao;
    }

}