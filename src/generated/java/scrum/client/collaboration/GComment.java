// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtEntityGenerator










package scrum.client.collaboration;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import scrum.client.common.*;
import ilarkesto.gwt.client.*;

public abstract class GComment
            extends scrum.client.common.AScrumGwtEntity {

    protected scrum.client.Dao getDao() {
        return scrum.client.Dao.get();
    }

    @Override
    protected void doPersist() {
        getDao().createComment((Comment)this);
    }

    @Override
    public void delete() {
        getDao().deleteComment((Comment)this);
    }

    public abstract boolean isEditable();

    public GComment() {
    }

    public GComment(Map data) {
        super(data);
        updateProperties(data);
    }

    public static final String ENTITY_TYPE = "Comment";

    @Override
    public final String getEntityType() {
        return ENTITY_TYPE;
    }

    // --- parent ---

    private String parentId;

    public final ilarkesto.gwt.client.AGwtEntity getParent() {
        if (parentId == null) return null;
        return getDao().getEntity(this.parentId);
    }

    public final boolean isParentSet() {
        return parentId != null;
    }

    public final Comment setParent(ilarkesto.gwt.client.AGwtEntity parent) {
        String id = parent == null ? null : parent.getId();
        if (ilarkesto.core.base.Utl.equals(this.parentId, id)) return (Comment) this;
        this.parentId = id;
        propertyChanged("parentId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentId));
        return (Comment)this;
    }

    public final boolean isParent(ilarkesto.gwt.client.AGwtEntity parent) {
        String id = parent==null ? null : parent.getId();
        return ilarkesto.core.base.Utl.equals(this.parentId, id);
    }

    // --- author ---

    private String authorId;

    public final scrum.client.admin.User getAuthor() {
        if (authorId == null) return null;
        return getDao().getUser(this.authorId);
    }

    public final boolean isAuthorSet() {
        return authorId != null;
    }

    public final Comment setAuthor(scrum.client.admin.User author) {
        String id = author == null ? null : author.getId();
        if (ilarkesto.core.base.Utl.equals(this.authorId, id)) return (Comment) this;
        this.authorId = id;
        propertyChanged("authorId", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorId));
        return (Comment)this;
    }

    public final boolean isAuthor(scrum.client.admin.User author) {
        String id = author==null ? null : author.getId();
        return ilarkesto.core.base.Utl.equals(this.authorId, id);
    }

    // --- published ---

    private boolean published ;

    public final boolean isPublished() {
        return this.published ;
    }

    public final Comment setPublished(boolean published) {
        if (isPublished(published)) return (Comment)this;
        this.published = published ;
        propertyChanged("published", ilarkesto.core.persistance.Persistence.propertyAsString(this.published));
        return (Comment)this;
    }

    public final boolean isPublished(boolean published) {
        return ilarkesto.core.base.Utl.equals(this.published, published);
    }

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

    // --- authorName ---

    private java.lang.String authorName ;

    public final java.lang.String getAuthorName() {
        return this.authorName ;
    }

    public final Comment setAuthorName(java.lang.String authorName) {
        if (isAuthorName(authorName)) return (Comment)this;
        this.authorName = authorName ;
        propertyChanged("authorName", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorName));
        return (Comment)this;
    }

    public final boolean isAuthorName(java.lang.String authorName) {
        return ilarkesto.core.base.Utl.equals(this.authorName, authorName);
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

    // --- authorEmail ---

    private java.lang.String authorEmail ;

    public final java.lang.String getAuthorEmail() {
        return this.authorEmail ;
    }

    public final Comment setAuthorEmail(java.lang.String authorEmail) {
        if (isAuthorEmail(authorEmail)) return (Comment)this;
        this.authorEmail = authorEmail ;
        propertyChanged("authorEmail", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorEmail));
        return (Comment)this;
    }

    public final boolean isAuthorEmail(java.lang.String authorEmail) {
        return ilarkesto.core.base.Utl.equals(this.authorEmail, authorEmail);
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

    // --- authorNameVisible ---

    private boolean authorNameVisible ;

    public final boolean isAuthorNameVisible() {
        return this.authorNameVisible ;
    }

    public final Comment setAuthorNameVisible(boolean authorNameVisible) {
        if (isAuthorNameVisible(authorNameVisible)) return (Comment)this;
        this.authorNameVisible = authorNameVisible ;
        propertyChanged("authorNameVisible", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorNameVisible));
        return (Comment)this;
    }

    public final boolean isAuthorNameVisible(boolean authorNameVisible) {
        return ilarkesto.core.base.Utl.equals(this.authorNameVisible, authorNameVisible);
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

    // --- text ---

    private java.lang.String text ;

    public final java.lang.String getText() {
        return this.text ;
    }

    public final Comment setText(java.lang.String text) {
        if (isText(text)) return (Comment)this;
        if (ilarkesto.core.base.Str.isBlank(text)) throw new RuntimeException("Field is mandatory.");
        this.text = text ;
        propertyChanged("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
        return (Comment)this;
    }

    public final boolean isText(java.lang.String text) {
        return ilarkesto.core.base.Utl.equals(this.text, text);
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

    // --- dateAndTime ---

    private ilarkesto.core.time.DateAndTime dateAndTime ;

    public final ilarkesto.core.time.DateAndTime getDateAndTime() {
        return this.dateAndTime ;
    }

    public final Comment setDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        if (isDateAndTime(dateAndTime)) return (Comment)this;
        this.dateAndTime = dateAndTime ;
        propertyChanged("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
        return (Comment)this;
    }

    public final boolean isDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        return ilarkesto.core.base.Utl.equals(this.dateAndTime, dateAndTime);
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

    // --- update properties by map ---

    public void updateProperties(Map<String, String> properties) {
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("parentId")) parentId = ilarkesto.core.persistance.Persistence.parsePropertyReference(value);
            if (property.equals("authorId")) authorId = ilarkesto.core.persistance.Persistence.parsePropertyReference(value);
            if (property.equals("published")) published = ilarkesto.core.persistance.Persistence.parsePropertyboolean(value);
            if (property.equals("authorName")) authorName = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
            if (property.equals("authorEmail")) authorEmail = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
            if (property.equals("authorNameVisible")) authorNameVisible = ilarkesto.core.persistance.Persistence.parsePropertyboolean(value);
            if (property.equals("text")) text = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
            if (property.equals("dateAndTime")) dateAndTime = ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value);
        }
        updateLastModified();
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
    public boolean matchesKey(String key) {
        if (super.matchesKey(key)) return true;
        if (matchesKey(getText(), key)) return true;
        return false;
    }

}