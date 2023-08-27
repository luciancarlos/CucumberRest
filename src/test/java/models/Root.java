package models;

public class Root {
	public Integration integration;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Root [integration=");
		builder.append(integration);
		builder.append("]");
		return builder.toString();
	}
}
