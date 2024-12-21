package tests;

import dto.Account;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static dto.AccountFactory.getAccount;

public class AccountsTest extends BaseTest {

    Account account = getAccount("Hot", "High", "Gold", "Yes", "Yes");

    @Test(testName = "Create a new account", description = "Create a new account with account, address, additionla " +
            "information")
    @Description("Create a new account in 'Salesforce' with valid data")
    public void checkCreateAccount() {
        loginStep.login();
        accountStep.create(account);
    }
}
