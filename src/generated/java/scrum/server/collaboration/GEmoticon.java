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

public abstract class GEmoticon
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<Emoticon> {

    public static class EmoticonMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata parent = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "parent";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Emoticon)entity).getParent();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata owner = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "owner";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Emoticon)entity).getOwner();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata emotion = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "emotion";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Emoticon)entity).getEmotion();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            parent
            ,owner
            ,emotion
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("parent".equals(fieldName)) return parent;
            if ("parentId".equals(fieldName)) return parent;
            if ("owner".equals(fieldName)) return owner;
            if ("ownerId".equals(fieldName)) return owner;
            if ("emotion".equals(fieldName)) return emotion;
            return null;
        }

    }

    public static transient final EmoticonMetadata metadata = new EmoticonMetadata();

    @Override
    public EmoticonMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Emoticon.class);

    // --- AEntity ---

    public final scrum.server.collaboration.EmoticonDao getDao() {
        return emoticonDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class AEmoticonQuery extends ilarkesto.core.persistance.AEntityQuery<Emoticon> {
    @Override
        public Class<Emoticon> getType() {
            return Emoticon.class;
        }
    }

    public static Set<Emoticon> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Emoticon.class).list();
    }

    public static Emoticon getById(String id) {
        return (Emoticon) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getParent()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getOwner()); } catch(EntityDoesNotExistException ex) {}
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("parentId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentId));
        properties.put("ownerId", ilarkesto.core.persistance.Persistence.propertyAsString(this.ownerId));
        properties.put("emotion", ilarkesto.core.persistance.Persistence.propertyAsString(this.emotion));
    }

    @Override
    public int compareTo(Emoticon other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GEmoticon.class);

    public static final String TYPE = "Emoticon";
    // -----------------------------------------------------------
    // - parent
    // -----------------------------------------------------------

    private String parentId;

    public final String getParentId() {
        return this.parentId;
    }

    public final ilarkesto.persistence.AEntity getParent() {
        try {
            return this.parentId == null ? null : (ilarkesto.persistence.AEntity) AEntity.getById(this.parentId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Emoticon.parent");
        }
    }

    public final void setParent(ilarkesto.persistence.AEntity parent) {
        parent = prepareParent(parent);
        if (isParent(parent)) return;
        setParentId(parent == null ? null : parent.getId());
    }

    public final void setParentId(String id) {
        if (Utl.equals(parentId, id)) return;
        this.parentId = id;
            updateLastModified();
            fireModified("parentId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentId));
    }

    private final void updateParentId(String id) {
        setParentId(id);
    }

    protected ilarkesto.persistence.AEntity prepareParent(ilarkesto.persistence.AEntity parent) {
        return parent;
    }

    protected void repairDeadParentReference(String entityId) {
        if (!isPersisted()) return;
        if (this.parentId == null || entityId.equals(this.parentId)) {
            repairMissingMaster();
        }
    }

    public final boolean isParentSet() {
        return this.parentId != null;
    }

    public final boolean isParent(ilarkesto.persistence.AEntity parent) {
        if (this.parentId == null && parent == null) return true;
        return parent != null && parent.getId().equals(this.parentId);
    }

    protected final void updateParent(Object value) {
        setParent(value == null ? null : (ilarkesto.persistence.AEntity)getDaoService().getById((String)value));
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
            throw ex.setCallerInfo("Emoticon.owner");
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
            repairMissingMaster();
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
    // - emotion
    // -----------------------------------------------------------

    private java.lang.String emotion;

    public final java.lang.String getEmotion() {
        return emotion;
    }

    public final void setEmotion(java.lang.String emotion) {
        emotion = prepareEmotion(emotion);
        if (isEmotion(emotion)) return;
        this.emotion = emotion;
            updateLastModified();
            fireModified("emotion", ilarkesto.core.persistance.Persistence.propertyAsString(this.emotion));
    }

    private final void updateEmotion(java.lang.String emotion) {
        if (isEmotion(emotion)) return;
        this.emotion = emotion;
            updateLastModified();
            fireModified("emotion", ilarkesto.core.persistance.Persistence.propertyAsString(this.emotion));
    }

    protected java.lang.String prepareEmotion(java.lang.String emotion) {
         emotion = Str.removeControlChars(emotion);
        return emotion;
    }

    public final boolean isEmotionSet() {
        return this.emotion != null;
    }

    public final boolean isEmotion(java.lang.String emotion) {
        if (this.emotion == null && emotion == null) return true;
        return this.emotion != null && this.emotion.equals(emotion);
    }

    protected final void updateEmotion(Object value) {
        setEmotion((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("parentId")) updateParentId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("ownerId")) updateOwnerId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("emotion")) updateEmotion(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadParentReference(entityId);
        repairDeadOwnerReference(entityId);
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        if (!isParentSet()) {
            repairMissingMaster();
        }
        try {
            getParent();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead parent reference");
            repairDeadParentReference(this.parentId);
        }
        if (!isOwnerSet()) {
            repairMissingMaster();
        }
        try {
            getOwner();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead owner reference");
            repairDeadOwnerReference(this.ownerId);
        }
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GEmoticon.userDao = userDao;
    }

    static scrum.server.collaboration.EmoticonDao emoticonDao;

    public static final void setEmoticonDao(scrum.server.collaboration.EmoticonDao emoticonDao) {
        GEmoticon.emoticonDao = emoticonDao;
    }

}