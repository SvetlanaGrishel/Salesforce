package tests;

import com.github.javafaker.Faker;
import dto.Account;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import tests.base.BaseTest;

@Log4j2
public class AccountsTest extends BaseTest {

    Faker faker = new Faker();

    Account account_full = Account.builder()
            .accountName(faker.company().name())
            .phone(faker.phoneNumber().cellPhone())
            .fax(faker.phoneNumber().cellPhone())
            .rating("Hot")
            .accountNumber(faker.idNumber().valid())
            .employees(faker.number().digit())
            .billingStreet(faker.address().streetAddress())
            .shippingStreet(faker.address().streetAddress())
            .billingCity(faker.address().city())
            .billingState(faker.address().state())
            .shippingCity(faker.address().city())
            .shippingState(faker.address().state())
            .billingZipCode(faker.address().zipCode())
            .billingCountry(faker.address().country())
            .shippingZipCode(faker.address().zipCode())
            .shippingCountry(faker.address().country())
            .customerPriority("High")
            .sla("Gold")
            .slaSerialNumber(faker.number().digit())
            .upsellOpportunity("Yes")
            .active("Yes")
            .build();

    Account accountWithAccountNameOnly = Account.builder()
            .accountName(faker.company().name())
            .build();

    @Test(testName = "Create a new account with full information", description = "Create a new account with account, " +
            "address, additional information")
    @Description("Create a new account in 'Salesforce' with valid data")
    public void checkCreateAccount() {
        log.info("Create a new account in 'Salesforce' system");
        loginStep.login();
        accountStep.create(account_full);
    }

    @Test(testName = "Create a new account with Account Name only", description = "Create a new account with Account Name only")
    @Description("Create a new account with Account Name only with valid data")
    public void checkCreateAccountWithAccountNameOnly() {
        log.info("Create a new account in 'Salesforce' system with Account Name only");
        loginStep.login();
        accountStep.create(accountWithAccountNameOnly);
    }
}
