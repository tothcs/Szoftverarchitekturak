package hu.bme.onlab.post.bean;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.PropertyDefinition;
import java.util.Map;
import java.util.Set;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
public class SendPostRequest implements Bean {

	@PropertyDefinition
	private String entry;
	
	//------------------------- AUTOGENERATED START -------------------------
	///CLOVER:OFF
	/**
	 * The meta-bean for {@code SendPostRequest}.
	 * @return the meta-bean, not null
	 */
	public static SendPostRequest.Meta meta() {
		return SendPostRequest.Meta.INSTANCE;
	}

	static {
		JodaBeanUtils.registerMetaBean(SendPostRequest.Meta.INSTANCE);
	}

	@Override
	public SendPostRequest.Meta metaBean() {
		return SendPostRequest.Meta.INSTANCE;
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
	 * Gets the entry.
	 * @return the value of the property
	 */
	public String getEntry() {
		return entry;
	}

	/**
	 * Sets the entry.
	 * @param entry  the new value of the property
	 */
	public void setEntry(String entry) {
		this.entry = entry;
	}

	/**
	 * Gets the the {@code entry} property.
	 * @return the property, not null
	 */
	public final Property<String> entry() {
		return metaBean().entry().createProperty(this);
	}

	//-----------------------------------------------------------------------
	@Override
	public SendPostRequest clone() {
		return JodaBeanUtils.cloneAlways(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			SendPostRequest other = (SendPostRequest) obj;
			return JodaBeanUtils.equal(getEntry(), other.getEntry());
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = getClass().hashCode();
		hash = hash * 31 + JodaBeanUtils.hashCode(getEntry());
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(64);
		buf.append("SendPostRequest{");
		int len = buf.length();
		toString(buf);
		if (buf.length() > len) {
			buf.setLength(buf.length() - 2);
		}
		buf.append('}');
		return buf.toString();
	}

	protected void toString(StringBuilder buf) {
		buf.append("entry").append('=').append(JodaBeanUtils.toString(getEntry())).append(',').append(' ');
	}

	//-----------------------------------------------------------------------
	/**
	 * The meta-bean for {@code SendPostRequest}.
	 */
	public static class Meta extends DirectMetaBean {
		/**
		 * The singleton instance of the meta-bean.
		 */
		static final Meta INSTANCE = new Meta();

		/**
		 * The meta-property for the {@code entry} property.
		 */
		private final MetaProperty<String> entry = DirectMetaProperty.ofReadWrite(
				this, "entry", SendPostRequest.class, String.class);
		/**
		 * The meta-properties.
		 */
		private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
				this, null,
				"entry");

		/**
		 * Restricted constructor.
		 */
		protected Meta() {
		}

		@Override
		protected MetaProperty<?> metaPropertyGet(String propertyName) {
			switch (propertyName.hashCode()) {
				case 96667762:  // entry
					return entry;
			}
			return super.metaPropertyGet(propertyName);
		}

		@Override
		public BeanBuilder<? extends SendPostRequest> builder() {
			return new DirectBeanBuilder<SendPostRequest>(new SendPostRequest());
		}

		@Override
		public Class<? extends SendPostRequest> beanType() {
			return SendPostRequest.class;
		}

		@Override
		public Map<String, MetaProperty<?>> metaPropertyMap() {
			return metaPropertyMap$;
		}

		//-----------------------------------------------------------------------
		/**
		 * The meta-property for the {@code entry} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> entry() {
			return entry;
		}

		//-----------------------------------------------------------------------
		@Override
		protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 96667762:  // entry
					return ((SendPostRequest) bean).getEntry();
			}
			return super.propertyGet(bean, propertyName, quiet);
		}

		@Override
		protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 96667762:  // entry
					((SendPostRequest) bean).setEntry((String) newValue);
					return;
			}
			super.propertySet(bean, propertyName, newValue, quiet);
		}

	}

	///CLOVER:ON
	//-------------------------- AUTOGENERATED END --------------------------
}