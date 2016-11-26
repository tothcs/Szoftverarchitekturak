package hu.bme.archi.issue.bean;

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
public class SaveIssueRequest implements Bean {
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
    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code SaveIssueRequest}.
     * @return the meta-bean, not null
     */
    public static SaveIssueRequest.Meta meta() {
        return SaveIssueRequest.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(SaveIssueRequest.Meta.INSTANCE);
    }

    @Override
    public SaveIssueRequest.Meta metaBean() {
        return SaveIssueRequest.Meta.INSTANCE;
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
    @Override
    public SaveIssueRequest clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            SaveIssueRequest other = (SaveIssueRequest) obj;
            return JodaBeanUtils.equal(getName(), other.getName()) &&
                    JodaBeanUtils.equal(getDescription(), other.getDescription()) &&
                    JodaBeanUtils.equal(getReproductionSteps(), other.getReproductionSteps()) &&
                    JodaBeanUtils.equal(getVersion(), other.getVersion()) &&
                    JodaBeanUtils.equal(getType(), other.getType()) &&
                    JodaBeanUtils.equal(getStatus(), other.getStatus()) &&
                    JodaBeanUtils.equal(getPriority(), other.getPriority()) &&
                    JodaBeanUtils.equal(getSeverity(), other.getSeverity());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getName());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDescription());
        hash = hash * 31 + JodaBeanUtils.hashCode(getReproductionSteps());
        hash = hash * 31 + JodaBeanUtils.hashCode(getVersion());
        hash = hash * 31 + JodaBeanUtils.hashCode(getType());
        hash = hash * 31 + JodaBeanUtils.hashCode(getStatus());
        hash = hash * 31 + JodaBeanUtils.hashCode(getPriority());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSeverity());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(288);
        buf.append("SaveIssueRequest{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("name").append('=').append(JodaBeanUtils.toString(getName())).append(',').append(' ');
        buf.append("description").append('=').append(JodaBeanUtils.toString(getDescription())).append(',').append(' ');
        buf.append("reproductionSteps").append('=').append(JodaBeanUtils.toString(getReproductionSteps())).append(',').append(' ');
        buf.append("version").append('=').append(JodaBeanUtils.toString(getVersion())).append(',').append(' ');
        buf.append("type").append('=').append(JodaBeanUtils.toString(getType())).append(',').append(' ');
        buf.append("status").append('=').append(JodaBeanUtils.toString(getStatus())).append(',').append(' ');
        buf.append("priority").append('=').append(JodaBeanUtils.toString(getPriority())).append(',').append(' ');
        buf.append("severity").append('=').append(JodaBeanUtils.toString(getSeverity())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code SaveIssueRequest}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code name} property.
         */
        private final MetaProperty<String> name = DirectMetaProperty.ofReadWrite(
                this, "name", SaveIssueRequest.class, String.class);
        /**
         * The meta-property for the {@code description} property.
         */
        private final MetaProperty<String> description = DirectMetaProperty.ofReadWrite(
                this, "description", SaveIssueRequest.class, String.class);
        /**
         * The meta-property for the {@code reproductionSteps} property.
         */
        private final MetaProperty<String> reproductionSteps = DirectMetaProperty.ofReadWrite(
                this, "reproductionSteps", SaveIssueRequest.class, String.class);
        /**
         * The meta-property for the {@code version} property.
         */
        private final MetaProperty<String> version = DirectMetaProperty.ofReadWrite(
                this, "version", SaveIssueRequest.class, String.class);
        /**
         * The meta-property for the {@code type} property.
         */
        private final MetaProperty<Type> type = DirectMetaProperty.ofReadWrite(
                this, "type", SaveIssueRequest.class, Type.class);
        /**
         * The meta-property for the {@code status} property.
         */
        private final MetaProperty<Status> status = DirectMetaProperty.ofReadWrite(
                this, "status", SaveIssueRequest.class, Status.class);
        /**
         * The meta-property for the {@code priority} property.
         */
        private final MetaProperty<Priority> priority = DirectMetaProperty.ofReadWrite(
                this, "priority", SaveIssueRequest.class, Priority.class);
        /**
         * The meta-property for the {@code severity} property.
         */
        private final MetaProperty<Severity> severity = DirectMetaProperty.ofReadWrite(
                this, "severity", SaveIssueRequest.class, Severity.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "name",
                "description",
                "reproductionSteps",
                "version",
                "type",
                "status",
                "priority",
                "severity");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
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
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends SaveIssueRequest> builder() {
            return new DirectBeanBuilder<SaveIssueRequest>(new SaveIssueRequest());
        }

        @Override
        public Class<? extends SaveIssueRequest> beanType() {
            return SaveIssueRequest.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
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

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return ((SaveIssueRequest) bean).getName();
                case -1724546052:  // description
                    return ((SaveIssueRequest) bean).getDescription();
                case 985850715:  // reproductionSteps
                    return ((SaveIssueRequest) bean).getReproductionSteps();
                case 351608024:  // version
                    return ((SaveIssueRequest) bean).getVersion();
                case 3575610:  // type
                    return ((SaveIssueRequest) bean).getType();
                case -892481550:  // status
                    return ((SaveIssueRequest) bean).getStatus();
                case -1165461084:  // priority
                    return ((SaveIssueRequest) bean).getPriority();
                case 1478300413:  // severity
                    return ((SaveIssueRequest) bean).getSeverity();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    ((SaveIssueRequest) bean).setName((String) newValue);
                    return;
                case -1724546052:  // description
                    ((SaveIssueRequest) bean).setDescription((String) newValue);
                    return;
                case 985850715:  // reproductionSteps
                    ((SaveIssueRequest) bean).setReproductionSteps((String) newValue);
                    return;
                case 351608024:  // version
                    ((SaveIssueRequest) bean).setVersion((String) newValue);
                    return;
                case 3575610:  // type
                    ((SaveIssueRequest) bean).setType((Type) newValue);
                    return;
                case -892481550:  // status
                    ((SaveIssueRequest) bean).setStatus((Status) newValue);
                    return;
                case -1165461084:  // priority
                    ((SaveIssueRequest) bean).setPriority((Priority) newValue);
                    return;
                case 1478300413:  // severity
                    ((SaveIssueRequest) bean).setSeverity((Severity) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
