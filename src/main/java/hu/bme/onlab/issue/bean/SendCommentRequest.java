package hu.bme.onlab.issue.bean;

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

@BeanDefinition
public class SendCommentRequest implements Bean {
    @PropertyDefinition
    private long issueId;
    @PropertyDefinition
    private String message;
    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code SendCommentRequest}.
     * @return the meta-bean, not null
     */
    public static SendCommentRequest.Meta meta() {
        return SendCommentRequest.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(SendCommentRequest.Meta.INSTANCE);
    }

    @Override
    public SendCommentRequest.Meta metaBean() {
        return SendCommentRequest.Meta.INSTANCE;
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
     * Gets the issueId.
     * @return the value of the property
     */
    public long getIssueId() {
        return issueId;
    }

    /**
     * Sets the issueId.
     * @param issueId  the new value of the property
     */
    public void setIssueId(long issueId) {
        this.issueId = issueId;
    }

    /**
     * Gets the the {@code issueId} property.
     * @return the property, not null
     */
    public final Property<Long> issueId() {
        return metaBean().issueId().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the message.
     * @return the value of the property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     * @param message  the new value of the property
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the the {@code message} property.
     * @return the property, not null
     */
    public final Property<String> message() {
        return metaBean().message().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public SendCommentRequest clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            SendCommentRequest other = (SendCommentRequest) obj;
            return (getIssueId() == other.getIssueId()) &&
                    JodaBeanUtils.equal(getMessage(), other.getMessage());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getIssueId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMessage());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(96);
        buf.append("SendCommentRequest{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("issueId").append('=').append(JodaBeanUtils.toString(getIssueId())).append(',').append(' ');
        buf.append("message").append('=').append(JodaBeanUtils.toString(getMessage())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code SendCommentRequest}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code issueId} property.
         */
        private final MetaProperty<Long> issueId = DirectMetaProperty.ofReadWrite(
                this, "issueId", SendCommentRequest.class, Long.TYPE);
        /**
         * The meta-property for the {@code message} property.
         */
        private final MetaProperty<String> message = DirectMetaProperty.ofReadWrite(
                this, "message", SendCommentRequest.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "issueId",
                "message");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 2100748244:  // issueId
                    return issueId;
                case 954925063:  // message
                    return message;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends SendCommentRequest> builder() {
            return new DirectBeanBuilder<SendCommentRequest>(new SendCommentRequest());
        }

        @Override
        public Class<? extends SendCommentRequest> beanType() {
            return SendCommentRequest.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code issueId} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Long> issueId() {
            return issueId;
        }

        /**
         * The meta-property for the {@code message} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> message() {
            return message;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 2100748244:  // issueId
                    return ((SendCommentRequest) bean).getIssueId();
                case 954925063:  // message
                    return ((SendCommentRequest) bean).getMessage();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 2100748244:  // issueId
                    ((SendCommentRequest) bean).setIssueId((Long) newValue);
                    return;
                case 954925063:  // message
                    ((SendCommentRequest) bean).setMessage((String) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}