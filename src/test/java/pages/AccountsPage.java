package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

@Log4j2
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
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_VISIBLE));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("'Accounts' page isn't opened");
        }
        return this;
    }

    @Override
    @Step("Open 'Accounts' page")
    public AccountsPage open() {
        log.info("Open 'Accounts' page");
        driver.get(ACCOUNTS_URL);
        return this;
    }
}
