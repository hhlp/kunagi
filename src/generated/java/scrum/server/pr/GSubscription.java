// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.EntityGenerator










package scrum.server.pr;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import ilarkesto.persistence.ADatob;
import ilarkesto.persistence.AEntity;
import ilarkesto.persistence.AStructure;
import ilarkesto.auth.AUser;
import ilarkesto.core.base.Str;

public abstract class GSubscription
            extends AEntity
            implements ilarkesto.auth.ViewProtected<scrum.server.admin.User>, java.lang.Comparable<Subscription> {

    protected static final ilarkesto.core.logging.Log log = ilarkesto.core.logging.Log.get(Subscription.class);

    // --- AEntity ---

    public final scrum.server.pr.SubscriptionDao getDao() {
        return subscriptionDao;
    }

    protected void repairDeadDatob(ADatob datob) {
    }

    @Override
    public void storeProperties(Map properties) {
        super.storeProperties(properties);
        properties.put("subjectId", this.subjectId);
        properties.put("subscribersEmails", this.subscribersEmails);
    }

    public int compareTo(Subscription other) {
        return toString().toLowerCase().compareTo(other.toString().toLowerCase());
    }

    private static final ilarkesto.core.logging.Log LOG = ilarkesto.core.logging.Log.get(GSubscription.class);

    public static final String TYPE = "subscription";

    // -----------------------------------------------------------
    // - subject
    // -----------------------------------------------------------

    private String subjectId;
    private transient ilarkesto.persistence.AEntity subjectCache;

    private void updateSubjectCache() {
        subjectCache = this.subjectId == null ? null : (ilarkesto.persistence.AEntity)getDaoService().getById(this.subjectId);
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final ilarkesto.persistence.AEntity getSubject() {
        if (subjectCache == null) updateSubjectCache();
        return subjectCache;
    }

    public final void setSubject(ilarkesto.persistence.AEntity subject) {
        subject = prepareSubject(subject);
        if (isSubject(subject)) return;
        setSubjectId(subject == null ? null : subject.getId());
        subjectCache = subject;
    }

    public final void setSubjectId(String id) {
        if (Utl.equals(subjectId, id)) return;
        this.subjectId = id;
        subjectCache = null;
        updateLastModified();
        fireModified("subjectId", this.subjectId);
    }

    protected ilarkesto.persistence.AEntity prepareSubject(ilarkesto.persistence.AEntity subject) {
        return subject;
    }

    protected void repairDeadSubjectReference(String entityId) {
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
        fireModified("subscribersEmails", this.subscribersEmails);
    }

    protected Collection<java.lang.String> prepareSubscribersEmails(Collection<java.lang.String> subscribersEmails) {
        return subscribersEmails;
    }

    public final boolean containsSubscribersEmail(java.lang.String subscribersEmail) {
        if (subscribersEmail == null) return false;
        return this.subscribersEmails.contains(subscribersEmail);
    }

    public final int getSubscribersEmailsCount() {
        return this.subscribersEmails.size();
    }

    public final boolean isSubscribersEmailsEmpty() {
        return this.subscribersEmails.isEmpty();
    }

    public final boolean addSubscribersEmail(java.lang.String subscribersEmail) {
        if (subscribersEmail == null) throw new IllegalArgumentException("subscribersEmail == null");
        boolean added = this.subscribersEmails.add(subscribersEmail);
        if (added) updateLastModified();
        if (added) {
        fireModified("subscribersEmails", this.subscribersEmails);
        }
        return added;
    }

    public final boolean addSubscribersEmails(Collection<java.lang.String> subscribersEmails) {
        if (subscribersEmails == null) throw new IllegalArgumentException("subscribersEmails == null");
        boolean added = false;
        for (java.lang.String subscribersEmail : subscribersEmails) {
            added = added | this.subscribersEmails.add(subscribersEmail);
        }
        if (added) {
        fireModified("subscribersEmails", this.subscribersEmails);
        }
        return added;
    }

    public final boolean removeSubscribersEmail(java.lang.String subscribersEmail) {
        if (subscribersEmail == null) return false;
        if (this.subscribersEmails == null) return false;
        boolean removed = this.subscribersEmails.remove(subscribersEmail);
        if (removed) updateLastModified();
        if (removed) {
        fireModified("subscribersEmails", this.subscribersEmails);
        }
        return removed;
    }

    public final boolean removeSubscribersEmails(Collection<java.lang.String> subscribersEmails) {
        if (subscribersEmails == null) return false;
        if (subscribersEmails.isEmpty()) return false;
        boolean removed = false;
        for (java.lang.String _element: subscribersEmails) {
            removed = removed | this.subscribersEmails.remove(_element);
        }
        if (removed) {
        fireModified("subscribersEmails", this.subscribersEmails);
        }
        return removed;
    }

    public final boolean clearSubscribersEmails() {
        if (this.subscribersEmails.isEmpty()) return false;
        this.subscribersEmails.clear();
        updateLastModified();
        fireModified("subscribersEmails", this.subscribersEmails);
        return true;
    }

    public final String getSubscribersEmailsAsCommaSeparatedString() {
        if (this.subscribersEmails.isEmpty()) return null;
        return Str.concat(this.subscribersEmails,", ");
    }

    public final void setSubscribersEmailsAsCommaSeparatedString(String subscribersEmails) {
        setSubscribersEmails(Str.parseCommaSeparatedString(subscribersEmails));
    }

    protected final void updateSubscribersEmails(Object value) {
        setSubscribersEmails((java.util.Set<java.lang.String>) value);
    }

    public void updateProperties(Map<?, ?> properties) {
        for (Map.Entry entry : properties.entrySet()) {
            String property = (String) entry.getKey();
            if (property.equals("id")) continue;
            Object value = entry.getValue();
            if (property.equals("subjectId")) updateSubject(value);
            if (property.equals("subscribersEmails")) updateSubscribersEmails(value);
        }
    }

    protected void repairDeadReferences(String entityId) {
        super.repairDeadReferences(entityId);
        repairDeadSubjectReference(entityId);
        if (this.subscribersEmails == null) this.subscribersEmails = new java.util.HashSet<java.lang.String>();
    }

    // --- ensure integrity ---
    @Override
    public void ensureIntegrity() {
        super.ensureIntegrity();
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