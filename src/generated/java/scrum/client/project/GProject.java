// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.project;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GProject
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Project> {

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

    public static Project getByLabel(final java.lang.String label) {
        return (Project) ilarkesto.core.persistance.Transaction.get().findFirst(new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "Project:byLabel";
            }
        });
    }

    public static Set< Project> listByVision(final java.lang.String vision) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isVision(vision);
            }
            @Override
            public String toString() {
                return "Project:byVision";
            }
        }.list();
    }

    public static Set< Project> listByProductLabel(final java.lang.String productLabel) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isProductLabel(productLabel);
            }
            @Override
            public String toString() {
                return "Project:byProductLabel";
            }
        }.list();
    }

    public static Set< Project> listByShortDescription(final java.lang.String shortDescription) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isShortDescription(shortDescription);
            }
            @Override
            public String toString() {
                return "Project:byShortDescription";
            }
        }.list();
    }

    public static Set< Project> listByDescription(final java.lang.String description) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isDescription(description);
            }
            @Override
            public String toString() {
                return "Project:byDescription";
            }
        }.list();
    }

    public static Set< Project> listByLongDescription(final java.lang.String longDescription) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLongDescription(longDescription);
            }
            @Override
            public String toString() {
                return "Project:byLongDescription";
            }
        }.list();
    }

    public static Set< Project> listByBegin(final ilarkesto.core.time.Date begin) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isBegin(begin);
            }
            @Override
            public String toString() {
                return "Project:byBegin";
            }
        }.list();
    }

    public static Set< Project> listByEnd(final ilarkesto.core.time.Date end) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isEnd(end);
            }
            @Override
            public String toString() {
                return "Project:byEnd";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project> participantsBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project>() {
    @Override
        protected Set<Project> loadById(final String id) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.getParticipantsIds().contains(id);
            }
            @Override
            public String toString() {
                return "Project:byParticipants";
            }
        }.list();
        }
    };

    public static Set< Project> listByParticipant(final scrum.client.admin.User participant) {
        if (participant == null) return new HashSet<Project>();
        return participantsBackReferencesCache.getById(participant.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project> adminsBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project>() {
    @Override
        protected Set<Project> loadById(final String id) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.getAdminsIds().contains(id);
            }
            @Override
            public String toString() {
                return "Project:byAdmins";
            }
        }.list();
        }
    };

    public static Set< Project> listByAdmin(final scrum.client.admin.User admin) {
        if (admin == null) return new HashSet<Project>();
        return adminsBackReferencesCache.getById(admin.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project> productOwnersBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project>() {
    @Override
        protected Set<Project> loadById(final String id) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.getProductOwnersIds().contains(id);
            }
            @Override
            public String toString() {
                return "Project:byProductOwners";
            }
        }.list();
        }
    };

    public static Set< Project> listByProductOwner(final scrum.client.admin.User productOwner) {
        if (productOwner == null) return new HashSet<Project>();
        return productOwnersBackReferencesCache.getById(productOwner.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project> scrumMastersBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project>() {
    @Override
        protected Set<Project> loadById(final String id) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.getScrumMastersIds().contains(id);
            }
            @Override
            public String toString() {
                return "Project:byScrumMasters";
            }
        }.list();
        }
    };

    public static Set< Project> listByScrumMaster(final scrum.client.admin.User scrumMaster) {
        if (scrumMaster == null) return new HashSet<Project>();
        return scrumMastersBackReferencesCache.getById(scrumMaster.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project> teamMembersBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project>() {
    @Override
        protected Set<Project> loadById(final String id) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.getTeamMembersIds().contains(id);
            }
            @Override
            public String toString() {
                return "Project:byTeamMembers";
            }
        }.list();
        }
    };

    public static Set< Project> listByTeamMember(final scrum.client.admin.User teamMember) {
        if (teamMember == null) return new HashSet<Project>();
        return teamMembersBackReferencesCache.getById(teamMember.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project> currentSprintBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project>() {
    @Override
        protected Set<Project> loadById(final String id) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return id.equals(entity.getCurrentSprintId());
            }
            @Override
            public String toString() {
                return "Project:byCurrentSprint";
            }
        }.list();
        }
    };

    public static Set< Project> listByCurrentSprint(final scrum.client.sprint.Sprint currentSprint) {
        if (currentSprint == null) return new HashSet<Project>();
        return currentSprintBackReferencesCache.getById(currentSprint.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project> nextSprintBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Project>() {
    @Override
        protected Set<Project> loadById(final String id) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return id.equals(entity.getNextSprintId());
            }
            @Override
            public String toString() {
                return "Project:byNextSprint";
            }
        }.list();
        }
    };

    public static Set< Project> listByNextSprint(final scrum.client.sprint.Sprint nextSprint) {
        if (nextSprint == null) return new HashSet<Project>();
        return nextSprintBackReferencesCache.getById(nextSprint.getId());
    }

    public static Set< Project> listByVelocity(final java.lang.Integer velocity) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isVelocity(velocity);
            }
            @Override
            public String toString() {
                return "Project:byVelocity";
            }
        }.list();
    }

    public static Set< Project> listByRequirementsOrderId(final java.lang.String requirementsOrderId) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.containsRequirementsOrderId(requirementsOrderId);
            }
            @Override
            public String toString() {
                return "Project:byRequirementsOrderIds";
            }
        }.list();
    }

    public static Set< Project> listByUrgentIssuesOrderId(final java.lang.String urgentIssuesOrderId) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.containsUrgentIssuesOrderId(urgentIssuesOrderId);
            }
            @Override
            public String toString() {
                return "Project:byUrgentIssuesOrderIds";
            }
        }.list();
    }

    public static Set< Project> listByLastSprintNumber(final int lastSprintNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastSprintNumber(lastSprintNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastSprintNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastTaskNumber(final int lastTaskNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastTaskNumber(lastTaskNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastTaskNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastRequirementNumber(final int lastRequirementNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastRequirementNumber(lastRequirementNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastRequirementNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastQualityNumber(final int lastQualityNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastQualityNumber(lastQualityNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastQualityNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastRiskNumber(final int lastRiskNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastRiskNumber(lastRiskNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastRiskNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastIssueNumber(final int lastIssueNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastIssueNumber(lastIssueNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastIssueNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastImpedimentNumber(final int lastImpedimentNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastImpedimentNumber(lastImpedimentNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastImpedimentNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastFileNumber(final int lastFileNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastFileNumber(lastFileNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastFileNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastSubjectNumber(final int lastSubjectNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastSubjectNumber(lastSubjectNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastSubjectNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastEventNumber(final int lastEventNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastEventNumber(lastEventNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastEventNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastReleaseNumber(final int lastReleaseNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastReleaseNumber(lastReleaseNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastReleaseNumber";
            }
        }.list();
    }

    public static Set< Project> listByLastBlogEntryNumber(final int lastBlogEntryNumber) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastBlogEntryNumber(lastBlogEntryNumber);
            }
            @Override
            public String toString() {
                return "Project:byLastBlogEntryNumber";
            }
        }.list();
    }

    public static Set< Project> listByPunishmentUnit(final java.lang.String punishmentUnit) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isPunishmentUnit(punishmentUnit);
            }
            @Override
            public String toString() {
                return "Project:byPunishmentUnit";
            }
        }.list();
    }

    public static Set< Project> listByPunishmentFactor(final int punishmentFactor) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isPunishmentFactor(punishmentFactor);
            }
            @Override
            public String toString() {
                return "Project:byPunishmentFactor";
            }
        }.list();
    }

    public static Set< Project> listByHomepageDir(final java.lang.String homepageDir) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isHomepageDir(homepageDir);
            }
            @Override
            public String toString() {
                return "Project:byHomepageDir";
            }
        }.list();
    }

    public static Set< Project> listByHomepageUrl(final java.lang.String homepageUrl) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isHomepageUrl(homepageUrl);
            }
            @Override
            public String toString() {
                return "Project:byHomepageUrl";
            }
        }.list();
    }

    public static Set< Project> listByAutoUpdateHomepage(final boolean autoUpdateHomepage) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isAutoUpdateHomepage(autoUpdateHomepage);
            }
            @Override
            public String toString() {
                return "Project:byAutoUpdateHomepage";
            }
        }.list();
    }

    public static Set< Project> listByReleaseScriptPath(final java.lang.String releaseScriptPath) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isReleaseScriptPath(releaseScriptPath);
            }
            @Override
            public String toString() {
                return "Project:byReleaseScriptPath";
            }
        }.list();
    }

    public static Set< Project> listBySupportEmail(final java.lang.String supportEmail) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isSupportEmail(supportEmail);
            }
            @Override
            public String toString() {
                return "Project:bySupportEmail";
            }
        }.list();
    }

    public static Set< Project> listByIssueReplyTemplate(final java.lang.String issueReplyTemplate) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isIssueReplyTemplate(issueReplyTemplate);
            }
            @Override
            public String toString() {
                return "Project:byIssueReplyTemplate";
            }
        }.list();
    }

    public static Set< Project> listBySubscriberNotificationTemplate(final java.lang.String subscriberNotificationTemplate) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isSubscriberNotificationTemplate(subscriberNotificationTemplate);
            }
            @Override
            public String toString() {
                return "Project:bySubscriberNotificationTemplate";
            }
        }.list();
    }

    public static Set< Project> listByLastOpenedDateAndTime(final ilarkesto.core.time.DateAndTime lastOpenedDateAndTime) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isLastOpenedDateAndTime(lastOpenedDateAndTime);
            }
            @Override
            public String toString() {
                return "Project:byLastOpenedDateAndTime";
            }
        }.list();
    }

    public static Set< Project> listByFreeDays(final int freeDays) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isFreeDays(freeDays);
            }
            @Override
            public String toString() {
                return "Project:byFreeDays";
            }
        }.list();
    }

    public static Set< Project> listByAutoCreateTasksFromQualities(final boolean autoCreateTasksFromQualities) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isAutoCreateTasksFromQualities(autoCreateTasksFromQualities);
            }
            @Override
            public String toString() {
                return "Project:byAutoCreateTasksFromQualities";
            }
        }.list();
    }

    public static Set< Project> listByReleasingInfo(final java.lang.String releasingInfo) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isReleasingInfo(releasingInfo);
            }
            @Override
            public String toString() {
                return "Project:byReleasingInfo";
            }
        }.list();
    }

    public static Set< Project> listByExternalTrackerUrlTemplate(final java.lang.String externalTrackerUrlTemplate) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isExternalTrackerUrlTemplate(externalTrackerUrlTemplate);
            }
            @Override
            public String toString() {
                return "Project:byExternalTrackerUrlTemplate";
            }
        }.list();
    }

    public static Set< Project> listByExternalTrackerLabel(final java.lang.String externalTrackerLabel) {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isExternalTrackerLabel(externalTrackerLabel);
            }
            @Override
            public String toString() {
                return "Project:byExternalTrackerLabel";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        participantsBackReferencesCache.clear(getParticipantsIds());
        adminsBackReferencesCache.clear(getAdminsIds());
        productOwnersBackReferencesCache.clear(getProductOwnersIds());
        scrumMastersBackReferencesCache.clear(getScrumMastersIds());
        teamMembersBackReferencesCache.clear(getTeamMembersIds());
        currentSprintBackReferencesCache.clear(getCurrentSprintId());
        nextSprintBackReferencesCache.clear(getNextSprintId());
    }

    public abstract boolean isEditable();

    public static Set<Project> listByIsEditable() {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isEditable();
            }
            @Override
            public String toString() {
                return "Project:byIsEditable";
            }
        }.list();
    }

    public final boolean isNotEditable() {
        return !isEditable();
    }

    public static Set<Project> listByIsNotEditable() {
        return new AProjectQuery() {
            @Override
            public boolean test(Project entity) {
                return entity.isNotEditable();
            }
            @Override
            public String toString() {
                return "Project:byIsNotEditable";
            }
        }.list();
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

    public final Set<scrum.client.sprint.Sprint> getSprints() {
        return scrum.client.sprint.Sprint.listByProject((Project)this);
    }

    public final Set<scrum.client.admin.ProjectUserConfig> getProjectUserConfigs() {
        return scrum.client.admin.ProjectUserConfig.listByProject((Project)this);
    }

    public final Set<scrum.client.project.Quality> getQualitys() {
        return scrum.client.project.Quality.listByProject((Project)this);
    }

    public final Set<scrum.client.impediments.Impediment> getImpediments() {
        return scrum.client.impediments.Impediment.listByProject((Project)this);
    }

    public final Set<scrum.client.project.Requirement> getRequirements() {
        return scrum.client.project.Requirement.listByProject((Project)this);
    }

    public final Set<scrum.client.issues.Issue> getIssues() {
        return scrum.client.issues.Issue.listByProject((Project)this);
    }

    public final Set<scrum.client.release.Release> getReleases() {
        return scrum.client.release.Release.listByProject((Project)this);
    }

    public final Set<scrum.client.journal.ProjectEvent> getProjectEvents() {
        return scrum.client.journal.ProjectEvent.listByProject((Project)this);
    }

    public final Set<scrum.client.calendar.SimpleEvent> getSimpleEvents() {
        return scrum.client.calendar.SimpleEvent.listByProject((Project)this);
    }

    public final Set<scrum.client.collaboration.Subject> getSubjects() {
        return scrum.client.collaboration.Subject.listByProject((Project)this);
    }

    public final Set<scrum.client.collaboration.ChatMessage> getChatMessages() {
        return scrum.client.collaboration.ChatMessage.listByProject((Project)this);
    }

    public final Set<scrum.client.pr.BlogEntry> getBlogEntrys() {
        return scrum.client.pr.BlogEntry.listByProject((Project)this);
    }

    public final Set<scrum.client.risks.Risk> getRisks() {
        return scrum.client.risks.Risk.listByProject((Project)this);
    }

    public final Set<scrum.client.collaboration.Wikipage> getWikipages() {
        return scrum.client.collaboration.Wikipage.listByProject((Project)this);
    }

    public final Set<scrum.client.files.File> getFiles() {
        return scrum.client.files.File.listByProject((Project)this);
    }

    public final Set<scrum.client.admin.User> getCurrentProjectUsers() {
        return scrum.client.admin.User.listByCurrentProject((Project)this);
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
            Object existing = Project.getByLabel(label);
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
            Object existing = Project.getByLabel(label);
            if (existing != null && existing != this) throw new ilarkesto.core.persistance.UniqueFieldConstraintException("Project" ,"label", label);
        }
        this.label = label;
            updateLastModified();
            fireModified("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
    }

    protected java.lang.String prepareLabel(java.lang.String label) {
        // label = Str.removeUnreadableChars(label);
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
        // vision = Str.removeUnreadableChars(vision);
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
        // productLabel = Str.removeUnreadableChars(productLabel);
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
        // shortDescription = Str.removeUnreadableChars(shortDescription);
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
        // description = Str.removeUnreadableChars(description);
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
        // longDescription = Str.removeUnreadableChars(longDescription);
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

    public final java.util.Set<scrum.client.admin.User> getParticipants() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.participantsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.participants");
        }
    }

    public final void setParticipants(Collection<scrum.client.admin.User> participants) {
        participants = prepareParticipants(participants);
        if (participants == null) participants = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(participants);
        setParticipantsIds(ids);
    }

    public final void setParticipantsIds(java.util.Set<String> ids) {
        if (Utl.equals(participantsIds, ids)) return;
        clearParticipantsBackReferenceCache(ids, participantsIds);
        participantsIds = ids;
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
    }

    private void clearParticipantsBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        participantsBackReferencesCache.clear(oldId);
        participantsBackReferencesCache.clear(newId);
    }

    private final void updateParticipantsIds(java.util.Set<String> ids) {
        setParticipantsIds(ids);
    }

    protected Collection<scrum.client.admin.User> prepareParticipants(Collection<scrum.client.admin.User> participants) {
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

    public final boolean containsParticipant(scrum.client.admin.User participant) {
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

    public final boolean addParticipant(scrum.client.admin.User participant) {
        if (participant == null) throw new IllegalArgumentException("participant == null");
        if (this.participantsIds == null) this.participantsIds = new java.util.HashSet<String>();
        boolean added = this.participantsIds.add(participant.getId());
        if (added) participantsBackReferencesCache.clear(participant.getId());
        if (added) {
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        }
        return added;
    }

    public final boolean addParticipants(Collection<scrum.client.admin.User> participants) {
        if (participants == null) throw new IllegalArgumentException("participants == null");
        if (this.participantsIds == null) this.participantsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.admin.User participant : participants) {
            added = added | this.participantsIds.add(participant.getId());
        }
        if (added) participantsBackReferencesCache.clear(this.participantsIds);
        if (added) {
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        }
        return added;
    }

    public final boolean removeParticipant(scrum.client.admin.User participant) {
        if (participant == null) return false;
        if (this.participantsIds == null) return false;
        boolean removed = this.participantsIds.remove(participant.getId());
        if (removed) participantsBackReferencesCache.clear(participant.getId());
        if (removed) {
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        }
        return removed;
    }

    public final boolean removeParticipants(Collection<scrum.client.admin.User> participants) {
        if (participants == null) return false;
        if (participants.isEmpty()) return false;
        if (this.participantsIds == null) return false;
        boolean removed = false;
        for (scrum.client.admin.User _element: participants) {
            removed = removed | this.participantsIds.remove(_element);
        }
        if (removed) participantsBackReferencesCache.clear(this.participantsIds);
        if (removed) {
            updateLastModified();
            fireModified("participantsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.participantsIds));
        }
        return removed;
    }

    public final boolean clearParticipants() {
        if (this.participantsIds == null) return false;
        if (this.participantsIds.isEmpty()) return false;
        participantsBackReferencesCache.clear(this.participantsIds);
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

    public final java.util.Set<scrum.client.admin.User> getAdmins() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.adminsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.admins");
        }
    }

    public final void setAdmins(Collection<scrum.client.admin.User> admins) {
        admins = prepareAdmins(admins);
        if (admins == null) admins = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(admins);
        setAdminsIds(ids);
    }

    public final void setAdminsIds(java.util.Set<String> ids) {
        if (Utl.equals(adminsIds, ids)) return;
        clearAdminsBackReferenceCache(ids, adminsIds);
        adminsIds = ids;
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
    }

    private void clearAdminsBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        adminsBackReferencesCache.clear(oldId);
        adminsBackReferencesCache.clear(newId);
    }

    private final void updateAdminsIds(java.util.Set<String> ids) {
        setAdminsIds(ids);
    }

    protected Collection<scrum.client.admin.User> prepareAdmins(Collection<scrum.client.admin.User> admins) {
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

    public final boolean containsAdmin(scrum.client.admin.User admin) {
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

    public final boolean addAdmin(scrum.client.admin.User admin) {
        if (admin == null) throw new IllegalArgumentException("admin == null");
        if (this.adminsIds == null) this.adminsIds = new java.util.HashSet<String>();
        boolean added = this.adminsIds.add(admin.getId());
        if (added) adminsBackReferencesCache.clear(admin.getId());
        if (added) {
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        }
        return added;
    }

    public final boolean addAdmins(Collection<scrum.client.admin.User> admins) {
        if (admins == null) throw new IllegalArgumentException("admins == null");
        if (this.adminsIds == null) this.adminsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.admin.User admin : admins) {
            added = added | this.adminsIds.add(admin.getId());
        }
        if (added) adminsBackReferencesCache.clear(this.adminsIds);
        if (added) {
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        }
        return added;
    }

    public final boolean removeAdmin(scrum.client.admin.User admin) {
        if (admin == null) return false;
        if (this.adminsIds == null) return false;
        boolean removed = this.adminsIds.remove(admin.getId());
        if (removed) adminsBackReferencesCache.clear(admin.getId());
        if (removed) {
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        }
        return removed;
    }

    public final boolean removeAdmins(Collection<scrum.client.admin.User> admins) {
        if (admins == null) return false;
        if (admins.isEmpty()) return false;
        if (this.adminsIds == null) return false;
        boolean removed = false;
        for (scrum.client.admin.User _element: admins) {
            removed = removed | this.adminsIds.remove(_element);
        }
        if (removed) adminsBackReferencesCache.clear(this.adminsIds);
        if (removed) {
            updateLastModified();
            fireModified("adminsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.adminsIds));
        }
        return removed;
    }

    public final boolean clearAdmins() {
        if (this.adminsIds == null) return false;
        if (this.adminsIds.isEmpty()) return false;
        adminsBackReferencesCache.clear(this.adminsIds);
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

    public final java.util.Set<scrum.client.admin.User> getProductOwners() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.productOwnersIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.productOwners");
        }
    }

    public final void setProductOwners(Collection<scrum.client.admin.User> productOwners) {
        productOwners = prepareProductOwners(productOwners);
        if (productOwners == null) productOwners = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(productOwners);
        setProductOwnersIds(ids);
    }

    public final void setProductOwnersIds(java.util.Set<String> ids) {
        if (Utl.equals(productOwnersIds, ids)) return;
        clearProductOwnersBackReferenceCache(ids, productOwnersIds);
        productOwnersIds = ids;
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
    }

    private void clearProductOwnersBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        productOwnersBackReferencesCache.clear(oldId);
        productOwnersBackReferencesCache.clear(newId);
    }

    private final void updateProductOwnersIds(java.util.Set<String> ids) {
        setProductOwnersIds(ids);
    }

    protected Collection<scrum.client.admin.User> prepareProductOwners(Collection<scrum.client.admin.User> productOwners) {
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

    public final boolean containsProductOwner(scrum.client.admin.User productOwner) {
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

    public final boolean addProductOwner(scrum.client.admin.User productOwner) {
        if (productOwner == null) throw new IllegalArgumentException("productOwner == null");
        if (this.productOwnersIds == null) this.productOwnersIds = new java.util.HashSet<String>();
        boolean added = this.productOwnersIds.add(productOwner.getId());
        if (added) productOwnersBackReferencesCache.clear(productOwner.getId());
        if (added) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return added;
    }

    public final boolean addProductOwners(Collection<scrum.client.admin.User> productOwners) {
        if (productOwners == null) throw new IllegalArgumentException("productOwners == null");
        if (this.productOwnersIds == null) this.productOwnersIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.admin.User productOwner : productOwners) {
            added = added | this.productOwnersIds.add(productOwner.getId());
        }
        if (added) productOwnersBackReferencesCache.clear(this.productOwnersIds);
        if (added) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return added;
    }

    public final boolean removeProductOwner(scrum.client.admin.User productOwner) {
        if (productOwner == null) return false;
        if (this.productOwnersIds == null) return false;
        boolean removed = this.productOwnersIds.remove(productOwner.getId());
        if (removed) productOwnersBackReferencesCache.clear(productOwner.getId());
        if (removed) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return removed;
    }

    public final boolean removeProductOwners(Collection<scrum.client.admin.User> productOwners) {
        if (productOwners == null) return false;
        if (productOwners.isEmpty()) return false;
        if (this.productOwnersIds == null) return false;
        boolean removed = false;
        for (scrum.client.admin.User _element: productOwners) {
            removed = removed | this.productOwnersIds.remove(_element);
        }
        if (removed) productOwnersBackReferencesCache.clear(this.productOwnersIds);
        if (removed) {
            updateLastModified();
            fireModified("productOwnersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.productOwnersIds));
        }
        return removed;
    }

    public final boolean clearProductOwners() {
        if (this.productOwnersIds == null) return false;
        if (this.productOwnersIds.isEmpty()) return false;
        productOwnersBackReferencesCache.clear(this.productOwnersIds);
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

    public final java.util.Set<scrum.client.admin.User> getScrumMasters() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.scrumMastersIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.scrumMasters");
        }
    }

    public final void setScrumMasters(Collection<scrum.client.admin.User> scrumMasters) {
        scrumMasters = prepareScrumMasters(scrumMasters);
        if (scrumMasters == null) scrumMasters = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(scrumMasters);
        setScrumMastersIds(ids);
    }

    public final void setScrumMastersIds(java.util.Set<String> ids) {
        if (Utl.equals(scrumMastersIds, ids)) return;
        clearScrumMastersBackReferenceCache(ids, scrumMastersIds);
        scrumMastersIds = ids;
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
    }

    private void clearScrumMastersBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        scrumMastersBackReferencesCache.clear(oldId);
        scrumMastersBackReferencesCache.clear(newId);
    }

    private final void updateScrumMastersIds(java.util.Set<String> ids) {
        setScrumMastersIds(ids);
    }

    protected Collection<scrum.client.admin.User> prepareScrumMasters(Collection<scrum.client.admin.User> scrumMasters) {
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

    public final boolean containsScrumMaster(scrum.client.admin.User scrumMaster) {
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

    public final boolean addScrumMaster(scrum.client.admin.User scrumMaster) {
        if (scrumMaster == null) throw new IllegalArgumentException("scrumMaster == null");
        if (this.scrumMastersIds == null) this.scrumMastersIds = new java.util.HashSet<String>();
        boolean added = this.scrumMastersIds.add(scrumMaster.getId());
        if (added) scrumMastersBackReferencesCache.clear(scrumMaster.getId());
        if (added) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return added;
    }

    public final boolean addScrumMasters(Collection<scrum.client.admin.User> scrumMasters) {
        if (scrumMasters == null) throw new IllegalArgumentException("scrumMasters == null");
        if (this.scrumMastersIds == null) this.scrumMastersIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.admin.User scrumMaster : scrumMasters) {
            added = added | this.scrumMastersIds.add(scrumMaster.getId());
        }
        if (added) scrumMastersBackReferencesCache.clear(this.scrumMastersIds);
        if (added) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return added;
    }

    public final boolean removeScrumMaster(scrum.client.admin.User scrumMaster) {
        if (scrumMaster == null) return false;
        if (this.scrumMastersIds == null) return false;
        boolean removed = this.scrumMastersIds.remove(scrumMaster.getId());
        if (removed) scrumMastersBackReferencesCache.clear(scrumMaster.getId());
        if (removed) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return removed;
    }

    public final boolean removeScrumMasters(Collection<scrum.client.admin.User> scrumMasters) {
        if (scrumMasters == null) return false;
        if (scrumMasters.isEmpty()) return false;
        if (this.scrumMastersIds == null) return false;
        boolean removed = false;
        for (scrum.client.admin.User _element: scrumMasters) {
            removed = removed | this.scrumMastersIds.remove(_element);
        }
        if (removed) scrumMastersBackReferencesCache.clear(this.scrumMastersIds);
        if (removed) {
            updateLastModified();
            fireModified("scrumMastersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.scrumMastersIds));
        }
        return removed;
    }

    public final boolean clearScrumMasters() {
        if (this.scrumMastersIds == null) return false;
        if (this.scrumMastersIds.isEmpty()) return false;
        scrumMastersBackReferencesCache.clear(this.scrumMastersIds);
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

    public final java.util.Set<scrum.client.admin.User> getTeamMembers() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.teamMembersIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.teamMembers");
        }
    }

    public final void setTeamMembers(Collection<scrum.client.admin.User> teamMembers) {
        teamMembers = prepareTeamMembers(teamMembers);
        if (teamMembers == null) teamMembers = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(teamMembers);
        setTeamMembersIds(ids);
    }

    public final void setTeamMembersIds(java.util.Set<String> ids) {
        if (Utl.equals(teamMembersIds, ids)) return;
        clearTeamMembersBackReferenceCache(ids, teamMembersIds);
        teamMembersIds = ids;
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
    }

    private void clearTeamMembersBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        teamMembersBackReferencesCache.clear(oldId);
        teamMembersBackReferencesCache.clear(newId);
    }

    private final void updateTeamMembersIds(java.util.Set<String> ids) {
        setTeamMembersIds(ids);
    }

    protected Collection<scrum.client.admin.User> prepareTeamMembers(Collection<scrum.client.admin.User> teamMembers) {
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

    public final boolean containsTeamMember(scrum.client.admin.User teamMember) {
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

    public final boolean addTeamMember(scrum.client.admin.User teamMember) {
        if (teamMember == null) throw new IllegalArgumentException("teamMember == null");
        if (this.teamMembersIds == null) this.teamMembersIds = new java.util.HashSet<String>();
        boolean added = this.teamMembersIds.add(teamMember.getId());
        if (added) teamMembersBackReferencesCache.clear(teamMember.getId());
        if (added) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return added;
    }

    public final boolean addTeamMembers(Collection<scrum.client.admin.User> teamMembers) {
        if (teamMembers == null) throw new IllegalArgumentException("teamMembers == null");
        if (this.teamMembersIds == null) this.teamMembersIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.admin.User teamMember : teamMembers) {
            added = added | this.teamMembersIds.add(teamMember.getId());
        }
        if (added) teamMembersBackReferencesCache.clear(this.teamMembersIds);
        if (added) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return added;
    }

    public final boolean removeTeamMember(scrum.client.admin.User teamMember) {
        if (teamMember == null) return false;
        if (this.teamMembersIds == null) return false;
        boolean removed = this.teamMembersIds.remove(teamMember.getId());
        if (removed) teamMembersBackReferencesCache.clear(teamMember.getId());
        if (removed) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return removed;
    }

    public final boolean removeTeamMembers(Collection<scrum.client.admin.User> teamMembers) {
        if (teamMembers == null) return false;
        if (teamMembers.isEmpty()) return false;
        if (this.teamMembersIds == null) return false;
        boolean removed = false;
        for (scrum.client.admin.User _element: teamMembers) {
            removed = removed | this.teamMembersIds.remove(_element);
        }
        if (removed) teamMembersBackReferencesCache.clear(this.teamMembersIds);
        if (removed) {
            updateLastModified();
            fireModified("teamMembersIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.teamMembersIds));
        }
        return removed;
    }

    public final boolean clearTeamMembers() {
        if (this.teamMembersIds == null) return false;
        if (this.teamMembersIds.isEmpty()) return false;
        teamMembersBackReferencesCache.clear(this.teamMembersIds);
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

    public final scrum.client.sprint.Sprint getCurrentSprint() {
        try {
            return this.currentSprintId == null ? null : (scrum.client.sprint.Sprint) AEntity.getById(this.currentSprintId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.currentSprint");
        }
    }

    public final void setCurrentSprint(scrum.client.sprint.Sprint currentSprint) {
        currentSprint = prepareCurrentSprint(currentSprint);
        if (isCurrentSprint(currentSprint)) return;
        setCurrentSprintId(currentSprint == null ? null : currentSprint.getId());
    }

    public final void setCurrentSprintId(String id) {
        if (Utl.equals(currentSprintId, id)) return;
        clearCurrentSprintBackReferenceCache(id, this.currentSprintId);
        this.currentSprintId = id;
            updateLastModified();
            fireModified("currentSprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.currentSprintId));
    }

    private void clearCurrentSprintBackReferenceCache(String oldId, String newId) {
        currentSprintBackReferencesCache.clear(oldId);
        currentSprintBackReferencesCache.clear(newId);
    }

    private final void updateCurrentSprintId(String id) {
        setCurrentSprintId(id);
    }

    protected scrum.client.sprint.Sprint prepareCurrentSprint(scrum.client.sprint.Sprint currentSprint) {
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

    public final boolean isCurrentSprint(scrum.client.sprint.Sprint currentSprint) {
        if (this.currentSprintId == null && currentSprint == null) return true;
        return currentSprint != null && currentSprint.getId().equals(this.currentSprintId);
    }

    // -----------------------------------------------------------
    // - nextSprint
    // -----------------------------------------------------------

    private String nextSprintId;

    public final String getNextSprintId() {
        return this.nextSprintId;
    }

    public final scrum.client.sprint.Sprint getNextSprint() {
        try {
            return this.nextSprintId == null ? null : (scrum.client.sprint.Sprint) AEntity.getById(this.nextSprintId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Project.nextSprint");
        }
    }

    public final void setNextSprint(scrum.client.sprint.Sprint nextSprint) {
        nextSprint = prepareNextSprint(nextSprint);
        if (isNextSprint(nextSprint)) return;
        setNextSprintId(nextSprint == null ? null : nextSprint.getId());
    }

    public final void setNextSprintId(String id) {
        if (Utl.equals(nextSprintId, id)) return;
        clearNextSprintBackReferenceCache(id, this.nextSprintId);
        this.nextSprintId = id;
            updateLastModified();
            fireModified("nextSprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.nextSprintId));
    }

    private void clearNextSprintBackReferenceCache(String oldId, String newId) {
        nextSprintBackReferencesCache.clear(oldId);
        nextSprintBackReferencesCache.clear(newId);
    }

    private final void updateNextSprintId(String id) {
        setNextSprintId(id);
    }

    protected scrum.client.sprint.Sprint prepareNextSprint(scrum.client.sprint.Sprint nextSprint) {
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

    public final boolean isNextSprint(scrum.client.sprint.Sprint nextSprint) {
        if (this.nextSprintId == null && nextSprint == null) return true;
        return nextSprint != null && nextSprint.getId().equals(this.nextSprintId);
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
        // punishmentUnit = Str.removeUnreadableChars(punishmentUnit);
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
        // homepageDir = Str.removeUnreadableChars(homepageDir);
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
        // homepageUrl = Str.removeUnreadableChars(homepageUrl);
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
        // releaseScriptPath = Str.removeUnreadableChars(releaseScriptPath);
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
        // supportEmail = Str.removeUnreadableChars(supportEmail);
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
        // issueReplyTemplate = Str.removeUnreadableChars(issueReplyTemplate);
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
        // subscriberNotificationTemplate = Str.removeUnreadableChars(subscriberNotificationTemplate);
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
        // releasingInfo = Str.removeUnreadableChars(releasingInfo);
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
        // externalTrackerUrlTemplate = Str.removeUnreadableChars(externalTrackerUrlTemplate);
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
        // externalTrackerLabel = Str.removeUnreadableChars(externalTrackerLabel);
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
        Collection<scrum.client.sprint.Sprint> sprint = getSprints();
        Collection<scrum.client.admin.ProjectUserConfig> projectUserConfig = getProjectUserConfigs();
        Collection<scrum.client.project.Quality> quality = getQualitys();
        Collection<scrum.client.impediments.Impediment> impediment = getImpediments();
        Collection<scrum.client.project.Requirement> requirement = getRequirements();
        Collection<scrum.client.issues.Issue> issue = getIssues();
        Collection<scrum.client.release.Release> release = getReleases();
        Collection<scrum.client.journal.ProjectEvent> projectEvent = getProjectEvents();
        Collection<scrum.client.calendar.SimpleEvent> simpleEvent = getSimpleEvents();
        Collection<scrum.client.collaboration.Subject> subject = getSubjects();
        Collection<scrum.client.collaboration.ChatMessage> chatMessage = getChatMessages();
        Collection<scrum.client.pr.BlogEntry> blogEntry = getBlogEntrys();
        Collection<scrum.client.risks.Risk> risk = getRisks();
        Collection<scrum.client.collaboration.Wikipage> wikipage = getWikipages();
        Collection<scrum.client.files.File> file = getFiles();
        Collection<scrum.client.admin.User> currentProjectUser = getCurrentProjectUsers();
    }

    // --- PLUGIN: GwtEntityPropertyEditorClassGeneratorPlugin ---

    private transient LabelModel labelModel;

    public LabelModel getLabelModel() {
        if (labelModel == null) labelModel = createLabelModel();
        return labelModel;
    }

    protected LabelModel createLabelModel() { return new LabelModel(); }

    protected class LabelModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_label";
        }

        @Override
        public java.lang.String getValue() {
            return getLabel();
        }

        @Override
        public void setValue(java.lang.String value) {
            setLabel(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isEditable() { return GProject.this.isEditable(); }
        @Override
        public String getTooltip() { return "This is the project name that should be chosen for humans to clearly identify the project."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient VisionModel visionModel;

    public VisionModel getVisionModel() {
        if (visionModel == null) visionModel = createVisionModel();
        return visionModel;
    }

    protected VisionModel createVisionModel() { return new VisionModel(); }

    protected class VisionModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_vision";
        }

        @Override
        public java.lang.String getValue() {
            return getVision();
        }

        @Override
        public void setValue(java.lang.String value) {
            setVision(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "This is a vision that should state the purpose and aim of the project. It should focus be used to focus the participant's work on a common goal that is simple, measurable, achievable, relevant, and time-bound."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ProductLabelModel productLabelModel;

    public ProductLabelModel getProductLabelModel() {
        if (productLabelModel == null) productLabelModel = createProductLabelModel();
        return productLabelModel;
    }

    protected ProductLabelModel createProductLabelModel() { return new ProductLabelModel(); }

    protected class ProductLabelModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_productLabel";
        }

        @Override
        public java.lang.String getValue() {
            return getProductLabel();
        }

        @Override
        public void setValue(java.lang.String value) {
            setProductLabel(value);
        }
        @Override
        public String getTooltip() { return "This is the name of the product, which is created within this project."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ShortDescriptionModel shortDescriptionModel;

    public ShortDescriptionModel getShortDescriptionModel() {
        if (shortDescriptionModel == null) shortDescriptionModel = createShortDescriptionModel();
        return shortDescriptionModel;
    }

    protected ShortDescriptionModel createShortDescriptionModel() { return new ShortDescriptionModel(); }

    protected class ShortDescriptionModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_shortDescription";
        }

        @Override
        public java.lang.String getValue() {
            return getShortDescription();
        }

        @Override
        public void setValue(java.lang.String value) {
            setShortDescription(value);
        }
        @Override
        public String getTooltip() { return "This is a project description in a sentence. It can, for example, be used in the homepage metatag or inserted descriptions, where space is limited to one line."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient DescriptionModel descriptionModel;

    public DescriptionModel getDescriptionModel() {
        if (descriptionModel == null) descriptionModel = createDescriptionModel();
        return descriptionModel;
    }

    protected DescriptionModel createDescriptionModel() { return new DescriptionModel(); }

    protected class DescriptionModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_description";
        }

        @Override
        public java.lang.String getValue() {
            return getDescription();
        }

        @Override
        public void setValue(java.lang.String value) {
            setDescription(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "This is a product description in a paragraph. It is can be used to give a short introduction about the product, summing up all essential features."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient LongDescriptionModel longDescriptionModel;

    public LongDescriptionModel getLongDescriptionModel() {
        if (longDescriptionModel == null) longDescriptionModel = createLongDescriptionModel();
        return longDescriptionModel;
    }

    protected LongDescriptionModel createLongDescriptionModel() { return new LongDescriptionModel(); }

    protected class LongDescriptionModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_longDescription";
        }

        @Override
        public java.lang.String getValue() {
            return getLongDescription();
        }

        @Override
        public void setValue(java.lang.String value) {
            setLongDescription(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "This is a full lenth description that takes as much space as it needs."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient BeginModel beginModel;

    public BeginModel getBeginModel() {
        if (beginModel == null) beginModel = createBeginModel();
        return beginModel;
    }

    protected BeginModel createBeginModel() { return new BeginModel(); }

    protected class BeginModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Project_begin";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getBegin();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setBegin(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient EndModel endModel;

    public EndModel getEndModel() {
        if (endModel == null) endModel = createEndModel();
        return endModel;
    }

    protected EndModel createEndModel() { return new EndModel(); }

    protected class EndModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Project_end";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getEnd();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setEnd(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient VelocityModel velocityModel;

    public VelocityModel getVelocityModel() {
        if (velocityModel == null) velocityModel = createVelocityModel();
        return velocityModel;
    }

    protected VelocityModel createVelocityModel() { return new VelocityModel(); }

    protected class VelocityModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_velocity";
        }

        @Override
        public java.lang.Integer getValue() {
            return getVelocity();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setVelocity(value);
        }

            @Override
            public void increment() {
                setVelocity(getVelocity() + 1);
            }

            @Override
            public void decrement() {
                setVelocity(getVelocity() - 1);
            }
        @Override
        public String getTooltip() { return "Estimated velocity for the current sprint."; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient LastSprintNumberModel lastSprintNumberModel;

    public LastSprintNumberModel getLastSprintNumberModel() {
        if (lastSprintNumberModel == null) lastSprintNumberModel = createLastSprintNumberModel();
        return lastSprintNumberModel;
    }

    protected LastSprintNumberModel createLastSprintNumberModel() { return new LastSprintNumberModel(); }

    protected class LastSprintNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastSprintNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastSprintNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastSprintNumber(value);
        }

            @Override
            public void increment() {
                setLastSprintNumber(getLastSprintNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastSprintNumber(getLastSprintNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastTaskNumberModel lastTaskNumberModel;

    public LastTaskNumberModel getLastTaskNumberModel() {
        if (lastTaskNumberModel == null) lastTaskNumberModel = createLastTaskNumberModel();
        return lastTaskNumberModel;
    }

    protected LastTaskNumberModel createLastTaskNumberModel() { return new LastTaskNumberModel(); }

    protected class LastTaskNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastTaskNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastTaskNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastTaskNumber(value);
        }

            @Override
            public void increment() {
                setLastTaskNumber(getLastTaskNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastTaskNumber(getLastTaskNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastRequirementNumberModel lastRequirementNumberModel;

    public LastRequirementNumberModel getLastRequirementNumberModel() {
        if (lastRequirementNumberModel == null) lastRequirementNumberModel = createLastRequirementNumberModel();
        return lastRequirementNumberModel;
    }

    protected LastRequirementNumberModel createLastRequirementNumberModel() { return new LastRequirementNumberModel(); }

    protected class LastRequirementNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastRequirementNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastRequirementNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastRequirementNumber(value);
        }

            @Override
            public void increment() {
                setLastRequirementNumber(getLastRequirementNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastRequirementNumber(getLastRequirementNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastQualityNumberModel lastQualityNumberModel;

    public LastQualityNumberModel getLastQualityNumberModel() {
        if (lastQualityNumberModel == null) lastQualityNumberModel = createLastQualityNumberModel();
        return lastQualityNumberModel;
    }

    protected LastQualityNumberModel createLastQualityNumberModel() { return new LastQualityNumberModel(); }

    protected class LastQualityNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastQualityNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastQualityNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastQualityNumber(value);
        }

            @Override
            public void increment() {
                setLastQualityNumber(getLastQualityNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastQualityNumber(getLastQualityNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastRiskNumberModel lastRiskNumberModel;

    public LastRiskNumberModel getLastRiskNumberModel() {
        if (lastRiskNumberModel == null) lastRiskNumberModel = createLastRiskNumberModel();
        return lastRiskNumberModel;
    }

    protected LastRiskNumberModel createLastRiskNumberModel() { return new LastRiskNumberModel(); }

    protected class LastRiskNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastRiskNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastRiskNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastRiskNumber(value);
        }

            @Override
            public void increment() {
                setLastRiskNumber(getLastRiskNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastRiskNumber(getLastRiskNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastIssueNumberModel lastIssueNumberModel;

    public LastIssueNumberModel getLastIssueNumberModel() {
        if (lastIssueNumberModel == null) lastIssueNumberModel = createLastIssueNumberModel();
        return lastIssueNumberModel;
    }

    protected LastIssueNumberModel createLastIssueNumberModel() { return new LastIssueNumberModel(); }

    protected class LastIssueNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastIssueNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastIssueNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastIssueNumber(value);
        }

            @Override
            public void increment() {
                setLastIssueNumber(getLastIssueNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastIssueNumber(getLastIssueNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastImpedimentNumberModel lastImpedimentNumberModel;

    public LastImpedimentNumberModel getLastImpedimentNumberModel() {
        if (lastImpedimentNumberModel == null) lastImpedimentNumberModel = createLastImpedimentNumberModel();
        return lastImpedimentNumberModel;
    }

    protected LastImpedimentNumberModel createLastImpedimentNumberModel() { return new LastImpedimentNumberModel(); }

    protected class LastImpedimentNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastImpedimentNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastImpedimentNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastImpedimentNumber(value);
        }

            @Override
            public void increment() {
                setLastImpedimentNumber(getLastImpedimentNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastImpedimentNumber(getLastImpedimentNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastFileNumberModel lastFileNumberModel;

    public LastFileNumberModel getLastFileNumberModel() {
        if (lastFileNumberModel == null) lastFileNumberModel = createLastFileNumberModel();
        return lastFileNumberModel;
    }

    protected LastFileNumberModel createLastFileNumberModel() { return new LastFileNumberModel(); }

    protected class LastFileNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastFileNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastFileNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastFileNumber(value);
        }

            @Override
            public void increment() {
                setLastFileNumber(getLastFileNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastFileNumber(getLastFileNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastSubjectNumberModel lastSubjectNumberModel;

    public LastSubjectNumberModel getLastSubjectNumberModel() {
        if (lastSubjectNumberModel == null) lastSubjectNumberModel = createLastSubjectNumberModel();
        return lastSubjectNumberModel;
    }

    protected LastSubjectNumberModel createLastSubjectNumberModel() { return new LastSubjectNumberModel(); }

    protected class LastSubjectNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastSubjectNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastSubjectNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastSubjectNumber(value);
        }

            @Override
            public void increment() {
                setLastSubjectNumber(getLastSubjectNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastSubjectNumber(getLastSubjectNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastEventNumberModel lastEventNumberModel;

    public LastEventNumberModel getLastEventNumberModel() {
        if (lastEventNumberModel == null) lastEventNumberModel = createLastEventNumberModel();
        return lastEventNumberModel;
    }

    protected LastEventNumberModel createLastEventNumberModel() { return new LastEventNumberModel(); }

    protected class LastEventNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastEventNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastEventNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastEventNumber(value);
        }

            @Override
            public void increment() {
                setLastEventNumber(getLastEventNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastEventNumber(getLastEventNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastReleaseNumberModel lastReleaseNumberModel;

    public LastReleaseNumberModel getLastReleaseNumberModel() {
        if (lastReleaseNumberModel == null) lastReleaseNumberModel = createLastReleaseNumberModel();
        return lastReleaseNumberModel;
    }

    protected LastReleaseNumberModel createLastReleaseNumberModel() { return new LastReleaseNumberModel(); }

    protected class LastReleaseNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastReleaseNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastReleaseNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastReleaseNumber(value);
        }

            @Override
            public void increment() {
                setLastReleaseNumber(getLastReleaseNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastReleaseNumber(getLastReleaseNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LastBlogEntryNumberModel lastBlogEntryNumberModel;

    public LastBlogEntryNumberModel getLastBlogEntryNumberModel() {
        if (lastBlogEntryNumberModel == null) lastBlogEntryNumberModel = createLastBlogEntryNumberModel();
        return lastBlogEntryNumberModel;
    }

    protected LastBlogEntryNumberModel createLastBlogEntryNumberModel() { return new LastBlogEntryNumberModel(); }

    protected class LastBlogEntryNumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_lastBlogEntryNumber";
        }

        @Override
        public java.lang.Integer getValue() {
            return getLastBlogEntryNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setLastBlogEntryNumber(value);
        }

            @Override
            public void increment() {
                setLastBlogEntryNumber(getLastBlogEntryNumber() + 1);
            }

            @Override
            public void decrement() {
                setLastBlogEntryNumber(getLastBlogEntryNumber() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient PunishmentUnitModel punishmentUnitModel;

    public PunishmentUnitModel getPunishmentUnitModel() {
        if (punishmentUnitModel == null) punishmentUnitModel = createPunishmentUnitModel();
        return punishmentUnitModel;
    }

    protected PunishmentUnitModel createPunishmentUnitModel() { return new PunishmentUnitModel(); }

    protected class PunishmentUnitModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_punishmentUnit";
        }

        @Override
        public java.lang.String getValue() {
            return getPunishmentUnit();
        }

        @Override
        public void setValue(java.lang.String value) {
            setPunishmentUnit(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PunishmentFactorModel punishmentFactorModel;

    public PunishmentFactorModel getPunishmentFactorModel() {
        if (punishmentFactorModel == null) punishmentFactorModel = createPunishmentFactorModel();
        return punishmentFactorModel;
    }

    protected PunishmentFactorModel createPunishmentFactorModel() { return new PunishmentFactorModel(); }

    protected class PunishmentFactorModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_punishmentFactor";
        }

        @Override
        public java.lang.Integer getValue() {
            return getPunishmentFactor();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setPunishmentFactor(value);
        }

            @Override
            public void increment() {
                setPunishmentFactor(getPunishmentFactor() + 1);
            }

            @Override
            public void decrement() {
                setPunishmentFactor(getPunishmentFactor() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient HomepageDirModel homepageDirModel;

    public HomepageDirModel getHomepageDirModel() {
        if (homepageDirModel == null) homepageDirModel = createHomepageDirModel();
        return homepageDirModel;
    }

    protected HomepageDirModel createHomepageDirModel() { return new HomepageDirModel(); }

    protected class HomepageDirModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_homepageDir";
        }

        @Override
        public java.lang.String getValue() {
            return getHomepageDir();
        }

        @Override
        public void setValue(java.lang.String value) {
            setHomepageDir(value);
        }
        @Override
        public String getTooltip() { return "Directory, which contains homepage files and velocity templates."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient HomepageUrlModel homepageUrlModel;

    public HomepageUrlModel getHomepageUrlModel() {
        if (homepageUrlModel == null) homepageUrlModel = createHomepageUrlModel();
        return homepageUrlModel;
    }

    protected HomepageUrlModel createHomepageUrlModel() { return new HomepageUrlModel(); }

    protected class HomepageUrlModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_homepageUrl";
        }

        @Override
        public java.lang.String getValue() {
            return getHomepageUrl();
        }

        @Override
        public void setValue(java.lang.String value) {
            setHomepageUrl(value);
        }
        @Override
        public String getTooltip() { return "URL on which the project homepage is accessible."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient AutoUpdateHomepageModel autoUpdateHomepageModel;

    public AutoUpdateHomepageModel getAutoUpdateHomepageModel() {
        if (autoUpdateHomepageModel == null) autoUpdateHomepageModel = createAutoUpdateHomepageModel();
        return autoUpdateHomepageModel;
    }

    protected AutoUpdateHomepageModel createAutoUpdateHomepageModel() { return new AutoUpdateHomepageModel(); }

    protected class AutoUpdateHomepageModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Project_autoUpdateHomepage";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isAutoUpdateHomepage();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setAutoUpdateHomepage(value);
        }

        @Override
        public boolean isMandatory() { return true; }
        @Override
        public String getTooltip() { return "Automatically update the homepage."; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient ReleaseScriptPathModel releaseScriptPathModel;

    public ReleaseScriptPathModel getReleaseScriptPathModel() {
        if (releaseScriptPathModel == null) releaseScriptPathModel = createReleaseScriptPathModel();
        return releaseScriptPathModel;
    }

    protected ReleaseScriptPathModel createReleaseScriptPathModel() { return new ReleaseScriptPathModel(); }

    protected class ReleaseScriptPathModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_releaseScriptPath";
        }

        @Override
        public java.lang.String getValue() {
            return getReleaseScriptPath();
        }

        @Override
        public void setValue(java.lang.String value) {
            setReleaseScriptPath(value);
        }
        @Override
        public String getTooltip() { return "Full path to the script, which needs to be executed when publishing a release. The Script recives the release label as the first argument."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient SupportEmailModel supportEmailModel;

    public SupportEmailModel getSupportEmailModel() {
        if (supportEmailModel == null) supportEmailModel = createSupportEmailModel();
        return supportEmailModel;
    }

    protected SupportEmailModel createSupportEmailModel() { return new SupportEmailModel(); }

    protected class SupportEmailModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_supportEmail";
        }

        @Override
        public java.lang.String getValue() {
            return getSupportEmail();
        }

        @Override
        public void setValue(java.lang.String value) {
            setSupportEmail(value);
        }

        @Override
        public boolean isEditable() { return GProject.this.isEditable(); }
        @Override
        public String getTooltip() { return "Email address of the support for this project."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient IssueReplyTemplateModel issueReplyTemplateModel;

    public IssueReplyTemplateModel getIssueReplyTemplateModel() {
        if (issueReplyTemplateModel == null) issueReplyTemplateModel = createIssueReplyTemplateModel();
        return issueReplyTemplateModel;
    }

    protected IssueReplyTemplateModel createIssueReplyTemplateModel() { return new IssueReplyTemplateModel(); }

    protected class IssueReplyTemplateModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_issueReplyTemplate";
        }

        @Override
        public java.lang.String getValue() {
            return getIssueReplyTemplate();
        }

        @Override
        public void setValue(java.lang.String value) {
            setIssueReplyTemplate(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "Text template, which to use when replying to issue authors by email.<br><br>The following variables can be used: ${issue.reference} ${issuer.name} ${issuer.email} ${homepage.url} ${user.name} ${user.email}"; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient SubscriberNotificationTemplateModel subscriberNotificationTemplateModel;

    public SubscriberNotificationTemplateModel getSubscriberNotificationTemplateModel() {
        if (subscriberNotificationTemplateModel == null) subscriberNotificationTemplateModel = createSubscriberNotificationTemplateModel();
        return subscriberNotificationTemplateModel;
    }

    protected SubscriberNotificationTemplateModel createSubscriberNotificationTemplateModel() { return new SubscriberNotificationTemplateModel(); }

    protected class SubscriberNotificationTemplateModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_subscriberNotificationTemplate";
        }

        @Override
        public java.lang.String getValue() {
            return getSubscriberNotificationTemplate();
        }

        @Override
        public void setValue(java.lang.String value) {
            setSubscriberNotificationTemplate(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "Text template, which to use when sending change notifications to subscribers.<br><br>The following variables can be used: ${entity.reference} ${entity.label} ${change.message} ${unsubscribe.url} ${unsubscribeall.url} ${homepage.url} ${product.label} ${project.label} ${project.id} ${kunagi.instance} ${kunagi.url}"; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient LastOpenedDateAndTimeModel lastOpenedDateAndTimeModel;

    public LastOpenedDateAndTimeModel getLastOpenedDateAndTimeModel() {
        if (lastOpenedDateAndTimeModel == null) lastOpenedDateAndTimeModel = createLastOpenedDateAndTimeModel();
        return lastOpenedDateAndTimeModel;
    }

    protected LastOpenedDateAndTimeModel createLastOpenedDateAndTimeModel() { return new LastOpenedDateAndTimeModel(); }

    protected class LastOpenedDateAndTimeModel extends ilarkesto.gwt.client.editor.ADateAndTimeEditorModel {

        @Override
        public String getId() {
            return "Project_lastOpenedDateAndTime";
        }

        @Override
        public ilarkesto.core.time.DateAndTime getValue() {
            return getLastOpenedDateAndTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.DateAndTime value) {
            setLastOpenedDateAndTime(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.DateAndTime oldValue, ilarkesto.core.time.DateAndTime newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient FreeDaysModel freeDaysModel;

    public FreeDaysModel getFreeDaysModel() {
        if (freeDaysModel == null) freeDaysModel = createFreeDaysModel();
        return freeDaysModel;
    }

    protected FreeDaysModel createFreeDaysModel() { return new FreeDaysModel(); }

    protected class FreeDaysModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Project_freeDays";
        }

        @Override
        public java.lang.Integer getValue() {
            return getFreeDays();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setFreeDays(value);
        }

            @Override
            public void increment() {
                setFreeDays(getFreeDays() + 1);
            }

            @Override
            public void decrement() {
                setFreeDays(getFreeDays() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }
        @Override
        public String getTooltip() { return "Weekdays, on which no work is done."; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient AutoCreateTasksFromQualitiesModel autoCreateTasksFromQualitiesModel;

    public AutoCreateTasksFromQualitiesModel getAutoCreateTasksFromQualitiesModel() {
        if (autoCreateTasksFromQualitiesModel == null) autoCreateTasksFromQualitiesModel = createAutoCreateTasksFromQualitiesModel();
        return autoCreateTasksFromQualitiesModel;
    }

    protected AutoCreateTasksFromQualitiesModel createAutoCreateTasksFromQualitiesModel() { return new AutoCreateTasksFromQualitiesModel(); }

    protected class AutoCreateTasksFromQualitiesModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Project_autoCreateTasksFromQualities";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isAutoCreateTasksFromQualities();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setAutoCreateTasksFromQualities(value);
        }

        @Override
        public boolean isMandatory() { return true; }
        @Override
        public String getTooltip() { return "When pulling stories into the sprint, automatically create a task for each quality assigned to the story."; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient ReleasingInfoModel releasingInfoModel;

    public ReleasingInfoModel getReleasingInfoModel() {
        if (releasingInfoModel == null) releasingInfoModel = createReleasingInfoModel();
        return releasingInfoModel;
    }

    protected ReleasingInfoModel createReleasingInfoModel() { return new ReleasingInfoModel(); }

    protected class ReleasingInfoModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_releasingInfo";
        }

        @Override
        public java.lang.String getValue() {
            return getReleasingInfo();
        }

        @Override
        public void setValue(java.lang.String value) {
            setReleasingInfo(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "Custom info text for the releases page. Could be used for a release checklist."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ExternalTrackerUrlTemplateModel externalTrackerUrlTemplateModel;

    public ExternalTrackerUrlTemplateModel getExternalTrackerUrlTemplateModel() {
        if (externalTrackerUrlTemplateModel == null) externalTrackerUrlTemplateModel = createExternalTrackerUrlTemplateModel();
        return externalTrackerUrlTemplateModel;
    }

    protected ExternalTrackerUrlTemplateModel createExternalTrackerUrlTemplateModel() { return new ExternalTrackerUrlTemplateModel(); }

    protected class ExternalTrackerUrlTemplateModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_externalTrackerUrlTemplate";
        }

        @Override
        public java.lang.String getValue() {
            return getExternalTrackerUrlTemplate();
        }

        @Override
        public void setValue(java.lang.String value) {
            setExternalTrackerUrlTemplate(value);
        }
        @Override
        public String getTooltip() { return "URL templat to open an issue or story in the external tracker, using the associated ID. Example: http://localhost/mytracker?issueId=${id}"; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ExternalTrackerLabelModel externalTrackerLabelModel;

    public ExternalTrackerLabelModel getExternalTrackerLabelModel() {
        if (externalTrackerLabelModel == null) externalTrackerLabelModel = createExternalTrackerLabelModel();
        return externalTrackerLabelModel;
    }

    protected ExternalTrackerLabelModel createExternalTrackerLabelModel() { return new ExternalTrackerLabelModel(); }

    protected class ExternalTrackerLabelModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Project_externalTrackerLabel";
        }

        @Override
        public java.lang.String getValue() {
            return getExternalTrackerLabel();
        }

        @Override
        public void setValue(java.lang.String value) {
            setExternalTrackerLabel(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}