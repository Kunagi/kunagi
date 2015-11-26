// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.project;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GProject
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, ilarkesto.auth.DeleteProtected<scrum.server.admin.User>, java.lang.Comparable<Project> {

    public static class ProjectMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata vision = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "vision";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getVision();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata productLabel = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "productLabel";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getProductLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata shortDescription = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "shortDescription";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getShortDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata description = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "description";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata longDescription = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "longDescription";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLongDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata begin = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "begin";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getBegin();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata end = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "end";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getEnd();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata participants = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "participants";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getParticipants();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata admins = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "admins";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getAdmins();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata productOwners = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "productOwners";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getProductOwners();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata scrumMasters = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "scrumMasters";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getScrumMasters();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata teamMembers = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "teamMembers";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getTeamMembers();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata currentSprint = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "currentSprint";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getCurrentSprint();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata nextSprint = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "nextSprint";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getNextSprint();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata velocity = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "velocity";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getVelocity();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata requirementsOrderIds = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "requirementsOrderIds";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getRequirementsOrderIds();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata urgentIssuesOrderIds = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "urgentIssuesOrderIds";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getUrgentIssuesOrderIds();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastSprintNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastSprintNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastSprintNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastTaskNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastTaskNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastTaskNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastRequirementNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastRequirementNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastRequirementNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastQualityNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastQualityNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastQualityNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastRiskNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastRiskNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastRiskNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastIssueNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastIssueNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastIssueNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastImpedimentNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastImpedimentNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastImpedimentNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastFileNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastFileNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastFileNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastSubjectNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastSubjectNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastSubjectNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastEventNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastEventNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastEventNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastReleaseNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastReleaseNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastReleaseNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastBlogEntryNumber = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastBlogEntryNumber";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastBlogEntryNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata punishmentUnit = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "punishmentUnit";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getPunishmentUnit();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata punishmentFactor = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "punishmentFactor";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getPunishmentFactor();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata homepageDir = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "homepageDir";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getHomepageDir();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata homepageUrl = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "homepageUrl";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getHomepageUrl();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata autoUpdateHomepage = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "autoUpdateHomepage";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).isAutoUpdateHomepage();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata releaseScriptPath = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "releaseScriptPath";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getReleaseScriptPath();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata supportEmail = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "supportEmail";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getSupportEmail();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata issueReplyTemplate = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "issueReplyTemplate";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getIssueReplyTemplate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata subscriberNotificationTemplate = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "subscriberNotificationTemplate";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getSubscriberNotificationTemplate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastOpenedDateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastOpenedDateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getLastOpenedDateAndTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata freeDays = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "freeDays";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getFreeDays();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata autoCreateTasksFromQualities = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "autoCreateTasksFromQualities";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).isAutoCreateTasksFromQualities();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata releasingInfo = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "releasingInfo";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getReleasingInfo();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata externalTrackerUrlTemplate = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "externalTrackerUrlTemplate";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getExternalTrackerUrlTemplate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata externalTrackerLabel = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "externalTrackerLabel";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Project)entity).getExternalTrackerLabel();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            label
            ,vision
            ,productLabel
            ,shortDescription
            ,description
            ,longDescription
            ,begin
            ,end
            ,participants
            ,admins
            ,productOwners
            ,scrumMasters
            ,teamMembers
            ,currentSprint
            ,nextSprint
            ,velocity
            ,requirementsOrderIds
            ,urgentIssuesOrderIds
            ,lastSprintNumber
            ,lastTaskNumber
            ,lastRequirementNumber
            ,lastQualityNumber
            ,lastRiskNumber
            ,lastIssueNumber
            ,lastImpedimentNumber
            ,lastFileNumber
            ,lastSubjectNumber
            ,lastEventNumber
            ,lastReleaseNumber
            ,lastBlogEntryNumber
            ,punishmentUnit
            ,punishmentFactor
            ,homepageDir
            ,homepageUrl
            ,autoUpdateHomepage
            ,releaseScriptPath
            ,supportEmail
            ,issueReplyTemplate
            ,subscriberNotificationTemplate
            ,lastOpenedDateAndTime
            ,freeDays
            ,autoCreateTasksFromQualities
            ,releasingInfo
            ,externalTrackerUrlTemplate
            ,externalTrackerLabel
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("label".equals(fieldName)) return label;
            if ("vision".equals(fieldName)) return vision;
            if ("productLabel".equals(fieldName)) return productLabel;
            if ("shortDescription".equals(fieldName)) return shortDescription;
            if ("description".equals(fieldName)) return description;
            if ("longDescription".equals(fieldName)) return longDescription;
            if ("begin".equals(fieldName)) return begin;
            if ("end".equals(fieldName)) return end;
            if ("participants".equals(fieldName)) return participants;
            if ("participantsIds".equals(fieldName)) return participants;
            if ("admins".equals(fieldName)) return admins;
            if ("adminsIds".equals(fieldName)) return admins;
            if ("productOwners".equals(fieldName)) return productOwners;
            if ("productOwnersIds".equals(fieldName)) return productOwners;
            if ("scrumMasters".equals(fieldName)) return scrumMasters;
            if ("scrumMastersIds".equals(fieldName)) return scrumMasters;
            if ("teamMembers".equals(fieldName)) return teamMembers;
            if ("teamMembersIds".equals(fieldName)) return teamMembers;
            if ("currentSprint".equals(fieldName)) return currentSprint;
            if ("currentSprintId".equals(fieldName)) return currentSprint;
            if ("nextSprint".equals(fieldName)) return nextSprint;
            if ("nextSprintId".equals(fieldName)) return nextSprint;
            if ("velocity".equals(fieldName)) return velocity;
            if ("requirementsOrderIds".equals(fieldName)) return requirementsOrderIds;
            if ("urgentIssuesOrderIds".equals(fieldName)) return urgentIssuesOrderIds;
            if ("lastSprintNumber".equals(fieldName)) return lastSprintNumber;
            if ("lastTaskNumber".equals(fieldName)) return lastTaskNumber;
            if ("lastRequirementNumber".equals(fieldName)) return lastRequirementNumber;
            if ("lastQualityNumber".equals(fieldName)) return lastQualityNumber;
            if ("lastRiskNumber".equals(fieldName)) return lastRiskNumber;
            if ("lastIssueNumber".equals(fieldName)) return lastIssueNumber;
            if ("lastImpedimentNumber".equals(fieldName)) return lastImpedimentNumber;
            if ("lastFileNumber".equals(fieldName)) return lastFileNumber;
            if ("lastSubjectNumber".equals(fieldName)) return lastSubjectNumber;
            if ("lastEventNumber".equals(fieldName)) return lastEventNumber;
            if ("lastReleaseNumber".equals(fieldName)) return lastReleaseNumber;
            if ("lastBlogEntryNumber".equals(fieldName)) return lastBlogEntryNumber;
            if ("punishmentUnit".equals(fieldName)) return punishmentUnit;
            if ("punishmentFactor".equals(fieldName)) return punishmentFactor;
            if ("homepageDir".equals(fieldName)) return homepageDir;
            if ("homepageUrl".equals(fieldName)) return homepageUrl;
            if ("autoUpdateHomepage".equals(fieldName)) return autoUpdateHomepage;
            if ("releaseScriptPath".equals(fieldName)) return releaseScriptPath;
            if ("supportEmail".equals(fieldName)) return supportEmail;
            if ("issueReplyTemplate".equals(fieldName)) return issueReplyTemplate;
            if ("subscriberNotificationTemplate".equals(fieldName)) return subscriberNotificationTemplate;
            if ("lastOpenedDateAndTime".equals(fieldName)) return lastOpenedDateAndTime;
            if ("freeDays".equals(fieldName)) return freeDays;
            if ("autoCreateTasksFromQualities".equals(fieldName)) return autoCreateTasksFromQualities;
            if ("releasingInfo".equals(fieldName)) return releasingInfo;
            if ("externalTrackerUrlTemplate".equals(fieldName)) return externalTrackerUrlTemplate;
            if ("externalTrackerLabel".equals(fieldName)) return externalTrackerLabel;
            return null;
        }

    }

    public static transient final ProjectMetadata metadata = new ProjectMetadata();

    @Override
    public ProjectMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Project.class);

    // --- AEntity ---

    public final scrum.server.project.ProjectDao getDao() {
        return projectDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class AProjectQuery extends ilarkesto.core.persistance.AEntityQuery<Project> {
    @Override
        public Class<Project> getType() {
            return Project.class;
        }
    }

    public static Set<Project> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Project.class).list();
    }

    public static Project getById(String id) {
        return (Project) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        if (participantsIds!=null) for (String id : participantsIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (adminsIds!=null) for (String id : adminsIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (productOwnersIds!=null) for (String id : productOwnersIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (scrumMastersIds!=null) for (String id : scrumMastersIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (teamMembersIds!=null) for (String id : teamMembersIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        try { Utl.addIfNotNull(ret, getCurrentSprint()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getNextSprint()); } catch(EntityDoesNotExistException ex) {}
    // --- back references ---
        ret.addAll(getSprints());
        ret.addAll(getProjectUserConfigs());
        ret.addAll(getQualitys());
        ret.addAll(getImpediments());
        ret.addAll(getRequirements());
        ret.addAll(getIssues());
        ret.addAll(getReleases());
        ret.addAll(getProjectEvents());
        ret.addAll(getSimpleEvents());
        ret.addAll(getSubjects());
        ret.addAll(getChatMessages());
        ret.addAll(getBlogEntrys());
        ret.addAll(getRisks());
        ret.addAll(getWikipages());
        ret.addAll(getFiles());
        ret.addAll(getCurrentProjectUsers());
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("vision", ilarkesto.core.persistance.Persistence.propertyAsString(this.vision));
        properties.put("productLabel", ilarkesto.core.persistance.Persistence.propertyAsString(this.productLabel));
        properties.put("shortDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.shortDescription));
        properties.put("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
        properties.put("longDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.longDescription));
        properties.put("begin", ilarkesto.core.persistance.Persistence.propertyAsString(this.begin));
        properties.put("end", ilarkesto.core.persistance.Persistence.propertyAsString(this.end));
        properties.put("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        properties.put("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        properties.put("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        properties.put("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        properties.put("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        properties.put("currentSprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.currentSprintId));
        properties.put("nextSprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.nextSprintId));
        properties.put("velocity", ilarkesto.core.persistance.Persistence.propertyAsString(this.velocity));
        properties.put("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        properties.put("urgentIssuesOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgentIssuesOrderIds));
        properties.put("lastSprintNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastSprintNumber));
        properties.put("lastTaskNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastTaskNumber));
        properties.put("lastRequirementNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastRequirementNumber));
        properties.put("lastQualityNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastQualityNumber));
        properties.put("lastRiskNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastRiskNumber));
        properties.put("lastIssueNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastIssueNumber));
        properties.put("lastImpedimentNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastImpedimentNumber));
        properties.put("lastFileNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastFileNumber));
        properties.put("lastSubjectNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastSubjectNumber));
        properties.put("lastEventNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastEventNumber));
        properties.put("lastReleaseNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastReleaseNumber));
        properties.put("lastBlogEntryNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastBlogEntryNumber));
        properties.put("punishmentUnit", ilarkesto.core.persistance.Persistence.propertyAsString(this.punishmentUnit));
        properties.put("punishmentFactor", ilarkesto.core.persistance.Persistence.propertyAsString(this.punishmentFactor));
        properties.put("homepageDir", ilarkesto.core.persistance.Persistence.propertyAsString(this.homepageDir));
        properties.put("homepageUrl", ilarkesto.core.persistance.Persistence.propertyAsString(this.homepageUrl));
        properties.put("autoUpdateHomepage", ilarkesto.core.persistance.Persistence.propertyAsString(this.autoUpdateHomepage));
        properties.put("releaseScriptPath", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseScriptPath));
        properties.put("supportEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.supportEmail));
        properties.put("issueReplyTemplate", ilarkesto.core.persistance.Persistence.propertyAsString(this.issueReplyTemplate));
        properties.put("subscriberNotificationTemplate", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscriberNotificationTemplate));
        properties.put("lastOpenedDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastOpenedDateAndTime));
        properties.put("freeDays", ilarkesto.core.persistance.Persistence.propertyAsString(this.freeDays));
        properties.put("autoCreateTasksFromQualities", ilarkesto.core.persistance.Persistence.propertyAsString(this.autoCreateTasksFromQualities));
        properties.put("releasingInfo", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasingInfo));
        properties.put("externalTrackerUrlTemplate", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerUrlTemplate));
        properties.put("externalTrackerLabel", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerLabel));
    }

    @Override
    public int compareTo(Project other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    public final java.util.Set<scrum.server.sprint.Sprint> getSprints() {
        return sprintDao.getSprintsByProject((Project)this);
    }

    public final java.util.Set<scrum.server.admin.ProjectUserConfig> getProjectUserConfigs() {
        return projectUserConfigDao.getProjectUserConfigsByProject((Project)this);
    }

    public final java.util.Set<scrum.server.project.Quality> getQualitys() {
        return qualityDao.getQualitysByProject((Project)this);
    }

    public final java.util.Set<scrum.server.impediments.Impediment> getImpediments() {
        return impedimentDao.getImpedimentsByProject((Project)this);
    }

    public final java.util.Set<scrum.server.project.Requirement> getRequirements() {
        return requirementDao.getRequirementsByProject((Project)this);
    }

    public final java.util.Set<scrum.server.issues.Issue> getIssues() {
        return issueDao.getIssuesByProject((Project)this);
    }

    public final java.util.Set<scrum.server.release.Release> getReleases() {
        return releaseDao.getReleasesByProject((Project)this);
    }

    public final java.util.Set<scrum.server.journal.ProjectEvent> getProjectEvents() {
        return projectEventDao.getProjectEventsByProject((Project)this);
    }

    public final java.util.Set<scrum.server.calendar.SimpleEvent> getSimpleEvents() {
        return simpleEventDao.getSimpleEventsByProject((Project)this);
    }

    public final java.util.Set<scrum.server.collaboration.Subject> getSubjects() {
        return subjectDao.getSubjectsByProject((Project)this);
    }

    public final java.util.Set<scrum.server.collaboration.ChatMessage> getChatMessages() {
        return chatMessageDao.getChatMessagesByProject((Project)this);
    }

    public final java.util.Set<scrum.server.pr.BlogEntry> getBlogEntrys() {
        return blogEntryDao.getBlogEntrysByProject((Project)this);
    }

    public final java.util.Set<scrum.server.risks.Risk> getRisks() {
        return riskDao.getRisksByProject((Project)this);
    }

    public final java.util.Set<scrum.server.collaboration.Wikipage> getWikipages() {
        return wikipageDao.getWikipagesByProject((Project)this);
    }

    public final java.util.Set<scrum.server.files.File> getFiles() {
        return fileDao.getFilesByProject((Project)this);
    }

    public final java.util.Set<scrum.server.admin.User> getCurrentProjectUsers() {
        return userDao.getUsersByCurrentProject((Project)this);
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GProject.class);

    public static final String TYPE = "Project";
    // -----------------------------------------------------------
    // - label
    // -----------------------------------------------------------

    private java.lang.String label;

    public final java.lang.String getLabel() {
        return label;
    }

    public final void setLabel(java.lang.String label) {
        label = prepareLabel(label);
        if (isLabel(label)) return;
        if (label == null) throw new IllegalArgumentException("Mandatory field can not be set to null: label");
        if (label != null) {
            Object existing = getDao().getProjectByLabel(label);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("Project" ,"label", label);
        }
        this.label = label;
            updateLastModified();
            fireModified("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
    }

    private final void updateLabel(java.lang.String label) {
        if (isLabel(label)) return;
        if (label == null) throw new IllegalArgumentException("Mandatory field can not be set to null: label");
        if (label != null) {
            Object existing = getDao().getProjectByLabel(label);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("Project" ,"label", label);
        }
        this.label = label;
            updateLastModified();
            fireModified("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
    }

    protected java.lang.String prepareLabel(java.lang.String label) {
         label = Str.removeControlChars(label);
        return label;
    }

    public final boolean isLabelSet() {
        return this.label != null;
    }

    public final boolean isLabel(java.lang.String label) {
        if (this.label == null && label == null) return true;
        return this.label != null && this.label.equals(label);
    }

    protected final void updateLabel(Object value) {
        setLabel((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - vision
    // -----------------------------------------------------------

    private java.lang.String vision;

    public final java.lang.String getVision() {
        return vision;
    }

    public final void setVision(java.lang.String vision) {
        vision = prepareVision(vision);
        if (isVision(vision)) return;
        this.vision = vision;
            updateLastModified();
            fireModified("vision", ilarkesto.core.persistance.Persistence.propertyAsString(this.vision));
    }

    private final void updateVision(java.lang.String vision) {
        if (isVision(vision)) return;
        this.vision = vision;
            updateLastModified();
            fireModified("vision", ilarkesto.core.persistance.Persistence.propertyAsString(this.vision));
    }

    protected java.lang.String prepareVision(java.lang.String vision) {
         vision = Str.removeControlChars(vision);
        return vision;
    }

    public final boolean isVisionSet() {
        return this.vision != null;
    }

    public final boolean isVision(java.lang.String vision) {
        if (this.vision == null && vision == null) return true;
        return this.vision != null && this.vision.equals(vision);
    }

    protected final void updateVision(Object value) {
        setVision((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - productLabel
    // -----------------------------------------------------------

    private java.lang.String productLabel;

    public final java.lang.String getProductLabel() {
        return productLabel;
    }

    public final void setProductLabel(java.lang.String productLabel) {
        productLabel = prepareProductLabel(productLabel);
        if (isProductLabel(productLabel)) return;
        this.productLabel = productLabel;
            updateLastModified();
            fireModified("productLabel", ilarkesto.core.persistance.Persistence.propertyAsString(this.productLabel));
    }

    private final void updateProductLabel(java.lang.String productLabel) {
        if (isProductLabel(productLabel)) return;
        this.productLabel = productLabel;
            updateLastModified();
            fireModified("productLabel", ilarkesto.core.persistance.Persistence.propertyAsString(this.productLabel));
    }

    protected java.lang.String prepareProductLabel(java.lang.String productLabel) {
         productLabel = Str.removeControlChars(productLabel);
        return productLabel;
    }

    public final boolean isProductLabelSet() {
        return this.productLabel != null;
    }

    public final boolean isProductLabel(java.lang.String productLabel) {
        if (this.productLabel == null && productLabel == null) return true;
        return this.productLabel != null && this.productLabel.equals(productLabel);
    }

    protected final void updateProductLabel(Object value) {
        setProductLabel((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - shortDescription
    // -----------------------------------------------------------

    private java.lang.String shortDescription;

    public final java.lang.String getShortDescription() {
        return shortDescription;
    }

    public final void setShortDescription(java.lang.String shortDescription) {
        shortDescription = prepareShortDescription(shortDescription);
        if (isShortDescription(shortDescription)) return;
        this.shortDescription = shortDescription;
            updateLastModified();
            fireModified("shortDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.shortDescription));
    }

    private final void updateShortDescription(java.lang.String shortDescription) {
        if (isShortDescription(shortDescription)) return;
        this.shortDescription = shortDescription;
            updateLastModified();
            fireModified("shortDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.shortDescription));
    }

    protected java.lang.String prepareShortDescription(java.lang.String shortDescription) {
         shortDescription = Str.removeControlChars(shortDescription);
        return shortDescription;
    }

    public final boolean isShortDescriptionSet() {
        return this.shortDescription != null;
    }

    public final boolean isShortDescription(java.lang.String shortDescription) {
        if (this.shortDescription == null && shortDescription == null) return true;
        return this.shortDescription != null && this.shortDescription.equals(shortDescription);
    }

    protected final void updateShortDescription(Object value) {
        setShortDescription((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - description
    // -----------------------------------------------------------

    private java.lang.String description;

    public final java.lang.String getDescription() {
        return description;
    }

    public final void setDescription(java.lang.String description) {
        description = prepareDescription(description);
        if (isDescription(description)) return;
        this.description = description;
            updateLastModified();
            fireModified("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
    }

    private final void updateDescription(java.lang.String description) {
        if (isDescription(description)) return;
        this.description = description;
            updateLastModified();
            fireModified("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
    }

    protected java.lang.String prepareDescription(java.lang.String description) {
         description = Str.removeControlChars(description);
        return description;
    }

    public final boolean isDescriptionSet() {
        return this.description != null;
    }

    public final boolean isDescription(java.lang.String description) {
        if (this.description == null && description == null) return true;
        return this.description != null && this.description.equals(description);
    }

    protected final void updateDescription(Object value) {
        setDescription((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - longDescription
    // -----------------------------------------------------------

    private java.lang.String longDescription;

    public final java.lang.String getLongDescription() {
        return longDescription;
    }

    public final void setLongDescription(java.lang.String longDescription) {
        longDescription = prepareLongDescription(longDescription);
        if (isLongDescription(longDescription)) return;
        this.longDescription = longDescription;
            updateLastModified();
            fireModified("longDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.longDescription));
    }

    private final void updateLongDescription(java.lang.String longDescription) {
        if (isLongDescription(longDescription)) return;
        this.longDescription = longDescription;
            updateLastModified();
            fireModified("longDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.longDescription));
    }

    protected java.lang.String prepareLongDescription(java.lang.String longDescription) {
         longDescription = Str.removeControlChars(longDescription);
        return longDescription;
    }

    public final boolean isLongDescriptionSet() {
        return this.longDescription != null;
    }

    public final boolean isLongDescription(java.lang.String longDescription) {
        if (this.longDescription == null && longDescription == null) return true;
        return this.longDescription != null && this.longDescription.equals(longDescription);
    }

    protected final void updateLongDescription(Object value) {
        setLongDescription((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - begin
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date begin;

    public final ilarkesto.core.time.Date getBegin() {
        return begin;
    }

    public final void setBegin(ilarkesto.core.time.Date begin) {
        begin = prepareBegin(begin);
        if (isBegin(begin)) return;
        this.begin = begin;
            updateLastModified();
            fireModified("begin", ilarkesto.core.persistance.Persistence.propertyAsString(this.begin));
    }

    private final void updateBegin(ilarkesto.core.time.Date begin) {
        if (isBegin(begin)) return;
        this.begin = begin;
            updateLastModified();
            fireModified("begin", ilarkesto.core.persistance.Persistence.propertyAsString(this.begin));
    }

    protected ilarkesto.core.time.Date prepareBegin(ilarkesto.core.time.Date begin) {
        return begin;
    }

    public final boolean isBeginSet() {
        return this.begin != null;
    }

    public final boolean isBegin(ilarkesto.core.time.Date begin) {
        if (this.begin == null && begin == null) return true;
        return this.begin != null && this.begin.equals(begin);
    }

    protected final void updateBegin(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setBegin((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - end
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date end;

    public final ilarkesto.core.time.Date getEnd() {
        return end;
    }

    public final void setEnd(ilarkesto.core.time.Date end) {
        end = prepareEnd(end);
        if (isEnd(end)) return;
        this.end = end;
            updateLastModified();
            fireModified("end", ilarkesto.core.persistance.Persistence.propertyAsString(this.end));
    }

    private final void updateEnd(ilarkesto.core.time.Date end) {
        if (isEnd(end)) return;
        this.end = end;
            updateLastModified();
            fireModified("end", ilarkesto.core.persistance.Persistence.propertyAsString(this.end));
    }

    protected ilarkesto.core.time.Date prepareEnd(ilarkesto.core.time.Date end) {
        return end;
    }

    public final boolean isEndSet() {
        return this.end != null;
    }

    public final boolean isEnd(ilarkesto.core.time.Date end) {
        if (this.end == null && end == null) return true;
        return this.end != null && this.end.equals(end);
    }

    protected final void updateEnd(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setEnd((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - participants
    // -----------------------------------------------------------

    private java.util.Set<String> participantsIds = new java.util.HashSet<String>();

    public final Collection<String> getParticipantsIds() {
        return java.util.Collections .unmodifiableCollection(this.participantsIds);
    }

    public final java.util.Set<scrum.server.admin.User> getParticipants() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.participantsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.participants");
        }
    }

    public final void setParticipants(Collection<scrum.server.admin.User> participants) {
        participants = prepareParticipants(participants);
        if (participants == null) participants = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(participants);
        setParticipantsIds(ids);
    }

    public final void setParticipantsIds(java.util.Set<String> ids) {
        if (Utl.equals(participantsIds, ids)) return;
        participantsIds = ids;
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
    }

    private final void updateParticipantsIds(java.util.Set<String> ids) {
        setParticipantsIds(ids);
    }

    protected Collection<scrum.server.admin.User> prepareParticipants(Collection<scrum.server.admin.User> participants) {
        return participants;
    }

    protected void repairDeadParticipantReference(String entityId) {
        if (!isPersisted()) return;
        if (this.participantsIds == null ) return;
        if (this.participantsIds.remove(entityId)) {
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        }
    }

    public final boolean containsParticipant(scrum.server.admin.User participant) {
        if (participant == null) return false;
        if (this.participantsIds == null) return false;
        return this.participantsIds.contains(participant.getId());
    }

    public final int getParticipantsCount() {
        if (this.participantsIds == null) return 0;
        return this.participantsIds.size();
    }

    public final boolean isParticipantsEmpty() {
        if (this.participantsIds == null) return true;
        return this.participantsIds.isEmpty();
    }

    public final boolean addParticipant(scrum.server.admin.User participant) {
        if (participant == null) throw new IllegalArgumentException("participant == null");
        if (this.participantsIds == null) this.participantsIds = new java.util.HashSet<String>();
        boolean added = this.participantsIds.add(participant.getId());
        if (added) {
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        }
        return added;
    }

    public final boolean addParticipants(Collection<scrum.server.admin.User> participants) {
        if (participants == null) throw new IllegalArgumentException("participants == null");
        if (this.participantsIds == null) this.participantsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.admin.User participant : participants) {
            added = added | this.participantsIds.add(participant.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        }
        return added;
    }

    public final boolean removeParticipant(scrum.server.admin.User participant) {
        if (participant == null) return false;
        if (this.participantsIds == null) return false;
        boolean removed = this.participantsIds.remove(participant.getId());
        if (removed) {
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        }
        return removed;
    }

    public final boolean removeParticipants(Collection<scrum.server.admin.User> participants) {
        if (participants == null) return false;
        if (participants.isEmpty()) return false;
        if (this.participantsIds == null) return false;
        boolean removed = false;
        for (scrum.server.admin.User _element: participants) {
            removed = removed | this.participantsIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        }
        return removed;
    }

    public final boolean clearParticipants() {
        if (this.participantsIds == null) return false;
        if (this.participantsIds.isEmpty()) return false;
        this.participantsIds.clear();
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        return true;
    }
    // -----------------------------------------------------------
    // - admins
    // -----------------------------------------------------------

    private java.util.Set<String> adminsIds = new java.util.HashSet<String>();

    public final Collection<String> getAdminsIds() {
        return java.util.Collections .unmodifiableCollection(this.adminsIds);
    }

    public final java.util.Set<scrum.server.admin.User> getAdmins() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.adminsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.admins");
        }
    }

    public final void setAdmins(Collection<scrum.server.admin.User> admins) {
        admins = prepareAdmins(admins);
        if (admins == null) admins = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(admins);
        setAdminsIds(ids);
    }

    public final void setAdminsIds(java.util.Set<String> ids) {
        if (Utl.equals(adminsIds, ids)) return;
        adminsIds = ids;
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
    }

    private final void updateAdminsIds(java.util.Set<String> ids) {
        setAdminsIds(ids);
    }

    protected Collection<scrum.server.admin.User> prepareAdmins(Collection<scrum.server.admin.User> admins) {
        return admins;
    }

    protected void repairDeadAdminReference(String entityId) {
        if (!isPersisted()) return;
        if (this.adminsIds == null ) return;
        if (this.adminsIds.remove(entityId)) {
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        }
    }

    public final boolean containsAdmin(scrum.server.admin.User admin) {
        if (admin == null) return false;
        if (this.adminsIds == null) return false;
        return this.adminsIds.contains(admin.getId());
    }

    public final int getAdminsCount() {
        if (this.adminsIds == null) return 0;
        return this.adminsIds.size();
    }

    public final boolean isAdminsEmpty() {
        if (this.adminsIds == null) return true;
        return this.adminsIds.isEmpty();
    }

    public final boolean addAdmin(scrum.server.admin.User admin) {
        if (admin == null) throw new IllegalArgumentException("admin == null");
        if (this.adminsIds == null) this.adminsIds = new java.util.HashSet<String>();
        boolean added = this.adminsIds.add(admin.getId());
        if (added) {
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        }
        return added;
    }

    public final boolean addAdmins(Collection<scrum.server.admin.User> admins) {
        if (admins == null) throw new IllegalArgumentException("admins == null");
        if (this.adminsIds == null) this.adminsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.admin.User admin : admins) {
            added = added | this.adminsIds.add(admin.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        }
        return added;
    }

    public final boolean removeAdmin(scrum.server.admin.User admin) {
        if (admin == null) return false;
        if (this.adminsIds == null) return false;
        boolean removed = this.adminsIds.remove(admin.getId());
        if (removed) {
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        }
        return removed;
    }

    public final boolean removeAdmins(Collection<scrum.server.admin.User> admins) {
        if (admins == null) return false;
        if (admins.isEmpty()) return false;
        if (this.adminsIds == null) return false;
        boolean removed = false;
        for (scrum.server.admin.User _element: admins) {
            removed = removed | this.adminsIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        }
        return removed;
    }

    public final boolean clearAdmins() {
        if (this.adminsIds == null) return false;
        if (this.adminsIds.isEmpty()) return false;
        this.adminsIds.clear();
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        return true;
    }
    // -----------------------------------------------------------
    // - productOwners
    // -----------------------------------------------------------

    private java.util.Set<String> productOwnersIds = new java.util.HashSet<String>();

    public final Collection<String> getProductOwnersIds() {
        return java.util.Collections .unmodifiableCollection(this.productOwnersIds);
    }

    public final java.util.Set<scrum.server.admin.User> getProductOwners() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.productOwnersIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.productOwners");
        }
    }

    public final void setProductOwners(Collection<scrum.server.admin.User> productOwners) {
        productOwners = prepareProductOwners(productOwners);
        if (productOwners == null) productOwners = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(productOwners);
        setProductOwnersIds(ids);
    }

    public final void setProductOwnersIds(java.util.Set<String> ids) {
        if (Utl.equals(productOwnersIds, ids)) return;
        productOwnersIds = ids;
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
    }

    private final void updateProductOwnersIds(java.util.Set<String> ids) {
        setProductOwnersIds(ids);
    }

    protected Collection<scrum.server.admin.User> prepareProductOwners(Collection<scrum.server.admin.User> productOwners) {
        return productOwners;
    }

    protected void repairDeadProductOwnerReference(String entityId) {
        if (!isPersisted()) return;
        if (this.productOwnersIds == null ) return;
        if (this.productOwnersIds.remove(entityId)) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
    }

    public final boolean containsProductOwner(scrum.server.admin.User productOwner) {
        if (productOwner == null) return false;
        if (this.productOwnersIds == null) return false;
        return this.productOwnersIds.contains(productOwner.getId());
    }

    public final int getProductOwnersCount() {
        if (this.productOwnersIds == null) return 0;
        return this.productOwnersIds.size();
    }

    public final boolean isProductOwnersEmpty() {
        if (this.productOwnersIds == null) return true;
        return this.productOwnersIds.isEmpty();
    }

    public final boolean addProductOwner(scrum.server.admin.User productOwner) {
        if (productOwner == null) throw new IllegalArgumentException("productOwner == null");
        if (this.productOwnersIds == null) this.productOwnersIds = new java.util.HashSet<String>();
        boolean added = this.productOwnersIds.add(productOwner.getId());
        if (added) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return added;
    }

    public final boolean addProductOwners(Collection<scrum.server.admin.User> productOwners) {
        if (productOwners == null) throw new IllegalArgumentException("productOwners == null");
        if (this.productOwnersIds == null) this.productOwnersIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.admin.User productOwner : productOwners) {
            added = added | this.productOwnersIds.add(productOwner.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return added;
    }

    public final boolean removeProductOwner(scrum.server.admin.User productOwner) {
        if (productOwner == null) return false;
        if (this.productOwnersIds == null) return false;
        boolean removed = this.productOwnersIds.remove(productOwner.getId());
        if (removed) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return removed;
    }

    public final boolean removeProductOwners(Collection<scrum.server.admin.User> productOwners) {
        if (productOwners == null) return false;
        if (productOwners.isEmpty()) return false;
        if (this.productOwnersIds == null) return false;
        boolean removed = false;
        for (scrum.server.admin.User _element: productOwners) {
            removed = removed | this.productOwnersIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return removed;
    }

    public final boolean clearProductOwners() {
        if (this.productOwnersIds == null) return false;
        if (this.productOwnersIds.isEmpty()) return false;
        this.productOwnersIds.clear();
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        return true;
    }
    // -----------------------------------------------------------
    // - scrumMasters
    // -----------------------------------------------------------

    private java.util.Set<String> scrumMastersIds = new java.util.HashSet<String>();

    public final Collection<String> getScrumMastersIds() {
        return java.util.Collections .unmodifiableCollection(this.scrumMastersIds);
    }

    public final java.util.Set<scrum.server.admin.User> getScrumMasters() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.scrumMastersIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.scrumMasters");
        }
    }

    public final void setScrumMasters(Collection<scrum.server.admin.User> scrumMasters) {
        scrumMasters = prepareScrumMasters(scrumMasters);
        if (scrumMasters == null) scrumMasters = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(scrumMasters);
        setScrumMastersIds(ids);
    }

    public final void setScrumMastersIds(java.util.Set<String> ids) {
        if (Utl.equals(scrumMastersIds, ids)) return;
        scrumMastersIds = ids;
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
    }

    private final void updateScrumMastersIds(java.util.Set<String> ids) {
        setScrumMastersIds(ids);
    }

    protected Collection<scrum.server.admin.User> prepareScrumMasters(Collection<scrum.server.admin.User> scrumMasters) {
        return scrumMasters;
    }

    protected void repairDeadScrumMasterReference(String entityId) {
        if (!isPersisted()) return;
        if (this.scrumMastersIds == null ) return;
        if (this.scrumMastersIds.remove(entityId)) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
    }

    public final boolean containsScrumMaster(scrum.server.admin.User scrumMaster) {
        if (scrumMaster == null) return false;
        if (this.scrumMastersIds == null) return false;
        return this.scrumMastersIds.contains(scrumMaster.getId());
    }

    public final int getScrumMastersCount() {
        if (this.scrumMastersIds == null) return 0;
        return this.scrumMastersIds.size();
    }

    public final boolean isScrumMastersEmpty() {
        if (this.scrumMastersIds == null) return true;
        return this.scrumMastersIds.isEmpty();
    }

    public final boolean addScrumMaster(scrum.server.admin.User scrumMaster) {
        if (scrumMaster == null) throw new IllegalArgumentException("scrumMaster == null");
        if (this.scrumMastersIds == null) this.scrumMastersIds = new java.util.HashSet<String>();
        boolean added = this.scrumMastersIds.add(scrumMaster.getId());
        if (added) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return added;
    }

    public final boolean addScrumMasters(Collection<scrum.server.admin.User> scrumMasters) {
        if (scrumMasters == null) throw new IllegalArgumentException("scrumMasters == null");
        if (this.scrumMastersIds == null) this.scrumMastersIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.admin.User scrumMaster : scrumMasters) {
            added = added | this.scrumMastersIds.add(scrumMaster.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return added;
    }

    public final boolean removeScrumMaster(scrum.server.admin.User scrumMaster) {
        if (scrumMaster == null) return false;
        if (this.scrumMastersIds == null) return false;
        boolean removed = this.scrumMastersIds.remove(scrumMaster.getId());
        if (removed) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return removed;
    }

    public final boolean removeScrumMasters(Collection<scrum.server.admin.User> scrumMasters) {
        if (scrumMasters == null) return false;
        if (scrumMasters.isEmpty()) return false;
        if (this.scrumMastersIds == null) return false;
        boolean removed = false;
        for (scrum.server.admin.User _element: scrumMasters) {
            removed = removed | this.scrumMastersIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return removed;
    }

    public final boolean clearScrumMasters() {
        if (this.scrumMastersIds == null) return false;
        if (this.scrumMastersIds.isEmpty()) return false;
        this.scrumMastersIds.clear();
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        return true;
    }
    // -----------------------------------------------------------
    // - teamMembers
    // -----------------------------------------------------------

    private java.util.Set<String> teamMembersIds = new java.util.HashSet<String>();

    public final Collection<String> getTeamMembersIds() {
        return java.util.Collections .unmodifiableCollection(this.teamMembersIds);
    }

    public final java.util.Set<scrum.server.admin.User> getTeamMembers() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.teamMembersIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.teamMembers");
        }
    }

    public final void setTeamMembers(Collection<scrum.server.admin.User> teamMembers) {
        teamMembers = prepareTeamMembers(teamMembers);
        if (teamMembers == null) teamMembers = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(teamMembers);
        setTeamMembersIds(ids);
    }

    public final void setTeamMembersIds(java.util.Set<String> ids) {
        if (Utl.equals(teamMembersIds, ids)) return;
        teamMembersIds = ids;
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
    }

    private final void updateTeamMembersIds(java.util.Set<String> ids) {
        setTeamMembersIds(ids);
    }

    protected Collection<scrum.server.admin.User> prepareTeamMembers(Collection<scrum.server.admin.User> teamMembers) {
        return teamMembers;
    }

    protected void repairDeadTeamMemberReference(String entityId) {
        if (!isPersisted()) return;
        if (this.teamMembersIds == null ) return;
        if (this.teamMembersIds.remove(entityId)) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
    }

    public final boolean containsTeamMember(scrum.server.admin.User teamMember) {
        if (teamMember == null) return false;
        if (this.teamMembersIds == null) return false;
        return this.teamMembersIds.contains(teamMember.getId());
    }

    public final int getTeamMembersCount() {
        if (this.teamMembersIds == null) return 0;
        return this.teamMembersIds.size();
    }

    public final boolean isTeamMembersEmpty() {
        if (this.teamMembersIds == null) return true;
        return this.teamMembersIds.isEmpty();
    }

    public final boolean addTeamMember(scrum.server.admin.User teamMember) {
        if (teamMember == null) throw new IllegalArgumentException("teamMember == null");
        if (this.teamMembersIds == null) this.teamMembersIds = new java.util.HashSet<String>();
        boolean added = this.teamMembersIds.add(teamMember.getId());
        if (added) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return added;
    }

    public final boolean addTeamMembers(Collection<scrum.server.admin.User> teamMembers) {
        if (teamMembers == null) throw new IllegalArgumentException("teamMembers == null");
        if (this.teamMembersIds == null) this.teamMembersIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.admin.User teamMember : teamMembers) {
            added = added | this.teamMembersIds.add(teamMember.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return added;
    }

    public final boolean removeTeamMember(scrum.server.admin.User teamMember) {
        if (teamMember == null) return false;
        if (this.teamMembersIds == null) return false;
        boolean removed = this.teamMembersIds.remove(teamMember.getId());
        if (removed) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return removed;
    }

    public final boolean removeTeamMembers(Collection<scrum.server.admin.User> teamMembers) {
        if (teamMembers == null) return false;
        if (teamMembers.isEmpty()) return false;
        if (this.teamMembersIds == null) return false;
        boolean removed = false;
        for (scrum.server.admin.User _element: teamMembers) {
            removed = removed | this.teamMembersIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return removed;
    }

    public final boolean clearTeamMembers() {
        if (this.teamMembersIds == null) return false;
        if (this.teamMembersIds.isEmpty()) return false;
        this.teamMembersIds.clear();
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        return true;
    }
    // -----------------------------------------------------------
    // - currentSprint
    // -----------------------------------------------------------

    private String currentSprintId;

    public final String getCurrentSprintId() {
        return this.currentSprintId;
    }

    public final scrum.server.sprint.Sprint getCurrentSprint() {
        try {
            return this.currentSprintId == null ? null : (scrum.server.sprint.Sprint) AEntity.getById(this.currentSprintId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.currentSprint");
        }
    }

    public final void setCurrentSprint(scrum.server.sprint.Sprint currentSprint) {
        currentSprint = prepareCurrentSprint(currentSprint);
        if (isCurrentSprint(currentSprint)) return;
        setCurrentSprintId(currentSprint == null ? null : currentSprint.getId());
    }

    public final void setCurrentSprintId(String id) {
        if (Utl.equals(currentSprintId, id)) return;
        this.currentSprintId = id;
            updateLastModified();
            fireModified("currentSprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.currentSprintId));
    }

    private final void updateCurrentSprintId(String id) {
        setCurrentSprintId(id);
    }

    protected scrum.server.sprint.Sprint prepareCurrentSprint(scrum.server.sprint.Sprint currentSprint) {
        return currentSprint;
    }

    protected void repairDeadCurrentSprintReference(String entityId) {
        if (!isPersisted()) return;
        if (this.currentSprintId == null || entityId.equals(this.currentSprintId)) {
            setCurrentSprint(null);
        }
    }

    public final boolean isCurrentSprintSet() {
        return this.currentSprintId != null;
    }

    public final boolean isCurrentSprint(scrum.server.sprint.Sprint currentSprint) {
        if (this.currentSprintId == null && currentSprint == null) return true;
        return currentSprint != null && currentSprint.getId().equals(this.currentSprintId);
    }

    protected final void updateCurrentSprint(Object value) {
        setCurrentSprint(value == null ? null : (scrum.server.sprint.Sprint)sprintDao.getById((String)value));
    }
    // -----------------------------------------------------------
    // - nextSprint
    // -----------------------------------------------------------

    private String nextSprintId;

    public final String getNextSprintId() {
        return this.nextSprintId;
    }

    public final scrum.server.sprint.Sprint getNextSprint() {
        try {
            return this.nextSprintId == null ? null : (scrum.server.sprint.Sprint) AEntity.getById(this.nextSprintId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.nextSprint");
        }
    }

    public final void setNextSprint(scrum.server.sprint.Sprint nextSprint) {
        nextSprint = prepareNextSprint(nextSprint);
        if (isNextSprint(nextSprint)) return;
        setNextSprintId(nextSprint == null ? null : nextSprint.getId());
    }

    public final void setNextSprintId(String id) {
        if (Utl.equals(nextSprintId, id)) return;
        this.nextSprintId = id;
            updateLastModified();
            fireModified("nextSprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.nextSprintId));
    }

    private final void updateNextSprintId(String id) {
        setNextSprintId(id);
    }

    protected scrum.server.sprint.Sprint prepareNextSprint(scrum.server.sprint.Sprint nextSprint) {
        return nextSprint;
    }

    protected void repairDeadNextSprintReference(String entityId) {
        if (!isPersisted()) return;
        if (this.nextSprintId == null || entityId.equals(this.nextSprintId)) {
            setNextSprint(null);
        }
    }

    public final boolean isNextSprintSet() {
        return this.nextSprintId != null;
    }

    public final boolean isNextSprint(scrum.server.sprint.Sprint nextSprint) {
        if (this.nextSprintId == null && nextSprint == null) return true;
        return nextSprint != null && nextSprint.getId().equals(this.nextSprintId);
    }

    protected final void updateNextSprint(Object value) {
        setNextSprint(value == null ? null : (scrum.server.sprint.Sprint)sprintDao.getById((String)value));
    }
    // -----------------------------------------------------------
    // - velocity
    // -----------------------------------------------------------

    private java.lang.Integer velocity;

    public final java.lang.Integer getVelocity() {
        return velocity;
    }

    public final void setVelocity(java.lang.Integer velocity) {
        velocity = prepareVelocity(velocity);
        if (isVelocity(velocity)) return;
        this.velocity = velocity;
            updateLastModified();
            fireModified("velocity", ilarkesto.core.persistance.Persistence.propertyAsString(this.velocity));
    }

    private final void updateVelocity(java.lang.Integer velocity) {
        if (isVelocity(velocity)) return;
        this.velocity = velocity;
            updateLastModified();
            fireModified("velocity", ilarkesto.core.persistance.Persistence.propertyAsString(this.velocity));
    }

    protected java.lang.Integer prepareVelocity(java.lang.Integer velocity) {
        return velocity;
    }

    public final boolean isVelocitySet() {
        return this.velocity != null;
    }

    public final boolean isVelocity(java.lang.Integer velocity) {
        if (this.velocity == null && velocity == null) return true;
        return this.velocity != null && this.velocity.equals(velocity);
    }

    protected final void updateVelocity(Object value) {
        setVelocity((java.lang.Integer)value);
    }
    // -----------------------------------------------------------
    // - requirementsOrderIds
    // -----------------------------------------------------------

    private java.util.List<java.lang.String> requirementsOrderIds = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getRequirementsOrderIds() {
        return new java.util.ArrayList<java.lang.String>(requirementsOrderIds);
    }

    public final void setRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        requirementsOrderIds = prepareRequirementsOrderIds(requirementsOrderIds);
        if (requirementsOrderIds == null) requirementsOrderIds = Collections.emptyList();
        if (this.requirementsOrderIds.equals(requirementsOrderIds)) return;
        this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>(requirementsOrderIds);
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
    }

    private final void updateRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        if (requirementsOrderIds == null) requirementsOrderIds = Collections.emptyList();
        if (this.requirementsOrderIds.equals(requirementsOrderIds)) return;
        this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>(requirementsOrderIds);
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
    }

    protected Collection<java.lang.String> prepareRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        return requirementsOrderIds;
    }

    public final boolean containsRequirementsOrderId(java.lang.String requirementsOrderId) {
        if (requirementsOrderId == null) return false;
        if (this.requirementsOrderIds == null) return false;
        return this.requirementsOrderIds.contains(requirementsOrderId);
    }

    public final int getRequirementsOrderIdsCount() {
        if (this.requirementsOrderIds == null) return 0;
        return this.requirementsOrderIds.size();
    }

    public final boolean isRequirementsOrderIdsEmpty() {
        if (this.requirementsOrderIds == null) return true;
        return this.requirementsOrderIds.isEmpty();
    }

    public final boolean addRequirementsOrderId(java.lang.String requirementsOrderId) {
        if (requirementsOrderId == null) throw new IllegalArgumentException("requirementsOrderId == null");
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        boolean added = this.requirementsOrderIds.add(requirementsOrderId);
        if (added) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return added;
    }

    public final boolean addRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        if (requirementsOrderIds == null) throw new IllegalArgumentException("requirementsOrderIds == null");
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        boolean added = false;
        for (java.lang.String requirementsOrderId : requirementsOrderIds) {
            added = added | this.requirementsOrderIds.add(requirementsOrderId);
        }
        if (added) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return added;
    }

    public final boolean removeRequirementsOrderId(java.lang.String requirementsOrderId) {
        if (requirementsOrderId == null) return false;
        if (this.requirementsOrderIds == null) return false;
        boolean removed = this.requirementsOrderIds.remove(requirementsOrderId);
        if (removed) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return removed;
    }

    public final boolean removeRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        if (requirementsOrderIds == null) return false;
        if (requirementsOrderIds.isEmpty()) return false;
        if (this.requirementsOrderIds == null) return false;
        boolean removed = false;
        for (java.lang.String _element: requirementsOrderIds) {
            removed = removed | this.requirementsOrderIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return removed;
    }

    public final boolean clearRequirementsOrderIds() {
        if (this.requirementsOrderIds == null) return false;
        if (this.requirementsOrderIds.isEmpty()) return false;
        this.requirementsOrderIds.clear();
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        return true;
    }

    public final String getRequirementsOrderIdsAsCommaSeparatedString() {
        if (this.requirementsOrderIds == null) return null;
        if (this.requirementsOrderIds.isEmpty()) return null;
        return Str.concat(this.requirementsOrderIds,", ");
    }

    public final void setRequirementsOrderIdsAsCommaSeparatedString(String requirementsOrderIds) {
        setRequirementsOrderIds(Str.parseCommaSeparatedString(requirementsOrderIds));
    }
    // -----------------------------------------------------------
    // - urgentIssuesOrderIds
    // -----------------------------------------------------------

    private java.util.List<java.lang.String> urgentIssuesOrderIds = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getUrgentIssuesOrderIds() {
        return new java.util.ArrayList<java.lang.String>(urgentIssuesOrderIds);
    }

    public final void setUrgentIssuesOrderIds(Collection<java.lang.String> urgentIssuesOrderIds) {
        urgentIssuesOrderIds = prepareUrgentIssuesOrderIds(urgentIssuesOrderIds);
        if (urgentIssuesOrderIds == null) urgentIssuesOrderIds = Collections.emptyList();
        if (this.urgentIssuesOrderIds.equals(urgentIssuesOrderIds)) return;
        this.urgentIssuesOrderIds = new java.util.ArrayList<java.lang.String>(urgentIssuesOrderIds);
            updateLastModified();
            fireModified("urgentIssuesOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgentIssuesOrderIds));
    }

    private final void updateUrgentIssuesOrderIds(Collection<java.lang.String> urgentIssuesOrderIds) {
        if (urgentIssuesOrderIds == null) urgentIssuesOrderIds = Collections.emptyList();
        if (this.urgentIssuesOrderIds.equals(urgentIssuesOrderIds)) return;
        this.urgentIssuesOrderIds = new java.util.ArrayList<java.lang.String>(urgentIssuesOrderIds);
            updateLastModified();
            fireModified("urgentIssuesOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgentIssuesOrderIds));
    }

    protected Collection<java.lang.String> prepareUrgentIssuesOrderIds(Collection<java.lang.String> urgentIssuesOrderIds) {
        return urgentIssuesOrderIds;
    }

    public final boolean containsUrgentIssuesOrderId(java.lang.String urgentIssuesOrderId) {
        if (urgentIssuesOrderId == null) return false;
        if (this.urgentIssuesOrderIds == null) return false;
        return this.urgentIssuesOrderIds.contains(urgentIssuesOrderId);
    }

    public final int getUrgentIssuesOrderIdsCount() {
        if (this.urgentIssuesOrderIds == null) return 0;
        return this.urgentIssuesOrderIds.size();
    }

    public final boolean isUrgentIssuesOrderIdsEmpty() {
        if (this.urgentIssuesOrderIds == null) return true;
        return this.urgentIssuesOrderIds.isEmpty();
    }

    public final boolean addUrgentIssuesOrderId(java.lang.String urgentIssuesOrderId) {
        if (urgentIssuesOrderId == null) throw new IllegalArgumentException("urgentIssuesOrderId == null");
        if (this.urgentIssuesOrderIds == null) this.urgentIssuesOrderIds = new java.util.ArrayList<java.lang.String>();
        boolean added = this.urgentIssuesOrderIds.add(urgentIssuesOrderId);
        if (added) {
            updateLastModified();
            fireModified("urgentIssuesOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgentIssuesOrderIds));
        }
        return added;
    }

    public final boolean addUrgentIssuesOrderIds(Collection<java.lang.String> urgentIssuesOrderIds) {
        if (urgentIssuesOrderIds == null) throw new IllegalArgumentException("urgentIssuesOrderIds == null");
        if (this.urgentIssuesOrderIds == null) this.urgentIssuesOrderIds = new java.util.ArrayList<java.lang.String>();
        boolean added = false;
        for (java.lang.String urgentIssuesOrderId : urgentIssuesOrderIds) {
            added = added | this.urgentIssuesOrderIds.add(urgentIssuesOrderId);
        }
        if (added) {
            updateLastModified();
            fireModified("urgentIssuesOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgentIssuesOrderIds));
        }
        return added;
    }

    public final boolean removeUrgentIssuesOrderId(java.lang.String urgentIssuesOrderId) {
        if (urgentIssuesOrderId == null) return false;
        if (this.urgentIssuesOrderIds == null) return false;
        boolean removed = this.urgentIssuesOrderIds.remove(urgentIssuesOrderId);
        if (removed) {
            updateLastModified();
            fireModified("urgentIssuesOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgentIssuesOrderIds));
        }
        return removed;
    }

    public final boolean removeUrgentIssuesOrderIds(Collection<java.lang.String> urgentIssuesOrderIds) {
        if (urgentIssuesOrderIds == null) return false;
        if (urgentIssuesOrderIds.isEmpty()) return false;
        if (this.urgentIssuesOrderIds == null) return false;
        boolean removed = false;
        for (java.lang.String _element: urgentIssuesOrderIds) {
            removed = removed | this.urgentIssuesOrderIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("urgentIssuesOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgentIssuesOrderIds));
        }
        return removed;
    }

    public final boolean clearUrgentIssuesOrderIds() {
        if (this.urgentIssuesOrderIds == null) return false;
        if (this.urgentIssuesOrderIds.isEmpty()) return false;
        this.urgentIssuesOrderIds.clear();
            updateLastModified();
            fireModified("urgentIssuesOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgentIssuesOrderIds));
        return true;
    }

    public final String getUrgentIssuesOrderIdsAsCommaSeparatedString() {
        if (this.urgentIssuesOrderIds == null) return null;
        if (this.urgentIssuesOrderIds.isEmpty()) return null;
        return Str.concat(this.urgentIssuesOrderIds,", ");
    }

    public final void setUrgentIssuesOrderIdsAsCommaSeparatedString(String urgentIssuesOrderIds) {
        setUrgentIssuesOrderIds(Str.parseCommaSeparatedString(urgentIssuesOrderIds));
    }
    // -----------------------------------------------------------
    // - lastSprintNumber
    // -----------------------------------------------------------

    private int lastSprintNumber;

    public final int getLastSprintNumber() {
        return lastSprintNumber;
    }

    public final void setLastSprintNumber(int lastSprintNumber) {
        lastSprintNumber = prepareLastSprintNumber(lastSprintNumber);
        if (isLastSprintNumber(lastSprintNumber)) return;
        this.lastSprintNumber = lastSprintNumber;
            updateLastModified();
            fireModified("lastSprintNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastSprintNumber));
    }

    private final void updateLastSprintNumber(int lastSprintNumber) {
        if (isLastSprintNumber(lastSprintNumber)) return;
        this.lastSprintNumber = lastSprintNumber;
            updateLastModified();
            fireModified("lastSprintNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastSprintNumber));
    }

    protected int prepareLastSprintNumber(int lastSprintNumber) {
        return lastSprintNumber;
    }

    public final boolean isLastSprintNumber(int lastSprintNumber) {
        return this.lastSprintNumber == lastSprintNumber;
    }

    protected final void updateLastSprintNumber(Object value) {
        setLastSprintNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastTaskNumber
    // -----------------------------------------------------------

    private int lastTaskNumber;

    public final int getLastTaskNumber() {
        return lastTaskNumber;
    }

    public final void setLastTaskNumber(int lastTaskNumber) {
        lastTaskNumber = prepareLastTaskNumber(lastTaskNumber);
        if (isLastTaskNumber(lastTaskNumber)) return;
        this.lastTaskNumber = lastTaskNumber;
            updateLastModified();
            fireModified("lastTaskNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastTaskNumber));
    }

    private final void updateLastTaskNumber(int lastTaskNumber) {
        if (isLastTaskNumber(lastTaskNumber)) return;
        this.lastTaskNumber = lastTaskNumber;
            updateLastModified();
            fireModified("lastTaskNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastTaskNumber));
    }

    protected int prepareLastTaskNumber(int lastTaskNumber) {
        return lastTaskNumber;
    }

    public final boolean isLastTaskNumber(int lastTaskNumber) {
        return this.lastTaskNumber == lastTaskNumber;
    }

    protected final void updateLastTaskNumber(Object value) {
        setLastTaskNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastRequirementNumber
    // -----------------------------------------------------------

    private int lastRequirementNumber;

    public final int getLastRequirementNumber() {
        return lastRequirementNumber;
    }

    public final void setLastRequirementNumber(int lastRequirementNumber) {
        lastRequirementNumber = prepareLastRequirementNumber(lastRequirementNumber);
        if (isLastRequirementNumber(lastRequirementNumber)) return;
        this.lastRequirementNumber = lastRequirementNumber;
            updateLastModified();
            fireModified("lastRequirementNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastRequirementNumber));
    }

    private final void updateLastRequirementNumber(int lastRequirementNumber) {
        if (isLastRequirementNumber(lastRequirementNumber)) return;
        this.lastRequirementNumber = lastRequirementNumber;
            updateLastModified();
            fireModified("lastRequirementNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastRequirementNumber));
    }

    protected int prepareLastRequirementNumber(int lastRequirementNumber) {
        return lastRequirementNumber;
    }

    public final boolean isLastRequirementNumber(int lastRequirementNumber) {
        return this.lastRequirementNumber == lastRequirementNumber;
    }

    protected final void updateLastRequirementNumber(Object value) {
        setLastRequirementNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastQualityNumber
    // -----------------------------------------------------------

    private int lastQualityNumber;

    public final int getLastQualityNumber() {
        return lastQualityNumber;
    }

    public final void setLastQualityNumber(int lastQualityNumber) {
        lastQualityNumber = prepareLastQualityNumber(lastQualityNumber);
        if (isLastQualityNumber(lastQualityNumber)) return;
        this.lastQualityNumber = lastQualityNumber;
            updateLastModified();
            fireModified("lastQualityNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastQualityNumber));
    }

    private final void updateLastQualityNumber(int lastQualityNumber) {
        if (isLastQualityNumber(lastQualityNumber)) return;
        this.lastQualityNumber = lastQualityNumber;
            updateLastModified();
            fireModified("lastQualityNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastQualityNumber));
    }

    protected int prepareLastQualityNumber(int lastQualityNumber) {
        return lastQualityNumber;
    }

    public final boolean isLastQualityNumber(int lastQualityNumber) {
        return this.lastQualityNumber == lastQualityNumber;
    }

    protected final void updateLastQualityNumber(Object value) {
        setLastQualityNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastRiskNumber
    // -----------------------------------------------------------

    private int lastRiskNumber;

    public final int getLastRiskNumber() {
        return lastRiskNumber;
    }

    public final void setLastRiskNumber(int lastRiskNumber) {
        lastRiskNumber = prepareLastRiskNumber(lastRiskNumber);
        if (isLastRiskNumber(lastRiskNumber)) return;
        this.lastRiskNumber = lastRiskNumber;
            updateLastModified();
            fireModified("lastRiskNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastRiskNumber));
    }

    private final void updateLastRiskNumber(int lastRiskNumber) {
        if (isLastRiskNumber(lastRiskNumber)) return;
        this.lastRiskNumber = lastRiskNumber;
            updateLastModified();
            fireModified("lastRiskNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastRiskNumber));
    }

    protected int prepareLastRiskNumber(int lastRiskNumber) {
        return lastRiskNumber;
    }

    public final boolean isLastRiskNumber(int lastRiskNumber) {
        return this.lastRiskNumber == lastRiskNumber;
    }

    protected final void updateLastRiskNumber(Object value) {
        setLastRiskNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastIssueNumber
    // -----------------------------------------------------------

    private int lastIssueNumber;

    public final int getLastIssueNumber() {
        return lastIssueNumber;
    }

    public final void setLastIssueNumber(int lastIssueNumber) {
        lastIssueNumber = prepareLastIssueNumber(lastIssueNumber);
        if (isLastIssueNumber(lastIssueNumber)) return;
        this.lastIssueNumber = lastIssueNumber;
            updateLastModified();
            fireModified("lastIssueNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastIssueNumber));
    }

    private final void updateLastIssueNumber(int lastIssueNumber) {
        if (isLastIssueNumber(lastIssueNumber)) return;
        this.lastIssueNumber = lastIssueNumber;
            updateLastModified();
            fireModified("lastIssueNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastIssueNumber));
    }

    protected int prepareLastIssueNumber(int lastIssueNumber) {
        return lastIssueNumber;
    }

    public final boolean isLastIssueNumber(int lastIssueNumber) {
        return this.lastIssueNumber == lastIssueNumber;
    }

    protected final void updateLastIssueNumber(Object value) {
        setLastIssueNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastImpedimentNumber
    // -----------------------------------------------------------

    private int lastImpedimentNumber;

    public final int getLastImpedimentNumber() {
        return lastImpedimentNumber;
    }

    public final void setLastImpedimentNumber(int lastImpedimentNumber) {
        lastImpedimentNumber = prepareLastImpedimentNumber(lastImpedimentNumber);
        if (isLastImpedimentNumber(lastImpedimentNumber)) return;
        this.lastImpedimentNumber = lastImpedimentNumber;
            updateLastModified();
            fireModified("lastImpedimentNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastImpedimentNumber));
    }

    private final void updateLastImpedimentNumber(int lastImpedimentNumber) {
        if (isLastImpedimentNumber(lastImpedimentNumber)) return;
        this.lastImpedimentNumber = lastImpedimentNumber;
            updateLastModified();
            fireModified("lastImpedimentNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastImpedimentNumber));
    }

    protected int prepareLastImpedimentNumber(int lastImpedimentNumber) {
        return lastImpedimentNumber;
    }

    public final boolean isLastImpedimentNumber(int lastImpedimentNumber) {
        return this.lastImpedimentNumber == lastImpedimentNumber;
    }

    protected final void updateLastImpedimentNumber(Object value) {
        setLastImpedimentNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastFileNumber
    // -----------------------------------------------------------

    private int lastFileNumber;

    public final int getLastFileNumber() {
        return lastFileNumber;
    }

    public final void setLastFileNumber(int lastFileNumber) {
        lastFileNumber = prepareLastFileNumber(lastFileNumber);
        if (isLastFileNumber(lastFileNumber)) return;
        this.lastFileNumber = lastFileNumber;
            updateLastModified();
            fireModified("lastFileNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastFileNumber));
    }

    private final void updateLastFileNumber(int lastFileNumber) {
        if (isLastFileNumber(lastFileNumber)) return;
        this.lastFileNumber = lastFileNumber;
            updateLastModified();
            fireModified("lastFileNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastFileNumber));
    }

    protected int prepareLastFileNumber(int lastFileNumber) {
        return lastFileNumber;
    }

    public final boolean isLastFileNumber(int lastFileNumber) {
        return this.lastFileNumber == lastFileNumber;
    }

    protected final void updateLastFileNumber(Object value) {
        setLastFileNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastSubjectNumber
    // -----------------------------------------------------------

    private int lastSubjectNumber;

    public final int getLastSubjectNumber() {
        return lastSubjectNumber;
    }

    public final void setLastSubjectNumber(int lastSubjectNumber) {
        lastSubjectNumber = prepareLastSubjectNumber(lastSubjectNumber);
        if (isLastSubjectNumber(lastSubjectNumber)) return;
        this.lastSubjectNumber = lastSubjectNumber;
            updateLastModified();
            fireModified("lastSubjectNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastSubjectNumber));
    }

    private final void updateLastSubjectNumber(int lastSubjectNumber) {
        if (isLastSubjectNumber(lastSubjectNumber)) return;
        this.lastSubjectNumber = lastSubjectNumber;
            updateLastModified();
            fireModified("lastSubjectNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastSubjectNumber));
    }

    protected int prepareLastSubjectNumber(int lastSubjectNumber) {
        return lastSubjectNumber;
    }

    public final boolean isLastSubjectNumber(int lastSubjectNumber) {
        return this.lastSubjectNumber == lastSubjectNumber;
    }

    protected final void updateLastSubjectNumber(Object value) {
        setLastSubjectNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastEventNumber
    // -----------------------------------------------------------

    private int lastEventNumber;

    public final int getLastEventNumber() {
        return lastEventNumber;
    }

    public final void setLastEventNumber(int lastEventNumber) {
        lastEventNumber = prepareLastEventNumber(lastEventNumber);
        if (isLastEventNumber(lastEventNumber)) return;
        this.lastEventNumber = lastEventNumber;
            updateLastModified();
            fireModified("lastEventNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastEventNumber));
    }

    private final void updateLastEventNumber(int lastEventNumber) {
        if (isLastEventNumber(lastEventNumber)) return;
        this.lastEventNumber = lastEventNumber;
            updateLastModified();
            fireModified("lastEventNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastEventNumber));
    }

    protected int prepareLastEventNumber(int lastEventNumber) {
        return lastEventNumber;
    }

    public final boolean isLastEventNumber(int lastEventNumber) {
        return this.lastEventNumber == lastEventNumber;
    }

    protected final void updateLastEventNumber(Object value) {
        setLastEventNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastReleaseNumber
    // -----------------------------------------------------------

    private int lastReleaseNumber;

    public final int getLastReleaseNumber() {
        return lastReleaseNumber;
    }

    public final void setLastReleaseNumber(int lastReleaseNumber) {
        lastReleaseNumber = prepareLastReleaseNumber(lastReleaseNumber);
        if (isLastReleaseNumber(lastReleaseNumber)) return;
        this.lastReleaseNumber = lastReleaseNumber;
            updateLastModified();
            fireModified("lastReleaseNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastReleaseNumber));
    }

    private final void updateLastReleaseNumber(int lastReleaseNumber) {
        if (isLastReleaseNumber(lastReleaseNumber)) return;
        this.lastReleaseNumber = lastReleaseNumber;
            updateLastModified();
            fireModified("lastReleaseNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastReleaseNumber));
    }

    protected int prepareLastReleaseNumber(int lastReleaseNumber) {
        return lastReleaseNumber;
    }

    public final boolean isLastReleaseNumber(int lastReleaseNumber) {
        return this.lastReleaseNumber == lastReleaseNumber;
    }

    protected final void updateLastReleaseNumber(Object value) {
        setLastReleaseNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - lastBlogEntryNumber
    // -----------------------------------------------------------

    private int lastBlogEntryNumber;

    public final int getLastBlogEntryNumber() {
        return lastBlogEntryNumber;
    }

    public final void setLastBlogEntryNumber(int lastBlogEntryNumber) {
        lastBlogEntryNumber = prepareLastBlogEntryNumber(lastBlogEntryNumber);
        if (isLastBlogEntryNumber(lastBlogEntryNumber)) return;
        this.lastBlogEntryNumber = lastBlogEntryNumber;
            updateLastModified();
            fireModified("lastBlogEntryNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastBlogEntryNumber));
    }

    private final void updateLastBlogEntryNumber(int lastBlogEntryNumber) {
        if (isLastBlogEntryNumber(lastBlogEntryNumber)) return;
        this.lastBlogEntryNumber = lastBlogEntryNumber;
            updateLastModified();
            fireModified("lastBlogEntryNumber", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastBlogEntryNumber));
    }

    protected int prepareLastBlogEntryNumber(int lastBlogEntryNumber) {
        return lastBlogEntryNumber;
    }

    public final boolean isLastBlogEntryNumber(int lastBlogEntryNumber) {
        return this.lastBlogEntryNumber == lastBlogEntryNumber;
    }

    protected final void updateLastBlogEntryNumber(Object value) {
        setLastBlogEntryNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - punishmentUnit
    // -----------------------------------------------------------

    private java.lang.String punishmentUnit;

    public final java.lang.String getPunishmentUnit() {
        return punishmentUnit;
    }

    public final void setPunishmentUnit(java.lang.String punishmentUnit) {
        punishmentUnit = preparePunishmentUnit(punishmentUnit);
        if (isPunishmentUnit(punishmentUnit)) return;
        this.punishmentUnit = punishmentUnit;
            updateLastModified();
            fireModified("punishmentUnit", ilarkesto.core.persistance.Persistence.propertyAsString(this.punishmentUnit));
    }

    private final void updatePunishmentUnit(java.lang.String punishmentUnit) {
        if (isPunishmentUnit(punishmentUnit)) return;
        this.punishmentUnit = punishmentUnit;
            updateLastModified();
            fireModified("punishmentUnit", ilarkesto.core.persistance.Persistence.propertyAsString(this.punishmentUnit));
    }

    protected java.lang.String preparePunishmentUnit(java.lang.String punishmentUnit) {
         punishmentUnit = Str.removeControlChars(punishmentUnit);
        return punishmentUnit;
    }

    public final boolean isPunishmentUnitSet() {
        return this.punishmentUnit != null;
    }

    public final boolean isPunishmentUnit(java.lang.String punishmentUnit) {
        if (this.punishmentUnit == null && punishmentUnit == null) return true;
        return this.punishmentUnit != null && this.punishmentUnit.equals(punishmentUnit);
    }

    protected final void updatePunishmentUnit(Object value) {
        setPunishmentUnit((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - punishmentFactor
    // -----------------------------------------------------------

    private int punishmentFactor;

    public final int getPunishmentFactor() {
        return punishmentFactor;
    }

    public final void setPunishmentFactor(int punishmentFactor) {
        punishmentFactor = preparePunishmentFactor(punishmentFactor);
        if (isPunishmentFactor(punishmentFactor)) return;
        this.punishmentFactor = punishmentFactor;
            updateLastModified();
            fireModified("punishmentFactor", ilarkesto.core.persistance.Persistence.propertyAsString(this.punishmentFactor));
    }

    private final void updatePunishmentFactor(int punishmentFactor) {
        if (isPunishmentFactor(punishmentFactor)) return;
        this.punishmentFactor = punishmentFactor;
            updateLastModified();
            fireModified("punishmentFactor", ilarkesto.core.persistance.Persistence.propertyAsString(this.punishmentFactor));
    }

    protected int preparePunishmentFactor(int punishmentFactor) {
        return punishmentFactor;
    }

    public final boolean isPunishmentFactor(int punishmentFactor) {
        return this.punishmentFactor == punishmentFactor;
    }

    protected final void updatePunishmentFactor(Object value) {
        setPunishmentFactor((Integer)value);
    }
    // -----------------------------------------------------------
    // - homepageDir
    // -----------------------------------------------------------

    private java.lang.String homepageDir;

    public final java.lang.String getHomepageDir() {
        return homepageDir;
    }

    public final void setHomepageDir(java.lang.String homepageDir) {
        homepageDir = prepareHomepageDir(homepageDir);
        if (isHomepageDir(homepageDir)) return;
        this.homepageDir = homepageDir;
            updateLastModified();
            fireModified("homepageDir", ilarkesto.core.persistance.Persistence.propertyAsString(this.homepageDir));
    }

    private final void updateHomepageDir(java.lang.String homepageDir) {
        if (isHomepageDir(homepageDir)) return;
        this.homepageDir = homepageDir;
            updateLastModified();
            fireModified("homepageDir", ilarkesto.core.persistance.Persistence.propertyAsString(this.homepageDir));
    }

    protected java.lang.String prepareHomepageDir(java.lang.String homepageDir) {
         homepageDir = Str.removeControlChars(homepageDir);
        return homepageDir;
    }

    public final boolean isHomepageDirSet() {
        return this.homepageDir != null;
    }

    public final boolean isHomepageDir(java.lang.String homepageDir) {
        if (this.homepageDir == null && homepageDir == null) return true;
        return this.homepageDir != null && this.homepageDir.equals(homepageDir);
    }

    protected final void updateHomepageDir(Object value) {
        setHomepageDir((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - homepageUrl
    // -----------------------------------------------------------

    private java.lang.String homepageUrl;

    public final java.lang.String getHomepageUrl() {
        return homepageUrl;
    }

    public final void setHomepageUrl(java.lang.String homepageUrl) {
        homepageUrl = prepareHomepageUrl(homepageUrl);
        if (isHomepageUrl(homepageUrl)) return;
        this.homepageUrl = homepageUrl;
            updateLastModified();
            fireModified("homepageUrl", ilarkesto.core.persistance.Persistence.propertyAsString(this.homepageUrl));
    }

    private final void updateHomepageUrl(java.lang.String homepageUrl) {
        if (isHomepageUrl(homepageUrl)) return;
        this.homepageUrl = homepageUrl;
            updateLastModified();
            fireModified("homepageUrl", ilarkesto.core.persistance.Persistence.propertyAsString(this.homepageUrl));
    }

    protected java.lang.String prepareHomepageUrl(java.lang.String homepageUrl) {
         homepageUrl = Str.removeControlChars(homepageUrl);
        return homepageUrl;
    }

    public final boolean isHomepageUrlSet() {
        return this.homepageUrl != null;
    }

    public final boolean isHomepageUrl(java.lang.String homepageUrl) {
        if (this.homepageUrl == null && homepageUrl == null) return true;
        return this.homepageUrl != null && this.homepageUrl.equals(homepageUrl);
    }

    protected final void updateHomepageUrl(Object value) {
        setHomepageUrl((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - autoUpdateHomepage
    // -----------------------------------------------------------

    private boolean autoUpdateHomepage;

    public final boolean isAutoUpdateHomepage() {
        return autoUpdateHomepage;
    }

    public final void setAutoUpdateHomepage(boolean autoUpdateHomepage) {
        autoUpdateHomepage = prepareAutoUpdateHomepage(autoUpdateHomepage);
        if (isAutoUpdateHomepage(autoUpdateHomepage)) return;
        this.autoUpdateHomepage = autoUpdateHomepage;
            updateLastModified();
            fireModified("autoUpdateHomepage", ilarkesto.core.persistance.Persistence.propertyAsString(this.autoUpdateHomepage));
    }

    private final void updateAutoUpdateHomepage(boolean autoUpdateHomepage) {
        if (isAutoUpdateHomepage(autoUpdateHomepage)) return;
        this.autoUpdateHomepage = autoUpdateHomepage;
            updateLastModified();
            fireModified("autoUpdateHomepage", ilarkesto.core.persistance.Persistence.propertyAsString(this.autoUpdateHomepage));
    }

    protected boolean prepareAutoUpdateHomepage(boolean autoUpdateHomepage) {
        return autoUpdateHomepage;
    }

    public final boolean isAutoUpdateHomepage(boolean autoUpdateHomepage) {
        return this.autoUpdateHomepage == autoUpdateHomepage;
    }

    protected final void updateAutoUpdateHomepage(Object value) {
        setAutoUpdateHomepage((Boolean)value);
    }
    // -----------------------------------------------------------
    // - releaseScriptPath
    // -----------------------------------------------------------

    private java.lang.String releaseScriptPath;

    public final java.lang.String getReleaseScriptPath() {
        return releaseScriptPath;
    }

    public final void setReleaseScriptPath(java.lang.String releaseScriptPath) {
        releaseScriptPath = prepareReleaseScriptPath(releaseScriptPath);
        if (isReleaseScriptPath(releaseScriptPath)) return;
        this.releaseScriptPath = releaseScriptPath;
            updateLastModified();
            fireModified("releaseScriptPath", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseScriptPath));
    }

    private final void updateReleaseScriptPath(java.lang.String releaseScriptPath) {
        if (isReleaseScriptPath(releaseScriptPath)) return;
        this.releaseScriptPath = releaseScriptPath;
            updateLastModified();
            fireModified("releaseScriptPath", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseScriptPath));
    }

    protected java.lang.String prepareReleaseScriptPath(java.lang.String releaseScriptPath) {
         releaseScriptPath = Str.removeControlChars(releaseScriptPath);
        return releaseScriptPath;
    }

    public final boolean isReleaseScriptPathSet() {
        return this.releaseScriptPath != null;
    }

    public final boolean isReleaseScriptPath(java.lang.String releaseScriptPath) {
        if (this.releaseScriptPath == null && releaseScriptPath == null) return true;
        return this.releaseScriptPath != null && this.releaseScriptPath.equals(releaseScriptPath);
    }

    protected final void updateReleaseScriptPath(Object value) {
        setReleaseScriptPath((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - supportEmail
    // -----------------------------------------------------------

    private java.lang.String supportEmail;

    public final java.lang.String getSupportEmail() {
        return supportEmail;
    }

    public final void setSupportEmail(java.lang.String supportEmail) {
        supportEmail = prepareSupportEmail(supportEmail);
        if (isSupportEmail(supportEmail)) return;
        this.supportEmail = supportEmail;
            updateLastModified();
            fireModified("supportEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.supportEmail));
    }

    private final void updateSupportEmail(java.lang.String supportEmail) {
        if (isSupportEmail(supportEmail)) return;
        this.supportEmail = supportEmail;
            updateLastModified();
            fireModified("supportEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.supportEmail));
    }

    protected java.lang.String prepareSupportEmail(java.lang.String supportEmail) {
         supportEmail = Str.removeControlChars(supportEmail);
        return supportEmail;
    }

    public final boolean isSupportEmailSet() {
        return this.supportEmail != null;
    }

    public final boolean isSupportEmail(java.lang.String supportEmail) {
        if (this.supportEmail == null && supportEmail == null) return true;
        return this.supportEmail != null && this.supportEmail.equals(supportEmail);
    }

    protected final void updateSupportEmail(Object value) {
        setSupportEmail((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - issueReplyTemplate
    // -----------------------------------------------------------

    private java.lang.String issueReplyTemplate;

    public final java.lang.String getIssueReplyTemplate() {
        return issueReplyTemplate;
    }

    public final void setIssueReplyTemplate(java.lang.String issueReplyTemplate) {
        issueReplyTemplate = prepareIssueReplyTemplate(issueReplyTemplate);
        if (isIssueReplyTemplate(issueReplyTemplate)) return;
        this.issueReplyTemplate = issueReplyTemplate;
            updateLastModified();
            fireModified("issueReplyTemplate", ilarkesto.core.persistance.Persistence.propertyAsString(this.issueReplyTemplate));
    }

    private final void updateIssueReplyTemplate(java.lang.String issueReplyTemplate) {
        if (isIssueReplyTemplate(issueReplyTemplate)) return;
        this.issueReplyTemplate = issueReplyTemplate;
            updateLastModified();
            fireModified("issueReplyTemplate", ilarkesto.core.persistance.Persistence.propertyAsString(this.issueReplyTemplate));
    }

    protected java.lang.String prepareIssueReplyTemplate(java.lang.String issueReplyTemplate) {
         issueReplyTemplate = Str.removeControlChars(issueReplyTemplate);
        return issueReplyTemplate;
    }

    public final boolean isIssueReplyTemplateSet() {
        return this.issueReplyTemplate != null;
    }

    public final boolean isIssueReplyTemplate(java.lang.String issueReplyTemplate) {
        if (this.issueReplyTemplate == null && issueReplyTemplate == null) return true;
        return this.issueReplyTemplate != null && this.issueReplyTemplate.equals(issueReplyTemplate);
    }

    protected final void updateIssueReplyTemplate(Object value) {
        setIssueReplyTemplate((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - subscriberNotificationTemplate
    // -----------------------------------------------------------

    private java.lang.String subscriberNotificationTemplate;

    public final java.lang.String getSubscriberNotificationTemplate() {
        return subscriberNotificationTemplate;
    }

    public final void setSubscriberNotificationTemplate(java.lang.String subscriberNotificationTemplate) {
        subscriberNotificationTemplate = prepareSubscriberNotificationTemplate(subscriberNotificationTemplate);
        if (isSubscriberNotificationTemplate(subscriberNotificationTemplate)) return;
        this.subscriberNotificationTemplate = subscriberNotificationTemplate;
            updateLastModified();
            fireModified("subscriberNotificationTemplate", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscriberNotificationTemplate));
    }

    private final void updateSubscriberNotificationTemplate(java.lang.String subscriberNotificationTemplate) {
        if (isSubscriberNotificationTemplate(subscriberNotificationTemplate)) return;
        this.subscriberNotificationTemplate = subscriberNotificationTemplate;
            updateLastModified();
            fireModified("subscriberNotificationTemplate", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscriberNotificationTemplate));
    }

    protected java.lang.String prepareSubscriberNotificationTemplate(java.lang.String subscriberNotificationTemplate) {
         subscriberNotificationTemplate = Str.removeControlChars(subscriberNotificationTemplate);
        return subscriberNotificationTemplate;
    }

    public final boolean isSubscriberNotificationTemplateSet() {
        return this.subscriberNotificationTemplate != null;
    }

    public final boolean isSubscriberNotificationTemplate(java.lang.String subscriberNotificationTemplate) {
        if (this.subscriberNotificationTemplate == null && subscriberNotificationTemplate == null) return true;
        return this.subscriberNotificationTemplate != null && this.subscriberNotificationTemplate.equals(subscriberNotificationTemplate);
    }

    protected final void updateSubscriberNotificationTemplate(Object value) {
        setSubscriberNotificationTemplate((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - lastOpenedDateAndTime
    // -----------------------------------------------------------

    private ilarkesto.core.time.DateAndTime lastOpenedDateAndTime;

    public final ilarkesto.core.time.DateAndTime getLastOpenedDateAndTime() {
        return lastOpenedDateAndTime;
    }

    public final void setLastOpenedDateAndTime(ilarkesto.core.time.DateAndTime lastOpenedDateAndTime) {
        lastOpenedDateAndTime = prepareLastOpenedDateAndTime(lastOpenedDateAndTime);
        if (isLastOpenedDateAndTime(lastOpenedDateAndTime)) return;
        this.lastOpenedDateAndTime = lastOpenedDateAndTime;
            updateLastModified();
            fireModified("lastOpenedDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastOpenedDateAndTime));
    }

    private final void updateLastOpenedDateAndTime(ilarkesto.core.time.DateAndTime lastOpenedDateAndTime) {
        if (isLastOpenedDateAndTime(lastOpenedDateAndTime)) return;
        this.lastOpenedDateAndTime = lastOpenedDateAndTime;
            updateLastModified();
            fireModified("lastOpenedDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastOpenedDateAndTime));
    }

    protected ilarkesto.core.time.DateAndTime prepareLastOpenedDateAndTime(ilarkesto.core.time.DateAndTime lastOpenedDateAndTime) {
        return lastOpenedDateAndTime;
    }

    public final boolean isLastOpenedDateAndTimeSet() {
        return this.lastOpenedDateAndTime != null;
    }

    public final boolean isLastOpenedDateAndTime(ilarkesto.core.time.DateAndTime lastOpenedDateAndTime) {
        if (this.lastOpenedDateAndTime == null && lastOpenedDateAndTime == null) return true;
        return this.lastOpenedDateAndTime != null && this.lastOpenedDateAndTime.equals(lastOpenedDateAndTime);
    }

    protected final void updateLastOpenedDateAndTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.DateAndTime((String)value);
        setLastOpenedDateAndTime((ilarkesto.core.time.DateAndTime)value);
    }
    // -----------------------------------------------------------
    // - freeDays
    // -----------------------------------------------------------

    private int freeDays;

    public final int getFreeDays() {
        return freeDays;
    }

    public final void setFreeDays(int freeDays) {
        freeDays = prepareFreeDays(freeDays);
        if (isFreeDays(freeDays)) return;
        this.freeDays = freeDays;
            updateLastModified();
            fireModified("freeDays", ilarkesto.core.persistance.Persistence.propertyAsString(this.freeDays));
    }

    private final void updateFreeDays(int freeDays) {
        if (isFreeDays(freeDays)) return;
        this.freeDays = freeDays;
            updateLastModified();
            fireModified("freeDays", ilarkesto.core.persistance.Persistence.propertyAsString(this.freeDays));
    }

    protected int prepareFreeDays(int freeDays) {
        return freeDays;
    }

    public final boolean isFreeDays(int freeDays) {
        return this.freeDays == freeDays;
    }

    protected final void updateFreeDays(Object value) {
        setFreeDays((Integer)value);
    }
    // -----------------------------------------------------------
    // - autoCreateTasksFromQualities
    // -----------------------------------------------------------

    private boolean autoCreateTasksFromQualities;

    public final boolean isAutoCreateTasksFromQualities() {
        return autoCreateTasksFromQualities;
    }

    public final void setAutoCreateTasksFromQualities(boolean autoCreateTasksFromQualities) {
        autoCreateTasksFromQualities = prepareAutoCreateTasksFromQualities(autoCreateTasksFromQualities);
        if (isAutoCreateTasksFromQualities(autoCreateTasksFromQualities)) return;
        this.autoCreateTasksFromQualities = autoCreateTasksFromQualities;
            updateLastModified();
            fireModified("autoCreateTasksFromQualities", ilarkesto.core.persistance.Persistence.propertyAsString(this.autoCreateTasksFromQualities));
    }

    private final void updateAutoCreateTasksFromQualities(boolean autoCreateTasksFromQualities) {
        if (isAutoCreateTasksFromQualities(autoCreateTasksFromQualities)) return;
        this.autoCreateTasksFromQualities = autoCreateTasksFromQualities;
            updateLastModified();
            fireModified("autoCreateTasksFromQualities", ilarkesto.core.persistance.Persistence.propertyAsString(this.autoCreateTasksFromQualities));
    }

    protected boolean prepareAutoCreateTasksFromQualities(boolean autoCreateTasksFromQualities) {
        return autoCreateTasksFromQualities;
    }

    public final boolean isAutoCreateTasksFromQualities(boolean autoCreateTasksFromQualities) {
        return this.autoCreateTasksFromQualities == autoCreateTasksFromQualities;
    }

    protected final void updateAutoCreateTasksFromQualities(Object value) {
        setAutoCreateTasksFromQualities((Boolean)value);
    }
    // -----------------------------------------------------------
    // - releasingInfo
    // -----------------------------------------------------------

    private java.lang.String releasingInfo;

    public final java.lang.String getReleasingInfo() {
        return releasingInfo;
    }

    public final void setReleasingInfo(java.lang.String releasingInfo) {
        releasingInfo = prepareReleasingInfo(releasingInfo);
        if (isReleasingInfo(releasingInfo)) return;
        this.releasingInfo = releasingInfo;
            updateLastModified();
            fireModified("releasingInfo", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasingInfo));
    }

    private final void updateReleasingInfo(java.lang.String releasingInfo) {
        if (isReleasingInfo(releasingInfo)) return;
        this.releasingInfo = releasingInfo;
            updateLastModified();
            fireModified("releasingInfo", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasingInfo));
    }

    protected java.lang.String prepareReleasingInfo(java.lang.String releasingInfo) {
         releasingInfo = Str.removeControlChars(releasingInfo);
        return releasingInfo;
    }

    public final boolean isReleasingInfoSet() {
        return this.releasingInfo != null;
    }

    public final boolean isReleasingInfo(java.lang.String releasingInfo) {
        if (this.releasingInfo == null && releasingInfo == null) return true;
        return this.releasingInfo != null && this.releasingInfo.equals(releasingInfo);
    }

    protected final void updateReleasingInfo(Object value) {
        setReleasingInfo((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - externalTrackerUrlTemplate
    // -----------------------------------------------------------

    private java.lang.String externalTrackerUrlTemplate;

    public final java.lang.String getExternalTrackerUrlTemplate() {
        return externalTrackerUrlTemplate;
    }

    public final void setExternalTrackerUrlTemplate(java.lang.String externalTrackerUrlTemplate) {
        externalTrackerUrlTemplate = prepareExternalTrackerUrlTemplate(externalTrackerUrlTemplate);
        if (isExternalTrackerUrlTemplate(externalTrackerUrlTemplate)) return;
        this.externalTrackerUrlTemplate = externalTrackerUrlTemplate;
            updateLastModified();
            fireModified("externalTrackerUrlTemplate", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerUrlTemplate));
    }

    private final void updateExternalTrackerUrlTemplate(java.lang.String externalTrackerUrlTemplate) {
        if (isExternalTrackerUrlTemplate(externalTrackerUrlTemplate)) return;
        this.externalTrackerUrlTemplate = externalTrackerUrlTemplate;
            updateLastModified();
            fireModified("externalTrackerUrlTemplate", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerUrlTemplate));
    }

    protected java.lang.String prepareExternalTrackerUrlTemplate(java.lang.String externalTrackerUrlTemplate) {
         externalTrackerUrlTemplate = Str.removeControlChars(externalTrackerUrlTemplate);
        return externalTrackerUrlTemplate;
    }

    public final boolean isExternalTrackerUrlTemplateSet() {
        return this.externalTrackerUrlTemplate != null;
    }

    public final boolean isExternalTrackerUrlTemplate(java.lang.String externalTrackerUrlTemplate) {
        if (this.externalTrackerUrlTemplate == null && externalTrackerUrlTemplate == null) return true;
        return this.externalTrackerUrlTemplate != null && this.externalTrackerUrlTemplate.equals(externalTrackerUrlTemplate);
    }

    protected final void updateExternalTrackerUrlTemplate(Object value) {
        setExternalTrackerUrlTemplate((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - externalTrackerLabel
    // -----------------------------------------------------------

    private java.lang.String externalTrackerLabel;

    public final java.lang.String getExternalTrackerLabel() {
        return externalTrackerLabel;
    }

    public final void setExternalTrackerLabel(java.lang.String externalTrackerLabel) {
        externalTrackerLabel = prepareExternalTrackerLabel(externalTrackerLabel);
        if (isExternalTrackerLabel(externalTrackerLabel)) return;
        this.externalTrackerLabel = externalTrackerLabel;
            updateLastModified();
            fireModified("externalTrackerLabel", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerLabel));
    }

    private final void updateExternalTrackerLabel(java.lang.String externalTrackerLabel) {
        if (isExternalTrackerLabel(externalTrackerLabel)) return;
        this.externalTrackerLabel = externalTrackerLabel;
            updateLastModified();
            fireModified("externalTrackerLabel", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerLabel));
    }

    protected java.lang.String prepareExternalTrackerLabel(java.lang.String externalTrackerLabel) {
         externalTrackerLabel = Str.removeControlChars(externalTrackerLabel);
        return externalTrackerLabel;
    }

    public final boolean isExternalTrackerLabelSet() {
        return this.externalTrackerLabel != null;
    }

    public final boolean isExternalTrackerLabel(java.lang.String externalTrackerLabel) {
        if (this.externalTrackerLabel == null && externalTrackerLabel == null) return true;
        return this.externalTrackerLabel != null && this.externalTrackerLabel.equals(externalTrackerLabel);
    }

    protected final void updateExternalTrackerLabel(Object value) {
        setExternalTrackerLabel((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("vision")) updateVision(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("productLabel")) updateProductLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("shortDescription")) updateShortDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("description")) updateDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("longDescription")) updateLongDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("begin")) updateBegin(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("end")) updateEnd(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("participantsIds")) updateParticipantsIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("adminsIds")) updateAdminsIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("productOwnersIds")) updateProductOwnersIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("scrumMastersIds")) updateScrumMastersIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("teamMembersIds")) updateTeamMembersIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("currentSprintId")) updateCurrentSprintId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("nextSprintId")) updateNextSprintId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("velocity")) updateVelocity(ilarkesto.core.persistance.Persistence.parsePropertyInteger(value));
            if (property.equals("requirementsOrderIds")) updateRequirementsOrderIds(ilarkesto.core.persistance.Persistence.parsePropertyStringCollection(value));
            if (property.equals("urgentIssuesOrderIds")) updateUrgentIssuesOrderIds(ilarkesto.core.persistance.Persistence.parsePropertyStringCollection(value));
            if (property.equals("lastSprintNumber")) updateLastSprintNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastTaskNumber")) updateLastTaskNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastRequirementNumber")) updateLastRequirementNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastQualityNumber")) updateLastQualityNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastRiskNumber")) updateLastRiskNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastIssueNumber")) updateLastIssueNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastImpedimentNumber")) updateLastImpedimentNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastFileNumber")) updateLastFileNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastSubjectNumber")) updateLastSubjectNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastEventNumber")) updateLastEventNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastReleaseNumber")) updateLastReleaseNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("lastBlogEntryNumber")) updateLastBlogEntryNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("punishmentUnit")) updatePunishmentUnit(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("punishmentFactor")) updatePunishmentFactor(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("homepageDir")) updateHomepageDir(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("homepageUrl")) updateHomepageUrl(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("autoUpdateHomepage")) updateAutoUpdateHomepage(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("releaseScriptPath")) updateReleaseScriptPath(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("supportEmail")) updateSupportEmail(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("issueReplyTemplate")) updateIssueReplyTemplate(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("subscriberNotificationTemplate")) updateSubscriberNotificationTemplate(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("lastOpenedDateAndTime")) updateLastOpenedDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
            if (property.equals("freeDays")) updateFreeDays(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("autoCreateTasksFromQualities")) updateAutoCreateTasksFromQualities(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("releasingInfo")) updateReleasingInfo(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("externalTrackerUrlTemplate")) updateExternalTrackerUrlTemplate(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("externalTrackerLabel")) updateExternalTrackerLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        if (this.participantsIds == null) this.participantsIds = new java.util.HashSet<String>();
        repairDeadParticipantReference(entityId);
        if (this.adminsIds == null) this.adminsIds = new java.util.HashSet<String>();
        repairDeadAdminReference(entityId);
        if (this.productOwnersIds == null) this.productOwnersIds = new java.util.HashSet<String>();
        repairDeadProductOwnerReference(entityId);
        if (this.scrumMastersIds == null) this.scrumMastersIds = new java.util.HashSet<String>();
        repairDeadScrumMasterReference(entityId);
        if (this.teamMembersIds == null) this.teamMembersIds = new java.util.HashSet<String>();
        repairDeadTeamMemberReference(entityId);
        repairDeadCurrentSprintReference(entityId);
        repairDeadNextSprintReference(entityId);
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        if (this.urgentIssuesOrderIds == null) this.urgentIssuesOrderIds = new java.util.ArrayList<java.lang.String>();
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        if (this.participantsIds == null) this.participantsIds = new java.util.HashSet<String>();
        Set<String> participants = new HashSet<String>(this.participantsIds);
        for (String entityId : participants) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead participant reference");
                repairDeadParticipantReference(entityId);
            }
        }
        if (this.adminsIds == null) this.adminsIds = new java.util.HashSet<String>();
        Set<String> admins = new HashSet<String>(this.adminsIds);
        for (String entityId : admins) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead admin reference");
                repairDeadAdminReference(entityId);
            }
        }
        if (this.productOwnersIds == null) this.productOwnersIds = new java.util.HashSet<String>();
        Set<String> productOwners = new HashSet<String>(this.productOwnersIds);
        for (String entityId : productOwners) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead productOwner reference");
                repairDeadProductOwnerReference(entityId);
            }
        }
        if (this.scrumMastersIds == null) this.scrumMastersIds = new java.util.HashSet<String>();
        Set<String> scrumMasters = new HashSet<String>(this.scrumMastersIds);
        for (String entityId : scrumMasters) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead scrumMaster reference");
                repairDeadScrumMasterReference(entityId);
            }
        }
        if (this.teamMembersIds == null) this.teamMembersIds = new java.util.HashSet<String>();
        Set<String> teamMembers = new HashSet<String>(this.teamMembersIds);
        for (String entityId : teamMembers) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead teamMember reference");
                repairDeadTeamMemberReference(entityId);
            }
        }
        try {
            getCurrentSprint();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead currentSprint reference");
            repairDeadCurrentSprintReference(this.currentSprintId);
        }
        try {
            getNextSprint();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead nextSprint reference");
            repairDeadNextSprintReference(this.nextSprintId);
        }
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        if (this.urgentIssuesOrderIds == null) this.urgentIssuesOrderIds = new java.util.ArrayList<java.lang.String>();
        Collection<scrum.server.sprint.Sprint> sprint = getSprints();
        Collection<scrum.server.admin.ProjectUserConfig> projectUserConfig = getProjectUserConfigs();
        Collection<scrum.server.project.Quality> quality = getQualitys();
        Collection<scrum.server.impediments.Impediment> impediment = getImpediments();
        Collection<scrum.server.project.Requirement> requirement = getRequirements();
        Collection<scrum.server.issues.Issue> issue = getIssues();
        Collection<scrum.server.release.Release> release = getReleases();
        Collection<scrum.server.journal.ProjectEvent> projectEvent = getProjectEvents();
        Collection<scrum.server.calendar.SimpleEvent> simpleEvent = getSimpleEvents();
        Collection<scrum.server.collaboration.Subject> subject = getSubjects();
        Collection<scrum.server.collaboration.ChatMessage> chatMessage = getChatMessages();
        Collection<scrum.server.pr.BlogEntry> blogEntry = getBlogEntrys();
        Collection<scrum.server.risks.Risk> risk = getRisks();
        Collection<scrum.server.collaboration.Wikipage> wikipage = getWikipages();
        Collection<scrum.server.files.File> file = getFiles();
        Collection<scrum.server.admin.User> currentProjectUser = getCurrentProjectUsers();
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GProject.userDao = userDao;
    }

    static scrum.server.sprint.SprintDao sprintDao;

    public static final void setSprintDao(scrum.server.sprint.SprintDao sprintDao) {
        GProject.sprintDao = sprintDao;
    }

    static scrum.server.project.ProjectDao projectDao;

    public static final void setProjectDao(scrum.server.project.ProjectDao projectDao) {
        GProject.projectDao = projectDao;
    }

    static scrum.server.admin.ProjectUserConfigDao projectUserConfigDao;

    public static final void setProjectUserConfigDao(scrum.server.admin.ProjectUserConfigDao projectUserConfigDao) {
        GProject.projectUserConfigDao = projectUserConfigDao;
    }

    static scrum.server.project.QualityDao qualityDao;

    public static final void setQualityDao(scrum.server.project.QualityDao qualityDao) {
        GProject.qualityDao = qualityDao;
    }

    static scrum.server.impediments.ImpedimentDao impedimentDao;

    public static final void setImpedimentDao(scrum.server.impediments.ImpedimentDao impedimentDao) {
        GProject.impedimentDao = impedimentDao;
    }

    static scrum.server.project.RequirementDao requirementDao;

    public static final void setRequirementDao(scrum.server.project.RequirementDao requirementDao) {
        GProject.requirementDao = requirementDao;
    }

    static scrum.server.issues.IssueDao issueDao;

    public static final void setIssueDao(scrum.server.issues.IssueDao issueDao) {
        GProject.issueDao = issueDao;
    }

    static scrum.server.release.ReleaseDao releaseDao;

    public static final void setReleaseDao(scrum.server.release.ReleaseDao releaseDao) {
        GProject.releaseDao = releaseDao;
    }

    static scrum.server.journal.ProjectEventDao projectEventDao;

    public static final void setProjectEventDao(scrum.server.journal.ProjectEventDao projectEventDao) {
        GProject.projectEventDao = projectEventDao;
    }

    static scrum.server.calendar.SimpleEventDao simpleEventDao;

    public static final void setSimpleEventDao(scrum.server.calendar.SimpleEventDao simpleEventDao) {
        GProject.simpleEventDao = simpleEventDao;
    }

    static scrum.server.collaboration.SubjectDao subjectDao;

    public static final void setSubjectDao(scrum.server.collaboration.SubjectDao subjectDao) {
        GProject.subjectDao = subjectDao;
    }

    static scrum.server.collaboration.ChatMessageDao chatMessageDao;

    public static final void setChatMessageDao(scrum.server.collaboration.ChatMessageDao chatMessageDao) {
        GProject.chatMessageDao = chatMessageDao;
    }

    static scrum.server.pr.BlogEntryDao blogEntryDao;

    public static final void setBlogEntryDao(scrum.server.pr.BlogEntryDao blogEntryDao) {
        GProject.blogEntryDao = blogEntryDao;
    }

    static scrum.server.risks.RiskDao riskDao;

    public static final void setRiskDao(scrum.server.risks.RiskDao riskDao) {
        GProject.riskDao = riskDao;
    }

    static scrum.server.collaboration.WikipageDao wikipageDao;

    public static final void setWikipageDao(scrum.server.collaboration.WikipageDao wikipageDao) {
        GProject.wikipageDao = wikipageDao;
    }

    static scrum.server.files.FileDao fileDao;

    public static final void setFileDao(scrum.server.files.FileDao fileDao) {
        GProject.fileDao = fileDao;
    }

}