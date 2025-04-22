package steps;

import pages.2Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class 2Steps {

    2Page page = new 2Page();

    @When("I perform Action 2")
    public void iPerformAction2() {
        page.performAction2();
    }

    @Then("I should see Expected 2")
    public void iShouldSeeExpected2() {
        page.verifyExpected2();
    }
}