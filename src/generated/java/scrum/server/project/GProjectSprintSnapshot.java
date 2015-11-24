// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.project;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GProjectSprintSnapshot
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<ProjectSprintSnapshot> {

    public static class ProjectSprintSnapshotMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata sprint = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "sprint";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectSprintSnapshot)entity).getSprint();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata remainingWork = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "remainingWork";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectSprintSnapshot)entity).getRemainingWork();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata burnedWork = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "burnedWork";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ProjectSprintSnapshot)entity).getBurnedWork();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            sprint
            ,remainingWork
            ,burnedWork
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("sprint".equals(fieldName)) return sprint;
            if ("sprintId".equals(fieldName)) return sprint;
            if ("remainingWork".equals(fieldName)) return remainingWork;
            if ("burnedWork".equals(fieldName)) return burnedWork;
            return null;
        }

    }

    public static transient final ProjectSprintSnapshotMetadata metadata = new ProjectSprintSnapshotMetadata();

    @Override
    public ProjectSprintSnapshotMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(ProjectSprintSnapshot.class);

    // --- AEntity ---

    public final scrum.server.project.ProjectSprintSnapshotDao getDao() {
        return projectSprintSnapshotDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class AProjectSprintSnapshotQuery extends ilarkesto.core.persistance.AEntityQuery<ProjectSprintSnapshot> {
    @Override
        public Class<ProjectSprintSnapshot> getType() {
            return ProjectSprintSnapshot.class;
        }
    }

    public static Set<ProjectSprintSnapshot> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(ProjectSprintSnapshot.class).list();
    }

    public static ProjectSprintSnapshot getById(String id) {
        return (ProjectSprintSnapshot) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getSprint()); } catch(EntityDoesNotExistException ex) {}
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("sprintId", ilarkesto.core.persistance.Persistence.propertyAsString(this.sprintId));
        properties.put("remainingWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.remainingWork));
        properties.put("burnedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.burnedWork));
    }

    @Override
    public int compareTo(ProjectSprintSnapshot other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GProjectSprintSnapshot.class);

    public static final String TYPE = "ProjectSprintSnapshot";
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
            throw ex.setCallerInfo("ProjectSprintSnapshot.sprint");
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

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("sprintId")) updateSprintId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("remainingWork")) updateRemainingWork(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("burnedWork")) updateBurnedWork(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadSprintReference(entityId);
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
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.sprint.SprintDao sprintDao;

    public static final void setSprintDao(scrum.server.sprint.SprintDao sprintDao) {
        GProjectSprintSnapshot.sprintDao = sprintDao;
    }

    static scrum.server.project.ProjectSprintSnapshotDao projectSprintSnapshotDao;

    public static final void setProjectSprintSnapshotDao(scrum.server.project.ProjectSprintSnapshotDao projectSprintSnapshotDao) {
        GProjectSprintSnapshot.projectSprintSnapshotDao = projectSprintSnapshotDao;
    }

}