package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class 4Page {

    WebDriver driver;

    private By action4Button = By.id("action4Button");
    private By expected4Element = By.id("expected4Element");

    public 4Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToApplication() {
        driver.get("http://example.com");
    }

    public void performAction4() {
        WebElement actionButton = driver.findElement(action4Button);
        actionButton.click();
    }

    public boolean isExpected4Visible() {
        WebElement expectedElement = driver.findElement(expected4Element);
        return expectedElement.isDisplayed();
    }
}