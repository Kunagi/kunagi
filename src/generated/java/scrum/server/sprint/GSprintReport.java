// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.sprint;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GSprintReport
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<SprintReport> {

    public static class SprintReportMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata sprint = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "sprint";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SprintReport)entity).getSprint();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata completedRequirements = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "completedRequirements";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SprintReport)entity).getCompletedRequirements();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata rejectedRequirements = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "rejectedRequirements";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SprintReport)entity).getRejectedRequirements();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata requirementsOrderIds = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "requirementsOrderIds";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SprintReport)entity).getRequirementsOrderIds();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata closedTasks = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "closedTasks";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SprintReport)entity).getClosedTasks();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata openTasks = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "openTasks";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SprintReport)entity).getOpenTasks();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata burnedWork = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "burnedWork";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((SprintReport)entity).getBurnedWork();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            sprint
            ,completedRequirements
            ,rejectedRequirements
            ,requirementsOrderIds
            ,closedTasks
            ,openTasks
            ,burnedWork
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("sprint".equals(fieldName)) return sprint;
            if ("sprintId".equals(fieldName)) return sprint;
            if ("completedRequirements".equals(fieldName)) return completedRequirements;
            if ("completedRequirementsIds".equals(fieldName)) return completedRequirements;
            if ("rejectedRequirements".equals(fieldName)) return rejectedRequirements;
            if ("rejectedRequirementsIds".equals(fieldName)) return rejectedRequirements;
            if ("requirementsOrderIds".equals(fieldName)) return requirementsOrderIds;
            if ("closedTasks".equals(fieldName)) return closedTasks;
            if ("closedTasksIds".equals(fieldName)) return closedTasks;
            if ("openTasks".equals(fieldName)) return openTasks;
            if ("openTasksIds".equals(fieldName)) return openTasks;
            if ("burnedWork".equals(fieldName)) return burnedWork;
            return null;
        }

    }

    public static transient final SprintReportMetadata metadata = new SprintReportMetadata();

    @Override
    public SprintReportMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(SprintReport.class);

    // --- AEntity ---

    public final scrum.server.sprint.SprintReportDao getDao() {
        return sprintReportDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class ASprintReportQuery extends ilarkesto.core.persistance.AEntityQuery<SprintReport> {
    @Override
        public Class<SprintReport> getType() {
            return SprintReport.class;
        }
    }

    public static Set<SprintReport> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(SprintReport.class).list();
    }

    public static SprintReport getById(String id) {
        return (SprintReport) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getSprint()); } catch(EntityDoesNotExistException ex) {}
        if (completedRequirementsIds!=null) for (String id : completedRequirementsIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (rejectedRequirementsIds!=null) for (String id : rejectedRequirementsIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (closedTasksIds!=null) for (String id : closedTasksIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (openTasksIds!=null) for (String id : openTasksIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("sprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintId));
        properties.put("completedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsIds));
        properties.put("rejectedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectedRequirementsIds));
        properties.put("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        properties.put("closedTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedTasksIds));
        properties.put("openTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.openTasksIds));
        properties.put("burnedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.burnedWork));
    }

    @Override
    public int compareTo(SprintReport other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GSprintReport.class);

    public static final String TYPE = "SprintReport";
    // -----------------------------------------------------------
    // - sprint
    // -----------------------------------------------------------

    private String sprintId;

    public final String getSprintId() {
        return this.sprintId;
    }

    public final scrum.server.sprint.Sprint getSprint() {
        try {
            return this.sprintId == null ? null : (scrum.server.sprint.Sprint) AEntity.getById(this.sprintId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("SprintReport.sprint");
        }
    }

    public final void setSprint(scrum.server.sprint.Sprint sprint) {
        sprint = prepareSprint(sprint);
        if (isSprint(sprint)) return;
        setSprintId(sprint == null ? null : sprint.getId());
    }

    public final void setSprintId(String id) {
        if (Utl.equals(sprintId, id)) return;
        this.sprintId = id;
            updateLastModified();
            fireModified("sprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintId));
    }

    private final void updateSprintId(String id) {
        setSprintId(id);
    }

    protected scrum.server.sprint.Sprint prepareSprint(scrum.server.sprint.Sprint sprint) {
        return sprint;
    }

    protected void repairDeadSprintReference(String entityId) {
        if (!isPersisted()) return;
        if (this.sprintId == null || entityId.equals(this.sprintId)) {
            repairMissingMaster();
        }
    }

    public final boolean isSprintSet() {
        return this.sprintId != null;
    }

    public final boolean isSprint(scrum.server.sprint.Sprint sprint) {
        if (this.sprintId == null && sprint == null) return true;
        return sprint != null && sprint.getId().equals(this.sprintId);
    }

    protected final void updateSprint(Object value) {
        setSprint(value == null ? null : (scrum.server.sprint.Sprint)sprintDao.getById((String)value));
    }
    // -----------------------------------------------------------
    // - completedRequirements
    // -----------------------------------------------------------

    private java.util.Set<String> completedRequirementsIds = new java.util.HashSet<String>();

    public final Collection<String> getCompletedRequirementsIds() {
        return java.util.Collections .unmodifiableCollection(this.completedRequirementsIds);
    }

    public final java.util.Set<scrum.server.project.Requirement> getCompletedRequirements() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.completedRequirementsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("SprintReport.completedRequirements");
        }
    }

    public final void setCompletedRequirements(Collection<scrum.server.project.Requirement> completedRequirements) {
        completedRequirements = prepareCompletedRequirements(completedRequirements);
        if (completedRequirements == null) completedRequirements = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(completedRequirements);
        setCompletedRequirementsIds(ids);
    }

    public final void setCompletedRequirementsIds(java.util.Set<String> ids) {
        if (Utl.equals(completedRequirementsIds, ids)) return;
        completedRequirementsIds = ids;
            updateLastModified();
            fireModified("completedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsIds));
    }

    private final void updateCompletedRequirementsIds(java.util.Set<String> ids) {
        setCompletedRequirementsIds(ids);
    }

    protected Collection<scrum.server.project.Requirement> prepareCompletedRequirements(Collection<scrum.server.project.Requirement> completedRequirements) {
        return completedRequirements;
    }

    protected void repairDeadCompletedRequirementReference(String entityId) {
        if (!isPersisted()) return;
        if (this.completedRequirementsIds == null ) return;
        if (this.completedRequirementsIds.remove(entityId)) {
            updateLastModified();
            fireModified("completedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsIds));
        }
    }

    public final boolean containsCompletedRequirement(scrum.server.project.Requirement completedRequirement) {
        if (completedRequirement == null) return false;
        if (this.completedRequirementsIds == null) return false;
        return this.completedRequirementsIds.contains(completedRequirement.getId());
    }

    public final int getCompletedRequirementsCount() {
        if (this.completedRequirementsIds == null) return 0;
        return this.completedRequirementsIds.size();
    }

    public final boolean isCompletedRequirementsEmpty() {
        if (this.completedRequirementsIds == null) return true;
        return this.completedRequirementsIds.isEmpty();
    }

    public final boolean addCompletedRequirement(scrum.server.project.Requirement completedRequirement) {
        if (completedRequirement == null) throw new IllegalArgumentException("completedRequirement == null");
        if (this.completedRequirementsIds == null) this.completedRequirementsIds = new java.util.HashSet<String>();
        boolean added = this.completedRequirementsIds.add(completedRequirement.getId());
        if (added) {
            updateLastModified();
            fireModified("completedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsIds));
        }
        return added;
    }

    public final boolean addCompletedRequirements(Collection<scrum.server.project.Requirement> completedRequirements) {
        if (completedRequirements == null) throw new IllegalArgumentException("completedRequirements == null");
        if (this.completedRequirementsIds == null) this.completedRequirementsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.project.Requirement completedRequirement : completedRequirements) {
            added = added | this.completedRequirementsIds.add(completedRequirement.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("completedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsIds));
        }
        return added;
    }

    public final boolean removeCompletedRequirement(scrum.server.project.Requirement completedRequirement) {
        if (completedRequirement == null) return false;
        if (this.completedRequirementsIds == null) return false;
        boolean removed = this.completedRequirementsIds.remove(completedRequirement.getId());
        if (removed) {
            updateLastModified();
            fireModified("completedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsIds));
        }
        return removed;
    }

    public final boolean removeCompletedRequirements(Collection<scrum.server.project.Requirement> completedRequirements) {
        if (completedRequirements == null) return false;
        if (completedRequirements.isEmpty()) return false;
        if (this.completedRequirementsIds == null) return false;
        boolean removed = false;
        for (scrum.server.project.Requirement _element: completedRequirements) {
            removed = removed | this.completedRequirementsIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("completedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsIds));
        }
        return removed;
    }

    public final boolean clearCompletedRequirements() {
        if (this.completedRequirementsIds == null) return false;
        if (this.completedRequirementsIds.isEmpty()) return false;
        this.completedRequirementsIds.clear();
            updateLastModified();
            fireModified("completedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.completedRequirementsIds));
        return true;
    }
    // -----------------------------------------------------------
    // - rejectedRequirements
    // -----------------------------------------------------------

    private java.util.Set<String> rejectedRequirementsIds = new java.util.HashSet<String>();

    public final Collection<String> getRejectedRequirementsIds() {
        return java.util.Collections .unmodifiableCollection(this.rejectedRequirementsIds);
    }

    public final java.util.Set<scrum.server.project.Requirement> getRejectedRequirements() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.rejectedRequirementsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("SprintReport.rejectedRequirements");
        }
    }

    public final void setRejectedRequirements(Collection<scrum.server.project.Requirement> rejectedRequirements) {
        rejectedRequirements = prepareRejectedRequirements(rejectedRequirements);
        if (rejectedRequirements == null) rejectedRequirements = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(rejectedRequirements);
        setRejectedRequirementsIds(ids);
    }

    public final void setRejectedRequirementsIds(java.util.Set<String> ids) {
        if (Utl.equals(rejectedRequirementsIds, ids)) return;
        rejectedRequirementsIds = ids;
            updateLastModified();
            fireModified("rejectedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectedRequirementsIds));
    }

    private final void updateRejectedRequirementsIds(java.util.Set<String> ids) {
        setRejectedRequirementsIds(ids);
    }

    protected Collection<scrum.server.project.Requirement> prepareRejectedRequirements(Collection<scrum.server.project.Requirement> rejectedRequirements) {
        return rejectedRequirements;
    }

    protected void repairDeadRejectedRequirementReference(String entityId) {
        if (!isPersisted()) return;
        if (this.rejectedRequirementsIds == null ) return;
        if (this.rejectedRequirementsIds.remove(entityId)) {
            updateLastModified();
            fireModified("rejectedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectedRequirementsIds));
        }
    }

    public final boolean containsRejectedRequirement(scrum.server.project.Requirement rejectedRequirement) {
        if (rejectedRequirement == null) return false;
        if (this.rejectedRequirementsIds == null) return false;
        return this.rejectedRequirementsIds.contains(rejectedRequirement.getId());
    }

    public final int getRejectedRequirementsCount() {
        if (this.rejectedRequirementsIds == null) return 0;
        return this.rejectedRequirementsIds.size();
    }

    public final boolean isRejectedRequirementsEmpty() {
        if (this.rejectedRequirementsIds == null) return true;
        return this.rejectedRequirementsIds.isEmpty();
    }

    public final boolean addRejectedRequirement(scrum.server.project.Requirement rejectedRequirement) {
        if (rejectedRequirement == null) throw new IllegalArgumentException("rejectedRequirement == null");
        if (this.rejectedRequirementsIds == null) this.rejectedRequirementsIds = new java.util.HashSet<String>();
        boolean added = this.rejectedRequirementsIds.add(rejectedRequirement.getId());
        if (added) {
            updateLastModified();
            fireModified("rejectedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectedRequirementsIds));
        }
        return added;
    }

    public final boolean addRejectedRequirements(Collection<scrum.server.project.Requirement> rejectedRequirements) {
        if (rejectedRequirements == null) throw new IllegalArgumentException("rejectedRequirements == null");
        if (this.rejectedRequirementsIds == null) this.rejectedRequirementsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.project.Requirement rejectedRequirement : rejectedRequirements) {
            added = added | this.rejectedRequirementsIds.add(rejectedRequirement.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("rejectedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectedRequirementsIds));
        }
        return added;
    }

    public final boolean removeRejectedRequirement(scrum.server.project.Requirement rejectedRequirement) {
        if (rejectedRequirement == null) return false;
        if (this.rejectedRequirementsIds == null) return false;
        boolean removed = this.rejectedRequirementsIds.remove(rejectedRequirement.getId());
        if (removed) {
            updateLastModified();
            fireModified("rejectedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectedRequirementsIds));
        }
        return removed;
    }

    public final boolean removeRejectedRequirements(Collection<scrum.server.project.Requirement> rejectedRequirements) {
        if (rejectedRequirements == null) return false;
        if (rejectedRequirements.isEmpty()) return false;
        if (this.rejectedRequirementsIds == null) return false;
        boolean removed = false;
        for (scrum.server.project.Requirement _element: rejectedRequirements) {
            removed = removed | this.rejectedRequirementsIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("rejectedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectedRequirementsIds));
        }
        return removed;
    }

    public final boolean clearRejectedRequirements() {
        if (this.rejectedRequirementsIds == null) return false;
        if (this.rejectedRequirementsIds.isEmpty()) return false;
        this.rejectedRequirementsIds.clear();
            updateLastModified();
            fireModified("rejectedRequirementsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.rejectedRequirementsIds));
        return true;
    }
    // -----------------------------------------------------------
    // - requirementsOrderIds
    // -----------------------------------------------------------

    private java.util.List<java.lang.String> requirementsOrderIds = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getRequirementsOrderIds() {
        return new java.util.ArrayList<java.lang.String>(requirementsOrderIds);
    }

    public final void setRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        requirementsOrderIds = prepareRequirementsOrderIds(requirementsOrderIds);
        if (requirementsOrderIds == null) requirementsOrderIds = Collections.emptyList();
        if (this.requirementsOrderIds.equals(requirementsOrderIds)) return;
        this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>(requirementsOrderIds);
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
    }

    private final void updateRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        if (requirementsOrderIds == null) requirementsOrderIds = Collections.emptyList();
        if (this.requirementsOrderIds.equals(requirementsOrderIds)) return;
        this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>(requirementsOrderIds);
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
    }

    protected Collection<java.lang.String> prepareRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        return requirementsOrderIds;
    }

    public final boolean containsRequirementsOrderId(java.lang.String requirementsOrderId) {
        if (requirementsOrderId == null) return false;
        if (this.requirementsOrderIds == null) return false;
        return this.requirementsOrderIds.contains(requirementsOrderId);
    }

    public final int getRequirementsOrderIdsCount() {
        if (this.requirementsOrderIds == null) return 0;
        return this.requirementsOrderIds.size();
    }

    public final boolean isRequirementsOrderIdsEmpty() {
        if (this.requirementsOrderIds == null) return true;
        return this.requirementsOrderIds.isEmpty();
    }

    public final boolean addRequirementsOrderId(java.lang.String requirementsOrderId) {
        if (requirementsOrderId == null) throw new IllegalArgumentException("requirementsOrderId == null");
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        boolean added = this.requirementsOrderIds.add(requirementsOrderId);
        if (added) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return added;
    }

    public final boolean addRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        if (requirementsOrderIds == null) throw new IllegalArgumentException("requirementsOrderIds == null");
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        boolean added = false;
        for (java.lang.String requirementsOrderId : requirementsOrderIds) {
            added = added | this.requirementsOrderIds.add(requirementsOrderId);
        }
        if (added) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return added;
    }

    public final boolean removeRequirementsOrderId(java.lang.String requirementsOrderId) {
        if (requirementsOrderId == null) return false;
        if (this.requirementsOrderIds == null) return false;
        boolean removed = this.requirementsOrderIds.remove(requirementsOrderId);
        if (removed) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return removed;
    }

    public final boolean removeRequirementsOrderIds(Collection<java.lang.String> requirementsOrderIds) {
        if (requirementsOrderIds == null) return false;
        if (requirementsOrderIds.isEmpty()) return false;
        if (this.requirementsOrderIds == null) return false;
        boolean removed = false;
        for (java.lang.String _element: requirementsOrderIds) {
            removed = removed | this.requirementsOrderIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        }
        return removed;
    }

    public final boolean clearRequirementsOrderIds() {
        if (this.requirementsOrderIds == null) return false;
        if (this.requirementsOrderIds.isEmpty()) return false;
        this.requirementsOrderIds.clear();
            updateLastModified();
            fireModified("requirementsOrderIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementsOrderIds));
        return true;
    }

    public final String getRequirementsOrderIdsAsCommaSeparatedString() {
        if (this.requirementsOrderIds == null) return null;
        if (this.requirementsOrderIds.isEmpty()) return null;
        return Str.concat(this.requirementsOrderIds,", ");
    }

    public final void setRequirementsOrderIdsAsCommaSeparatedString(String requirementsOrderIds) {
        setRequirementsOrderIds(Str.parseCommaSeparatedString(requirementsOrderIds));
    }
    // -----------------------------------------------------------
    // - closedTasks
    // -----------------------------------------------------------

    private java.util.Set<String> closedTasksIds = new java.util.HashSet<String>();

    public final Collection<String> getClosedTasksIds() {
        return java.util.Collections .unmodifiableCollection(this.closedTasksIds);
    }

    public final java.util.Set<scrum.server.sprint.Task> getClosedTasks() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.closedTasksIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("SprintReport.closedTasks");
        }
    }

    public final void setClosedTasks(Collection<scrum.server.sprint.Task> closedTasks) {
        closedTasks = prepareClosedTasks(closedTasks);
        if (closedTasks == null) closedTasks = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(closedTasks);
        setClosedTasksIds(ids);
    }

    public final void setClosedTasksIds(java.util.Set<String> ids) {
        if (Utl.equals(closedTasksIds, ids)) return;
        closedTasksIds = ids;
            updateLastModified();
            fireModified("closedTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedTasksIds));
    }

    private final void updateClosedTasksIds(java.util.Set<String> ids) {
        setClosedTasksIds(ids);
    }

    protected Collection<scrum.server.sprint.Task> prepareClosedTasks(Collection<scrum.server.sprint.Task> closedTasks) {
        return closedTasks;
    }

    protected void repairDeadClosedTaskReference(String entityId) {
        if (!isPersisted()) return;
        if (this.closedTasksIds == null ) return;
        if (this.closedTasksIds.remove(entityId)) {
            updateLastModified();
            fireModified("closedTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedTasksIds));
        }
    }

    public final boolean containsClosedTask(scrum.server.sprint.Task closedTask) {
        if (closedTask == null) return false;
        if (this.closedTasksIds == null) return false;
        return this.closedTasksIds.contains(closedTask.getId());
    }

    public final int getClosedTasksCount() {
        if (this.closedTasksIds == null) return 0;
        return this.closedTasksIds.size();
    }

    public final boolean isClosedTasksEmpty() {
        if (this.closedTasksIds == null) return true;
        return this.closedTasksIds.isEmpty();
    }

    public final boolean addClosedTask(scrum.server.sprint.Task closedTask) {
        if (closedTask == null) throw new IllegalArgumentException("closedTask == null");
        if (this.closedTasksIds == null) this.closedTasksIds = new java.util.HashSet<String>();
        boolean added = this.closedTasksIds.add(closedTask.getId());
        if (added) {
            updateLastModified();
            fireModified("closedTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedTasksIds));
        }
        return added;
    }

    public final boolean addClosedTasks(Collection<scrum.server.sprint.Task> closedTasks) {
        if (closedTasks == null) throw new IllegalArgumentException("closedTasks == null");
        if (this.closedTasksIds == null) this.closedTasksIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.sprint.Task closedTask : closedTasks) {
            added = added | this.closedTasksIds.add(closedTask.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("closedTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedTasksIds));
        }
        return added;
    }

    public final boolean removeClosedTask(scrum.server.sprint.Task closedTask) {
        if (closedTask == null) return false;
        if (this.closedTasksIds == null) return false;
        boolean removed = this.closedTasksIds.remove(closedTask.getId());
        if (removed) {
            updateLastModified();
            fireModified("closedTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedTasksIds));
        }
        return removed;
    }

    public final boolean removeClosedTasks(Collection<scrum.server.sprint.Task> closedTasks) {
        if (closedTasks == null) return false;
        if (closedTasks.isEmpty()) return false;
        if (this.closedTasksIds == null) return false;
        boolean removed = false;
        for (scrum.server.sprint.Task _element: closedTasks) {
            removed = removed | this.closedTasksIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("closedTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedTasksIds));
        }
        return removed;
    }

    public final boolean clearClosedTasks() {
        if (this.closedTasksIds == null) return false;
        if (this.closedTasksIds.isEmpty()) return false;
        this.closedTasksIds.clear();
            updateLastModified();
            fireModified("closedTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedTasksIds));
        return true;
    }
    // -----------------------------------------------------------
    // - openTasks
    // -----------------------------------------------------------

    private java.util.Set<String> openTasksIds = new java.util.HashSet<String>();

    public final Collection<String> getOpenTasksIds() {
        return java.util.Collections .unmodifiableCollection(this.openTasksIds);
    }

    public final java.util.Set<scrum.server.sprint.Task> getOpenTasks() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.openTasksIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("SprintReport.openTasks");
        }
    }

    public final void setOpenTasks(Collection<scrum.server.sprint.Task> openTasks) {
        openTasks = prepareOpenTasks(openTasks);
        if (openTasks == null) openTasks = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(openTasks);
        setOpenTasksIds(ids);
    }

    public final void setOpenTasksIds(java.util.Set<String> ids) {
        if (Utl.equals(openTasksIds, ids)) return;
        openTasksIds = ids;
            updateLastModified();
            fireModified("openTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.openTasksIds));
    }

    private final void updateOpenTasksIds(java.util.Set<String> ids) {
        setOpenTasksIds(ids);
    }

    protected Collection<scrum.server.sprint.Task> prepareOpenTasks(Collection<scrum.server.sprint.Task> openTasks) {
        return openTasks;
    }

    protected void repairDeadOpenTaskReference(String entityId) {
        if (!isPersisted()) return;
        if (this.openTasksIds == null ) return;
        if (this.openTasksIds.remove(entityId)) {
            updateLastModified();
            fireModified("openTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.openTasksIds));
        }
    }

    public final boolean containsOpenTask(scrum.server.sprint.Task openTask) {
        if (openTask == null) return false;
        if (this.openTasksIds == null) return false;
        return this.openTasksIds.contains(openTask.getId());
    }

    public final int getOpenTasksCount() {
        if (this.openTasksIds == null) return 0;
        return this.openTasksIds.size();
    }

    public final boolean isOpenTasksEmpty() {
        if (this.openTasksIds == null) return true;
        return this.openTasksIds.isEmpty();
    }

    public final boolean addOpenTask(scrum.server.sprint.Task openTask) {
        if (openTask == null) throw new IllegalArgumentException("openTask == null");
        if (this.openTasksIds == null) this.openTasksIds = new java.util.HashSet<String>();
        boolean added = this.openTasksIds.add(openTask.getId());
        if (added) {
            updateLastModified();
            fireModified("openTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.openTasksIds));
        }
        return added;
    }

    public final boolean addOpenTasks(Collection<scrum.server.sprint.Task> openTasks) {
        if (openTasks == null) throw new IllegalArgumentException("openTasks == null");
        if (this.openTasksIds == null) this.openTasksIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.sprint.Task openTask : openTasks) {
            added = added | this.openTasksIds.add(openTask.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("openTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.openTasksIds));
        }
        return added;
    }

    public final boolean removeOpenTask(scrum.server.sprint.Task openTask) {
        if (openTask == null) return false;
        if (this.openTasksIds == null) return false;
        boolean removed = this.openTasksIds.remove(openTask.getId());
        if (removed) {
            updateLastModified();
            fireModified("openTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.openTasksIds));
        }
        return removed;
    }

    public final boolean removeOpenTasks(Collection<scrum.server.sprint.Task> openTasks) {
        if (openTasks == null) return false;
        if (openTasks.isEmpty()) return false;
        if (this.openTasksIds == null) return false;
        boolean removed = false;
        for (scrum.server.sprint.Task _element: openTasks) {
            removed = removed | this.openTasksIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("openTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.openTasksIds));
        }
        return removed;
    }

    public final boolean clearOpenTasks() {
        if (this.openTasksIds == null) return false;
        if (this.openTasksIds.isEmpty()) return false;
        this.openTasksIds.clear();
            updateLastModified();
            fireModified("openTasksIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.openTasksIds));
        return true;
    }
    // -----------------------------------------------------------
    // - burnedWork
    // -----------------------------------------------------------

    private int burnedWork;

    public final int getBurnedWork() {
        return burnedWork;
    }

    public final void setBurnedWork(int burnedWork) {
        burnedWork = prepareBurnedWork(burnedWork);
        if (isBurnedWork(burnedWork)) return;
        this.burnedWork = burnedWork;
            updateLastModified();
            fireModified("burnedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.burnedWork));
    }

    private final void updateBurnedWork(int burnedWork) {
        if (isBurnedWork(burnedWork)) return;
        this.burnedWork = burnedWork;
            updateLastModified();
            fireModified("burnedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.burnedWork));
    }

    protected int prepareBurnedWork(int burnedWork) {
        return burnedWork;
    }

    public final boolean isBurnedWork(int burnedWork) {
        return this.burnedWork == burnedWork;
    }

    protected final void updateBurnedWork(Object value) {
        setBurnedWork((Integer)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("sprintId")) updateSprintId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("completedRequirementsIds")) updateCompletedRequirementsIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("rejectedRequirementsIds")) updateRejectedRequirementsIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("requirementsOrderIds")) updateRequirementsOrderIds(ilarkesto.core.persistance.Persistence.parsePropertyStringCollection(value));
            if (property.equals("closedTasksIds")) updateClosedTasksIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("openTasksIds")) updateOpenTasksIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("burnedWork")) updateBurnedWork(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadSprintReference(entityId);
        if (this.completedRequirementsIds == null) this.completedRequirementsIds = new java.util.HashSet<String>();
        repairDeadCompletedRequirementReference(entityId);
        if (this.rejectedRequirementsIds == null) this.rejectedRequirementsIds = new java.util.HashSet<String>();
        repairDeadRejectedRequirementReference(entityId);
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        if (this.closedTasksIds == null) this.closedTasksIds = new java.util.HashSet<String>();
        repairDeadClosedTaskReference(entityId);
        if (this.openTasksIds == null) this.openTasksIds = new java.util.HashSet<String>();
        repairDeadOpenTaskReference(entityId);
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        if (!isSprintSet()) {
            repairMissingMaster();
        }
        try {
            getSprint();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead sprint reference");
            repairDeadSprintReference(this.sprintId);
        }
        if (this.completedRequirementsIds == null) this.completedRequirementsIds = new java.util.HashSet<String>();
        Set<String> completedRequirements = new HashSet<String>(this.completedRequirementsIds);
        for (String entityId : completedRequirements) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead completedRequirement reference");
                repairDeadCompletedRequirementReference(entityId);
            }
        }
        if (this.rejectedRequirementsIds == null) this.rejectedRequirementsIds = new java.util.HashSet<String>();
        Set<String> rejectedRequirements = new HashSet<String>(this.rejectedRequirementsIds);
        for (String entityId : rejectedRequirements) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead rejectedRequirement reference");
                repairDeadRejectedRequirementReference(entityId);
            }
        }
        if (this.requirementsOrderIds == null) this.requirementsOrderIds = new java.util.ArrayList<java.lang.String>();
        if (this.closedTasksIds == null) this.closedTasksIds = new java.util.HashSet<String>();
        Set<String> closedTasks = new HashSet<String>(this.closedTasksIds);
        for (String entityId : closedTasks) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead closedTask reference");
                repairDeadClosedTaskReference(entityId);
            }
        }
        if (this.openTasksIds == null) this.openTasksIds = new java.util.HashSet<String>();
        Set<String> openTasks = new HashSet<String>(this.openTasksIds);
        for (String entityId : openTasks) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead openTask reference");
                repairDeadOpenTaskReference(entityId);
            }
        }
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.sprint.SprintDao sprintDao;

    public static final void setSprintDao(scrum.server.sprint.SprintDao sprintDao) {
        GSprintReport.sprintDao = sprintDao;
    }

    static scrum.server.project.RequirementDao requirementDao;

    public static final void setRequirementDao(scrum.server.project.RequirementDao requirementDao) {
        GSprintReport.requirementDao = requirementDao;
    }

    static scrum.server.sprint.TaskDao taskDao;

    public static final void setTaskDao(scrum.server.sprint.TaskDao taskDao) {
        GSprintReport.taskDao = taskDao;
    }

    static scrum.server.sprint.SprintReportDao sprintReportDao;

    public static final void setSprintReportDao(scrum.server.sprint.SprintReportDao sprintReportDao) {
        GSprintReport.sprintReportDao = sprintReportDao;
    }

}