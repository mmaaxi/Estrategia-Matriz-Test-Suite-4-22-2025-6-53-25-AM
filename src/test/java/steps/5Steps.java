package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.5Page;

public class 5Steps {
    private 5Page page;

    @Given("the user is on the required page")
    public void the_user_is_on_the_required_page() {
        page = new 5Page();
        page.navigateToRequiredPage();
    }

    @When("the user performs Action 5")
    public void the_user_performs_Action_5() {
        page.performAction5();
    }

    @Then("the user should see Expected 5")
    public void the_user_should_see_Expected_5() {
        Assert.assertTrue(page.isExpected5Visible());
    }
}