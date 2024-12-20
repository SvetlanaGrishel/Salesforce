package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private static final By USERNAME_INPUT = By.id("username");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By LOGIN_BUTTON = By.id("Login");

    public static final String BASE_URL = "https://tms9-dev-ed.develop.my.salesforce.com";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open login page Saleforce")
    public static void open() {
        driver.get(BASE_URL);
    }

    @Step("Log in to the system")
    public static void login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
