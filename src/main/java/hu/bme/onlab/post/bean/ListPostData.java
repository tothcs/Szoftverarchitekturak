package hu.bme.onlab.post.bean;

import java.util.Calendar;
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
public class ListPostData implements Bean {

	@PropertyDefinition
	private Long id;
    @PropertyDefinition
    private String title;
    @PropertyDefinition
    private Integer priceMin;
    @PropertyDefinition
    private Integer priceMax;
    @PropertyDefinition
    private Calendar creationDateTime;
    @PropertyDefinition
    private String city;
    @PropertyDefinition
    private String mapUrl;
    
	//------------------------- AUTOGENERATED START -------------------------
	///CLOVER:OFF
	/**
	 * The meta-bean for {@code ListPostData}.
	 * @return the meta-bean, not null
	 */
	public static ListPostData.Meta meta() {
		return ListPostData.Meta.INSTANCE;
	}

	static {
		JodaBeanUtils.registerMetaBean(ListPostData.Meta.INSTANCE);
	}

	@Override
	public ListPostData.Meta metaBean() {
		return ListPostData.Meta.INSTANCE;
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
	 * Gets the priceMin.
	 * @return the value of the property
	 */
	public Integer getPriceMin() {
		return priceMin;
	}

	/**
	 * Sets the priceMin.
	 * @param priceMin  the new value of the property
	 */
	public void setPriceMin(Integer priceMin) {
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
	public Integer getPriceMax() {
		return priceMax;
	}

	/**
	 * Sets the priceMax.
	 * @param priceMax  the new value of the property
	 */
	public void setPriceMax(Integer priceMax) {
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
	 * Gets the creationDateTime.
	 * @return the value of the property
	 */
	public Calendar getCreationDateTime() {
		return creationDateTime;
	}

	/**
	 * Sets the creationDateTime.
	 * @param creationDateTime  the new value of the property
	 */
	public void setCreationDateTime(Calendar creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	/**
	 * Gets the the {@code creationDateTime} property.
	 * @return the property, not null
	 */
	public final Property<Calendar> creationDateTime() {
		return metaBean().creationDateTime().createProperty(this);
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the city.
	 * @return the value of the property
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 * @param city  the new value of the property
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the the {@code city} property.
	 * @return the property, not null
	 */
	public final Property<String> city() {
		return metaBean().city().createProperty(this);
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the mapUrl.
	 * @return the value of the property
	 */
	public String getMapUrl() {
		return mapUrl;
	}

	/**
	 * Sets the mapUrl.
	 * @param mapUrl  the new value of the property
	 */
	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	/**
	 * Gets the the {@code mapUrl} property.
	 * @return the property, not null
	 */
	public final Property<String> mapUrl() {
		return metaBean().mapUrl().createProperty(this);
	}

	//-----------------------------------------------------------------------
	@Override
	public ListPostData clone() {
		return JodaBeanUtils.cloneAlways(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			ListPostData other = (ListPostData) obj;
			return JodaBeanUtils.equal(getId(), other.getId()) &&
					JodaBeanUtils.equal(getTitle(), other.getTitle()) &&
					JodaBeanUtils.equal(getPriceMin(), other.getPriceMin()) &&
					JodaBeanUtils.equal(getPriceMax(), other.getPriceMax()) &&
					JodaBeanUtils.equal(getCreationDateTime(), other.getCreationDateTime()) &&
					JodaBeanUtils.equal(getCity(), other.getCity()) &&
					JodaBeanUtils.equal(getMapUrl(), other.getMapUrl());
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = getClass().hashCode();
		hash = hash * 31 + JodaBeanUtils.hashCode(getId());
		hash = hash * 31 + JodaBeanUtils.hashCode(getTitle());
		hash = hash * 31 + JodaBeanUtils.hashCode(getPriceMin());
		hash = hash * 31 + JodaBeanUtils.hashCode(getPriceMax());
		hash = hash * 31 + JodaBeanUtils.hashCode(getCreationDateTime());
		hash = hash * 31 + JodaBeanUtils.hashCode(getCity());
		hash = hash * 31 + JodaBeanUtils.hashCode(getMapUrl());
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(256);
		buf.append("ListPostData{");
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
		buf.append("title").append('=').append(JodaBeanUtils.toString(getTitle())).append(',').append(' ');
		buf.append("priceMin").append('=').append(JodaBeanUtils.toString(getPriceMin())).append(',').append(' ');
		buf.append("priceMax").append('=').append(JodaBeanUtils.toString(getPriceMax())).append(',').append(' ');
		buf.append("creationDateTime").append('=').append(JodaBeanUtils.toString(getCreationDateTime())).append(',').append(' ');
		buf.append("city").append('=').append(JodaBeanUtils.toString(getCity())).append(',').append(' ');
		buf.append("mapUrl").append('=').append(JodaBeanUtils.toString(getMapUrl())).append(',').append(' ');
	}

	//-----------------------------------------------------------------------
	/**
	 * The meta-bean for {@code ListPostData}.
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
				this, "id", ListPostData.class, Long.class);
		/**
		 * The meta-property for the {@code title} property.
		 */
		private final MetaProperty<String> title = DirectMetaProperty.ofReadWrite(
				this, "title", ListPostData.class, String.class);
		/**
		 * The meta-property for the {@code priceMin} property.
		 */
		private final MetaProperty<Integer> priceMin = DirectMetaProperty.ofReadWrite(
				this, "priceMin", ListPostData.class, Integer.class);
		/**
		 * The meta-property for the {@code priceMax} property.
		 */
		private final MetaProperty<Integer> priceMax = DirectMetaProperty.ofReadWrite(
				this, "priceMax", ListPostData.class, Integer.class);
		/**
		 * The meta-property for the {@code creationDateTime} property.
		 */
		private final MetaProperty<Calendar> creationDateTime = DirectMetaProperty.ofReadWrite(
				this, "creationDateTime", ListPostData.class, Calendar.class);
		/**
		 * The meta-property for the {@code city} property.
		 */
		private final MetaProperty<String> city = DirectMetaProperty.ofReadWrite(
				this, "city", ListPostData.class, String.class);
		/**
		 * The meta-property for the {@code mapUrl} property.
		 */
		private final MetaProperty<String> mapUrl = DirectMetaProperty.ofReadWrite(
				this, "mapUrl", ListPostData.class, String.class);
		/**
		 * The meta-properties.
		 */
		private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
				this, null,
				"id",
				"title",
				"priceMin",
				"priceMax",
				"creationDateTime",
				"city",
				"mapUrl");

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
				case 110371416:  // title
					return title;
				case -1176957879:  // priceMin
					return priceMin;
				case -1176958117:  // priceMax
					return priceMax;
				case 1501934490:  // creationDateTime
					return creationDateTime;
				case 3053931:  // city
					return city;
				case -1081386381:  // mapUrl
					return mapUrl;
			}
			return super.metaPropertyGet(propertyName);
		}

		@Override
		public BeanBuilder<? extends ListPostData> builder() {
			return new DirectBeanBuilder<ListPostData>(new ListPostData());
		}

		@Override
		public Class<? extends ListPostData> beanType() {
			return ListPostData.class;
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
		 * The meta-property for the {@code title} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> title() {
			return title;
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
		 * The meta-property for the {@code creationDateTime} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<Calendar> creationDateTime() {
			return creationDateTime;
		}

		/**
		 * The meta-property for the {@code city} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> city() {
			return city;
		}

		/**
		 * The meta-property for the {@code mapUrl} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> mapUrl() {
			return mapUrl;
		}

		//-----------------------------------------------------------------------
		@Override
		protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 3355:  // id
					return ((ListPostData) bean).getId();
				case 110371416:  // title
					return ((ListPostData) bean).getTitle();
				case -1176957879:  // priceMin
					return ((ListPostData) bean).getPriceMin();
				case -1176958117:  // priceMax
					return ((ListPostData) bean).getPriceMax();
				case 1501934490:  // creationDateTime
					return ((ListPostData) bean).getCreationDateTime();
				case 3053931:  // city
					return ((ListPostData) bean).getCity();
				case -1081386381:  // mapUrl
					return ((ListPostData) bean).getMapUrl();
			}
			return super.propertyGet(bean, propertyName, quiet);
		}

		@Override
		protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 3355:  // id
					((ListPostData) bean).setId((Long) newValue);
					return;
				case 110371416:  // title
					((ListPostData) bean).setTitle((String) newValue);
					return;
				case -1176957879:  // priceMin
					((ListPostData) bean).setPriceMin((Integer) newValue);
					return;
				case -1176958117:  // priceMax
					((ListPostData) bean).setPriceMax((Integer) newValue);
					return;
				case 1501934490:  // creationDateTime
					((ListPostData) bean).setCreationDateTime((Calendar) newValue);
					return;
				case 3053931:  // city
					((ListPostData) bean).setCity((String) newValue);
					return;
				case -1081386381:  // mapUrl
					((ListPostData) bean).setMapUrl((String) newValue);
					return;
			}
			super.propertySet(bean, propertyName, newValue, quiet);
		}

	}

	///CLOVER:ON
	//-------------------------- AUTOGENERATED END --------------------------
}
