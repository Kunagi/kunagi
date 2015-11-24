// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.collaboration;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GEmoticon
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Emoticon> {

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

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Emoticon> parentBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Emoticon>() {
    @Override
        protected Set<Emoticon> loadById(final String id) {
        return new AEmoticonQuery() {
            @Override
            public boolean test(Emoticon entity) {
                return id.equals(entity.getParentId());
            }
            @Override
            public String toString() {
                return "Emoticon:byParent";
            }
        }.list();
        }
    };

    public static Set< Emoticon> listByParent(final scrum.client.common.AScrumGwtEntity parent) {
        if (parent == null) return new HashSet<Emoticon>();
        return parentBackReferencesCache.getById(parent.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Emoticon> ownerBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Emoticon>() {
    @Override
        protected Set<Emoticon> loadById(final String id) {
        return new AEmoticonQuery() {
            @Override
            public boolean test(Emoticon entity) {
                return id.equals(entity.getOwnerId());
            }
            @Override
            public String toString() {
                return "Emoticon:byOwner";
            }
        }.list();
        }
    };

    public static Set< Emoticon> listByOwner(final scrum.client.admin.User owner) {
        if (owner == null) return new HashSet<Emoticon>();
        return ownerBackReferencesCache.getById(owner.getId());
    }

    public static Set< Emoticon> listByEmotion(final java.lang.String emotion) {
        return new AEmoticonQuery() {
            @Override
            public boolean test(Emoticon entity) {
                return entity.isEmotion(emotion);
            }
            @Override
            public String toString() {
                return "Emoticon:byEmotion";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        parentBackReferencesCache.clear(getParentId());
        ownerBackReferencesCache.clear(getOwnerId());
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

    public final scrum.client.common.AScrumGwtEntity getParent() {
        try {
            return this.parentId == null ? null : (scrum.client.common.AScrumGwtEntity) AEntity.getById(this.parentId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Emoticon.parent");
        }
    }

    public final void setParent(scrum.client.common.AScrumGwtEntity parent) {
        parent = prepareParent(parent);
        if (isParent(parent)) return;
        setParentId(parent == null ? null : parent.getId());
    }

    public final void setParentId(String id) {
        if (Utl.equals(parentId, id)) return;
        clearParentBackReferenceCache(id, this.parentId);
        this.parentId = id;
            updateLastModified();
            fireModified("parentId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentId));
    }

    private void clearParentBackReferenceCache(String oldId, String newId) {
        parentBackReferencesCache.clear(oldId);
        parentBackReferencesCache.clear(newId);
    }

    private final void updateParentId(String id) {
        setParentId(id);
    }

    protected scrum.client.common.AScrumGwtEntity prepareParent(scrum.client.common.AScrumGwtEntity parent) {
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

    public final boolean isParent(scrum.client.common.AScrumGwtEntity parent) {
        if (this.parentId == null && parent == null) return true;
        return parent != null && parent.getId().equals(this.parentId);
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
            throw ex.setCallerInfo("Emoticon.owner");
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
            repairMissingMaster();
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
        // emotion = Str.removeUnreadableChars(emotion);
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

    // --- PLUGIN: GwtEntityPropertyEditorClassGeneratorPlugin ---

    private transient EmotionModel emotionModel;

    public EmotionModel getEmotionModel() {
        if (emotionModel == null) emotionModel = createEmotionModel();
        return emotionModel;
    }

    protected EmotionModel createEmotionModel() { return new EmotionModel(); }

    protected class EmotionModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Emoticon_emotion";
        }

        @Override
        public java.lang.String getValue() {
            return getEmotion();
        }

        @Override
        public void setValue(java.lang.String value) {
            setEmotion(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}