// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.admin;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GProjectUserConfig
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<ProjectUserConfig> {

    public static class ProjectUserConfigMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata user = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "user";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getUser();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata color = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "color";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getColor();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata receiveEmailsOnProjectEvents = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "receiveEmailsOnProjectEvents";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).isReceiveEmailsOnProjectEvents();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata misconducts = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "misconducts";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getMisconducts();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata richtextAutosaveText = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "richtextAutosaveText";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getRichtextAutosaveText();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata richtextAutosaveField = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "richtextAutosaveField";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getRichtextAutosaveField();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata selectedEntitysIds = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "selectedEntitysIds";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getSelectedEntitysIds();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata online = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "online";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).isOnline();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata lastActivityDateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "lastActivityDateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getLastActivityDateAndTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata pblFilterThemes = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "pblFilterThemes";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getPblFilterThemes();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata pblFilterQualitys = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "pblFilterQualitys";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getPblFilterQualitys();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata pblFilterDateFrom = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "pblFilterDateFrom";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getPblFilterDateFrom();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata pblFilterDateTo = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "pblFilterDateTo";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getPblFilterDateTo();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata pblFilterEstimationFrom = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "pblFilterEstimationFrom";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getPblFilterEstimationFrom();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata pblFilterEstimationTo = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "pblFilterEstimationTo";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getPblFilterEstimationTo();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata pblFilterText = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "pblFilterText";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectUserConfig)entity).getPblFilterText();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,user
            ,color
            ,receiveEmailsOnProjectEvents
            ,misconducts
            ,richtextAutosaveText
            ,richtextAutosaveField
            ,selectedEntitysIds
            ,online
            ,lastActivityDateAndTime
            ,pblFilterThemes
            ,pblFilterQualitys
            ,pblFilterDateFrom
            ,pblFilterDateTo
            ,pblFilterEstimationFrom
            ,pblFilterEstimationTo
            ,pblFilterText
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("user".equals(fieldName)) return user;
            if ("userId".equals(fieldName)) return user;
            if ("color".equals(fieldName)) return color;
            if ("receiveEmailsOnProjectEvents".equals(fieldName)) return receiveEmailsOnProjectEvents;
            if ("misconducts".equals(fieldName)) return misconducts;
            if ("richtextAutosaveText".equals(fieldName)) return richtextAutosaveText;
            if ("richtextAutosaveField".equals(fieldName)) return richtextAutosaveField;
            if ("selectedEntitysIds".equals(fieldName)) return selectedEntitysIds;
            if ("online".equals(fieldName)) return online;
            if ("lastActivityDateAndTime".equals(fieldName)) return lastActivityDateAndTime;
            if ("pblFilterThemes".equals(fieldName)) return pblFilterThemes;
            if ("pblFilterQualitys".equals(fieldName)) return pblFilterQualitys;
            if ("pblFilterQualitysIds".equals(fieldName)) return pblFilterQualitys;
            if ("pblFilterDateFrom".equals(fieldName)) return pblFilterDateFrom;
            if ("pblFilterDateTo".equals(fieldName)) return pblFilterDateTo;
            if ("pblFilterEstimationFrom".equals(fieldName)) return pblFilterEstimationFrom;
            if ("pblFilterEstimationTo".equals(fieldName)) return pblFilterEstimationTo;
            if ("pblFilterText".equals(fieldName)) return pblFilterText;
            return null;
        }

    }

    public static transient final ProjectUserConfigMetadata metadata = new ProjectUserConfigMetadata();

    @Override
    public ProjectUserConfigMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(ProjectUserConfig.class);

    // --- AEntity ---

    public final scrum.server.admin.ProjectUserConfigDao getDao() {
        return projectUserConfigDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class AProjectUserConfigQuery extends ilarkesto.core.persistance.AEntityQuery<ProjectUserConfig> {
    @Override
        public Class<ProjectUserConfig> getType() {
            return ProjectUserConfig.class;
        }
    }

    public static Set<ProjectUserConfig> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(ProjectUserConfig.class).list();
    }

    public static ProjectUserConfig getById(String id) {
        return (ProjectUserConfig) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getUser()); } catch(EntityDoesNotExistException ex) {}
        if (pblFilterQualitysIds!=null) for (String id : pblFilterQualitysIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("userId", ilarkesto.core.persistance.Persistence.propertyAsString(this.userId));
        properties.put("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
        properties.put("receiveEmailsOnProjectEvents", ilarkesto.core.persistance.Persistence.propertyAsString(this.receiveEmailsOnProjectEvents));
        properties.put("misconducts", ilarkesto.core.persistance.Persistence.propertyAsString(this.misconducts));
        properties.put("richtextAutosaveText", ilarkesto.core.persistance.Persistence.propertyAsString(this.richtextAutosaveText));
        properties.put("richtextAutosaveField", ilarkesto.core.persistance.Persistence.propertyAsString(this.richtextAutosaveField));
        properties.put("selectedEntitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.selectedEntitysIds));
        properties.put("online", ilarkesto.core.persistance.Persistence.propertyAsString(this.online));
        properties.put("lastActivityDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastActivityDateAndTime));
        properties.put("pblFilterThemes", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterThemes));
        properties.put("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        properties.put("pblFilterDateFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterDateFrom));
        properties.put("pblFilterDateTo", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterDateTo));
        properties.put("pblFilterEstimationFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterEstimationFrom));
        properties.put("pblFilterEstimationTo", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterEstimationTo));
        properties.put("pblFilterText", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterText));
    }

    @Override
    public int compareTo(ProjectUserConfig other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GProjectUserConfig.class);

    public static final String TYPE = "ProjectUserConfig";
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
            throw ex.setCallerInfo("ProjectUserConfig.project");
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
    // - user
    // -----------------------------------------------------------

    private String userId;

    public final String getUserId() {
        return this.userId;
    }

    public final scrum.server.admin.User getUser() {
        try {
            return this.userId == null ? null : (scrum.server.admin.User) AEntity.getById(this.userId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("ProjectUserConfig.user");
        }
    }

    public final void setUser(scrum.server.admin.User user) {
        user = prepareUser(user);
        if (isUser(user)) return;
        setUserId(user == null ? null : user.getId());
    }

    public final void setUserId(String id) {
        if (Utl.equals(userId, id)) return;
        this.userId = id;
            updateLastModified();
            fireModified("userId", ilarkesto.core.persistance.Persistence.propertyAsString(this.userId));
    }

    private final void updateUserId(String id) {
        setUserId(id);
    }

    protected scrum.server.admin.User prepareUser(scrum.server.admin.User user) {
        return user;
    }

    protected void repairDeadUserReference(String entityId) {
        if (!isPersisted()) return;
        if (this.userId == null || entityId.equals(this.userId)) {
            repairMissingMaster();
        }
    }

    public final boolean isUserSet() {
        return this.userId != null;
    }

    public final boolean isUser(scrum.server.admin.User user) {
        if (this.userId == null && user == null) return true;
        return user != null && user.getId().equals(this.userId);
    }

    protected final void updateUser(Object value) {
        setUser(value == null ? null : (scrum.server.admin.User)userDao.getById((String)value));
    }
    // -----------------------------------------------------------
    // - color
    // -----------------------------------------------------------

    private java.lang.String color;

    public final java.lang.String getColor() {
        return color;
    }

    public final void setColor(java.lang.String color) {
        color = prepareColor(color);
        if (isColor(color)) return;
        this.color = color;
            updateLastModified();
            fireModified("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
    }

    private final void updateColor(java.lang.String color) {
        if (isColor(color)) return;
        this.color = color;
            updateLastModified();
            fireModified("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
    }

    protected java.lang.String prepareColor(java.lang.String color) {
        // color = Str.removeUnreadableChars(color);
        return color;
    }

    public final boolean isColorSet() {
        return this.color != null;
    }

    public final boolean isColor(java.lang.String color) {
        if (this.color == null && color == null) return true;
        return this.color != null && this.color.equals(color);
    }

    protected final void updateColor(Object value) {
        setColor((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - receiveEmailsOnProjectEvents
    // -----------------------------------------------------------

    private boolean receiveEmailsOnProjectEvents;

    public final boolean isReceiveEmailsOnProjectEvents() {
        return receiveEmailsOnProjectEvents;
    }

    public final void setReceiveEmailsOnProjectEvents(boolean receiveEmailsOnProjectEvents) {
        receiveEmailsOnProjectEvents = prepareReceiveEmailsOnProjectEvents(receiveEmailsOnProjectEvents);
        if (isReceiveEmailsOnProjectEvents(receiveEmailsOnProjectEvents)) return;
        this.receiveEmailsOnProjectEvents = receiveEmailsOnProjectEvents;
            updateLastModified();
            fireModified("receiveEmailsOnProjectEvents", ilarkesto.core.persistance.Persistence.propertyAsString(this.receiveEmailsOnProjectEvents));
    }

    private final void updateReceiveEmailsOnProjectEvents(boolean receiveEmailsOnProjectEvents) {
        if (isReceiveEmailsOnProjectEvents(receiveEmailsOnProjectEvents)) return;
        this.receiveEmailsOnProjectEvents = receiveEmailsOnProjectEvents;
            updateLastModified();
            fireModified("receiveEmailsOnProjectEvents", ilarkesto.core.persistance.Persistence.propertyAsString(this.receiveEmailsOnProjectEvents));
    }

    protected boolean prepareReceiveEmailsOnProjectEvents(boolean receiveEmailsOnProjectEvents) {
        return receiveEmailsOnProjectEvents;
    }

    public final boolean isReceiveEmailsOnProjectEvents(boolean receiveEmailsOnProjectEvents) {
        return this.receiveEmailsOnProjectEvents == receiveEmailsOnProjectEvents;
    }

    protected final void updateReceiveEmailsOnProjectEvents(Object value) {
        setReceiveEmailsOnProjectEvents((Boolean)value);
    }
    // -----------------------------------------------------------
    // - misconducts
    // -----------------------------------------------------------

    private int misconducts;

    public final int getMisconducts() {
        return misconducts;
    }

    public final void setMisconducts(int misconducts) {
        misconducts = prepareMisconducts(misconducts);
        if (isMisconducts(misconducts)) return;
        this.misconducts = misconducts;
            updateLastModified();
            fireModified("misconducts", ilarkesto.core.persistance.Persistence.propertyAsString(this.misconducts));
    }

    private final void updateMisconducts(int misconducts) {
        if (isMisconducts(misconducts)) return;
        this.misconducts = misconducts;
            updateLastModified();
            fireModified("misconducts", ilarkesto.core.persistance.Persistence.propertyAsString(this.misconducts));
    }

    protected int prepareMisconducts(int misconducts) {
        return misconducts;
    }

    public final boolean isMisconducts(int misconducts) {
        return this.misconducts == misconducts;
    }

    protected final void updateMisconducts(Object value) {
        setMisconducts((Integer)value);
    }
    // -----------------------------------------------------------
    // - richtextAutosaveText
    // -----------------------------------------------------------

    private java.lang.String richtextAutosaveText;

    public final java.lang.String getRichtextAutosaveText() {
        return richtextAutosaveText;
    }

    public final void setRichtextAutosaveText(java.lang.String richtextAutosaveText) {
        richtextAutosaveText = prepareRichtextAutosaveText(richtextAutosaveText);
        if (isRichtextAutosaveText(richtextAutosaveText)) return;
        this.richtextAutosaveText = richtextAutosaveText;
            updateLastModified();
            fireModified("richtextAutosaveText", ilarkesto.core.persistance.Persistence.propertyAsString(this.richtextAutosaveText));
    }

    private final void updateRichtextAutosaveText(java.lang.String richtextAutosaveText) {
        if (isRichtextAutosaveText(richtextAutosaveText)) return;
        this.richtextAutosaveText = richtextAutosaveText;
            updateLastModified();
            fireModified("richtextAutosaveText", ilarkesto.core.persistance.Persistence.propertyAsString(this.richtextAutosaveText));
    }

    protected java.lang.String prepareRichtextAutosaveText(java.lang.String richtextAutosaveText) {
        // richtextAutosaveText = Str.removeUnreadableChars(richtextAutosaveText);
        return richtextAutosaveText;
    }

    public final boolean isRichtextAutosaveTextSet() {
        return this.richtextAutosaveText != null;
    }

    public final boolean isRichtextAutosaveText(java.lang.String richtextAutosaveText) {
        if (this.richtextAutosaveText == null && richtextAutosaveText == null) return true;
        return this.richtextAutosaveText != null && this.richtextAutosaveText.equals(richtextAutosaveText);
    }

    protected final void updateRichtextAutosaveText(Object value) {
        setRichtextAutosaveText((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - richtextAutosaveField
    // -----------------------------------------------------------

    private java.lang.String richtextAutosaveField;

    public final java.lang.String getRichtextAutosaveField() {
        return richtextAutosaveField;
    }

    public final void setRichtextAutosaveField(java.lang.String richtextAutosaveField) {
        richtextAutosaveField = prepareRichtextAutosaveField(richtextAutosaveField);
        if (isRichtextAutosaveField(richtextAutosaveField)) return;
        this.richtextAutosaveField = richtextAutosaveField;
            updateLastModified();
            fireModified("richtextAutosaveField", ilarkesto.core.persistance.Persistence.propertyAsString(this.richtextAutosaveField));
    }

    private final void updateRichtextAutosaveField(java.lang.String richtextAutosaveField) {
        if (isRichtextAutosaveField(richtextAutosaveField)) return;
        this.richtextAutosaveField = richtextAutosaveField;
            updateLastModified();
            fireModified("richtextAutosaveField", ilarkesto.core.persistance.Persistence.propertyAsString(this.richtextAutosaveField));
    }

    protected java.lang.String prepareRichtextAutosaveField(java.lang.String richtextAutosaveField) {
        // richtextAutosaveField = Str.removeUnreadableChars(richtextAutosaveField);
        return richtextAutosaveField;
    }

    public final boolean isRichtextAutosaveFieldSet() {
        return this.richtextAutosaveField != null;
    }

    public final boolean isRichtextAutosaveField(java.lang.String richtextAutosaveField) {
        if (this.richtextAutosaveField == null && richtextAutosaveField == null) return true;
        return this.richtextAutosaveField != null && this.richtextAutosaveField.equals(richtextAutosaveField);
    }

    protected final void updateRichtextAutosaveField(Object value) {
        setRichtextAutosaveField((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - selectedEntitysIds
    // -----------------------------------------------------------

    private java.util.List<java.lang.String> selectedEntitysIds = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getSelectedEntitysIds() {
        return new java.util.ArrayList<java.lang.String>(selectedEntitysIds);
    }

    public final void setSelectedEntitysIds(Collection<java.lang.String> selectedEntitysIds) {
        selectedEntitysIds = prepareSelectedEntitysIds(selectedEntitysIds);
        if (selectedEntitysIds == null) selectedEntitysIds = Collections.emptyList();
        if (this.selectedEntitysIds.equals(selectedEntitysIds)) return;
        this.selectedEntitysIds = new java.util.ArrayList<java.lang.String>(selectedEntitysIds);
            updateLastModified();
    }

    private final void updateSelectedEntitysIds(Collection<java.lang.String> selectedEntitysIds) {
        if (selectedEntitysIds == null) selectedEntitysIds = Collections.emptyList();
        if (this.selectedEntitysIds.equals(selectedEntitysIds)) return;
        this.selectedEntitysIds = new java.util.ArrayList<java.lang.String>(selectedEntitysIds);
            updateLastModified();
    }

    protected Collection<java.lang.String> prepareSelectedEntitysIds(Collection<java.lang.String> selectedEntitysIds) {
        return selectedEntitysIds;
    }

    public final boolean containsSelectedEntitysId(java.lang.String selectedEntitysId) {
        if (selectedEntitysId == null) return false;
        if (this.selectedEntitysIds == null) return false;
        return this.selectedEntitysIds.contains(selectedEntitysId);
    }

    public final int getSelectedEntitysIdsCount() {
        if (this.selectedEntitysIds == null) return 0;
        return this.selectedEntitysIds.size();
    }

    public final boolean isSelectedEntitysIdsEmpty() {
        if (this.selectedEntitysIds == null) return true;
        return this.selectedEntitysIds.isEmpty();
    }

    public final boolean addSelectedEntitysId(java.lang.String selectedEntitysId) {
        if (selectedEntitysId == null) throw new IllegalArgumentException("selectedEntitysId == null");
        if (this.selectedEntitysIds == null) this.selectedEntitysIds = new java.util.ArrayList<java.lang.String>();
        boolean added = this.selectedEntitysIds.add(selectedEntitysId);
        return added;
    }

    public final boolean addSelectedEntitysIds(Collection<java.lang.String> selectedEntitysIds) {
        if (selectedEntitysIds == null) throw new IllegalArgumentException("selectedEntitysIds == null");
        if (this.selectedEntitysIds == null) this.selectedEntitysIds = new java.util.ArrayList<java.lang.String>();
        boolean added = false;
        for (java.lang.String selectedEntitysId : selectedEntitysIds) {
            added = added | this.selectedEntitysIds.add(selectedEntitysId);
        }
        return added;
    }

    public final boolean removeSelectedEntitysId(java.lang.String selectedEntitysId) {
        if (selectedEntitysId == null) return false;
        if (this.selectedEntitysIds == null) return false;
        boolean removed = this.selectedEntitysIds.remove(selectedEntitysId);
        return removed;
    }

    public final boolean removeSelectedEntitysIds(Collection<java.lang.String> selectedEntitysIds) {
        if (selectedEntitysIds == null) return false;
        if (selectedEntitysIds.isEmpty()) return false;
        if (this.selectedEntitysIds == null) return false;
        boolean removed = false;
        for (java.lang.String _element: selectedEntitysIds) {
            removed = removed | this.selectedEntitysIds.remove(_element);
        }
        return removed;
    }

    public final boolean clearSelectedEntitysIds() {
        if (this.selectedEntitysIds == null) return false;
        if (this.selectedEntitysIds.isEmpty()) return false;
        this.selectedEntitysIds.clear();
            updateLastModified();
        return true;
    }

    public final String getSelectedEntitysIdsAsCommaSeparatedString() {
        if (this.selectedEntitysIds == null) return null;
        if (this.selectedEntitysIds.isEmpty()) return null;
        return Str.concat(this.selectedEntitysIds,", ");
    }

    public final void setSelectedEntitysIdsAsCommaSeparatedString(String selectedEntitysIds) {
        setSelectedEntitysIds(Str.parseCommaSeparatedString(selectedEntitysIds));
    }
    // -----------------------------------------------------------
    // - online
    // -----------------------------------------------------------

    private boolean online;

    public final boolean isOnline() {
        return online;
    }

    public final void setOnline(boolean online) {
        online = prepareOnline(online);
        if (isOnline(online)) return;
        this.online = online;
            updateLastModified();
    }

    private final void updateOnline(boolean online) {
        if (isOnline(online)) return;
        this.online = online;
            updateLastModified();
    }

    protected boolean prepareOnline(boolean online) {
        return online;
    }

    public final boolean isOnline(boolean online) {
        return this.online == online;
    }

    protected final void updateOnline(Object value) {
        setOnline((Boolean)value);
    }
    // -----------------------------------------------------------
    // - lastActivityDateAndTime
    // -----------------------------------------------------------

    private ilarkesto.core.time.DateAndTime lastActivityDateAndTime;

    public final ilarkesto.core.time.DateAndTime getLastActivityDateAndTime() {
        return lastActivityDateAndTime;
    }

    public final void setLastActivityDateAndTime(ilarkesto.core.time.DateAndTime lastActivityDateAndTime) {
        lastActivityDateAndTime = prepareLastActivityDateAndTime(lastActivityDateAndTime);
        if (isLastActivityDateAndTime(lastActivityDateAndTime)) return;
        this.lastActivityDateAndTime = lastActivityDateAndTime;
            updateLastModified();
    }

    private final void updateLastActivityDateAndTime(ilarkesto.core.time.DateAndTime lastActivityDateAndTime) {
        if (isLastActivityDateAndTime(lastActivityDateAndTime)) return;
        this.lastActivityDateAndTime = lastActivityDateAndTime;
            updateLastModified();
    }

    protected ilarkesto.core.time.DateAndTime prepareLastActivityDateAndTime(ilarkesto.core.time.DateAndTime lastActivityDateAndTime) {
        return lastActivityDateAndTime;
    }

    public final boolean isLastActivityDateAndTimeSet() {
        return this.lastActivityDateAndTime != null;
    }

    public final boolean isLastActivityDateAndTime(ilarkesto.core.time.DateAndTime lastActivityDateAndTime) {
        if (this.lastActivityDateAndTime == null && lastActivityDateAndTime == null) return true;
        return this.lastActivityDateAndTime != null && this.lastActivityDateAndTime.equals(lastActivityDateAndTime);
    }

    protected final void updateLastActivityDateAndTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.DateAndTime((String)value);
        setLastActivityDateAndTime((ilarkesto.core.time.DateAndTime)value);
    }
    // -----------------------------------------------------------
    // - pblFilterThemes
    // -----------------------------------------------------------

    private java.util.List<java.lang.String> pblFilterThemes = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getPblFilterThemes() {
        return new java.util.ArrayList<java.lang.String>(pblFilterThemes);
    }

    public final void setPblFilterThemes(Collection<java.lang.String> pblFilterThemes) {
        pblFilterThemes = preparePblFilterThemes(pblFilterThemes);
        if (pblFilterThemes == null) pblFilterThemes = Collections.emptyList();
        if (this.pblFilterThemes.equals(pblFilterThemes)) return;
        this.pblFilterThemes = new java.util.ArrayList<java.lang.String>(pblFilterThemes);
            updateLastModified();
            fireModified("pblFilterThemes", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterThemes));
    }

    private final void updatePblFilterThemes(Collection<java.lang.String> pblFilterThemes) {
        if (pblFilterThemes == null) pblFilterThemes = Collections.emptyList();
        if (this.pblFilterThemes.equals(pblFilterThemes)) return;
        this.pblFilterThemes = new java.util.ArrayList<java.lang.String>(pblFilterThemes);
            updateLastModified();
            fireModified("pblFilterThemes", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterThemes));
    }

    protected Collection<java.lang.String> preparePblFilterThemes(Collection<java.lang.String> pblFilterThemes) {
        return pblFilterThemes;
    }

    public final boolean containsPblFilterTheme(java.lang.String pblFilterTheme) {
        if (pblFilterTheme == null) return false;
        if (this.pblFilterThemes == null) return false;
        return this.pblFilterThemes.contains(pblFilterTheme);
    }

    public final int getPblFilterThemesCount() {
        if (this.pblFilterThemes == null) return 0;
        return this.pblFilterThemes.size();
    }

    public final boolean isPblFilterThemesEmpty() {
        if (this.pblFilterThemes == null) return true;
        return this.pblFilterThemes.isEmpty();
    }

    public final boolean addPblFilterTheme(java.lang.String pblFilterTheme) {
        if (pblFilterTheme == null) throw new IllegalArgumentException("pblFilterTheme == null");
        if (this.pblFilterThemes == null) this.pblFilterThemes = new java.util.ArrayList<java.lang.String>();
        boolean added = this.pblFilterThemes.add(pblFilterTheme);
        if (added) {
            updateLastModified();
            fireModified("pblFilterThemes", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterThemes));
        }
        return added;
    }

    public final boolean addPblFilterThemes(Collection<java.lang.String> pblFilterThemes) {
        if (pblFilterThemes == null) throw new IllegalArgumentException("pblFilterThemes == null");
        if (this.pblFilterThemes == null) this.pblFilterThemes = new java.util.ArrayList<java.lang.String>();
        boolean added = false;
        for (java.lang.String pblFilterTheme : pblFilterThemes) {
            added = added | this.pblFilterThemes.add(pblFilterTheme);
        }
        if (added) {
            updateLastModified();
            fireModified("pblFilterThemes", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterThemes));
        }
        return added;
    }

    public final boolean removePblFilterTheme(java.lang.String pblFilterTheme) {
        if (pblFilterTheme == null) return false;
        if (this.pblFilterThemes == null) return false;
        boolean removed = this.pblFilterThemes.remove(pblFilterTheme);
        if (removed) {
            updateLastModified();
            fireModified("pblFilterThemes", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterThemes));
        }
        return removed;
    }

    public final boolean removePblFilterThemes(Collection<java.lang.String> pblFilterThemes) {
        if (pblFilterThemes == null) return false;
        if (pblFilterThemes.isEmpty()) return false;
        if (this.pblFilterThemes == null) return false;
        boolean removed = false;
        for (java.lang.String _element: pblFilterThemes) {
            removed = removed | this.pblFilterThemes.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("pblFilterThemes", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterThemes));
        }
        return removed;
    }

    public final boolean clearPblFilterThemes() {
        if (this.pblFilterThemes == null) return false;
        if (this.pblFilterThemes.isEmpty()) return false;
        this.pblFilterThemes.clear();
            updateLastModified();
            fireModified("pblFilterThemes", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterThemes));
        return true;
    }

    public final String getPblFilterThemesAsCommaSeparatedString() {
        if (this.pblFilterThemes == null) return null;
        if (this.pblFilterThemes.isEmpty()) return null;
        return Str.concat(this.pblFilterThemes,", ");
    }

    public final void setPblFilterThemesAsCommaSeparatedString(String pblFilterThemes) {
        setPblFilterThemes(Str.parseCommaSeparatedString(pblFilterThemes));
    }
    // -----------------------------------------------------------
    // - pblFilterQualitys
    // -----------------------------------------------------------

    private java.util.Set<String> pblFilterQualitysIds = new java.util.HashSet<String>();

    public final Collection<String> getPblFilterQualitysIds() {
        return java.util.Collections .unmodifiableCollection(this.pblFilterQualitysIds);
    }

    public final java.util.Set<scrum.server.project.Quality> getPblFilterQualitys() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.pblFilterQualitysIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("ProjectUserConfig.pblFilterQualitys");
        }
    }

    public final void setPblFilterQualitys(Collection<scrum.server.project.Quality> pblFilterQualitys) {
        pblFilterQualitys = preparePblFilterQualitys(pblFilterQualitys);
        if (pblFilterQualitys == null) pblFilterQualitys = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(pblFilterQualitys);
        setPblFilterQualitysIds(ids);
    }

    public final void setPblFilterQualitysIds(java.util.Set<String> ids) {
        if (Utl.equals(pblFilterQualitysIds, ids)) return;
        pblFilterQualitysIds = ids;
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
    }

    private final void updatePblFilterQualitysIds(java.util.Set<String> ids) {
        setPblFilterQualitysIds(ids);
    }

    protected Collection<scrum.server.project.Quality> preparePblFilterQualitys(Collection<scrum.server.project.Quality> pblFilterQualitys) {
        return pblFilterQualitys;
    }

    protected void repairDeadPblFilterQualityReference(String entityId) {
        if (!isPersisted()) return;
        if (this.pblFilterQualitysIds == null ) return;
        if (this.pblFilterQualitysIds.remove(entityId)) {
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        }
    }

    public final boolean containsPblFilterQuality(scrum.server.project.Quality pblFilterQuality) {
        if (pblFilterQuality == null) return false;
        if (this.pblFilterQualitysIds == null) return false;
        return this.pblFilterQualitysIds.contains(pblFilterQuality.getId());
    }

    public final int getPblFilterQualitysCount() {
        if (this.pblFilterQualitysIds == null) return 0;
        return this.pblFilterQualitysIds.size();
    }

    public final boolean isPblFilterQualitysEmpty() {
        if (this.pblFilterQualitysIds == null) return true;
        return this.pblFilterQualitysIds.isEmpty();
    }

    public final boolean addPblFilterQuality(scrum.server.project.Quality pblFilterQuality) {
        if (pblFilterQuality == null) throw new IllegalArgumentException("pblFilterQuality == null");
        if (this.pblFilterQualitysIds == null) this.pblFilterQualitysIds = new java.util.HashSet<String>();
        boolean added = this.pblFilterQualitysIds.add(pblFilterQuality.getId());
        if (added) {
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        }
        return added;
    }

    public final boolean addPblFilterQualitys(Collection<scrum.server.project.Quality> pblFilterQualitys) {
        if (pblFilterQualitys == null) throw new IllegalArgumentException("pblFilterQualitys == null");
        if (this.pblFilterQualitysIds == null) this.pblFilterQualitysIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.project.Quality pblFilterQuality : pblFilterQualitys) {
            added = added | this.pblFilterQualitysIds.add(pblFilterQuality.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        }
        return added;
    }

    public final boolean removePblFilterQuality(scrum.server.project.Quality pblFilterQuality) {
        if (pblFilterQuality == null) return false;
        if (this.pblFilterQualitysIds == null) return false;
        boolean removed = this.pblFilterQualitysIds.remove(pblFilterQuality.getId());
        if (removed) {
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        }
        return removed;
    }

    public final boolean removePblFilterQualitys(Collection<scrum.server.project.Quality> pblFilterQualitys) {
        if (pblFilterQualitys == null) return false;
        if (pblFilterQualitys.isEmpty()) return false;
        if (this.pblFilterQualitysIds == null) return false;
        boolean removed = false;
        for (scrum.server.project.Quality _element: pblFilterQualitys) {
            removed = removed | this.pblFilterQualitysIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        }
        return removed;
    }

    public final boolean clearPblFilterQualitys() {
        if (this.pblFilterQualitysIds == null) return false;
        if (this.pblFilterQualitysIds.isEmpty()) return false;
        this.pblFilterQualitysIds.clear();
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        return true;
    }
    // -----------------------------------------------------------
    // - pblFilterDateFrom
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date pblFilterDateFrom;

    public final ilarkesto.core.time.Date getPblFilterDateFrom() {
        return pblFilterDateFrom;
    }

    public final void setPblFilterDateFrom(ilarkesto.core.time.Date pblFilterDateFrom) {
        pblFilterDateFrom = preparePblFilterDateFrom(pblFilterDateFrom);
        if (isPblFilterDateFrom(pblFilterDateFrom)) return;
        this.pblFilterDateFrom = pblFilterDateFrom;
            updateLastModified();
            fireModified("pblFilterDateFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterDateFrom));
    }

    private final void updatePblFilterDateFrom(ilarkesto.core.time.Date pblFilterDateFrom) {
        if (isPblFilterDateFrom(pblFilterDateFrom)) return;
        this.pblFilterDateFrom = pblFilterDateFrom;
            updateLastModified();
            fireModified("pblFilterDateFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterDateFrom));
    }

    protected ilarkesto.core.time.Date preparePblFilterDateFrom(ilarkesto.core.time.Date pblFilterDateFrom) {
        return pblFilterDateFrom;
    }

    public final boolean isPblFilterDateFromSet() {
        return this.pblFilterDateFrom != null;
    }

    public final boolean isPblFilterDateFrom(ilarkesto.core.time.Date pblFilterDateFrom) {
        if (this.pblFilterDateFrom == null && pblFilterDateFrom == null) return true;
        return this.pblFilterDateFrom != null && this.pblFilterDateFrom.equals(pblFilterDateFrom);
    }

    protected final void updatePblFilterDateFrom(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setPblFilterDateFrom((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - pblFilterDateTo
    // -----------------------------------------------------------

    private ilarkesto.core.time.Date pblFilterDateTo;

    public final ilarkesto.core.time.Date getPblFilterDateTo() {
        return pblFilterDateTo;
    }

    public final void setPblFilterDateTo(ilarkesto.core.time.Date pblFilterDateTo) {
        pblFilterDateTo = preparePblFilterDateTo(pblFilterDateTo);
        if (isPblFilterDateTo(pblFilterDateTo)) return;
        this.pblFilterDateTo = pblFilterDateTo;
            updateLastModified();
            fireModified("pblFilterDateTo", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterDateTo));
    }

    private final void updatePblFilterDateTo(ilarkesto.core.time.Date pblFilterDateTo) {
        if (isPblFilterDateTo(pblFilterDateTo)) return;
        this.pblFilterDateTo = pblFilterDateTo;
            updateLastModified();
            fireModified("pblFilterDateTo", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterDateTo));
    }

    protected ilarkesto.core.time.Date preparePblFilterDateTo(ilarkesto.core.time.Date pblFilterDateTo) {
        return pblFilterDateTo;
    }

    public final boolean isPblFilterDateToSet() {
        return this.pblFilterDateTo != null;
    }

    public final boolean isPblFilterDateTo(ilarkesto.core.time.Date pblFilterDateTo) {
        if (this.pblFilterDateTo == null && pblFilterDateTo == null) return true;
        return this.pblFilterDateTo != null && this.pblFilterDateTo.equals(pblFilterDateTo);
    }

    protected final void updatePblFilterDateTo(Object value) {
        value = value == null ? null : new ilarkesto.core.time.Date((String)value);
        setPblFilterDateTo((ilarkesto.core.time.Date)value);
    }
    // -----------------------------------------------------------
    // - pblFilterEstimationFrom
    // -----------------------------------------------------------

    private java.lang.Float pblFilterEstimationFrom;

    public final java.lang.Float getPblFilterEstimationFrom() {
        return pblFilterEstimationFrom;
    }

    public final void setPblFilterEstimationFrom(java.lang.Float pblFilterEstimationFrom) {
        pblFilterEstimationFrom = preparePblFilterEstimationFrom(pblFilterEstimationFrom);
        if (isPblFilterEstimationFrom(pblFilterEstimationFrom)) return;
        this.pblFilterEstimationFrom = pblFilterEstimationFrom;
            updateLastModified();
            fireModified("pblFilterEstimationFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterEstimationFrom));
    }

    private final void updatePblFilterEstimationFrom(java.lang.Float pblFilterEstimationFrom) {
        if (isPblFilterEstimationFrom(pblFilterEstimationFrom)) return;
        this.pblFilterEstimationFrom = pblFilterEstimationFrom;
            updateLastModified();
            fireModified("pblFilterEstimationFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterEstimationFrom));
    }

    protected java.lang.Float preparePblFilterEstimationFrom(java.lang.Float pblFilterEstimationFrom) {
        return pblFilterEstimationFrom;
    }

    public final boolean isPblFilterEstimationFromSet() {
        return this.pblFilterEstimationFrom != null;
    }

    public final boolean isPblFilterEstimationFrom(java.lang.Float pblFilterEstimationFrom) {
        if (this.pblFilterEstimationFrom == null && pblFilterEstimationFrom == null) return true;
        return this.pblFilterEstimationFrom != null && this.pblFilterEstimationFrom.equals(pblFilterEstimationFrom);
    }

    protected final void updatePblFilterEstimationFrom(Object value) {
        setPblFilterEstimationFrom((java.lang.Float)value);
    }
    // -----------------------------------------------------------
    // - pblFilterEstimationTo
    // -----------------------------------------------------------

    private java.lang.Float pblFilterEstimationTo;

    public final java.lang.Float getPblFilterEstimationTo() {
        return pblFilterEstimationTo;
    }

    public final void setPblFilterEstimationTo(java.lang.Float pblFilterEstimationTo) {
        pblFilterEstimationTo = preparePblFilterEstimationTo(pblFilterEstimationTo);
        if (isPblFilterEstimationTo(pblFilterEstimationTo)) return;
        this.pblFilterEstimationTo = pblFilterEstimationTo;
            updateLastModified();
            fireModified("pblFilterEstimationTo", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterEstimationTo));
    }

    private final void updatePblFilterEstimationTo(java.lang.Float pblFilterEstimationTo) {
        if (isPblFilterEstimationTo(pblFilterEstimationTo)) return;
        this.pblFilterEstimationTo = pblFilterEstimationTo;
            updateLastModified();
            fireModified("pblFilterEstimationTo", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterEstimationTo));
    }

    protected java.lang.Float preparePblFilterEstimationTo(java.lang.Float pblFilterEstimationTo) {
        return pblFilterEstimationTo;
    }

    public final boolean isPblFilterEstimationToSet() {
        return this.pblFilterEstimationTo != null;
    }

    public final boolean isPblFilterEstimationTo(java.lang.Float pblFilterEstimationTo) {
        if (this.pblFilterEstimationTo == null && pblFilterEstimationTo == null) return true;
        return this.pblFilterEstimationTo != null && this.pblFilterEstimationTo.equals(pblFilterEstimationTo);
    }

    protected final void updatePblFilterEstimationTo(Object value) {
        setPblFilterEstimationTo((java.lang.Float)value);
    }
    // -----------------------------------------------------------
    // - pblFilterText
    // -----------------------------------------------------------

    private java.lang.String pblFilterText;

    public final java.lang.String getPblFilterText() {
        return pblFilterText;
    }

    public final void setPblFilterText(java.lang.String pblFilterText) {
        pblFilterText = preparePblFilterText(pblFilterText);
        if (isPblFilterText(pblFilterText)) return;
        this.pblFilterText = pblFilterText;
            updateLastModified();
            fireModified("pblFilterText", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterText));
    }

    private final void updatePblFilterText(java.lang.String pblFilterText) {
        if (isPblFilterText(pblFilterText)) return;
        this.pblFilterText = pblFilterText;
            updateLastModified();
            fireModified("pblFilterText", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterText));
    }

    protected java.lang.String preparePblFilterText(java.lang.String pblFilterText) {
        // pblFilterText = Str.removeUnreadableChars(pblFilterText);
        return pblFilterText;
    }

    public final boolean isPblFilterTextSet() {
        return this.pblFilterText != null;
    }

    public final boolean isPblFilterText(java.lang.String pblFilterText) {
        if (this.pblFilterText == null && pblFilterText == null) return true;
        return this.pblFilterText != null && this.pblFilterText.equals(pblFilterText);
    }

    protected final void updatePblFilterText(Object value) {
        setPblFilterText((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("userId")) updateUserId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("color")) updateColor(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("receiveEmailsOnProjectEvents")) updateReceiveEmailsOnProjectEvents(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("misconducts")) updateMisconducts(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("richtextAutosaveText")) updateRichtextAutosaveText(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("richtextAutosaveField")) updateRichtextAutosaveField(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("selectedEntitysIds")) updateSelectedEntitysIds(ilarkesto.core.persistance.Persistence.parsePropertyStringCollection(value));
            if (property.equals("online")) updateOnline(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("lastActivityDateAndTime")) updateLastActivityDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
            if (property.equals("pblFilterThemes")) updatePblFilterThemes(ilarkesto.core.persistance.Persistence.parsePropertyStringCollection(value));
            if (property.equals("pblFilterQualitysIds")) updatePblFilterQualitysIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("pblFilterDateFrom")) updatePblFilterDateFrom(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("pblFilterDateTo")) updatePblFilterDateTo(ilarkesto.core.persistance.Persistence.parsePropertyDate(value));
            if (property.equals("pblFilterEstimationFrom")) updatePblFilterEstimationFrom(ilarkesto.core.persistance.Persistence.parsePropertyFloat(value));
            if (property.equals("pblFilterEstimationTo")) updatePblFilterEstimationTo(ilarkesto.core.persistance.Persistence.parsePropertyFloat(value));
            if (property.equals("pblFilterText")) updatePblFilterText(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadProjectReference(entityId);
        repairDeadUserReference(entityId);
        if (this.selectedEntitysIds == null) this.selectedEntitysIds = new java.util.ArrayList<java.lang.String>();
        if (this.pblFilterThemes == null) this.pblFilterThemes = new java.util.ArrayList<java.lang.String>();
        if (this.pblFilterQualitysIds == null) this.pblFilterQualitysIds = new java.util.HashSet<String>();
        repairDeadPblFilterQualityReference(entityId);
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
        if (!isUserSet()) {
            repairMissingMaster();
        }
        try {
            getUser();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead user reference");
            repairDeadUserReference(this.userId);
        }
        if (this.selectedEntitysIds == null) this.selectedEntitysIds = new java.util.ArrayList<java.lang.String>();
        if (this.pblFilterThemes == null) this.pblFilterThemes = new java.util.ArrayList<java.lang.String>();
        if (this.pblFilterQualitysIds == null) this.pblFilterQualitysIds = new java.util.HashSet<String>();
        Set<String> pblFilterQualitys = new HashSet<String>(this.pblFilterQualitysIds);
        for (String entityId : pblFilterQualitys) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead pblFilterQuality reference");
                repairDeadPblFilterQualityReference(entityId);
            }
        }
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.project.ProjectDao projectDao;

    public static final void setProjectDao(scrum.server.project.ProjectDao projectDao) {
        GProjectUserConfig.projectDao = projectDao;
    }

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GProjectUserConfig.userDao = userDao;
    }

    static scrum.server.project.QualityDao qualityDao;

    public static final void setQualityDao(scrum.server.project.QualityDao qualityDao) {
        GProjectUserConfig.qualityDao = qualityDao;
    }

    static scrum.server.admin.ProjectUserConfigDao projectUserConfigDao;

    public static final void setProjectUserConfigDao(scrum.server.admin.ProjectUserConfigDao projectUserConfigDao) {
        GProjectUserConfig.projectUserConfigDao = projectUserConfigDao;
    }

}