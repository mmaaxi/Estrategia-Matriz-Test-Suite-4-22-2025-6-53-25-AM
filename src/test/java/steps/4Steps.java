package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.4Page;
import static org.junit.Assert.assertTrue;

public class 4Steps {

    4Page page = new 4Page();
    
    @Given("I have accessed the application")
    public void i_have_accessed_the_application() {
        page.navigateToApplication();
    }

    @When("I perform Action 4")
    public void i_perform_action_4() {
        page.performAction4();
    }
    
    @Then("I should see Expected 4")
    public void i_should_see_expected_4() {
        assertTrue(page.isExpected4Visible());
    }
}