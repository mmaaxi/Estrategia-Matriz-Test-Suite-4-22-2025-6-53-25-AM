package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class 1Page {

    private WebDriver driver;
    private By action1Element = By.id("action1");
    private By expected1Element = By.id("expected1");

    public 1Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void performAction1() {
        WebElement element = driver.findElement(action1Element);
        element.click();
    }

    public boolean isExpected1Visible() {
        return driver.findElement(expected1Element).isDisplayed();
    }
}