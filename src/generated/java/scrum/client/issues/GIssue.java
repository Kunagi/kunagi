// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.issues;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GIssue
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Issue> {

    public static class IssueMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata story = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "story";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getStory();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata type = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "type";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getType();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata date = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "date";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getDate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata creator = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "creator";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getCreator();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata description = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "description";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata additionalInfo = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "additionalInfo";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getAdditionalInfo();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata statement = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "statement";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getStatement();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata issuerName = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "issuerName";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getIssuerName();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata issuerEmail = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "issuerEmail";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getIssuerEmail();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata acceptDate = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "acceptDate";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getAcceptDate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata urgent = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "urgent";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).isUrgent();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata severity = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "severity";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getSeverity();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata owner = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "owner";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getOwner();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata fixDate = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "fixDate";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getFixDate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata closeDate = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "closeDate";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getCloseDate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata suspendedUntilDate = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "suspendedUntilDate";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getSuspendedUntilDate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata affectedReleases = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "affectedReleases";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getAffectedReleases();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata fixReleases = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "fixReleases";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getFixReleases();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata published = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "published";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).isPublished();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata themes = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "themes";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getThemes();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata externalTrackerId = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "externalTrackerId";
            public static final String label = "External ID";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Issue)entity).getExternalTrackerId();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,story
            ,number
            ,type
            ,date
            ,creator
            ,label
            ,description
            ,additionalInfo
            ,statement
            ,issuerName
            ,issuerEmail
            ,acceptDate
            ,urgent
            ,severity
            ,owner
            ,fixDate
            ,closeDate
            ,suspendedUntilDate
            ,affectedReleases
            ,fixReleases
            ,published
            ,themes
            ,externalTrackerId
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("story".equals(fieldName)) return story;
            if ("storyId".equals(fieldName)) return story;
            if ("number".equals(fieldName)) return number;
            if ("type".equals(fieldName)) return type;
            if ("date".equals(fieldName)) return date;
            if ("creator".equals(fieldName)) return creator;
            if ("creatorId".equals(fieldName)) return creator;
            if ("label".equals(fieldName)) return label;
            if ("description".equals(fieldName)) return description;
            if ("additionalInfo".equals(fieldName)) return additionalInfo;
            if ("statement".equals(fieldName)) return statement;
            if ("issuerName".equals(fieldName)) return issuerName;
            if ("issuerEmail".equals(fieldName)) return issuerEmail;
            if ("acceptDate".equals(fieldName)) return acceptDate;
            if ("urgent".equals(fieldName)) return urgent;
            if ("severity".equals(fieldName)) return severity;
            if ("owner".equals(fieldName)) return owner;
            if ("ownerId".equals(fieldName)) return owner;
            if ("fixDate".equals(fieldName)) return fixDate;
            if ("closeDate".equals(fieldName)) return closeDate;
            if ("suspendedUntilDate".equals(fieldName)) return suspendedUntilDate;
            if ("affectedReleases".equals(fieldName)) return affectedReleases;
            if ("affectedReleasesIds".equals(fieldName)) return affectedReleases;
            if ("fixReleases".equals(fieldName)) return fixReleases;
            if ("fixReleasesIds".equals(fieldName)) return fixReleases;
            if ("published".equals(fieldName)) return published;
            if ("themes".equals(fieldName)) return themes;
            if ("externalTrackerId".equals(fieldName)) return externalTrackerId;
            return null;
        }

    }

    public static transient final IssueMetadata metadata = new IssueMetadata();

    @Override
    public IssueMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Issue.class);

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue>() {
    @Override
        protected Set<Issue> loadById(final String id) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "Issue:byProject";
            }
        }.list();
        }
    };

    public static Set< Issue> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<Issue>();
        return projectBackReferencesCache.getById(project.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue> storyBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue>() {
    @Override
        protected Set<Issue> loadById(final String id) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return id.equals(entity.getStoryId());
            }
            @Override
            public String toString() {
                return "Issue:byStory";
            }
        }.list();
        }
    };

    public static Set< Issue> listByStory(final scrum.client.project.Requirement story) {
        if (story == null) return new HashSet<Issue>();
        return storyBackReferencesCache.getById(story.getId());
    }

    public static Set< Issue> listByNumber(final int number) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isNumber(number);
            }
            @Override
            public String toString() {
                return "Issue:byNumber";
            }
        }.list();
    }

    public static Set< Issue> listByType(final java.lang.String type) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isType(type);
            }
            @Override
            public String toString() {
                return "Issue:byType";
            }
        }.list();
    }

    public static Set< Issue> listByDate(final ilarkesto.core.time.DateAndTime date) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isDate(date);
            }
            @Override
            public String toString() {
                return "Issue:byDate";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue> creatorBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue>() {
    @Override
        protected Set<Issue> loadById(final String id) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return id.equals(entity.getCreatorId());
            }
            @Override
            public String toString() {
                return "Issue:byCreator";
            }
        }.list();
        }
    };

    public static Set< Issue> listByCreator(final scrum.client.admin.User creator) {
        if (creator == null) return new HashSet<Issue>();
        return creatorBackReferencesCache.getById(creator.getId());
    }

    public static Set< Issue> listByLabel(final java.lang.String label) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "Issue:byLabel";
            }
        }.list();
    }

    public static Set< Issue> listByDescription(final java.lang.String description) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isDescription(description);
            }
            @Override
            public String toString() {
                return "Issue:byDescription";
            }
        }.list();
    }

    public static Set< Issue> listByAdditionalInfo(final java.lang.String additionalInfo) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isAdditionalInfo(additionalInfo);
            }
            @Override
            public String toString() {
                return "Issue:byAdditionalInfo";
            }
        }.list();
    }

    public static Set< Issue> listByStatement(final java.lang.String statement) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isStatement(statement);
            }
            @Override
            public String toString() {
                return "Issue:byStatement";
            }
        }.list();
    }

    public static Set< Issue> listByIssuerName(final java.lang.String issuerName) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isIssuerName(issuerName);
            }
            @Override
            public String toString() {
                return "Issue:byIssuerName";
            }
        }.list();
    }

    public static Set< Issue> listByIssuerEmail(final java.lang.String issuerEmail) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isIssuerEmail(issuerEmail);
            }
            @Override
            public String toString() {
                return "Issue:byIssuerEmail";
            }
        }.list();
    }

    public static Set< Issue> listByAcceptDate(final ilarkesto.core.time.Date acceptDate) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isAcceptDate(acceptDate);
            }
            @Override
            public String toString() {
                return "Issue:byAcceptDate";
            }
        }.list();
    }

    public static Set< Issue> listByUrgent(final boolean urgent) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isUrgent(urgent);
            }
            @Override
            public String toString() {
                return "Issue:byUrgent";
            }
        }.list();
    }

    public static Set< Issue> listBySeverity(final int severity) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isSeverity(severity);
            }
            @Override
            public String toString() {
                return "Issue:bySeverity";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue> ownerBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue>() {
    @Override
        protected Set<Issue> loadById(final String id) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return id.equals(entity.getOwnerId());
            }
            @Override
            public String toString() {
                return "Issue:byOwner";
            }
        }.list();
        }
    };

    public static Set< Issue> listByOwner(final scrum.client.admin.User owner) {
        if (owner == null) return new HashSet<Issue>();
        return ownerBackReferencesCache.getById(owner.getId());
    }

    public static Set< Issue> listByFixDate(final ilarkesto.core.time.Date fixDate) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isFixDate(fixDate);
            }
            @Override
            public String toString() {
                return "Issue:byFixDate";
            }
        }.list();
    }

    public static Set< Issue> listByCloseDate(final ilarkesto.core.time.Date closeDate) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isCloseDate(closeDate);
            }
            @Override
            public String toString() {
                return "Issue:byCloseDate";
            }
        }.list();
    }

    public static Set< Issue> listBySuspendedUntilDate(final ilarkesto.core.time.Date suspendedUntilDate) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isSuspendedUntilDate(suspendedUntilDate);
            }
            @Override
            public String toString() {
                return "Issue:bySuspendedUntilDate";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue> affectedReleasesBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue>() {
    @Override
        protected Set<Issue> loadById(final String id) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.getAffectedReleasesIds().contains(id);
            }
            @Override
            public String toString() {
                return "Issue:byAffectedReleases";
            }
        }.list();
        }
    };

    public static Set< Issue> listByAffectedRelease(final scrum.client.release.Release affectedRelease) {
        if (affectedRelease == null) return new HashSet<Issue>();
        return affectedReleasesBackReferencesCache.getById(affectedRelease.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue> fixReleasesBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Issue>() {
    @Override
        protected Set<Issue> loadById(final String id) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.getFixReleasesIds().contains(id);
            }
            @Override
            public String toString() {
                return "Issue:byFixReleases";
            }
        }.list();
        }
    };

    public static Set< Issue> listByFixRelease(final scrum.client.release.Release fixRelease) {
        if (fixRelease == null) return new HashSet<Issue>();
        return fixReleasesBackReferencesCache.getById(fixRelease.getId());
    }

    public static Set< Issue> listByPublished(final boolean published) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isPublished(published);
            }
            @Override
            public String toString() {
                return "Issue:byPublished";
            }
        }.list();
    }

    public static Set< Issue> listByTheme(final java.lang.String theme) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.containsTheme(theme);
            }
            @Override
            public String toString() {
                return "Issue:byThemes";
            }
        }.list();
    }

    public static Set< Issue> listByExternalTrackerId(final java.lang.String externalTrackerId) {
        return new AIssueQuery() {
            @Override
            public boolean test(Issue entity) {
                return entity.isExternalTrackerId(externalTrackerId);
            }
            @Override
            public String toString() {
                return "Issue:byExternalTrackerId";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
        storyBackReferencesCache.clear(getStoryId());
        creatorBackReferencesCache.clear(getCreatorId());
        ownerBackReferencesCache.clear(getOwnerId());
        affectedReleasesBackReferencesCache.clear(getAffectedReleasesIds());
        fixReleasesBackReferencesCache.clear(getFixReleasesIds());
    }

    public abstract static class AIssueQuery extends ilarkesto.core.persistance.AEntityQuery<Issue> {
    @Override
        public Class<Issue> getType() {
            return Issue.class;
        }
    }

    public static Set<Issue> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Issue.class).list();
    }

    public static Issue getById(String id) {
        return (Issue) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getStory()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getCreator()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getOwner()); } catch(EntityDoesNotExistException ex) {}
        if (affectedReleasesIds!=null) for (String id : affectedReleasesIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (fixReleasesIds!=null) for (String id : fixReleasesIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
    // --- back references ---
        ret.addAll(getRequirements());
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("storyId", ilarkesto.core.persistance.Persistence.propertyAsString(this.storyId));
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("type", ilarkesto.core.persistance.Persistence.propertyAsString(this.type));
        properties.put("date", ilarkesto.core.persistance.Persistence.propertyAsString(this.date));
        properties.put("creatorId", ilarkesto.core.persistance.Persistence.propertyAsString(this.creatorId));
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
        properties.put("additionalInfo", ilarkesto.core.persistance.Persistence.propertyAsString(this.additionalInfo));
        properties.put("statement", ilarkesto.core.persistance.Persistence.propertyAsString(this.statement));
        properties.put("issuerName", ilarkesto.core.persistance.Persistence.propertyAsString(this.issuerName));
        properties.put("issuerEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.issuerEmail));
        properties.put("acceptDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.acceptDate));
        properties.put("urgent", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgent));
        properties.put("severity", ilarkesto.core.persistance.Persistence.propertyAsString(this.severity));
        properties.put("ownerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.ownerId));
        properties.put("fixDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixDate));
        properties.put("closeDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.closeDate));
        properties.put("suspendedUntilDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.suspendedUntilDate));
        properties.put("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        properties.put("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        properties.put("published", ilarkesto.core.persistance.Persistence.propertyAsString(this.published));
        properties.put("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        properties.put("externalTrackerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerId));
    }

    @Override
    public int compareTo(Issue other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    public final Set<scrum.client.project.Requirement> getRequirements() {
        return scrum.client.project.Requirement.listByIssue((Issue)this);
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GIssue.class);

    public static final String TYPE = "Issue";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getLabel(), getDescription(), getAdditionalInfo(), getStatement());
    }
    // -----------------------------------------------------------
    // - project
    // -----------------------------------------------------------

    private String projectId;

    public final String getProjectId() {
        return this.projectId;
    }

    public final scrum.client.project.Project getProject() {
        try {
            return this.projectId == null ? null : (scrum.client.project.Project) AEntity.getById(this.projectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.project");
        }
    }

    public final void setProject(scrum.client.project.Project project) {
        project = prepareProject(project);
        if (isProject(project)) return;
        setProjectId(project == null ? null : project.getId());
    }

    public final void setProjectId(String id) {
        if (Utl.equals(projectId, id)) return;
        clearProjectBackReferenceCache(id, this.projectId);
        this.projectId = id;
            updateLastModified();
            fireModified("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
    }

    private void clearProjectBackReferenceCache(String oldId, String newId) {
        projectBackReferencesCache.clear(oldId);
        projectBackReferencesCache.clear(newId);
    }

    private final void updateProjectId(String id) {
        setProjectId(id);
    }

    protected scrum.client.project.Project prepareProject(scrum.client.project.Project project) {
        return project;
    }

    protected void repairDeadProjectReference(String entityId) {
        if (!isPersisted()) return;
        if (this.projectId == null || entityId.equals(this.projectId)) {
            repairMissingMaster();
        }
    }

    public final boolean isProjectSet() {
        return this.projectId != null;
    }

    public final boolean isProject(scrum.client.project.Project project) {
        if (this.projectId == null && project == null) return true;
        return project != null && project.getId().equals(this.projectId);
    }

    // -----------------------------------------------------------
    // - story
    // -----------------------------------------------------------

    private String storyId;

    public final String getStoryId() {
        return this.storyId;
    }

    public final scrum.client.project.Requirement getStory() {
        try {
            return this.storyId == null ? null : (scrum.client.project.Requirement) AEntity.getById(this.storyId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.story");
        }
    }

    public final void setStory(scrum.client.project.Requirement story) {
        story = prepareStory(story);
        if (isStory(story)) return;
        setStoryId(story == null ? null : story.getId());
    }

    public final void setStoryId(String id) {
        if (Utl.equals(storyId, id)) return;
        clearStoryBackReferenceCache(id, this.storyId);
        this.storyId = id;
            updateLastModified();
            fireModified("storyId", ilarkesto.core.persistance.Persistence.propertyAsString(this.storyId));
    }

    private void clearStoryBackReferenceCache(String oldId, String newId) {
        storyBackReferencesCache.clear(oldId);
        storyBackReferencesCache.clear(newId);
    }

    private final void updateStoryId(String id) {
        setStoryId(id);
    }

    protected scrum.client.project.Requirement prepareStory(scrum.client.project.Requirement story) {
        return story;
    }

    protected void repairDeadStoryReference(String entityId) {
        if (!isPersisted()) return;
        if (this.storyId == null || entityId.equals(this.storyId)) {
            setStory(null);
        }
    }

    public final boolean isStorySet() {
        return this.storyId != null;
    }

    public final boolean isStory(scrum.client.project.Requirement story) {
        if (this.storyId == null && story == null) return true;
        return story != null && story.getId().equals(this.storyId);
    }

    // -----------------------------------------------------------
    // - number
    // -----------------------------------------------------------

    private int number;

    public final int getNumber() {
        return number;
    }

    public final void setNumber(int number) {
        number = prepareNumber(number);
        if (isNumber(number)) return;
        this.number = number;
            updateLastModified();
            fireModified("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
    }

    private final void updateNumber(int number) {
        if (isNumber(number)) return;
        this.number = number;
            updateLastModified();
            fireModified("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
    }

    protected int prepareNumber(int number) {
        return number;
    }

    public final boolean isNumber(int number) {
        return this.number == number;
    }

    protected final void updateNumber(Object value) {
        setNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - type
    // -----------------------------------------------------------

    private java.lang.String type;

    public final java.lang.String getType() {
        return type;
    }

    public final void setType(java.lang.String type) {
        type = prepareType(type);
        if (isType(type)) return;
        this.type = type;
            updateLastModified();
            fireModified("type", ilarkesto.core.persistance.Persistence.propertyAsString(this.type));
    }

    public abstract List<java.lang.String> getTypeOptions();

    private final void updateType(java.lang.String type) {
        if (isType(type)) return;
        this.type = type;
            updateLastModified();
            fireModified("type", ilarkesto.core.persistance.Persistence.propertyAsString(this.type));
    }

    protected java.lang.String prepareType(java.lang.String type) {
         type = Str.removeControlChars(type);
        return type;
    }

    public final boolean isTypeSet() {
        return this.type != null;
    }

    public final boolean isType(java.lang.String type) {
        if (this.type == null && type == null) return true;
        return this.type != null && this.type.equals(type);
    }

    protected final void updateType(Object value) {
        setType((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - date
    // -----------------------------------------------------------

    private ilarkesto.core.time.DateAndTime date;

    public final ilarkesto.core.time.DateAndTime getDate() {
        return date;
    }

    public final void setDate(ilarkesto.core.time.DateAndTime date) {
        date = prepareDate(date);
        if (isDate(date)) return;
        if (date == null) throw new IllegalArgumentException("Mandatory field can not be set to null: date");
        this.date = date;
            updateLastModified();
            fireModified("date", ilarkesto.core.persistance.Persistence.propertyAsString(this.date));
    }

    private final void updateDate(ilarkesto.core.time.DateAndTime date) {
        if (isDate(date)) return;
        if (date == null) throw new IllegalArgumentException("Mandatory field can not be set to null: date");
        this.date = date;
            updateLastModified();
            fireModified("date", ilarkesto.core.persistance.Persistence.propertyAsString(this.date));
    }

    protected ilarkesto.core.time.DateAndTime prepareDate(ilarkesto.core.time.DateAndTime date) {
        return date;
    }

    public final boolean isDateSet() {
        return this.date != null;
    }

    public final boolean isDate(ilarkesto.core.time.DateAndTime date) {
        if (this.date == null && date == null) return true;
        return this.date != null && this.date.equals(date);
    }

    protected final void updateDate(Object value) {
        value = value == null ? null : new ilarkesto.core.time.DateAndTime((String)value);
        setDate((ilarkesto.core.time.DateAndTime)value);
    }
    // -----------------------------------------------------------
    // - creator
    // -----------------------------------------------------------

    private String creatorId;

    public final String getCreatorId() {
        return this.creatorId;
    }

    public final scrum.client.admin.User getCreator() {
        try {
            return this.creatorId == null ? null : (scrum.client.admin.User) AEntity.getById(this.creatorId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.creator");
        }
    }

    public final void setCreator(scrum.client.admin.User creator) {
        creator = prepareCreator(creator);
        if (isCreator(creator)) return;
        setCreatorId(creator == null ? null : creator.getId());
    }

    public final void setCreatorId(String id) {
        if (Utl.equals(creatorId, id)) return;
        clearCreatorBackReferenceCache(id, this.creatorId);
        this.creatorId = id;
            updateLastModified();
            fireModified("creatorId", ilarkesto.core.persistance.Persistence.propertyAsString(this.creatorId));
    }

    private void clearCreatorBackReferenceCache(String oldId, String newId) {
        creatorBackReferencesCache.clear(oldId);
        creatorBackReferencesCache.clear(newId);
    }

    private final void updateCreatorId(String id) {
        setCreatorId(id);
    }

    protected scrum.client.admin.User prepareCreator(scrum.client.admin.User creator) {
        return creator;
    }

    protected void repairDeadCreatorReference(String entityId) {
        if (!isPersisted()) return;
        if (this.creatorId == null || entityId.equals(this.creatorId)) {
            setCreator(null);
        }
    }

    public final boolean isCreatorSet() {
        return this.creatorId != null;
    }

    public final boolean isCreator(scrum.client.admin.User creator) {
        if (this.creatorId == null && creator == null) return true;
        return creator != null && creator.getId().equals(this.creatorId);
    }

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
        this.label = label;
            updateLastModified();
            fireModified("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
    }

    private final void updateLabel(java.lang.String label) {
        if (isLabel(label)) return;
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
    // - additionalInfo
    // -----------------------------------------------------------

    private java.lang.String additionalInfo;

    public final java.lang.String getAdditionalInfo() {
        return additionalInfo;
    }

    public final void setAdditionalInfo(java.lang.String additionalInfo) {
        additionalInfo = prepareAdditionalInfo(additionalInfo);
        if (isAdditionalInfo(additionalInfo)) return;
        this.additionalInfo = additionalInfo;
            updateLastModified();
            fireModified("additionalInfo", ilarkesto.core.persistance.Persistence.propertyAsString(this.additionalInfo));
    }

    private final void updateAdditionalInfo(java.lang.String additionalInfo) {
        if (isAdditionalInfo(additionalInfo)) return;
        this.additionalInfo = additionalInfo;
            updateLastModified();
            fireModified("additionalInfo", ilarkesto.core.persistance.Persistence.propertyAsString(this.additionalInfo));
    }

    protected java.lang.String prepareAdditionalInfo(java.lang.String additionalInfo) {
         additionalInfo = Str.removeControlChars(additionalInfo);
        return additionalInfo;
    }

    public final boolean isAdditionalInfoSet() {
        return this.additionalInfo != null;
    }

    public final boolean isAdditionalInfo(java.lang.String additionalInfo) {
        if (this.additionalInfo == null && additionalInfo == null) return true;
        return this.additionalInfo != null && this.additionalInfo.equals(additionalInfo);
    }

    protected final void updateAdditionalInfo(Object value) {
        setAdditionalInfo((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - statement
    // -----------------------------------------------------------

    private java.lang.String statement;

    public final java.lang.String getStatement() {
        return statement;
    }

    public final void setStatement(java.lang.String statement) {
        statement = prepareStatement(statement);
        if (isStatement(statement)) return;
        this.statement = statement;
            updateLastModified();
            fireModified("statement", ilarkesto.core.persistance.Persistence.propertyAsString(this.statement));
    }

    private final void updateStatement(java.lang.String statement) {
        if (isStatement(statement)) return;
        this.statement = statement;
            updateLastModified();
            fireModified("statement", ilarkesto.core.persistance.Persistence.propertyAsString(this.statement));
    }

    protected java.lang.String prepareStatement(java.lang.String statement) {
         statement = Str.removeControlChars(statement);
        return statement;
    }

    public final boolean isStatementSet() {
        return this.statement != null;
    }

    public final boolean isStatement(java.lang.String statement) {
        if (this.statement == null && statement == null) return true;
        return this.statement != null && this.statement.equals(statement);
    }

    protected final void updateStatement(Object value) {
        setStatement((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - issuerName
    // -----------------------------------------------------------

    private java.lang.String issuerName;

    public final java.lang.String getIssuerName() {
        return issuerName;
    }

    public final void setIssuerName(java.lang.String issuerName) {
        issuerName = prepareIssuerName(issuerName);
        if (isIssuerName(issuerName)) return;
        this.issuerName = issuerName;
            updateLastModified();
            fireModified("issuerName", ilarkesto.core.persistance.Persistence.propertyAsString(this.issuerName));
    }

    private final void updateIssuerName(java.lang.String issuerName) {
        if (isIssuerName(issuerName)) return;
        this.issuerName = issuerName;
            updateLastModified();
            fireModified("issuerName", ilarkesto.core.persistance.Persistence.propertyAsString(this.issuerName));
    }

    protected java.lang.String prepareIssuerName(java.lang.String issuerName) {
         issuerName = Str.removeControlChars(issuerName);
        return issuerName;
    }

    public final boolean isIssuerNameSet() {
        return this.issuerName != null;
    }

    public final boolean isIssuerName(java.lang.String issuerName) {
        if (this.issuerName == null && issuerName == null) return true;
        return this.issuerName != null && this.issuerName.equals(issuerName);
    }

    protected final void updateIssuerName(Object value) {
        setIssuerName((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - issuerEmail
    // -----------------------------------------------------------

    private java.lang.String issuerEmail;

    public final java.lang.String getIssuerEmail() {
        return issuerEmail;
    }

    public final void setIssuerEmail(java.lang.String issuerEmail) {
        issuerEmail = prepareIssuerEmail(issuerEmail);
        if (isIssuerEmail(issuerEmail)) return;
        this.issuerEmail = issuerEmail;
            updateLastModified();
            fireModified("issuerEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.issuerEmail));
    }

    private final void updateIssuerEmail(java.lang.String issuerEmail) {
        if (isIssuerEmail(issuerEmail)) return;
        this.issuerEmail = issuerEmail;
            updateLastModified();
            fireModified("issuerEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.issuerEmail));
    }

    protected java.lang.String prepareIssuerEmail(java.lang.String issuerEmail) {
         issuerEmail = Str.removeControlChars(issuerEmail);
        return issuerEmail;
    }

    public final boolean isIssuerEmailSet() {
        return this.issuerEmail != null;
    }

    public final boolean isIssuerEmail(java.lang.String issuerEmail) {
        if (this.issuerEmail == null && issuerEmail == null) return true;
        return this.issuerEmail != null && this.issuerEmail.equals(issuerEmail);
    }

    protected final void updateIssuerEmail(Object value) {
        setIssuerEmail((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - acceptDate
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date acceptDate;

    public final ilarkesto.core.time.Date getAcceptDate() {
        return acceptDate;
    }

    public final void setAcceptDate(ilarkesto.core.time.Date acceptDate) {
        acceptDate = prepareAcceptDate(acceptDate);
        if (isAcceptDate(acceptDate)) return;
        this.acceptDate = acceptDate;
            updateLastModified();
            fireModified("acceptDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.acceptDate));
    }

    private final void updateAcceptDate(ilarkesto.core.time.Date acceptDate) {
        if (isAcceptDate(acceptDate)) return;
        this.acceptDate = acceptDate;
            updateLastModified();
            fireModified("acceptDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.acceptDate));
    }

    protected ilarkesto.core.time.Date prepareAcceptDate(ilarkesto.core.time.Date acceptDate) {
        return acceptDate;
    }

    public final boolean isAcceptDateSet() {
        return this.acceptDate != null;
    }

    public final boolean isAcceptDate(ilarkesto.core.time.Date acceptDate) {
        if (this.acceptDate == null && acceptDate == null) return true;
        return this.acceptDate != null && this.acceptDate.equals(acceptDate);
    }

    protected final void updateAcceptDate(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setAcceptDate((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - urgent
    // -----------------------------------------------------------

    private boolean urgent;

    public final boolean isUrgent() {
        return urgent;
    }

    public final void setUrgent(boolean urgent) {
        urgent = prepareUrgent(urgent);
        if (isUrgent(urgent)) return;
        this.urgent = urgent;
            updateLastModified();
            fireModified("urgent", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgent));
    }

    private final void updateUrgent(boolean urgent) {
        if (isUrgent(urgent)) return;
        this.urgent = urgent;
            updateLastModified();
            fireModified("urgent", ilarkesto.core.persistance.Persistence.propertyAsString(this.urgent));
    }

    protected boolean prepareUrgent(boolean urgent) {
        return urgent;
    }

    public final boolean isUrgent(boolean urgent) {
        return this.urgent == urgent;
    }

    protected final void updateUrgent(Object value) {
        setUrgent((Boolean)value);
    }
    // -----------------------------------------------------------
    // - severity
    // -----------------------------------------------------------

    private int severity;

    public final int getSeverity() {
        return severity;
    }

    public final void setSeverity(int severity) {
        severity = prepareSeverity(severity);
        if (isSeverity(severity)) return;
        this.severity = severity;
            updateLastModified();
            fireModified("severity", ilarkesto.core.persistance.Persistence.propertyAsString(this.severity));
    }

    public abstract List<java.lang.Integer> getSeverityOptions();

    private final void updateSeverity(int severity) {
        if (isSeverity(severity)) return;
        this.severity = severity;
            updateLastModified();
            fireModified("severity", ilarkesto.core.persistance.Persistence.propertyAsString(this.severity));
    }

    protected int prepareSeverity(int severity) {
        return severity;
    }

    public final boolean isSeverity(int severity) {
        return this.severity == severity;
    }

    protected final void updateSeverity(Object value) {
        setSeverity((Integer)value);
    }
    // -----------------------------------------------------------
    // - owner
    // -----------------------------------------------------------

    private String ownerId;

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final scrum.client.admin.User getOwner() {
        try {
            return this.ownerId == null ? null : (scrum.client.admin.User) AEntity.getById(this.ownerId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.owner");
        }
    }

    public final void setOwner(scrum.client.admin.User owner) {
        owner = prepareOwner(owner);
        if (isOwner(owner)) return;
        setOwnerId(owner == null ? null : owner.getId());
    }

    public final void setOwnerId(String id) {
        if (Utl.equals(ownerId, id)) return;
        clearOwnerBackReferenceCache(id, this.ownerId);
        this.ownerId = id;
            updateLastModified();
            fireModified("ownerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.ownerId));
    }

    private void clearOwnerBackReferenceCache(String oldId, String newId) {
        ownerBackReferencesCache.clear(oldId);
        ownerBackReferencesCache.clear(newId);
    }

    private final void updateOwnerId(String id) {
        setOwnerId(id);
    }

    protected scrum.client.admin.User prepareOwner(scrum.client.admin.User owner) {
        return owner;
    }

    protected void repairDeadOwnerReference(String entityId) {
        if (!isPersisted()) return;
        if (this.ownerId == null || entityId.equals(this.ownerId)) {
            setOwner(null);
        }
    }

    public final boolean isOwnerSet() {
        return this.ownerId != null;
    }

    public final boolean isOwner(scrum.client.admin.User owner) {
        if (this.ownerId == null && owner == null) return true;
        return owner != null && owner.getId().equals(this.ownerId);
    }

    // -----------------------------------------------------------
    // - fixDate
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date fixDate;

    public final ilarkesto.core.time.Date getFixDate() {
        return fixDate;
    }

    public final void setFixDate(ilarkesto.core.time.Date fixDate) {
        fixDate = prepareFixDate(fixDate);
        if (isFixDate(fixDate)) return;
        this.fixDate = fixDate;
            updateLastModified();
            fireModified("fixDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixDate));
    }

    private final void updateFixDate(ilarkesto.core.time.Date fixDate) {
        if (isFixDate(fixDate)) return;
        this.fixDate = fixDate;
            updateLastModified();
            fireModified("fixDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixDate));
    }

    protected ilarkesto.core.time.Date prepareFixDate(ilarkesto.core.time.Date fixDate) {
        return fixDate;
    }

    public final boolean isFixDateSet() {
        return this.fixDate != null;
    }

    public final boolean isFixDate(ilarkesto.core.time.Date fixDate) {
        if (this.fixDate == null && fixDate == null) return true;
        return this.fixDate != null && this.fixDate.equals(fixDate);
    }

    protected final void updateFixDate(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setFixDate((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - closeDate
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date closeDate;

    public final ilarkesto.core.time.Date getCloseDate() {
        return closeDate;
    }

    public final void setCloseDate(ilarkesto.core.time.Date closeDate) {
        closeDate = prepareCloseDate(closeDate);
        if (isCloseDate(closeDate)) return;
        this.closeDate = closeDate;
            updateLastModified();
            fireModified("closeDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.closeDate));
    }

    private final void updateCloseDate(ilarkesto.core.time.Date closeDate) {
        if (isCloseDate(closeDate)) return;
        this.closeDate = closeDate;
            updateLastModified();
            fireModified("closeDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.closeDate));
    }

    protected ilarkesto.core.time.Date prepareCloseDate(ilarkesto.core.time.Date closeDate) {
        return closeDate;
    }

    public final boolean isCloseDateSet() {
        return this.closeDate != null;
    }

    public final boolean isCloseDate(ilarkesto.core.time.Date closeDate) {
        if (this.closeDate == null && closeDate == null) return true;
        return this.closeDate != null && this.closeDate.equals(closeDate);
    }

    protected final void updateCloseDate(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setCloseDate((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - suspendedUntilDate
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date suspendedUntilDate;

    public final ilarkesto.core.time.Date getSuspendedUntilDate() {
        return suspendedUntilDate;
    }

    public final void setSuspendedUntilDate(ilarkesto.core.time.Date suspendedUntilDate) {
        suspendedUntilDate = prepareSuspendedUntilDate(suspendedUntilDate);
        if (isSuspendedUntilDate(suspendedUntilDate)) return;
        this.suspendedUntilDate = suspendedUntilDate;
            updateLastModified();
            fireModified("suspendedUntilDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.suspendedUntilDate));
    }

    private final void updateSuspendedUntilDate(ilarkesto.core.time.Date suspendedUntilDate) {
        if (isSuspendedUntilDate(suspendedUntilDate)) return;
        this.suspendedUntilDate = suspendedUntilDate;
            updateLastModified();
            fireModified("suspendedUntilDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.suspendedUntilDate));
    }

    protected ilarkesto.core.time.Date prepareSuspendedUntilDate(ilarkesto.core.time.Date suspendedUntilDate) {
        return suspendedUntilDate;
    }

    public final boolean isSuspendedUntilDateSet() {
        return this.suspendedUntilDate != null;
    }

    public final boolean isSuspendedUntilDate(ilarkesto.core.time.Date suspendedUntilDate) {
        if (this.suspendedUntilDate == null && suspendedUntilDate == null) return true;
        return this.suspendedUntilDate != null && this.suspendedUntilDate.equals(suspendedUntilDate);
    }

    protected final void updateSuspendedUntilDate(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setSuspendedUntilDate((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - affectedReleases
    // -----------------------------------------------------------

    private java.util.Set<String> affectedReleasesIds = new java.util.HashSet<String>();

    public final Collection<String> getAffectedReleasesIds() {
        return java.util.Collections .unmodifiableCollection(this.affectedReleasesIds);
    }

    public final java.util.Set<scrum.client.release.Release> getAffectedReleases() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.affectedReleasesIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.affectedReleases");
        }
    }

    public final void setAffectedReleases(Collection<scrum.client.release.Release> affectedReleases) {
        affectedReleases = prepareAffectedReleases(affectedReleases);
        if (affectedReleases == null) affectedReleases = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(affectedReleases);
        setAffectedReleasesIds(ids);
    }

    public final void setAffectedReleasesIds(java.util.Set<String> ids) {
        if (Utl.equals(affectedReleasesIds, ids)) return;
        clearAffectedReleasesBackReferenceCache(ids, affectedReleasesIds);
        affectedReleasesIds = ids;
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
    }

    private void clearAffectedReleasesBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        affectedReleasesBackReferencesCache.clear(oldId);
        affectedReleasesBackReferencesCache.clear(newId);
    }

    private final void updateAffectedReleasesIds(java.util.Set<String> ids) {
        setAffectedReleasesIds(ids);
    }

    protected Collection<scrum.client.release.Release> prepareAffectedReleases(Collection<scrum.client.release.Release> affectedReleases) {
        return affectedReleases;
    }

    protected void repairDeadAffectedReleaseReference(String entityId) {
        if (!isPersisted()) return;
        if (this.affectedReleasesIds == null ) return;
        if (this.affectedReleasesIds.remove(entityId)) {
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        }
    }

    public final boolean containsAffectedRelease(scrum.client.release.Release affectedRelease) {
        if (affectedRelease == null) return false;
        if (this.affectedReleasesIds == null) return false;
        return this.affectedReleasesIds.contains(affectedRelease.getId());
    }

    public final int getAffectedReleasesCount() {
        if (this.affectedReleasesIds == null) return 0;
        return this.affectedReleasesIds.size();
    }

    public final boolean isAffectedReleasesEmpty() {
        if (this.affectedReleasesIds == null) return true;
        return this.affectedReleasesIds.isEmpty();
    }

    public final boolean addAffectedRelease(scrum.client.release.Release affectedRelease) {
        if (affectedRelease == null) throw new IllegalArgumentException("affectedRelease == null");
        if (this.affectedReleasesIds == null) this.affectedReleasesIds = new java.util.HashSet<String>();
        boolean added = this.affectedReleasesIds.add(affectedRelease.getId());
        if (added) affectedReleasesBackReferencesCache.clear(affectedRelease.getId());
        if (added) {
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        }
        return added;
    }

    public final boolean addAffectedReleases(Collection<scrum.client.release.Release> affectedReleases) {
        if (affectedReleases == null) throw new IllegalArgumentException("affectedReleases == null");
        if (this.affectedReleasesIds == null) this.affectedReleasesIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.release.Release affectedRelease : affectedReleases) {
            added = added | this.affectedReleasesIds.add(affectedRelease.getId());
        }
        if (added) affectedReleasesBackReferencesCache.clear(this.affectedReleasesIds);
        if (added) {
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        }
        return added;
    }

    public final boolean removeAffectedRelease(scrum.client.release.Release affectedRelease) {
        if (affectedRelease == null) return false;
        if (this.affectedReleasesIds == null) return false;
        boolean removed = this.affectedReleasesIds.remove(affectedRelease.getId());
        if (removed) affectedReleasesBackReferencesCache.clear(affectedRelease.getId());
        if (removed) {
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        }
        return removed;
    }

    public final boolean removeAffectedReleases(Collection<scrum.client.release.Release> affectedReleases) {
        if (affectedReleases == null) return false;
        if (affectedReleases.isEmpty()) return false;
        if (this.affectedReleasesIds == null) return false;
        boolean removed = false;
        for (scrum.client.release.Release _element: affectedReleases) {
            removed = removed | this.affectedReleasesIds.remove(_element);
        }
        if (removed) affectedReleasesBackReferencesCache.clear(this.affectedReleasesIds);
        if (removed) {
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        }
        return removed;
    }

    public final boolean clearAffectedReleases() {
        if (this.affectedReleasesIds == null) return false;
        if (this.affectedReleasesIds.isEmpty()) return false;
        affectedReleasesBackReferencesCache.clear(this.affectedReleasesIds);
        this.affectedReleasesIds.clear();
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        return true;
    }
    // -----------------------------------------------------------
    // - fixReleases
    // -----------------------------------------------------------

    private java.util.Set<String> fixReleasesIds = new java.util.HashSet<String>();

    public final Collection<String> getFixReleasesIds() {
        return java.util.Collections .unmodifiableCollection(this.fixReleasesIds);
    }

    public final java.util.Set<scrum.client.release.Release> getFixReleases() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.fixReleasesIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.fixReleases");
        }
    }

    public final void setFixReleases(Collection<scrum.client.release.Release> fixReleases) {
        fixReleases = prepareFixReleases(fixReleases);
        if (fixReleases == null) fixReleases = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(fixReleases);
        setFixReleasesIds(ids);
    }

    public final void setFixReleasesIds(java.util.Set<String> ids) {
        if (Utl.equals(fixReleasesIds, ids)) return;
        clearFixReleasesBackReferenceCache(ids, fixReleasesIds);
        fixReleasesIds = ids;
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
    }

    private void clearFixReleasesBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        fixReleasesBackReferencesCache.clear(oldId);
        fixReleasesBackReferencesCache.clear(newId);
    }

    private final void updateFixReleasesIds(java.util.Set<String> ids) {
        setFixReleasesIds(ids);
    }

    protected Collection<scrum.client.release.Release> prepareFixReleases(Collection<scrum.client.release.Release> fixReleases) {
        return fixReleases;
    }

    protected void repairDeadFixReleaseReference(String entityId) {
        if (!isPersisted()) return;
        if (this.fixReleasesIds == null ) return;
        if (this.fixReleasesIds.remove(entityId)) {
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        }
    }

    public final boolean containsFixRelease(scrum.client.release.Release fixRelease) {
        if (fixRelease == null) return false;
        if (this.fixReleasesIds == null) return false;
        return this.fixReleasesIds.contains(fixRelease.getId());
    }

    public final int getFixReleasesCount() {
        if (this.fixReleasesIds == null) return 0;
        return this.fixReleasesIds.size();
    }

    public final boolean isFixReleasesEmpty() {
        if (this.fixReleasesIds == null) return true;
        return this.fixReleasesIds.isEmpty();
    }

    public final boolean addFixRelease(scrum.client.release.Release fixRelease) {
        if (fixRelease == null) throw new IllegalArgumentException("fixRelease == null");
        if (this.fixReleasesIds == null) this.fixReleasesIds = new java.util.HashSet<String>();
        boolean added = this.fixReleasesIds.add(fixRelease.getId());
        if (added) fixReleasesBackReferencesCache.clear(fixRelease.getId());
        if (added) {
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        }
        return added;
    }

    public final boolean addFixReleases(Collection<scrum.client.release.Release> fixReleases) {
        if (fixReleases == null) throw new IllegalArgumentException("fixReleases == null");
        if (this.fixReleasesIds == null) this.fixReleasesIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.release.Release fixRelease : fixReleases) {
            added = added | this.fixReleasesIds.add(fixRelease.getId());
        }
        if (added) fixReleasesBackReferencesCache.clear(this.fixReleasesIds);
        if (added) {
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        }
        return added;
    }

    public final boolean removeFixRelease(scrum.client.release.Release fixRelease) {
        if (fixRelease == null) return false;
        if (this.fixReleasesIds == null) return false;
        boolean removed = this.fixReleasesIds.remove(fixRelease.getId());
        if (removed) fixReleasesBackReferencesCache.clear(fixRelease.getId());
        if (removed) {
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        }
        return removed;
    }

    public final boolean removeFixReleases(Collection<scrum.client.release.Release> fixReleases) {
        if (fixReleases == null) return false;
        if (fixReleases.isEmpty()) return false;
        if (this.fixReleasesIds == null) return false;
        boolean removed = false;
        for (scrum.client.release.Release _element: fixReleases) {
            removed = removed | this.fixReleasesIds.remove(_element);
        }
        if (removed) fixReleasesBackReferencesCache.clear(this.fixReleasesIds);
        if (removed) {
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        }
        return removed;
    }

    public final boolean clearFixReleases() {
        if (this.fixReleasesIds == null) return false;
        if (this.fixReleasesIds.isEmpty()) return false;
        fixReleasesBackReferencesCache.clear(this.fixReleasesIds);
        this.fixReleasesIds.clear();
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        return true;
    }
    // -----------------------------------------------------------
    // - published
    // -----------------------------------------------------------

    private boolean published;

    public final boolean isPublished() {
        return published;
    }

    public final void setPublished(boolean published) {
        published = preparePublished(published);
        if (isPublished(published)) return;
        this.published = published;
            updateLastModified();
            fireModified("published", ilarkesto.core.persistance.Persistence.propertyAsString(this.published));
    }

    private final void updatePublished(boolean published) {
        if (isPublished(published)) return;
        this.published = published;
            updateLastModified();
            fireModified("published", ilarkesto.core.persistance.Persistence.propertyAsString(this.published));
    }

    protected boolean preparePublished(boolean published) {
        return published;
    }

    public final boolean isPublished(boolean published) {
        return this.published == published;
    }

    protected final void updatePublished(Object value) {
        setPublished((Boolean)value);
    }
    // -----------------------------------------------------------
    // - themes
    // -----------------------------------------------------------

    private java.util.List<java.lang.String> themes = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getThemes() {
        return new java.util.ArrayList<java.lang.String>(themes);
    }

    public final void setThemes(Collection<java.lang.String> themes) {
        themes = prepareThemes(themes);
        if (themes == null) themes = Collections.emptyList();
        if (this.themes.equals(themes)) return;
        this.themes = new java.util.ArrayList<java.lang.String>(themes);
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
    }

    private final void updateThemes(Collection<java.lang.String> themes) {
        if (themes == null) themes = Collections.emptyList();
        if (this.themes.equals(themes)) return;
        this.themes = new java.util.ArrayList<java.lang.String>(themes);
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
    }

    protected Collection<java.lang.String> prepareThemes(Collection<java.lang.String> themes) {
        return themes;
    }

    public final boolean containsTheme(java.lang.String theme) {
        if (theme == null) return false;
        if (this.themes == null) return false;
        return this.themes.contains(theme);
    }

    public final int getThemesCount() {
        if (this.themes == null) return 0;
        return this.themes.size();
    }

    public final boolean isThemesEmpty() {
        if (this.themes == null) return true;
        return this.themes.isEmpty();
    }

    public final boolean addTheme(java.lang.String theme) {
        if (theme == null) throw new IllegalArgumentException("theme == null");
        if (this.themes == null) this.themes = new java.util.ArrayList<java.lang.String>();
        boolean added = this.themes.add(theme);
        if (added) {
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        }
        return added;
    }

    public final boolean addThemes(Collection<java.lang.String> themes) {
        if (themes == null) throw new IllegalArgumentException("themes == null");
        if (this.themes == null) this.themes = new java.util.ArrayList<java.lang.String>();
        boolean added = false;
        for (java.lang.String theme : themes) {
            added = added | this.themes.add(theme);
        }
        if (added) {
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        }
        return added;
    }

    public final boolean removeTheme(java.lang.String theme) {
        if (theme == null) return false;
        if (this.themes == null) return false;
        boolean removed = this.themes.remove(theme);
        if (removed) {
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        }
        return removed;
    }

    public final boolean removeThemes(Collection<java.lang.String> themes) {
        if (themes == null) return false;
        if (themes.isEmpty()) return false;
        if (this.themes == null) return false;
        boolean removed = false;
        for (java.lang.String _element: themes) {
            removed = removed | this.themes.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        }
        return removed;
    }

    public final boolean clearThemes() {
        if (this.themes == null) return false;
        if (this.themes.isEmpty()) return false;
        this.themes.clear();
            updateLastModified();
            fireModified("themes", ilarkesto.core.persistance.Persistence.propertyAsString(this.themes));
        return true;
    }

    public final String getThemesAsCommaSeparatedString() {
        if (this.themes == null) return null;
        if (this.themes.isEmpty()) return null;
        return Str.concat(this.themes,", ");
    }

    public final void setThemesAsCommaSeparatedString(String themes) {
        setThemes(Str.parseCommaSeparatedString(themes));
    }
    // -----------------------------------------------------------
    // - externalTrackerId
    // -----------------------------------------------------------

    private java.lang.String externalTrackerId;

    public final java.lang.String getExternalTrackerId() {
        return externalTrackerId;
    }

    public final void setExternalTrackerId(java.lang.String externalTrackerId) {
        externalTrackerId = prepareExternalTrackerId(externalTrackerId);
        if (isExternalTrackerId(externalTrackerId)) return;
        this.externalTrackerId = externalTrackerId;
            updateLastModified();
            fireModified("externalTrackerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerId));
    }

    private final void updateExternalTrackerId(java.lang.String externalTrackerId) {
        if (isExternalTrackerId(externalTrackerId)) return;
        this.externalTrackerId = externalTrackerId;
            updateLastModified();
            fireModified("externalTrackerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.externalTrackerId));
    }

    protected java.lang.String prepareExternalTrackerId(java.lang.String externalTrackerId) {
         externalTrackerId = Str.removeControlChars(externalTrackerId);
        return externalTrackerId;
    }

    public final boolean isExternalTrackerIdSet() {
        return this.externalTrackerId != null;
    }

    public final boolean isExternalTrackerId(java.lang.String externalTrackerId) {
        if (this.externalTrackerId == null && externalTrackerId == null) return true;
        return this.externalTrackerId != null && this.externalTrackerId.equals(externalTrackerId);
    }

    protected final void updateExternalTrackerId(Object value) {
        setExternalTrackerId((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("storyId")) updateStoryId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("number")) updateNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("type")) updateType(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("date")) updateDate(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
            if (property.equals("creatorId")) updateCreatorId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("description")) updateDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("additionalInfo")) updateAdditionalInfo(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("statement")) updateStatement(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("issuerName")) updateIssuerName(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("issuerEmail")) updateIssuerEmail(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("acceptDate")) updateAcceptDate(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("urgent")) updateUrgent(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("severity")) updateSeverity(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("ownerId")) updateOwnerId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("fixDate")) updateFixDate(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("closeDate")) updateCloseDate(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("suspendedUntilDate")) updateSuspendedUntilDate(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("affectedReleasesIds")) updateAffectedReleasesIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("fixReleasesIds")) updateFixReleasesIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("published")) updatePublished(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("themes")) updateThemes(ilarkesto.core.persistance.Persistence.parsePropertyStringCollection(value));
            if (property.equals("externalTrackerId")) updateExternalTrackerId(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
        }
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        if (!isProjectSet()) {
            repairMissingMaster();
        }
        try {
            getProject();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead project reference");
            repairDeadProjectReference(this.projectId);
        }
        try {
            getStory();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead story reference");
            repairDeadStoryReference(this.storyId);
        }
        try {
            getCreator();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead creator reference");
            repairDeadCreatorReference(this.creatorId);
        }
        try {
            getOwner();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead owner reference");
            repairDeadOwnerReference(this.ownerId);
        }
        if (this.affectedReleasesIds == null) this.affectedReleasesIds = new java.util.HashSet<String>();
        Set<String> affectedReleases = new HashSet<String>(this.affectedReleasesIds);
        for (String entityId : affectedReleases) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead affectedRelease reference");
                repairDeadAffectedReleaseReference(entityId);
            }
        }
        if (this.fixReleasesIds == null) this.fixReleasesIds = new java.util.HashSet<String>();
        Set<String> fixReleases = new HashSet<String>(this.fixReleasesIds);
        for (String entityId : fixReleases) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead fixRelease reference");
                repairDeadFixReleaseReference(entityId);
            }
        }
        if (this.themes == null) this.themes = new java.util.ArrayList<java.lang.String>();
        Collection<scrum.client.project.Requirement> requirement = getRequirements();
    }

    // --- PLUGIN: GwtEntityPropertyEditorClassGeneratorPlugin ---

    private transient NumberModel numberModel;

    public NumberModel getNumberModel() {
        if (numberModel == null) numberModel = createNumberModel();
        return numberModel;
    }

    protected NumberModel createNumberModel() { return new NumberModel(); }

    protected class NumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Issue_number";
        }

        @Override
        public java.lang.Integer getValue() {
            return getNumber();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setNumber(value);
        }

            @Override
            public void increment() {
                setNumber(getNumber() + 1);
            }

            @Override
            public void decrement() {
                setNumber(getNumber() - 1);
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

    private transient TypeModel typeModel;

    public TypeModel getTypeModel() {
        if (typeModel == null) typeModel = createTypeModel();
        return typeModel;
    }

    protected TypeModel createTypeModel() { return new TypeModel(); }

    protected class TypeModel extends ilarkesto.gwt.client.editor.AOptionEditorModel<java.lang.String> {

        @Override
        public String getId() {
            return "Issue_type";
        }

        @Override
        public java.lang.String getValue() {
            return getType();
        }

        @Override
        public void setValue(java.lang.String value) {
            setType(value);
        }

        @Override
        public List<java.lang.String> getOptions() {
            return getTypeOptions();
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient DateModel dateModel;

    public DateModel getDateModel() {
        if (dateModel == null) dateModel = createDateModel();
        return dateModel;
    }

    protected DateModel createDateModel() { return new DateModel(); }

    protected class DateModel extends ilarkesto.gwt.client.editor.ADateAndTimeEditorModel {

        @Override
        public String getId() {
            return "Issue_date";
        }

        @Override
        public ilarkesto.core.time.DateAndTime getValue() {
            return getDate();
        }

        @Override
        public void setValue(ilarkesto.core.time.DateAndTime value) {
            setDate(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(ilarkesto.core.time.DateAndTime oldValue, ilarkesto.core.time.DateAndTime newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient LabelModel labelModel;

    public LabelModel getLabelModel() {
        if (labelModel == null) labelModel = createLabelModel();
        return labelModel;
    }

    protected LabelModel createLabelModel() { return new LabelModel(); }

    protected class LabelModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Issue_label";
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
        public String getTooltip() { return "The label should be short (as it appears where the Issue is referenced), yet give a hint strong enough to make the content of it come to mind."; }

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
            return "Issue_description";
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
        public String getTooltip() { return "The description of an issue should give enough information for other people to understand what the issue is about. That contains information on how to reproduce an issue and what symptoms are, as well as suggestions on how to fix it."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient AdditionalInfoModel additionalInfoModel;

    public AdditionalInfoModel getAdditionalInfoModel() {
        if (additionalInfoModel == null) additionalInfoModel = createAdditionalInfoModel();
        return additionalInfoModel;
    }

    protected AdditionalInfoModel createAdditionalInfoModel() { return new AdditionalInfoModel(); }

    protected class AdditionalInfoModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Issue_additionalInfo";
        }

        @Override
        public java.lang.String getValue() {
            return getAdditionalInfo();
        }

        @Override
        public void setValue(java.lang.String value) {
            setAdditionalInfo(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "Additional info, only visible to project participants. Can be used for error details like stack traces or other information about the issues environment."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient StatementModel statementModel;

    public StatementModel getStatementModel() {
        if (statementModel == null) statementModel = createStatementModel();
        return statementModel;
    }

    protected StatementModel createStatementModel() { return new StatementModel(); }

    protected class StatementModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Issue_statement";
        }

        @Override
        public java.lang.String getValue() {
            return getStatement();
        }

        @Override
        public void setValue(java.lang.String value) {
            setStatement(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "Official statement from the Scrum Team to the public about this issue. This could be a  workaround description, the reason or some other information about status of the  issue."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient IssuerNameModel issuerNameModel;

    public IssuerNameModel getIssuerNameModel() {
        if (issuerNameModel == null) issuerNameModel = createIssuerNameModel();
        return issuerNameModel;
    }

    protected IssuerNameModel createIssuerNameModel() { return new IssuerNameModel(); }

    protected class IssuerNameModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Issue_issuerName";
        }

        @Override
        public java.lang.String getValue() {
            return getIssuerName();
        }

        @Override
        public void setValue(java.lang.String value) {
            setIssuerName(value);
        }
        @Override
        public String getTooltip() { return "The person who filed this issue."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient IssuerEmailModel issuerEmailModel;

    public IssuerEmailModel getIssuerEmailModel() {
        if (issuerEmailModel == null) issuerEmailModel = createIssuerEmailModel();
        return issuerEmailModel;
    }

    protected IssuerEmailModel createIssuerEmailModel() { return new IssuerEmailModel(); }

    protected class IssuerEmailModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Issue_issuerEmail";
        }

        @Override
        public java.lang.String getValue() {
            return getIssuerEmail();
        }

        @Override
        public void setValue(java.lang.String value) {
            setIssuerEmail(value);
        }
        @Override
        public String getTooltip() { return "E-Mail address of the person, who filed this issue."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient AcceptDateModel acceptDateModel;

    public AcceptDateModel getAcceptDateModel() {
        if (acceptDateModel == null) acceptDateModel = createAcceptDateModel();
        return acceptDateModel;
    }

    protected AcceptDateModel createAcceptDateModel() { return new AcceptDateModel(); }

    protected class AcceptDateModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Issue_acceptDate";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getAcceptDate();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setAcceptDate(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient UrgentModel urgentModel;

    public UrgentModel getUrgentModel() {
        if (urgentModel == null) urgentModel = createUrgentModel();
        return urgentModel;
    }

    protected UrgentModel createUrgentModel() { return new UrgentModel(); }

    protected class UrgentModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Issue_urgent";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isUrgent();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setUrgent(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient SeverityModel severityModel;

    public SeverityModel getSeverityModel() {
        if (severityModel == null) severityModel = createSeverityModel();
        return severityModel;
    }

    protected SeverityModel createSeverityModel() { return new SeverityModel(); }

    protected class SeverityModel extends ilarkesto.gwt.client.editor.AOptionEditorModel<java.lang.Integer> {

        @Override
        public String getId() {
            return "Issue_severity";
        }

        @Override
        public java.lang.Integer getValue() {
            return getSeverity();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setSeverity(value);
        }

        @Override
        public List<java.lang.Integer> getOptions() {
            return getSeverityOptions();
        }

        @Override
        public boolean isMandatory() { return true; }
        @Override
        public String getTooltip() { return "The level of this bug's impact. A minor bug might be a cosmetic failure, a normal bug encumbers the user's work, a severe bug might lead to loss of data or property, a critical bug makes product usage impossible."; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient FixDateModel fixDateModel;

    public FixDateModel getFixDateModel() {
        if (fixDateModel == null) fixDateModel = createFixDateModel();
        return fixDateModel;
    }

    protected FixDateModel createFixDateModel() { return new FixDateModel(); }

    protected class FixDateModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Issue_fixDate";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getFixDate();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setFixDate(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient CloseDateModel closeDateModel;

    public CloseDateModel getCloseDateModel() {
        if (closeDateModel == null) closeDateModel = createCloseDateModel();
        return closeDateModel;
    }

    protected CloseDateModel createCloseDateModel() { return new CloseDateModel(); }

    protected class CloseDateModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Issue_closeDate";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getCloseDate();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setCloseDate(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient SuspendedUntilDateModel suspendedUntilDateModel;

    public SuspendedUntilDateModel getSuspendedUntilDateModel() {
        if (suspendedUntilDateModel == null) suspendedUntilDateModel = createSuspendedUntilDateModel();
        return suspendedUntilDateModel;
    }

    protected SuspendedUntilDateModel createSuspendedUntilDateModel() { return new SuspendedUntilDateModel(); }

    protected class SuspendedUntilDateModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Issue_suspendedUntilDate";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getSuspendedUntilDate();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setSuspendedUntilDate(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PublishedModel publishedModel;

    public PublishedModel getPublishedModel() {
        if (publishedModel == null) publishedModel = createPublishedModel();
        return publishedModel;
    }

    protected PublishedModel createPublishedModel() { return new PublishedModel(); }

    protected class PublishedModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Issue_published";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isPublished();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setPublished(value);
        }

        @Override
        public boolean isMandatory() { return true; }
        @Override
        public String getTooltip() { return "Issue is visible on the public homepage."; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient ExternalTrackerIdModel externalTrackerIdModel;

    public ExternalTrackerIdModel getExternalTrackerIdModel() {
        if (externalTrackerIdModel == null) externalTrackerIdModel = createExternalTrackerIdModel();
        return externalTrackerIdModel;
    }

    protected ExternalTrackerIdModel createExternalTrackerIdModel() { return new ExternalTrackerIdModel(); }

    protected class ExternalTrackerIdModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Issue_externalTrackerId";
        }

        @Override
        public java.lang.String getValue() {
            return getExternalTrackerId();
        }

        @Override
        public void setValue(java.lang.String value) {
            setExternalTrackerId(value);
        }
        @Override
        public String getTooltip() { return "External system ID. From other bug tracker or else."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}