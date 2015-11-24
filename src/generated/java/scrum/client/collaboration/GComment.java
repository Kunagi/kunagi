// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.collaboration;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GComment
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<Comment> {

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

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Comment> parentBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Comment>() {
    @Override
        protected Set<Comment> loadById(final String id) {
        return new ACommentQuery() {
            @Override
            public boolean test(Comment entity) {
                return id.equals(entity.getParentId());
            }
            @Override
            public String toString() {
                return "Comment:byParent";
            }
        }.list();
        }
    };

    public static Set< Comment> listByParent(final scrum.client.common.AScrumGwtEntity parent) {
        if (parent == null) return new HashSet<Comment>();
        return parentBackReferencesCache.getById(parent.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Comment> authorBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<Comment>() {
    @Override
        protected Set<Comment> loadById(final String id) {
        return new ACommentQuery() {
            @Override
            public boolean test(Comment entity) {
                return id.equals(entity.getAuthorId());
            }
            @Override
            public String toString() {
                return "Comment:byAuthor";
            }
        }.list();
        }
    };

    public static Set< Comment> listByAuthor(final scrum.client.admin.User author) {
        if (author == null) return new HashSet<Comment>();
        return authorBackReferencesCache.getById(author.getId());
    }

    public static Set< Comment> listByPublished(final boolean published) {
        return new ACommentQuery() {
            @Override
            public boolean test(Comment entity) {
                return entity.isPublished(published);
            }
            @Override
            public String toString() {
                return "Comment:byPublished";
            }
        }.list();
    }

    public static Set< Comment> listByAuthorName(final java.lang.String authorName) {
        return new ACommentQuery() {
            @Override
            public boolean test(Comment entity) {
                return entity.isAuthorName(authorName);
            }
            @Override
            public String toString() {
                return "Comment:byAuthorName";
            }
        }.list();
    }

    public static Set< Comment> listByAuthorEmail(final java.lang.String authorEmail) {
        return new ACommentQuery() {
            @Override
            public boolean test(Comment entity) {
                return entity.isAuthorEmail(authorEmail);
            }
            @Override
            public String toString() {
                return "Comment:byAuthorEmail";
            }
        }.list();
    }

    public static Set< Comment> listByAuthorNameVisible(final boolean authorNameVisible) {
        return new ACommentQuery() {
            @Override
            public boolean test(Comment entity) {
                return entity.isAuthorNameVisible(authorNameVisible);
            }
            @Override
            public String toString() {
                return "Comment:byAuthorNameVisible";
            }
        }.list();
    }

    public static Set< Comment> listByText(final java.lang.String text) {
        return new ACommentQuery() {
            @Override
            public boolean test(Comment entity) {
                return entity.isText(text);
            }
            @Override
            public String toString() {
                return "Comment:byText";
            }
        }.list();
    }

    public static Set< Comment> listByDateAndTime(final ilarkesto.core.time.DateAndTime dateAndTime) {
        return new ACommentQuery() {
            @Override
            public boolean test(Comment entity) {
                return entity.isDateAndTime(dateAndTime);
            }
            @Override
            public String toString() {
                return "Comment:byDateAndTime";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        parentBackReferencesCache.clear(getParentId());
        authorBackReferencesCache.clear(getAuthorId());
    }

    public abstract boolean isEditable();

    public static Set<Comment> listByIsEditable() {
        return new ACommentQuery() {
            @Override
            public boolean test(Comment entity) {
                return entity.isEditable();
            }
            @Override
            public String toString() {
                return "Comment:byIsEditable";
            }
        }.list();
    }

    public final boolean isNotEditable() {
        return !isEditable();
    }

    public static Set<Comment> listByIsNotEditable() {
        return new ACommentQuery() {
            @Override
            public boolean test(Comment entity) {
                return entity.isNotEditable();
            }
            @Override
            public String toString() {
                return "Comment:byIsNotEditable";
            }
        }.list();
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

    public final scrum.client.common.AScrumGwtEntity getParent() {
        try {
            return this.parentId == null ? null : (scrum.client.common.AScrumGwtEntity) AEntity.getById(this.parentId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Comment.parent");
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
    // - author
    // -----------------------------------------------------------

    private String authorId;

    public final String getAuthorId() {
        return this.authorId;
    }

    public final scrum.client.admin.User getAuthor() {
        try {
            return this.authorId == null ? null : (scrum.client.admin.User) AEntity.getById(this.authorId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Comment.author");
        }
    }

    public final void setAuthor(scrum.client.admin.User author) {
        author = prepareAuthor(author);
        if (isAuthor(author)) return;
        setAuthorId(author == null ? null : author.getId());
    }

    public final void setAuthorId(String id) {
        if (Utl.equals(authorId, id)) return;
        clearAuthorBackReferenceCache(id, this.authorId);
        this.authorId = id;
            updateLastModified();
            fireModified("authorId", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorId));
    }

    private void clearAuthorBackReferenceCache(String oldId, String newId) {
        authorBackReferencesCache.clear(oldId);
        authorBackReferencesCache.clear(newId);
    }

    private final void updateAuthorId(String id) {
        setAuthorId(id);
    }

    protected scrum.client.admin.User prepareAuthor(scrum.client.admin.User author) {
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

    public final boolean isAuthor(scrum.client.admin.User author) {
        if (this.authorId == null && author == null) return true;
        return author != null && author.getId().equals(this.authorId);
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
        // authorName = Str.removeUnreadableChars(authorName);
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
        // authorEmail = Str.removeUnreadableChars(authorEmail);
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
        // text = Str.removeUnreadableChars(text);
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

    // --- PLUGIN: GwtEntityPropertyEditorClassGeneratorPlugin ---

    private transient PublishedModel publishedModel;

    public PublishedModel getPublishedModel() {
        if (publishedModel == null) publishedModel = createPublishedModel();
        return publishedModel;
    }

    protected PublishedModel createPublishedModel() { return new PublishedModel(); }

    protected class PublishedModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Comment_published";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isPublished();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setPublished(value);
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

    private transient AuthorNameModel authorNameModel;

    public AuthorNameModel getAuthorNameModel() {
        if (authorNameModel == null) authorNameModel = createAuthorNameModel();
        return authorNameModel;
    }

    protected AuthorNameModel createAuthorNameModel() { return new AuthorNameModel(); }

    protected class AuthorNameModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Comment_authorName";
        }

        @Override
        public java.lang.String getValue() {
            return getAuthorName();
        }

        @Override
        public void setValue(java.lang.String value) {
            setAuthorName(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient AuthorEmailModel authorEmailModel;

    public AuthorEmailModel getAuthorEmailModel() {
        if (authorEmailModel == null) authorEmailModel = createAuthorEmailModel();
        return authorEmailModel;
    }

    protected AuthorEmailModel createAuthorEmailModel() { return new AuthorEmailModel(); }

    protected class AuthorEmailModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Comment_authorEmail";
        }

        @Override
        public java.lang.String getValue() {
            return getAuthorEmail();
        }

        @Override
        public void setValue(java.lang.String value) {
            setAuthorEmail(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    private transient AuthorNameVisibleModel authorNameVisibleModel;

    public AuthorNameVisibleModel getAuthorNameVisibleModel() {
        if (authorNameVisibleModel == null) authorNameVisibleModel = createAuthorNameVisibleModel();
        return authorNameVisibleModel;
    }

    protected AuthorNameVisibleModel createAuthorNameVisibleModel() { return new AuthorNameVisibleModel(); }

    protected class AuthorNameVisibleModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "Comment_authorNameVisible";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isAuthorNameVisible();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setAuthorNameVisible(value);
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

    private transient TextModel textModel;

    public TextModel getTextModel() {
        if (textModel == null) textModel = createTextModel();
        return textModel;
    }

    protected TextModel createTextModel() { return new TextModel(); }

    protected class TextModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Comment_text";
        }

        @Override
        public java.lang.String getValue() {
            return getText();
        }

        @Override
        public void setValue(java.lang.String value) {
            setText(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isEditable() { return GComment.this.isEditable(); }

        @Override
        public boolean isRichtext() { return true; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    private transient DateAndTimeModel dateAndTimeModel;

    public DateAndTimeModel getDateAndTimeModel() {
        if (dateAndTimeModel == null) dateAndTimeModel = createDateAndTimeModel();
        return dateAndTimeModel;
    }

    protected DateAndTimeModel createDateAndTimeModel() { return new DateAndTimeModel(); }

    protected class DateAndTimeModel extends ilarkesto.gwt.client.editor.ADateAndTimeEditorModel {

        @Override
        public String getId() {
            return "Comment_dateAndTime";
        }

        @Override
        public ilarkesto.core.time.DateAndTime getValue() {
            return getDateAndTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.DateAndTime value) {
            setDateAndTime(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.DateAndTime oldValue, ilarkesto.core.time.DateAndTime newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

}