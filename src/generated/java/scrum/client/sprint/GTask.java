// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.sprint;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GTask
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Task> {

    public static class TaskMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata requirement = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "requirement";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Task)entity).getRequirement();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Task)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata label = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "label";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Task)entity).getLabel();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata description = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "description";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Task)entity).getDescription();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata remainingWork = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "remainingWork";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Task)entity).getRemainingWork();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata burnedWork = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "burnedWork";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Task)entity).getBurnedWork();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata owner = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "owner";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Task)entity).getOwner();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata impediments = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "impediments";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Task)entity).getImpediments();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata closedInPastSprint = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "closedInPastSprint";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Task)entity).getClosedInPastSprint();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            requirement
            ,number
            ,label
            ,description
            ,remainingWork
            ,burnedWork
            ,owner
            ,impediments
            ,closedInPastSprint
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("requirement".equals(fieldName)) return requirement;
            if ("requirementId".equals(fieldName)) return requirement;
            if ("number".equals(fieldName)) return number;
            if ("label".equals(fieldName)) return label;
            if ("description".equals(fieldName)) return description;
            if ("remainingWork".equals(fieldName)) return remainingWork;
            if ("burnedWork".equals(fieldName)) return burnedWork;
            if ("owner".equals(fieldName)) return owner;
            if ("ownerId".equals(fieldName)) return owner;
            if ("impediments".equals(fieldName)) return impediments;
            if ("impedimentsIds".equals(fieldName)) return impediments;
            if ("closedInPastSprint".equals(fieldName)) return closedInPastSprint;
            if ("closedInPastSprintId".equals(fieldName)) return closedInPastSprint;
            return null;
        }

    }

    public static transient final TaskMetadata metadata = new TaskMetadata();

    @Override
    public TaskMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Task.class);

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Task> requirementBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Task>() {
    @Override
        protected Set<Task> loadById(final String id) {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return id.equals(entity.getRequirementId());
            }
            @Override
            public String toString() {
                return "Task:byRequirement";
            }
        }.list();
        }
    };

    public static Set< Task> listByRequirement(final scrum.client.project.Requirement requirement) {
        if (requirement == null) return new HashSet<Task>();
        return requirementBackReferencesCache.getById(requirement.getId());
    }

    public static Set< Task> listByNumber(final int number) {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return entity.isNumber(number);
            }
            @Override
            public String toString() {
                return "Task:byNumber";
            }
        }.list();
    }

    public static Set< Task> listByLabel(final java.lang.String label) {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return entity.isLabel(label);
            }
            @Override
            public String toString() {
                return "Task:byLabel";
            }
        }.list();
    }

    public static Set< Task> listByDescription(final java.lang.String description) {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return entity.isDescription(description);
            }
            @Override
            public String toString() {
                return "Task:byDescription";
            }
        }.list();
    }

    public static Set< Task> listByRemainingWork(final int remainingWork) {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return entity.isRemainingWork(remainingWork);
            }
            @Override
            public String toString() {
                return "Task:byRemainingWork";
            }
        }.list();
    }

    public static Set< Task> listByBurnedWork(final int burnedWork) {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return entity.isBurnedWork(burnedWork);
            }
            @Override
            public String toString() {
                return "Task:byBurnedWork";
            }
        }.list();
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Task> ownerBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Task>() {
    @Override
        protected Set<Task> loadById(final String id) {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return id.equals(entity.getOwnerId());
            }
            @Override
            public String toString() {
                return "Task:byOwner";
            }
        }.list();
        }
    };

    public static Set< Task> listByOwner(final scrum.client.admin.User owner) {
        if (owner == null) return new HashSet<Task>();
        return ownerBackReferencesCache.getById(owner.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Task> impedimentsBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Task>() {
    @Override
        protected Set<Task> loadById(final String id) {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return entity.getImpedimentsIds().contains(id);
            }
            @Override
            public String toString() {
                return "Task:byImpediments";
            }
        }.list();
        }
    };

    public static Set< Task> listByImpediment(final scrum.client.impediments.Impediment impediment) {
        if (impediment == null) return new HashSet<Task>();
        return impedimentsBackReferencesCache.getById(impediment.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Task> closedInPastSprintBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Task>() {
    @Override
        protected Set<Task> loadById(final String id) {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return id.equals(entity.getClosedInPastSprintId());
            }
            @Override
            public String toString() {
                return "Task:byClosedInPastSprint";
            }
        }.list();
        }
    };

    public static Set< Task> listByClosedInPastSprint(final scrum.client.sprint.Sprint closedInPastSprint) {
        if (closedInPastSprint == null) return new HashSet<Task>();
        return closedInPastSprintBackReferencesCache.getById(closedInPastSprint.getId());
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        requirementBackReferencesCache.clear(getRequirementId());
        ownerBackReferencesCache.clear(getOwnerId());
        impedimentsBackReferencesCache.clear(getImpedimentsIds());
        closedInPastSprintBackReferencesCache.clear(getClosedInPastSprintId());
    }

    public abstract boolean isEditable();

    public static Set<Task> listByIsEditable() {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return entity.isEditable();
            }
            @Override
            public String toString() {
                return "Task:byIsEditable";
            }
        }.list();
    }

    public final boolean isNotEditable() {
        return !isEditable();
    }

    public static Set<Task> listByIsNotEditable() {
        return new ATaskQuery() {
            @Override
            public boolean test(Task entity) {
                return entity.isNotEditable();
            }
            @Override
            public String toString() {
                return "Task:byIsNotEditable";
            }
        }.list();
    }

    public abstract static class ATaskQuery extends ilarkesto.core.persistance.AEntityQuery<Task> {
    @Override
        public Class<Task> getType() {
            return Task.class;
        }
    }

    public static Set<Task> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Task.class).list();
    }

    public static Task getById(String id) {
        return (Task) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getRequirement()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getOwner()); } catch(EntityDoesNotExistException ex) {}
        if (impedimentsIds!=null) for (String id : impedimentsIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        try { Utl.addIfNotNull(ret, getClosedInPastSprint()); } catch(EntityDoesNotExistException ex) {}
    // --- back references ---
        ret.addAll(getSprintReports());
        ret.addAll(getSprintReportWithOpenTaskss());
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("requirementId", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementId));
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("label", ilarkesto.core.persistance.Persistence.propertyAsString(this.label));
        properties.put("description", ilarkesto.core.persistance.Persistence.propertyAsString(this.description));
        properties.put("remainingWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.remainingWork));
        properties.put("burnedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.burnedWork));
        properties.put("ownerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.ownerId));
        properties.put("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        properties.put("closedInPastSprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedInPastSprintId));
    }

    @Override
    public int compareTo(Task other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    public final Set<scrum.client.sprint.SprintReport> getSprintReports() {
        return scrum.client.sprint.SprintReport.listByClosedTask((Task)this);
    }

    public final Set<scrum.client.sprint.SprintReport> getSprintReportWithOpenTaskss() {
        return scrum.client.sprint.SprintReport.listByOpenTask((Task)this);
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GTask.class);

    public static final String TYPE = "Task";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getLabel(), getDescription());
    }
    // -----------------------------------------------------------
    // - requirement
    // -----------------------------------------------------------

    private String requirementId;

    public final String getRequirementId() {
        return this.requirementId;
    }

    public final scrum.client.project.Requirement getRequirement() {
        try {
            return this.requirementId == null ? null : (scrum.client.project.Requirement) AEntity.getById(this.requirementId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Task.requirement");
        }
    }

    public final void setRequirement(scrum.client.project.Requirement requirement) {
        requirement = prepareRequirement(requirement);
        if (isRequirement(requirement)) return;
        setRequirementId(requirement == null ? null : requirement.getId());
    }

    public final void setRequirementId(String id) {
        if (Utl.equals(requirementId, id)) return;
        clearRequirementBackReferenceCache(id, this.requirementId);
        this.requirementId = id;
            updateLastModified();
            fireModified("requirementId", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementId));
    }

    private void clearRequirementBackReferenceCache(String oldId, String newId) {
        requirementBackReferencesCache.clear(oldId);
        requirementBackReferencesCache.clear(newId);
    }

    private final void updateRequirementId(String id) {
        setRequirementId(id);
    }

    protected scrum.client.project.Requirement prepareRequirement(scrum.client.project.Requirement requirement) {
        return requirement;
    }

    protected void repairDeadRequirementReference(String entityId) {
        if (!isPersisted()) return;
        if (this.requirementId == null || entityId.equals(this.requirementId)) {
            repairMissingMaster();
        }
    }

    public final boolean isRequirementSet() {
        return this.requirementId != null;
    }

    public final boolean isRequirement(scrum.client.project.Requirement requirement) {
        if (this.requirementId == null && requirement == null) return true;
        return requirement != null && requirement.getId().equals(this.requirementId);
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
    // - remainingWork
    // -----------------------------------------------------------

    private int remainingWork;

    public final int getRemainingWork() {
        return remainingWork;
    }

    public final void setRemainingWork(int remainingWork) {
        remainingWork = prepareRemainingWork(remainingWork);
        if (isRemainingWork(remainingWork)) return;
        this.remainingWork = remainingWork;
            updateLastModified();
            fireModified("remainingWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.remainingWork));
    }

    private final void updateRemainingWork(int remainingWork) {
        if (isRemainingWork(remainingWork)) return;
        this.remainingWork = remainingWork;
            updateLastModified();
            fireModified("remainingWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.remainingWork));
    }

    protected int prepareRemainingWork(int remainingWork) {
        return remainingWork;
    }

    public final boolean isRemainingWork(int remainingWork) {
        return this.remainingWork == remainingWork;
    }

    protected final void updateRemainingWork(Object value) {
        setRemainingWork((Integer)value);
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
    // -----------------------------------------------------------
    // - owner
    // -----------------------------------------------------------

    private String ownerId;

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final scrum.client.admin.User getOwner() {
        try {
            return this.ownerId == null ? null : (scrum.client.admin.User) AEntity.getById(this.ownerId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Task.owner");
        }
    }

    public final void setOwner(scrum.client.admin.User owner) {
        owner = prepareOwner(owner);
        if (isOwner(owner)) return;
        setOwnerId(owner == null ? null : owner.getId());
    }

    public final void setOwnerId(String id) {
        if (Utl.equals(ownerId, id)) return;
        clearOwnerBackReferenceCache(id, this.ownerId);
        this.ownerId = id;
            updateLastModified();
            fireModified("ownerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.ownerId));
    }

    private void clearOwnerBackReferenceCache(String oldId, String newId) {
        ownerBackReferencesCache.clear(oldId);
        ownerBackReferencesCache.clear(newId);
    }

    private final void updateOwnerId(String id) {
        setOwnerId(id);
    }

    protected scrum.client.admin.User prepareOwner(scrum.client.admin.User owner) {
        return owner;
    }

    protected void repairDeadOwnerReference(String entityId) {
        if (!isPersisted()) return;
        if (this.ownerId == null || entityId.equals(this.ownerId)) {
            setOwner(null);
        }
    }

    public final boolean isOwnerSet() {
        return this.ownerId != null;
    }

    public final boolean isOwner(scrum.client.admin.User owner) {
        if (this.ownerId == null && owner == null) return true;
        return owner != null && owner.getId().equals(this.ownerId);
    }

    // -----------------------------------------------------------
    // - impediments
    // -----------------------------------------------------------

    private java.util.Set<String> impedimentsIds = new java.util.HashSet<String>();

    public final Collection<String> getImpedimentsIds() {
        return java.util.Collections .unmodifiableCollection(this.impedimentsIds);
    }

    public final java.util.Set<scrum.client.impediments.Impediment> getImpediments() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.impedimentsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Task.impediments");
        }
    }

    public final void setImpediments(Collection<scrum.client.impediments.Impediment> impediments) {
        impediments = prepareImpediments(impediments);
        if (impediments == null) impediments = Collections.emptyList();
        java.util.Set<String> ids = ilarkesto.core.persistance.Persistence.getIdsAsSet(impediments);
        setImpedimentsIds(ids);
    }

    public final void setImpedimentsIds(java.util.Set<String> ids) {
        if (Utl.equals(impedimentsIds, ids)) return;
        clearImpedimentsBackReferenceCache(ids, impedimentsIds);
        impedimentsIds = ids;
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
    }

    private void clearImpedimentsBackReferenceCache(Collection<String> oldId, Collection<String> newId) {
        impedimentsBackReferencesCache.clear(oldId);
        impedimentsBackReferencesCache.clear(newId);
    }

    private final void updateImpedimentsIds(java.util.Set<String> ids) {
        setImpedimentsIds(ids);
    }

    protected Collection<scrum.client.impediments.Impediment> prepareImpediments(Collection<scrum.client.impediments.Impediment> impediments) {
        return impediments;
    }

    protected void repairDeadImpedimentReference(String entityId) {
        if (!isPersisted()) return;
        if (this.impedimentsIds == null ) return;
        if (this.impedimentsIds.remove(entityId)) {
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        }
    }

    public final boolean containsImpediment(scrum.client.impediments.Impediment impediment) {
        if (impediment == null) return false;
        if (this.impedimentsIds == null) return false;
        return this.impedimentsIds.contains(impediment.getId());
    }

    public final int getImpedimentsCount() {
        if (this.impedimentsIds == null) return 0;
        return this.impedimentsIds.size();
    }

    public final boolean isImpedimentsEmpty() {
        if (this.impedimentsIds == null) return true;
        return this.impedimentsIds.isEmpty();
    }

    public final boolean addImpediment(scrum.client.impediments.Impediment impediment) {
        if (impediment == null) throw new IllegalArgumentException("impediment == null");
        if (this.impedimentsIds == null) this.impedimentsIds = new java.util.HashSet<String>();
        boolean added = this.impedimentsIds.add(impediment.getId());
        if (added) impedimentsBackReferencesCache.clear(impediment.getId());
        if (added) {
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        }
        return added;
    }

    public final boolean addImpediments(Collection<scrum.client.impediments.Impediment> impediments) {
        if (impediments == null) throw new IllegalArgumentException("impediments == null");
        if (this.impedimentsIds == null) this.impedimentsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.client.impediments.Impediment impediment : impediments) {
            added = added | this.impedimentsIds.add(impediment.getId());
        }
        if (added) impedimentsBackReferencesCache.clear(this.impedimentsIds);
        if (added) {
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        }
        return added;
    }

    public final boolean removeImpediment(scrum.client.impediments.Impediment impediment) {
        if (impediment == null) return false;
        if (this.impedimentsIds == null) return false;
        boolean removed = this.impedimentsIds.remove(impediment.getId());
        if (removed) impedimentsBackReferencesCache.clear(impediment.getId());
        if (removed) {
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        }
        return removed;
    }

    public final boolean removeImpediments(Collection<scrum.client.impediments.Impediment> impediments) {
        if (impediments == null) return false;
        if (impediments.isEmpty()) return false;
        if (this.impedimentsIds == null) return false;
        boolean removed = false;
        for (scrum.client.impediments.Impediment _element: impediments) {
            removed = removed | this.impedimentsIds.remove(_element);
        }
        if (removed) impedimentsBackReferencesCache.clear(this.impedimentsIds);
        if (removed) {
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        }
        return removed;
    }

    public final boolean clearImpediments() {
        if (this.impedimentsIds == null) return false;
        if (this.impedimentsIds.isEmpty()) return false;
        impedimentsBackReferencesCache.clear(this.impedimentsIds);
        this.impedimentsIds.clear();
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        return true;
    }
    // -----------------------------------------------------------
    // - closedInPastSprint
    // -----------------------------------------------------------

    private String closedInPastSprintId;

    public final String getClosedInPastSprintId() {
        return this.closedInPastSprintId;
    }

    public final scrum.client.sprint.Sprint getClosedInPastSprint() {
        try {
            return this.closedInPastSprintId == null ? null : (scrum.client.sprint.Sprint) AEntity.getById(this.closedInPastSprintId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Task.closedInPastSprint");
        }
    }

    public final void setClosedInPastSprint(scrum.client.sprint.Sprint closedInPastSprint) {
        closedInPastSprint = prepareClosedInPastSprint(closedInPastSprint);
        if (isClosedInPastSprint(closedInPastSprint)) return;
        setClosedInPastSprintId(closedInPastSprint == null ? null : closedInPastSprint.getId());
    }

    public final void setClosedInPastSprintId(String id) {
        if (Utl.equals(closedInPastSprintId, id)) return;
        clearClosedInPastSprintBackReferenceCache(id, this.closedInPastSprintId);
        this.closedInPastSprintId = id;
            updateLastModified();
            fireModified("closedInPastSprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedInPastSprintId));
    }

    private void clearClosedInPastSprintBackReferenceCache(String oldId, String newId) {
        closedInPastSprintBackReferencesCache.clear(oldId);
        closedInPastSprintBackReferencesCache.clear(newId);
    }

    private final void updateClosedInPastSprintId(String id) {
        setClosedInPastSprintId(id);
    }

    protected scrum.client.sprint.Sprint prepareClosedInPastSprint(scrum.client.sprint.Sprint closedInPastSprint) {
        return closedInPastSprint;
    }

    protected void repairDeadClosedInPastSprintReference(String entityId) {
        if (!isPersisted()) return;
        if (this.closedInPastSprintId == null || entityId.equals(this.closedInPastSprintId)) {
            setClosedInPastSprint(null);
        }
    }

    public final boolean isClosedInPastSprintSet() {
        return this.closedInPastSprintId != null;
    }

    public final boolean isClosedInPastSprint(scrum.client.sprint.Sprint closedInPastSprint) {
        if (this.closedInPastSprintId == null && closedInPastSprint == null) return true;
        return closedInPastSprint != null && closedInPastSprint.getId().equals(this.closedInPastSprintId);
    }


    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("requirementId")) updateRequirementId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("number")) updateNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("label")) updateLabel(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("description")) updateDescription(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("remainingWork")) updateRemainingWork(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("burnedWork")) updateBurnedWork(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("ownerId")) updateOwnerId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("impedimentsIds")) updateImpedimentsIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("closedInPastSprintId")) updateClosedInPastSprintId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
        }
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        if (!isRequirementSet()) {
            repairMissingMaster();
        }
        try {
            getRequirement();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead requirement reference");
            repairDeadRequirementReference(this.requirementId);
        }
        try {
            getOwner();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead owner reference");
            repairDeadOwnerReference(this.ownerId);
        }
        if (this.impedimentsIds == null) this.impedimentsIds = new java.util.HashSet<String>();
        Set<String> impediments = new HashSet<String>(this.impedimentsIds);
        for (String entityId : impediments) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead impediment reference");
                repairDeadImpedimentReference(entityId);
            }
        }
        try {
            getClosedInPastSprint();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead closedInPastSprint reference");
            repairDeadClosedInPastSprintReference(this.closedInPastSprintId);
        }
        Collection<scrum.client.sprint.SprintReport> sprintReport = getSprintReports();
        Collection<scrum.client.sprint.SprintReport> sprintReportWithOpenTasks = getSprintReportWithOpenTaskss();
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
            return "Task_number";
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
            return "Task_label";
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
        public boolean isEditable() { return GTask.this.isEditable(); }
        @Override
        public String getTooltip() { return "The label should be short (as it appears where the Task is referenced), yet give a hint strong enough to make the content of it come to mind."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
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
            return "Task_description";
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
        public boolean isEditable() { return GTask.this.isEditable(); }

        @Override
        public boolean isRichtext() { return true; }
        @Override
        public String getTooltip() { return "The description of a Task may be used to give information that is important, but cannot be inferred from the Label. As Tasks are small units of work, the Label might be sufficient."; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient RemainingWorkModel remainingWorkModel;

    public RemainingWorkModel getRemainingWorkModel() {
        if (remainingWorkModel == null) remainingWorkModel = createRemainingWorkModel();
        return remainingWorkModel;
    }

    protected RemainingWorkModel createRemainingWorkModel() { return new RemainingWorkModel(); }

    protected class RemainingWorkModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Task_remainingWork";
        }

        @Override
        public java.lang.Integer getValue() {
            return getRemainingWork();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setRemainingWork(value);
        }

            @Override
            public void increment() {
                setRemainingWork(getRemainingWork() + 1);
            }

            @Override
            public void decrement() {
                setRemainingWork(getRemainingWork() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isEditable() { return GTask.this.isEditable(); }
        @Override
        public String getTooltip() { return "The remaining time needed to get this Task done. If the remaining time is high, it might be an indication (but is not necessarily the case) that splitting the Task is a good idea."; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient BurnedWorkModel burnedWorkModel;

    public BurnedWorkModel getBurnedWorkModel() {
        if (burnedWorkModel == null) burnedWorkModel = createBurnedWorkModel();
        return burnedWorkModel;
    }

    protected BurnedWorkModel createBurnedWorkModel() { return new BurnedWorkModel(); }

    protected class BurnedWorkModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "Task_burnedWork";
        }

        @Override
        public java.lang.Integer getValue() {
            return getBurnedWork();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setBurnedWork(value);
        }

            @Override
            public void increment() {
                setBurnedWork(getBurnedWork() + 1);
            }

            @Override
            public void decrement() {
                setBurnedWork(getBurnedWork() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isEditable() { return GTask.this.isEditable(); }
        @Override
        public String getTooltip() { return "Time already invested working on this Task."; }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

}