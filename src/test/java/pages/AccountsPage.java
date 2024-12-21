package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    @Override
    public BasePage open() {
        return null;
    }

    public static final String NEW_ACCOUNT_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/" +
            "new?count=1&nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&uid=173454703071286931";

    @Step("Open 'New Account' modal")
    public NewAccountModal openNewAccountModal() {
        driver.get(NEW_ACCOUNT_URL);
        return new NewAccountModal(driver);
    }
}
