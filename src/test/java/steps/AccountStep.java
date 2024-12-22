package steps;

import dto.Account;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.AccountsPage;
import pages.HomePage;
import pages.NewAccountModal;

@Log4j2
public class AccountStep {

    HomePage homePage;
    AccountsPage accountsPage;
    NewAccountModal newAccountModal;

    public AccountStep(WebDriver driver) {
        homePage = new HomePage(driver);
        accountsPage = new AccountsPage(driver);
        newAccountModal = new NewAccountModal(driver);
    }

    @Step("Create account with Account information, Address Information and Additional Information")
    public void create(Account account) {
        log.info("Creating new account, filling information");
        homePage.selectMenuOption("Accounts")
                .isPageOpened();
        newAccountModal.open()
                .fillAccountInformation(account)
                .fillAddressInformation(account)
                .fillAdditionalInformation(account)
                .clickSaveButton();
    }
}
