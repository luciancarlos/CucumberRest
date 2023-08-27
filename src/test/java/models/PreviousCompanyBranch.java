package models;

public class PreviousCompanyBranch {

	private String code;
	private String companyBranchName;
	private String dateWhen;
	private String name;
	private String subscriptionNumber;
	private String subscriptionType;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public PreviousCompanyBranch() {
	}

	/**
	 * 
	 * @param code
	 * @param dateWhen
	 * @param subscriptionNumber
	 * @param subscriptionType
	 * @param companyBranchName
	 * @param name
	 */
	public PreviousCompanyBranch(String code, String companyBranchName, String dateWhen, String name,
			String subscriptionNumber, String subscriptionType) {
		super();
		this.code = code;
		this.companyBranchName = companyBranchName;
		this.dateWhen = dateWhen;
		this.name = name;
		this.subscriptionNumber = subscriptionNumber;
		this.subscriptionType = subscriptionType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public PreviousCompanyBranch withCode(String code) {
		this.code = code;
		return this;
	}

	public String getCompanyBranchName() {
		return companyBranchName;
	}

	public void setCompanyBranchName(String companyBranchName) {
		this.companyBranchName = companyBranchName;
	}

	public PreviousCompanyBranch withCompanyBranchName(String companyBranchName) {
		this.companyBranchName = companyBranchName;
		return this;
	}

	public String getDateWhen() {
		return dateWhen;
	}

	public void setDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
	}

	public PreviousCompanyBranch withDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PreviousCompanyBranch withName(String name) {
		this.name = name;
		return this;
	}

	public String getSubscriptionNumber() {
		return subscriptionNumber;
	}

	public void setSubscriptionNumber(String subscriptionNumber) {
		this.subscriptionNumber = subscriptionNumber;
	}

	public PreviousCompanyBranch withSubscriptionNumber(String subscriptionNumber) {
		this.subscriptionNumber = subscriptionNumber;
		return this;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public PreviousCompanyBranch withSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(PreviousCompanyBranch.class.getName()).append('@')
				.append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("code");
		sb.append('=');
		sb.append(((this.code == null) ? "<null>" : this.code));
		sb.append(',');
		sb.append("companyBranchName");
		sb.append('=');
		sb.append(((this.companyBranchName == null) ? "<null>" : this.companyBranchName));
		sb.append(',');
		sb.append("dateWhen");
		sb.append('=');
		sb.append(((this.dateWhen == null) ? "<null>" : this.dateWhen));
		sb.append(',');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null) ? "<null>" : this.name));
		sb.append(',');
		sb.append("subscriptionNumber");
		sb.append('=');
		sb.append(((this.subscriptionNumber == null) ? "<null>" : this.subscriptionNumber));
		sb.append(',');
		sb.append("subscriptionType");
		sb.append('=');
		sb.append(((this.subscriptionType == null) ? "<null>" : this.subscriptionType));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
