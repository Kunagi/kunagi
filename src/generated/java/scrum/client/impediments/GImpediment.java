// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.impediments;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GImpediment
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Impediment> {

    public static class ImpedimentMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Impediment)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Impediment)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Impediment)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata date = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "date";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Impediment)entity).getDate();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata description = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "description";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Impediment)entity).getDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata solution = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "solution";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Impediment)entity).getSolution();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata closed = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "closed";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Impediment)entity).isClosed();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,number
            ,label
            ,date
            ,description
            ,solution
            ,closed
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("number".equals(fieldName)) return number;
            if ("label".equals(fieldName)) return label;
            if ("date".equals(fieldName)) return date;
            if ("description".equals(fieldName)) return description;
            if ("solution".equals(fieldName)) return solution;
            if ("closed".equals(fieldName)) return closed;
            return null;
        }

    }

    public static transient final ImpedimentMetadata metadata = new ImpedimentMetadata();

    @Override
    public ImpedimentMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Impediment.class);

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Impediment> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Impediment>() {
    @Override
        protected Set<Impediment> loadById(final String id) {
        return new AImpedimentQuery() {
            @Override
            public boolean test(Impediment entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "Impediment:byProject";
            }
        }.list();
        }
    };

    public static Set< Impediment> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<Impediment>();
        return projectBackReferencesCache.getById(project.getId());
    }

    public static Set< Impediment> listByNumber(final int number) {
        return new AImpedimentQuery() {
            @Override
            public boolean test(Impediment entity) {
                return entity.isNumber(number);
            }
            @Override
            public String toString() {
                return "Impediment:byNumber";
            }
        }.list();
    }

    public static Set< Impediment> listByLabel(final java.lang.String label) {
        return new AImpedimentQuery() {
            @Override
            public boolean test(Impediment entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "Impediment:byLabel";
            }
        }.list();
    }

    public static Set< Impediment> listByDate(final ilarkesto.core.time.Date date) {
        return new AImpedimentQuery() {
            @Override
            public boolean test(Impediment entity) {
                return entity.isDate(date);
            }
            @Override
            public String toString() {
                return "Impediment:byDate";
            }
        }.list();
    }

    public static Set< Impediment> listByDescription(final java.lang.String description) {
        return new AImpedimentQuery() {
            @Override
            public boolean test(Impediment entity) {
                return entity.isDescription(description);
            }
            @Override
            public String toString() {
                return "Impediment:byDescription";
            }
        }.list();
    }

    public static Set< Impediment> listBySolution(final java.lang.String solution) {
        return new AImpedimentQuery() {
            @Override
            public boolean test(Impediment entity) {
                return entity.isSolution(solution);
            }
            @Override
            public String toString() {
                return "Impediment:bySolution";
            }
        }.list();
    }

    public static Set< Impediment> listByClosed(final boolean closed) {
        return new AImpedimentQuery() {
            @Override
            public boolean test(Impediment entity) {
                return entity.isClosed(closed);
            }
            @Override
            public String toString() {
                return "Impediment:byClosed";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
    }

    public abstract static class AImpedimentQuery extends ilarkesto.core.persistance.AEntityQuery<Impediment> {
    @Override
        public Class<Impediment> getType() {
            return Impediment.class;
        }
    }

    public static Set<Impediment> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Impediment.class).list();
    }

    public static Impediment getById(String id) {
        return (Impediment) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
    // --- back references ---
        ret.addAll(getTasks());
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("date", ilarkesto.core.persistance.Persistence.propertyAsString(this.date));
        properties.put("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
        properties.put("solution", ilarkesto.core.persistance.Persistence.propertyAsString(this.solution));
        properties.put("closed", ilarkesto.core.persistance.Persistence.propertyAsString(this.closed));
    }

    @Override
    public int compareTo(Impediment other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    public final Set<scrum.client.sprint.Task> getTasks() {
        return scrum.client.sprint.Task.listByImpediment((Impediment)this);
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GImpediment.class);

    public static final String TYPE = "Impediment";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getLabel(), getDescription(), getSolution());
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
            throw ex.setCallerInfo("Impediment.project");
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
    // - date
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date date;

    public final ilarkesto.core.time.Date getDate() {
        return date;
    }

    public final void setDate(ilarkesto.core.time.Date date) {
        date = prepareDate(date);
        if (isDate(date)) return;
        if (date == null) throw new IllegalArgumentException("Mandatory field can not be set to null: date");
        this.date = date;
            updateLastModified();
            fireModified("date", ilarkesto.core.persistance.Persistence.propertyAsString(this.date));
    }

    private final void updateDate(ilarkesto.core.time.Date date) {
        if (isDate(date)) return;
        if (date == null) throw new IllegalArgumentException("Mandatory field can not be set to null: date");
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
    // - solution
    // -----------------------------------------------------------

    private java.lang.String solution;

    public final java.lang.String getSolution() {
        return solution;
    }

    public final void setSolution(java.lang.String solution) {
        solution = prepareSolution(solution);
        if (isSolution(solution)) return;
        this.solution = solution;
            updateLastModified();
            fireModified("solution", ilarkesto.core.persistance.Persistence.propertyAsString(this.solution));
    }

    private final void updateSolution(java.lang.String solution) {
        if (isSolution(solution)) return;
        this.solution = solution;
            updateLastModified();
            fireModified("solution", ilarkesto.core.persistance.Persistence.propertyAsString(this.solution));
    }

    protected java.lang.String prepareSolution(java.lang.String solution) {
        // solution = Str.removeUnreadableChars(solution);
        return solution;
    }

    public final boolean isSolutionSet() {
        return this.solution != null;
    }

    public final boolean isSolution(java.lang.String solution) {
        if (this.solution == null && solution == null) return true;
        return this.solution != null && this.solution.equals(solution);
    }

    protected final void updateSolution(Object value) {
        setSolution((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - closed
    // -----------------------------------------------------------

    private boolean closed;

    public final boolean isClosed() {
        return closed;
    }

    public final void setClosed(boolean closed) {
        closed = prepareClosed(closed);
        if (isClosed(closed)) return;
        this.closed = closed;
            updateLastModified();
            fireModified("closed", ilarkesto.core.persistance.Persistence.propertyAsString(this.closed));
    }

    private final void updateClosed(boolean closed) {
        if (isClosed(closed)) return;
        this.closed = closed;
            updateLastModified();
            fireModified("closed", ilarkesto.core.persistance.Persistence.propertyAsString(this.closed));
    }

    protected boolean prepareClosed(boolean closed) {
        return closed;
    }

    public final boolean isClosed(boolean closed) {
        return this.closed == closed;
    }

    protected final void updateClosed(Object value) {
        setClosed((Boolean)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("number")) updateNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("date")) updateDate(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("description")) updateDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("solution")) updateSolution(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("closed")) updateClosed(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
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
        Collection<scrum.client.sprint.Task> task = getTasks();
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
            return "Impediment_number";
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
            return "Impediment_label";
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
        public String getTooltip() { return "The label should be short (as it appears where the Impediment is referenced), yet give a hint strong enough to make the content of it come to mind."; }

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

    protected class DateModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "Impediment_date";
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
        public boolean isMandatory() { return true; }
        @Override
        public String getTooltip() { return "The date the Impediment came up."; }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
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
            return "Impediment_description";
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
        public String getTooltip() { return "The detailed description of the Impediment that explains problems, states who is affected and how, gives background information and solution hints."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient SolutionModel solutionModel;

    public SolutionModel getSolutionModel() {
        if (solutionModel == null) solutionModel = createSolutionModel();
        return solutionModel;
    }

    protected SolutionModel createSolutionModel() { return new SolutionModel(); }

    protected class SolutionModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Impediment_solution";
        }

        @Override
        public java.lang.String getValue() {
            return getSolution();
        }

        @Override
        public void setValue(java.lang.String value) {
            setSolution(value);
        }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "As soon as a solution is found, it can be documented here, so that people affected by or holding stake in the Impediment can read it up."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ClosedModel closedModel;

    public ClosedModel getClosedModel() {
        if (closedModel == null) closedModel = createClosedModel();
        return closedModel;
    }

    protected ClosedModel createClosedModel() { return new ClosedModel(); }

    protected class ClosedModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Impediment_closed";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isClosed();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setClosed(value);
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

}