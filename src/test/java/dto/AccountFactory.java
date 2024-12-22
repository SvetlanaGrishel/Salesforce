package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account getAccount(String rating, String customerPriority, String sla,
                                     String upsellOpportunity, String active) {
        Faker faker = new Faker();
        return new Account(faker.company().name(),
                faker.phoneNumber().cellPhone(),
                faker.phoneNumber().cellPhone(),
                rating,
                faker.idNumber().valid(),
                faker.number().digit(),
                faker.address().streetAddress(),
                faker.address().streetAddress(),
                faker.address().city(),
                faker.address().state(),
                faker.address().city(),
                faker.address().state(),
                faker.address().zipCode(),
                faker.address().country(),
                faker.address().zipCode(),
                faker.address().country(),
                customerPriority,
                sla,
                faker.number().digit(),
                upsellOpportunity,
                active);
    }
}
