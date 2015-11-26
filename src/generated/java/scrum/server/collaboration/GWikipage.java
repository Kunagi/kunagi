// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.collaboration;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GWikipage
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<Wikipage>, ilarkesto.core.search.Searchable {

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

    // --- AEntity ---

    public final scrum.server.collaboration.WikipageDao getDao() {
        return wikipageDao;
    }

    protected void repairDeadDatob(ADatob datob) {
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

    public final scrum.server.project.Project getProject() {
        try {
            return this.projectId == null ? null : (scrum.server.project.Project) AEntity.getById(this.projectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Wikipage.project");
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

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadProjectReference(entityId);
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


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.project.ProjectDao projectDao;

    public static final void setProjectDao(scrum.server.project.ProjectDao projectDao) {
        GWikipage.projectDao = projectDao;
    }

    static scrum.server.collaboration.WikipageDao wikipageDao;

    public static final void setWikipageDao(scrum.server.collaboration.WikipageDao wikipageDao) {
        GWikipage.wikipageDao = wikipageDao;
    }

}