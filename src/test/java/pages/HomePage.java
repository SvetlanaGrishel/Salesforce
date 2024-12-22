package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

@Log4j2
public class HomePage extends BasePage {

    private final String MENU_OPTION_PATTERN = "//span[text()='%s']//ancestor::one-app-nav-bar-item-root[@role='listitem']";
    private final String USER_IMAGE_VISIBLE_PATTERN = "//img[@alt='User']//ancestor::button[@type='button']";
    private final String HOMEPAGE_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/page/home";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check that 'Homepage' is opened")
    public HomePage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(USER_IMAGE_VISIBLE_PATTERN)));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("'Homepage' page isn't opened");
        }
        return this;
    }

    @Override
    @Step("Open 'Homepage'")
    public HomePage open() {
        log.info("Open 'Homepage' page");
        driver.get(HOMEPAGE_URL);
        return this;
    }

    @Step("Select option {optionName} in the menu")
    public AccountsPage selectMenuOption(String optionName) {
        log.info("Option 'Accounts' is selected in the menu");
        By setOption = By.xpath(String.format(MENU_OPTION_PATTERN, optionName));
        driver.findElement(setOption).click();
        return new AccountsPage(driver);
    }
}
