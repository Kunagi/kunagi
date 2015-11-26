// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.project;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GQuality
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Quality> {

    public static class QualityMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Quality)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Quality)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Quality)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata description = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "description";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Quality)entity).getDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata testDescription = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "testDescription";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Quality)entity).getTestDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata autoAdd = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "autoAdd";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Quality)entity).isAutoAdd();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,number
            ,label
            ,description
            ,testDescription
            ,autoAdd
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("number".equals(fieldName)) return number;
            if ("label".equals(fieldName)) return label;
            if ("description".equals(fieldName)) return description;
            if ("testDescription".equals(fieldName)) return testDescription;
            if ("autoAdd".equals(fieldName)) return autoAdd;
            return null;
        }

    }

    public static transient final QualityMetadata metadata = new QualityMetadata();

    @Override
    public QualityMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Quality.class);

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Quality> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Quality>() {
    @Override
        protected Set<Quality> loadById(final String id) {
        return new AQualityQuery() {
            @Override
            public boolean test(Quality entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "Quality:byProject";
            }
        }.list();
        }
    };

    public static Set< Quality> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<Quality>();
        return projectBackReferencesCache.getById(project.getId());
    }

    public static Set< Quality> listByNumber(final int number) {
        return new AQualityQuery() {
            @Override
            public boolean test(Quality entity) {
                return entity.isNumber(number);
            }
            @Override
            public String toString() {
                return "Quality:byNumber";
            }
        }.list();
    }

    public static Set< Quality> listByLabel(final java.lang.String label) {
        return new AQualityQuery() {
            @Override
            public boolean test(Quality entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "Quality:byLabel";
            }
        }.list();
    }

    public static Set< Quality> listByDescription(final java.lang.String description) {
        return new AQualityQuery() {
            @Override
            public boolean test(Quality entity) {
                return entity.isDescription(description);
            }
            @Override
            public String toString() {
                return "Quality:byDescription";
            }
        }.list();
    }

    public static Set< Quality> listByTestDescription(final java.lang.String testDescription) {
        return new AQualityQuery() {
            @Override
            public boolean test(Quality entity) {
                return entity.isTestDescription(testDescription);
            }
            @Override
            public String toString() {
                return "Quality:byTestDescription";
            }
        }.list();
    }

    public static Set< Quality> listByAutoAdd(final boolean autoAdd) {
        return new AQualityQuery() {
            @Override
            public boolean test(Quality entity) {
                return entity.isAutoAdd(autoAdd);
            }
            @Override
            public String toString() {
                return "Quality:byAutoAdd";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
    }

    public abstract boolean isEditable();

    public static Set<Quality> listByIsEditable() {
        return new AQualityQuery() {
            @Override
            public boolean test(Quality entity) {
                return entity.isEditable();
            }
            @Override
            public String toString() {
                return "Quality:byIsEditable";
            }
        }.list();
    }

    public final boolean isNotEditable() {
        return !isEditable();
    }

    public static Set<Quality> listByIsNotEditable() {
        return new AQualityQuery() {
            @Override
            public boolean test(Quality entity) {
                return entity.isNotEditable();
            }
            @Override
            public String toString() {
                return "Quality:byIsNotEditable";
            }
        }.list();
    }

    public abstract static class AQualityQuery extends ilarkesto.core.persistance.AEntityQuery<Quality> {
    @Override
        public Class<Quality> getType() {
            return Quality.class;
        }
    }

    public static Set<Quality> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Quality.class).list();
    }

    public static Quality getById(String id) {
        return (Quality) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
    // --- back references ---
        ret.addAll(getProjectUserConfigs());
        ret.addAll(getRequirements());
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
        properties.put("testDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.testDescription));
        properties.put("autoAdd", ilarkesto.core.persistance.Persistence.propertyAsString(this.autoAdd));
    }

    @Override
    public int compareTo(Quality other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    public final Set<scrum.client.admin.ProjectUserConfig> getProjectUserConfigs() {
        return scrum.client.admin.ProjectUserConfig.listByPblFilterQuality((Quality)this);
    }

    public final Set<scrum.client.project.Requirement> getRequirements() {
        return scrum.client.project.Requirement.listByQuality((Quality)this);
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GQuality.class);

    public static final String TYPE = "Quality";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getLabel(), getDescription(), getTestDescription());
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
            throw ex.setCallerInfo("Quality.project");
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
    // - testDescription
    // -----------------------------------------------------------

    private java.lang.String testDescription;

    public final java.lang.String getTestDescription() {
        return testDescription;
    }

    public final void setTestDescription(java.lang.String testDescription) {
        testDescription = prepareTestDescription(testDescription);
        if (isTestDescription(testDescription)) return;
        this.testDescription = testDescription;
            updateLastModified();
            fireModified("testDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.testDescription));
    }

    private final void updateTestDescription(java.lang.String testDescription) {
        if (isTestDescription(testDescription)) return;
        this.testDescription = testDescription;
            updateLastModified();
            fireModified("testDescription", ilarkesto.core.persistance.Persistence.propertyAsString(this.testDescription));
    }

    protected java.lang.String prepareTestDescription(java.lang.String testDescription) {
         testDescription = Str.removeControlChars(testDescription);
        return testDescription;
    }

    public final boolean isTestDescriptionSet() {
        return this.testDescription != null;
    }

    public final boolean isTestDescription(java.lang.String testDescription) {
        if (this.testDescription == null && testDescription == null) return true;
        return this.testDescription != null && this.testDescription.equals(testDescription);
    }

    protected final void updateTestDescription(Object value) {
        setTestDescription((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - autoAdd
    // -----------------------------------------------------------

    private boolean autoAdd;

    public final boolean isAutoAdd() {
        return autoAdd;
    }

    public final void setAutoAdd(boolean autoAdd) {
        autoAdd = prepareAutoAdd(autoAdd);
        if (isAutoAdd(autoAdd)) return;
        this.autoAdd = autoAdd;
            updateLastModified();
            fireModified("autoAdd", ilarkesto.core.persistance.Persistence.propertyAsString(this.autoAdd));
    }

    private final void updateAutoAdd(boolean autoAdd) {
        if (isAutoAdd(autoAdd)) return;
        this.autoAdd = autoAdd;
            updateLastModified();
            fireModified("autoAdd", ilarkesto.core.persistance.Persistence.propertyAsString(this.autoAdd));
    }

    protected boolean prepareAutoAdd(boolean autoAdd) {
        return autoAdd;
    }

    public final boolean isAutoAdd(boolean autoAdd) {
        return this.autoAdd == autoAdd;
    }

    protected final void updateAutoAdd(Object value) {
        setAutoAdd((Boolean)value);
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
            if (property.equals("description")) updateDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("testDescription")) updateTestDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("autoAdd")) updateAutoAdd(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
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
        Collection<scrum.client.admin.ProjectUserConfig> projectUserConfig = getProjectUserConfigs();
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
            return "Quality_number";
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
            return "Quality_label";
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
        public boolean isEditable() { return GQuality.this.isEditable(); }
        @Override
        public String getTooltip() { return "The label should be short (as it appears where the Quality is referenced), yet give a hint strong enough to make the content of it come to mind."; }

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
            return "Quality_description";
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
        public boolean isEditable() { return GQuality.this.isEditable(); }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "The desctiption of a Quality should give detailled information on what the Quality is about and how it affects Storys that reference it."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient TestDescriptionModel testDescriptionModel;

    public TestDescriptionModel getTestDescriptionModel() {
        if (testDescriptionModel == null) testDescriptionModel = createTestDescriptionModel();
        return testDescriptionModel;
    }

    protected TestDescriptionModel createTestDescriptionModel() { return new TestDescriptionModel(); }

    protected class TestDescriptionModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Quality_testDescription";
        }

        @Override
        public java.lang.String getValue() {
            return getTestDescription();
        }

        @Override
        public void setValue(java.lang.String value) {
            setTestDescription(value);
        }

        @Override
        public boolean isEditable() { return GQuality.this.isEditable(); }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "The Test contains requirements that have to be met by the Team in order for a Story that references this Quality to be considered done."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient AutoAddModel autoAddModel;

    public AutoAddModel getAutoAddModel() {
        if (autoAddModel == null) autoAddModel = createAutoAddModel();
        return autoAddModel;
    }

    protected AutoAddModel createAutoAddModel() { return new AutoAddModel(); }

    protected class AutoAddModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Quality_autoAdd";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isAutoAdd();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setAutoAdd(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isEditable() { return GQuality.this.isEditable(); }
        @Override
        public String getTooltip() { return "If enabled this quality will be added to all new Stories."; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

}