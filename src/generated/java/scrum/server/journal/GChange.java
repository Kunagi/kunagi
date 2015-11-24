// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.journal;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GChange
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<Change> {

    public static class ChangeMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata parent = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "parent";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Change)entity).getParent();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata user = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "user";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Change)entity).getUser();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata dateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "dateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Change)entity).getDateAndTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata key = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "key";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Change)entity).getKey();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata oldValue = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "oldValue";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Change)entity).getOldValue();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata newValue = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "newValue";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Change)entity).getNewValue();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata comment = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "comment";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Change)entity).getComment();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            parent
            ,user
            ,dateAndTime
            ,key
            ,oldValue
            ,newValue
            ,comment
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("parent".equals(fieldName)) return parent;
            if ("parentId".equals(fieldName)) return parent;
            if ("user".equals(fieldName)) return user;
            if ("userId".equals(fieldName)) return user;
            if ("dateAndTime".equals(fieldName)) return dateAndTime;
            if ("key".equals(fieldName)) return key;
            if ("oldValue".equals(fieldName)) return oldValue;
            if ("newValue".equals(fieldName)) return newValue;
            if ("comment".equals(fieldName)) return comment;
            return null;
        }

    }

    public static transient final ChangeMetadata metadata = new ChangeMetadata();

    @Override
    public ChangeMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Change.class);

    // --- AEntity ---

    public final scrum.server.journal.ChangeDao getDao() {
        return changeDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class AChangeQuery extends ilarkesto.core.persistance.AEntityQuery<Change> {
    @Override
        public Class<Change> getType() {
            return Change.class;
        }
    }

    public static Set<Change> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Change.class).list();
    }

    public static Change getById(String id) {
        return (Change) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getParent()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getUser()); } catch(EntityDoesNotExistException ex) {}
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("parentId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentId));
        properties.put("userId", ilarkesto.core.persistance.Persistence.propertyAsString(this.userId));
        properties.put("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
        properties.put("key", ilarkesto.core.persistance.Persistence.propertyAsString(this.key));
        properties.put("oldValue", ilarkesto.core.persistance.Persistence.propertyAsString(this.oldValue));
        properties.put("newValue", ilarkesto.core.persistance.Persistence.propertyAsString(this.newValue));
        properties.put("comment", ilarkesto.core.persistance.Persistence.propertyAsString(this.comment));
    }

    @Override
    public int compareTo(Change other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GChange.class);

    public static final String TYPE = "Change";
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
            throw ex.setCallerInfo("Change.parent");
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
            throw ex.setCallerInfo("Change.user");
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
            setUser(null);
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
    // - dateAndTime
    // -----------------------------------------------------------

    private ilarkesto.core.time.DateAndTime dateAndTime;

    public final ilarkesto.core.time.DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public final void setDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        dateAndTime = prepareDateAndTime(dateAndTime);
        if (isDateAndTime(dateAndTime)) return;
        if (dateAndTime == null) throw new IllegalArgumentException("Mandatory field can not be set to null: dateAndTime");
        this.dateAndTime = dateAndTime;
            updateLastModified();
            fireModified("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
    }

    private final void updateDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        if (isDateAndTime(dateAndTime)) return;
        if (dateAndTime == null) throw new IllegalArgumentException("Mandatory field can not be set to null: dateAndTime");
        this.dateAndTime = dateAndTime;
            updateLastModified();
            fireModified("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
    }

    protected ilarkesto.core.time.DateAndTime prepareDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        return dateAndTime;
    }

    public final boolean isDateAndTimeSet() {
        return this.dateAndTime != null;
    }

    public final boolean isDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        if (this.dateAndTime == null && dateAndTime == null) return true;
        return this.dateAndTime != null && this.dateAndTime.equals(dateAndTime);
    }

    protected final void updateDateAndTime(Object value) {
        value = value == null ? null : new ilarkesto.core.time.DateAndTime((String)value);
        setDateAndTime((ilarkesto.core.time.DateAndTime)value);
    }
    // -----------------------------------------------------------
    // - key
    // -----------------------------------------------------------

    private java.lang.String key;

    public final java.lang.String getKey() {
        return key;
    }

    public final void setKey(java.lang.String key) {
        key = prepareKey(key);
        if (isKey(key)) return;
        this.key = key;
            updateLastModified();
            fireModified("key", ilarkesto.core.persistance.Persistence.propertyAsString(this.key));
    }

    private final void updateKey(java.lang.String key) {
        if (isKey(key)) return;
        this.key = key;
            updateLastModified();
            fireModified("key", ilarkesto.core.persistance.Persistence.propertyAsString(this.key));
    }

    protected java.lang.String prepareKey(java.lang.String key) {
        // key = Str.removeUnreadableChars(key);
        return key;
    }

    public final boolean isKeySet() {
        return this.key != null;
    }

    public final boolean isKey(java.lang.String key) {
        if (this.key == null && key == null) return true;
        return this.key != null && this.key.equals(key);
    }

    protected final void updateKey(Object value) {
        setKey((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - oldValue
    // -----------------------------------------------------------

    private java.lang.String oldValue;

    public final java.lang.String getOldValue() {
        return oldValue;
    }

    public final void setOldValue(java.lang.String oldValue) {
        oldValue = prepareOldValue(oldValue);
        if (isOldValue(oldValue)) return;
        this.oldValue = oldValue;
            updateLastModified();
            fireModified("oldValue", ilarkesto.core.persistance.Persistence.propertyAsString(this.oldValue));
    }

    private final void updateOldValue(java.lang.String oldValue) {
        if (isOldValue(oldValue)) return;
        this.oldValue = oldValue;
            updateLastModified();
            fireModified("oldValue", ilarkesto.core.persistance.Persistence.propertyAsString(this.oldValue));
    }

    protected java.lang.String prepareOldValue(java.lang.String oldValue) {
        // oldValue = Str.removeUnreadableChars(oldValue);
        return oldValue;
    }

    public final boolean isOldValueSet() {
        return this.oldValue != null;
    }

    public final boolean isOldValue(java.lang.String oldValue) {
        if (this.oldValue == null && oldValue == null) return true;
        return this.oldValue != null && this.oldValue.equals(oldValue);
    }

    protected final void updateOldValue(Object value) {
        setOldValue((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - newValue
    // -----------------------------------------------------------

    private java.lang.String newValue;

    public final java.lang.String getNewValue() {
        return newValue;
    }

    public final void setNewValue(java.lang.String newValue) {
        newValue = prepareNewValue(newValue);
        if (isNewValue(newValue)) return;
        this.newValue = newValue;
            updateLastModified();
            fireModified("newValue", ilarkesto.core.persistance.Persistence.propertyAsString(this.newValue));
    }

    private final void updateNewValue(java.lang.String newValue) {
        if (isNewValue(newValue)) return;
        this.newValue = newValue;
            updateLastModified();
            fireModified("newValue", ilarkesto.core.persistance.Persistence.propertyAsString(this.newValue));
    }

    protected java.lang.String prepareNewValue(java.lang.String newValue) {
        // newValue = Str.removeUnreadableChars(newValue);
        return newValue;
    }

    public final boolean isNewValueSet() {
        return this.newValue != null;
    }

    public final boolean isNewValue(java.lang.String newValue) {
        if (this.newValue == null && newValue == null) return true;
        return this.newValue != null && this.newValue.equals(newValue);
    }

    protected final void updateNewValue(Object value) {
        setNewValue((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - comment
    // -----------------------------------------------------------

    private java.lang.String comment;

    public final java.lang.String getComment() {
        return comment;
    }

    public final void setComment(java.lang.String comment) {
        comment = prepareComment(comment);
        if (isComment(comment)) return;
        this.comment = comment;
            updateLastModified();
            fireModified("comment", ilarkesto.core.persistance.Persistence.propertyAsString(this.comment));
    }

    private final void updateComment(java.lang.String comment) {
        if (isComment(comment)) return;
        this.comment = comment;
            updateLastModified();
            fireModified("comment", ilarkesto.core.persistance.Persistence.propertyAsString(this.comment));
    }

    protected java.lang.String prepareComment(java.lang.String comment) {
        // comment = Str.removeUnreadableChars(comment);
        return comment;
    }

    public final boolean isCommentSet() {
        return this.comment != null;
    }

    public final boolean isComment(java.lang.String comment) {
        if (this.comment == null && comment == null) return true;
        return this.comment != null && this.comment.equals(comment);
    }

    protected final void updateComment(Object value) {
        setComment((java.lang.String)value);
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("parentId")) updateParentId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("userId")) updateUserId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("dateAndTime")) updateDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
            if (property.equals("key")) updateKey(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("oldValue")) updateOldValue(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("newValue")) updateNewValue(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("comment")) updateComment(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadParentReference(entityId);
        repairDeadUserReference(entityId);
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

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GChange.userDao = userDao;
    }

    static scrum.server.journal.ChangeDao changeDao;

    public static final void setChangeDao(scrum.server.journal.ChangeDao changeDao) {
        GChange.changeDao = changeDao;
    }

}