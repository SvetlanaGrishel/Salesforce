package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory extends BasePage {

    public LoginPageFactory(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    @FindBy(id = "username")
    WebElement userNameFiled;

    @FindBy(id = "password")
    WebElement passwordFiled;

    @FindBy(id = "Login")
    WebElement loginButton;

    public BasePage open() {
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com");
        PageFactory.initElements(driver, this);
        return null;
    }

    public void login(String username, String password) {
        userNameFiled.sendKeys(username);
        passwordFiled.sendKeys(password);
        loginButton.click();
    }
}
