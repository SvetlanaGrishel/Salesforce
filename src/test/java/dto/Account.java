package dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {

    //Account Information
    private final String accountName;
    private final String phone;
    private final String fax;
    private final String rating;
    private final String accountNumber;
    private final String employees;

    //Address Information
    private final String billingStreet;
    private final String shippingStreet;
    private final String billingCity;
    private final String billingState;
    private final String shippingCity;
    private final String shippingState;
    private final String billingZipCode;
    private final String billingCountry;
    private final String shippingZipCode;
    private final String shippingCountry;

    //Additional Information
    private final String customerPriority;
    private final String sla;
    private final String slaSerialNumber;
    private final String upsellOpportunity;
    private final String active;
}
