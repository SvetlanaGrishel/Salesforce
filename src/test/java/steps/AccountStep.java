package steps;

import dto.Account;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.AccountsPage;
import pages.HomePage;
import pages.NewAccountModal;

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
        homePage.selectMenuOption("Accounts")
                .openNewAccountModal()
                .fillAccountInformation(account)
                .fillAddressInformation(account)
                .fillAdditionalInformation(account)
                .clickSaveButton();
    }
}
