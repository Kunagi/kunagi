// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.calendar;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GSimpleEvent
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<SimpleEvent> {

    public static class SimpleEventMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SimpleEvent)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SimpleEvent)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SimpleEvent)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata date = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "date";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SimpleEvent)entity).getDate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata time = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "time";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SimpleEvent)entity).getTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata location = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "location";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SimpleEvent)entity).getLocation();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata duration = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "duration";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SimpleEvent)entity).getDuration();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata agenda = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "agenda";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SimpleEvent)entity).getAgenda();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata note = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "note";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SimpleEvent)entity).getNote();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,label
            ,number
            ,date
            ,time
            ,location
            ,duration
            ,agenda
            ,note
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("label".equals(fieldName)) return label;
            if ("number".equals(fieldName)) return number;
            if ("date".equals(fieldName)) return date;
            if ("time".equals(fieldName)) return time;
            if ("location".equals(fieldName)) return location;
            if ("duration".equals(fieldName)) return duration;
            if ("agenda".equals(fieldName)) return agenda;
            if ("note".equals(fieldName)) return note;
            return null;
        }

    }

    public static transient final SimpleEventMetadata metadata = new SimpleEventMetadata();

    @Override
    public SimpleEventMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(SimpleEvent.class);

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<SimpleEvent> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<SimpleEvent>() {
    @Override
        protected Set<SimpleEvent> loadById(final String id) {
        return new ASimpleEventQuery() {
            @Override
            public boolean test(SimpleEvent entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "SimpleEvent:byProject";
            }
        }.list();
        }
    };

    public static Set< SimpleEvent> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<SimpleEvent>();
        return projectBackReferencesCache.getById(project.getId());
    }

    public static Set< SimpleEvent> listByLabel(final java.lang.String label) {
        return new ASimpleEventQuery() {
            @Override
            public boolean test(SimpleEvent entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "SimpleEvent:byLabel";
            }
        }.list();
    }

    public static Set< SimpleEvent> listByNumber(final int number) {
        return new ASimpleEventQuery() {
            @Override
            public boolean test(SimpleEvent entity) {
                return entity.isNumber(number);
            }
            @Override
            public String toString() {
                return "SimpleEvent:byNumber";
            }
        }.list();
    }

    public static Set< SimpleEvent> listByDate(final ilarkesto.core.time.Date date) {
        return new ASimpleEventQuery() {
            @Override
            public boolean test(SimpleEvent entity) {
                return entity.isDate(date);
            }
            @Override
            public String toString() {
                return "SimpleEvent:byDate";
            }
        }.list();
    }

    public static Set< SimpleEvent> listByTime(final ilarkesto.core.time.Time time) {
        return new ASimpleEventQuery() {
            @Override
            public boolean test(SimpleEvent entity) {
                return entity.isTime(time);
            }
            @Override
            public String toString() {
                return "SimpleEvent:byTime";
            }
        }.list();
    }

    public static Set< SimpleEvent> listByLocation(final java.lang.String location) {
        return new ASimpleEventQuery() {
            @Override
            public boolean test(SimpleEvent entity) {
                return entity.isLocation(location);
            }
            @Override
            public String toString() {
                return "SimpleEvent:byLocation";
            }
        }.list();
    }

    public static Set< SimpleEvent> listByDuration(final java.lang.Integer duration) {
        return new ASimpleEventQuery() {
            @Override
            public boolean test(SimpleEvent entity) {
                return entity.isDuration(duration);
            }
            @Override
            public String toString() {
                return "SimpleEvent:byDuration";
            }
        }.list();
    }

    public static Set< SimpleEvent> listByAgenda(final java.lang.String agenda) {
        return new ASimpleEventQuery() {
            @Override
            public boolean test(SimpleEvent entity) {
                return entity.isAgenda(agenda);
            }
            @Override
            public String toString() {
                return "SimpleEvent:byAgenda";
            }
        }.list();
    }

    public static Set< SimpleEvent> listByNote(final java.lang.String note) {
        return new ASimpleEventQuery() {
            @Override
            public boolean test(SimpleEvent entity) {
                return entity.isNote(note);
            }
            @Override
            public String toString() {
                return "SimpleEvent:byNote";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
    }

    public abstract static class ASimpleEventQuery extends ilarkesto.core.persistance.AEntityQuery<SimpleEvent> {
    @Override
        public Class<SimpleEvent> getType() {
            return SimpleEvent.class;
        }
    }

    public static Set<SimpleEvent> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(SimpleEvent.class).list();
    }

    public static SimpleEvent getById(String id) {
        return (SimpleEvent) AEntity.getById(id);
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
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("date", ilarkesto.core.persistance.Persistence.propertyAsString(this.date));
        properties.put("time", ilarkesto.core.persistance.Persistence.propertyAsString(this.time));
        properties.put("location", ilarkesto.core.persistance.Persistence.propertyAsString(this.location));
        properties.put("duration", ilarkesto.core.persistance.Persistence.propertyAsString(this.duration));
        properties.put("agenda", ilarkesto.core.persistance.Persistence.propertyAsString(this.agenda));
        properties.put("note", ilarkesto.core.persistance.Persistence.propertyAsString(this.note));
    }

    @Override
    public int compareTo(SimpleEvent other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GSimpleEvent.class);

    public static final String TYPE = "SimpleEvent";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getLabel(), getLocation(), getAgenda(), getNote());
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
            throw ex.setCallerInfo("SimpleEvent.project");
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
    // - date
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date date;

    public final ilarkesto.core.time.Date getDate() {
        return date;
    }

    public final void setDate(ilarkesto.core.time.Date date) {
        date = prepareDate(date);
        if (isDate(date)) return;
        this.date = date;
            updateLastModified();
            fireModified("date", ilarkesto.core.persistance.Persistence.propertyAsString(this.date));
    }

    private final void updateDate(ilarkesto.core.time.Date date) {
        if (isDate(date)) return;
        this.date = date;
            updateLastModified();
            fireModified("date", ilarkesto.core.persistance.Persistence.propertyAsString(this.date));
    }

    protected ilarkesto.core.time.Date prepareDate(ilarkesto.core.time.Date date) {
        return date;
    }

    public final boolean isDateSet() {
        return this.date != null;
    }

    public final boolean isDate(ilarkesto.core.time.Date date) {
        if (this.date == null && date == null) return true;
        return this.date != null && this.date.equals(date);
    }

    protected final void updateDate(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setDate((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - time
    // -----------------------------------------------------------

    private ilarkesto.core.time.Time time;

    public final ilarkesto.core.time.Time getTime() {
        return time;
    }

    public final void setTime(ilarkesto.core.time.Time time) {
        time = prepareTime(time);
        if (isTime(time)) return;
        this.time = time;
            updateLastModified();
            fireModified("time", ilarkesto.core.persistance.Persistence.propertyAsString(this.time));
    }

    private final void updateTime(ilarkesto.core.time.Time time) {
        if (isTime(time)) return;
        this.time = time;
            updateLastModified();
            fireModified("time", ilarkesto.core.persistance.Persistence.propertyAsString(this.time));
    }

    protected ilarkesto.core.time.Time prepareTime(ilarkesto.core.time.Time time) {
        return time;
    }

    public final boolean isTimeSet() {
        return this.time != null;
    }

    public final boolean isTime(ilarkesto.core.time.Time time) {
        if (this.time == null && time == null) return true;
        return this.time != null && this.time.equals(time);
    }

    protected final void updateTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Time((String)value);
        setTime((ilarkesto.core.time.Time)value);
    }
    // -----------------------------------------------------------
    // - location
    // -----------------------------------------------------------

    private java.lang.String location;

    public final java.lang.String getLocation() {
        return location;
    }

    public final void setLocation(java.lang.String location) {
        location = prepareLocation(location);
        if (isLocation(location)) return;
        this.location = location;
            updateLastModified();
            fireModified("location", ilarkesto.core.persistance.Persistence.propertyAsString(this.location));
    }

    private final void updateLocation(java.lang.String location) {
        if (isLocation(location)) return;
        this.location = location;
            updateLastModified();
            fireModified("location", ilarkesto.core.persistance.Persistence.propertyAsString(this.location));
    }

    protected java.lang.String prepareLocation(java.lang.String location) {
        // location = Str.removeUnreadableChars(location);
        return location;
    }

    public final boolean isLocationSet() {
        return this.location != null;
    }

    public final boolean isLocation(java.lang.String location) {
        if (this.location == null && location == null) return true;
        return this.location != null && this.location.equals(location);
    }

    protected final void updateLocation(Object value) {
        setLocation((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - duration
    // -----------------------------------------------------------

    private java.lang.Integer duration;

    public final java.lang.Integer getDuration() {
        return duration;
    }

    public final void setDuration(java.lang.Integer duration) {
        duration = prepareDuration(duration);
        if (isDuration(duration)) return;
        this.duration = duration;
            updateLastModified();
            fireModified("duration", ilarkesto.core.persistance.Persistence.propertyAsString(this.duration));
    }

    private final void updateDuration(java.lang.Integer duration) {
        if (isDuration(duration)) return;
        this.duration = duration;
            updateLastModified();
            fireModified("duration", ilarkesto.core.persistance.Persistence.propertyAsString(this.duration));
    }

    protected java.lang.Integer prepareDuration(java.lang.Integer duration) {
        return duration;
    }

    public final boolean isDurationSet() {
        return this.duration != null;
    }

    public final boolean isDuration(java.lang.Integer duration) {
        if (this.duration == null && duration == null) return true;
        return this.duration != null && this.duration.equals(duration);
    }

    protected final void updateDuration(Object value) {
        setDuration((java.lang.Integer)value);
    }
    // -----------------------------------------------------------
    // - agenda
    // -----------------------------------------------------------

    private java.lang.String agenda;

    public final java.lang.String getAgenda() {
        return agenda;
    }

    public final void setAgenda(java.lang.String agenda) {
        agenda = prepareAgenda(agenda);
        if (isAgenda(agenda)) return;
        this.agenda = agenda;
            updateLastModified();
            fireModified("agenda", ilarkesto.core.persistance.Persistence.propertyAsString(this.agenda));
    }

    private final void updateAgenda(java.lang.String agenda) {
        if (isAgenda(agenda)) return;
        this.agenda = agenda;
            updateLastModified();
            fireModified("agenda", ilarkesto.core.persistance.Persistence.propertyAsString(this.agenda));
    }

    protected java.lang.String prepareAgenda(java.lang.String agenda) {
        // agenda = Str.removeUnreadableChars(agenda);
        return agenda;
    }

    public final boolean isAgendaSet() {
        return this.agenda != null;
    }

    public final boolean isAgenda(java.lang.String agenda) {
        if (this.agenda == null && agenda == null) return true;
        return this.agenda != null && this.agenda.equals(agenda);
    }

    protected final void updateAgenda(Object value) {
        setAgenda((java.lang.String)value);
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
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("number")) updateNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("date")) updateDate(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("time")) updateTime(ilarkesto.core.persistance.Persistence.parsePropertyTime(value));
            if (property.equals("location")) updateLocation(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("duration")) updateDuration(ilarkesto.core.persistance.Persistence.parsePropertyInteger(value));
            if (property.equals("agenda")) updateAgenda(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
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

    private transient LabelModel labelModel;

    public LabelModel getLabelModel() {
        if (labelModel == null) labelModel = createLabelModel();
        return labelModel;
    }

    protected LabelModel createLabelModel() { return new LabelModel(); }

    protected class LabelModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "SimpleEvent_label";
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
            return "SimpleEvent_number";
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

    private transient DateModel dateModel;

    public DateModel getDateModel() {
        if (dateModel == null) dateModel = createDateModel();
        return dateModel;
    }

    protected DateModel createDateModel() { return new DateModel(); }

    protected class DateModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "SimpleEvent_date";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getDate();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setDate(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient TimeModel timeModel;

    public TimeModel getTimeModel() {
        if (timeModel == null) timeModel = createTimeModel();
        return timeModel;
    }

    protected TimeModel createTimeModel() { return new TimeModel(); }

    protected class TimeModel extends ilarkesto.gwt.client.editor.ATimeEditorModel {

        @Override
        public String getId() {
            return "SimpleEvent_time";
        }

        @Override
        public ilarkesto.core.time.Time getValue() {
            return getTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.Time value) {
            setTime(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Time oldValue, ilarkesto.core.time.Time newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient LocationModel locationModel;

    public LocationModel getLocationModel() {
        if (locationModel == null) locationModel = createLocationModel();
        return locationModel;
    }

    protected LocationModel createLocationModel() { return new LocationModel(); }

    protected class LocationModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "SimpleEvent_location";
        }

        @Override
        public java.lang.String getValue() {
            return getLocation();
        }

        @Override
        public void setValue(java.lang.String value) {
            setLocation(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient DurationModel durationModel;

    public DurationModel getDurationModel() {
        if (durationModel == null) durationModel = createDurationModel();
        return durationModel;
    }

    protected DurationModel createDurationModel() { return new DurationModel(); }

    protected class DurationModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "SimpleEvent_duration";
        }

        @Override
        public java.lang.Integer getValue() {
            return getDuration();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setDuration(value);
        }

            @Override
            public void increment() {
                setDuration(getDuration() + 1);
            }

            @Override
            public void decrement() {
                setDuration(getDuration() - 1);
            }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient AgendaModel agendaModel;

    public AgendaModel getAgendaModel() {
        if (agendaModel == null) agendaModel = createAgendaModel();
        return agendaModel;
    }

    protected AgendaModel createAgendaModel() { return new AgendaModel(); }

    protected class AgendaModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "SimpleEvent_agenda";
        }

        @Override
        public java.lang.String getValue() {
            return getAgenda();
        }

        @Override
        public void setValue(java.lang.String value) {
            setAgenda(value);
        }

        @Override
        public boolean isRichtext() { return true; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
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
            return "SimpleEvent_note";
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
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}