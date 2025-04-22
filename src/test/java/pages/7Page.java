package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class 7Page {

    WebDriver driver;
    By action7Locator = By.id("action7");
    By resultLocator = By.id("result");

    public 7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction7() {
        driver.findElement(action7Locator).click();
    }

    public String getAction7Result() {
        return driver.findElement(resultLocator).getText();
    }
}