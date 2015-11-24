// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.files;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GFile
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<File> {

    public static class FileMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((File)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata filename = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "filename";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((File)entity).getFilename();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata uploadTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "uploadTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((File)entity).getUploadTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((File)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((File)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata note = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "note";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((File)entity).getNote();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,filename
            ,uploadTime
            ,label
            ,number
            ,note
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("filename".equals(fieldName)) return filename;
            if ("uploadTime".equals(fieldName)) return uploadTime;
            if ("label".equals(fieldName)) return label;
            if ("number".equals(fieldName)) return number;
            if ("note".equals(fieldName)) return note;
            return null;
        }

    }

    public static transient final FileMetadata metadata = new FileMetadata();

    @Override
    public FileMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(File.class);

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<File> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<File>() {
    @Override
        protected Set<File> loadById(final String id) {
        return new AFileQuery() {
            @Override
            public boolean test(File entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "File:byProject";
            }
        }.list();
        }
    };

    public static Set< File> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<File>();
        return projectBackReferencesCache.getById(project.getId());
    }

    public static Set< File> listByFilename(final java.lang.String filename) {
        return new AFileQuery() {
            @Override
            public boolean test(File entity) {
                return entity.isFilename(filename);
            }
            @Override
            public String toString() {
                return "File:byFilename";
            }
        }.list();
    }

    public static Set< File> listByUploadTime(final ilarkesto.core.time.DateAndTime uploadTime) {
        return new AFileQuery() {
            @Override
            public boolean test(File entity) {
                return entity.isUploadTime(uploadTime);
            }
            @Override
            public String toString() {
                return "File:byUploadTime";
            }
        }.list();
    }

    public static Set< File> listByLabel(final java.lang.String label) {
        return new AFileQuery() {
            @Override
            public boolean test(File entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "File:byLabel";
            }
        }.list();
    }

    public static Set< File> listByNumber(final int number) {
        return new AFileQuery() {
            @Override
            public boolean test(File entity) {
                return entity.isNumber(number);
            }
            @Override
            public String toString() {
                return "File:byNumber";
            }
        }.list();
    }

    public static Set< File> listByNote(final java.lang.String note) {
        return new AFileQuery() {
            @Override
            public boolean test(File entity) {
                return entity.isNote(note);
            }
            @Override
            public String toString() {
                return "File:byNote";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
    }

    public abstract static class AFileQuery extends ilarkesto.core.persistance.AEntityQuery<File> {
    @Override
        public Class<File> getType() {
            return File.class;
        }
    }

    public static Set<File> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(File.class).list();
    }

    public static File getById(String id) {
        return (File) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("filename", ilarkesto.core.persistance.Persistence.propertyAsString(this.filename));
        properties.put("uploadTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.uploadTime));
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("note", ilarkesto.core.persistance.Persistence.propertyAsString(this.note));
    }

    @Override
    public int compareTo(File other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GFile.class);

    public static final String TYPE = "File";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getFilename(), getLabel(), getNote());
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
            throw ex.setCallerInfo("File.project");
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
    // - filename
    // -----------------------------------------------------------

    private java.lang.String filename;

    public final java.lang.String getFilename() {
        return filename;
    }

    public final void setFilename(java.lang.String filename) {
        filename = prepareFilename(filename);
        if (isFilename(filename)) return;
        if (filename == null) throw new IllegalArgumentException("Mandatory field can not be set to null: filename");
        this.filename = filename;
            updateLastModified();
            fireModified("filename", ilarkesto.core.persistance.Persistence.propertyAsString(this.filename));
    }

    private final void updateFilename(java.lang.String filename) {
        if (isFilename(filename)) return;
        if (filename == null) throw new IllegalArgumentException("Mandatory field can not be set to null: filename");
        this.filename = filename;
            updateLastModified();
            fireModified("filename", ilarkesto.core.persistance.Persistence.propertyAsString(this.filename));
    }

    protected java.lang.String prepareFilename(java.lang.String filename) {
        // filename = Str.removeUnreadableChars(filename);
        return filename;
    }

    public final boolean isFilenameSet() {
        return this.filename != null;
    }

    public final boolean isFilename(java.lang.String filename) {
        if (this.filename == null && filename == null) return true;
        return this.filename != null && this.filename.equals(filename);
    }

    protected final void updateFilename(Object value) {
        setFilename((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - uploadTime
    // -----------------------------------------------------------

    private ilarkesto.core.time.DateAndTime uploadTime;

    public final ilarkesto.core.time.DateAndTime getUploadTime() {
        return uploadTime;
    }

    public final void setUploadTime(ilarkesto.core.time.DateAndTime uploadTime) {
        uploadTime = prepareUploadTime(uploadTime);
        if (isUploadTime(uploadTime)) return;
        if (uploadTime == null) throw new IllegalArgumentException("Mandatory field can not be set to null: uploadTime");
        this.uploadTime = uploadTime;
            updateLastModified();
            fireModified("uploadTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.uploadTime));
    }

    private final void updateUploadTime(ilarkesto.core.time.DateAndTime uploadTime) {
        if (isUploadTime(uploadTime)) return;
        if (uploadTime == null) throw new IllegalArgumentException("Mandatory field can not be set to null: uploadTime");
        this.uploadTime = uploadTime;
            updateLastModified();
            fireModified("uploadTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.uploadTime));
    }

    protected ilarkesto.core.time.DateAndTime prepareUploadTime(ilarkesto.core.time.DateAndTime uploadTime) {
        return uploadTime;
    }

    public final boolean isUploadTimeSet() {
        return this.uploadTime != null;
    }

    public final boolean isUploadTime(ilarkesto.core.time.DateAndTime uploadTime) {
        if (this.uploadTime == null && uploadTime == null) return true;
        return this.uploadTime != null && this.uploadTime.equals(uploadTime);
    }

    protected final void updateUploadTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.DateAndTime((String)value);
        setUploadTime((ilarkesto.core.time.DateAndTime)value);
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
        // note = Str.removeUnreadableChars(note);
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

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("filename")) updateFilename(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("uploadTime")) updateUploadTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("number")) updateNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("note")) updateNote(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
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
    }

    // --- PLUGIN: GwtEntityPropertyEditorClassGeneratorPlugin ---

    private transient FilenameModel filenameModel;

    public FilenameModel getFilenameModel() {
        if (filenameModel == null) filenameModel = createFilenameModel();
        return filenameModel;
    }

    protected FilenameModel createFilenameModel() { return new FilenameModel(); }

    protected class FilenameModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "File_filename";
        }

        @Override
        public java.lang.String getValue() {
            return getFilename();
        }

        @Override
        public void setValue(java.lang.String value) {
            setFilename(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isEditable() { return false; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient UploadTimeModel uploadTimeModel;

    public UploadTimeModel getUploadTimeModel() {
        if (uploadTimeModel == null) uploadTimeModel = createUploadTimeModel();
        return uploadTimeModel;
    }

    protected UploadTimeModel createUploadTimeModel() { return new UploadTimeModel(); }

    protected class UploadTimeModel extends ilarkesto.gwt.client.editor.ADateAndTimeEditorModel {

        @Override
        public String getId() {
            return "File_uploadTime";
        }

        @Override
        public ilarkesto.core.time.DateAndTime getValue() {
            return getUploadTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.DateAndTime value) {
            setUploadTime(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isEditable() { return false; }

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
            return "File_label";
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
        public String getTooltip() { return "The label is used to provide a human readable name for the uploaded file. It may (and probably should) differ from the filename."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient NumberModel numberModel;

    public NumberModel getNumberModel() {
        if (numberModel == null) numberModel = createNumberModel();
        return numberModel;
    }

    protected NumberModel createNumberModel() { return new NumberModel(); }

    protected class NumberModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "File_number";
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

    private transient NoteModel noteModel;

    public NoteModel getNoteModel() {
        if (noteModel == null) noteModel = createNoteModel();
        return noteModel;
    }

    protected NoteModel createNoteModel() { return new NoteModel(); }

    protected class NoteModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "File_note";
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
        public String getTooltip() { return "Use this to give additional information on this uploaded file useful for other project members."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}