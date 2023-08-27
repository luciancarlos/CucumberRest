package models;

public class ESocialCategory {

	private String discriminator;
	private String code;
	private String dateWhen;
	private String id;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ESocialCategory() {
	}

	/**
	 * 
	 * @param code
	 * @param dateWhen
	 * @param id
	 * @param discriminator
	 */
	public ESocialCategory(String discriminator, String code, String dateWhen, String id) {
		super();
		this.discriminator = discriminator;
		this.code = code;
		this.dateWhen = dateWhen;
		this.id = id;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public ESocialCategory withDiscriminator(String discriminator) {
		this.discriminator = discriminator;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ESocialCategory withCode(String code) {
		this.code = code;
		return this;
	}

	public String getDateWhen() {
		return dateWhen;
	}

	public void setDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
	}

	public ESocialCategory withDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ESocialCategory withId(String id) {
		this.id = id;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ESocialCategory.class.getName()).append('@')
				.append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("discriminator");
		sb.append('=');
		sb.append(((this.discriminator == null) ? "<null>" : this.discriminator));
		sb.append(',');
		sb.append("code");
		sb.append('=');
		sb.append(((this.code == null) ? "<null>" : this.code));
		sb.append(',');
		sb.append("dateWhen");
		sb.append('=');
		sb.append(((this.dateWhen == null) ? "<null>" : this.dateWhen));
		sb.append(',');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
