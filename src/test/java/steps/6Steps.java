package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.6Page;
import static org.junit.Assert.assertTrue;

public class 6Steps {
    private WebDriver driver;
    private 6Page page;

    @Given("I perform Action 6")
    public void performAction6() {
        page = new 6Page(driver);
        page.doAction6();
    }

    @Then("I should see Expected 6")
    public void shouldSeeExpected6() {
        assertTrue("Expected 6 was not visible", page.isExpected6Visible());
    }
}