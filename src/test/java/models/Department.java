package models;

public class Department {

	private String discriminator;
	private String code;
	private String dateWhen;
	private String id;
	private String name;
	private int structureCode;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Department() {
	}

	/**
	 * 
	 * @param code
	 * @param structureCode
	 * @param dateWhen
	 * @param name
	 * @param id
	 * @param discriminator
	 */
	public Department(String discriminator, String code, String dateWhen, String id, String name, int structureCode) {
		super();
		this.discriminator = discriminator;
		this.code = code;
		this.dateWhen = dateWhen;
		this.id = id;
		this.name = name;
		this.structureCode = structureCode;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public Department withDiscriminator(String discriminator) {
		this.discriminator = discriminator;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Department withCode(String code) {
		this.code = code;
		return this;
	}

	public String getDateWhen() {
		return dateWhen;
	}

	public void setDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
	}

	public Department withDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Department withId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department withName(String name) {
		this.name = name;
		return this;
	}

	public int getStructureCode() {
		return structureCode;
	}

	public void setStructureCode(int structureCode) {
		this.structureCode = structureCode;
	}

	public Department withStructureCode(int structureCode) {
		this.structureCode = structureCode;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Department.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
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
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null) ? "<null>" : this.name));
		sb.append(',');
		sb.append("structureCode");
		sb.append('=');
		sb.append(this.structureCode);
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
