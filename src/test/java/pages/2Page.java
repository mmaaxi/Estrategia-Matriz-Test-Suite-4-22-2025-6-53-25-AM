package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class 2Page {

    WebDriver driver;
    By action2Element = By.id("action2");
    By expected2Element = By.id("expected2");

    public 2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction2() {
        driver.findElement(action2Element).click();
    }

    public void verifyExpected2() {
        boolean isDisplayed = driver.findElement(expected2Element).isDisplayed();
        if (!isDisplayed) {
            throw new AssertionError("Expected 2 was not displayed as expected.");
        }
    }
}