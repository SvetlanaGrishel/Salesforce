package dto;

public class Account {

    //Account Information
    String accountName;
    String phone;
    String fax;
    String rating;
    String accountNumber;
    String employees;

    //Address Information
    String billingStreet;
    String shippingStreet;
    String billingCity;
    String billingState;
    String shippingCity;
    String shippingState;
    String billingZipCode;
    String billingCountry;
    String shippingZipCode;
    String shippingCountry;

    //Additional Information
    String customerPriority;
    String sla;
    String slaSerialNumber;
    String upsellOpportunity;
    String active;

    public Account(String accountName, String phone, String fax, String rating, String accountNumber, String employees,
                   String billingStreet, String shippingStreet,
                   String billingCity, String billingState, String shippingCity, String shippingState,
                   String billingZipCode, String billingCountry, String shippingZipCode, String shippingCountry,
                   String customerPriority, String sla, String slaSerialNumber,
                   String upsellOpportunity, String active) {
        this.accountName = accountName;
        this.phone = phone;
        this.fax = fax;
        this.rating = rating;
        this.accountNumber = accountNumber;
        this.employees = employees;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.billingZipCode = billingZipCode;
        this.billingCountry = billingCountry;
        this.shippingZipCode = shippingZipCode;
        this.shippingCountry = shippingCountry;
        this.customerPriority = customerPriority;
        this.sla = sla;
        this.slaSerialNumber = slaSerialNumber;
        this.upsellOpportunity = upsellOpportunity;
        this.active = active;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getRating() {
        return rating;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getEmployees() {
        return employees;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public String getBillingZipCode() {
        return billingZipCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public String getShippingZipCode() {
        return shippingZipCode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public String getCustomerPriority() {
        return customerPriority;
    }

    public String getSla() {
        return sla;
    }

    public String getSlaSerialNumber() {
        return slaSerialNumber;
    }

    public String getUpsellOpportunity() {
        return upsellOpportunity;
    }

    public String getActive() {
        return active;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public void setBillingZipCode(String billingZipCode) {
        this.billingZipCode = billingZipCode;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public void setShippingZipCode(String shippingZipCode) {
        this.shippingZipCode = shippingZipCode;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public void setCustomerPriority(String customerPriority) {
        this.customerPriority = customerPriority;
    }

    public void setSla(String sla) {
        this.sla = sla;
    }

    public void setSlaSerialNumber(String slaSerialNumber) {
        this.slaSerialNumber = slaSerialNumber;
    }

    public void setUpsellOpportunity(String upsellOpportunity) {
        this.upsellOpportunity = upsellOpportunity;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
