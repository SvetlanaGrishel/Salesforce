package pages;

import dto.Account;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

@Log4j2
public class NewAccountModal extends BasePage {

    private static final By SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']");
    public static final String NEW_ACCOUNT_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/" +
            "new?count=1&nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&uid=173454703071286931";

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check that 'New Account' modal is opened")
    public NewAccountModal isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_BUTTON));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("'Login' page isn't opened");
        }
        return this;
    }

    @Override
    @Step("Open 'New Account' modal")
    public NewAccountModal open() {
        log.info("Open 'New Account' modal");
        driver.get(NEW_ACCOUNT_URL);
        return this;
    }

    @Step("Fill Account Information on 'New Account' modal")
    public NewAccountModal fillAccountInformation(Account account) {
        log.info("Fill Account Information on 'New Account' modal '{}'", account.getAccountName());
        new Input(driver, "Account Name").write(account.getAccountName());
        new Picklist(driver, "Rating").select(account.getRating());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Account Number").write(account.getAccountNumber());
        new Input(driver, "Employees").write(account.getEmployees());
        return this;
    }

    @Step("Fill Address Information on 'New Account' modal")
    public NewAccountModal fillAddressInformation(Account account) {
        log.info("Fill Address Information on 'New Account' modal '{}'", account.getAccountName());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingState());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipCode());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZipCode());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        return this;
    }

    @Step("Fill Additional Information on 'New Account' modal")
    public NewAccountModal fillAdditionalInformation(Account account) {
        log.info("Fill Additional Information on 'New Account' modal '{}'", account.getAccountName());
        new Picklist(driver, "Customer Priority").select(account.getCustomerPriority());
        new Picklist(driver, "SLA").select(account.getSla());
        new Input(driver, "SLA Serial Number").write(account.getSlaSerialNumber());
        new Picklist(driver, "Upsell Opportunity").select(account.getUpsellOpportunity());
        new Picklist(driver, "Active").select(account.getActive());
        return this;
    }

    @Step("Click 'Save' button on 'New Account' modal")
    public AccountsPage clickSaveButton() {
        log.info("Click 'Save' button on 'New Account' modal");
        driver.findElement(SAVE_BUTTON).click();
        return new AccountsPage(driver);
    }
}
