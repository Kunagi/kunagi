// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtDaoGenerator










package scrum.client;

import java.util.*;
import scrum.client.common.*;
import ilarkesto.gwt.client.*;

public abstract class GDao
            extends ilarkesto.gwt.client.AGwtDao {

    // --- BlogEntry ---

    protected Map<String, scrum.client.pr.BlogEntry> blogEntrys = new HashMap<String, scrum.client.pr.BlogEntry>();

    public final void clearBlogEntrys() {
        blogEntrys.clear();
    }

    public final boolean containsBlogEntry(scrum.client.pr.BlogEntry blogEntry) {
        return blogEntrys.containsKey(blogEntry.getId());
    }

    public final void deleteBlogEntry(scrum.client.pr.BlogEntry blogEntry) {
        blogEntrys.remove(blogEntry.getId());
        entityDeleted(blogEntry);
    }

    public final void createBlogEntry(scrum.client.pr.BlogEntry blogEntry, Runnable successAction) {
        blogEntrys.put(blogEntry.getId(), blogEntry);
        entityCreated(blogEntry, successAction);
    }

    public final void createBlogEntry(scrum.client.pr.BlogEntry blogEntry) {
        blogEntrys.put(blogEntry.getId(), blogEntry);
        entityCreated(blogEntry, null);
    }

    protected scrum.client.pr.BlogEntry updateBlogEntry(Map data) {
        String id = (String) data.get("id");
        scrum.client.pr.BlogEntry entity = blogEntrys.get(id);
        if (entity == null) {
            entity = new scrum.client.pr.BlogEntry(data);
            blogEntrys.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.pr.BlogEntry getBlogEntry(String id) {
        scrum.client.pr.BlogEntry ret = blogEntrys.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.pr.BlogEntry> getBlogEntrys(Collection<String> ids) {
        Set<scrum.client.pr.BlogEntry> ret = new HashSet<scrum.client.pr.BlogEntry>();
        for (String id : ids) {
            scrum.client.pr.BlogEntry entity = blogEntrys.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.pr.BlogEntry> getBlogEntrys() {
        return new ArrayList<scrum.client.pr.BlogEntry>(blogEntrys.values());
    }

    public final List<scrum.client.pr.BlogEntry> getBlogEntrysByProject(scrum.client.project.Project project) {
        List<scrum.client.pr.BlogEntry> ret = new ArrayList<scrum.client.pr.BlogEntry>();
        for (scrum.client.pr.BlogEntry entity : blogEntrys.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.pr.BlogEntry> getBlogEntrysByNumber(int number) {
        List<scrum.client.pr.BlogEntry> ret = new ArrayList<scrum.client.pr.BlogEntry>();
        for (scrum.client.pr.BlogEntry entity : blogEntrys.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.pr.BlogEntry> getBlogEntrysByAuthor(scrum.client.admin.User author) {
        List<scrum.client.pr.BlogEntry> ret = new ArrayList<scrum.client.pr.BlogEntry>();
        for (scrum.client.pr.BlogEntry entity : blogEntrys.values()) {
            if (entity.containsAuthor(author)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.pr.BlogEntry> getBlogEntrysByTitle(java.lang.String title) {
        List<scrum.client.pr.BlogEntry> ret = new ArrayList<scrum.client.pr.BlogEntry>();
        for (scrum.client.pr.BlogEntry entity : blogEntrys.values()) {
            if (entity.isTitle(title)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.pr.BlogEntry> getBlogEntrysByText(java.lang.String text) {
        List<scrum.client.pr.BlogEntry> ret = new ArrayList<scrum.client.pr.BlogEntry>();
        for (scrum.client.pr.BlogEntry entity : blogEntrys.values()) {
            if (entity.isText(text)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.pr.BlogEntry> getBlogEntrysByDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        List<scrum.client.pr.BlogEntry> ret = new ArrayList<scrum.client.pr.BlogEntry>();
        for (scrum.client.pr.BlogEntry entity : blogEntrys.values()) {
            if (entity.isDateAndTime(dateAndTime)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.pr.BlogEntry> getBlogEntrysByRelease(scrum.client.release.Release release) {
        List<scrum.client.pr.BlogEntry> ret = new ArrayList<scrum.client.pr.BlogEntry>();
        for (scrum.client.pr.BlogEntry entity : blogEntrys.values()) {
            if (entity.containsRelease(release)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.pr.BlogEntry> getBlogEntrysByPublished(boolean published) {
        List<scrum.client.pr.BlogEntry> ret = new ArrayList<scrum.client.pr.BlogEntry>();
        for (scrum.client.pr.BlogEntry entity : blogEntrys.values()) {
            if (entity.isPublished(published)) ret.add(entity);
        }
        return ret;
    }

    // --- Change ---

    protected Map<String, scrum.client.journal.Change> changes = new HashMap<String, scrum.client.journal.Change>();

    public final void clearChanges() {
        changes.clear();
    }

    public final boolean containsChange(scrum.client.journal.Change change) {
        return changes.containsKey(change.getId());
    }

    public final void deleteChange(scrum.client.journal.Change change) {
        changes.remove(change.getId());
        entityDeleted(change);
    }

    public final void createChange(scrum.client.journal.Change change, Runnable successAction) {
        changes.put(change.getId(), change);
        entityCreated(change, successAction);
    }

    public final void createChange(scrum.client.journal.Change change) {
        changes.put(change.getId(), change);
        entityCreated(change, null);
    }

    protected scrum.client.journal.Change updateChange(Map data) {
        String id = (String) data.get("id");
        scrum.client.journal.Change entity = changes.get(id);
        if (entity == null) {
            entity = new scrum.client.journal.Change(data);
            changes.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.journal.Change getChange(String id) {
        scrum.client.journal.Change ret = changes.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.journal.Change> getChanges(Collection<String> ids) {
        Set<scrum.client.journal.Change> ret = new HashSet<scrum.client.journal.Change>();
        for (String id : ids) {
            scrum.client.journal.Change entity = changes.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.Change> getChanges() {
        return new ArrayList<scrum.client.journal.Change>(changes.values());
    }

    public final List<scrum.client.journal.Change> getChangesByParent(ilarkesto.gwt.client.AGwtEntity parent) {
        List<scrum.client.journal.Change> ret = new ArrayList<scrum.client.journal.Change>();
        for (scrum.client.journal.Change entity : changes.values()) {
            if (entity.isParent(parent)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.Change> getChangesByUser(scrum.client.admin.User user) {
        List<scrum.client.journal.Change> ret = new ArrayList<scrum.client.journal.Change>();
        for (scrum.client.journal.Change entity : changes.values()) {
            if (entity.isUser(user)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.Change> getChangesByDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        List<scrum.client.journal.Change> ret = new ArrayList<scrum.client.journal.Change>();
        for (scrum.client.journal.Change entity : changes.values()) {
            if (entity.isDateAndTime(dateAndTime)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.Change> getChangesByKey(java.lang.String key) {
        List<scrum.client.journal.Change> ret = new ArrayList<scrum.client.journal.Change>();
        for (scrum.client.journal.Change entity : changes.values()) {
            if (entity.isKey(key)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.Change> getChangesByOldValue(java.lang.String oldValue) {
        List<scrum.client.journal.Change> ret = new ArrayList<scrum.client.journal.Change>();
        for (scrum.client.journal.Change entity : changes.values()) {
            if (entity.isOldValue(oldValue)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.Change> getChangesByNewValue(java.lang.String newValue) {
        List<scrum.client.journal.Change> ret = new ArrayList<scrum.client.journal.Change>();
        for (scrum.client.journal.Change entity : changes.values()) {
            if (entity.isNewValue(newValue)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.Change> getChangesByComment(java.lang.String comment) {
        List<scrum.client.journal.Change> ret = new ArrayList<scrum.client.journal.Change>();
        for (scrum.client.journal.Change entity : changes.values()) {
            if (entity.isComment(comment)) ret.add(entity);
        }
        return ret;
    }

    // --- ChatMessage ---

    protected Map<String, scrum.client.collaboration.ChatMessage> chatMessages = new HashMap<String, scrum.client.collaboration.ChatMessage>();

    public final void clearChatMessages() {
        chatMessages.clear();
    }

    public final boolean containsChatMessage(scrum.client.collaboration.ChatMessage chatMessage) {
        return chatMessages.containsKey(chatMessage.getId());
    }

    public final void deleteChatMessage(scrum.client.collaboration.ChatMessage chatMessage) {
        chatMessages.remove(chatMessage.getId());
        entityDeleted(chatMessage);
    }

    public final void createChatMessage(scrum.client.collaboration.ChatMessage chatMessage, Runnable successAction) {
        chatMessages.put(chatMessage.getId(), chatMessage);
        entityCreated(chatMessage, successAction);
    }

    public final void createChatMessage(scrum.client.collaboration.ChatMessage chatMessage) {
        chatMessages.put(chatMessage.getId(), chatMessage);
        entityCreated(chatMessage, null);
    }

    protected scrum.client.collaboration.ChatMessage updateChatMessage(Map data) {
        String id = (String) data.get("id");
        scrum.client.collaboration.ChatMessage entity = chatMessages.get(id);
        if (entity == null) {
            entity = new scrum.client.collaboration.ChatMessage(data);
            chatMessages.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.collaboration.ChatMessage getChatMessage(String id) {
        scrum.client.collaboration.ChatMessage ret = chatMessages.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.collaboration.ChatMessage> getChatMessages(Collection<String> ids) {
        Set<scrum.client.collaboration.ChatMessage> ret = new HashSet<scrum.client.collaboration.ChatMessage>();
        for (String id : ids) {
            scrum.client.collaboration.ChatMessage entity = chatMessages.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.ChatMessage> getChatMessages() {
        return new ArrayList<scrum.client.collaboration.ChatMessage>(chatMessages.values());
    }

    public final List<scrum.client.collaboration.ChatMessage> getChatMessagesByProject(scrum.client.project.Project project) {
        List<scrum.client.collaboration.ChatMessage> ret = new ArrayList<scrum.client.collaboration.ChatMessage>();
        for (scrum.client.collaboration.ChatMessage entity : chatMessages.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.ChatMessage> getChatMessagesByAuthor(scrum.client.admin.User author) {
        List<scrum.client.collaboration.ChatMessage> ret = new ArrayList<scrum.client.collaboration.ChatMessage>();
        for (scrum.client.collaboration.ChatMessage entity : chatMessages.values()) {
            if (entity.isAuthor(author)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.ChatMessage> getChatMessagesByText(java.lang.String text) {
        List<scrum.client.collaboration.ChatMessage> ret = new ArrayList<scrum.client.collaboration.ChatMessage>();
        for (scrum.client.collaboration.ChatMessage entity : chatMessages.values()) {
            if (entity.isText(text)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.ChatMessage> getChatMessagesByDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        List<scrum.client.collaboration.ChatMessage> ret = new ArrayList<scrum.client.collaboration.ChatMessage>();
        for (scrum.client.collaboration.ChatMessage entity : chatMessages.values()) {
            if (entity.isDateAndTime(dateAndTime)) ret.add(entity);
        }
        return ret;
    }

    // --- Comment ---

    protected Map<String, scrum.client.collaboration.Comment> comments = new HashMap<String, scrum.client.collaboration.Comment>();

    public final void clearComments() {
        comments.clear();
    }

    public final boolean containsComment(scrum.client.collaboration.Comment comment) {
        return comments.containsKey(comment.getId());
    }

    public final void deleteComment(scrum.client.collaboration.Comment comment) {
        comments.remove(comment.getId());
        entityDeleted(comment);
    }

    public final void createComment(scrum.client.collaboration.Comment comment, Runnable successAction) {
        comments.put(comment.getId(), comment);
        entityCreated(comment, successAction);
    }

    public final void createComment(scrum.client.collaboration.Comment comment) {
        comments.put(comment.getId(), comment);
        entityCreated(comment, null);
    }

    protected scrum.client.collaboration.Comment updateComment(Map data) {
        String id = (String) data.get("id");
        scrum.client.collaboration.Comment entity = comments.get(id);
        if (entity == null) {
            entity = new scrum.client.collaboration.Comment(data);
            comments.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.collaboration.Comment getComment(String id) {
        scrum.client.collaboration.Comment ret = comments.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.collaboration.Comment> getComments(Collection<String> ids) {
        Set<scrum.client.collaboration.Comment> ret = new HashSet<scrum.client.collaboration.Comment>();
        for (String id : ids) {
            scrum.client.collaboration.Comment entity = comments.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Comment> getComments() {
        return new ArrayList<scrum.client.collaboration.Comment>(comments.values());
    }

    public final List<scrum.client.collaboration.Comment> getCommentsByParent(ilarkesto.gwt.client.AGwtEntity parent) {
        List<scrum.client.collaboration.Comment> ret = new ArrayList<scrum.client.collaboration.Comment>();
        for (scrum.client.collaboration.Comment entity : comments.values()) {
            if (entity.isParent(parent)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Comment> getCommentsByAuthor(scrum.client.admin.User author) {
        List<scrum.client.collaboration.Comment> ret = new ArrayList<scrum.client.collaboration.Comment>();
        for (scrum.client.collaboration.Comment entity : comments.values()) {
            if (entity.isAuthor(author)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Comment> getCommentsByPublished(boolean published) {
        List<scrum.client.collaboration.Comment> ret = new ArrayList<scrum.client.collaboration.Comment>();
        for (scrum.client.collaboration.Comment entity : comments.values()) {
            if (entity.isPublished(published)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Comment> getCommentsByAuthorName(java.lang.String authorName) {
        List<scrum.client.collaboration.Comment> ret = new ArrayList<scrum.client.collaboration.Comment>();
        for (scrum.client.collaboration.Comment entity : comments.values()) {
            if (entity.isAuthorName(authorName)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Comment> getCommentsByAuthorEmail(java.lang.String authorEmail) {
        List<scrum.client.collaboration.Comment> ret = new ArrayList<scrum.client.collaboration.Comment>();
        for (scrum.client.collaboration.Comment entity : comments.values()) {
            if (entity.isAuthorEmail(authorEmail)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Comment> getCommentsByAuthorNameVisible(boolean authorNameVisible) {
        List<scrum.client.collaboration.Comment> ret = new ArrayList<scrum.client.collaboration.Comment>();
        for (scrum.client.collaboration.Comment entity : comments.values()) {
            if (entity.isAuthorNameVisible(authorNameVisible)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Comment> getCommentsByText(java.lang.String text) {
        List<scrum.client.collaboration.Comment> ret = new ArrayList<scrum.client.collaboration.Comment>();
        for (scrum.client.collaboration.Comment entity : comments.values()) {
            if (entity.isText(text)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Comment> getCommentsByDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        List<scrum.client.collaboration.Comment> ret = new ArrayList<scrum.client.collaboration.Comment>();
        for (scrum.client.collaboration.Comment entity : comments.values()) {
            if (entity.isDateAndTime(dateAndTime)) ret.add(entity);
        }
        return ret;
    }

    // --- Emoticon ---

    protected Map<String, scrum.client.collaboration.Emoticon> emoticons = new HashMap<String, scrum.client.collaboration.Emoticon>();

    public final void clearEmoticons() {
        emoticons.clear();
    }

    public final boolean containsEmoticon(scrum.client.collaboration.Emoticon emoticon) {
        return emoticons.containsKey(emoticon.getId());
    }

    public final void deleteEmoticon(scrum.client.collaboration.Emoticon emoticon) {
        emoticons.remove(emoticon.getId());
        entityDeleted(emoticon);
    }

    public final void createEmoticon(scrum.client.collaboration.Emoticon emoticon, Runnable successAction) {
        emoticons.put(emoticon.getId(), emoticon);
        entityCreated(emoticon, successAction);
    }

    public final void createEmoticon(scrum.client.collaboration.Emoticon emoticon) {
        emoticons.put(emoticon.getId(), emoticon);
        entityCreated(emoticon, null);
    }

    protected scrum.client.collaboration.Emoticon updateEmoticon(Map data) {
        String id = (String) data.get("id");
        scrum.client.collaboration.Emoticon entity = emoticons.get(id);
        if (entity == null) {
            entity = new scrum.client.collaboration.Emoticon(data);
            emoticons.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.collaboration.Emoticon getEmoticon(String id) {
        scrum.client.collaboration.Emoticon ret = emoticons.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.collaboration.Emoticon> getEmoticons(Collection<String> ids) {
        Set<scrum.client.collaboration.Emoticon> ret = new HashSet<scrum.client.collaboration.Emoticon>();
        for (String id : ids) {
            scrum.client.collaboration.Emoticon entity = emoticons.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Emoticon> getEmoticons() {
        return new ArrayList<scrum.client.collaboration.Emoticon>(emoticons.values());
    }

    public final List<scrum.client.collaboration.Emoticon> getEmoticonsByParent(ilarkesto.gwt.client.AGwtEntity parent) {
        List<scrum.client.collaboration.Emoticon> ret = new ArrayList<scrum.client.collaboration.Emoticon>();
        for (scrum.client.collaboration.Emoticon entity : emoticons.values()) {
            if (entity.isParent(parent)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Emoticon> getEmoticonsByOwner(scrum.client.admin.User owner) {
        List<scrum.client.collaboration.Emoticon> ret = new ArrayList<scrum.client.collaboration.Emoticon>();
        for (scrum.client.collaboration.Emoticon entity : emoticons.values()) {
            if (entity.isOwner(owner)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Emoticon> getEmoticonsByEmotion(java.lang.String emotion) {
        List<scrum.client.collaboration.Emoticon> ret = new ArrayList<scrum.client.collaboration.Emoticon>();
        for (scrum.client.collaboration.Emoticon entity : emoticons.values()) {
            if (entity.isEmotion(emotion)) ret.add(entity);
        }
        return ret;
    }

    // --- File ---

    protected Map<String, scrum.client.files.File> files = new HashMap<String, scrum.client.files.File>();

    public final void clearFiles() {
        files.clear();
    }

    public final boolean containsFile(scrum.client.files.File file) {
        return files.containsKey(file.getId());
    }

    public final void deleteFile(scrum.client.files.File file) {
        files.remove(file.getId());
        entityDeleted(file);
    }

    public final void createFile(scrum.client.files.File file, Runnable successAction) {
        files.put(file.getId(), file);
        entityCreated(file, successAction);
    }

    public final void createFile(scrum.client.files.File file) {
        files.put(file.getId(), file);
        entityCreated(file, null);
    }

    protected scrum.client.files.File updateFile(Map data) {
        String id = (String) data.get("id");
        scrum.client.files.File entity = files.get(id);
        if (entity == null) {
            entity = new scrum.client.files.File(data);
            files.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.files.File getFile(String id) {
        scrum.client.files.File ret = files.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.files.File> getFiles(Collection<String> ids) {
        Set<scrum.client.files.File> ret = new HashSet<scrum.client.files.File>();
        for (String id : ids) {
            scrum.client.files.File entity = files.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.files.File> getFiles() {
        return new ArrayList<scrum.client.files.File>(files.values());
    }

    public final List<scrum.client.files.File> getFilesByProject(scrum.client.project.Project project) {
        List<scrum.client.files.File> ret = new ArrayList<scrum.client.files.File>();
        for (scrum.client.files.File entity : files.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.files.File> getFilesByFilename(java.lang.String filename) {
        List<scrum.client.files.File> ret = new ArrayList<scrum.client.files.File>();
        for (scrum.client.files.File entity : files.values()) {
            if (entity.isFilename(filename)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.files.File> getFilesByUploadTime(ilarkesto.core.time.DateAndTime uploadTime) {
        List<scrum.client.files.File> ret = new ArrayList<scrum.client.files.File>();
        for (scrum.client.files.File entity : files.values()) {
            if (entity.isUploadTime(uploadTime)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.files.File> getFilesByLabel(java.lang.String label) {
        List<scrum.client.files.File> ret = new ArrayList<scrum.client.files.File>();
        for (scrum.client.files.File entity : files.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.files.File> getFilesByNumber(int number) {
        List<scrum.client.files.File> ret = new ArrayList<scrum.client.files.File>();
        for (scrum.client.files.File entity : files.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.files.File> getFilesByNote(java.lang.String note) {
        List<scrum.client.files.File> ret = new ArrayList<scrum.client.files.File>();
        for (scrum.client.files.File entity : files.values()) {
            if (entity.isNote(note)) ret.add(entity);
        }
        return ret;
    }

    // --- Impediment ---

    protected Map<String, scrum.client.impediments.Impediment> impediments = new HashMap<String, scrum.client.impediments.Impediment>();

    public final void clearImpediments() {
        impediments.clear();
    }

    public final boolean containsImpediment(scrum.client.impediments.Impediment impediment) {
        return impediments.containsKey(impediment.getId());
    }

    public final void deleteImpediment(scrum.client.impediments.Impediment impediment) {
        impediments.remove(impediment.getId());
        entityDeleted(impediment);
    }

    public final void createImpediment(scrum.client.impediments.Impediment impediment, Runnable successAction) {
        impediments.put(impediment.getId(), impediment);
        entityCreated(impediment, successAction);
    }

    public final void createImpediment(scrum.client.impediments.Impediment impediment) {
        impediments.put(impediment.getId(), impediment);
        entityCreated(impediment, null);
    }

    protected scrum.client.impediments.Impediment updateImpediment(Map data) {
        String id = (String) data.get("id");
        scrum.client.impediments.Impediment entity = impediments.get(id);
        if (entity == null) {
            entity = new scrum.client.impediments.Impediment(data);
            impediments.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.impediments.Impediment getImpediment(String id) {
        scrum.client.impediments.Impediment ret = impediments.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.impediments.Impediment> getImpediments(Collection<String> ids) {
        Set<scrum.client.impediments.Impediment> ret = new HashSet<scrum.client.impediments.Impediment>();
        for (String id : ids) {
            scrum.client.impediments.Impediment entity = impediments.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.impediments.Impediment> getImpediments() {
        return new ArrayList<scrum.client.impediments.Impediment>(impediments.values());
    }

    public final List<scrum.client.impediments.Impediment> getImpedimentsByProject(scrum.client.project.Project project) {
        List<scrum.client.impediments.Impediment> ret = new ArrayList<scrum.client.impediments.Impediment>();
        for (scrum.client.impediments.Impediment entity : impediments.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.impediments.Impediment> getImpedimentsByNumber(int number) {
        List<scrum.client.impediments.Impediment> ret = new ArrayList<scrum.client.impediments.Impediment>();
        for (scrum.client.impediments.Impediment entity : impediments.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.impediments.Impediment> getImpedimentsByLabel(java.lang.String label) {
        List<scrum.client.impediments.Impediment> ret = new ArrayList<scrum.client.impediments.Impediment>();
        for (scrum.client.impediments.Impediment entity : impediments.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.impediments.Impediment> getImpedimentsByDate(ilarkesto.core.time.Date date) {
        List<scrum.client.impediments.Impediment> ret = new ArrayList<scrum.client.impediments.Impediment>();
        for (scrum.client.impediments.Impediment entity : impediments.values()) {
            if (entity.isDate(date)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.impediments.Impediment> getImpedimentsByDescription(java.lang.String description) {
        List<scrum.client.impediments.Impediment> ret = new ArrayList<scrum.client.impediments.Impediment>();
        for (scrum.client.impediments.Impediment entity : impediments.values()) {
            if (entity.isDescription(description)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.impediments.Impediment> getImpedimentsBySolution(java.lang.String solution) {
        List<scrum.client.impediments.Impediment> ret = new ArrayList<scrum.client.impediments.Impediment>();
        for (scrum.client.impediments.Impediment entity : impediments.values()) {
            if (entity.isSolution(solution)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.impediments.Impediment> getImpedimentsByClosed(boolean closed) {
        List<scrum.client.impediments.Impediment> ret = new ArrayList<scrum.client.impediments.Impediment>();
        for (scrum.client.impediments.Impediment entity : impediments.values()) {
            if (entity.isClosed(closed)) ret.add(entity);
        }
        return ret;
    }

    // --- Issue ---

    protected Map<String, scrum.client.issues.Issue> issues = new HashMap<String, scrum.client.issues.Issue>();

    public final void clearIssues() {
        issues.clear();
    }

    public final boolean containsIssue(scrum.client.issues.Issue issue) {
        return issues.containsKey(issue.getId());
    }

    public final void deleteIssue(scrum.client.issues.Issue issue) {
        issues.remove(issue.getId());
        entityDeleted(issue);
    }

    public final void createIssue(scrum.client.issues.Issue issue, Runnable successAction) {
        issues.put(issue.getId(), issue);
        entityCreated(issue, successAction);
    }

    public final void createIssue(scrum.client.issues.Issue issue) {
        issues.put(issue.getId(), issue);
        entityCreated(issue, null);
    }

    protected scrum.client.issues.Issue updateIssue(Map data) {
        String id = (String) data.get("id");
        scrum.client.issues.Issue entity = issues.get(id);
        if (entity == null) {
            entity = new scrum.client.issues.Issue(data);
            issues.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.issues.Issue getIssue(String id) {
        scrum.client.issues.Issue ret = issues.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.issues.Issue> getIssues(Collection<String> ids) {
        Set<scrum.client.issues.Issue> ret = new HashSet<scrum.client.issues.Issue>();
        for (String id : ids) {
            scrum.client.issues.Issue entity = issues.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssues() {
        return new ArrayList<scrum.client.issues.Issue>(issues.values());
    }

    public final List<scrum.client.issues.Issue> getIssuesByProject(scrum.client.project.Project project) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByStory(scrum.client.project.Requirement story) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isStory(story)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByNumber(int number) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByType(java.lang.String type) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isType(type)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByDate(ilarkesto.core.time.DateAndTime date) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isDate(date)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByCreator(scrum.client.admin.User creator) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isCreator(creator)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByLabel(java.lang.String label) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByDescription(java.lang.String description) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isDescription(description)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByStatement(java.lang.String statement) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isStatement(statement)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByIssuerName(java.lang.String issuerName) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isIssuerName(issuerName)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByIssuerEmail(java.lang.String issuerEmail) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isIssuerEmail(issuerEmail)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByAcceptDate(ilarkesto.core.time.Date acceptDate) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isAcceptDate(acceptDate)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByUrgent(boolean urgent) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isUrgent(urgent)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesBySeverity(int severity) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isSeverity(severity)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByOwner(scrum.client.admin.User owner) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isOwner(owner)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByFixDate(ilarkesto.core.time.Date fixDate) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isFixDate(fixDate)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByCloseDate(ilarkesto.core.time.Date closeDate) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isCloseDate(closeDate)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesBySuspendedUntilDate(ilarkesto.core.time.Date suspendedUntilDate) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isSuspendedUntilDate(suspendedUntilDate)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByAffectedRelease(scrum.client.release.Release affectedRelease) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.containsAffectedRelease(affectedRelease)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByFixRelease(scrum.client.release.Release fixRelease) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.containsFixRelease(fixRelease)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByPublished(boolean published) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.isPublished(published)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.issues.Issue> getIssuesByTheme(java.lang.String theme) {
        List<scrum.client.issues.Issue> ret = new ArrayList<scrum.client.issues.Issue>();
        for (scrum.client.issues.Issue entity : issues.values()) {
            if (entity.containsTheme(theme)) ret.add(entity);
        }
        return ret;
    }

    // --- Project ---

    protected Map<String, scrum.client.project.Project> projects = new HashMap<String, scrum.client.project.Project>();

    public final void clearProjects() {
        projects.clear();
    }

    public final boolean containsProject(scrum.client.project.Project project) {
        return projects.containsKey(project.getId());
    }

    public final void deleteProject(scrum.client.project.Project project) {
        projects.remove(project.getId());
        entityDeleted(project);
    }

    public final void createProject(scrum.client.project.Project project, Runnable successAction) {
        projects.put(project.getId(), project);
        entityCreated(project, successAction);
    }

    public final void createProject(scrum.client.project.Project project) {
        projects.put(project.getId(), project);
        entityCreated(project, null);
    }

    protected scrum.client.project.Project updateProject(Map data) {
        String id = (String) data.get("id");
        scrum.client.project.Project entity = projects.get(id);
        if (entity == null) {
            entity = new scrum.client.project.Project(data);
            projects.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.project.Project getProject(String id) {
        scrum.client.project.Project ret = projects.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.project.Project> getProjects(Collection<String> ids) {
        Set<scrum.client.project.Project> ret = new HashSet<scrum.client.project.Project>();
        for (String id : ids) {
            scrum.client.project.Project entity = projects.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjects() {
        return new ArrayList<scrum.client.project.Project>(projects.values());
    }

    public final scrum.client.project.Project getProjectByLabel(java.lang.String label) {
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLabel(label)) return entity;
        }
        return null;
    }

    public final List<scrum.client.project.Project> getProjectsByVision(java.lang.String vision) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isVision(vision)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByProductLabel(java.lang.String productLabel) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isProductLabel(productLabel)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByShortDescription(java.lang.String shortDescription) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isShortDescription(shortDescription)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByDescription(java.lang.String description) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isDescription(description)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLongDescription(java.lang.String longDescription) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLongDescription(longDescription)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByBegin(ilarkesto.core.time.Date begin) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isBegin(begin)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByEnd(ilarkesto.core.time.Date end) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isEnd(end)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByParticipant(scrum.client.admin.User participant) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.containsParticipant(participant)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByAdmin(scrum.client.admin.User admin) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.containsAdmin(admin)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByProductOwner(scrum.client.admin.User productOwner) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.containsProductOwner(productOwner)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByScrumMaster(scrum.client.admin.User scrumMaster) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.containsScrumMaster(scrumMaster)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByTeamMember(scrum.client.admin.User teamMember) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.containsTeamMember(teamMember)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByCurrentSprint(scrum.client.sprint.Sprint currentSprint) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isCurrentSprint(currentSprint)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByNextSprint(scrum.client.sprint.Sprint nextSprint) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isNextSprint(nextSprint)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByVelocity(java.lang.Integer velocity) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isVelocity(velocity)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByRequirementsOrderId(java.lang.String requirementsOrderId) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.containsRequirementsOrderId(requirementsOrderId)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByUrgentIssuesOrderId(java.lang.String urgentIssuesOrderId) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.containsUrgentIssuesOrderId(urgentIssuesOrderId)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastSprintNumber(int lastSprintNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastSprintNumber(lastSprintNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastTaskNumber(int lastTaskNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastTaskNumber(lastTaskNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastRequirementNumber(int lastRequirementNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastRequirementNumber(lastRequirementNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastQualityNumber(int lastQualityNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastQualityNumber(lastQualityNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastRiskNumber(int lastRiskNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastRiskNumber(lastRiskNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastIssueNumber(int lastIssueNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastIssueNumber(lastIssueNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastImpedimentNumber(int lastImpedimentNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastImpedimentNumber(lastImpedimentNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastFileNumber(int lastFileNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastFileNumber(lastFileNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastSubjectNumber(int lastSubjectNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastSubjectNumber(lastSubjectNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastEventNumber(int lastEventNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastEventNumber(lastEventNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastReleaseNumber(int lastReleaseNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastReleaseNumber(lastReleaseNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastBlogEntryNumber(int lastBlogEntryNumber) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastBlogEntryNumber(lastBlogEntryNumber)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByPunishmentUnit(java.lang.String punishmentUnit) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isPunishmentUnit(punishmentUnit)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByPunishmentFactor(int punishmentFactor) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isPunishmentFactor(punishmentFactor)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByHomepageDir(java.lang.String homepageDir) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isHomepageDir(homepageDir)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByHomepageUrl(java.lang.String homepageUrl) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isHomepageUrl(homepageUrl)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByAutoUpdateHomepage(boolean autoUpdateHomepage) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isAutoUpdateHomepage(autoUpdateHomepage)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByReleaseScriptPath(java.lang.String releaseScriptPath) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isReleaseScriptPath(releaseScriptPath)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsBySupportEmail(java.lang.String supportEmail) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isSupportEmail(supportEmail)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByIssueReplyTemplate(java.lang.String issueReplyTemplate) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isIssueReplyTemplate(issueReplyTemplate)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsBySubscriberNotificationTemplate(java.lang.String subscriberNotificationTemplate) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isSubscriberNotificationTemplate(subscriberNotificationTemplate)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByLastOpenedDateAndTime(ilarkesto.core.time.DateAndTime lastOpenedDateAndTime) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isLastOpenedDateAndTime(lastOpenedDateAndTime)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByFreeDays(int freeDays) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isFreeDays(freeDays)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Project> getProjectsByReleasingInfo(java.lang.String releasingInfo) {
        List<scrum.client.project.Project> ret = new ArrayList<scrum.client.project.Project>();
        for (scrum.client.project.Project entity : projects.values()) {
            if (entity.isReleasingInfo(releasingInfo)) ret.add(entity);
        }
        return ret;
    }

    // --- ProjectEvent ---

    protected Map<String, scrum.client.journal.ProjectEvent> projectEvents = new HashMap<String, scrum.client.journal.ProjectEvent>();

    public final void clearProjectEvents() {
        projectEvents.clear();
    }

    public final boolean containsProjectEvent(scrum.client.journal.ProjectEvent projectEvent) {
        return projectEvents.containsKey(projectEvent.getId());
    }

    public final void deleteProjectEvent(scrum.client.journal.ProjectEvent projectEvent) {
        projectEvents.remove(projectEvent.getId());
        entityDeleted(projectEvent);
    }

    public final void createProjectEvent(scrum.client.journal.ProjectEvent projectEvent, Runnable successAction) {
        projectEvents.put(projectEvent.getId(), projectEvent);
        entityCreated(projectEvent, successAction);
    }

    public final void createProjectEvent(scrum.client.journal.ProjectEvent projectEvent) {
        projectEvents.put(projectEvent.getId(), projectEvent);
        entityCreated(projectEvent, null);
    }

    protected scrum.client.journal.ProjectEvent updateProjectEvent(Map data) {
        String id = (String) data.get("id");
        scrum.client.journal.ProjectEvent entity = projectEvents.get(id);
        if (entity == null) {
            entity = new scrum.client.journal.ProjectEvent(data);
            projectEvents.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.journal.ProjectEvent getProjectEvent(String id) {
        scrum.client.journal.ProjectEvent ret = projectEvents.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.journal.ProjectEvent> getProjectEvents(Collection<String> ids) {
        Set<scrum.client.journal.ProjectEvent> ret = new HashSet<scrum.client.journal.ProjectEvent>();
        for (String id : ids) {
            scrum.client.journal.ProjectEvent entity = projectEvents.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.ProjectEvent> getProjectEvents() {
        return new ArrayList<scrum.client.journal.ProjectEvent>(projectEvents.values());
    }

    public final List<scrum.client.journal.ProjectEvent> getProjectEventsByProject(scrum.client.project.Project project) {
        List<scrum.client.journal.ProjectEvent> ret = new ArrayList<scrum.client.journal.ProjectEvent>();
        for (scrum.client.journal.ProjectEvent entity : projectEvents.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.ProjectEvent> getProjectEventsByLabel(java.lang.String label) {
        List<scrum.client.journal.ProjectEvent> ret = new ArrayList<scrum.client.journal.ProjectEvent>();
        for (scrum.client.journal.ProjectEvent entity : projectEvents.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.ProjectEvent> getProjectEventsBySubject(ilarkesto.gwt.client.AGwtEntity subject) {
        List<scrum.client.journal.ProjectEvent> ret = new ArrayList<scrum.client.journal.ProjectEvent>();
        for (scrum.client.journal.ProjectEvent entity : projectEvents.values()) {
            if (entity.isSubject(subject)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.journal.ProjectEvent> getProjectEventsByDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        List<scrum.client.journal.ProjectEvent> ret = new ArrayList<scrum.client.journal.ProjectEvent>();
        for (scrum.client.journal.ProjectEvent entity : projectEvents.values()) {
            if (entity.isDateAndTime(dateAndTime)) ret.add(entity);
        }
        return ret;
    }

    // --- ProjectUserConfig ---

    protected Map<String, scrum.client.admin.ProjectUserConfig> projectUserConfigs = new HashMap<String, scrum.client.admin.ProjectUserConfig>();

    public final void clearProjectUserConfigs() {
        projectUserConfigs.clear();
    }

    public final boolean containsProjectUserConfig(scrum.client.admin.ProjectUserConfig projectUserConfig) {
        return projectUserConfigs.containsKey(projectUserConfig.getId());
    }

    public final void deleteProjectUserConfig(scrum.client.admin.ProjectUserConfig projectUserConfig) {
        projectUserConfigs.remove(projectUserConfig.getId());
        entityDeleted(projectUserConfig);
    }

    public final void createProjectUserConfig(scrum.client.admin.ProjectUserConfig projectUserConfig, Runnable successAction) {
        projectUserConfigs.put(projectUserConfig.getId(), projectUserConfig);
        entityCreated(projectUserConfig, successAction);
    }

    public final void createProjectUserConfig(scrum.client.admin.ProjectUserConfig projectUserConfig) {
        projectUserConfigs.put(projectUserConfig.getId(), projectUserConfig);
        entityCreated(projectUserConfig, null);
    }

    protected scrum.client.admin.ProjectUserConfig updateProjectUserConfig(Map data) {
        String id = (String) data.get("id");
        scrum.client.admin.ProjectUserConfig entity = projectUserConfigs.get(id);
        if (entity == null) {
            entity = new scrum.client.admin.ProjectUserConfig(data);
            projectUserConfigs.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.admin.ProjectUserConfig getProjectUserConfig(String id) {
        scrum.client.admin.ProjectUserConfig ret = projectUserConfigs.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.admin.ProjectUserConfig> getProjectUserConfigs(Collection<String> ids) {
        Set<scrum.client.admin.ProjectUserConfig> ret = new HashSet<scrum.client.admin.ProjectUserConfig>();
        for (String id : ids) {
            scrum.client.admin.ProjectUserConfig entity = projectUserConfigs.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigs() {
        return new ArrayList<scrum.client.admin.ProjectUserConfig>(projectUserConfigs.values());
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByProject(scrum.client.project.Project project) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByUser(scrum.client.admin.User user) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isUser(user)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByColor(java.lang.String color) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isColor(color)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByReceiveEmailsOnProjectEvents(boolean receiveEmailsOnProjectEvents) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isReceiveEmailsOnProjectEvents(receiveEmailsOnProjectEvents)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByMisconducts(int misconducts) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isMisconducts(misconducts)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByRichtextAutosaveText(java.lang.String richtextAutosaveText) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isRichtextAutosaveText(richtextAutosaveText)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByRichtextAutosaveField(java.lang.String richtextAutosaveField) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isRichtextAutosaveField(richtextAutosaveField)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsBySelectedEntitysId(java.lang.String selectedEntitysId) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.containsSelectedEntitysId(selectedEntitysId)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByOnline(boolean online) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isOnline(online)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByLastActivityDateAndTime(ilarkesto.core.time.DateAndTime lastActivityDateAndTime) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isLastActivityDateAndTime(lastActivityDateAndTime)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByPblFilterTheme(java.lang.String pblFilterTheme) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.containsPblFilterTheme(pblFilterTheme)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByPblFilterQuality(scrum.client.project.Quality pblFilterQuality) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.containsPblFilterQuality(pblFilterQuality)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByPblFilterDateFrom(ilarkesto.core.time.Date pblFilterDateFrom) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isPblFilterDateFrom(pblFilterDateFrom)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByPblFilterDateTo(ilarkesto.core.time.Date pblFilterDateTo) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isPblFilterDateTo(pblFilterDateTo)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByPblFilterEstimationFrom(java.lang.Float pblFilterEstimationFrom) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isPblFilterEstimationFrom(pblFilterEstimationFrom)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByPblFilterEstimationTo(java.lang.Float pblFilterEstimationTo) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isPblFilterEstimationTo(pblFilterEstimationTo)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.ProjectUserConfig> getProjectUserConfigsByPblFilterText(java.lang.String pblFilterText) {
        List<scrum.client.admin.ProjectUserConfig> ret = new ArrayList<scrum.client.admin.ProjectUserConfig>();
        for (scrum.client.admin.ProjectUserConfig entity : projectUserConfigs.values()) {
            if (entity.isPblFilterText(pblFilterText)) ret.add(entity);
        }
        return ret;
    }

    // --- Quality ---

    protected Map<String, scrum.client.project.Quality> qualitys = new HashMap<String, scrum.client.project.Quality>();

    public final void clearQualitys() {
        qualitys.clear();
    }

    public final boolean containsQuality(scrum.client.project.Quality quality) {
        return qualitys.containsKey(quality.getId());
    }

    public final void deleteQuality(scrum.client.project.Quality quality) {
        qualitys.remove(quality.getId());
        entityDeleted(quality);
    }

    public final void createQuality(scrum.client.project.Quality quality, Runnable successAction) {
        qualitys.put(quality.getId(), quality);
        entityCreated(quality, successAction);
    }

    public final void createQuality(scrum.client.project.Quality quality) {
        qualitys.put(quality.getId(), quality);
        entityCreated(quality, null);
    }

    protected scrum.client.project.Quality updateQuality(Map data) {
        String id = (String) data.get("id");
        scrum.client.project.Quality entity = qualitys.get(id);
        if (entity == null) {
            entity = new scrum.client.project.Quality(data);
            qualitys.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.project.Quality getQuality(String id) {
        scrum.client.project.Quality ret = qualitys.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.project.Quality> getQualitys(Collection<String> ids) {
        Set<scrum.client.project.Quality> ret = new HashSet<scrum.client.project.Quality>();
        for (String id : ids) {
            scrum.client.project.Quality entity = qualitys.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Quality> getQualitys() {
        return new ArrayList<scrum.client.project.Quality>(qualitys.values());
    }

    public final List<scrum.client.project.Quality> getQualitysByProject(scrum.client.project.Project project) {
        List<scrum.client.project.Quality> ret = new ArrayList<scrum.client.project.Quality>();
        for (scrum.client.project.Quality entity : qualitys.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Quality> getQualitysByNumber(int number) {
        List<scrum.client.project.Quality> ret = new ArrayList<scrum.client.project.Quality>();
        for (scrum.client.project.Quality entity : qualitys.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Quality> getQualitysByLabel(java.lang.String label) {
        List<scrum.client.project.Quality> ret = new ArrayList<scrum.client.project.Quality>();
        for (scrum.client.project.Quality entity : qualitys.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Quality> getQualitysByDescription(java.lang.String description) {
        List<scrum.client.project.Quality> ret = new ArrayList<scrum.client.project.Quality>();
        for (scrum.client.project.Quality entity : qualitys.values()) {
            if (entity.isDescription(description)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Quality> getQualitysByTestDescription(java.lang.String testDescription) {
        List<scrum.client.project.Quality> ret = new ArrayList<scrum.client.project.Quality>();
        for (scrum.client.project.Quality entity : qualitys.values()) {
            if (entity.isTestDescription(testDescription)) ret.add(entity);
        }
        return ret;
    }

    // --- Release ---

    protected Map<String, scrum.client.release.Release> releases = new HashMap<String, scrum.client.release.Release>();

    public final void clearReleases() {
        releases.clear();
    }

    public final boolean containsRelease(scrum.client.release.Release release) {
        return releases.containsKey(release.getId());
    }

    public final void deleteRelease(scrum.client.release.Release release) {
        releases.remove(release.getId());
        entityDeleted(release);
    }

    public final void createRelease(scrum.client.release.Release release, Runnable successAction) {
        releases.put(release.getId(), release);
        entityCreated(release, successAction);
    }

    public final void createRelease(scrum.client.release.Release release) {
        releases.put(release.getId(), release);
        entityCreated(release, null);
    }

    protected scrum.client.release.Release updateRelease(Map data) {
        String id = (String) data.get("id");
        scrum.client.release.Release entity = releases.get(id);
        if (entity == null) {
            entity = new scrum.client.release.Release(data);
            releases.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.release.Release getRelease(String id) {
        scrum.client.release.Release ret = releases.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.release.Release> getReleases(Collection<String> ids) {
        Set<scrum.client.release.Release> ret = new HashSet<scrum.client.release.Release>();
        for (String id : ids) {
            scrum.client.release.Release entity = releases.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleases() {
        return new ArrayList<scrum.client.release.Release>(releases.values());
    }

    public final List<scrum.client.release.Release> getReleasesByProject(scrum.client.project.Project project) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesByParentRelease(scrum.client.release.Release parentRelease) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isParentRelease(parentRelease)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesBySprint(scrum.client.sprint.Sprint sprint) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.containsSprint(sprint)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesByNumber(int number) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesByLabel(java.lang.String label) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesByNote(java.lang.String note) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isNote(note)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesByReleaseDate(ilarkesto.core.time.Date releaseDate) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isReleaseDate(releaseDate)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesByReleased(boolean released) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isReleased(released)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesByReleaseNotes(java.lang.String releaseNotes) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isReleaseNotes(releaseNotes)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesByScmTag(java.lang.String scmTag) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isScmTag(scmTag)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesByScriptRunning(boolean scriptRunning) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isScriptRunning(scriptRunning)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.release.Release> getReleasesByScriptOutput(java.lang.String scriptOutput) {
        List<scrum.client.release.Release> ret = new ArrayList<scrum.client.release.Release>();
        for (scrum.client.release.Release entity : releases.values()) {
            if (entity.isScriptOutput(scriptOutput)) ret.add(entity);
        }
        return ret;
    }

    // --- Requirement ---

    protected Map<String, scrum.client.project.Requirement> requirements = new HashMap<String, scrum.client.project.Requirement>();

    public final void clearRequirements() {
        requirements.clear();
    }

    public final boolean containsRequirement(scrum.client.project.Requirement requirement) {
        return requirements.containsKey(requirement.getId());
    }

    public final void deleteRequirement(scrum.client.project.Requirement requirement) {
        requirements.remove(requirement.getId());
        entityDeleted(requirement);
    }

    public final void createRequirement(scrum.client.project.Requirement requirement, Runnable successAction) {
        requirements.put(requirement.getId(), requirement);
        entityCreated(requirement, successAction);
    }

    public final void createRequirement(scrum.client.project.Requirement requirement) {
        requirements.put(requirement.getId(), requirement);
        entityCreated(requirement, null);
    }

    protected scrum.client.project.Requirement updateRequirement(Map data) {
        String id = (String) data.get("id");
        scrum.client.project.Requirement entity = requirements.get(id);
        if (entity == null) {
            entity = new scrum.client.project.Requirement(data);
            requirements.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.project.Requirement getRequirement(String id) {
        scrum.client.project.Requirement ret = requirements.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.project.Requirement> getRequirements(Collection<String> ids) {
        Set<scrum.client.project.Requirement> ret = new HashSet<scrum.client.project.Requirement>();
        for (String id : ids) {
            scrum.client.project.Requirement entity = requirements.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirements() {
        return new ArrayList<scrum.client.project.Requirement>(requirements.values());
    }

    public final List<scrum.client.project.Requirement> getRequirementsByProject(scrum.client.project.Project project) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsBySprint(scrum.client.sprint.Sprint sprint) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isSprint(sprint)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByIssue(scrum.client.issues.Issue issue) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isIssue(issue)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByNumber(int number) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByQuality(scrum.client.project.Quality quality) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.containsQuality(quality)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByLabel(java.lang.String label) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByDescription(java.lang.String description) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isDescription(description)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByTestDescription(java.lang.String testDescription) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isTestDescription(testDescription)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByEstimatedWork(java.lang.Float estimatedWork) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isEstimatedWork(estimatedWork)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByRejectDate(ilarkesto.core.time.Date rejectDate) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isRejectDate(rejectDate)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByClosed(boolean closed) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isClosed(closed)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsBySuspended(boolean suspended) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isSuspended(suspended)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByDirty(boolean dirty) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isDirty(dirty)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByWorkEstimationVotingActive(boolean workEstimationVotingActive) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isWorkEstimationVotingActive(workEstimationVotingActive)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByWorkEstimationVotingShowoff(boolean workEstimationVotingShowoff) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isWorkEstimationVotingShowoff(workEstimationVotingShowoff)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByTasksOrderId(java.lang.String tasksOrderId) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.containsTasksOrderId(tasksOrderId)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByTheme(java.lang.String theme) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.containsTheme(theme)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.project.Requirement> getRequirementsByEpic(scrum.client.project.Requirement epic) {
        List<scrum.client.project.Requirement> ret = new ArrayList<scrum.client.project.Requirement>();
        for (scrum.client.project.Requirement entity : requirements.values()) {
            if (entity.isEpic(epic)) ret.add(entity);
        }
        return ret;
    }

    // --- RequirementEstimationVote ---

    protected Map<String, scrum.client.estimation.RequirementEstimationVote> requirementEstimationVotes = new HashMap<String, scrum.client.estimation.RequirementEstimationVote>();

    public final void clearRequirementEstimationVotes() {
        requirementEstimationVotes.clear();
    }

    public final boolean containsRequirementEstimationVote(scrum.client.estimation.RequirementEstimationVote requirementEstimationVote) {
        return requirementEstimationVotes.containsKey(requirementEstimationVote.getId());
    }

    public final void deleteRequirementEstimationVote(scrum.client.estimation.RequirementEstimationVote requirementEstimationVote) {
        requirementEstimationVotes.remove(requirementEstimationVote.getId());
        entityDeleted(requirementEstimationVote);
    }

    public final void createRequirementEstimationVote(scrum.client.estimation.RequirementEstimationVote requirementEstimationVote, Runnable successAction) {
        requirementEstimationVotes.put(requirementEstimationVote.getId(), requirementEstimationVote);
        entityCreated(requirementEstimationVote, successAction);
    }

    public final void createRequirementEstimationVote(scrum.client.estimation.RequirementEstimationVote requirementEstimationVote) {
        requirementEstimationVotes.put(requirementEstimationVote.getId(), requirementEstimationVote);
        entityCreated(requirementEstimationVote, null);
    }

    protected scrum.client.estimation.RequirementEstimationVote updateRequirementEstimationVote(Map data) {
        String id = (String) data.get("id");
        scrum.client.estimation.RequirementEstimationVote entity = requirementEstimationVotes.get(id);
        if (entity == null) {
            entity = new scrum.client.estimation.RequirementEstimationVote(data);
            requirementEstimationVotes.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.estimation.RequirementEstimationVote getRequirementEstimationVote(String id) {
        scrum.client.estimation.RequirementEstimationVote ret = requirementEstimationVotes.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.estimation.RequirementEstimationVote> getRequirementEstimationVotes(Collection<String> ids) {
        Set<scrum.client.estimation.RequirementEstimationVote> ret = new HashSet<scrum.client.estimation.RequirementEstimationVote>();
        for (String id : ids) {
            scrum.client.estimation.RequirementEstimationVote entity = requirementEstimationVotes.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.estimation.RequirementEstimationVote> getRequirementEstimationVotes() {
        return new ArrayList<scrum.client.estimation.RequirementEstimationVote>(requirementEstimationVotes.values());
    }

    public final List<scrum.client.estimation.RequirementEstimationVote> getRequirementEstimationVotesByRequirement(scrum.client.project.Requirement requirement) {
        List<scrum.client.estimation.RequirementEstimationVote> ret = new ArrayList<scrum.client.estimation.RequirementEstimationVote>();
        for (scrum.client.estimation.RequirementEstimationVote entity : requirementEstimationVotes.values()) {
            if (entity.isRequirement(requirement)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.estimation.RequirementEstimationVote> getRequirementEstimationVotesByUser(scrum.client.admin.User user) {
        List<scrum.client.estimation.RequirementEstimationVote> ret = new ArrayList<scrum.client.estimation.RequirementEstimationVote>();
        for (scrum.client.estimation.RequirementEstimationVote entity : requirementEstimationVotes.values()) {
            if (entity.isUser(user)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.estimation.RequirementEstimationVote> getRequirementEstimationVotesByEstimatedWork(java.lang.Float estimatedWork) {
        List<scrum.client.estimation.RequirementEstimationVote> ret = new ArrayList<scrum.client.estimation.RequirementEstimationVote>();
        for (scrum.client.estimation.RequirementEstimationVote entity : requirementEstimationVotes.values()) {
            if (entity.isEstimatedWork(estimatedWork)) ret.add(entity);
        }
        return ret;
    }

    // --- Risk ---

    protected Map<String, scrum.client.risks.Risk> risks = new HashMap<String, scrum.client.risks.Risk>();

    public final void clearRisks() {
        risks.clear();
    }

    public final boolean containsRisk(scrum.client.risks.Risk risk) {
        return risks.containsKey(risk.getId());
    }

    public final void deleteRisk(scrum.client.risks.Risk risk) {
        risks.remove(risk.getId());
        entityDeleted(risk);
    }

    public final void createRisk(scrum.client.risks.Risk risk, Runnable successAction) {
        risks.put(risk.getId(), risk);
        entityCreated(risk, successAction);
    }

    public final void createRisk(scrum.client.risks.Risk risk) {
        risks.put(risk.getId(), risk);
        entityCreated(risk, null);
    }

    protected scrum.client.risks.Risk updateRisk(Map data) {
        String id = (String) data.get("id");
        scrum.client.risks.Risk entity = risks.get(id);
        if (entity == null) {
            entity = new scrum.client.risks.Risk(data);
            risks.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.risks.Risk getRisk(String id) {
        scrum.client.risks.Risk ret = risks.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.risks.Risk> getRisks(Collection<String> ids) {
        Set<scrum.client.risks.Risk> ret = new HashSet<scrum.client.risks.Risk>();
        for (String id : ids) {
            scrum.client.risks.Risk entity = risks.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.risks.Risk> getRisks() {
        return new ArrayList<scrum.client.risks.Risk>(risks.values());
    }

    public final List<scrum.client.risks.Risk> getRisksByProject(scrum.client.project.Project project) {
        List<scrum.client.risks.Risk> ret = new ArrayList<scrum.client.risks.Risk>();
        for (scrum.client.risks.Risk entity : risks.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.risks.Risk> getRisksByNumber(int number) {
        List<scrum.client.risks.Risk> ret = new ArrayList<scrum.client.risks.Risk>();
        for (scrum.client.risks.Risk entity : risks.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.risks.Risk> getRisksByLabel(java.lang.String label) {
        List<scrum.client.risks.Risk> ret = new ArrayList<scrum.client.risks.Risk>();
        for (scrum.client.risks.Risk entity : risks.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.risks.Risk> getRisksByDescription(java.lang.String description) {
        List<scrum.client.risks.Risk> ret = new ArrayList<scrum.client.risks.Risk>();
        for (scrum.client.risks.Risk entity : risks.values()) {
            if (entity.isDescription(description)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.risks.Risk> getRisksByProbabilityMitigation(java.lang.String probabilityMitigation) {
        List<scrum.client.risks.Risk> ret = new ArrayList<scrum.client.risks.Risk>();
        for (scrum.client.risks.Risk entity : risks.values()) {
            if (entity.isProbabilityMitigation(probabilityMitigation)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.risks.Risk> getRisksByImpactMitigation(java.lang.String impactMitigation) {
        List<scrum.client.risks.Risk> ret = new ArrayList<scrum.client.risks.Risk>();
        for (scrum.client.risks.Risk entity : risks.values()) {
            if (entity.isImpactMitigation(impactMitigation)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.risks.Risk> getRisksByProbability(int probability) {
        List<scrum.client.risks.Risk> ret = new ArrayList<scrum.client.risks.Risk>();
        for (scrum.client.risks.Risk entity : risks.values()) {
            if (entity.isProbability(probability)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.risks.Risk> getRisksByImpact(int impact) {
        List<scrum.client.risks.Risk> ret = new ArrayList<scrum.client.risks.Risk>();
        for (scrum.client.risks.Risk entity : risks.values()) {
            if (entity.isImpact(impact)) ret.add(entity);
        }
        return ret;
    }

    // --- SimpleEvent ---

    protected Map<String, scrum.client.calendar.SimpleEvent> simpleEvents = new HashMap<String, scrum.client.calendar.SimpleEvent>();

    public final void clearSimpleEvents() {
        simpleEvents.clear();
    }

    public final boolean containsSimpleEvent(scrum.client.calendar.SimpleEvent simpleEvent) {
        return simpleEvents.containsKey(simpleEvent.getId());
    }

    public final void deleteSimpleEvent(scrum.client.calendar.SimpleEvent simpleEvent) {
        simpleEvents.remove(simpleEvent.getId());
        entityDeleted(simpleEvent);
    }

    public final void createSimpleEvent(scrum.client.calendar.SimpleEvent simpleEvent, Runnable successAction) {
        simpleEvents.put(simpleEvent.getId(), simpleEvent);
        entityCreated(simpleEvent, successAction);
    }

    public final void createSimpleEvent(scrum.client.calendar.SimpleEvent simpleEvent) {
        simpleEvents.put(simpleEvent.getId(), simpleEvent);
        entityCreated(simpleEvent, null);
    }

    protected scrum.client.calendar.SimpleEvent updateSimpleEvent(Map data) {
        String id = (String) data.get("id");
        scrum.client.calendar.SimpleEvent entity = simpleEvents.get(id);
        if (entity == null) {
            entity = new scrum.client.calendar.SimpleEvent(data);
            simpleEvents.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.calendar.SimpleEvent getSimpleEvent(String id) {
        scrum.client.calendar.SimpleEvent ret = simpleEvents.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.calendar.SimpleEvent> getSimpleEvents(Collection<String> ids) {
        Set<scrum.client.calendar.SimpleEvent> ret = new HashSet<scrum.client.calendar.SimpleEvent>();
        for (String id : ids) {
            scrum.client.calendar.SimpleEvent entity = simpleEvents.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.calendar.SimpleEvent> getSimpleEvents() {
        return new ArrayList<scrum.client.calendar.SimpleEvent>(simpleEvents.values());
    }

    public final List<scrum.client.calendar.SimpleEvent> getSimpleEventsByProject(scrum.client.project.Project project) {
        List<scrum.client.calendar.SimpleEvent> ret = new ArrayList<scrum.client.calendar.SimpleEvent>();
        for (scrum.client.calendar.SimpleEvent entity : simpleEvents.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.calendar.SimpleEvent> getSimpleEventsByLabel(java.lang.String label) {
        List<scrum.client.calendar.SimpleEvent> ret = new ArrayList<scrum.client.calendar.SimpleEvent>();
        for (scrum.client.calendar.SimpleEvent entity : simpleEvents.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.calendar.SimpleEvent> getSimpleEventsByNumber(int number) {
        List<scrum.client.calendar.SimpleEvent> ret = new ArrayList<scrum.client.calendar.SimpleEvent>();
        for (scrum.client.calendar.SimpleEvent entity : simpleEvents.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.calendar.SimpleEvent> getSimpleEventsByDate(ilarkesto.core.time.Date date) {
        List<scrum.client.calendar.SimpleEvent> ret = new ArrayList<scrum.client.calendar.SimpleEvent>();
        for (scrum.client.calendar.SimpleEvent entity : simpleEvents.values()) {
            if (entity.isDate(date)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.calendar.SimpleEvent> getSimpleEventsByTime(ilarkesto.core.time.Time time) {
        List<scrum.client.calendar.SimpleEvent> ret = new ArrayList<scrum.client.calendar.SimpleEvent>();
        for (scrum.client.calendar.SimpleEvent entity : simpleEvents.values()) {
            if (entity.isTime(time)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.calendar.SimpleEvent> getSimpleEventsByLocation(java.lang.String location) {
        List<scrum.client.calendar.SimpleEvent> ret = new ArrayList<scrum.client.calendar.SimpleEvent>();
        for (scrum.client.calendar.SimpleEvent entity : simpleEvents.values()) {
            if (entity.isLocation(location)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.calendar.SimpleEvent> getSimpleEventsByDuration(java.lang.Integer duration) {
        List<scrum.client.calendar.SimpleEvent> ret = new ArrayList<scrum.client.calendar.SimpleEvent>();
        for (scrum.client.calendar.SimpleEvent entity : simpleEvents.values()) {
            if (entity.isDuration(duration)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.calendar.SimpleEvent> getSimpleEventsByAgenda(java.lang.String agenda) {
        List<scrum.client.calendar.SimpleEvent> ret = new ArrayList<scrum.client.calendar.SimpleEvent>();
        for (scrum.client.calendar.SimpleEvent entity : simpleEvents.values()) {
            if (entity.isAgenda(agenda)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.calendar.SimpleEvent> getSimpleEventsByNote(java.lang.String note) {
        List<scrum.client.calendar.SimpleEvent> ret = new ArrayList<scrum.client.calendar.SimpleEvent>();
        for (scrum.client.calendar.SimpleEvent entity : simpleEvents.values()) {
            if (entity.isNote(note)) ret.add(entity);
        }
        return ret;
    }

    // --- Sprint ---

    protected Map<String, scrum.client.sprint.Sprint> sprints = new HashMap<String, scrum.client.sprint.Sprint>();

    public final void clearSprints() {
        sprints.clear();
    }

    public final boolean containsSprint(scrum.client.sprint.Sprint sprint) {
        return sprints.containsKey(sprint.getId());
    }

    public final void deleteSprint(scrum.client.sprint.Sprint sprint) {
        sprints.remove(sprint.getId());
        entityDeleted(sprint);
    }

    public final void createSprint(scrum.client.sprint.Sprint sprint, Runnable successAction) {
        sprints.put(sprint.getId(), sprint);
        entityCreated(sprint, successAction);
    }

    public final void createSprint(scrum.client.sprint.Sprint sprint) {
        sprints.put(sprint.getId(), sprint);
        entityCreated(sprint, null);
    }

    protected scrum.client.sprint.Sprint updateSprint(Map data) {
        String id = (String) data.get("id");
        scrum.client.sprint.Sprint entity = sprints.get(id);
        if (entity == null) {
            entity = new scrum.client.sprint.Sprint(data);
            sprints.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.sprint.Sprint getSprint(String id) {
        scrum.client.sprint.Sprint ret = sprints.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.sprint.Sprint> getSprints(Collection<String> ids) {
        Set<scrum.client.sprint.Sprint> ret = new HashSet<scrum.client.sprint.Sprint>();
        for (String id : ids) {
            scrum.client.sprint.Sprint entity = sprints.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprints() {
        return new ArrayList<scrum.client.sprint.Sprint>(sprints.values());
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByNumber(int number) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByProject(scrum.client.project.Project project) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByLabel(java.lang.String label) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByGoal(java.lang.String goal) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isGoal(goal)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByBegin(ilarkesto.core.time.Date begin) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isBegin(begin)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByEnd(ilarkesto.core.time.Date end) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isEnd(end)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByOriginallyEnd(ilarkesto.core.time.Date originallyEnd) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isOriginallyEnd(originallyEnd)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByVelocity(java.lang.Float velocity) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isVelocity(velocity)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByCompletedRequirementsData(java.lang.String completedRequirementsData) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isCompletedRequirementsData(completedRequirementsData)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByIncompletedRequirementsData(java.lang.String incompletedRequirementsData) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isIncompletedRequirementsData(incompletedRequirementsData)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByPlanningNote(java.lang.String planningNote) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isPlanningNote(planningNote)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByReviewNote(java.lang.String reviewNote) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isReviewNote(reviewNote)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByRetrospectiveNote(java.lang.String retrospectiveNote) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.isRetrospectiveNote(retrospectiveNote)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByRequirementsOrderId(java.lang.String requirementsOrderId) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.containsRequirementsOrderId(requirementsOrderId)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByProductOwner(scrum.client.admin.User productOwner) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.containsProductOwner(productOwner)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByScrumMaster(scrum.client.admin.User scrumMaster) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.containsScrumMaster(scrumMaster)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Sprint> getSprintsByTeamMember(scrum.client.admin.User teamMember) {
        List<scrum.client.sprint.Sprint> ret = new ArrayList<scrum.client.sprint.Sprint>();
        for (scrum.client.sprint.Sprint entity : sprints.values()) {
            if (entity.containsTeamMember(teamMember)) ret.add(entity);
        }
        return ret;
    }

    // --- SprintReport ---

    protected Map<String, scrum.client.sprint.SprintReport> sprintReports = new HashMap<String, scrum.client.sprint.SprintReport>();

    public final void clearSprintReports() {
        sprintReports.clear();
    }

    public final boolean containsSprintReport(scrum.client.sprint.SprintReport sprintReport) {
        return sprintReports.containsKey(sprintReport.getId());
    }

    public final void deleteSprintReport(scrum.client.sprint.SprintReport sprintReport) {
        sprintReports.remove(sprintReport.getId());
        entityDeleted(sprintReport);
    }

    public final void createSprintReport(scrum.client.sprint.SprintReport sprintReport, Runnable successAction) {
        sprintReports.put(sprintReport.getId(), sprintReport);
        entityCreated(sprintReport, successAction);
    }

    public final void createSprintReport(scrum.client.sprint.SprintReport sprintReport) {
        sprintReports.put(sprintReport.getId(), sprintReport);
        entityCreated(sprintReport, null);
    }

    protected scrum.client.sprint.SprintReport updateSprintReport(Map data) {
        String id = (String) data.get("id");
        scrum.client.sprint.SprintReport entity = sprintReports.get(id);
        if (entity == null) {
            entity = new scrum.client.sprint.SprintReport(data);
            sprintReports.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.sprint.SprintReport getSprintReport(String id) {
        scrum.client.sprint.SprintReport ret = sprintReports.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.sprint.SprintReport> getSprintReports(Collection<String> ids) {
        Set<scrum.client.sprint.SprintReport> ret = new HashSet<scrum.client.sprint.SprintReport>();
        for (String id : ids) {
            scrum.client.sprint.SprintReport entity = sprintReports.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.SprintReport> getSprintReports() {
        return new ArrayList<scrum.client.sprint.SprintReport>(sprintReports.values());
    }

    public final scrum.client.sprint.SprintReport getSprintReportBySprint(scrum.client.sprint.Sprint sprint) {
        for (scrum.client.sprint.SprintReport entity : sprintReports.values()) {
            if (entity.isSprint(sprint)) return entity;
        }
        return null;
    }

    public final List<scrum.client.sprint.SprintReport> getSprintReportsByCompletedRequirement(scrum.client.project.Requirement completedRequirement) {
        List<scrum.client.sprint.SprintReport> ret = new ArrayList<scrum.client.sprint.SprintReport>();
        for (scrum.client.sprint.SprintReport entity : sprintReports.values()) {
            if (entity.containsCompletedRequirement(completedRequirement)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.SprintReport> getSprintReportsByRejectedRequirement(scrum.client.project.Requirement rejectedRequirement) {
        List<scrum.client.sprint.SprintReport> ret = new ArrayList<scrum.client.sprint.SprintReport>();
        for (scrum.client.sprint.SprintReport entity : sprintReports.values()) {
            if (entity.containsRejectedRequirement(rejectedRequirement)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.SprintReport> getSprintReportsByRequirementsOrderId(java.lang.String requirementsOrderId) {
        List<scrum.client.sprint.SprintReport> ret = new ArrayList<scrum.client.sprint.SprintReport>();
        for (scrum.client.sprint.SprintReport entity : sprintReports.values()) {
            if (entity.containsRequirementsOrderId(requirementsOrderId)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.SprintReport> getSprintReportsByClosedTask(scrum.client.sprint.Task closedTask) {
        List<scrum.client.sprint.SprintReport> ret = new ArrayList<scrum.client.sprint.SprintReport>();
        for (scrum.client.sprint.SprintReport entity : sprintReports.values()) {
            if (entity.containsClosedTask(closedTask)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.SprintReport> getSprintReportsByOpenTask(scrum.client.sprint.Task openTask) {
        List<scrum.client.sprint.SprintReport> ret = new ArrayList<scrum.client.sprint.SprintReport>();
        for (scrum.client.sprint.SprintReport entity : sprintReports.values()) {
            if (entity.containsOpenTask(openTask)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.SprintReport> getSprintReportsByBurnedWork(int burnedWork) {
        List<scrum.client.sprint.SprintReport> ret = new ArrayList<scrum.client.sprint.SprintReport>();
        for (scrum.client.sprint.SprintReport entity : sprintReports.values()) {
            if (entity.isBurnedWork(burnedWork)) ret.add(entity);
        }
        return ret;
    }

    // --- Subject ---

    protected Map<String, scrum.client.collaboration.Subject> subjects = new HashMap<String, scrum.client.collaboration.Subject>();

    public final void clearSubjects() {
        subjects.clear();
    }

    public final boolean containsSubject(scrum.client.collaboration.Subject subject) {
        return subjects.containsKey(subject.getId());
    }

    public final void deleteSubject(scrum.client.collaboration.Subject subject) {
        subjects.remove(subject.getId());
        entityDeleted(subject);
    }

    public final void createSubject(scrum.client.collaboration.Subject subject, Runnable successAction) {
        subjects.put(subject.getId(), subject);
        entityCreated(subject, successAction);
    }

    public final void createSubject(scrum.client.collaboration.Subject subject) {
        subjects.put(subject.getId(), subject);
        entityCreated(subject, null);
    }

    protected scrum.client.collaboration.Subject updateSubject(Map data) {
        String id = (String) data.get("id");
        scrum.client.collaboration.Subject entity = subjects.get(id);
        if (entity == null) {
            entity = new scrum.client.collaboration.Subject(data);
            subjects.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.collaboration.Subject getSubject(String id) {
        scrum.client.collaboration.Subject ret = subjects.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.collaboration.Subject> getSubjects(Collection<String> ids) {
        Set<scrum.client.collaboration.Subject> ret = new HashSet<scrum.client.collaboration.Subject>();
        for (String id : ids) {
            scrum.client.collaboration.Subject entity = subjects.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Subject> getSubjects() {
        return new ArrayList<scrum.client.collaboration.Subject>(subjects.values());
    }

    public final List<scrum.client.collaboration.Subject> getSubjectsByProject(scrum.client.project.Project project) {
        List<scrum.client.collaboration.Subject> ret = new ArrayList<scrum.client.collaboration.Subject>();
        for (scrum.client.collaboration.Subject entity : subjects.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Subject> getSubjectsByLabel(java.lang.String label) {
        List<scrum.client.collaboration.Subject> ret = new ArrayList<scrum.client.collaboration.Subject>();
        for (scrum.client.collaboration.Subject entity : subjects.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Subject> getSubjectsByText(java.lang.String text) {
        List<scrum.client.collaboration.Subject> ret = new ArrayList<scrum.client.collaboration.Subject>();
        for (scrum.client.collaboration.Subject entity : subjects.values()) {
            if (entity.isText(text)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Subject> getSubjectsByNumber(int number) {
        List<scrum.client.collaboration.Subject> ret = new ArrayList<scrum.client.collaboration.Subject>();
        for (scrum.client.collaboration.Subject entity : subjects.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    // --- Subscription ---

    protected Map<String, scrum.client.pr.Subscription> subscriptions = new HashMap<String, scrum.client.pr.Subscription>();

    public final void clearSubscriptions() {
        subscriptions.clear();
    }

    public final boolean containsSubscription(scrum.client.pr.Subscription subscription) {
        return subscriptions.containsKey(subscription.getId());
    }

    public final void deleteSubscription(scrum.client.pr.Subscription subscription) {
        subscriptions.remove(subscription.getId());
        entityDeleted(subscription);
    }

    public final void createSubscription(scrum.client.pr.Subscription subscription, Runnable successAction) {
        subscriptions.put(subscription.getId(), subscription);
        entityCreated(subscription, successAction);
    }

    public final void createSubscription(scrum.client.pr.Subscription subscription) {
        subscriptions.put(subscription.getId(), subscription);
        entityCreated(subscription, null);
    }

    protected scrum.client.pr.Subscription updateSubscription(Map data) {
        String id = (String) data.get("id");
        scrum.client.pr.Subscription entity = subscriptions.get(id);
        if (entity == null) {
            entity = new scrum.client.pr.Subscription(data);
            subscriptions.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.pr.Subscription getSubscription(String id) {
        scrum.client.pr.Subscription ret = subscriptions.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.pr.Subscription> getSubscriptions(Collection<String> ids) {
        Set<scrum.client.pr.Subscription> ret = new HashSet<scrum.client.pr.Subscription>();
        for (String id : ids) {
            scrum.client.pr.Subscription entity = subscriptions.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.pr.Subscription> getSubscriptions() {
        return new ArrayList<scrum.client.pr.Subscription>(subscriptions.values());
    }

    public final scrum.client.pr.Subscription getSubscriptionBySubject(ilarkesto.gwt.client.AGwtEntity subject) {
        for (scrum.client.pr.Subscription entity : subscriptions.values()) {
            if (entity.isSubject(subject)) return entity;
        }
        return null;
    }

    public final List<scrum.client.pr.Subscription> getSubscriptionsBySubscribersEmail(java.lang.String subscribersEmail) {
        List<scrum.client.pr.Subscription> ret = new ArrayList<scrum.client.pr.Subscription>();
        for (scrum.client.pr.Subscription entity : subscriptions.values()) {
            if (entity.containsSubscribersEmail(subscribersEmail)) ret.add(entity);
        }
        return ret;
    }

    // --- SystemConfig ---

    protected Map<String, scrum.client.admin.SystemConfig> systemConfigs = new HashMap<String, scrum.client.admin.SystemConfig>();

    public final void clearSystemConfigs() {
        systemConfigs.clear();
    }

    public final boolean containsSystemConfig(scrum.client.admin.SystemConfig systemConfig) {
        return systemConfigs.containsKey(systemConfig.getId());
    }

    public final void deleteSystemConfig(scrum.client.admin.SystemConfig systemConfig) {
        systemConfigs.remove(systemConfig.getId());
        entityDeleted(systemConfig);
    }

    public final void createSystemConfig(scrum.client.admin.SystemConfig systemConfig, Runnable successAction) {
        systemConfigs.put(systemConfig.getId(), systemConfig);
        entityCreated(systemConfig, successAction);
    }

    public final void createSystemConfig(scrum.client.admin.SystemConfig systemConfig) {
        systemConfigs.put(systemConfig.getId(), systemConfig);
        entityCreated(systemConfig, null);
    }

    protected scrum.client.admin.SystemConfig updateSystemConfig(Map data) {
        String id = (String) data.get("id");
        scrum.client.admin.SystemConfig entity = systemConfigs.get(id);
        if (entity == null) {
            entity = new scrum.client.admin.SystemConfig(data);
            systemConfigs.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.admin.SystemConfig getSystemConfig(String id) {
        scrum.client.admin.SystemConfig ret = systemConfigs.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.admin.SystemConfig> getSystemConfigs(Collection<String> ids) {
        Set<scrum.client.admin.SystemConfig> ret = new HashSet<scrum.client.admin.SystemConfig>();
        for (String id : ids) {
            scrum.client.admin.SystemConfig entity = systemConfigs.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigs() {
        return new ArrayList<scrum.client.admin.SystemConfig>(systemConfigs.values());
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByUrl(java.lang.String url) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isUrl(url)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByAdminEmail(java.lang.String adminEmail) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isAdminEmail(adminEmail)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByGoogleAnalyticsId(java.lang.String googleAnalyticsId) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isGoogleAnalyticsId(googleAnalyticsId)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsBySmtpServer(java.lang.String smtpServer) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isSmtpServer(smtpServer)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsBySmtpPort(java.lang.Integer smtpPort) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isSmtpPort(smtpPort)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsBySmtpTls(boolean smtpTls) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isSmtpTls(smtpTls)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsBySmtpUser(java.lang.String smtpUser) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isSmtpUser(smtpUser)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsBySmtpPassword(java.lang.String smtpPassword) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isSmtpPassword(smtpPassword)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsBySmtpFrom(java.lang.String smtpFrom) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isSmtpFrom(smtpFrom)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByInstanceName(java.lang.String instanceName) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isInstanceName(instanceName)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByLoginPageLogoUrl(java.lang.String loginPageLogoUrl) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isLoginPageLogoUrl(loginPageLogoUrl)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByLoginPageMessage(java.lang.String loginPageMessage) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isLoginPageMessage(loginPageMessage)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByRegisterPageMessage(java.lang.String registerPageMessage) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isRegisterPageMessage(registerPageMessage)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByAboutPageMessage(java.lang.String aboutPageMessage) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isAboutPageMessage(aboutPageMessage)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByUserEmailMandatory(boolean userEmailMandatory) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isUserEmailMandatory(userEmailMandatory)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByRegistrationDisabled(boolean registrationDisabled) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isRegistrationDisabled(registrationDisabled)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByProjectCreationDisabled(boolean projectCreationDisabled) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isProjectCreationDisabled(projectCreationDisabled)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByDefaultUserPassword(java.lang.String defaultUserPassword) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isDefaultUserPassword(defaultUserPassword)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByOpenIdDisabled(boolean openIdDisabled) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isOpenIdDisabled(openIdDisabled)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByOpenIdDomains(java.lang.String openIdDomains) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isOpenIdDomains(openIdDomains)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByVersionCheckEnabled(boolean versionCheckEnabled) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isVersionCheckEnabled(versionCheckEnabled)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByLdapEnabled(boolean ldapEnabled) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isLdapEnabled(ldapEnabled)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByLdapUrl(java.lang.String ldapUrl) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isLdapUrl(ldapUrl)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByLdapUser(java.lang.String ldapUser) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isLdapUser(ldapUser)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByLdapPassword(java.lang.String ldapPassword) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isLdapPassword(ldapPassword)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByLdapBaseDn(java.lang.String ldapBaseDn) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isLdapBaseDn(ldapBaseDn)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByLdapUserFilterRegex(java.lang.String ldapUserFilterRegex) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isLdapUserFilterRegex(ldapUserFilterRegex)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsByMaxFileSize(java.lang.Integer maxFileSize) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isMaxFileSize(maxFileSize)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.SystemConfig> getSystemConfigsBySubscriptionKeySeed(java.lang.String subscriptionKeySeed) {
        List<scrum.client.admin.SystemConfig> ret = new ArrayList<scrum.client.admin.SystemConfig>();
        for (scrum.client.admin.SystemConfig entity : systemConfigs.values()) {
            if (entity.isSubscriptionKeySeed(subscriptionKeySeed)) ret.add(entity);
        }
        return ret;
    }

    // --- Task ---

    protected Map<String, scrum.client.sprint.Task> tasks = new HashMap<String, scrum.client.sprint.Task>();

    public final void clearTasks() {
        tasks.clear();
    }

    public final boolean containsTask(scrum.client.sprint.Task task) {
        return tasks.containsKey(task.getId());
    }

    public final void deleteTask(scrum.client.sprint.Task task) {
        tasks.remove(task.getId());
        entityDeleted(task);
    }

    public final void createTask(scrum.client.sprint.Task task, Runnable successAction) {
        tasks.put(task.getId(), task);
        entityCreated(task, successAction);
    }

    public final void createTask(scrum.client.sprint.Task task) {
        tasks.put(task.getId(), task);
        entityCreated(task, null);
    }

    protected scrum.client.sprint.Task updateTask(Map data) {
        String id = (String) data.get("id");
        scrum.client.sprint.Task entity = tasks.get(id);
        if (entity == null) {
            entity = new scrum.client.sprint.Task(data);
            tasks.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.sprint.Task getTask(String id) {
        scrum.client.sprint.Task ret = tasks.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.sprint.Task> getTasks(Collection<String> ids) {
        Set<scrum.client.sprint.Task> ret = new HashSet<scrum.client.sprint.Task>();
        for (String id : ids) {
            scrum.client.sprint.Task entity = tasks.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Task> getTasks() {
        return new ArrayList<scrum.client.sprint.Task>(tasks.values());
    }

    public final List<scrum.client.sprint.Task> getTasksByRequirement(scrum.client.project.Requirement requirement) {
        List<scrum.client.sprint.Task> ret = new ArrayList<scrum.client.sprint.Task>();
        for (scrum.client.sprint.Task entity : tasks.values()) {
            if (entity.isRequirement(requirement)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Task> getTasksByNumber(int number) {
        List<scrum.client.sprint.Task> ret = new ArrayList<scrum.client.sprint.Task>();
        for (scrum.client.sprint.Task entity : tasks.values()) {
            if (entity.isNumber(number)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Task> getTasksByLabel(java.lang.String label) {
        List<scrum.client.sprint.Task> ret = new ArrayList<scrum.client.sprint.Task>();
        for (scrum.client.sprint.Task entity : tasks.values()) {
            if (entity.isLabel(label)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Task> getTasksByDescription(java.lang.String description) {
        List<scrum.client.sprint.Task> ret = new ArrayList<scrum.client.sprint.Task>();
        for (scrum.client.sprint.Task entity : tasks.values()) {
            if (entity.isDescription(description)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Task> getTasksByRemainingWork(int remainingWork) {
        List<scrum.client.sprint.Task> ret = new ArrayList<scrum.client.sprint.Task>();
        for (scrum.client.sprint.Task entity : tasks.values()) {
            if (entity.isRemainingWork(remainingWork)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Task> getTasksByBurnedWork(int burnedWork) {
        List<scrum.client.sprint.Task> ret = new ArrayList<scrum.client.sprint.Task>();
        for (scrum.client.sprint.Task entity : tasks.values()) {
            if (entity.isBurnedWork(burnedWork)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Task> getTasksByOwner(scrum.client.admin.User owner) {
        List<scrum.client.sprint.Task> ret = new ArrayList<scrum.client.sprint.Task>();
        for (scrum.client.sprint.Task entity : tasks.values()) {
            if (entity.isOwner(owner)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Task> getTasksByImpediment(scrum.client.impediments.Impediment impediment) {
        List<scrum.client.sprint.Task> ret = new ArrayList<scrum.client.sprint.Task>();
        for (scrum.client.sprint.Task entity : tasks.values()) {
            if (entity.isImpediment(impediment)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.sprint.Task> getTasksByClosedInPastSprint(scrum.client.sprint.Sprint closedInPastSprint) {
        List<scrum.client.sprint.Task> ret = new ArrayList<scrum.client.sprint.Task>();
        for (scrum.client.sprint.Task entity : tasks.values()) {
            if (entity.isClosedInPastSprint(closedInPastSprint)) ret.add(entity);
        }
        return ret;
    }

    // --- User ---

    protected Map<String, scrum.client.admin.User> users = new HashMap<String, scrum.client.admin.User>();

    public final void clearUsers() {
        users.clear();
    }

    public final boolean containsUser(scrum.client.admin.User user) {
        return users.containsKey(user.getId());
    }

    public final void deleteUser(scrum.client.admin.User user) {
        users.remove(user.getId());
        entityDeleted(user);
    }

    public final void createUser(scrum.client.admin.User user, Runnable successAction) {
        users.put(user.getId(), user);
        entityCreated(user, successAction);
    }

    public final void createUser(scrum.client.admin.User user) {
        users.put(user.getId(), user);
        entityCreated(user, null);
    }

    protected scrum.client.admin.User updateUser(Map data) {
        String id = (String) data.get("id");
        scrum.client.admin.User entity = users.get(id);
        if (entity == null) {
            entity = new scrum.client.admin.User(data);
            users.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.admin.User getUser(String id) {
        scrum.client.admin.User ret = users.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.admin.User> getUsers(Collection<String> ids) {
        Set<scrum.client.admin.User> ret = new HashSet<scrum.client.admin.User>();
        for (String id : ids) {
            scrum.client.admin.User entity = users.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsers() {
        return new ArrayList<scrum.client.admin.User>(users.values());
    }

    public final scrum.client.admin.User getUserByName(java.lang.String name) {
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isName(name)) return entity;
        }
        return null;
    }

    public final List<scrum.client.admin.User> getUsersByPublicName(java.lang.String publicName) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isPublicName(publicName)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByFullName(java.lang.String fullName) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isFullName(fullName)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByAdmin(boolean admin) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isAdmin(admin)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByEmailVerified(boolean emailVerified) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isEmailVerified(emailVerified)) ret.add(entity);
        }
        return ret;
    }

    public final scrum.client.admin.User getUserByEmail(java.lang.String email) {
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isEmail(email)) return entity;
        }
        return null;
    }

    public final List<scrum.client.admin.User> getUsersByCurrentProject(scrum.client.project.Project currentProject) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isCurrentProject(currentProject)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByColor(java.lang.String color) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isColor(color)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByLastLoginDateAndTime(ilarkesto.core.time.DateAndTime lastLoginDateAndTime) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isLastLoginDateAndTime(lastLoginDateAndTime)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByRegistrationDateAndTime(ilarkesto.core.time.DateAndTime registrationDateAndTime) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isRegistrationDateAndTime(registrationDateAndTime)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByDisabled(boolean disabled) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isDisabled(disabled)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideBlog(boolean hideUserGuideBlog) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideBlog(hideUserGuideBlog)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideCalendar(boolean hideUserGuideCalendar) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideCalendar(hideUserGuideCalendar)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideFiles(boolean hideUserGuideFiles) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideFiles(hideUserGuideFiles)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideForum(boolean hideUserGuideForum) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideForum(hideUserGuideForum)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideImpediments(boolean hideUserGuideImpediments) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideImpediments(hideUserGuideImpediments)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideIssues(boolean hideUserGuideIssues) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideIssues(hideUserGuideIssues)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideJournal(boolean hideUserGuideJournal) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideJournal(hideUserGuideJournal)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideNextSprint(boolean hideUserGuideNextSprint) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideNextSprint(hideUserGuideNextSprint)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideProductBacklog(boolean hideUserGuideProductBacklog) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideProductBacklog(hideUserGuideProductBacklog)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideCourtroom(boolean hideUserGuideCourtroom) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideCourtroom(hideUserGuideCourtroom)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideQualityBacklog(boolean hideUserGuideQualityBacklog) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideQualityBacklog(hideUserGuideQualityBacklog)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideReleases(boolean hideUserGuideReleases) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideReleases(hideUserGuideReleases)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideRisks(boolean hideUserGuideRisks) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideRisks(hideUserGuideRisks)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideSprintBacklog(boolean hideUserGuideSprintBacklog) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideSprintBacklog(hideUserGuideSprintBacklog)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.admin.User> getUsersByHideUserGuideWhiteboard(boolean hideUserGuideWhiteboard) {
        List<scrum.client.admin.User> ret = new ArrayList<scrum.client.admin.User>();
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isHideUserGuideWhiteboard(hideUserGuideWhiteboard)) ret.add(entity);
        }
        return ret;
    }

    public final scrum.client.admin.User getUserByLoginToken(java.lang.String loginToken) {
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isLoginToken(loginToken)) return entity;
        }
        return null;
    }

    public final scrum.client.admin.User getUserByOpenId(java.lang.String openId) {
        for (scrum.client.admin.User entity : users.values()) {
            if (entity.isOpenId(openId)) return entity;
        }
        return null;
    }

    // --- Wikipage ---

    protected Map<String, scrum.client.collaboration.Wikipage> wikipages = new HashMap<String, scrum.client.collaboration.Wikipage>();

    public final void clearWikipages() {
        wikipages.clear();
    }

    public final boolean containsWikipage(scrum.client.collaboration.Wikipage wikipage) {
        return wikipages.containsKey(wikipage.getId());
    }

    public final void deleteWikipage(scrum.client.collaboration.Wikipage wikipage) {
        wikipages.remove(wikipage.getId());
        entityDeleted(wikipage);
    }

    public final void createWikipage(scrum.client.collaboration.Wikipage wikipage, Runnable successAction) {
        wikipages.put(wikipage.getId(), wikipage);
        entityCreated(wikipage, successAction);
    }

    public final void createWikipage(scrum.client.collaboration.Wikipage wikipage) {
        wikipages.put(wikipage.getId(), wikipage);
        entityCreated(wikipage, null);
    }

    protected scrum.client.collaboration.Wikipage updateWikipage(Map data) {
        String id = (String) data.get("id");
        scrum.client.collaboration.Wikipage entity = wikipages.get(id);
        if (entity == null) {
            entity = new scrum.client.collaboration.Wikipage(data);
            wikipages.put(id, entity);
        } else {
            entity.updateProperties(data);
        }
        return entity;
    }

    public final scrum.client.collaboration.Wikipage getWikipage(String id) {
        scrum.client.collaboration.Wikipage ret = wikipages.get(id);
        if (ret == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
        return ret;
    }

    public final Set<scrum.client.collaboration.Wikipage> getWikipages(Collection<String> ids) {
        Set<scrum.client.collaboration.Wikipage> ret = new HashSet<scrum.client.collaboration.Wikipage>();
        for (String id : ids) {
            scrum.client.collaboration.Wikipage entity = wikipages.get(id);
            if (entity == null) throw new ilarkesto.gwt.client.EntityDoesNotExistException(id);
            ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Wikipage> getWikipages() {
        return new ArrayList<scrum.client.collaboration.Wikipage>(wikipages.values());
    }

    public final List<scrum.client.collaboration.Wikipage> getWikipagesByProject(scrum.client.project.Project project) {
        List<scrum.client.collaboration.Wikipage> ret = new ArrayList<scrum.client.collaboration.Wikipage>();
        for (scrum.client.collaboration.Wikipage entity : wikipages.values()) {
            if (entity.isProject(project)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Wikipage> getWikipagesByName(java.lang.String name) {
        List<scrum.client.collaboration.Wikipage> ret = new ArrayList<scrum.client.collaboration.Wikipage>();
        for (scrum.client.collaboration.Wikipage entity : wikipages.values()) {
            if (entity.isName(name)) ret.add(entity);
        }
        return ret;
    }

    public final List<scrum.client.collaboration.Wikipage> getWikipagesByText(java.lang.String text) {
        List<scrum.client.collaboration.Wikipage> ret = new ArrayList<scrum.client.collaboration.Wikipage>();
        for (scrum.client.collaboration.Wikipage entity : wikipages.values()) {
            if (entity.isText(text)) ret.add(entity);
        }
        return ret;
    }

    public final void clearAllEntities() {
            clearBlogEntrys();
            clearChanges();
            clearChatMessages();
            clearComments();
            clearEmoticons();
            clearFiles();
            clearImpediments();
            clearIssues();
            clearProjects();
            clearProjectEvents();
            clearProjectUserConfigs();
            clearQualitys();
            clearReleases();
            clearRequirements();
            clearRequirementEstimationVotes();
            clearRisks();
            clearSimpleEvents();
            clearSprints();
            clearSprintReports();
            clearSubjects();
            clearSubscriptions();
            clearSystemConfigs();
            clearTasks();
            clearUsers();
            clearWikipages();
    }

    private Collection<Map<String, ? extends AGwtEntity>> entityMaps;

    @Override
    protected final Collection<Map<String, ? extends AGwtEntity>> getEntityMaps() {
        if (entityMaps == null) {
            entityMaps = new ArrayList<Map<String, ? extends AGwtEntity>>();
            entityMaps.add(blogEntrys);
            entityMaps.add(changes);
            entityMaps.add(chatMessages);
            entityMaps.add(comments);
            entityMaps.add(emoticons);
            entityMaps.add(files);
            entityMaps.add(impediments);
            entityMaps.add(issues);
            entityMaps.add(projects);
            entityMaps.add(projectEvents);
            entityMaps.add(projectUserConfigs);
            entityMaps.add(qualitys);
            entityMaps.add(releases);
            entityMaps.add(requirements);
            entityMaps.add(requirementEstimationVotes);
            entityMaps.add(risks);
            entityMaps.add(simpleEvents);
            entityMaps.add(sprints);
            entityMaps.add(sprintReports);
            entityMaps.add(subjects);
            entityMaps.add(subscriptions);
            entityMaps.add(systemConfigs);
            entityMaps.add(tasks);
            entityMaps.add(users);
            entityMaps.add(wikipages);
        }
        return entityMaps;
    }

    @Override
    protected final ilarkesto.gwt.client.AGwtEntity updateLocalEntity(String type, Map data) {
        if (type.equals(scrum.client.pr.BlogEntry.ENTITY_TYPE)) {
            return updateBlogEntry(data);
        }
        if (type.equals(scrum.client.journal.Change.ENTITY_TYPE)) {
            return updateChange(data);
        }
        if (type.equals(scrum.client.collaboration.ChatMessage.ENTITY_TYPE)) {
            return updateChatMessage(data);
        }
        if (type.equals(scrum.client.collaboration.Comment.ENTITY_TYPE)) {
            return updateComment(data);
        }
        if (type.equals(scrum.client.collaboration.Emoticon.ENTITY_TYPE)) {
            return updateEmoticon(data);
        }
        if (type.equals(scrum.client.files.File.ENTITY_TYPE)) {
            return updateFile(data);
        }
        if (type.equals(scrum.client.impediments.Impediment.ENTITY_TYPE)) {
            return updateImpediment(data);
        }
        if (type.equals(scrum.client.issues.Issue.ENTITY_TYPE)) {
            return updateIssue(data);
        }
        if (type.equals(scrum.client.project.Project.ENTITY_TYPE)) {
            return updateProject(data);
        }
        if (type.equals(scrum.client.journal.ProjectEvent.ENTITY_TYPE)) {
            return updateProjectEvent(data);
        }
        if (type.equals(scrum.client.admin.ProjectUserConfig.ENTITY_TYPE)) {
            return updateProjectUserConfig(data);
        }
        if (type.equals(scrum.client.project.Quality.ENTITY_TYPE)) {
            return updateQuality(data);
        }
        if (type.equals(scrum.client.release.Release.ENTITY_TYPE)) {
            return updateRelease(data);
        }
        if (type.equals(scrum.client.project.Requirement.ENTITY_TYPE)) {
            return updateRequirement(data);
        }
        if (type.equals(scrum.client.estimation.RequirementEstimationVote.ENTITY_TYPE)) {
            return updateRequirementEstimationVote(data);
        }
        if (type.equals(scrum.client.risks.Risk.ENTITY_TYPE)) {
            return updateRisk(data);
        }
        if (type.equals(scrum.client.calendar.SimpleEvent.ENTITY_TYPE)) {
            return updateSimpleEvent(data);
        }
        if (type.equals(scrum.client.sprint.Sprint.ENTITY_TYPE)) {
            return updateSprint(data);
        }
        if (type.equals(scrum.client.sprint.SprintReport.ENTITY_TYPE)) {
            return updateSprintReport(data);
        }
        if (type.equals(scrum.client.collaboration.Subject.ENTITY_TYPE)) {
            return updateSubject(data);
        }
        if (type.equals(scrum.client.pr.Subscription.ENTITY_TYPE)) {
            return updateSubscription(data);
        }
        if (type.equals(scrum.client.admin.SystemConfig.ENTITY_TYPE)) {
            return updateSystemConfig(data);
        }
        if (type.equals(scrum.client.sprint.Task.ENTITY_TYPE)) {
            return updateTask(data);
        }
        if (type.equals(scrum.client.admin.User.ENTITY_TYPE)) {
            return updateUser(data);
        }
        if (type.equals(scrum.client.collaboration.Wikipage.ENTITY_TYPE)) {
            return updateWikipage(data);
        }
       throw new RuntimeException("Unsupported type: " + type);
    }

    @Override
    public final Map<String, Integer> getEntityCounts() {
        Map<String, Integer> ret = new HashMap<String, Integer>();
        ret.put("BlogEntry", blogEntrys.size());
        ret.put("Change", changes.size());
        ret.put("ChatMessage", chatMessages.size());
        ret.put("Comment", comments.size());
        ret.put("Emoticon", emoticons.size());
        ret.put("File", files.size());
        ret.put("Impediment", impediments.size());
        ret.put("Issue", issues.size());
        ret.put("Project", projects.size());
        ret.put("ProjectEvent", projectEvents.size());
        ret.put("ProjectUserConfig", projectUserConfigs.size());
        ret.put("Quality", qualitys.size());
        ret.put("Release", releases.size());
        ret.put("Requirement", requirements.size());
        ret.put("RequirementEstimationVote", requirementEstimationVotes.size());
        ret.put("Risk", risks.size());
        ret.put("SimpleEvent", simpleEvents.size());
        ret.put("Sprint", sprints.size());
        ret.put("SprintReport", sprintReports.size());
        ret.put("Subject", subjects.size());
        ret.put("Subscription", subscriptions.size());
        ret.put("SystemConfig", systemConfigs.size());
        ret.put("Task", tasks.size());
        ret.put("User", users.size());
        ret.put("Wikipage", wikipages.size());
        return ret;
    }

}