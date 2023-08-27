package models;

public class CompanyBranch {

    private String discriminator;
    private int code;
    private String companyBranchName;
    private String dateWhen;
    private String id;
    private String name;
    private String subscriptionNumber;
    private String subscriptionType;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CompanyBranch() {
    }

    /**
     * 
     * @param code
     * @param dateWhen
     * @param subscriptionNumber
     * @param subscriptionType
     * @param companyBranchName
     * @param name
     * @param id
     * @param discriminator
     */
    public CompanyBranch(String discriminator, int code, String companyBranchName, String dateWhen, String id, String name, String subscriptionNumber, String subscriptionType) {
        super();
        this.discriminator = discriminator;
        this.code = code;
        this.companyBranchName = companyBranchName;
        this.dateWhen = dateWhen;
        this.id = id;
        this.name = name;
        this.subscriptionNumber = subscriptionNumber;
        this.subscriptionType = subscriptionType;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public CompanyBranch withDiscriminator(String discriminator) {
        this.discriminator = discriminator;
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public CompanyBranch withCode(int code) {
        this.code = code;
        return this;
    }

    public String getCompanyBranchName() {
        return companyBranchName;
    }

    public void setCompanyBranchName(String companyBranchName) {
        this.companyBranchName = companyBranchName;
    }

    public CompanyBranch withCompanyBranchName(String companyBranchName) {
        this.companyBranchName = companyBranchName;
        return this;
    }

    public String getDateWhen() {
        return dateWhen;
    }

    public void setDateWhen(String dateWhen) {
        this.dateWhen = dateWhen;
    }

    public CompanyBranch withDateWhen(String dateWhen) {
        this.dateWhen = dateWhen;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CompanyBranch withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyBranch withName(String name) {
        this.name = name;
        return this;
    }

    public String getSubscriptionNumber() {
        return subscriptionNumber;
    }

    public void setSubscriptionNumber(String subscriptionNumber) {
        this.subscriptionNumber = subscriptionNumber;
    }

    public CompanyBranch withSubscriptionNumber(String subscriptionNumber) {
        this.subscriptionNumber = subscriptionNumber;
        return this;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public CompanyBranch withSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CompanyBranch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("discriminator");
        sb.append('=');
        sb.append(((this.discriminator == null)?"<null>":this.discriminator));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(this.code);
        sb.append(',');
        sb.append("companyBranchName");
        sb.append('=');
        sb.append(((this.companyBranchName == null)?"<null>":this.companyBranchName));
        sb.append(',');
        sb.append("dateWhen");
        sb.append('=');
        sb.append(((this.dateWhen == null)?"<null>":this.dateWhen));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("subscriptionNumber");
        sb.append('=');
        sb.append(((this.subscriptionNumber == null)?"<null>":this.subscriptionNumber));
        sb.append(',');
        sb.append("subscriptionType");
        sb.append('=');
        sb.append(((this.subscriptionType == null)?"<null>":this.subscriptionType));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
