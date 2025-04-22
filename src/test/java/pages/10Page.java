package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class 10Page {
    private WebDriver driver;
    private By action10Button = By.id("action10Button");
    private By expected10Element = By.id("expected10");

    public 10Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction10() {
        WebElement button = driver.findElement(action10Button);
        button.click();
    }

    public boolean isExpected10Visible() {
        WebElement expectedElement = driver.findElement(expected10Element);
        return expectedElement.isDisplayed();
    }
}