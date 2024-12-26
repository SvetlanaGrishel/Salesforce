package steps;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.PropertyReader;

@Log4j2
public class LoginStep {

    LoginPage loginPage;

    private String SF_USERNAME = System.getProperty("SF_USERNAME", PropertyReader.getProperty("SF_USERNAME"));
    private String SF_PASSWORD = System.getProperty("SF_PASSWORD", PropertyReader.getProperty("SF_PASSWORD"));

    public LoginStep(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    public void login() {
        log.info("Login to the 'Salesforce' system with credentials");
        loginPage.open()
                .isPageOpened()
                .login(SF_USERNAME, SF_PASSWORD)
                .open()
                .isPageOpened();
    }
}
