// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.issues;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GIssue
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<Issue>, ilarkesto.core.search.Searchable {

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

    // --- AEntity ---

    public final scrum.server.issues.IssueDao getDao() {
        return issueDao;
    }

    protected void repairDeadDatob(ADatob datob) {
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

    public final java.util.Set<scrum.server.project.Requirement> getRequirements() {
        return requirementDao.getRequirementsByIssue((Issue)this);
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

    public final scrum.server.project.Project getProject() {
        try {
            return this.projectId == null ? null : (scrum.server.project.Project) AEntity.getById(this.projectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.project");
        }
    }

    public final void setProject(scrum.server.project.Project project) {
        project = prepareProject(project);
        if (isProject(project)) return;
        setProjectId(project == null ? null : project.getId());
    }

    public final void setProjectId(String id) {
        if (Utl.equals(projectId, id)) return;
        this.projectId = id;
            updateLastModified();
            fireModified("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
    }

    private final void updateProjectId(String id) {
        setProjectId(id);
    }

    protected scrum.server.project.Project prepareProject(scrum.server.project.Project project) {
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

    public final boolean isProject(scrum.server.project.Project project) {
        if (this.projectId == null && project == null) return true;
        return project != null && project.getId().equals(this.projectId);
    }

    protected final void updateProject(Object value) {
        setProject(value == null ? null : (scrum.server.project.Project)projectDao.getById((String)value));
    }
    // -----------------------------------------------------------
    // - story
    // -----------------------------------------------------------

    private String storyId;

    public final String getStoryId() {
        return this.storyId;
    }

    public final scrum.server.project.Requirement getStory() {
        try {
            return this.storyId == null ? null : (scrum.server.project.Requirement) AEntity.getById(this.storyId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.story");
        }
    }

    public final void setStory(scrum.server.project.Requirement story) {
        story = prepareStory(story);
        if (isStory(story)) return;
        setStoryId(story == null ? null : story.getId());
    }

    public final void setStoryId(String id) {
        if (Utl.equals(storyId, id)) return;
        this.storyId = id;
            updateLastModified();
            fireModified("storyId", ilarkesto.core.persistance.Persistence.propertyAsString(this.storyId));
    }

    private final void updateStoryId(String id) {
        setStoryId(id);
    }

    protected scrum.server.project.Requirement prepareStory(scrum.server.project.Requirement story) {
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

    public final boolean isStory(scrum.server.project.Requirement story) {
        if (this.storyId == null && story == null) return true;
        return story != null && story.getId().equals(this.storyId);
    }

    protected final void updateStory(Object value) {
        setStory(value == null ? null : (scrum.server.project.Requirement)requirementDao.getById((String)value));
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

    public final scrum.server.admin.User getCreator() {
        try {
            return this.creatorId == null ? null : (scrum.server.admin.User) AEntity.getById(this.creatorId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.creator");
        }
    }

    public final void setCreator(scrum.server.admin.User creator) {
        creator = prepareCreator(creator);
        if (isCreator(creator)) return;
        setCreatorId(creator == null ? null : creator.getId());
    }

    public final void setCreatorId(String id) {
        if (Utl.equals(creatorId, id)) return;
        this.creatorId = id;
            updateLastModified();
            fireModified("creatorId", ilarkesto.core.persistance.Persistence.propertyAsString(this.creatorId));
    }

    private final void updateCreatorId(String id) {
        setCreatorId(id);
    }

    protected scrum.server.admin.User prepareCreator(scrum.server.admin.User creator) {
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

    public final boolean isCreator(scrum.server.admin.User creator) {
        if (this.creatorId == null && creator == null) return true;
        return creator != null && creator.getId().equals(this.creatorId);
    }

    protected final void updateCreator(Object value) {
        setCreator(value == null ? null : (scrum.server.admin.User)userDao.getById((String)value));
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

    public final scrum.server.admin.User getOwner() {
        try {
            return this.ownerId == null ? null : (scrum.server.admin.User) AEntity.getById(this.ownerId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.owner");
        }
    }

    public final void setOwner(scrum.server.admin.User owner) {
        owner = prepareOwner(owner);
        if (isOwner(owner)) return;
        setOwnerId(owner == null ? null : owner.getId());
    }

    public final void setOwnerId(String id) {
        if (Utl.equals(ownerId, id)) return;
        this.ownerId = id;
            updateLastModified();
            fireModified("ownerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.ownerId));
    }

    private final void updateOwnerId(String id) {
        setOwnerId(id);
    }

    protected scrum.server.admin.User prepareOwner(scrum.server.admin.User owner) {
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

    public final boolean isOwner(scrum.server.admin.User owner) {
        if (this.ownerId == null && owner == null) return true;
        return owner != null && owner.getId().equals(this.ownerId);
    }

    protected final void updateOwner(Object value) {
        setOwner(value == null ? null : (scrum.server.admin.User)userDao.getById((String)value));
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

    public final java.util.Set<scrum.server.release.Release> getAffectedReleases() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.affectedReleasesIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.affectedReleases");
        }
    }

    public final void setAffectedReleases(Collection<scrum.server.release.Release> affectedReleases) {
        affectedReleases = prepareAffectedReleases(affectedReleases);
        if (affectedReleases == null) affectedReleases = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(affectedReleases);
        setAffectedReleasesIds(ids);
    }

    public final void setAffectedReleasesIds(java.util.Set<String> ids) {
        if (Utl.equals(affectedReleasesIds, ids)) return;
        affectedReleasesIds = ids;
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
    }

    private final void updateAffectedReleasesIds(java.util.Set<String> ids) {
        setAffectedReleasesIds(ids);
    }

    protected Collection<scrum.server.release.Release> prepareAffectedReleases(Collection<scrum.server.release.Release> affectedReleases) {
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

    public final boolean containsAffectedRelease(scrum.server.release.Release affectedRelease) {
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

    public final boolean addAffectedRelease(scrum.server.release.Release affectedRelease) {
        if (affectedRelease == null) throw new IllegalArgumentException("affectedRelease == null");
        if (this.affectedReleasesIds == null) this.affectedReleasesIds = new java.util.HashSet<String>();
        boolean added = this.affectedReleasesIds.add(affectedRelease.getId());
        if (added) {
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        }
        return added;
    }

    public final boolean addAffectedReleases(Collection<scrum.server.release.Release> affectedReleases) {
        if (affectedReleases == null) throw new IllegalArgumentException("affectedReleases == null");
        if (this.affectedReleasesIds == null) this.affectedReleasesIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.release.Release affectedRelease : affectedReleases) {
            added = added | this.affectedReleasesIds.add(affectedRelease.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        }
        return added;
    }

    public final boolean removeAffectedRelease(scrum.server.release.Release affectedRelease) {
        if (affectedRelease == null) return false;
        if (this.affectedReleasesIds == null) return false;
        boolean removed = this.affectedReleasesIds.remove(affectedRelease.getId());
        if (removed) {
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        }
        return removed;
    }

    public final boolean removeAffectedReleases(Collection<scrum.server.release.Release> affectedReleases) {
        if (affectedReleases == null) return false;
        if (affectedReleases.isEmpty()) return false;
        if (this.affectedReleasesIds == null) return false;
        boolean removed = false;
        for (scrum.server.release.Release _element: affectedReleases) {
            removed = removed | this.affectedReleasesIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("affectedReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.affectedReleasesIds));
        }
        return removed;
    }

    public final boolean clearAffectedReleases() {
        if (this.affectedReleasesIds == null) return false;
        if (this.affectedReleasesIds.isEmpty()) return false;
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

    public final java.util.Set<scrum.server.release.Release> getFixReleases() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.fixReleasesIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Issue.fixReleases");
        }
    }

    public final void setFixReleases(Collection<scrum.server.release.Release> fixReleases) {
        fixReleases = prepareFixReleases(fixReleases);
        if (fixReleases == null) fixReleases = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(fixReleases);
        setFixReleasesIds(ids);
    }

    public final void setFixReleasesIds(java.util.Set<String> ids) {
        if (Utl.equals(fixReleasesIds, ids)) return;
        fixReleasesIds = ids;
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
    }

    private final void updateFixReleasesIds(java.util.Set<String> ids) {
        setFixReleasesIds(ids);
    }

    protected Collection<scrum.server.release.Release> prepareFixReleases(Collection<scrum.server.release.Release> fixReleases) {
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

    public final boolean containsFixRelease(scrum.server.release.Release fixRelease) {
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

    public final boolean addFixRelease(scrum.server.release.Release fixRelease) {
        if (fixRelease == null) throw new IllegalArgumentException("fixRelease == null");
        if (this.fixReleasesIds == null) this.fixReleasesIds = new java.util.HashSet<String>();
        boolean added = this.fixReleasesIds.add(fixRelease.getId());
        if (added) {
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        }
        return added;
    }

    public final boolean addFixReleases(Collection<scrum.server.release.Release> fixReleases) {
        if (fixReleases == null) throw new IllegalArgumentException("fixReleases == null");
        if (this.fixReleasesIds == null) this.fixReleasesIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.release.Release fixRelease : fixReleases) {
            added = added | this.fixReleasesIds.add(fixRelease.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        }
        return added;
    }

    public final boolean removeFixRelease(scrum.server.release.Release fixRelease) {
        if (fixRelease == null) return false;
        if (this.fixReleasesIds == null) return false;
        boolean removed = this.fixReleasesIds.remove(fixRelease.getId());
        if (removed) {
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        }
        return removed;
    }

    public final boolean removeFixReleases(Collection<scrum.server.release.Release> fixReleases) {
        if (fixReleases == null) return false;
        if (fixReleases.isEmpty()) return false;
        if (this.fixReleasesIds == null) return false;
        boolean removed = false;
        for (scrum.server.release.Release _element: fixReleases) {
            removed = removed | this.fixReleasesIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("fixReleasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.fixReleasesIds));
        }
        return removed;
    }

    public final boolean clearFixReleases() {
        if (this.fixReleasesIds == null) return false;
        if (this.fixReleasesIds.isEmpty()) return false;
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

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadProjectReference(entityId);
        repairDeadStoryReference(entityId);
        repairDeadCreatorReference(entityId);
        repairDeadOwnerReference(entityId);
        if (this.affectedReleasesIds == null) this.affectedReleasesIds = new java.util.HashSet<String>();
        repairDeadAffectedReleaseReference(entityId);
        if (this.fixReleasesIds == null) this.fixReleasesIds = new java.util.HashSet<String>();
        repairDeadFixReleaseReference(entityId);
        if (this.themes == null) this.themes = new java.util.ArrayList<java.lang.String>();
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
        Collection<scrum.server.project.Requirement> requirement = getRequirements();
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.project.ProjectDao projectDao;

    public static final void setProjectDao(scrum.server.project.ProjectDao projectDao) {
        GIssue.projectDao = projectDao;
    }

    static scrum.server.project.RequirementDao requirementDao;

    public static final void setRequirementDao(scrum.server.project.RequirementDao requirementDao) {
        GIssue.requirementDao = requirementDao;
    }

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GIssue.userDao = userDao;
    }

    static scrum.server.release.ReleaseDao releaseDao;

    public static final void setReleaseDao(scrum.server.release.ReleaseDao releaseDao) {
        GIssue.releaseDao = releaseDao;
    }

    static scrum.server.issues.IssueDao issueDao;

    public static final void setIssueDao(scrum.server.issues.IssueDao issueDao) {
        GIssue.issueDao = issueDao;
    }

}