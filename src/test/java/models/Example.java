package models;

public class Example {

	private Integration integration;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Example() {
	}

	/**
	 * 
	 * @param integration
	 */
	public Example(Integration integration) {
		super();
		this.integration = integration;
	}

	public Integration getIntegration() {
		return integration;
	}

	public void setIntegration(Integration integration) {
		this.integration = integration;
	}

	public Example withIntegration(Integration integration) {
		this.integration = integration;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Example.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("integration");
		sb.append('=');
		sb.append(((this.integration == null) ? "<null>" : this.integration));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
