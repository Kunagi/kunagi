// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.admin;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GProjectUserConfig
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<ProjectUserConfig> {

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

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ProjectUserConfig> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ProjectUserConfig>() {
    @Override
        protected Set<ProjectUserConfig> loadById(final String id) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byProject";
            }
        }.list();
        }
    };

    public static Set< ProjectUserConfig> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<ProjectUserConfig>();
        return projectBackReferencesCache.getById(project.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ProjectUserConfig> userBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ProjectUserConfig>() {
    @Override
        protected Set<ProjectUserConfig> loadById(final String id) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return id.equals(entity.getUserId());
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byUser";
            }
        }.list();
        }
    };

    public static Set< ProjectUserConfig> listByUser(final scrum.client.admin.User user) {
        if (user == null) return new HashSet<ProjectUserConfig>();
        return userBackReferencesCache.getById(user.getId());
    }

    public static Set< ProjectUserConfig> listByColor(final java.lang.String color) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isColor(color);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byColor";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByReceiveEmailsOnProjectEvents(final boolean receiveEmailsOnProjectEvents) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isReceiveEmailsOnProjectEvents(receiveEmailsOnProjectEvents);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byReceiveEmailsOnProjectEvents";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByMisconducts(final int misconducts) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isMisconducts(misconducts);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byMisconducts";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByRichtextAutosaveText(final java.lang.String richtextAutosaveText) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isRichtextAutosaveText(richtextAutosaveText);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byRichtextAutosaveText";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByRichtextAutosaveField(final java.lang.String richtextAutosaveField) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isRichtextAutosaveField(richtextAutosaveField);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byRichtextAutosaveField";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listBySelectedEntitysId(final java.lang.String selectedEntitysId) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.containsSelectedEntitysId(selectedEntitysId);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:bySelectedEntitysIds";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByOnline(final boolean online) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isOnline(online);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byOnline";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByLastActivityDateAndTime(final ilarkesto.core.time.DateAndTime lastActivityDateAndTime) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isLastActivityDateAndTime(lastActivityDateAndTime);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byLastActivityDateAndTime";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByPblFilterTheme(final java.lang.String pblFilterTheme) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.containsPblFilterTheme(pblFilterTheme);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byPblFilterThemes";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ProjectUserConfig> pblFilterQualitysBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ProjectUserConfig>() {
    @Override
        protected Set<ProjectUserConfig> loadById(final String id) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.getPblFilterQualitysIds().contains(id);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byPblFilterQualitys";
            }
        }.list();
        }
    };

    public static Set< ProjectUserConfig> listByPblFilterQuality(final scrum.client.project.Quality pblFilterQuality) {
        if (pblFilterQuality == null) return new HashSet<ProjectUserConfig>();
        return pblFilterQualitysBackReferencesCache.getById(pblFilterQuality.getId());
    }

    public static Set< ProjectUserConfig> listByPblFilterDateFrom(final ilarkesto.core.time.Date pblFilterDateFrom) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isPblFilterDateFrom(pblFilterDateFrom);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byPblFilterDateFrom";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByPblFilterDateTo(final ilarkesto.core.time.Date pblFilterDateTo) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isPblFilterDateTo(pblFilterDateTo);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byPblFilterDateTo";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByPblFilterEstimationFrom(final java.lang.Float pblFilterEstimationFrom) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isPblFilterEstimationFrom(pblFilterEstimationFrom);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byPblFilterEstimationFrom";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByPblFilterEstimationTo(final java.lang.Float pblFilterEstimationTo) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isPblFilterEstimationTo(pblFilterEstimationTo);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byPblFilterEstimationTo";
            }
        }.list();
    }

    public static Set< ProjectUserConfig> listByPblFilterText(final java.lang.String pblFilterText) {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isPblFilterText(pblFilterText);
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byPblFilterText";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
        userBackReferencesCache.clear(getUserId());
        pblFilterQualitysBackReferencesCache.clear(getPblFilterQualitysIds());
    }

    public abstract boolean isMisconductsEditable();

    public static Set<ProjectUserConfig> listByIsMisconductsEditable() {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isMisconductsEditable();
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byIsMisconductsEditable";
            }
        }.list();
    }

    public final boolean isNotMisconductsEditable() {
        return !isMisconductsEditable();
    }

    public static Set<ProjectUserConfig> listByIsNotMisconductsEditable() {
        return new AProjectUserConfigQuery() {
            @Override
            public boolean test(ProjectUserConfig entity) {
                return entity.isNotMisconductsEditable();
            }
            @Override
            public String toString() {
                return "ProjectUserConfig:byIsNotMisconductsEditable";
            }
        }.list();
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

    public final scrum.client.project.Project getProject() {
        try {
            return this.projectId == null ? null : (scrum.client.project.Project) AEntity.getById(this.projectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("ProjectUserConfig.project");
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
    // - user
    // -----------------------------------------------------------

    private String userId;

    public final String getUserId() {
        return this.userId;
    }

    public final scrum.client.admin.User getUser() {
        try {
            return this.userId == null ? null : (scrum.client.admin.User) AEntity.getById(this.userId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("ProjectUserConfig.user");
        }
    }

    public final void setUser(scrum.client.admin.User user) {
        user = prepareUser(user);
        if (isUser(user)) return;
        setUserId(user == null ? null : user.getId());
    }

    public final void setUserId(String id) {
        if (Utl.equals(userId, id)) return;
        clearUserBackReferenceCache(id, this.userId);
        this.userId = id;
            updateLastModified();
            fireModified("userId", ilarkesto.core.persistance.Persistence.propertyAsString(this.userId));
    }

    private void clearUserBackReferenceCache(String oldId, String newId) {
        userBackReferencesCache.clear(oldId);
        userBackReferencesCache.clear(newId);
    }

    private final void updateUserId(String id) {
        setUserId(id);
    }

    protected scrum.client.admin.User prepareUser(scrum.client.admin.User user) {
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

    public final boolean isUser(scrum.client.admin.User user) {
        if (this.userId == null && user == null) return true;
        return user != null && user.getId().equals(this.userId);
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
         color = Str.removeControlChars(color);
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
         richtextAutosaveText = Str.removeControlChars(richtextAutosaveText);
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
         richtextAutosaveField = Str.removeControlChars(richtextAutosaveField);
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

    public final java.util.Set<scrum.client.project.Quality> getPblFilterQualitys() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.pblFilterQualitysIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("ProjectUserConfig.pblFilterQualitys");
        }
    }

    public final void setPblFilterQualitys(Collection<scrum.client.project.Quality> pblFilterQualitys) {
        pblFilterQualitys = preparePblFilterQualitys(pblFilterQualitys);
        if (pblFilterQualitys == null) pblFilterQualitys = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(pblFilterQualitys);
        setPblFilterQualitysIds(ids);
    }

    public final void setPblFilterQualitysIds(java.util.Set<String> ids) {
        if (Utl.equals(pblFilterQualitysIds, ids)) return;
        clearPblFilterQualitysBackReferenceCache(ids, pblFilterQualitysIds);
        pblFilterQualitysIds = ids;
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
    }

    private void clearPblFilterQualitysBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        pblFilterQualitysBackReferencesCache.clear(oldId);
        pblFilterQualitysBackReferencesCache.clear(newId);
    }

    private final void updatePblFilterQualitysIds(java.util.Set<String> ids) {
        setPblFilterQualitysIds(ids);
    }

    protected Collection<scrum.client.project.Quality> preparePblFilterQualitys(Collection<scrum.client.project.Quality> pblFilterQualitys) {
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

    public final boolean containsPblFilterQuality(scrum.client.project.Quality pblFilterQuality) {
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

    public final boolean addPblFilterQuality(scrum.client.project.Quality pblFilterQuality) {
        if (pblFilterQuality == null) throw new IllegalArgumentException("pblFilterQuality == null");
        if (this.pblFilterQualitysIds == null) this.pblFilterQualitysIds = new java.util.HashSet<String>();
        boolean added = this.pblFilterQualitysIds.add(pblFilterQuality.getId());
        if (added) pblFilterQualitysBackReferencesCache.clear(pblFilterQuality.getId());
        if (added) {
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        }
        return added;
    }

    public final boolean addPblFilterQualitys(Collection<scrum.client.project.Quality> pblFilterQualitys) {
        if (pblFilterQualitys == null) throw new IllegalArgumentException("pblFilterQualitys == null");
        if (this.pblFilterQualitysIds == null) this.pblFilterQualitysIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.project.Quality pblFilterQuality : pblFilterQualitys) {
            added = added | this.pblFilterQualitysIds.add(pblFilterQuality.getId());
        }
        if (added) pblFilterQualitysBackReferencesCache.clear(this.pblFilterQualitysIds);
        if (added) {
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        }
        return added;
    }

    public final boolean removePblFilterQuality(scrum.client.project.Quality pblFilterQuality) {
        if (pblFilterQuality == null) return false;
        if (this.pblFilterQualitysIds == null) return false;
        boolean removed = this.pblFilterQualitysIds.remove(pblFilterQuality.getId());
        if (removed) pblFilterQualitysBackReferencesCache.clear(pblFilterQuality.getId());
        if (removed) {
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        }
        return removed;
    }

    public final boolean removePblFilterQualitys(Collection<scrum.client.project.Quality> pblFilterQualitys) {
        if (pblFilterQualitys == null) return false;
        if (pblFilterQualitys.isEmpty()) return false;
        if (this.pblFilterQualitysIds == null) return false;
        boolean removed = false;
        for (scrum.client.project.Quality _element: pblFilterQualitys) {
            removed = removed | this.pblFilterQualitysIds.remove(_element);
        }
        if (removed) pblFilterQualitysBackReferencesCache.clear(this.pblFilterQualitysIds);
        if (removed) {
            updateLastModified();
            fireModified("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        }
        return removed;
    }

    public final boolean clearPblFilterQualitys() {
        if (this.pblFilterQualitysIds == null) return false;
        if (this.pblFilterQualitysIds.isEmpty()) return false;
        pblFilterQualitysBackReferencesCache.clear(this.pblFilterQualitysIds);
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
         pblFilterText = Str.removeControlChars(pblFilterText);
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

    // --- PLUGIN: GwtEntityPropertyEditorClassGeneratorPlugin ---

    private transient ColorModel colorModel;

    public ColorModel getColorModel() {
        if (colorModel == null) colorModel = createColorModel();
        return colorModel;
    }

    protected ColorModel createColorModel() { return new ColorModel(); }

    protected class ColorModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_color";
        }

        @Override
        public java.lang.String getValue() {
            return getColor();
        }

        @Override
        public void setValue(java.lang.String value) {
            setColor(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient ReceiveEmailsOnProjectEventsModel receiveEmailsOnProjectEventsModel;

    public ReceiveEmailsOnProjectEventsModel getReceiveEmailsOnProjectEventsModel() {
        if (receiveEmailsOnProjectEventsModel == null) receiveEmailsOnProjectEventsModel = createReceiveEmailsOnProjectEventsModel();
        return receiveEmailsOnProjectEventsModel;
    }

    protected ReceiveEmailsOnProjectEventsModel createReceiveEmailsOnProjectEventsModel() { return new ReceiveEmailsOnProjectEventsModel(); }

    protected class ReceiveEmailsOnProjectEventsModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_receiveEmailsOnProjectEvents";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isReceiveEmailsOnProjectEvents();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setReceiveEmailsOnProjectEvents(value);
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

    private transient MisconductsModel misconductsModel;

    public MisconductsModel getMisconductsModel() {
        if (misconductsModel == null) misconductsModel = createMisconductsModel();
        return misconductsModel;
    }

    protected MisconductsModel createMisconductsModel() { return new MisconductsModel(); }

    protected class MisconductsModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_misconducts";
        }

        @Override
        public java.lang.Integer getValue() {
            return getMisconducts();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setMisconducts(value);
        }

            @Override
            public void increment() {
                setMisconducts(getMisconducts() + 1);
            }

            @Override
            public void decrement() {
                setMisconducts(getMisconducts() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isEditable() { return GProjectUserConfig.this.isMisconductsEditable(); }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient RichtextAutosaveTextModel richtextAutosaveTextModel;

    public RichtextAutosaveTextModel getRichtextAutosaveTextModel() {
        if (richtextAutosaveTextModel == null) richtextAutosaveTextModel = createRichtextAutosaveTextModel();
        return richtextAutosaveTextModel;
    }

    protected RichtextAutosaveTextModel createRichtextAutosaveTextModel() { return new RichtextAutosaveTextModel(); }

    protected class RichtextAutosaveTextModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_richtextAutosaveText";
        }

        @Override
        public java.lang.String getValue() {
            return getRichtextAutosaveText();
        }

        @Override
        public void setValue(java.lang.String value) {
            setRichtextAutosaveText(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient RichtextAutosaveFieldModel richtextAutosaveFieldModel;

    public RichtextAutosaveFieldModel getRichtextAutosaveFieldModel() {
        if (richtextAutosaveFieldModel == null) richtextAutosaveFieldModel = createRichtextAutosaveFieldModel();
        return richtextAutosaveFieldModel;
    }

    protected RichtextAutosaveFieldModel createRichtextAutosaveFieldModel() { return new RichtextAutosaveFieldModel(); }

    protected class RichtextAutosaveFieldModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_richtextAutosaveField";
        }

        @Override
        public java.lang.String getValue() {
            return getRichtextAutosaveField();
        }

        @Override
        public void setValue(java.lang.String value) {
            setRichtextAutosaveField(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient OnlineModel onlineModel;

    public OnlineModel getOnlineModel() {
        if (onlineModel == null) onlineModel = createOnlineModel();
        return onlineModel;
    }

    protected OnlineModel createOnlineModel() { return new OnlineModel(); }

    protected class OnlineModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_online";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isOnline();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setOnline(value);
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

    private transient LastActivityDateAndTimeModel lastActivityDateAndTimeModel;

    public LastActivityDateAndTimeModel getLastActivityDateAndTimeModel() {
        if (lastActivityDateAndTimeModel == null) lastActivityDateAndTimeModel = createLastActivityDateAndTimeModel();
        return lastActivityDateAndTimeModel;
    }

    protected LastActivityDateAndTimeModel createLastActivityDateAndTimeModel() { return new LastActivityDateAndTimeModel(); }

    protected class LastActivityDateAndTimeModel extends ilarkesto.gwt.client.editor.ADateAndTimeEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_lastActivityDateAndTime";
        }

        @Override
        public ilarkesto.core.time.DateAndTime getValue() {
            return getLastActivityDateAndTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.DateAndTime value) {
            setLastActivityDateAndTime(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.DateAndTime oldValue, ilarkesto.core.time.DateAndTime newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PblFilterDateFromModel pblFilterDateFromModel;

    public PblFilterDateFromModel getPblFilterDateFromModel() {
        if (pblFilterDateFromModel == null) pblFilterDateFromModel = createPblFilterDateFromModel();
        return pblFilterDateFromModel;
    }

    protected PblFilterDateFromModel createPblFilterDateFromModel() { return new PblFilterDateFromModel(); }

    protected class PblFilterDateFromModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_pblFilterDateFrom";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getPblFilterDateFrom();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setPblFilterDateFrom(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PblFilterDateToModel pblFilterDateToModel;

    public PblFilterDateToModel getPblFilterDateToModel() {
        if (pblFilterDateToModel == null) pblFilterDateToModel = createPblFilterDateToModel();
        return pblFilterDateToModel;
    }

    protected PblFilterDateToModel createPblFilterDateToModel() { return new PblFilterDateToModel(); }

    protected class PblFilterDateToModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_pblFilterDateTo";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getPblFilterDateTo();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setPblFilterDateTo(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PblFilterEstimationFromModel pblFilterEstimationFromModel;

    public PblFilterEstimationFromModel getPblFilterEstimationFromModel() {
        if (pblFilterEstimationFromModel == null) pblFilterEstimationFromModel = createPblFilterEstimationFromModel();
        return pblFilterEstimationFromModel;
    }

    protected PblFilterEstimationFromModel createPblFilterEstimationFromModel() { return new PblFilterEstimationFromModel(); }

    protected class PblFilterEstimationFromModel extends ilarkesto.gwt.client.editor.AFloatEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_pblFilterEstimationFrom";
        }

        @Override
        public java.lang.Float getValue() {
            return getPblFilterEstimationFrom();
        }

        @Override
        public void setValue(java.lang.Float value) {
            setPblFilterEstimationFrom(value);
        }

        @Override
        protected void onChangeValue(java.lang.Float oldValue, java.lang.Float newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PblFilterEstimationToModel pblFilterEstimationToModel;

    public PblFilterEstimationToModel getPblFilterEstimationToModel() {
        if (pblFilterEstimationToModel == null) pblFilterEstimationToModel = createPblFilterEstimationToModel();
        return pblFilterEstimationToModel;
    }

    protected PblFilterEstimationToModel createPblFilterEstimationToModel() { return new PblFilterEstimationToModel(); }

    protected class PblFilterEstimationToModel extends ilarkesto.gwt.client.editor.AFloatEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_pblFilterEstimationTo";
        }

        @Override
        public java.lang.Float getValue() {
            return getPblFilterEstimationTo();
        }

        @Override
        public void setValue(java.lang.Float value) {
            setPblFilterEstimationTo(value);
        }

        @Override
        protected void onChangeValue(java.lang.Float oldValue, java.lang.Float newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient PblFilterTextModel pblFilterTextModel;

    public PblFilterTextModel getPblFilterTextModel() {
        if (pblFilterTextModel == null) pblFilterTextModel = createPblFilterTextModel();
        return pblFilterTextModel;
    }

    protected PblFilterTextModel createPblFilterTextModel() { return new PblFilterTextModel(); }

    protected class PblFilterTextModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_pblFilterText";
        }

        @Override
        public java.lang.String getValue() {
            return getPblFilterText();
        }

        @Override
        public void setValue(java.lang.String value) {
            setPblFilterText(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}