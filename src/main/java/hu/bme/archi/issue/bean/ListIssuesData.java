package hu.bme.archi.issue.bean;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import hu.bme.archi.issue.domain.Priority;
import hu.bme.archi.issue.domain.Severity;
import hu.bme.archi.issue.domain.Status;
import hu.bme.archi.issue.domain.Type;

@BeanDefinition
public class ListIssuesData implements Bean {
    
    @PropertyDefinition
    private Long id;
    @PropertyDefinition
    private String name;
    @PropertyDefinition
    private String description;
    @PropertyDefinition
    private String reproductionSteps;
    @PropertyDefinition
    private String version;
    @PropertyDefinition
    private Type type;
    @PropertyDefinition
    private Status status;
    @PropertyDefinition
    private Priority priority;
    @PropertyDefinition
    private Severity severity;
    @PropertyDefinition
    private Calendar creationTimeStamp;
    @PropertyDefinition
    User assignee;
    @PropertyDefinition
    private List<Comment> comment;
    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ListIssuesData}.
     * @return the meta-bean, not null
     */
    public static ListIssuesData.Meta meta() {
        return ListIssuesData.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ListIssuesData.Meta.INSTANCE);
    }

    @Override
    public ListIssuesData.Meta metaBean() {
        return ListIssuesData.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the id.
     * @return the value of the property
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     * @param id  the new value of the property
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the the {@code id} property.
     * @return the property, not null
     */
    public final Property<Long> id() {
        return metaBean().id().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the name.
     * @return the value of the property
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * @param name  the new value of the property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the the {@code name} property.
     * @return the property, not null
     */
    public final Property<String> name() {
        return metaBean().name().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the description.
     * @return the value of the property
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * @param description  the new value of the property
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the the {@code description} property.
     * @return the property, not null
     */
    public final Property<String> description() {
        return metaBean().description().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the reproductionSteps.
     * @return the value of the property
     */
    public String getReproductionSteps() {
        return reproductionSteps;
    }

    /**
     * Sets the reproductionSteps.
     * @param reproductionSteps  the new value of the property
     */
    public void setReproductionSteps(String reproductionSteps) {
        this.reproductionSteps = reproductionSteps;
    }

    /**
     * Gets the the {@code reproductionSteps} property.
     * @return the property, not null
     */
    public final Property<String> reproductionSteps() {
        return metaBean().reproductionSteps().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the version.
     * @return the value of the property
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version.
     * @param version  the new value of the property
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the the {@code version} property.
     * @return the property, not null
     */
    public final Property<String> version() {
        return metaBean().version().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the type.
     * @return the value of the property
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the type.
     * @param type  the new value of the property
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Gets the the {@code type} property.
     * @return the property, not null
     */
    public final Property<Type> type() {
        return metaBean().type().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the status.
     * @return the value of the property
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * @param status  the new value of the property
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Gets the the {@code status} property.
     * @return the property, not null
     */
    public final Property<Status> status() {
        return metaBean().status().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the priority.
     * @return the value of the property
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the priority.
     * @param priority  the new value of the property
     */
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    /**
     * Gets the the {@code priority} property.
     * @return the property, not null
     */
    public final Property<Priority> priority() {
        return metaBean().priority().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the severity.
     * @return the value of the property
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Sets the severity.
     * @param severity  the new value of the property
     */
    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    /**
     * Gets the the {@code severity} property.
     * @return the property, not null
     */
    public final Property<Severity> severity() {
        return metaBean().severity().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the creationTimeStamp.
     * @return the value of the property
     */
    public Calendar getCreationTimeStamp() {
        return creationTimeStamp;
    }

    /**
     * Sets the creationTimeStamp.
     * @param creationTimeStamp  the new value of the property
     */
    public void setCreationTimeStamp(Calendar creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }

    /**
     * Gets the the {@code creationTimeStamp} property.
     * @return the property, not null
     */
    public final Property<Calendar> creationTimeStamp() {
        return metaBean().creationTimeStamp().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the assignee.
     * @return the value of the property
     */
    public User getAssignee() {
        return assignee;
    }

    /**
     * Sets the assignee.
     * @param assignee  the new value of the property
     */
    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    /**
     * Gets the the {@code assignee} property.
     * @return the property, not null
     */
    public final Property<User> assignee() {
        return metaBean().assignee().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the comment.
     * @return the value of the property
     */
    public List<Comment> getComment() {
        return comment;
    }

    /**
     * Sets the comment.
     * @param comment  the new value of the property
     */
    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    /**
     * Gets the the {@code comment} property.
     * @return the property, not null
     */
    public final Property<List<Comment>> comment() {
        return metaBean().comment().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public ListIssuesData clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ListIssuesData other = (ListIssuesData) obj;
            return JodaBeanUtils.equal(getId(), other.getId()) &&
                    JodaBeanUtils.equal(getName(), other.getName()) &&
                    JodaBeanUtils.equal(getDescription(), other.getDescription()) &&
                    JodaBeanUtils.equal(getReproductionSteps(), other.getReproductionSteps()) &&
                    JodaBeanUtils.equal(getVersion(), other.getVersion()) &&
                    JodaBeanUtils.equal(getType(), other.getType()) &&
                    JodaBeanUtils.equal(getStatus(), other.getStatus()) &&
                    JodaBeanUtils.equal(getPriority(), other.getPriority()) &&
                    JodaBeanUtils.equal(getSeverity(), other.getSeverity()) &&
                    JodaBeanUtils.equal(getCreationTimeStamp(), other.getCreationTimeStamp()) &&
                    JodaBeanUtils.equal(getAssignee(), other.getAssignee()) &&
                    JodaBeanUtils.equal(getComment(), other.getComment());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getName());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDescription());
        hash = hash * 31 + JodaBeanUtils.hashCode(getReproductionSteps());
        hash = hash * 31 + JodaBeanUtils.hashCode(getVersion());
        hash = hash * 31 + JodaBeanUtils.hashCode(getType());
        hash = hash * 31 + JodaBeanUtils.hashCode(getStatus());
        hash = hash * 31 + JodaBeanUtils.hashCode(getPriority());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSeverity());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCreationTimeStamp());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAssignee());
        hash = hash * 31 + JodaBeanUtils.hashCode(getComment());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(416);
        buf.append("ListIssuesData{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("id").append('=').append(JodaBeanUtils.toString(getId())).append(',').append(' ');
        buf.append("name").append('=').append(JodaBeanUtils.toString(getName())).append(',').append(' ');
        buf.append("description").append('=').append(JodaBeanUtils.toString(getDescription())).append(',').append(' ');
        buf.append("reproductionSteps").append('=').append(JodaBeanUtils.toString(getReproductionSteps())).append(',').append(' ');
        buf.append("version").append('=').append(JodaBeanUtils.toString(getVersion())).append(',').append(' ');
        buf.append("type").append('=').append(JodaBeanUtils.toString(getType())).append(',').append(' ');
        buf.append("status").append('=').append(JodaBeanUtils.toString(getStatus())).append(',').append(' ');
        buf.append("priority").append('=').append(JodaBeanUtils.toString(getPriority())).append(',').append(' ');
        buf.append("severity").append('=').append(JodaBeanUtils.toString(getSeverity())).append(',').append(' ');
        buf.append("creationTimeStamp").append('=').append(JodaBeanUtils.toString(getCreationTimeStamp())).append(',').append(' ');
        buf.append("assignee").append('=').append(JodaBeanUtils.toString(getAssignee())).append(',').append(' ');
        buf.append("comment").append('=').append(JodaBeanUtils.toString(getComment())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ListIssuesData}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code id} property.
         */
        private final MetaProperty<Long> id = DirectMetaProperty.ofReadWrite(
                this, "id", ListIssuesData.class, Long.class);
        /**
         * The meta-property for the {@code name} property.
         */
        private final MetaProperty<String> name = DirectMetaProperty.ofReadWrite(
                this, "name", ListIssuesData.class, String.class);
        /**
         * The meta-property for the {@code description} property.
         */
        private final MetaProperty<String> description = DirectMetaProperty.ofReadWrite(
                this, "description", ListIssuesData.class, String.class);
        /**
         * The meta-property for the {@code reproductionSteps} property.
         */
        private final MetaProperty<String> reproductionSteps = DirectMetaProperty.ofReadWrite(
                this, "reproductionSteps", ListIssuesData.class, String.class);
        /**
         * The meta-property for the {@code version} property.
         */
        private final MetaProperty<String> version = DirectMetaProperty.ofReadWrite(
                this, "version", ListIssuesData.class, String.class);
        /**
         * The meta-property for the {@code type} property.
         */
        private final MetaProperty<Type> type = DirectMetaProperty.ofReadWrite(
                this, "type", ListIssuesData.class, Type.class);
        /**
         * The meta-property for the {@code status} property.
         */
        private final MetaProperty<Status> status = DirectMetaProperty.ofReadWrite(
                this, "status", ListIssuesData.class, Status.class);
        /**
         * The meta-property for the {@code priority} property.
         */
        private final MetaProperty<Priority> priority = DirectMetaProperty.ofReadWrite(
                this, "priority", ListIssuesData.class, Priority.class);
        /**
         * The meta-property for the {@code severity} property.
         */
        private final MetaProperty<Severity> severity = DirectMetaProperty.ofReadWrite(
                this, "severity", ListIssuesData.class, Severity.class);
        /**
         * The meta-property for the {@code creationTimeStamp} property.
         */
        private final MetaProperty<Calendar> creationTimeStamp = DirectMetaProperty.ofReadWrite(
                this, "creationTimeStamp", ListIssuesData.class, Calendar.class);
        /**
         * The meta-property for the {@code assignee} property.
         */
        private final MetaProperty<User> assignee = DirectMetaProperty.ofReadWrite(
                this, "assignee", ListIssuesData.class, User.class);
        /**
         * The meta-property for the {@code comment} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<Comment>> comment = DirectMetaProperty.ofReadWrite(
                this, "comment", ListIssuesData.class, (Class) List.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "id",
                "name",
                "description",
                "reproductionSteps",
                "version",
                "type",
                "status",
                "priority",
                "severity",
                "creationTimeStamp",
                "assignee",
                "comment");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return id;
                case 3373707:  // name
                    return name;
                case -1724546052:  // description
                    return description;
                case 985850715:  // reproductionSteps
                    return reproductionSteps;
                case 351608024:  // version
                    return version;
                case 3575610:  // type
                    return type;
                case -892481550:  // status
                    return status;
                case -1165461084:  // priority
                    return priority;
                case 1478300413:  // severity
                    return severity;
                case -399756073:  // creationTimeStamp
                    return creationTimeStamp;
                case -369881649:  // assignee
                    return assignee;
                case 950398559:  // comment
                    return comment;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends ListIssuesData> builder() {
            return new DirectBeanBuilder<ListIssuesData>(new ListIssuesData());
        }

        @Override
        public Class<? extends ListIssuesData> beanType() {
            return ListIssuesData.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code id} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Long> id() {
            return id;
        }

        /**
         * The meta-property for the {@code name} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> name() {
            return name;
        }

        /**
         * The meta-property for the {@code description} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> description() {
            return description;
        }

        /**
         * The meta-property for the {@code reproductionSteps} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> reproductionSteps() {
            return reproductionSteps;
        }

        /**
         * The meta-property for the {@code version} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> version() {
            return version;
        }

        /**
         * The meta-property for the {@code type} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Type> type() {
            return type;
        }

        /**
         * The meta-property for the {@code status} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Status> status() {
            return status;
        }

        /**
         * The meta-property for the {@code priority} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Priority> priority() {
            return priority;
        }

        /**
         * The meta-property for the {@code severity} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Severity> severity() {
            return severity;
        }

        /**
         * The meta-property for the {@code creationTimeStamp} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Calendar> creationTimeStamp() {
            return creationTimeStamp;
        }

        /**
         * The meta-property for the {@code assignee} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<User> assignee() {
            return assignee;
        }

        /**
         * The meta-property for the {@code comment} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<Comment>> comment() {
            return comment;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((ListIssuesData) bean).getId();
                case 3373707:  // name
                    return ((ListIssuesData) bean).getName();
                case -1724546052:  // description
                    return ((ListIssuesData) bean).getDescription();
                case 985850715:  // reproductionSteps
                    return ((ListIssuesData) bean).getReproductionSteps();
                case 351608024:  // version
                    return ((ListIssuesData) bean).getVersion();
                case 3575610:  // type
                    return ((ListIssuesData) bean).getType();
                case -892481550:  // status
                    return ((ListIssuesData) bean).getStatus();
                case -1165461084:  // priority
                    return ((ListIssuesData) bean).getPriority();
                case 1478300413:  // severity
                    return ((ListIssuesData) bean).getSeverity();
                case -399756073:  // creationTimeStamp
                    return ((ListIssuesData) bean).getCreationTimeStamp();
                case -369881649:  // assignee
                    return ((ListIssuesData) bean).getAssignee();
                case 950398559:  // comment
                    return ((ListIssuesData) bean).getComment();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((ListIssuesData) bean).setId((Long) newValue);
                    return;
                case 3373707:  // name
                    ((ListIssuesData) bean).setName((String) newValue);
                    return;
                case -1724546052:  // description
                    ((ListIssuesData) bean).setDescription((String) newValue);
                    return;
                case 985850715:  // reproductionSteps
                    ((ListIssuesData) bean).setReproductionSteps((String) newValue);
                    return;
                case 351608024:  // version
                    ((ListIssuesData) bean).setVersion((String) newValue);
                    return;
                case 3575610:  // type
                    ((ListIssuesData) bean).setType((Type) newValue);
                    return;
                case -892481550:  // status
                    ((ListIssuesData) bean).setStatus((Status) newValue);
                    return;
                case -1165461084:  // priority
                    ((ListIssuesData) bean).setPriority((Priority) newValue);
                    return;
                case 1478300413:  // severity
                    ((ListIssuesData) bean).setSeverity((Severity) newValue);
                    return;
                case -399756073:  // creationTimeStamp
                    ((ListIssuesData) bean).setCreationTimeStamp((Calendar) newValue);
                    return;
                case -369881649:  // assignee
                    ((ListIssuesData) bean).setAssignee((User) newValue);
                    return;
                case 950398559:  // comment
                    ((ListIssuesData) bean).setComment((List<Comment>) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
