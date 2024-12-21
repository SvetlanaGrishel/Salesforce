package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private static final By USERNAME_INPUT = By.id("username");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By LOGIN_BUTTON = By.id("Login");
    private static final String BASE_URL = "https://tms9-dev-ed.develop.my.salesforce.com/";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check that 'Login' page is opened")
    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        return this;
    }

    @Step("Open 'Login page'")
    public LoginPage open() {
        driver.get(BASE_URL);
        return this;
    }

    @Step("Log in to the system with valid credentials: {username} and {password}")
    public HomePage login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver); //если переходим на другую страницу
    }
}
