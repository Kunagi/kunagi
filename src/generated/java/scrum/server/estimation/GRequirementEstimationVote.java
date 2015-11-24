// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.estimation;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GRequirementEstimationVote
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<RequirementEstimationVote> {

    public static class RequirementEstimationVoteMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata requirement = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "requirement";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((RequirementEstimationVote)entity).getRequirement();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata user = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "user";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((RequirementEstimationVote)entity).getUser();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata estimatedWork = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "estimatedWork";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((RequirementEstimationVote)entity).getEstimatedWork();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            requirement
            ,user
            ,estimatedWork
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("requirement".equals(fieldName)) return requirement;
            if ("requirementId".equals(fieldName)) return requirement;
            if ("user".equals(fieldName)) return user;
            if ("userId".equals(fieldName)) return user;
            if ("estimatedWork".equals(fieldName)) return estimatedWork;
            return null;
        }

    }

    public static transient final RequirementEstimationVoteMetadata metadata = new RequirementEstimationVoteMetadata();

    @Override
    public RequirementEstimationVoteMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(RequirementEstimationVote.class);

    // --- AEntity ---

    public final scrum.server.estimation.RequirementEstimationVoteDao getDao() {
        return requirementEstimationVoteDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class ARequirementEstimationVoteQuery extends ilarkesto.core.persistance.AEntityQuery<RequirementEstimationVote> {
    @Override
        public Class<RequirementEstimationVote> getType() {
            return RequirementEstimationVote.class;
        }
    }

    public static Set<RequirementEstimationVote> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(RequirementEstimationVote.class).list();
    }

    public static RequirementEstimationVote getById(String id) {
        return (RequirementEstimationVote) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getRequirement()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getUser()); } catch(EntityDoesNotExistException ex) {}
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("requirementId", ilarkesto.core.persistance.Persistence.propertyAsString(this.requirementId));
        properties.put("userId", ilarkesto.core.persistance.Persistence.propertyAsString(this.userId));
        properties.put("estimatedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.estimatedWork));
    }

    @Override
    public int compareTo(RequirementEstimationVote other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GRequirementEstimationVote.class);

    public static final String TYPE = "RequirementEstimationVote";
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
            throw ex.setCallerInfo("RequirementEstimationVote.requirement");
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
            throw ex.setCallerInfo("RequirementEstimationVote.user");
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
    // - estimatedWork
    // -----------------------------------------------------------

    private java.lang.Float estimatedWork;

    public final java.lang.Float getEstimatedWork() {
        return estimatedWork;
    }

    public final void setEstimatedWork(java.lang.Float estimatedWork) {
        estimatedWork = prepareEstimatedWork(estimatedWork);
        if (isEstimatedWork(estimatedWork)) return;
        this.estimatedWork = estimatedWork;
            updateLastModified();
            fireModified("estimatedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.estimatedWork));
    }

    private final void updateEstimatedWork(java.lang.Float estimatedWork) {
        if (isEstimatedWork(estimatedWork)) return;
        this.estimatedWork = estimatedWork;
            updateLastModified();
            fireModified("estimatedWork", ilarkesto.core.persistance.Persistence.propertyAsString(this.estimatedWork));
    }

    protected java.lang.Float prepareEstimatedWork(java.lang.Float estimatedWork) {
        return estimatedWork;
    }

    public final boolean isEstimatedWorkSet() {
        return this.estimatedWork != null;
    }

    public final boolean isEstimatedWork(java.lang.Float estimatedWork) {
        if (this.estimatedWork == null && estimatedWork == null) return true;
        return this.estimatedWork != null && this.estimatedWork.equals(estimatedWork);
    }

    protected final void updateEstimatedWork(Object value) {
        setEstimatedWork((java.lang.Float)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("requirementId")) updateRequirementId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("userId")) updateUserId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("estimatedWork")) updateEstimatedWork(ilarkesto.core.persistance.Persistence.parsePropertyFloat(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadRequirementReference(entityId);
        repairDeadUserReference(entityId);
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
        if (!isUserSet()) {
            repairMissingMaster();
        }
        try {
            getUser();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead user reference");
            repairDeadUserReference(this.userId);
        }
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.project.RequirementDao requirementDao;

    public static final void setRequirementDao(scrum.server.project.RequirementDao requirementDao) {
        GRequirementEstimationVote.requirementDao = requirementDao;
    }

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GRequirementEstimationVote.userDao = userDao;
    }

    static scrum.server.estimation.RequirementEstimationVoteDao requirementEstimationVoteDao;

    public static final void setRequirementEstimationVoteDao(scrum.server.estimation.RequirementEstimationVoteDao requirementEstimationVoteDao) {
        GRequirementEstimationVote.requirementEstimationVoteDao = requirementEstimationVoteDao;
    }

}