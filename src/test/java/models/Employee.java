package models;

public class Employee {

	private String discriminator;
	private String birthday;
	private int code;
	private Company company;
	private CompanyBranch companyBranch;
	private String contractType;
	private CostCenter costCenter;
	private String cpfNumber;
	private String ctpsIssuanceDate;
	private String ctpsNumber;
	private String ctpsSerie;
	private String ctpsSerieDigit;
	private String ctpsState;
	private Department department;
	private String dismissalDate;
	private String employeeType;
	private ESocialCategory eSocialCategory;
	private String eSocialRegistration;
	private String externalId;
	private String genderType;
	private String hireDate;
	private String id;
	private boolean isDeficient;
	private JobPosition jobPosition;
	private String maritalStatusType;
	private String name;
	private String nisNumber;
	private int numberContractSameHireDate;
	private String previousCode;
	private PreviousCompany previousCompany;
	private PreviousCompanyBranch previousCompanyBranch;
	private ReasonLeave reasonLeave;
	private String rgIssuanceDate;
	private String rgIssuer;
	private String rgNumber;
	private String rgState;
	private SalaryPremium salaryPremium;
	private Shift shift;
	private String situationType;
	private Workstation workstation;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Employee() {
		this.workstation = new Workstation();
		this.shift = new Shift();
		this.salaryPremium = new SalaryPremium();
		this.reasonLeave = new ReasonLeave();
		this.previousCompanyBranch = new PreviousCompanyBranch();
		this.previousCompany = new PreviousCompany();
		this.jobPosition = new JobPosition();
		this.eSocialCategory = new ESocialCategory();
		this.department = new Department();
		this.costCenter = new CostCenter();
		this.companyBranch = new CompanyBranch();
		this.company = new Company();
	}

