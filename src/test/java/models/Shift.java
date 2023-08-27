package models;

public class Shift {

	private String discriminator;
	private int code;
	private String dateWhen;
	private String id;
	private String name;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Shift() {
	}

	/**
	 * 
	 * @param code
	 * @param dateWhen
	 * @param name
	 * @param id
	 * @param discriminator
	 */
	public Shift(String discriminator, int code, String dateWhen, String id, String name) {
		super();
		this.discriminator = discriminator;
		this.code = code;
		this.dateWhen = dateWhen;
		this.id = id;
		this.name = name;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public Shift withDiscriminator(String discriminator) {
		this.discriminator = discriminator;
		return this;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Shift withCode(int code) {
		this.code = code;
		return this;
	}

	public String getDateWhen() {
		return dateWhen;
	}

	public void setDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
	}

	public Shift withDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Shift withId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shift withName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Shift.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("discriminator");
		sb.append('=');
		sb.append(((this.discriminator == null) ? "<null>" : this.discriminator));
		sb.append(',');
		sb.append("code");
		sb.append('=');
		sb.append(this.code);
		sb.append(',');
		sb.append("dateWhen");
		sb.append('=');
		sb.append(((this.dateWhen == null) ? "<null>" : this.dateWhen));
		sb.append(',');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null) ? "<null>" : this.name));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
