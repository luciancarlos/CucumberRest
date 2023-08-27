package models;

public class Integration__1 {

	private String discriminator;
	private String branchName;
	private int companyBranchCode;
	private String companyBranchName;
	private int companyCode;
	private String companyName;
	private String cpfNumber;
	private String dateWhen;
	private Employee employee;
	private int employeeCode;
	private String employeeName;
	private String eSocialRegistration;
	private String externalHistoricId;
	private String externalId;
	private String id;
	private String integrationOrigin;
	private int integrationSequence;
	private String integrationType;
	private String operationType;
	private String previewSendDate;
	private String providerCompanyIdentification;
	private String providerEmployeeIdentification;
	private String providerName;
	private String providerPreviousCompanyIdentification;
	private String providerPreviousEmployeeIdentification;
	private String providerType;
	private String receiptDate;
	private int regenerateAttempts;
	private String scheduledDate;
	private String sendDate;
	private String statusType;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Integration__1() {
	}

	/**
	 * 
	 * @param statusType
	 * @param sendDate
	 * @param companyBranchName
	 * @param companyName
	 * @param scheduledDate
	 * @param employee
	 * @param externalHistoricId
	 * @param providerPreviousEmployeeIdentification
	 * @param providerType
	 * @param employeeCode
	 * @param integrationType
	 * @param dateWhen
	 * @param providerEmployeeIdentification
	 * @param id
	 * @param providerName
	 * @param companyCode
	 * @param employeeName
	 * @param previewSendDate
	 * @param companyBranchCode
	 * @param providerCompanyIdentification
	 * @param receiptDate
	 * @param branchName
	 * @param externalId
	 * @param integrationOrigin
	 * @param providerPreviousCompanyIdentification
	 * @param integrationSequence
	 * @param discriminator
	 * @param cpfNumber
	 * @param regenerateAttempts
	 * @param eSocialRegistration
	 * @param operationType
	 */
	public Integration__1(String discriminator, String branchName, int companyBranchCode, String companyBranchName,
			int companyCode, String companyName, String cpfNumber, String dateWhen, Employee employee, int employeeCode,
			String employeeName, String eSocialRegistration, String externalHistoricId, String externalId, String id,
			String integrationOrigin, int integrationSequence, String integrationType, String operationType,
			String previewSendDate, String providerCompanyIdentification, String providerEmployeeIdentification,
			String providerName, String providerPreviousCompanyIdentification,
			String providerPreviousEmployeeIdentification, String providerType, String receiptDate,
			int regenerateAttempts, String scheduledDate, String sendDate, String statusType) {
		super();
		this.discriminator = discriminator;
		this.branchName = branchName;
		this.companyBranchCode = companyBranchCode;
		this.companyBranchName = companyBranchName;
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.cpfNumber = cpfNumber;
		this.dateWhen = dateWhen;
		this.employee = employee;
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.eSocialRegistration = eSocialRegistration;
		this.externalHistoricId = externalHistoricId;
		this.externalId = externalId;
		this.id = id;
		this.integrationOrigin = integrationOrigin;
		this.integrationSequence = integrationSequence;
		this.integrationType = integrationType;
		this.operationType = operationType;
		this.previewSendDate = previewSendDate;
		this.providerCompanyIdentification = providerCompanyIdentification;
		this.providerEmployeeIdentification = providerEmployeeIdentification;
		this.providerName = providerName;
		this.providerPreviousCompanyIdentification = providerPreviousCompanyIdentification;
		this.providerPreviousEmployeeIdentification = providerPreviousEmployeeIdentification;
		this.providerType = providerType;
		this.receiptDate = receiptDate;
		this.regenerateAttempts = regenerateAttempts;
		this.scheduledDate = scheduledDate;
		this.sendDate = sendDate;
		this.statusType = statusType;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getCompanyBranchCode() {
		return companyBranchCode;
	}

	public void setCompanyBranchCode(int companyBranchCode) {
		this.companyBranchCode = companyBranchCode;
	}

	public String getCompanyBranchName() {
		return companyBranchName;
	}

	public void setCompanyBranchName(String companyBranchName) {
		this.companyBranchName = companyBranchName;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCpfNumber() {
		return cpfNumber;
	}

	public void setCpfNumber(String cpfNumber) {
		this.cpfNumber = cpfNumber;
	}

	public String getDateWhen() {
		return dateWhen;
	}

	public void setDateWhen(String dateWhen) {
		this.dateWhen = dateWhen;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String geteSocialRegistration() {
		return eSocialRegistration;
	}

	public void seteSocialRegistration(String eSocialRegistration) {
		this.eSocialRegistration = eSocialRegistration;
	}

	public String getExternalHistoricId() {
		return externalHistoricId;
	}

	public void setExternalHistoricId(String externalHistoricId) {
		this.externalHistoricId = externalHistoricId;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIntegrationOrigin() {
		return integrationOrigin;
	}

	public void setIntegrationOrigin(String integrationOrigin) {
		this.integrationOrigin = integrationOrigin;
	}

	public int getIntegrationSequence() {
		return integrationSequence;
	}

	public void setIntegrationSequence(int integrationSequence) {
		this.integrationSequence = integrationSequence;
	}

	public String getIntegrationType() {
		return integrationType;
	}

	public void setIntegrationType(String integrationType) {
		this.integrationType = integrationType;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getPreviewSendDate() {
		return previewSendDate;
	}

	public void setPreviewSendDate(String previewSendDate) {
		this.previewSendDate = previewSendDate;
	}

	public String getProviderCompanyIdentification() {
		return providerCompanyIdentification;
	}

	public void setProviderCompanyIdentification(String providerCompanyIdentification) {
		this.providerCompanyIdentification = providerCompanyIdentification;
	}

	public String getProviderEmployeeIdentification() {
		return providerEmployeeIdentification;
	}

	public void setProviderEmployeeIdentification(String providerEmployeeIdentification) {
		this.providerEmployeeIdentification = providerEmployeeIdentification;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderPreviousCompanyIdentification() {
		return providerPreviousCompanyIdentification;
	}

	public void setProviderPreviousCompanyIdentification(String providerPreviousCompanyIdentification) {
		this.providerPreviousCompanyIdentification = providerPreviousCompanyIdentification;
	}

	public String getProviderPreviousEmployeeIdentification() {
		return providerPreviousEmployeeIdentification;
	}

	public void setProviderPreviousEmployeeIdentification(String providerPreviousEmployeeIdentification) {
		this.providerPreviousEmployeeIdentification = providerPreviousEmployeeIdentification;
	}

	public String getProviderType() {
		return providerType;
	}

	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}

	public String getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}

	public int getRegenerateAttempts() {
		return regenerateAttempts;
	}

	public void setRegenerateAttempts(int regenerateAttempts) {
		this.regenerateAttempts = regenerateAttempts;
	}

	public String getScheduledDate() {
		return scheduledDate;
	}

	public void setScheduledDate(String scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public String getStatusType() {
		return statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Integration__1.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("discriminator");
		sb.append('=');
		sb.append(((this.discriminator == null) ? "<null>" : this.discriminator));
		sb.append(',');
		sb.append("branchName");
		sb.append('=');
		sb.append(((this.branchName == null) ? "<null>" : this.branchName));
		sb.append(',');
		sb.append("companyBranchCode");
		sb.append('=');
		sb.append(this.companyBranchCode);
		sb.append(',');
		sb.append("companyBranchName");
		sb.append('=');
		sb.append(((this.companyBranchName == null) ? "<null>" : this.companyBranchName));
		sb.append(',');
		sb.append("companyCode");
		sb.append('=');
		sb.append(this.companyCode);
		sb.append(',');
		sb.append("companyName");
		sb.append('=');
		sb.append(((this.companyName == null) ? "<null>" : this.companyName));
		sb.append(',');
		sb.append("cpfNumber");
		sb.append('=');
		sb.append(((this.cpfNumber == null) ? "<null>" : this.cpfNumber));
		sb.append(',');
		sb.append("dateWhen");
		sb.append('=');
		sb.append(((this.dateWhen == null) ? "<null>" : this.dateWhen));
		sb.append(',');
		sb.append("employee");
		sb.append('=');
		sb.append(((this.employee == null) ? "<null>" : this.employee));
		sb.append(',');
		sb.append("employeeCode");
		sb.append('=');
		sb.append(this.employeeCode);
		sb.append(',');
		sb.append("employeeName");
		sb.append('=');
		sb.append(((this.employeeName == null) ? "<null>" : this.employeeName));
		sb.append(',');
		sb.append("eSocialRegistration");
		sb.append('=');
		sb.append(((this.eSocialRegistration == null) ? "<null>" : this.eSocialRegistration));
		sb.append(',');
		sb.append("externalHistoricId");
		sb.append('=');
		sb.append(((this.externalHistoricId == null) ? "<null>" : this.externalHistoricId));
		sb.append(',');
		sb.append("externalId");
		sb.append('=');
		sb.append(((this.externalId == null) ? "<null>" : this.externalId));
		sb.append(',');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("integrationOrigin");
		sb.append('=');
		sb.append(((this.integrationOrigin == null) ? "<null>" : this.integrationOrigin));
		sb.append(',');
		sb.append("integrationSequence");
		sb.append('=');
		sb.append(this.integrationSequence);
		sb.append(',');
		sb.append("integrationType");
		sb.append('=');
		sb.append(((this.integrationType == null) ? "<null>" : this.integrationType));
		sb.append(',');
		sb.append("operationType");
		sb.append('=');
		sb.append(((this.operationType == null) ? "<null>" : this.operationType));
		sb.append(',');
		sb.append("previewSendDate");
		sb.append('=');
		sb.append(((this.previewSendDate == null) ? "<null>" : this.previewSendDate));
		sb.append(',');
		sb.append("providerCompanyIdentification");
		sb.append('=');
		sb.append(((this.providerCompanyIdentification == null) ? "<null>" : this.providerCompanyIdentification));
		sb.append(',');
		sb.append("providerEmployeeIdentification");
		sb.append('=');
		sb.append(((this.providerEmployeeIdentification == null) ? "<null>" : this.providerEmployeeIdentification));
		sb.append(',');
		sb.append("providerName");
		sb.append('=');
		sb.append(((this.providerName == null) ? "<null>" : this.providerName));
		sb.append(',');
		sb.append("providerPreviousCompanyIdentification");
		sb.append('=');
		sb.append(((this.providerPreviousCompanyIdentification == null) ? "<null>"
				: this.providerPreviousCompanyIdentification));
		sb.append(',');
		sb.append("providerPreviousEmployeeIdentification");
		sb.append('=');
		sb.append(((this.providerPreviousEmployeeIdentification == null) ? "<null>"
				: this.providerPreviousEmployeeIdentification));
		sb.append(',');
		sb.append("providerType");
		sb.append('=');
		sb.append(((this.providerType == null) ? "<null>" : this.providerType));
		sb.append(',');
		sb.append("receiptDate");
		sb.append('=');
		sb.append(((this.receiptDate == null) ? "<null>" : this.receiptDate));
		sb.append(',');
		sb.append("regenerateAttempts");
		sb.append('=');
		sb.append(this.regenerateAttempts);
		sb.append(',');
		sb.append("scheduledDate");
		sb.append('=');
		sb.append(((this.scheduledDate == null) ? "<null>" : this.scheduledDate));
		sb.append(',');
		sb.append("sendDate");
		sb.append('=');
		sb.append(((this.sendDate == null) ? "<null>" : this.sendDate));
		sb.append(',');
		sb.append("statusType");
		sb.append('=');
		sb.append(((this.statusType == null) ? "<null>" : this.statusType));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}
