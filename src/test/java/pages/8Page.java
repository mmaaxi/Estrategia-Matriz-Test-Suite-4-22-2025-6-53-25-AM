import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class 8Page {

    private WebDriver driver;

    @FindBy(id = "action8Button")
    private WebElement action8Button;

    @FindBy(id = "resultField")
    private WebElement resultField;

    public 8Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToHomepage() {
        driver.get("http://example.com");
    }

    public void performAction8() {
        action8Button.click();
    }

    public String getAction8Result() {
        return resultField.getText();
    }
}