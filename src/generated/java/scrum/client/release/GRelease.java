// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.release;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GRelease
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Release> {

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

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Release> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Release>() {
    @Override
        protected Set<Release> loadById(final String id) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "Release:byProject";
            }
        }.list();
        }
    };

    public static Set< Release> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<Release>();
        return projectBackReferencesCache.getById(project.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Release> parentReleaseBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Release>() {
    @Override
        protected Set<Release> loadById(final String id) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return id.equals(entity.getParentReleaseId());
            }
            @Override
            public String toString() {
                return "Release:byParentRelease";
            }
        }.list();
        }
    };

    public static Set< Release> listByParentRelease(final scrum.client.release.Release parentRelease) {
        if (parentRelease == null) return new HashSet<Release>();
        return parentReleaseBackReferencesCache.getById(parentRelease.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Release> sprintsBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Release>() {
    @Override
        protected Set<Release> loadById(final String id) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.getSprintsIds().contains(id);
            }
            @Override
            public String toString() {
                return "Release:bySprints";
            }
        }.list();
        }
    };

    public static Set< Release> listBySprint(final scrum.client.sprint.Sprint sprint) {
        if (sprint == null) return new HashSet<Release>();
        return sprintsBackReferencesCache.getById(sprint.getId());
    }

    public static Set< Release> listByNumber(final int number) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.isNumber(number);
            }
            @Override
            public String toString() {
                return "Release:byNumber";
            }
        }.list();
    }

    public static Set< Release> listByLabel(final java.lang.String label) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "Release:byLabel";
            }
        }.list();
    }

    public static Set< Release> listByNote(final java.lang.String note) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.isNote(note);
            }
            @Override
            public String toString() {
                return "Release:byNote";
            }
        }.list();
    }

    public static Set< Release> listByReleaseDate(final ilarkesto.core.time.Date releaseDate) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.isReleaseDate(releaseDate);
            }
            @Override
            public String toString() {
                return "Release:byReleaseDate";
            }
        }.list();
    }

    public static Set< Release> listByReleaseTime(final ilarkesto.core.time.Time releaseTime) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.isReleaseTime(releaseTime);
            }
            @Override
            public String toString() {
                return "Release:byReleaseTime";
            }
        }.list();
    }

    public static Set< Release> listByReleased(final boolean released) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.isReleased(released);
            }
            @Override
            public String toString() {
                return "Release:byReleased";
            }
        }.list();
    }

    public static Set< Release> listByReleaseNotes(final java.lang.String releaseNotes) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.isReleaseNotes(releaseNotes);
            }
            @Override
            public String toString() {
                return "Release:byReleaseNotes";
            }
        }.list();
    }

    public static Set< Release> listByScmTag(final java.lang.String scmTag) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.isScmTag(scmTag);
            }
            @Override
            public String toString() {
                return "Release:byScmTag";
            }
        }.list();
    }

    public static Set< Release> listByScriptRunning(final boolean scriptRunning) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.isScriptRunning(scriptRunning);
            }
            @Override
            public String toString() {
                return "Release:byScriptRunning";
            }
        }.list();
    }

    public static Set< Release> listByScriptOutput(final java.lang.String scriptOutput) {
        return new AReleaseQuery() {
            @Override
            public boolean test(Release entity) {
                return entity.isScriptOutput(scriptOutput);
            }
            @Override
            public String toString() {
                return "Release:byScriptOutput";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
        parentReleaseBackReferencesCache.clear(getParentReleaseId());
        sprintsBackReferencesCache.clear(getSprintsIds());
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

    public final Set<scrum.client.release.Release> getReleases() {
        return scrum.client.release.Release.listByParentRelease((Release)this);
    }

    public final Set<scrum.client.issues.Issue> getAffectedIssues() {
        return scrum.client.issues.Issue.listByAffectedRelease((Release)this);
    }

    public final Set<scrum.client.issues.Issue> getFixIssues() {
        return scrum.client.issues.Issue.listByFixRelease((Release)this);
    }

    public final Set<scrum.client.pr.BlogEntry> getBlogEntrys() {
        return scrum.client.pr.BlogEntry.listByRelease((Release)this);
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

    public final scrum.client.project.Project getProject() {
        try {
            return this.projectId == null ? null : (scrum.client.project.Project) AEntity.getById(this.projectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Release.project");
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
    // - parentRelease
    // -----------------------------------------------------------

    private String parentReleaseId;

    public final String getParentReleaseId() {
        return this.parentReleaseId;
    }

    public final scrum.client.release.Release getParentRelease() {
        try {
            return this.parentReleaseId == null ? null : (scrum.client.release.Release) AEntity.getById(this.parentReleaseId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Release.parentRelease");
        }
    }

    public final void setParentRelease(scrum.client.release.Release parentRelease) {
        parentRelease = prepareParentRelease(parentRelease);
        if (isParentRelease(parentRelease)) return;
        setParentReleaseId(parentRelease == null ? null : parentRelease.getId());
    }

    public final void setParentReleaseId(String id) {
        if (Utl.equals(parentReleaseId, id)) return;
        clearParentReleaseBackReferenceCache(id, this.parentReleaseId);
        this.parentReleaseId = id;
            updateLastModified();
            fireModified("parentReleaseId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentReleaseId));
    }

    private void clearParentReleaseBackReferenceCache(String oldId, String newId) {
        parentReleaseBackReferencesCache.clear(oldId);
        parentReleaseBackReferencesCache.clear(newId);
    }

    private final void updateParentReleaseId(String id) {
        setParentReleaseId(id);
    }

    protected scrum.client.release.Release prepareParentRelease(scrum.client.release.Release parentRelease) {
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

    public final boolean isParentRelease(scrum.client.release.Release parentRelease) {
        if (this.parentReleaseId == null && parentRelease == null) return true;
        return parentRelease != null && parentRelease.getId().equals(this.parentReleaseId);
    }

    // -----------------------------------------------------------
    // - sprints
    // -----------------------------------------------------------

    private java.util.Set<String> sprintsIds = new java.util.HashSet<String>();

    public final Collection<String> getSprintsIds() {
        return java.util.Collections .unmodifiableCollection(this.sprintsIds);
    }

    public final java.util.Set<scrum.client.sprint.Sprint> getSprints() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.sprintsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Release.sprints");
        }
    }

    public final void setSprints(Collection<scrum.client.sprint.Sprint> sprints) {
        sprints = prepareSprints(sprints);
        if (sprints == null) sprints = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(sprints);
        setSprintsIds(ids);
    }

    public final void setSprintsIds(java.util.Set<String> ids) {
        if (Utl.equals(sprintsIds, ids)) return;
        clearSprintsBackReferenceCache(ids, sprintsIds);
        sprintsIds = ids;
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
    }

    private void clearSprintsBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        sprintsBackReferencesCache.clear(oldId);
        sprintsBackReferencesCache.clear(newId);
    }

    private final void updateSprintsIds(java.util.Set<String> ids) {
        setSprintsIds(ids);
    }

    protected Collection<scrum.client.sprint.Sprint> prepareSprints(Collection<scrum.client.sprint.Sprint> sprints) {
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

    public final boolean containsSprint(scrum.client.sprint.Sprint sprint) {
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

    public final boolean addSprint(scrum.client.sprint.Sprint sprint) {
        if (sprint == null) throw new IllegalArgumentException("sprint == null");
        if (this.sprintsIds == null) this.sprintsIds = new java.util.HashSet<String>();
        boolean added = this.sprintsIds.add(sprint.getId());
        if (added) sprintsBackReferencesCache.clear(sprint.getId());
        if (added) {
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        }
        return added;
    }

    public final boolean addSprints(Collection<scrum.client.sprint.Sprint> sprints) {
        if (sprints == null) throw new IllegalArgumentException("sprints == null");
        if (this.sprintsIds == null) this.sprintsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.sprint.Sprint sprint : sprints) {
            added = added | this.sprintsIds.add(sprint.getId());
        }
        if (added) sprintsBackReferencesCache.clear(this.sprintsIds);
        if (added) {
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        }
        return added;
    }

    public final boolean removeSprint(scrum.client.sprint.Sprint sprint) {
        if (sprint == null) return false;
        if (this.sprintsIds == null) return false;
        boolean removed = this.sprintsIds.remove(sprint.getId());
        if (removed) sprintsBackReferencesCache.clear(sprint.getId());
        if (removed) {
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        }
        return removed;
    }

    public final boolean removeSprints(Collection<scrum.client.sprint.Sprint> sprints) {
        if (sprints == null) return false;
        if (sprints.isEmpty()) return false;
        if (this.sprintsIds == null) return false;
        boolean removed = false;
        for (scrum.client.sprint.Sprint _element: sprints) {
            removed = removed | this.sprintsIds.remove(_element);
        }
        if (removed) sprintsBackReferencesCache.clear(this.sprintsIds);
        if (removed) {
            updateLastModified();
            fireModified("sprintsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintsIds));
        }
        return removed;
    }

    public final boolean clearSprints() {
        if (this.sprintsIds == null) return false;
        if (this.sprintsIds.isEmpty()) return false;
        sprintsBackReferencesCache.clear(this.sprintsIds);
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
        Collection<scrum.client.release.Release> release = getReleases();
        Collection<scrum.client.issues.Issue> affectedIssue = getAffectedIssues();
        Collection<scrum.client.issues.Issue> fixIssue = getFixIssues();
        Collection<scrum.client.pr.BlogEntry> blogEntry = getBlogEntrys();
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
            return "Release_number";
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

    private transient LabelModel labelModel;

    public LabelModel getLabelModel() {
        if (labelModel == null) labelModel = createLabelModel();
        return labelModel;
    }

    protected LabelModel createLabelModel() { return new LabelModel(); }

    protected class LabelModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Release_label";
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
        public String getTooltip() { return "This is the codename of the release, used to refer to it by project members and users."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient NoteModel noteModel;

    public NoteModel getNoteModel() {
        if (noteModel == null) noteModel = createNoteModel();
        return noteModel;
    }

    protected NoteModel createNoteModel() { return new NoteModel(); }

    protected class NoteModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Release_note";
        }

        @Override
        public java.lang.String getValue() {
            return getNote();
        }

        @Override
        public void setValue(java.lang.String value) {
            setNote(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "The development notes contain information useful for project participants and stakeholders while working on the release."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ReleaseDateModel releaseDateModel;

    public ReleaseDateModel getReleaseDateModel() {
        if (releaseDateModel == null) releaseDateModel = createReleaseDateModel();
        return releaseDateModel;
    }

    protected ReleaseDateModel createReleaseDateModel() { return new ReleaseDateModel(); }

    protected class ReleaseDateModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Release_releaseDate";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getReleaseDate();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setReleaseDate(value);
        }
        @Override
        public String getTooltip() { return "The intended or actual release date for planned and finished releases, respectively."; }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ReleaseTimeModel releaseTimeModel;

    public ReleaseTimeModel getReleaseTimeModel() {
        if (releaseTimeModel == null) releaseTimeModel = createReleaseTimeModel();
        return releaseTimeModel;
    }

    protected ReleaseTimeModel createReleaseTimeModel() { return new ReleaseTimeModel(); }

    protected class ReleaseTimeModel extends ilarkesto.gwt.client.editor.ATimeEditorModel {

        @Override
        public String getId() {
            return "Release_releaseTime";
        }

        @Override
        public ilarkesto.core.time.Time getValue() {
            return getReleaseTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.Time value) {
            setReleaseTime(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Time oldValue, ilarkesto.core.time.Time newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ReleasedModel releasedModel;

    public ReleasedModel getReleasedModel() {
        if (releasedModel == null) releasedModel = createReleasedModel();
        return releasedModel;
    }

    protected ReleasedModel createReleasedModel() { return new ReleasedModel(); }

    protected class ReleasedModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Release_released";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isReleased();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setReleased(value);
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

    private transient ReleaseNotesModel releaseNotesModel;

    public ReleaseNotesModel getReleaseNotesModel() {
        if (releaseNotesModel == null) releaseNotesModel = createReleaseNotesModel();
        return releaseNotesModel;
    }

    protected ReleaseNotesModel createReleaseNotesModel() { return new ReleaseNotesModel(); }

    protected class ReleaseNotesModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Release_releaseNotes";
        }

        @Override
        public java.lang.String getValue() {
            return getReleaseNotes();
        }

        @Override
        public void setValue(java.lang.String value) {
            setReleaseNotes(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "The release notes contain a description used to articulate the changes that this release contains to the public. It should be done in human readable format and an informative manner."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ScmTagModel scmTagModel;

    public ScmTagModel getScmTagModel() {
        if (scmTagModel == null) scmTagModel = createScmTagModel();
        return scmTagModel;
    }

    protected ScmTagModel createScmTagModel() { return new ScmTagModel(); }

    protected class ScmTagModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Release_scmTag";
        }

        @Override
        public java.lang.String getValue() {
            return getScmTag();
        }

        @Override
        public void setValue(java.lang.String value) {
            setScmTag(value);
        }
        @Override
        public String getTooltip() { return "The tag used in content management systems for this release."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ScriptRunningModel scriptRunningModel;

    public ScriptRunningModel getScriptRunningModel() {
        if (scriptRunningModel == null) scriptRunningModel = createScriptRunningModel();
        return scriptRunningModel;
    }

    protected ScriptRunningModel createScriptRunningModel() { return new ScriptRunningModel(); }

    protected class ScriptRunningModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Release_scriptRunning";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isScriptRunning();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setScriptRunning(value);
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

    private transient ScriptOutputModel scriptOutputModel;

    public ScriptOutputModel getScriptOutputModel() {
        if (scriptOutputModel == null) scriptOutputModel = createScriptOutputModel();
        return scriptOutputModel;
    }

    protected ScriptOutputModel createScriptOutputModel() { return new ScriptOutputModel(); }

    protected class ScriptOutputModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Release_scriptOutput";
        }

        @Override
        public java.lang.String getValue() {
            return getScriptOutput();
        }

        @Override
        public void setValue(java.lang.String value) {
            setScriptOutput(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}