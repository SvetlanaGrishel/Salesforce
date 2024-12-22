package dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {

    //Account Information
    @Builder.Default
    private final String accountName = "Green Solution Company";
    @Builder.Default
    private final String phone = "";
    @Builder.Default
    private final String fax = "";
    @Builder.Default
    private final String rating = "Hot";
    @Builder.Default
    private final String accountNumber = "";
    @Builder.Default
    private final String employees = "";

    //Address Information
    @Builder.Default
    private final String billingStreet = "";
    @Builder.Default
    private final String shippingStreet = "";
    @Builder.Default
    private final String billingCity = "";
    @Builder.Default
    private final String billingState = "";
    @Builder.Default
    private final String shippingCity = "";
    @Builder.Default
    private final String shippingState = "";
    @Builder.Default
    private final String billingZipCode = "";
    @Builder.Default
    private final String billingCountry= "";
    @Builder.Default
    private final String shippingZipCode = "";
    @Builder.Default
    private final String shippingCountry = "";

    //Additional Information
    @Builder.Default
    private final String customerPriority = "High";
    @Builder.Default
    private final String sla = "Gold";
    @Builder.Default
    private final String slaSerialNumber = "";
    @Builder.Default
    private final String upsellOpportunity = "No";
    @Builder.Default
    private final String active = "No";
}
