package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsPage extends BasePage {

    public static final String ACCOUNTS_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/list?" +
            "filterName=AllAccounts";
    private final By SEARCH_VISIBLE = By.xpath("//div[@type='search']//input");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check that 'Accounts' page is opened")
    public AccountsPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_VISIBLE));
        return this;
    }

    @Override
    @Step("Open 'Accounts' page")
    public AccountsPage open() {
        driver.get(ACCOUNTS_URL);
        return this;
    }
}
