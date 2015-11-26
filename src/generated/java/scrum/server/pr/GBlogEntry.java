// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.pr;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.auth.AuthUser;
import ilarkesto.core.base.Str;
import ilarkesto.core.persistance.EntityDoesNotExistException;

public abstract class GBlogEntry
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<BlogEntry>, ilarkesto.core.search.Searchable {

    public static class BlogEntryMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata project = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "project";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((BlogEntry)entity).getProject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata number = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "number";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((BlogEntry)entity).getNumber();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata authors = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "authors";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((BlogEntry)entity).getAuthors();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata title = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "title";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((BlogEntry)entity).getTitle();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata text = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "text";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((BlogEntry)entity).getText();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata dateAndTime = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "dateAndTime";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((BlogEntry)entity).getDateAndTime();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata releases = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "releases";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((BlogEntry)entity).getReleases();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata published = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "published";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((BlogEntry)entity).isPublished();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            project
            ,number
            ,authors
            ,title
            ,text
            ,dateAndTime
            ,releases
            ,published
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("project".equals(fieldName)) return project;
            if ("projectId".equals(fieldName)) return project;
            if ("number".equals(fieldName)) return number;
            if ("authors".equals(fieldName)) return authors;
            if ("authorsIds".equals(fieldName)) return authors;
            if ("title".equals(fieldName)) return title;
            if ("text".equals(fieldName)) return text;
            if ("dateAndTime".equals(fieldName)) return dateAndTime;
            if ("releases".equals(fieldName)) return releases;
            if ("releasesIds".equals(fieldName)) return releases;
            if ("published".equals(fieldName)) return published;
            return null;
        }

    }

    public static transient final BlogEntryMetadata metadata = new BlogEntryMetadata();

    @Override
    public BlogEntryMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(BlogEntry.class);

    // --- AEntity ---

    public final scrum.server.pr.BlogEntryDao getDao() {
        return blogEntryDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class ABlogEntryQuery extends ilarkesto.core.persistance.AEntityQuery<BlogEntry> {
    @Override
        public Class<BlogEntry> getType() {
            return BlogEntry.class;
        }
    }

    public static Set<BlogEntry> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(BlogEntry.class).list();
    }

    public static BlogEntry getById(String id) {
        return (BlogEntry) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getProject()); } catch(EntityDoesNotExistException ex) {}
        if (authorsIds!=null) for (String id : authorsIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        if (releasesIds!=null) for (String id : releasesIds) {
            try { ret.add(AEntity.getById(id)); } catch(EntityDoesNotExistException ex) {}
        }
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
        properties.put("authorsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorsIds));
        properties.put("title", ilarkesto.core.persistance.Persistence.propertyAsString(this.title));
        properties.put("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
        properties.put("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
        properties.put("releasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasesIds));
        properties.put("published", ilarkesto.core.persistance.Persistence.propertyAsString(this.published));
    }

    @Override
    public int compareTo(BlogEntry other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GBlogEntry.class);

    public static final String TYPE = "BlogEntry";


    // -----------------------------------------------------------
    // - Searchable
    // -----------------------------------------------------------

    @Override
    public boolean matches(ilarkesto.core.search.SearchText search) {
         return search.matches(getTitle(), getText());
    }
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
            throw ex.setCallerInfo("BlogEntry.project");
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
    // - number
    // -----------------------------------------------------------

    private int number;

    public final int getNumber() {
        return number;
    }

    public final void setNumber(int number) {
        number = prepareNumber(number);
        if (isNumber(number)) return;
        this.number = number;
            updateLastModified();
            fireModified("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
    }

    private final void updateNumber(int number) {
        if (isNumber(number)) return;
        this.number = number;
            updateLastModified();
            fireModified("number", ilarkesto.core.persistance.Persistence.propertyAsString(this.number));
    }

    protected int prepareNumber(int number) {
        return number;
    }

    public final boolean isNumber(int number) {
        return this.number == number;
    }

    protected final void updateNumber(Object value) {
        setNumber((Integer)value);
    }
    // -----------------------------------------------------------
    // - authors
    // -----------------------------------------------------------

    private java.util.Set<String> authorsIds = new java.util.HashSet<String>();

    public final Collection<String> getAuthorsIds() {
        return java.util.Collections .unmodifiableCollection(this.authorsIds);
    }

    public final java.util.Set<scrum.server.admin.User> getAuthors() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.authorsIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("BlogEntry.authors");
        }
    }

    public final void setAuthors(Collection<scrum.server.admin.User> authors) {
        authors = prepareAuthors(authors);
        if (authors == null) authors = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(authors);
        setAuthorsIds(ids);
    }

    public final void setAuthorsIds(java.util.Set<String> ids) {
        if (Utl.equals(authorsIds, ids)) return;
        authorsIds = ids;
            updateLastModified();
            fireModified("authorsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorsIds));
    }

    private final void updateAuthorsIds(java.util.Set<String> ids) {
        setAuthorsIds(ids);
    }

    protected Collection<scrum.server.admin.User> prepareAuthors(Collection<scrum.server.admin.User> authors) {
        return authors;
    }

    protected void repairDeadAuthorReference(String entityId) {
        if (!isPersisted()) return;
        if (this.authorsIds == null ) return;
        if (this.authorsIds.remove(entityId)) {
            updateLastModified();
            fireModified("authorsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorsIds));
        }
    }

    public final boolean containsAuthor(scrum.server.admin.User author) {
        if (author == null) return false;
        if (this.authorsIds == null) return false;
        return this.authorsIds.contains(author.getId());
    }

    public final int getAuthorsCount() {
        if (this.authorsIds == null) return 0;
        return this.authorsIds.size();
    }

    public final boolean isAuthorsEmpty() {
        if (this.authorsIds == null) return true;
        return this.authorsIds.isEmpty();
    }

    public final boolean addAuthor(scrum.server.admin.User author) {
        if (author == null) throw new IllegalArgumentException("author == null");
        if (this.authorsIds == null) this.authorsIds = new java.util.HashSet<String>();
        boolean added = this.authorsIds.add(author.getId());
        if (added) {
            updateLastModified();
            fireModified("authorsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorsIds));
        }
        return added;
    }

    public final boolean addAuthors(Collection<scrum.server.admin.User> authors) {
        if (authors == null) throw new IllegalArgumentException("authors == null");
        if (this.authorsIds == null) this.authorsIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.admin.User author : authors) {
            added = added | this.authorsIds.add(author.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("authorsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorsIds));
        }
        return added;
    }

    public final boolean removeAuthor(scrum.server.admin.User author) {
        if (author == null) return false;
        if (this.authorsIds == null) return false;
        boolean removed = this.authorsIds.remove(author.getId());
        if (removed) {
            updateLastModified();
            fireModified("authorsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorsIds));
        }
        return removed;
    }

    public final boolean removeAuthors(Collection<scrum.server.admin.User> authors) {
        if (authors == null) return false;
        if (authors.isEmpty()) return false;
        if (this.authorsIds == null) return false;
        boolean removed = false;
        for (scrum.server.admin.User _element: authors) {
            removed = removed | this.authorsIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("authorsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorsIds));
        }
        return removed;
    }

    public final boolean clearAuthors() {
        if (this.authorsIds == null) return false;
        if (this.authorsIds.isEmpty()) return false;
        this.authorsIds.clear();
            updateLastModified();
            fireModified("authorsIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorsIds));
        return true;
    }
    // -----------------------------------------------------------
    // - title
    // -----------------------------------------------------------

    private java.lang.String title;

    public final java.lang.String getTitle() {
        return title;
    }

    public final void setTitle(java.lang.String title) {
        title = prepareTitle(title);
        if (isTitle(title)) return;
        if (title == null) throw new IllegalArgumentException("Mandatory field can not be set to null: title");
        this.title = title;
            updateLastModified();
            fireModified("title", ilarkesto.core.persistance.Persistence.propertyAsString(this.title));
    }

    private final void updateTitle(java.lang.String title) {
        if (isTitle(title)) return;
        if (title == null) throw new IllegalArgumentException("Mandatory field can not be set to null: title");
        this.title = title;
            updateLastModified();
            fireModified("title", ilarkesto.core.persistance.Persistence.propertyAsString(this.title));
    }

    protected java.lang.String prepareTitle(java.lang.String title) {
         title = Str.removeControlChars(title);
        return title;
    }

    public final boolean isTitleSet() {
        return this.title != null;
    }

    public final boolean isTitle(java.lang.String title) {
        if (this.title == null && title == null) return true;
        return this.title != null && this.title.equals(title);
    }

    protected final void updateTitle(Object value) {
        setTitle((java.lang.String)value);
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
        this.text = text;
            updateLastModified();
            fireModified("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
    }

    private final void updateText(java.lang.String text) {
        if (isText(text)) return;
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
    // -----------------------------------------------------------
    // - releases
    // -----------------------------------------------------------

    private java.util.Set<String> releasesIds = new java.util.HashSet<String>();

    public final Collection<String> getReleasesIds() {
        return java.util.Collections .unmodifiableCollection(this.releasesIds);
    }

    public final java.util.Set<scrum.server.release.Release> getReleases() {
        try {
            return (java.util.Set) AEntity.getByIdsAsSet(this.releasesIds);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("BlogEntry.releases");
        }
    }

    public final void setReleases(Collection<scrum.server.release.Release> releases) {
        releases = prepareReleases(releases);
        if (releases == null) releases = Collections.emptyList();
        java.util.Set<String> ids = getIdsAsSet(releases);
        setReleasesIds(ids);
    }

    public final void setReleasesIds(java.util.Set<String> ids) {
        if (Utl.equals(releasesIds, ids)) return;
        releasesIds = ids;
            updateLastModified();
            fireModified("releasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasesIds));
    }

    private final void updateReleasesIds(java.util.Set<String> ids) {
        setReleasesIds(ids);
    }

    protected Collection<scrum.server.release.Release> prepareReleases(Collection<scrum.server.release.Release> releases) {
        return releases;
    }

    protected void repairDeadReleaseReference(String entityId) {
        if (!isPersisted()) return;
        if (this.releasesIds == null ) return;
        if (this.releasesIds.remove(entityId)) {
            updateLastModified();
            fireModified("releasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasesIds));
        }
    }

    public final boolean containsRelease(scrum.server.release.Release release) {
        if (release == null) return false;
        if (this.releasesIds == null) return false;
        return this.releasesIds.contains(release.getId());
    }

    public final int getReleasesCount() {
        if (this.releasesIds == null) return 0;
        return this.releasesIds.size();
    }

    public final boolean isReleasesEmpty() {
        if (this.releasesIds == null) return true;
        return this.releasesIds.isEmpty();
    }

    public final boolean addRelease(scrum.server.release.Release release) {
        if (release == null) throw new IllegalArgumentException("release == null");
        if (this.releasesIds == null) this.releasesIds = new java.util.HashSet<String>();
        boolean added = this.releasesIds.add(release.getId());
        if (added) {
            updateLastModified();
            fireModified("releasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasesIds));
        }
        return added;
    }

    public final boolean addReleases(Collection<scrum.server.release.Release> releases) {
        if (releases == null) throw new IllegalArgumentException("releases == null");
        if (this.releasesIds == null) this.releasesIds = new java.util.HashSet<String>();
        boolean added = false;
        for (scrum.server.release.Release release : releases) {
            added = added | this.releasesIds.add(release.getId());
        }
        if (added) {
            updateLastModified();
            fireModified("releasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasesIds));
        }
        return added;
    }

    public final boolean removeRelease(scrum.server.release.Release release) {
        if (release == null) return false;
        if (this.releasesIds == null) return false;
        boolean removed = this.releasesIds.remove(release.getId());
        if (removed) {
            updateLastModified();
            fireModified("releasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasesIds));
        }
        return removed;
    }

    public final boolean removeReleases(Collection<scrum.server.release.Release> releases) {
        if (releases == null) return false;
        if (releases.isEmpty()) return false;
        if (this.releasesIds == null) return false;
        boolean removed = false;
        for (scrum.server.release.Release _element: releases) {
            removed = removed | this.releasesIds.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("releasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasesIds));
        }
        return removed;
    }

    public final boolean clearReleases() {
        if (this.releasesIds == null) return false;
        if (this.releasesIds.isEmpty()) return false;
        this.releasesIds.clear();
            updateLastModified();
            fireModified("releasesIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.releasesIds));
        return true;
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

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) updateProjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("number")) updateNumber(ilarkesto.core.persistance.Persistence.parsePropertyint(value));
            if (property.equals("authorsIds")) updateAuthorsIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("title")) updateTitle(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("text")) updateText(ilarkesto.core.persistance.Persistence.parsePropertyString(value));
            if (property.equals("dateAndTime")) updateDateAndTime(ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value));
            if (property.equals("releasesIds")) updateReleasesIds(ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value));
            if (property.equals("published")) updatePublished(ilarkesto.core.persistance.Persistence.parsePropertyboolean(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadProjectReference(entityId);
        if (this.authorsIds == null) this.authorsIds = new java.util.HashSet<String>();
        repairDeadAuthorReference(entityId);
        if (this.releasesIds == null) this.releasesIds = new java.util.HashSet<String>();
        repairDeadReleaseReference(entityId);
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
        if (this.authorsIds == null) this.authorsIds = new java.util.HashSet<String>();
        Set<String> authors = new HashSet<String>(this.authorsIds);
        for (String entityId : authors) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead author reference");
                repairDeadAuthorReference(entityId);
            }
        }
        if (this.releasesIds == null) this.releasesIds = new java.util.HashSet<String>();
        Set<String> releases = new HashSet<String>(this.releasesIds);
        for (String entityId : releases) {
            try {
                AEntity.getById(entityId);
            } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
                LOG.info("Repairing dead release reference");
                repairDeadReleaseReference(entityId);
            }
        }
    }


    // -----------------------------------------------------------
    // - dependencies
    // -----------------------------------------------------------

    static scrum.server.project.ProjectDao projectDao;

    public static final void setProjectDao(scrum.server.project.ProjectDao projectDao) {
        GBlogEntry.projectDao = projectDao;
    }

    static scrum.server.admin.UserDao userDao;

    public static final void setUserDao(scrum.server.admin.UserDao userDao) {
        GBlogEntry.userDao = userDao;
    }

    static scrum.server.release.ReleaseDao releaseDao;

    public static final void setReleaseDao(scrum.server.release.ReleaseDao releaseDao) {
        GBlogEntry.releaseDao = releaseDao;
    }

    static scrum.server.pr.BlogEntryDao blogEntryDao;

    public static final void setBlogEntryDao(scrum.server.pr.BlogEntryDao blogEntryDao) {
        GBlogEntry.blogEntryDao = blogEntryDao;
    }

}