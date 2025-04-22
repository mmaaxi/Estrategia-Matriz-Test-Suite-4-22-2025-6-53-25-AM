import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class 8Steps {

    private WebDriver driver;
    private 8Page page;

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        page = new 8Page(driver);
        page.navigateToHomepage();
    }

    @When("the user performs Action 8")
    public void the_user_performs_action_8() {
        page.performAction8();
    }

    @Then("the user verifies the result as Expected 8")
    public void the_user_verifies_the_result_as_expected_8() {
        assertEquals("Expected 8", page.getAction8Result());
    }
}