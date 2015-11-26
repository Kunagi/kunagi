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

public abstract class GComment
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<Comment>, ilarkesto.core.search.Searchable {

    public static class CommentMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata parent = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "parent";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Comment)entity).getParent();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata author = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "author";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Comment)entity).getAuthor();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata published = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "published";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Comment)entity).isPublished();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata authorName = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "authorName";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Comment)entity).getAuthorName();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata authorEmail = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "authorEmail";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Comment)entity).getAuthorEmail();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata authorNameVisible = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "authorNameVisible";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Comment)entity).isAuthorNameVisible();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata text = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "text";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Comment)entity).getText();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata dateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "dateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Comment)entity).getDateAndTime();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            parent
            ,author
            ,published
            ,authorName
            ,authorEmail
            ,authorNameVisible
            ,text
            ,dateAndTime
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("parent".equals(fieldName)) return parent;
            if ("parentId".equals(fieldName)) return parent;
            if ("author".equals(fieldName)) return author;
            if ("authorId".equals(fieldName)) return author;
            if ("published".equals(fieldName)) return published;
            if ("authorName".equals(fieldName)) return authorName;
            if ("authorEmail".equals(fieldName)) return authorEmail;
            if ("authorNameVisible".equals(fieldName)) return authorNameVisible;
            if ("text".equals(fieldName)) return text;
            if ("dateAndTime".equals(fieldName)) return dateAndTime;
            return null;
        }

    }

    public static transient final CommentMetadata metadata = new CommentMetadata();

    @Override
    public CommentMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Comment.class);

    // --- AEntity ---

    public final scrum.server.collaboration.CommentDao getDao() {
        return commentDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class ACommentQuery extends ilarkesto.core.persistance.AEntityQuery<Comment> {
    @Override
        public Class<Comment> getType() {
            return Comment.class;
        }
    }

    public static Set<Comment> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Comment.class).list();
    }

    public static Comment getById(String id) {
        return (Comment) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getParent()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getAuthor()); } catch(EntityDoesNotExistException ex) {}
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("parentId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentId));
        properties.put("authorId", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorId));
        properties.put("published", ilarkesto.core.persistance.Persistence.propertyAsString(this.published));
        properties.put("authorName", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorName));
        properties.put("authorEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorEmail));
        properties.put("authorNameVisible", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorNameVisible));
        properties.put("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
        properties.put("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
    }

    @Override
    public int compareTo(Comment other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GComment.class);

    public static final String TYPE = "Comment";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getText());
    }
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
            throw ex.setCallerInfo("Comment.parent");
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
    // - author
    // -----------------------------------------------------------

    private String authorId;

    public final String getAuthorId() {
        return this.authorId;
    }

    public final scrum.server.admin.User getAuthor() {
        try {
            return this.authorId == null ? null : (scrum.server.admin.User) AEntity.getById(this.authorId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Comment.author");
        }
    }

    public final void setAuthor(scrum.server.admin.User author) {
        author = prepareAuthor(author);
        if (isAuthor(author)) return;
        setAuthorId(author == null ? null : author.getId());
    }

    public final void setAuthorId(String id) {
        if (Utl.equals(authorId, id)) return;
        this.authorId = id;
            updateLastModified();
            fireModified("authorId", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorId));
    }

    private final void updateAuthorId(String id) {
        setAuthorId(id);
    }

    protected scrum.server.admin.User prepareAuthor(scrum.server.admin.User author) {
        return author;
    }

    protected void repairDeadAuthorReference(String entityId) {
        if (!isPersisted()) return;
        if (this.authorId == null || entityId.equals(this.authorId)) {
            setAuthor(null);
        }
    }

    public final boolean isAuthorSet() {
        return this.authorId != null;
    }

    public final boolean isAuthor(scrum.server.admin.User author) {
        if (this.authorId == null && author == null) return true;
        return author != null && author.getId().equals(this.authorId);
    }

    protected final void updateAuthor(Object value) {
        setAuthor(value == null ? null : (scrum.server.admin.User)userDao.getById((String)value));
    }
    // -----------------------------------------------------------
    // - published
    // -----------------------------------------------------------

    private boolean published;

    public final boolean isPublished() {
        return published;
    }

    public final void setPublished(boolean published) {
        published = preparePublished(published);
        if (isPublished(published)) return;
        this.published = published;
            updateLastModified();
            fireModified("published", ilarkesto.core.persistance.Persistence.propertyAsString(this.published));
    }

    private final void updatePublished(boolean published) {
        if (isPublished(published)) return;
        this.published = published;
            updateLastModified();
            fireModified("published", ilarkesto.core.persistance.Persistence.propertyAsString(this.published));
    }

    protected boolean preparePublished(boolean published) {
        return published;
    }

    public final boolean isPublished(boolean published) {
        return this.published == published;
    }

    protected final void updatePublished(Object value) {
        setPublished((Boolean)value);
    }
    // -----------------------------------------------------------
    // - authorName
    // -----------------------------------------------------------

    private java.lang.String authorName;

    public final java.lang.String getAuthorName() {
        return authorName;
    }

    public final void setAuthorName(java.lang.String authorName) {
        authorName = prepareAuthorName(authorName);
        if (isAuthorName(authorName)) return;
        this.authorName = authorName;
            updateLastModified();
            fireModified("authorName", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorName));
    }

    private final void updateAuthorName(java.lang.String authorName) {
        if (isAuthorName(authorName)) return;
        this.authorName = authorName;
            updateLastModified();
            fireModified("authorName", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorName));
    }

    protected java.lang.String prepareAuthorName(java.lang.String authorName) {
         authorName = Str.removeControlChars(authorName);
        return authorName;
    }

    public final boolean isAuthorNameSet() {
        return this.authorName != null;
    }

    public final boolean isAuthorName(java.lang.String authorName) {
        if (this.authorName == null && authorName == null) return true;
        return this.authorName != null && this.authorName.equals(authorName);
    }

    protected final void updateAuthorName(Object value) {
        setAuthorName((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - authorEmail
    // -----------------------------------------------------------

    private java.lang.String authorEmail;

    public final java.lang.String getAuthorEmail() {
        return authorEmail;
    }

    public final void setAuthorEmail(java.lang.String authorEmail) {
        authorEmail = prepareAuthorEmail(authorEmail);
        if (isAuthorEmail(authorEmail)) return;
        this.authorEmail = authorEmail;
            updateLastModified();
            fireModified("authorEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorEmail));
    }

    private final void updateAuthorEmail(java.lang.String authorEmail) {
        if (isAuthorEmail(authorEmail)) return;
        this.authorEmail = authorEmail;
            updateLastModified();
            fireModified("authorEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorEmail));
    }

    protected java.lang.String prepareAuthorEmail(java.lang.String authorEmail) {
         authorEmail = Str.removeControlChars(authorEmail);
        return authorEmail;
    }

    public final boolean isAuthorEmailSet() {
        return this.authorEmail != null;
    }

    public final boolean isAuthorEmail(java.lang.String authorEmail) {
        if (this.authorEmail == null && authorEmail == null) return true;
        return this.authorEmail != null && this.authorEmail.equals(authorEmail);
    }

    protected final void updateAuthorEmail(Object value) {
        setAuthorEmail((java.lang.String)value);
    }
    // -----------------------------------------------------------
    // - authorNameVisible
    // -----------------------------------------------------------

    private boolean authorNameVisible;

    public final boolean isAuthorNameVisible() {
        return authorNameVisible;
    }

    public final void setAuthorNameVisible(boolean authorNameVisible) {
        authorNameVisible = prepareAuthorNameVisible(authorNameVisible);
        if (isAuthorNameVisible(authorNameVisible)) return;
        this.authorNameVisible = authorNameVisible;
            updateLastModified();
            fireModified("authorNameVisible", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorNameVisible));
    }

    private final void updateAuthorNameVisible(boolean authorNameVisible) {
        if (isAuthorNameVisible(authorNameVisible)) return;
        this.authorNameVisible = authorNameVisible;
            updateLastModified();
            fireModified("authorNameVisible", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorNameVisible));
    }

    protected boolean prepareAuthorNameVisible(boolean authorNameVisible) {
        return authorNameVisible;
    }

    public final boolean isAuthorNameVisible(boolean authorNameVisible) {
        return this.authorNameVisible == authorNameVisible;
    }

    protected final void updateAuthorNameVisible(Object value) {
        setAuthorNameVisible((Boolean)value);
    }
    // -----------------------------------------------------------
    // - text
    // -----------------------------------------------------------

    private java.lang.String text;

    public final java.lang.String getText() {
        return text;
    }

    public final void setText(java.lang.String text) {
        text = prepareText(text);
        if (isText(text)) return;
        if (text == null) throw new IllegalArgumentException("Mandatory field can not be set to null: text");
        this.text = text;
            updateLastModified();
            fireModified("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
    }

    private final void updateText(java.lang.String text) {
        if (isText(text)) return;
        if (text == null) throw new IllegalArgumentException("Mandatory field can not be set to null: text");
        this.text = text;
            updateLastModified();
            fireModified("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
    }

    protected java.lang.String prepareText(java.lang.String text) {
         text = Str.removeControlChars(text);
        return text;
    }

    public final boolean isTextSet() {
        return this.text != null;
    }

    public final boolean isText(java.lang.String text) {
        if (this.text == null && text == null) return true;
        return this.text != null && this.text.equals(text);
    }

    protected final void updateText(Object value) {
        setText((java.lang.String)value);
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
        this.dateAndTime = dateAndTime;
            updateLastModified();
            fireModified("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
    }

    private final void updateDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        if (isDateAndTime(dateAndTime)) return;
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

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("parentId")) updateParentId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("authorId")) updateAuthorId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("published")) updatePublished(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("authorName")) updateAuthorName(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("authorEmail")) updateAuthorEmail(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("authorNameVisible")) updateAuthorNameVisible(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
            if (property.equals("text")) updateText(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("dateAndTime")) updateDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadParentReference(entityId);
        repairDeadAuthorReference(entityId);
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
            getAuthor();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead author reference");
            repairDeadAuthorReference(this.authorId);
        }
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GComment.userDao = userDao;
    }

    static scrum.server.collaboration.CommentDao commentDao;

    public static final void setCommentDao(scrum.server.collaboration.CommentDao commentDao) {
        GComment.commentDao = commentDao;
    }

}