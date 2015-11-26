// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.collaboration;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GWikipage
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Wikipage> {

    public static class WikipageMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Wikipage)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata name = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "name";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Wikipage)entity).getName();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata text = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "text";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Wikipage)entity).getText();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,name
            ,text
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("name".equals(fieldName)) return name;
            if ("text".equals(fieldName)) return text;
            return null;
        }

    }

    public static transient final WikipageMetadata metadata = new WikipageMetadata();

    @Override
    public WikipageMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Wikipage.class);

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Wikipage> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Wikipage>() {
    @Override
        protected Set<Wikipage> loadById(final String id) {
        return new AWikipageQuery() {
            @Override
            public boolean test(Wikipage entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "Wikipage:byProject";
            }
        }.list();
        }
    };

    public static Set< Wikipage> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<Wikipage>();
        return projectBackReferencesCache.getById(project.getId());
    }

    public static Set< Wikipage> listByName(final java.lang.String name) {
        return new AWikipageQuery() {
            @Override
            public boolean test(Wikipage entity) {
                return entity.isName(name);
            }
            @Override
            public String toString() {
                return "Wikipage:byName";
            }
        }.list();
    }

    public static Set< Wikipage> listByText(final java.lang.String text) {
        return new AWikipageQuery() {
            @Override
            public boolean test(Wikipage entity) {
                return entity.isText(text);
            }
            @Override
            public String toString() {
                return "Wikipage:byText";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
    }

    public abstract static class AWikipageQuery extends ilarkesto.core.persistance.AEntityQuery<Wikipage> {
    @Override
        public Class<Wikipage> getType() {
            return Wikipage.class;
        }
    }

    public static Set<Wikipage> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Wikipage.class).list();
    }

    public static Wikipage getById(String id) {
        return (Wikipage) AEntity.getById(id);
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
        properties.put("name", ilarkesto.core.persistance.Persistence.propertyAsString(this.name));
        properties.put("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
    }

    @Override
    public int compareTo(Wikipage other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GWikipage.class);

    public static final String TYPE = "Wikipage";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getName(), getText());
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
            throw ex.setCallerInfo("Wikipage.project");
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
    // - name
    // -----------------------------------------------------------

    private java.lang.String name;

    public final java.lang.String getName() {
        return name;
    }

    public final void setName(java.lang.String name) {
        name = prepareName(name);
        if (isName(name)) return;
        if (name == null) throw new IllegalArgumentException("Mandatory field can not be set to null: name");
        this.name = name;
            updateLastModified();
            fireModified("name", ilarkesto.core.persistance.Persistence.propertyAsString(this.name));
    }

    private final void updateName(java.lang.String name) {
        if (isName(name)) return;
        if (name == null) throw new IllegalArgumentException("Mandatory field can not be set to null: name");
        this.name = name;
            updateLastModified();
            fireModified("name", ilarkesto.core.persistance.Persistence.propertyAsString(this.name));
    }

    protected java.lang.String prepareName(java.lang.String name) {
         name = Str.removeControlChars(name);
        return name;
    }

    public final boolean isNameSet() {
        return this.name != null;
    }

    public final boolean isName(java.lang.String name) {
        if (this.name == null && name == null) return true;
        return this.name != null && this.name.equals(name);
    }

    protected final void updateName(Object value) {
        setName((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - text
    // -----------------------------------------------------------

    private java.lang.String text;

    public final java.lang.String getText() {
        return text;
    }

    public final void setText(java.lang.String text) {
        text = prepareText(text);
        if (isText(text)) return;
        this.text = text;
            updateLastModified();
            fireModified("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
    }

    private final void updateText(java.lang.String text) {
        if (isText(text)) return;
        this.text = text;
            updateLastModified();
            fireModified("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
    }

    protected java.lang.String prepareText(java.lang.String text) {
         text = Str.removeControlChars(text);
        return text;
    }

    public final boolean isTextSet() {
        return this.text != null;
    }

    public final boolean isText(java.lang.String text) {
        if (this.text == null && text == null) return true;
        return this.text != null && this.text.equals(text);
    }

    protected final void updateText(Object value) {
        setText((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("name")) updateName(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("text")) updateText(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
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

    private transient NameModel nameModel;

    public NameModel getNameModel() {
        if (nameModel == null) nameModel = createNameModel();
        return nameModel;
    }

    protected NameModel createNameModel() { return new NameModel(); }

    protected class NameModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Wikipage_name";
        }

        @Override
        public java.lang.String getValue() {
            return getName();
        }

        @Override
        public void setValue(java.lang.String value) {
            setName(value);
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

    private transient TextModel textModel;

    public TextModel getTextModel() {
        if (textModel == null) textModel = createTextModel();
        return textModel;
    }

    protected TextModel createTextModel() { return new TextModel(); }

    protected class TextModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Wikipage_text";
        }

        @Override
        public java.lang.String getValue() {
            return getText();
        }

        @Override
        public void setValue(java.lang.String value) {
            setText(value);
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