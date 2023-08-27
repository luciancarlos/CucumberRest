package models;

public class SalaryPremium {

	private String specialRetirementType;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public SalaryPremium() {
	}

	/**
	 * 
	 * @param specialRetirementType
	 */
	public SalaryPremium(String specialRetirementType) {
		super();
		this.specialRetirementType = specialRetirementType;
	}

	public String getSpecialRetirementType() {
		return specialRetirementType;
	}

	public void setSpecialRetirementType(String specialRetirementType) {
		this.specialRetirementType = specialRetirementType;
	}

	public SalaryPremium withSpecialRetirementType(String specialRetirementType) {
		this.specialRetirementType = specialRetirementType;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(SalaryPremium.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("specialRetirementType");
		sb.append('=');
		sb.append(((this.specialRetirementType == null) ? "<null>" : this.specialRetirementType));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
