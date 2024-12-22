package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

@Log4j2
public class LoginPage extends BasePage {

    private static final By USERNAME_INPUT = By.id("username");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By LOGIN_BUTTON = By.id("Login");
    private static final String BASE_SALEFORCE_URL = "https://tms9-dev-ed.develop.my.salesforce.com/";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check that 'Login' page is opened")
    public LoginPage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("'Login' page isn't opened");
        }
        return this;
    }

    @Override
    @Step("Open 'Login page'")
    public LoginPage open() {
        log.info("Open 'Login' page");
        driver.get(BASE_SALEFORCE_URL);
        return this;
    }

    @Step("Log in to the system with valid credentials: {username} and {password}")
    public HomePage login(String username, String password) {
        log.info("Log in using credentials '{}' and '{}'", username, password);
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver); //если переходим на другую страницу
    }
}
