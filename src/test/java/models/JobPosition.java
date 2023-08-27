package models;

public class JobPosition {

	private String discriminator;
	private String cboCode;
	private String code;
	private String dateWhen;
	private String id;
	private String name;
	private String structureCode;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public JobPosition() {
	}

	/**
	 * 
	 * @param code
	 * @param structureCode
	 * @param dateWhen
	 * @param name
	 * @param id
	 * @param cboCode
	 * @param discriminator
	 */
	public JobPosition(String discriminator, String cboCode, String code, String dateWhen, String id, String name,
			String structureCode) {
		super();
		this.discriminator = discriminator;
		this.cboCode = cboCode;
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

	public JobPosition withDiscriminator(String discriminator) {
		this.discriminator = discriminator;
		return this;
	}

	public String getCboCode() {
		return cboCode;
	}

	public void setCboCode(String cboCode) {
		this.cboCode = cboCode;
	}

	public JobPosition withCboCode(String cboCode) {
		this.cboCode = cboCode;
		return this;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public JobPosition withCode(String code) {
		this.code = code;
		return this;
	}

	public String getDateWhen() {
		return dateWhen;
	}

	public void setDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
	}

	public JobPosition withDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public JobPosition withId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JobPosition withName(String name) {
		this.name = name;
		return this;
	}

	public String getStructureCode() {
		return structureCode;
	}

	public void setStructureCode(String structureCode) {
		this.structureCode = structureCode;
	}

	public JobPosition withStructureCode(String structureCode) {
		this.structureCode = structureCode;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(JobPosition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("discriminator");
		sb.append('=');
		sb.append(((this.discriminator == null) ? "<null>" : this.discriminator));
		sb.append(',');
		sb.append("cboCode");
		sb.append('=');
		sb.append(((this.cboCode == null) ? "<null>" : this.cboCode));
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
		sb.append(((this.structureCode == null) ? "<null>" : this.structureCode));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
