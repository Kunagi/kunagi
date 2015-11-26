// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.journal;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GProjectEvent
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<ProjectEvent> {

    public static class ProjectEventMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectEvent)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectEvent)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata subject = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "subject";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectEvent)entity).getSubject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata dateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "dateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectEvent)entity).getDateAndTime();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,label
            ,subject
            ,dateAndTime
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("label".equals(fieldName)) return label;
            if ("subject".equals(fieldName)) return subject;
            if ("subjectId".equals(fieldName)) return subject;
            if ("dateAndTime".equals(fieldName)) return dateAndTime;
            return null;
        }

    }

    public static transient final ProjectEventMetadata metadata = new ProjectEventMetadata();

    @Override
    public ProjectEventMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(ProjectEvent.class);

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ProjectEvent> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ProjectEvent>() {
    @Override
        protected Set<ProjectEvent> loadById(final String id) {
        return new AProjectEventQuery() {
            @Override
            public boolean test(ProjectEvent entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "ProjectEvent:byProject";
            }
        }.list();
        }
    };

    public static Set< ProjectEvent> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<ProjectEvent>();
        return projectBackReferencesCache.getById(project.getId());
    }

    public static Set< ProjectEvent> listByLabel(final java.lang.String label) {
        return new AProjectEventQuery() {
            @Override
            public boolean test(ProjectEvent entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "ProjectEvent:byLabel";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ProjectEvent> subjectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ProjectEvent>() {
    @Override
        protected Set<ProjectEvent> loadById(final String id) {
        return new AProjectEventQuery() {
            @Override
            public boolean test(ProjectEvent entity) {
                return id.equals(entity.getSubjectId());
            }
            @Override
            public String toString() {
                return "ProjectEvent:bySubject";
            }
        }.list();
        }
    };

    public static Set< ProjectEvent> listBySubject(final scrum.client.common.AScrumGwtEntity subject) {
        if (subject == null) return new HashSet<ProjectEvent>();
        return subjectBackReferencesCache.getById(subject.getId());
    }

    public static Set< ProjectEvent> listByDateAndTime(final ilarkesto.core.time.DateAndTime dateAndTime) {
        return new AProjectEventQuery() {
            @Override
            public boolean test(ProjectEvent entity) {
                return entity.isDateAndTime(dateAndTime);
            }
            @Override
            public String toString() {
                return "ProjectEvent:byDateAndTime";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
        subjectBackReferencesCache.clear(getSubjectId());
    }

    public abstract boolean isEditable();

    public static Set<ProjectEvent> listByIsEditable() {
        return new AProjectEventQuery() {
            @Override
            public boolean test(ProjectEvent entity) {
                return entity.isEditable();
            }
            @Override
            public String toString() {
                return "ProjectEvent:byIsEditable";
            }
        }.list();
    }

    public final boolean isNotEditable() {
        return !isEditable();
    }

    public static Set<ProjectEvent> listByIsNotEditable() {
        return new AProjectEventQuery() {
            @Override
            public boolean test(ProjectEvent entity) {
                return entity.isNotEditable();
            }
            @Override
            public String toString() {
                return "ProjectEvent:byIsNotEditable";
            }
        }.list();
    }

    public abstract static class AProjectEventQuery extends ilarkesto.core.persistance.AEntityQuery<ProjectEvent> {
    @Override
        public Class<ProjectEvent> getType() {
            return ProjectEvent.class;
        }
    }

    public static Set<ProjectEvent> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(ProjectEvent.class).list();
    }

    public static ProjectEvent getById(String id) {
        return (ProjectEvent) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getSubject()); } catch(EntityDoesNotExistException ex) {}
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("subjectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.subjectId));
        properties.put("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
    }

    @Override
    public int compareTo(ProjectEvent other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GProjectEvent.class);

    public static final String TYPE = "ProjectEvent";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getLabel());
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
            throw ex.setCallerInfo("ProjectEvent.project");
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
    // - subject
    // -----------------------------------------------------------

    private String subjectId;

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final scrum.client.common.AScrumGwtEntity getSubject() {
        try {
            return this.subjectId == null ? null : (scrum.client.common.AScrumGwtEntity) AEntity.getById(this.subjectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("ProjectEvent.subject");
        }
    }

    public final void setSubject(scrum.client.common.AScrumGwtEntity subject) {
        subject = prepareSubject(subject);
        if (isSubject(subject)) return;
        setSubjectId(subject == null ? null : subject.getId());
    }

    public final void setSubjectId(String id) {
        if (Utl.equals(subjectId, id)) return;
        clearSubjectBackReferenceCache(id, this.subjectId);
        this.subjectId = id;
            updateLastModified();
            fireModified("subjectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.subjectId));
    }

    private void clearSubjectBackReferenceCache(String oldId, String newId) {
        subjectBackReferencesCache.clear(oldId);
        subjectBackReferencesCache.clear(newId);
    }

    private final void updateSubjectId(String id) {
        setSubjectId(id);
    }

    protected scrum.client.common.AScrumGwtEntity prepareSubject(scrum.client.common.AScrumGwtEntity subject) {
        return subject;
    }

    protected void repairDeadSubjectReference(String entityId) {
        if (!isPersisted()) return;
        if (this.subjectId == null || entityId.equals(this.subjectId)) {
            setSubject(null);
        }
    }

    public final boolean isSubjectSet() {
        return this.subjectId != null;
    }

    public final boolean isSubject(scrum.client.common.AScrumGwtEntity subject) {
        if (this.subjectId == null && subject == null) return true;
        return subject != null && subject.getId().equals(this.subjectId);
    }

    // -----------------------------------------------------------
    // - dateAndTime
    // -----------------------------------------------------------

    private ilarkesto.core.time.DateAndTime dateAndTime;

    public final ilarkesto.core.time.DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public final void setDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        dateAndTime = prepareDateAndTime(dateAndTime);
        if (isDateAndTime(dateAndTime)) return;
        if (dateAndTime == null) throw new IllegalArgumentException("Mandatory field can not be set to null: dateAndTime");
        this.dateAndTime = dateAndTime;
            updateLastModified();
            fireModified("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
    }

    private final void updateDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        if (isDateAndTime(dateAndTime)) return;
        if (dateAndTime == null) throw new IllegalArgumentException("Mandatory field can not be set to null: dateAndTime");
        this.dateAndTime = dateAndTime;
            updateLastModified();
            fireModified("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
    }

    protected ilarkesto.core.time.DateAndTime prepareDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        return dateAndTime;
    }

    public final boolean isDateAndTimeSet() {
        return this.dateAndTime != null;
    }

    public final boolean isDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        if (this.dateAndTime == null && dateAndTime == null) return true;
        return this.dateAndTime != null && this.dateAndTime.equals(dateAndTime);
    }

    protected final void updateDateAndTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.DateAndTime((String)value);
        setDateAndTime((ilarkesto.core.time.DateAndTime)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("subjectId")) updateSubjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("dateAndTime")) updateDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
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
            getSubject();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead subject reference");
            repairDeadSubjectReference(this.subjectId);
        }
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
            return "ProjectEvent_label";
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
        public boolean isEditable() { return GProjectEvent.this.isEditable(); }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient DateAndTimeModel dateAndTimeModel;

    public DateAndTimeModel getDateAndTimeModel() {
        if (dateAndTimeModel == null) dateAndTimeModel = createDateAndTimeModel();
        return dateAndTimeModel;
    }

    protected DateAndTimeModel createDateAndTimeModel() { return new DateAndTimeModel(); }

    protected class DateAndTimeModel extends ilarkesto.gwt.client.editor.ADateAndTimeEditorModel {

        @Override
        public String getId() {
            return "ProjectEvent_dateAndTime";
        }

        @Override
        public ilarkesto.core.time.DateAndTime getValue() {
            return getDateAndTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.DateAndTime value) {
            setDateAndTime(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isEditable() { return GProjectEvent.this.isEditable(); }

        @Override
        protected void onChangeValue(ilarkesto.core.time.DateAndTime oldValue, ilarkesto.core.time.DateAndTime newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

}