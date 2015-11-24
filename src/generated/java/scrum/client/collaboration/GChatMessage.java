// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: scrum.mda.KunagiModelApplication$1










package scrum.client.collaboration;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.AEntity;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GChatMessage
            extends scrum.client.common.AScrumGwtEntity
            implements java.lang.Comparable<ChatMessage> {

    public static class ChatMessageMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ChatMessage)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata author = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "author";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ChatMessage)entity).getAuthor();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata text = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "text";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ChatMessage)entity).getText();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata dateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "dateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((ChatMessage)entity).getDateAndTime();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,author
            ,text
            ,dateAndTime
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("author".equals(fieldName)) return author;
            if ("authorId".equals(fieldName)) return author;
            if ("text".equals(fieldName)) return text;
            if ("dateAndTime".equals(fieldName)) return dateAndTime;
            return null;
        }

    }

    public static transient final ChatMessageMetadata metadata = new ChatMessageMetadata();

    @Override
    public ChatMessageMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(ChatMessage.class);

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ChatMessage> projectBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ChatMessage>() {
    @Override
        protected Set<ChatMessage> loadById(final String id) {
        return new AChatMessageQuery() {
            @Override
            public boolean test(ChatMessage entity) {
                return id.equals(entity.getProjectId());
            }
            @Override
            public String toString() {
                return "ChatMessage:byProject";
            }
        }.list();
        }
    };

    public static Set< ChatMessage> listByProject(final scrum.client.project.Project project) {
        if (project == null) return new HashSet<ChatMessage>();
        return projectBackReferencesCache.getById(project.getId());
    }

    private static transient ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ChatMessage> authorBackReferencesCache = new ilarkesto.core.persistance.AEntitySetBackReferenceHelper<ChatMessage>() {
    @Override
        protected Set<ChatMessage> loadById(final String id) {
        return new AChatMessageQuery() {
            @Override
            public boolean test(ChatMessage entity) {
                return id.equals(entity.getAuthorId());
            }
            @Override
            public String toString() {
                return "ChatMessage:byAuthor";
            }
        }.list();
        }
    };

    public static Set< ChatMessage> listByAuthor(final scrum.client.admin.User author) {
        if (author == null) return new HashSet<ChatMessage>();
        return authorBackReferencesCache.getById(author.getId());
    }

    public static Set< ChatMessage> listByText(final java.lang.String text) {
        return new AChatMessageQuery() {
            @Override
            public boolean test(ChatMessage entity) {
                return entity.isText(text);
            }
            @Override
            public String toString() {
                return "ChatMessage:byText";
            }
        }.list();
    }

    public static Set< ChatMessage> listByDateAndTime(final ilarkesto.core.time.DateAndTime dateAndTime) {
        return new AChatMessageQuery() {
            @Override
            public boolean test(ChatMessage entity) {
                return entity.isDateAndTime(dateAndTime);
            }
            @Override
            public String toString() {
                return "ChatMessage:byDateAndTime";
            }
        }.list();
    }

    @Override
    protected void onAfterPersist() {
        super.onAfterPersist();
        projectBackReferencesCache.clear(getProjectId());
        authorBackReferencesCache.clear(getAuthorId());
    }

    public abstract static class AChatMessageQuery extends ilarkesto.core.persistance.AEntityQuery<ChatMessage> {
    @Override
        public Class<ChatMessage> getType() {
            return ChatMessage.class;
        }
    }

    public static Set<ChatMessage> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(ChatMessage.class).list();
    }

    public static ChatMessage getById(String id) {
        return (ChatMessage) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
        try { Utl.addIfNotNull(ret, getAuthor()); } catch(EntityDoesNotExistException ex) {}
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("authorId", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorId));
        properties.put("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
        properties.put("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
    }

    @Override
    public int compareTo(ChatMessage other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GChatMessage.class);

    public static final String TYPE = "ChatMessage";
    // -----------------------------------------------------------
    // - project
    // -----------------------------------------------------------

    private String projectId;

    public final String getProjectId() {
        return this.projectId;
    }

    public final scrum.client.project.Project getProject() {
        try {
            return this.projectId == null ? null : (scrum.client.project.Project) AEntity.getById(this.projectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("ChatMessage.project");
        }
    }

    public final void setProject(scrum.client.project.Project project) {
        project = prepareProject(project);
        if (isProject(project)) return;
        setProjectId(project == null ? null : project.getId());
    }

    public final void setProjectId(String id) {
        if (Utl.equals(projectId, id)) return;
        clearProjectBackReferenceCache(id, this.projectId);
        this.projectId = id;
            updateLastModified();
            fireModified("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
    }

    private void clearProjectBackReferenceCache(String oldId, String newId) {
        projectBackReferencesCache.clear(oldId);
        projectBackReferencesCache.clear(newId);
    }

    private final void updateProjectId(String id) {
        setProjectId(id);
    }

    protected scrum.client.project.Project prepareProject(scrum.client.project.Project project) {
        return project;
    }

    protected void repairDeadProjectReference(String entityId) {
        if (!isPersisted()) return;
        if (this.projectId == null || entityId.equals(this.projectId)) {
            repairMissingMaster();
        }
    }

    public final boolean isProjectSet() {
        return this.projectId != null;
    }

    public final boolean isProject(scrum.client.project.Project project) {
        if (this.projectId == null && project == null) return true;
        return project != null && project.getId().equals(this.projectId);
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
            throw ex.setCallerInfo("ChatMessage.author");
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
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("authorId")) updateAuthorId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("text")) updateText(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("dateAndTime")) updateDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
        }
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        if (!isProjectSet()) {
            repairMissingMaster();
        }
        try {
            getProject();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead project reference");
            repairDeadProjectReference(this.projectId);
        }
        try {
            getAuthor();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead author reference");
            repairDeadAuthorReference(this.authorId);
        }
    }

    // --- PLUGIN: GwtEntityPropertyEditorClassGeneratorPlugin ---

    private transient TextModel textModel;

    public TextModel getTextModel() {
        if (textModel == null) textModel = createTextModel();
        return textModel;
    }

    protected TextModel createTextModel() { return new TextModel(); }

    protected class TextModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "ChatMessage_text";
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
            return "ChatMessage_dateAndTime";
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