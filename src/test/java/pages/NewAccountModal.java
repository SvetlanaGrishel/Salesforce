package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

public class NewAccountModal extends BasePage {

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void fillAccountInformation(String accountName, String rating, String phone, String fax, String accountNumber,
                                       String website, String accountSite, String tickerSymbol, String type,
                                       String ownership, String industry, String employees, String annualRevenue,
                                       String sicCode) {
        new Input(driver, "Account Name").write(accountName);
        new Picklist(driver, "Rating").select(rating);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Account Number").write(accountNumber);
        new Input(driver, "Website").write(website);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Ticker Symbol").write(tickerSymbol);
        //кликаем на элемент, чтобы опуститься вниз
        WebElement hiddenElement = driver.findElement(By.xpath("//label[text()='Type']"));
        BasePage.clickJS(hiddenElement);
        new Picklist(driver, "Type").select(type);
        new Picklist(driver, "Ownership").select(ownership);
        new Picklist(driver, "Industry").select(industry);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "SIC Code").write(sicCode);
    }

    public void fillAddressInformation(String billingStreet, String shippingStreet, String billingCity,
                                       String billingState, String shippingCity, String shippingState,
                                       String billingZipCode, String billingCountry, String shippingZipCode,
                                       String shippingCountry) {
        new TextArea(driver, "Billing Street").write(billingStreet);
        new TextArea(driver, "Shipping Street").write(shippingStreet);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Billing State/Province").write(billingState);
        new Input(driver, "Shipping City").write(shippingCity);
        new Input(driver, "Shipping State/Province").write(shippingState);
        new Input(driver, "Billing Zip/Postal Code").write(billingZipCode);
        new Input(driver, "Billing Country").write(billingCountry);
        new Input(driver, "Shipping Zip/Postal Code").write(shippingZipCode);
        new Input(driver, "Shipping Country").write(shippingCountry);
    }

    public void fillAdditionalInformation(String customerPriority, String sla, String slaExpirationDate,
                                          String slaSerialNumber, String numberOfLocations, String upsellOpportunity,
                                          String active) {
        //кликаем на элемент, чтобы опуститься вниз
        WebElement hiddenElement2 = driver.findElement(By.xpath("//label[text()='Customer Priority']//ancestor::lightning-picklist"));
        BasePage.clickJS(hiddenElement2);
        new Picklist(driver, "Customer Priority").select(customerPriority);
        new Picklist(driver, "SLA").select(sla);
        new Input(driver, "SLA Expiration Date").write(slaExpirationDate);
        new Input(driver, "SLA Serial Number").write(slaSerialNumber);
        new Input(driver, "Number of Locations").write(numberOfLocations);
        new Picklist(driver, "Upsell Opportunity").select(upsellOpportunity);
        new Picklist(driver, "Active").select(active);
    }

    public void fillDescription(String description) {
        new TextArea(driver, "Description").write(description);
    }
}
