package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {

    private final String TEXTAREA_PATTERN = "//label[text()='%s']//ancestor::lightning-textarea//textarea";

    WebDriver driver;
    String label;

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(TEXTAREA_PATTERN, label))).sendKeys(text);
    }
}
