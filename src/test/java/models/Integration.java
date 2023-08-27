package models;


public class Integration {

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
    public Integration() {
    	this.employee = new Employee();
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
    public Integration(String discriminator, String branchName, int companyBranchCode, String companyBranchName, int companyCode, String companyName, String cpfNumber, String dateWhen, Employee employee, int employeeCode, String employeeName, String eSocialRegistration, String externalHistoricId, String externalId, String id, String integrationOrigin, int integrationSequence, String integrationType, String operationType, String previewSendDate, String providerCompanyIdentification, String providerEmployeeIdentification, String providerName, String providerPreviousCompanyIdentification, String providerPreviousEmployeeIdentification, String providerType, String receiptDate, int regenerateAttempts, String scheduledDate, String sendDate, String statusType) {
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

    public Integration withDiscriminator(String discriminator) {
        this.discriminator = discriminator;
        return this;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Integration withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    public int getCompanyBranchCode() {
        return companyBranchCode;
    }

    public void setCompanyBranchCode(int companyBranchCode) {
        this.companyBranchCode = companyBranchCode;
    }

    public Integration withCompanyBranchCode(int companyBranchCode) {
        this.companyBranchCode = companyBranchCode;
        return this;
    }

    public String getCompanyBranchName() {
        return companyBranchName;
    }

    public void setCompanyBranchName(String companyBranchName) {
        this.companyBranchName = companyBranchName;
    }

    public Integration withCompanyBranchName(String companyBranchName) {
        this.companyBranchName = companyBranchName;
        return this;
    }

    public int getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(int companyCode) {
        this.companyCode = companyCode;
    }

    public Integration withCompanyCode(int companyCode) {
        this.companyCode = companyCode;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integration withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getCpfNumber() {
        return cpfNumber;
    }

    public void setCpfNumber(String cpfNumber) {
        this.cpfNumber = cpfNumber;
    }

    public Integration withCpfNumber(String cpfNumber) {
        this.cpfNumber = cpfNumber;
        return this;
    }

    public String getDateWhen() {
        return dateWhen;
    }

    public void setDateWhen(String dateWhen) {
        this.dateWhen = dateWhen;
    }

    public Integration withDateWhen(String dateWhen) {
        this.dateWhen = dateWhen;
        return this;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integration withEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Integration withEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
        return this;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integration withEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    public String geteSocialRegistration() {
        return eSocialRegistration;
    }

    public void seteSocialRegistration(String eSocialRegistration) {
        this.eSocialRegistration = eSocialRegistration;
    }

    public Integration witheSocialRegistration(String eSocialRegistration) {
        this.eSocialRegistration = eSocialRegistration;
        return this;
    }

    public String getExternalHistoricId() {
        return externalHistoricId;
    }

    public void setExternalHistoricId(String externalHistoricId) {
        this.externalHistoricId = externalHistoricId;
    }

    public Integration withExternalHistoricId(String externalHistoricId) {
        this.externalHistoricId = externalHistoricId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Integration withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integration withId(String id) {
        this.id = id;
        return this;
    }

    public String getIntegrationOrigin() {
        return integrationOrigin;
    }

    public void setIntegrationOrigin(String integrationOrigin) {
        this.integrationOrigin = integrationOrigin;
    }

    public Integration withIntegrationOrigin(String integrationOrigin) {
        this.integrationOrigin = integrationOrigin;
        return this;
    }

    public int getIntegrationSequence() {
        return integrationSequence;
    }

    public void setIntegrationSequence(int integrationSequence) {
        this.integrationSequence = integrationSequence;
    }

    public Integration withIntegrationSequence(int integrationSequence) {
        this.integrationSequence = integrationSequence;
        return this;
    }

    public String getIntegrationType() {
        return integrationType;
    }

    public void setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
    }

    public Integration withIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Integration withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    public String getPreviewSendDate() {
        return previewSendDate;
    }

    public void setPreviewSendDate(String previewSendDate) {
        this.previewSendDate = previewSendDate;
    }

    public Integration withPreviewSendDate(String previewSendDate) {
        this.previewSendDate = previewSendDate;
        return this;
    }

    public String getProviderCompanyIdentification() {
        return providerCompanyIdentification;
    }

    public void setProviderCompanyIdentification(String providerCompanyIdentification) {
        this.providerCompanyIdentification = providerCompanyIdentification;
    }

    public Integration withProviderCompanyIdentification(String providerCompanyIdentification) {
        this.providerCompanyIdentification = providerCompanyIdentification;
        return this;
    }

    public String getProviderEmployeeIdentification() {
        return providerEmployeeIdentification;
    }

    public void setProviderEmployeeIdentification(String providerEmployeeIdentification) {
        this.providerEmployeeIdentification = providerEmployeeIdentification;
    }

    public Integration withProviderEmployeeIdentification(String providerEmployeeIdentification) {
        this.providerEmployeeIdentification = providerEmployeeIdentification;
        return this;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Integration withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    public String getProviderPreviousCompanyIdentification() {
        return providerPreviousCompanyIdentification;
    }

    public void setProviderPreviousCompanyIdentification(String providerPreviousCompanyIdentification) {
        this.providerPreviousCompanyIdentification = providerPreviousCompanyIdentification;
    }

    public Integration withProviderPreviousCompanyIdentification(String providerPreviousCompanyIdentification) {
        this.providerPreviousCompanyIdentification = providerPreviousCompanyIdentification;
        return this;
    }

    public String getProviderPreviousEmployeeIdentification() {
        return providerPreviousEmployeeIdentification;
    }

    public void setProviderPreviousEmployeeIdentification(String providerPreviousEmployeeIdentification) {
        this.providerPreviousEmployeeIdentification = providerPreviousEmployeeIdentification;
    }

    public Integration withProviderPreviousEmployeeIdentification(String providerPreviousEmployeeIdentification) {
        this.providerPreviousEmployeeIdentification = providerPreviousEmployeeIdentification;
        return this;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public Integration withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Integration withReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
        return this;
    }

    public int getRegenerateAttempts() {
        return regenerateAttempts;
    }

    public void setRegenerateAttempts(int regenerateAttempts) {
        this.regenerateAttempts = regenerateAttempts;
    }

    public Integration withRegenerateAttempts(int regenerateAttempts) {
        this.regenerateAttempts = regenerateAttempts;
        return this;
    }

    public String getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public Integration withScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
        return this;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public Integration withSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public Integration withStatusType(String statusType) {
        this.statusType = statusType;
        return this;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Integration [discriminator=");
		builder.append(discriminator);
		builder.append(", branchName=");
		builder.append(branchName);
		builder.append(", companyBranchCode=");
		builder.append(companyBranchCode);
		builder.append(", companyBranchName=");
		builder.append(companyBranchName);
		builder.append(", companyCode=");
		builder.append(companyCode);
		builder.append(", companyName=");
		builder.append(companyName);
		builder.append(", cpfNumber=");
		builder.append(cpfNumber);
		builder.append(", dateWhen=");
		builder.append(dateWhen);
		builder.append(", employee=");
		builder.append(employee);
		builder.append(", employeeCode=");
		builder.append(employeeCode);
		builder.append(", employeeName=");
		builder.append(employeeName);
		builder.append(", eSocialRegistration=");
		builder.append(eSocialRegistration);
		builder.append(", externalHistoricId=");
		builder.append(externalHistoricId);
		builder.append(", externalId=");
		builder.append(externalId);
		builder.append(", id=");
		builder.append(id);
		builder.append(", integrationOrigin=");
		builder.append(integrationOrigin);
		builder.append(", integrationSequence=");
		builder.append(integrationSequence);
		builder.append(", integrationType=");
		builder.append(integrationType);
		builder.append(", operationType=");
		builder.append(operationType);
		builder.append(", previewSendDate=");
		builder.append(previewSendDate);
		builder.append(", providerCompanyIdentification=");
		builder.append(providerCompanyIdentification);
		builder.append(", providerEmployeeIdentification=");
		builder.append(providerEmployeeIdentification);
		builder.append(", providerName=");
		builder.append(providerName);
		builder.append(", providerPreviousCompanyIdentification=");
		builder.append(providerPreviousCompanyIdentification);
		builder.append(", providerPreviousEmployeeIdentification=");
		builder.append(providerPreviousEmployeeIdentification);
		builder.append(", providerType=");
		builder.append(providerType);
		builder.append(", receiptDate=");
		builder.append(receiptDate);
		builder.append(", regenerateAttempts=");
		builder.append(regenerateAttempts);
		builder.append(", scheduledDate=");
		builder.append(scheduledDate);
		builder.append(", sendDate=");
		builder.append(sendDate);
		builder.append(", statusType=");
		builder.append(statusType);
		builder.append("]");
		return builder.toString();
	}    
}
