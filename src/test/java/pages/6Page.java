package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class 6Page {
    private WebDriver driver;
    private By action6Element = By.id("action6");
    private By expected6Element = By.id("expected6");

    public 6Page(WebDriver driver) {
        this.driver = driver;
    }

    public void doAction6() {
        WebElement element = driver.findElement(action6Element);
        element.click();
    }

    public boolean isExpected6Visible() {
        WebElement element = driver.findElement(expected6Element);
        return element.isDisplayed();
    }
}