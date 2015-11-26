// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.release;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GRelease
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<Release>, ilarkesto.core.search.Searchable {

    public static class ReleaseMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata parentRelease = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "parentRelease";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getParentRelease();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata sprints = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "sprints";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getSprints();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata note = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "note";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getNote();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata releaseDate = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "releaseDate";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getReleaseDate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata releaseTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "releaseTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getReleaseTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata released = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "released";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).isReleased();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata releaseNotes = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "releaseNotes";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getReleaseNotes();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata scmTag = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "scmTag";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getScmTag();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata scriptRunning = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "scriptRunning";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).isScriptRunning();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata scriptOutput = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "scriptOutput";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Release)entity).getScriptOutput();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,parentRelease
            ,sprints
            ,number
            ,label
            ,note
            ,releaseDate
            ,releaseTime
            ,released
            ,releaseNotes
            ,scmTag
            ,scriptRunning
            ,scriptOutput
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("parentRelease".equals(fieldName)) return parentRelease;
            if ("parentReleaseId".equals(fieldName)) return parentRelease;
            if ("sprints".equals(fieldName)) return sprints;
            if ("sprintsIds".equals(fieldName)) return sprints;
            if ("number".equals(fieldName)) return number;
            if ("label".equals(fieldName)) return label;
            if ("note".equals(fieldName)) return note;
            if ("releaseDate".equals(fieldName)) return releaseDate;
            if ("releaseTime".equals(fieldName)) return releaseTime;
            if ("released".equals(fieldName)) return released;
            if ("releaseNotes".equals(fieldName)) return releaseNotes;
            if ("scmTag".equals(fieldName)) return scmTag;
            if ("scriptRunning".equals(fieldName)) return scriptRunning;
            if ("scriptOutput".equals(fieldName)) return scriptOutput;
            return null;
        }

    }

    public static transient final ReleaseMetadata metadata = new ReleaseMetadata();

    @Override
    public ReleaseMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Release.class);

    // --- AEntity ---

    public final scrum.server.release.ReleaseDao getDao() {
        return releaseDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class AReleaseQuery extends ilarkesto.core.persistance.AEntityQuery<Release> {
    @Override
        public Class<Release> getType() {
            return Release.class;
        }
    }

    public static Set<Release> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Release.class).list();
    }

    public static Release getById(String id) {
        return (Release) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getParentRelease()); } catch(EntityDoesNotExistException ex) {}
        if (sprintsIds!=null) for (String id : sprintsIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
    // --- back references ---
        ret.addAll(getReleases());
        ret.addAll(getAffectedIssues());
        ret.addAll(getFixIssues());
        ret.addAll(getBlogEntrys());
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("parentReleaseId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentReleaseId));
        properties.put("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("note", ilarkesto.core.persistance.Persistence.propertyAsString(this.note));
        properties.put("releaseDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseDate));
        properties.put("releaseTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseTime));
        properties.put("released", ilarkesto.core.persistance.Persistence.propertyAsString(this.released));
        properties.put("releaseNotes", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseNotes));
        properties.put("scmTag", ilarkesto.core.persistance.Persistence.propertyAsString(this.scmTag));
        properties.put("scriptRunning", ilarkesto.core.persistance.Persistence.propertyAsString(this.scriptRunning));
        properties.put("scriptOutput", ilarkesto.core.persistance.Persistence.propertyAsString(this.scriptOutput));
    }

    @Override
    public int compareTo(Release other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    public final java.util.Set<scrum.server.release.Release> getReleases() {
        return releaseDao.getReleasesByParentRelease((Release)this);
    }

    public final java.util.Set<scrum.server.issues.Issue> getAffectedIssues() {
        return issueDao.getIssuesByAffectedRelease((Release)this);
    }

    public final java.util.Set<scrum.server.issues.Issue> getFixIssues() {
        return issueDao.getIssuesByFixRelease((Release)this);
    }

    public final java.util.Set<scrum.server.pr.BlogEntry> getBlogEntrys() {
        return blogEntryDao.getBlogEntrysByRelease((Release)this);
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GRelease.class);

    public static final String TYPE = "Release";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getLabel(), getNote(), getReleaseNotes(), getScmTag());
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
            throw ex.setCallerInfo("Release.project");
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
    // - parentRelease
    // -----------------------------------------------------------

    private String parentReleaseId;

    public final String getParentReleaseId() {
        return this.parentReleaseId;
    }

    public final scrum.server.release.Release getParentRelease() {
        try {
            return this.parentReleaseId == null ? null : (scrum.server.release.Release) AEntity.getById(this.parentReleaseId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Release.parentRelease");
        }
    }

    public final void setParentRelease(scrum.server.release.Release parentRelease) {
        parentRelease = prepareParentRelease(parentRelease);
        if (isParentRelease(parentRelease)) return;
        setParentReleaseId(parentRelease == null ? null : parentRelease.getId());
    }

    public final void setParentReleaseId(String id) {
        if (Utl.equals(parentReleaseId, id)) return;
        this.parentReleaseId = id;
            updateLastModified();
            fireModified("parentReleaseId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentReleaseId));
    }

    private final void updateParentReleaseId(String id) {
        setParentReleaseId(id);
    }

    protected scrum.server.release.Release prepareParentRelease(scrum.server.release.Release parentRelease) {
        return parentRelease;
    }

    protected void repairDeadParentReleaseReference(String entityId) {
        if (!isPersisted()) return;
        if (this.parentReleaseId == null || entityId.equals(this.parentReleaseId)) {
            setParentRelease(null);
        }
    }

    public final boolean isParentReleaseSet() {
        return this.parentReleaseId != null;
    }

    public final boolean isParentRelease(scrum.server.release.Release parentRelease) {
        if (this.parentReleaseId == null && parentRelease == null) return true;
        return parentRelease != null && parentRelease.getId().equals(this.parentReleaseId);
    }

    protected final void updateParentRelease(Object value) {
        setParentRelease(value == null ? null : (scrum.server.release.Release)releaseDao.getById((String)value));
    }
    // -----------------------------------------------------------
    // - sprints
    // -----------------------------------------------------------

    private java.util.Set<String> sprintsIds = new java.util.HashSet<String>();

    public final Collection<String> getSprintsIds() {
        return java.util.Collections .unmodifiableCollection(this.sprintsIds);
    }

    public final java.util.Set<scrum.server.sprint.Sprint> getSprints() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.sprintsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Release.sprints");
        }
    }

    public final void setSprints(Collection<scrum.server.sprint.Sprint> sprints) {
        sprints = prepareSprints(sprints);
        if (sprints == null) sprints = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(sprints);
        setSprintsIds(ids);
    }

    public final void setSprintsIds(java.util.Set<String> ids) {
        if (Utl.equals(sprintsIds, ids)) return;
        sprintsIds = ids;
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
    }

    private final void updateSprintsIds(java.util.Set<String> ids) {
        setSprintsIds(ids);
    }

    protected Collection<scrum.server.sprint.Sprint> prepareSprints(Collection<scrum.server.sprint.Sprint> sprints) {
        return sprints;
    }

    protected void repairDeadSprintReference(String entityId) {
        if (!isPersisted()) return;
        if (this.sprintsIds == null ) return;
        if (this.sprintsIds.remove(entityId)) {
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        }
    }

    public final boolean containsSprint(scrum.server.sprint.Sprint sprint) {
        if (sprint == null) return false;
        if (this.sprintsIds == null) return false;
        return this.sprintsIds.contains(sprint.getId());
    }

    public final int getSprintsCount() {
        if (this.sprintsIds == null) return 0;
        return this.sprintsIds.size();
    }

    public final boolean isSprintsEmpty() {
        if (this.sprintsIds == null) return true;
        return this.sprintsIds.isEmpty();
    }

    public final boolean addSprint(scrum.server.sprint.Sprint sprint) {
        if (sprint == null) throw new IllegalArgumentException("sprint == null");
        if (this.sprintsIds == null) this.sprintsIds = new java.util.HashSet<String>();
        boolean added = this.sprintsIds.add(sprint.getId());
        if (added) {
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        }
        return added;
    }

    public final boolean addSprints(Collection<scrum.server.sprint.Sprint> sprints) {
        if (sprints == null) throw new IllegalArgumentException("sprints == null");
        if (this.sprintsIds == null) this.sprintsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.sprint.Sprint sprint : sprints) {
            added = added | this.sprintsIds.add(sprint.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        }
        return added;
    }

    public final boolean removeSprint(scrum.server.sprint.Sprint sprint) {
        if (sprint == null) return false;
        if (this.sprintsIds == null) return false;
        boolean removed = this.sprintsIds.remove(sprint.getId());
        if (removed) {
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        }
        return removed;
    }

    public final boolean removeSprints(Collection<scrum.server.sprint.Sprint> sprints) {
        if (sprints == null) return false;
        if (sprints.isEmpty()) return false;
        if (this.sprintsIds == null) return false;
        boolean removed = false;
        for (scrum.server.sprint.Sprint _element: sprints) {
            removed = removed | this.sprintsIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        }
        return removed;
    }

    public final boolean clearSprints() {
        if (this.sprintsIds == null) return false;
        if (this.sprintsIds.isEmpty()) return false;
        this.sprintsIds.clear();
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        return true;
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
        this.label = label;
            updateLastModified();
            fireModified("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
    }

    private final void updateLabel(java.lang.String label) {
        if (isLabel(label)) return;
        if (label == null) throw new IllegalArgumentException("Mandatory field can not be set to null: label");
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
    // - note
    // -----------------------------------------------------------

    private java.lang.String note;

    public final java.lang.String getNote() {
        return note;
    }

    public final void setNote(java.lang.String note) {
        note = prepareNote(note);
        if (isNote(note)) return;
        this.note = note;
            updateLastModified();
            fireModified("note", ilarkesto.core.persistance.Persistence.propertyAsString(this.note));
    }

    private final void updateNote(java.lang.String note) {
        if (isNote(note)) return;
        this.note = note;
            updateLastModified();
            fireModified("note", ilarkesto.core.persistance.Persistence.propertyAsString(this.note));
    }

    protected java.lang.String prepareNote(java.lang.String note) {
         note = Str.removeControlChars(note);
        return note;
    }

    public final boolean isNoteSet() {
        return this.note != null;
    }

    public final boolean isNote(java.lang.String note) {
        if (this.note == null && note == null) return true;
        return this.note != null && this.note.equals(note);
    }

    protected final void updateNote(Object value) {
        setNote((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - releaseDate
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date releaseDate;

    public final ilarkesto.core.time.Date getReleaseDate() {
        return releaseDate;
    }

    public final void setReleaseDate(ilarkesto.core.time.Date releaseDate) {
        releaseDate = prepareReleaseDate(releaseDate);
        if (isReleaseDate(releaseDate)) return;
        this.releaseDate = releaseDate;
            updateLastModified();
            fireModified("releaseDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseDate));
    }

    private final void updateReleaseDate(ilarkesto.core.time.Date releaseDate) {
        if (isReleaseDate(releaseDate)) return;
        this.releaseDate = releaseDate;
            updateLastModified();
            fireModified("releaseDate", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseDate));
    }

    protected ilarkesto.core.time.Date prepareReleaseDate(ilarkesto.core.time.Date releaseDate) {
        return releaseDate;
    }

    public final boolean isReleaseDateSet() {
        return this.releaseDate != null;
    }

    public final boolean isReleaseDate(ilarkesto.core.time.Date releaseDate) {
        if (this.releaseDate == null && releaseDate == null) return true;
        return this.releaseDate != null && this.releaseDate.equals(releaseDate);
    }

    protected final void updateReleaseDate(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setReleaseDate((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - releaseTime
    // -----------------------------------------------------------

    private ilarkesto.core.time.Time releaseTime;

    public final ilarkesto.core.time.Time getReleaseTime() {
        return releaseTime;
    }

    public final void setReleaseTime(ilarkesto.core.time.Time releaseTime) {
        releaseTime = prepareReleaseTime(releaseTime);
        if (isReleaseTime(releaseTime)) return;
        this.releaseTime = releaseTime;
            updateLastModified();
            fireModified("releaseTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseTime));
    }

    private final void updateReleaseTime(ilarkesto.core.time.Time releaseTime) {
        if (isReleaseTime(releaseTime)) return;
        this.releaseTime = releaseTime;
            updateLastModified();
            fireModified("releaseTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseTime));
    }

    protected ilarkesto.core.time.Time prepareReleaseTime(ilarkesto.core.time.Time releaseTime) {
        return releaseTime;
    }

    public final boolean isReleaseTimeSet() {
        return this.releaseTime != null;
    }

    public final boolean isReleaseTime(ilarkesto.core.time.Time releaseTime) {
        if (this.releaseTime == null && releaseTime == null) return true;
        return this.releaseTime != null && this.releaseTime.equals(releaseTime);
    }

    protected final void updateReleaseTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Time((String)value);
        setReleaseTime((ilarkesto.core.time.Time)value);
    }
    // -----------------------------------------------------------
    // - released
    // -----------------------------------------------------------

    private boolean released;

    public final boolean isReleased() {
        return released;
    }

    public final void setReleased(boolean released) {
        released = prepareReleased(released);
        if (isReleased(released)) return;
        this.released = released;
            updateLastModified();
            fireModified("released", ilarkesto.core.persistance.Persistence.propertyAsString(this.released));
    }

    private final void updateReleased(boolean released) {
        if (isReleased(released)) return;
        this.released = released;
            updateLastModified();
            fireModified("released", ilarkesto.core.persistance.Persistence.propertyAsString(this.released));
    }

    protected boolean prepareReleased(boolean released) {
        return released;
    }

    public final boolean isReleased(boolean released) {
        return this.released == released;
    }

    protected final void updateReleased(Object value) {
        setReleased((Boolean)value);
    }
    // -----------------------------------------------------------
    // - releaseNotes
    // -----------------------------------------------------------

    private java.lang.String releaseNotes;

    public final java.lang.String getReleaseNotes() {
        return releaseNotes;
    }

    public final void setReleaseNotes(java.lang.String releaseNotes) {
        releaseNotes = prepareReleaseNotes(releaseNotes);
        if (isReleaseNotes(releaseNotes)) return;
        this.releaseNotes = releaseNotes;
            updateLastModified();
            fireModified("releaseNotes", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseNotes));
    }

    private final void updateReleaseNotes(java.lang.String releaseNotes) {
        if (isReleaseNotes(releaseNotes)) return;
        this.releaseNotes = releaseNotes;
            updateLastModified();
            fireModified("releaseNotes", ilarkesto.core.persistance.Persistence.propertyAsString(this.releaseNotes));
    }

    protected java.lang.String prepareReleaseNotes(java.lang.String releaseNotes) {
         releaseNotes = Str.removeControlChars(releaseNotes);
        return releaseNotes;
    }

    public final boolean isReleaseNotesSet() {
        return this.releaseNotes != null;
    }

    public final boolean isReleaseNotes(java.lang.String releaseNotes) {
        if (this.releaseNotes == null && releaseNotes == null) return true;
        return this.releaseNotes != null && this.releaseNotes.equals(releaseNotes);
    }

    protected final void updateReleaseNotes(Object value) {
        setReleaseNotes((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - scmTag
    // -----------------------------------------------------------

    private java.lang.String scmTag;

    public final java.lang.String getScmTag() {
        return scmTag;
    }

    public final void setScmTag(java.lang.String scmTag) {
        scmTag = prepareScmTag(scmTag);
        if (isScmTag(scmTag)) return;
        this.scmTag = scmTag;
            updateLastModified();
            fireModified("scmTag", ilarkesto.core.persistance.Persistence.propertyAsString(this.scmTag));
    }

    private final void updateScmTag(java.lang.String scmTag) {
        if (isScmTag(scmTag)) return;
        this.scmTag = scmTag;
            updateLastModified();
            fireModified("scmTag", ilarkesto.core.persistance.Persistence.propertyAsString(this.scmTag));
    }

    protected java.lang.String prepareScmTag(java.lang.String scmTag) {
         scmTag = Str.removeControlChars(scmTag);
        return scmTag;
    }

    public final boolean isScmTagSet() {
        return this.scmTag != null;
    }

    public final boolean isScmTag(java.lang.String scmTag) {
        if (this.scmTag == null && scmTag == null) return true;
        return this.scmTag != null && this.scmTag.equals(scmTag);
    }

    protected final void updateScmTag(Object value) {
        setScmTag((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - scriptRunning
    // -----------------------------------------------------------

    private boolean scriptRunning;

    public final boolean isScriptRunning() {
        return scriptRunning;
    }

    public final void setScriptRunning(boolean scriptRunning) {
        scriptRunning = prepareScriptRunning(scriptRunning);
        if (isScriptRunning(scriptRunning)) return;
        this.scriptRunning = scriptRunning;
            updateLastModified();
            fireModified("scriptRunning", ilarkesto.core.persistance.Persistence.propertyAsString(this.scriptRunning));
    }

    private final void updateScriptRunning(boolean scriptRunning) {
        if (isScriptRunning(scriptRunning)) return;
        this.scriptRunning = scriptRunning;
            updateLastModified();
            fireModified("scriptRunning", ilarkesto.core.persistance.Persistence.propertyAsString(this.scriptRunning));
    }

    protected boolean prepareScriptRunning(boolean scriptRunning) {
        return scriptRunning;
    }

    public final boolean isScriptRunning(boolean scriptRunning) {
        return this.scriptRunning == scriptRunning;
    }

    protected final void updateScriptRunning(Object value) {
        setScriptRunning((Boolean)value);
    }
    // -----------------------------------------------------------
    // - scriptOutput
    // -----------------------------------------------------------

    private java.lang.String scriptOutput;

    public final java.lang.String getScriptOutput() {
        return scriptOutput;
    }

    public final void setScriptOutput(java.lang.String scriptOutput) {
        scriptOutput = prepareScriptOutput(scriptOutput);
        if (isScriptOutput(scriptOutput)) return;
        this.scriptOutput = scriptOutput;
            updateLastModified();
            fireModified("scriptOutput", ilarkesto.core.persistance.Persistence.propertyAsString(this.scriptOutput));
    }

    private final void updateScriptOutput(java.lang.String scriptOutput) {
        if (isScriptOutput(scriptOutput)) return;
        this.scriptOutput = scriptOutput;
            updateLastModified();
            fireModified("scriptOutput", ilarkesto.core.persistance.Persistence.propertyAsString(this.scriptOutput));
    }

    protected java.lang.String prepareScriptOutput(java.lang.String scriptOutput) {
         scriptOutput = Str.removeControlChars(scriptOutput);
        return scriptOutput;
    }

    public final boolean isScriptOutputSet() {
        return this.scriptOutput != null;
    }

    public final boolean isScriptOutput(java.lang.String scriptOutput) {
        if (this.scriptOutput == null && scriptOutput == null) return true;
        return this.scriptOutput != null && this.scriptOutput.equals(scriptOutput);
    }

    protected final void updateScriptOutput(Object value) {
        setScriptOutput((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("parentReleaseId")) updateParentReleaseId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("sprintsIds")) updateSprintsIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("number")) updateNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("note")) updateNote(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("releaseDate")) updateReleaseDate(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("releaseTime")) updateReleaseTime(ilarkesto.core.persistance.Persistence.parsePropertyTime(value));
            if (property.equals("released")) updateReleased(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("releaseNotes")) updateReleaseNotes(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("scmTag")) updateScmTag(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("scriptRunning")) updateScriptRunning(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("scriptOutput")) updateScriptOutput(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadProjectReference(entityId);
        repairDeadParentReleaseReference(entityId);
        if (this.sprintsIds == null) this.sprintsIds = new java.util.HashSet<String>();
        repairDeadSprintReference(entityId);
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
            getParentRelease();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead parentRelease reference");
            repairDeadParentReleaseReference(this.parentReleaseId);
        }
        if (this.sprintsIds == null) this.sprintsIds = new java.util.HashSet<String>();
        Set<String> sprints = new HashSet<String>(this.sprintsIds);
        for (String entityId : sprints) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead sprint reference");
                repairDeadSprintReference(entityId);
            }
        }
        Collection<scrum.server.release.Release> release = getReleases();
        Collection<scrum.server.issues.Issue> affectedIssue = getAffectedIssues();
        Collection<scrum.server.issues.Issue> fixIssue = getFixIssues();
        Collection<scrum.server.pr.BlogEntry> blogEntry = getBlogEntrys();
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.project.ProjectDao projectDao;

    public static final void setProjectDao(scrum.server.project.ProjectDao projectDao) {
        GRelease.projectDao = projectDao;
    }

    static scrum.server.sprint.SprintDao sprintDao;

    public static final void setSprintDao(scrum.server.sprint.SprintDao sprintDao) {
        GRelease.sprintDao = sprintDao;
    }

    static scrum.server.release.ReleaseDao releaseDao;

    public static final void setReleaseDao(scrum.server.release.ReleaseDao releaseDao) {
        GRelease.releaseDao = releaseDao;
    }

    static scrum.server.issues.IssueDao issueDao;

    public static final void setIssueDao(scrum.server.issues.IssueDao issueDao) {
        GRelease.issueDao = issueDao;
    }

    static scrum.server.pr.BlogEntryDao blogEntryDao;

    public static final void setBlogEntryDao(scrum.server.pr.BlogEntryDao blogEntryDao) {
        GRelease.blogEntryDao = blogEntryDao;
    }

}