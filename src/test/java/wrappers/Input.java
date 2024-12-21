package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    private final String INPUT_PATTERN = "//label[text()='%s']//ancestor::lightning-input//input";

    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(INPUT_PATTERN, label))).
                sendKeys(text);
    }
}
