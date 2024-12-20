package tests;

import org.testng.annotations.Test;
import pages.AccountsList;
import pages.LoginPage;
import tests.base.BaseTest;

public class AccountsTest extends BaseTest {

    @Test
    public void checkCreateAccount() {
        LoginPage.open();
        LoginPage.login("tborodich@tms.sandbox", "Password001");
        AccountsList.openNewAccountModal();
        newAccountModal.fillAccountInformation("Sv", "Hot", "733", "77334",
                "0003323", "https://www.A1.com/", "https://www.speedtest.net/111",
                "*", "Prospect", "Private", "Banking", "2",
                "1000", "23444");
        newAccountModal.fillAddressInformation("11cRed street 99-1", "22Green street 32/2",
                "Dallas", "NY", "Austin", "NY", "44322",
                "USA", "23444", "USA");
        newAccountModal.fillDescription("Here test information");
        newAccountModal.fillAdditionalInformation("Low", "Gold", "12.12.2026",
                "3337822", "5", "No", "No");
        AccountsList.clickSaveButton();
    }
}
