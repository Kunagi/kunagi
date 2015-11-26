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

public abstract class GChatMessage
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<ChatMessage> {

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

    // --- AEntity ---

    public final scrum.server.collaboration.ChatMessageDao getDao() {
        return chatMessageDao;
    }

    protected void repairDeadDatob(ADatob datob) {
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

    public final scrum.server.project.Project getProject() {
        try {
            return this.projectId == null ? null : (scrum.server.project.Project) AEntity.getById(this.projectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("ChatMessage.project");
        }
    }

    public final void setProject(scrum.server.project.Project project) {
        project = prepareProject(project);
        if (isProject(project)) return;
        setProjectId(project == null ? null : project.getId());
    }

    public final void setProjectId(String id) {
        if (Utl.equals(projectId, id)) return;
        this.projectId = id;
            updateLastModified();
            fireModified("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
    }

    private final void updateProjectId(String id) {
        setProjectId(id);
    }

    protected scrum.server.project.Project prepareProject(scrum.server.project.Project project) {
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

    public final boolean isProject(scrum.server.project.Project project) {
        if (this.projectId == null && project == null) return true;
        return project != null && project.getId().equals(this.projectId);
    }

    protected final void updateProject(Object value) {
        setProject(value == null ? null : (scrum.server.project.Project)projectDao.getById((String)value));
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
            throw ex.setCallerInfo("ChatMessage.author");
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
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("authorId")) updateAuthorId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("text")) updateText(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("dateAndTime")) updateDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadProjectReference(entityId);
        repairDeadAuthorReference(entityId);
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


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.project.ProjectDao projectDao;

    public static final void setProjectDao(scrum.server.project.ProjectDao projectDao) {
        GChatMessage.projectDao = projectDao;
    }

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GChatMessage.userDao = userDao;
    }

    static scrum.server.collaboration.ChatMessageDao chatMessageDao;

    public static final void setChatMessageDao(scrum.server.collaboration.ChatMessageDao chatMessageDao) {
        GChatMessage.chatMessageDao = chatMessageDao;
    }

}