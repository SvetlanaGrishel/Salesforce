package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextArea {

    private final String TEXTAREA_PATTERN = "//label[text()='%s']//ancestor::lightning-textarea//textarea";

    WebDriver driver;
    String label;

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        log.info("Writing '{}' into '{}' textarea", text, label);
        driver.findElement(By.xpath(String.format(TEXTAREA_PATTERN, label))).sendKeys(text);
    }
}
