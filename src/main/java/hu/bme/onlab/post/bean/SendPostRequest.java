package hu.bme.onlab.post.bean;

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
public class SendPostRequest implements Bean {

	@PropertyDefinition
	private String title;
	@PropertyDefinition
	private String description;
	@PropertyDefinition
	private String zipCode;
	@PropertyDefinition
	private int priceMin;
	@PropertyDefinition
	private int priceMax;
	@PropertyDefinition
	private String name;
	@PropertyDefinition
	private String phone;
	
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
	 * Gets the title.
	 * @return the value of the property
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 * @param title  the new value of the property
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the the {@code title} property.
	 * @return the property, not null
	 */
	public final Property<String> title() {
		return metaBean().title().createProperty(this);
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
	 * Gets the zipCode.
	 * @return the value of the property
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Sets the zipCode.
	 * @param zipCode  the new value of the property
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * Gets the the {@code zipCode} property.
	 * @return the property, not null
	 */
	public final Property<String> zipCode() {
		return metaBean().zipCode().createProperty(this);
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the priceMin.
	 * @return the value of the property
	 */
	public int getPriceMin() {
		return priceMin;
	}

	/**
	 * Sets the priceMin.
	 * @param priceMin  the new value of the property
	 */
	public void setPriceMin(int priceMin) {
		this.priceMin = priceMin;
	}

	/**
	 * Gets the the {@code priceMin} property.
	 * @return the property, not null
	 */
	public final Property<Integer> priceMin() {
		return metaBean().priceMin().createProperty(this);
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the priceMax.
	 * @return the value of the property
	 */
	public int getPriceMax() {
		return priceMax;
	}

	/**
	 * Sets the priceMax.
	 * @param priceMax  the new value of the property
	 */
	public void setPriceMax(int priceMax) {
		this.priceMax = priceMax;
	}

	/**
	 * Gets the the {@code priceMax} property.
	 * @return the property, not null
	 */
	public final Property<Integer> priceMax() {
		return metaBean().priceMax().createProperty(this);
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
	 * Gets the phone.
	 * @return the value of the property
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 * @param phone  the new value of the property
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the the {@code phone} property.
	 * @return the property, not null
	 */
	public final Property<String> phone() {
		return metaBean().phone().createProperty(this);
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
			return JodaBeanUtils.equal(getTitle(), other.getTitle()) &&
					JodaBeanUtils.equal(getDescription(), other.getDescription()) &&
					JodaBeanUtils.equal(getZipCode(), other.getZipCode()) &&
					(getPriceMin() == other.getPriceMin()) &&
					(getPriceMax() == other.getPriceMax()) &&
					JodaBeanUtils.equal(getName(), other.getName()) &&
					JodaBeanUtils.equal(getPhone(), other.getPhone());
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = getClass().hashCode();
		hash = hash * 31 + JodaBeanUtils.hashCode(getTitle());
		hash = hash * 31 + JodaBeanUtils.hashCode(getDescription());
		hash = hash * 31 + JodaBeanUtils.hashCode(getZipCode());
		hash = hash * 31 + JodaBeanUtils.hashCode(getPriceMin());
		hash = hash * 31 + JodaBeanUtils.hashCode(getPriceMax());
		hash = hash * 31 + JodaBeanUtils.hashCode(getName());
		hash = hash * 31 + JodaBeanUtils.hashCode(getPhone());
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(256);
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
		buf.append("title").append('=').append(JodaBeanUtils.toString(getTitle())).append(',').append(' ');
		buf.append("description").append('=').append(JodaBeanUtils.toString(getDescription())).append(',').append(' ');
		buf.append("zipCode").append('=').append(JodaBeanUtils.toString(getZipCode())).append(',').append(' ');
		buf.append("priceMin").append('=').append(JodaBeanUtils.toString(getPriceMin())).append(',').append(' ');
		buf.append("priceMax").append('=').append(JodaBeanUtils.toString(getPriceMax())).append(',').append(' ');
		buf.append("name").append('=').append(JodaBeanUtils.toString(getName())).append(',').append(' ');
		buf.append("phone").append('=').append(JodaBeanUtils.toString(getPhone())).append(',').append(' ');
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
		 * The meta-property for the {@code title} property.
		 */
		private final MetaProperty<String> title = DirectMetaProperty.ofReadWrite(
				this, "title", SendPostRequest.class, String.class);
		/**
		 * The meta-property for the {@code description} property.
		 */
		private final MetaProperty<String> description = DirectMetaProperty.ofReadWrite(
				this, "description", SendPostRequest.class, String.class);
		/**
		 * The meta-property for the {@code zipCode} property.
		 */
		private final MetaProperty<String> zipCode = DirectMetaProperty.ofReadWrite(
				this, "zipCode", SendPostRequest.class, String.class);
		/**
		 * The meta-property for the {@code priceMin} property.
		 */
		private final MetaProperty<Integer> priceMin = DirectMetaProperty.ofReadWrite(
				this, "priceMin", SendPostRequest.class, Integer.TYPE);
		/**
		 * The meta-property for the {@code priceMax} property.
		 */
		private final MetaProperty<Integer> priceMax = DirectMetaProperty.ofReadWrite(
				this, "priceMax", SendPostRequest.class, Integer.TYPE);
		/**
		 * The meta-property for the {@code name} property.
		 */
		private final MetaProperty<String> name = DirectMetaProperty.ofReadWrite(
				this, "name", SendPostRequest.class, String.class);
		/**
		 * The meta-property for the {@code phone} property.
		 */
		private final MetaProperty<String> phone = DirectMetaProperty.ofReadWrite(
				this, "phone", SendPostRequest.class, String.class);
		/**
		 * The meta-properties.
		 */
		private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
				this, null,
				"title",
				"description",
				"zipCode",
				"priceMin",
				"priceMax",
				"name",
				"phone");

		/**
		 * Restricted constructor.
		 */
		protected Meta() {
		}

		@Override
		protected MetaProperty<?> metaPropertyGet(String propertyName) {
			switch (propertyName.hashCode()) {
				case 110371416:  // title
					return title;
				case -1724546052:  // description
					return description;
				case -282099538:  // zipCode
					return zipCode;
				case -1176957879:  // priceMin
					return priceMin;
				case -1176958117:  // priceMax
					return priceMax;
				case 3373707:  // name
					return name;
				case 106642798:  // phone
					return phone;
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
		 * The meta-property for the {@code title} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> title() {
			return title;
		}

		/**
		 * The meta-property for the {@code description} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> description() {
			return description;
		}

		/**
		 * The meta-property for the {@code zipCode} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> zipCode() {
			return zipCode;
		}

		/**
		 * The meta-property for the {@code priceMin} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<Integer> priceMin() {
			return priceMin;
		}

		/**
		 * The meta-property for the {@code priceMax} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<Integer> priceMax() {
			return priceMax;
		}

		/**
		 * The meta-property for the {@code name} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> name() {
			return name;
		}

		/**
		 * The meta-property for the {@code phone} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> phone() {
			return phone;
		}

		//-----------------------------------------------------------------------
		@Override
		protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 110371416:  // title
					return ((SendPostRequest) bean).getTitle();
				case -1724546052:  // description
					return ((SendPostRequest) bean).getDescription();
				case -282099538:  // zipCode
					return ((SendPostRequest) bean).getZipCode();
				case -1176957879:  // priceMin
					return ((SendPostRequest) bean).getPriceMin();
				case -1176958117:  // priceMax
					return ((SendPostRequest) bean).getPriceMax();
				case 3373707:  // name
					return ((SendPostRequest) bean).getName();
				case 106642798:  // phone
					return ((SendPostRequest) bean).getPhone();
			}
			return super.propertyGet(bean, propertyName, quiet);
		}

		@Override
		protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 110371416:  // title
					((SendPostRequest) bean).setTitle((String) newValue);
					return;
				case -1724546052:  // description
					((SendPostRequest) bean).setDescription((String) newValue);
					return;
				case -282099538:  // zipCode
					((SendPostRequest) bean).setZipCode((String) newValue);
					return;
				case -1176957879:  // priceMin
					((SendPostRequest) bean).setPriceMin((Integer) newValue);
					return;
				case -1176958117:  // priceMax
					((SendPostRequest) bean).setPriceMax((Integer) newValue);
					return;
				case 3373707:  // name
					((SendPostRequest) bean).setName((String) newValue);
					return;
				case 106642798:  // phone
					((SendPostRequest) bean).setPhone((String) newValue);
					return;
			}
			super.propertySet(bean, propertyName, newValue, quiet);
		}

	}

	///CLOVER:ON
	//-------------------------- AUTOGENERATED END --------------------------
}
