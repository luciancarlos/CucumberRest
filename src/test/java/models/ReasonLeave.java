package models;

public class ReasonLeave {

	private String code;
	private String endDate;
	private String estimatedEndDate;
	private String id;
	private String name;
	private String startDate;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ReasonLeave() {
	}

	/**
	 * 
	 * @param code
	 * @param endDate
	 * @param name
	 * @param estimatedEndDate
	 * @param id
	 * @param startDate
	 */
	public ReasonLeave(String code, String endDate, String estimatedEndDate, String id, String name, String startDate) {
		super();
		this.code = code;
		this.endDate = endDate;
		this.estimatedEndDate = estimatedEndDate;
		this.id = id;
		this.name = name;
		this.startDate = startDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ReasonLeave withCode(String code) {
		this.code = code;
		return this;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public ReasonLeave withEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}

	public String getEstimatedEndDate() {
		return estimatedEndDate;
	}

	public void setEstimatedEndDate(String estimatedEndDate) {
		this.estimatedEndDate = estimatedEndDate;
	}

	public ReasonLeave withEstimatedEndDate(String estimatedEndDate) {
		this.estimatedEndDate = estimatedEndDate;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ReasonLeave withId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReasonLeave withName(String name) {
		this.name = name;
		return this;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public ReasonLeave withStartDate(String startDate) {
		this.startDate = startDate;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ReasonLeave.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("code");
		sb.append('=');
		sb.append(((this.code == null) ? "<null>" : this.code));
		sb.append(',');
		sb.append("endDate");
		sb.append('=');
		sb.append(((this.endDate == null) ? "<null>" : this.endDate));
		sb.append(',');
		sb.append("estimatedEndDate");
		sb.append('=');
		sb.append(((this.estimatedEndDate == null) ? "<null>" : this.estimatedEndDate));
		sb.append(',');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null) ? "<null>" : this.name));
		sb.append(',');
		sb.append("startDate");
		sb.append('=');
		sb.append(((this.startDate == null) ? "<null>" : this.startDate));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
