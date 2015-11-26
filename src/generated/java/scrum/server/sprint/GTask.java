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

public abstract class GTask
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<Task>, ilarkesto.core.search.Searchable {

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

    // --- AEntity ---

    public final scrum.server.sprint.TaskDao getDao() {
        return taskDao;
    }

    protected void repairDeadDatob(ADatob datob) {
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

    public final java.util.Set<scrum.server.sprint.SprintReport> getSprintReports() {
        return sprintReportDao.getSprintReportsByClosedTask((Task)this);
    }

    public final java.util.Set<scrum.server.sprint.SprintReport> getSprintReportWithOpenTaskss() {
        return sprintReportDao.getSprintReportsByOpenTask((Task)this);
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

    public final scrum.server.project.Requirement getRequirement() {
        try {
            return this.requirementId == null ? null : (scrum.server.project.Requirement) AEntity.getById(this.requirementId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Task.requirement");
        }
    }

    public final void setRequirement(scrum.server.project.Requirement requirement) {
        requirement = prepareRequirement(requirement);
        if (isRequirement(requirement)) return;
        setRequirementId(requirement == null ? null : requirement.getId());
    }

    public final void setRequirementId(String id) {
        if (Utl.equals(requirementId, id)) return;
        this.requirementId = id;
            updateLastModified();
            fireModified("requirementId", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementId));
    }

    private final void updateRequirementId(String id) {
        setRequirementId(id);
    }

    protected scrum.server.project.Requirement prepareRequirement(scrum.server.project.Requirement requirement) {
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

    public final boolean isRequirement(scrum.server.project.Requirement requirement) {
        if (this.requirementId == null && requirement == null) return true;
        return requirement != null && requirement.getId().equals(this.requirementId);
    }

    protected final void updateRequirement(Object value) {
        setRequirement(value == null ? null : (scrum.server.project.Requirement)requirementDao.getById((String)value));
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

    public final scrum.server.admin.User getOwner() {
        try {
            return this.ownerId == null ? null : (scrum.server.admin.User) AEntity.getById(this.ownerId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Task.owner");
        }
    }

    public final void setOwner(scrum.server.admin.User owner) {
        owner = prepareOwner(owner);
        if (isOwner(owner)) return;
        setOwnerId(owner == null ? null : owner.getId());
    }

    public final void setOwnerId(String id) {
        if (Utl.equals(ownerId, id)) return;
        this.ownerId = id;
            updateLastModified();
            fireModified("ownerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.ownerId));
    }

    private final void updateOwnerId(String id) {
        setOwnerId(id);
    }

    protected scrum.server.admin.User prepareOwner(scrum.server.admin.User owner) {
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

    public final boolean isOwner(scrum.server.admin.User owner) {
        if (this.ownerId == null && owner == null) return true;
        return owner != null && owner.getId().equals(this.ownerId);
    }

    protected final void updateOwner(Object value) {
        setOwner(value == null ? null : (scrum.server.admin.User)userDao.getById((String)value));
    }
    // -----------------------------------------------------------
    // - impediments
    // -----------------------------------------------------------

    private java.util.Set<String> impedimentsIds = new java.util.HashSet<String>();

    public final Collection<String> getImpedimentsIds() {
        return java.util.Collections .unmodifiableCollection(this.impedimentsIds);
    }

    public final java.util.Set<scrum.server.impediments.Impediment> getImpediments() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.impedimentsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Task.impediments");
        }
    }

    public final void setImpediments(Collection<scrum.server.impediments.Impediment> impediments) {
        impediments = prepareImpediments(impediments);
        if (impediments == null) impediments = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(impediments);
        setImpedimentsIds(ids);
    }

    public final void setImpedimentsIds(java.util.Set<String> ids) {
        if (Utl.equals(impedimentsIds, ids)) return;
        impedimentsIds = ids;
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
    }

    private final void updateImpedimentsIds(java.util.Set<String> ids) {
        setImpedimentsIds(ids);
    }

    protected Collection<scrum.server.impediments.Impediment> prepareImpediments(Collection<scrum.server.impediments.Impediment> impediments) {
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

    public final boolean containsImpediment(scrum.server.impediments.Impediment impediment) {
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

    public final boolean addImpediment(scrum.server.impediments.Impediment impediment) {
        if (impediment == null) throw new IllegalArgumentException("impediment == null");
        if (this.impedimentsIds == null) this.impedimentsIds = new java.util.HashSet<String>();
        boolean added = this.impedimentsIds.add(impediment.getId());
        if (added) {
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        }
        return added;
    }

    public final boolean addImpediments(Collection<scrum.server.impediments.Impediment> impediments) {
        if (impediments == null) throw new IllegalArgumentException("impediments == null");
        if (this.impedimentsIds == null) this.impedimentsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.impediments.Impediment impediment : impediments) {
            added = added | this.impedimentsIds.add(impediment.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        }
        return added;
    }

    public final boolean removeImpediment(scrum.server.impediments.Impediment impediment) {
        if (impediment == null) return false;
        if (this.impedimentsIds == null) return false;
        boolean removed = this.impedimentsIds.remove(impediment.getId());
        if (removed) {
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        }
        return removed;
    }

    public final boolean removeImpediments(Collection<scrum.server.impediments.Impediment> impediments) {
        if (impediments == null) return false;
        if (impediments.isEmpty()) return false;
        if (this.impedimentsIds == null) return false;
        boolean removed = false;
        for (scrum.server.impediments.Impediment _element: impediments) {
            removed = removed | this.impedimentsIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("impedimentsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.impedimentsIds));
        }
        return removed;
    }

    public final boolean clearImpediments() {
        if (this.impedimentsIds == null) return false;
        if (this.impedimentsIds.isEmpty()) return false;
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

    public final scrum.server.sprint.Sprint getClosedInPastSprint() {
        try {
            return this.closedInPastSprintId == null ? null : (scrum.server.sprint.Sprint) AEntity.getById(this.closedInPastSprintId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Task.closedInPastSprint");
        }
    }

    public final void setClosedInPastSprint(scrum.server.sprint.Sprint closedInPastSprint) {
        closedInPastSprint = prepareClosedInPastSprint(closedInPastSprint);
        if (isClosedInPastSprint(closedInPastSprint)) return;
        setClosedInPastSprintId(closedInPastSprint == null ? null : closedInPastSprint.getId());
    }

    public final void setClosedInPastSprintId(String id) {
        if (Utl.equals(closedInPastSprintId, id)) return;
        this.closedInPastSprintId = id;
            updateLastModified();
            fireModified("closedInPastSprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.closedInPastSprintId));
    }

    private final void updateClosedInPastSprintId(String id) {
        setClosedInPastSprintId(id);
    }

    protected scrum.server.sprint.Sprint prepareClosedInPastSprint(scrum.server.sprint.Sprint closedInPastSprint) {
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

    public final boolean isClosedInPastSprint(scrum.server.sprint.Sprint closedInPastSprint) {
        if (this.closedInPastSprintId == null && closedInPastSprint == null) return true;
        return closedInPastSprint != null && closedInPastSprint.getId().equals(this.closedInPastSprintId);
    }

    protected final void updateClosedInPastSprint(Object value) {
        setClosedInPastSprint(value == null ? null : (scrum.server.sprint.Sprint)sprintDao.getById((String)value));
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

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadRequirementReference(entityId);
        repairDeadOwnerReference(entityId);
        if (this.impedimentsIds == null) this.impedimentsIds = new java.util.HashSet<String>();
        repairDeadImpedimentReference(entityId);
        repairDeadClosedInPastSprintReference(entityId);
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
        Collection<scrum.server.sprint.SprintReport> sprintReport = getSprintReports();
        Collection<scrum.server.sprint.SprintReport> sprintReportWithOpenTasks = getSprintReportWithOpenTaskss();
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.project.RequirementDao requirementDao;

    public static final void setRequirementDao(scrum.server.project.RequirementDao requirementDao) {
        GTask.requirementDao = requirementDao;
    }

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GTask.userDao = userDao;
    }

    static scrum.server.impediments.ImpedimentDao impedimentDao;

    public static final void setImpedimentDao(scrum.server.impediments.ImpedimentDao impedimentDao) {
        GTask.impedimentDao = impedimentDao;
    }

    static scrum.server.sprint.SprintDao sprintDao;

    public static final void setSprintDao(scrum.server.sprint.SprintDao sprintDao) {
        GTask.sprintDao = sprintDao;
    }

    static scrum.server.sprint.TaskDao taskDao;

    public static final void setTaskDao(scrum.server.sprint.TaskDao taskDao) {
        GTask.taskDao = taskDao;
    }

    static scrum.server.sprint.SprintReportDao sprintReportDao;

    public static final void setSprintReportDao(scrum.server.sprint.SprintReportDao sprintReportDao) {
        GTask.sprintReportDao = sprintReportDao;
    }

}