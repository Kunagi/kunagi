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

public abstract class GSubscription
            extends ilarkesto.persistence.AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<Subscription> {

    public static class SubscriptionMetadata implements ilarkesto.core.persistance.meta.EntityMetadata {

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata subject = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "subject";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Subscription)entity).getSubject();
            }

        };

        public static transient final ilarkesto.core.persistance.meta.EntityFieldMetadata subscribersEmails = new ilarkesto.core.persistance.meta.EntityFieldMetadata() {

            public static final String name = "subscribersEmails";
            public static final String label = "null";

            public String getName() { return name; };

            public String getLabel() { return label; };

            public Object getValue(ilarkesto.core.persistance.Entity entity) {
                return ((Subscription)entity).getSubscribersEmails();
            }

        };

        public static transient ilarkesto.core.persistance.meta.EntityFieldMetadata[] fields = new ilarkesto.core.persistance.meta.EntityFieldMetadata[] {
            subject
            ,subscribersEmails
        };

        public ilarkesto.core.persistance.meta.EntityFieldMetadata[] getFields() {
            return fields;
        }

        public ilarkesto.core.persistance.meta.EntityFieldMetadata getField(String fieldName) {
            if ("subject".equals(fieldName)) return subject;
            if ("subjectId".equals(fieldName)) return subject;
            if ("subscribersEmails".equals(fieldName)) return subscribersEmails;
            return null;
        }

    }

    public static transient final SubscriptionMetadata metadata = new SubscriptionMetadata();

    @Override
    public SubscriptionMetadata getMetadata() { return metadata; };

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Subscription.class);

    // --- AEntity ---

    public final scrum.server.pr.SubscriptionDao getDao() {
        return subscriptionDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    public abstract static class ASubscriptionQuery extends ilarkesto.core.persistance.AEntityQuery<Subscription> {
    @Override
        public Class<Subscription> getType() {
            return Subscription.class;
        }
    }

    public static Set<Subscription> listAll() {
        return new ilarkesto.core.persistance.AllByTypeQuery(Subscription.class).list();
    }

    public static Subscription getById(String id) {
        return (Subscription) AEntity.getById(id);
    }

    @Override
    public Set<ilarkesto.core.persistance.Entity> getReferencedEntities() {
        Set<ilarkesto.core.persistance.Entity> ret = super.getReferencedEntities();
    // --- references ---
        try { Utl.addIfNotNull(ret, getSubject()); } catch(EntityDoesNotExistException ex) {}
        return ret;
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("subjectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.subjectId));
        properties.put("subscribersEmails", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscribersEmails));
    }

    @Override
    public int compareTo(Subscription other) {
        return ilarkesto.core.localization.GermanComparator.INSTANCE.compare(toString(), other.toString());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GSubscription.class);

    public static final String TYPE = "Subscription";
    // -----------------------------------------------------------
    // - subject
    // -----------------------------------------------------------

    private String subjectId;

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final ilarkesto.persistence.AEntity getSubject() {
        try {
            return this.subjectId == null ? null : (ilarkesto.persistence.AEntity) AEntity.getById(this.subjectId);
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            throw ex.setCallerInfo("Subscription.subject");
        }
    }

    public final void setSubject(ilarkesto.persistence.AEntity subject) {
        subject = prepareSubject(subject);
        if (isSubject(subject)) return;
        setSubjectId(subject == null ? null : subject.getId());
    }

    public final void setSubjectId(String id) {
        if (Utl.equals(subjectId, id)) return;
        this.subjectId = id;
            updateLastModified();
            fireModified("subjectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.subjectId));
    }

    private final void updateSubjectId(String id) {
        setSubjectId(id);
    }

    protected ilarkesto.persistence.AEntity prepareSubject(ilarkesto.persistence.AEntity subject) {
        return subject;
    }

    protected void repairDeadSubjectReference(String entityId) {
        if (!isPersisted()) return;
        if (this.subjectId == null || entityId.equals(this.subjectId)) {
            repairMissingMaster();
        }
    }

    public final boolean isSubjectSet() {
        return this.subjectId != null;
    }

    public final boolean isSubject(ilarkesto.persistence.AEntity subject) {
        if (this.subjectId == null && subject == null) return true;
        return subject != null && subject.getId().equals(this.subjectId);
    }

    protected final void updateSubject(Object value) {
        setSubject(value == null ? null : (ilarkesto.persistence.AEntity)getDaoService().getById((String)value));
    }
    // -----------------------------------------------------------
    // - subscribersEmails
    // -----------------------------------------------------------

    private java.util.Set<java.lang.String> subscribersEmails = new java.util.HashSet<java.lang.String>();

    public final java.util.Set<java.lang.String> getSubscribersEmails() {
        return new java.util.HashSet<java.lang.String>(subscribersEmails);
    }

    public final void setSubscribersEmails(Collection<java.lang.String> subscribersEmails) {
        subscribersEmails = prepareSubscribersEmails(subscribersEmails);
        if (subscribersEmails == null) subscribersEmails = Collections.emptyList();
        if (this.subscribersEmails.equals(subscribersEmails)) return;
        this.subscribersEmails = new java.util.HashSet<java.lang.String>(subscribersEmails);
            updateLastModified();
            fireModified("subscribersEmails", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscribersEmails));
    }

    private final void updateSubscribersEmails(Collection<java.lang.String> subscribersEmails) {
        if (subscribersEmails == null) subscribersEmails = Collections.emptyList();
        if (this.subscribersEmails.equals(subscribersEmails)) return;
        this.subscribersEmails = new java.util.HashSet<java.lang.String>(subscribersEmails);
            updateLastModified();
            fireModified("subscribersEmails", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscribersEmails));
    }

    protected Collection<java.lang.String> prepareSubscribersEmails(Collection<java.lang.String> subscribersEmails) {
        return subscribersEmails;
    }

    public final boolean containsSubscribersEmail(java.lang.String subscribersEmail) {
        if (subscribersEmail == null) return false;
        if (this.subscribersEmails == null) return false;
        return this.subscribersEmails.contains(subscribersEmail);
    }

    public final int getSubscribersEmailsCount() {
        if (this.subscribersEmails == null) return 0;
        return this.subscribersEmails.size();
    }

    public final boolean isSubscribersEmailsEmpty() {
        if (this.subscribersEmails == null) return true;
        return this.subscribersEmails.isEmpty();
    }

    public final boolean addSubscribersEmail(java.lang.String subscribersEmail) {
        if (subscribersEmail == null) throw new IllegalArgumentException("subscribersEmail == null");
        if (this.subscribersEmails == null) this.subscribersEmails = new java.util.HashSet<java.lang.String>();
        boolean added = this.subscribersEmails.add(subscribersEmail);
        if (added) {
            updateLastModified();
            fireModified("subscribersEmails", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscribersEmails));
        }
        return added;
    }

    public final boolean addSubscribersEmails(Collection<java.lang.String> subscribersEmails) {
        if (subscribersEmails == null) throw new IllegalArgumentException("subscribersEmails == null");
        if (this.subscribersEmails == null) this.subscribersEmails = new java.util.HashSet<java.lang.String>();
        boolean added = false;
        for (java.lang.String subscribersEmail : subscribersEmails) {
            added = added | this.subscribersEmails.add(subscribersEmail);
        }
        if (added) {
            updateLastModified();
            fireModified("subscribersEmails", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscribersEmails));
        }
        return added;
    }

    public final boolean removeSubscribersEmail(java.lang.String subscribersEmail) {
        if (subscribersEmail == null) return false;
        if (this.subscribersEmails == null) return false;
        boolean removed = this.subscribersEmails.remove(subscribersEmail);
        if (removed) {
            updateLastModified();
            fireModified("subscribersEmails", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscribersEmails));
        }
        return removed;
    }

    public final boolean removeSubscribersEmails(Collection<java.lang.String> subscribersEmails) {
        if (subscribersEmails == null) return false;
        if (subscribersEmails.isEmpty()) return false;
        if (this.subscribersEmails == null) return false;
        boolean removed = false;
        for (java.lang.String _element: subscribersEmails) {
            removed = removed | this.subscribersEmails.remove(_element);
        }
        if (removed) {
            updateLastModified();
            fireModified("subscribersEmails", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscribersEmails));
        }
        return removed;
    }

    public final boolean clearSubscribersEmails() {
        if (this.subscribersEmails == null) return false;
        if (this.subscribersEmails.isEmpty()) return false;
        this.subscribersEmails.clear();
            updateLastModified();
            fireModified("subscribersEmails", ilarkesto.core.persistance.Persistence.propertyAsString(this.subscribersEmails));
        return true;
    }

    public final String getSubscribersEmailsAsCommaSeparatedString() {
        if (this.subscribersEmails == null) return null;
        if (this.subscribersEmails.isEmpty()) return null;
        return Str.concat(this.subscribersEmails,", ");
    }

    public final void setSubscribersEmailsAsCommaSeparatedString(String subscribersEmails) {
        setSubscribersEmails(Str.parseCommaSeparatedString(subscribersEmails));
    }

    public void updateProperties(Map<String, String> properties) {
        super.updateProperties(properties);
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("subjectId")) updateSubjectId(ilarkesto.core.persistance.Persistence.parsePropertyReference(value));
            if (property.equals("subscribersEmails")) updateSubscribersEmails(ilarkesto.core.persistance.Persistence.parsePropertyStringCollection(value));
        }
    }

    protected void repairDeadReferences(String entityId) {
        if (!isPersisted()) return;
        super.repairDeadReferences(entityId);
        repairDeadSubjectReference(entityId);
        if (this.subscribersEmails == null) this.subscribersEmails = new java.util.HashSet<java.lang.String>();
    }

    // --- ensure integrity ---
    @Override
    public void onEnsureIntegrity() {
        super.onEnsureIntegrity();
        if (!isSubjectSet()) {
            repairMissingMaster();
        }
        try {
            getSubject();
        } catch (ilarkesto.core.persistance.EntityDoesNotExistException ex) {
            LOG.info("Repairing dead subject reference");
            repairDeadSubjectReference(this.subjectId);
        }
        if (this.subscribersEmails == null) this.subscribersEmails = new java.util.HashSet<java.lang.String>();
    }

    static scrum.server.pr.SubscriptionDao subscriptionDao;

    public static final void setSubscriptionDao(scrum.server.pr.SubscriptionDao subscriptionDao) {
        GSubscription.subscriptionDao = subscriptionDao;
    }

}