	/**
	 * 
	 * @param birthday
	 * @param ctpsSerieDigit
	 * @param code
	 * @param ctpsState
	 * @param contractType
	 * @param shift
	 * @param dismissalDate
	 * @param eSocialCategory
	 * @param ctpsNumber
	 * @param rgIssuer
	 * @param rgState
	 * @param previousCompany
	 * @param company
	 * @param id
	 * @param previousCode
	 * @param department
	 * @param reasonLeave
	 * @param ctpsSerie
	 * @param genderType
	 * @param hireDate
	 * @param costCenter
	 * @param externalId
	 * @param workstation
	 * @param maritalStatusType
	 * @param isDeficient
	 * @param nisNumber
	 * @param discriminator
	 * @param jobPosition
	 * @param cpfNumber
	 * @param salaryPremium
	 * @param employeeType
	 * @param companyBranch
	 * @param situationType
	 * @param name
	 * @param previousCompanyBranch
	 * @param eSocialRegistration
	 * @param numberContractSameHireDate
	 * @param rgNumber
	 * @param ctpsIssuanceDate
	 * @param rgIssuanceDate
	 */
	public Employee(String discriminator, String birthday, int code, Company company, CompanyBranch companyBranch,
			String contractType, CostCenter costCenter, String cpfNumber, String ctpsIssuanceDate, String ctpsNumber,
			String ctpsSerie, String ctpsSerieDigit, String ctpsState, Department department, String dismissalDate,
			String employeeType, ESocialCategory eSocialCategory, String eSocialRegistration, String externalId,
			String genderType, String hireDate, String id, boolean isDeficient, JobPosition jobPosition,
			String maritalStatusType, String name, String nisNumber, int numberContractSameHireDate,
			String previousCode, PreviousCompany previousCompany, PreviousCompanyBranch previousCompanyBranch,
			ReasonLeave reasonLeave, String rgIssuanceDate, String rgIssuer, String rgNumber, String rgState,
			SalaryPremium salaryPremium, Shift shift, String situationType, Workstation workstation) {
		super();
		this.discriminator = discriminator;
		this.birthday = birthday;
		this.code = code;
		this.company = company;
		this.companyBranch = companyBranch;
		this.contractType = contractType;
		this.costCenter = costCenter;
		this.cpfNumber = cpfNumber;
		this.ctpsIssuanceDate = ctpsIssuanceDate;
		this.ctpsNumber = ctpsNumber;
		this.ctpsSerie = ctpsSerie;
		this.ctpsSerieDigit = ctpsSerieDigit;
		this.ctpsState = ctpsState;
		this.department = department;
		this.dismissalDate = dismissalDate;
		this.employeeType = employeeType;
		this.eSocialCategory = eSocialCategory;
		this.eSocialRegistration = eSocialRegistration;
		this.externalId = externalId;
		this.genderType = genderType;
		this.hireDate = hireDate;
		this.id = id;
		this.isDeficient = isDeficient;
		this.jobPosition = jobPosition;
		this.maritalStatusType = maritalStatusType;
		this.name = name;
		this.nisNumber = nisNumber;
		this.numberContractSameHireDate = numberContractSameHireDate;
		this.previousCode = previousCode;
		this.previousCompany = previousCompany;
		this.previousCompanyBranch = previousCompanyBranch;
		this.reasonLeave = reasonLeave;
		this.rgIssuanceDate = rgIssuanceDate;
		this.rgIssuer = rgIssuer;
		this.rgNumber = rgNumber;
		this.rgState = rgState;
		this.salaryPremium = salaryPremium;
		this.shift = shift;
		this.situationType = situationType;
		this.workstation = workstation;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public Employee withDiscriminator(String discriminator) {
		this.discriminator = discriminator;
		return this;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Employee withBirthday(String birthday) {
		this.birthday = birthday;
		return this;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Employee withCode(int code) {
		this.code = code;
		return this;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Employee withCompany(Company company) {
		this.company = company;
		return this;
	}

	public CompanyBranch getCompanyBranch() {
		return companyBranch;
	}

	public void setCompanyBranch(CompanyBranch companyBranch) {
		this.companyBranch = companyBranch;
	}

	public Employee withCompanyBranch(CompanyBranch companyBranch) {
		this.companyBranch = companyBranch;
		return this;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Employee withContractType(String contractType) {
		this.contractType = contractType;
		return this;
	}

	public CostCenter getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(CostCenter costCenter) {
		this.costCenter = costCenter;
	}

	public Employee withCostCenter(CostCenter costCenter) {
		this.costCenter = costCenter;
		return this;
	}

	public String getCpfNumber() {
		return cpfNumber;
	}

	public void setCpfNumber(String cpfNumber) {
		this.cpfNumber = cpfNumber;
	}

	public Employee withCpfNumber(String cpfNumber) {
		this.cpfNumber = cpfNumber;
		return this;
	}

	public String getCtpsIssuanceDate() {
		return ctpsIssuanceDate;
	}

	public void setCtpsIssuanceDate(String ctpsIssuanceDate) {
		this.ctpsIssuanceDate = ctpsIssuanceDate;
	}

	public Employee withCtpsIssuanceDate(String ctpsIssuanceDate) {
		this.ctpsIssuanceDate = ctpsIssuanceDate;
		return this;
	}

	public String getCtpsNumber() {
		return ctpsNumber;
	}

	public void setCtpsNumber(String ctpsNumber) {
		this.ctpsNumber = ctpsNumber;
	}

	public Employee withCtpsNumber(String ctpsNumber) {
		this.ctpsNumber = ctpsNumber;
		return this;
	}

	public String getCtpsSerie() {
		return ctpsSerie;
	}

	public void setCtpsSerie(String ctpsSerie) {
		this.ctpsSerie = ctpsSerie;
	}

	public Employee withCtpsSerie(String ctpsSerie) {
		this.ctpsSerie = ctpsSerie;
		return this;
	}

	public String getCtpsSerieDigit() {
		return ctpsSerieDigit;
	}

	public void setCtpsSerieDigit(String ctpsSerieDigit) {
		this.ctpsSerieDigit = ctpsSerieDigit;
	}

	public Employee withCtpsSerieDigit(String ctpsSerieDigit) {
		this.ctpsSerieDigit = ctpsSerieDigit;
		return this;
	}

	public String getCtpsState() {
		return ctpsState;
	}

	public void setCtpsState(String ctpsState) {
		this.ctpsState = ctpsState;
	}

	public Employee withCtpsState(String ctpsState) {
		this.ctpsState = ctpsState;
		return this;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee withDepartment(Department department) {
		this.department = department;
		return this;
	}

	public String getDismissalDate() {
		return dismissalDate;
	}

	public void setDismissalDate(String dismissalDate) {
		this.dismissalDate = dismissalDate;
	}

	public Employee withDismissalDate(String dismissalDate) {
		this.dismissalDate = dismissalDate;
		return this;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public Employee withEmployeeType(String employeeType) {
		this.employeeType = employeeType;
		return this;
	}

	public ESocialCategory geteSocialCategory() {
		return eSocialCategory;
	}

	public void seteSocialCategory(ESocialCategory eSocialCategory) {
		this.eSocialCategory = eSocialCategory;
	}

	public Employee witheSocialCategory(ESocialCategory eSocialCategory) {
		this.eSocialCategory = eSocialCategory;
		return this;
	}

	public String geteSocialRegistration() {
		return eSocialRegistration;
	}

	public void seteSocialRegistration(String eSocialRegistration) {
		this.eSocialRegistration = eSocialRegistration;
	}

	public Employee witheSocialRegistration(String eSocialRegistration) {
		this.eSocialRegistration = eSocialRegistration;
		return this;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Employee withExternalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	public String getGenderType() {
		return genderType;
	}

	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}

	public Employee withGenderType(String genderType) {
		this.genderType = genderType;
		return this;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public Employee withHireDate(String hireDate) {
		this.hireDate = hireDate;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Employee withId(String id) {
		this.id = id;
		return this;
	}

	public boolean isIsDeficient() {
		return isDeficient;
	}

	public void setIsDeficient(boolean isDeficient) {
		this.isDeficient = isDeficient;
	}

	public Employee withIsDeficient(boolean isDeficient) {
		this.isDeficient = isDeficient;
		return this;
	}

	public JobPosition getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
	}

	public Employee withJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
		return this;
	}

	public String getMaritalStatusType() {
		return maritalStatusType;
	}

	public void setMaritalStatusType(String maritalStatusType) {
		this.maritalStatusType = maritalStatusType;
	}

	public Employee withMaritalStatusType(String maritalStatusType) {
		this.maritalStatusType = maritalStatusType;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee withName(String name) {
		this.name = name;
		return this;
	}

	public String getNisNumber() {
		return nisNumber;
	}

	public void setNisNumber(String nisNumber) {
		this.nisNumber = nisNumber;
	}

	public Employee withNisNumber(String nisNumber) {
		this.nisNumber = nisNumber;
		return this;
	}

	public int getNumberContractSameHireDate() {
		return numberContractSameHireDate;
	}

	public void setNumberContractSameHireDate(int numberContractSameHireDate) {
		this.numberContractSameHireDate = numberContractSameHireDate;
	}

	public Employee withNumberContractSameHireDate(int numberContractSameHireDate) {
		this.numberContractSameHireDate = numberContractSameHireDate;
		return this;
	}

	public String getPreviousCode() {
		return previousCode;
	}

	public void setPreviousCode(String previousCode) {
		this.previousCode = previousCode;
	}

	public Employee withPreviousCode(String previousCode) {
		this.previousCode = previousCode;
		return this;
	}

	public PreviousCompany getPreviousCompany() {
		return previousCompany;
	}

	public void setPreviousCompany(PreviousCompany previousCompany) {
		this.previousCompany = previousCompany;
	}

	public Employee withPreviousCompany(PreviousCompany previousCompany) {
		this.previousCompany = previousCompany;
		return this;
	}

	public PreviousCompanyBranch getPreviousCompanyBranch() {
		return previousCompanyBranch;
	}

	public void setPreviousCompanyBranch(PreviousCompanyBranch previousCompanyBranch) {
		this.previousCompanyBranch = previousCompanyBranch;
	}

	public Employee withPreviousCompanyBranch(PreviousCompanyBranch previousCompanyBranch) {
		this.previousCompanyBranch = previousCompanyBranch;
		return this;
	}

	public ReasonLeave getReasonLeave() {
		return reasonLeave;
	}

	public void setReasonLeave(ReasonLeave reasonLeave) {
		this.reasonLeave = reasonLeave;
	}

	public Employee withReasonLeave(ReasonLeave reasonLeave) {
		this.reasonLeave = reasonLeave;
		return this;
	}

	public String getRgIssuanceDate() {
		return rgIssuanceDate;
	}

	public void setRgIssuanceDate(String rgIssuanceDate) {
		this.rgIssuanceDate = rgIssuanceDate;
	}

	public Employee withRgIssuanceDate(String rgIssuanceDate) {
		this.rgIssuanceDate = rgIssuanceDate;
		return this;
	}

	public String getRgIssuer() {
		return rgIssuer;
	}

	public void setRgIssuer(String rgIssuer) {
		this.rgIssuer = rgIssuer;
	}

	public Employee withRgIssuer(String rgIssuer) {
		this.rgIssuer = rgIssuer;
		return this;
	}

	public String getRgNumber() {
		return rgNumber;
	}

	public void setRgNumber(String rgNumber) {
		this.rgNumber = rgNumber;
	}

	public Employee withRgNumber(String rgNumber) {
		this.rgNumber = rgNumber;
		return this;
	}

	public String getRgState() {
		return rgState;
	}

	public void setRgState(String rgState) {
		this.rgState = rgState;
	}

	public Employee withRgState(String rgState) {
		this.rgState = rgState;
		return this;
	}

	public SalaryPremium getSalaryPremium() {
		return salaryPremium;
	}

	public void setSalaryPremium(SalaryPremium salaryPremium) {
		this.salaryPremium = salaryPremium;
	}

	public Employee withSalaryPremium(SalaryPremium salaryPremium) {
		this.salaryPremium = salaryPremium;
		return this;
	}

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

	public Employee withShift(Shift shift) {
		this.shift = shift;
		return this;
	}

	public String getSituationType() {
		return situationType;
	}

	public void setSituationType(String situationType) {
		this.situationType = situationType;
	}

	public Employee withSituationType(String situationType) {
		this.situationType = situationType;
		return this;
	}

	public Workstation getWorkstation() {
		return workstation;
	}

	public void setWorkstation(Workstation workstation) {
		this.workstation = workstation;
	}

	public Employee withWorkstation(Workstation workstation) {
		this.workstation = workstation;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [discriminator=");
		builder.append(discriminator);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", code=");
		builder.append(code);
		builder.append(", company=");
		builder.append(company);
		builder.append(", companyBranch=");
		builder.append(companyBranch);
		builder.append(", contractType=");
		builder.append(contractType);
		builder.append(", costCenter=");
		builder.append(costCenter);
		builder.append(", cpfNumber=");
		builder.append(cpfNumber);
		builder.append(", ctpsIssuanceDate=");
		builder.append(ctpsIssuanceDate);
		builder.append(", ctpsNumber=");
		builder.append(ctpsNumber);
		builder.append(", ctpsSerie=");
		builder.append(ctpsSerie);
		builder.append(", ctpsSerieDigit=");
		builder.append(ctpsSerieDigit);
		builder.append(", ctpsState=");
		builder.append(ctpsState);
		builder.append(", department=");
		builder.append(department);
		builder.append(", dismissalDate=");
		builder.append(dismissalDate);
		builder.append(", employeeType=");
		builder.append(employeeType);
		builder.append(", eSocialCategory=");
		builder.append(eSocialCategory);
		builder.append(", eSocialRegistration=");
		builder.append(eSocialRegistration);
		builder.append(", externalId=");
		builder.append(externalId);
		builder.append(", genderType=");
		builder.append(genderType);
		builder.append(", hireDate=");
		builder.append(hireDate);
		builder.append(", id=");
		builder.append(id);
		builder.append(", isDeficient=");
		builder.append(isDeficient);
		builder.append(", jobPosition=");
		builder.append(jobPosition);
		builder.append(", maritalStatusType=");
		builder.append(maritalStatusType);
		builder.append(", name=");
		builder.append(name);
		builder.append(", nisNumber=");
		builder.append(nisNumber);
		builder.append(", numberContractSameHireDate=");
		builder.append(numberContractSameHireDate);
		builder.append(", previousCode=");
		builder.append(previousCode);
		builder.append(", previousCompany=");
		builder.append(previousCompany);
		builder.append(", previousCompanyBranch=");
		builder.append(previousCompanyBranch);
		builder.append(", reasonLeave=");
		builder.append(reasonLeave);
		builder.append(", rgIssuanceDate=");
		builder.append(rgIssuanceDate);
		builder.append(", rgIssuer=");
		builder.append(rgIssuer);
		builder.append(", rgNumber=");
		builder.append(rgNumber);
		builder.append(", rgState=");
		builder.append(rgState);
		builder.append(", salaryPremium=");
		builder.append(salaryPremium);
		builder.append(", shift=");
		builder.append(shift);
		builder.append(", situationType=");
		builder.append(situationType);
		builder.append(", workstation=");
		builder.append(workstation);
		builder.append("]");
		return builder.toString();
	}
}
