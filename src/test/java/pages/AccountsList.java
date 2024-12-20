package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsList extends BasePage {

    public AccountsList(WebDriver driver) {
        super(driver);
    }

    public static final String ACCOUNTS_PAGE_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/" +
            "list?filterName=AllAccounts";
    public static final String NEW_ACCOUNT_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/" +
            "new?count=1&nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&uid=173454703071286931";
    private static final By NEW_BUTTON = By.xpath("//*[@name='SaveEdit']");
    private static final By SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']");

    @Step("Open 'Accounts' page")
    public static void openAccountsPage() {
        driver.get(ACCOUNTS_PAGE_URL);
    }

    @Step("Open 'New Account' modal")
    public static void openNewAccountModal() {
        driver.get(NEW_ACCOUNT_URL);
    }

    @Step("Click 'Save' button")
    public static void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
