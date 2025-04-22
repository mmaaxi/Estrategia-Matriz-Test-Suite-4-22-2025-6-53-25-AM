package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class 5Page {
    private WebDriver driver;

    public 5Page() {
        this.driver = WebDriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void navigateToRequiredPage() {
        driver.get("URL_OF_THE_REQUIRED_PAGE");
    }

    public void performAction5() {
        WebElement actionElement = driver.findElement(By.id("ACTION_5_ELEMENT_ID"));
        actionElement.click(); // or other action as required
    }

    public boolean isExpected5Visible() {
        WebElement expectedElement = driver.findElement(By.id("EXPECTED_5_ELEMENT_ID"));
        return expectedElement.isDisplayed();
    }
}