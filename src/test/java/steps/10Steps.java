package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import static org.junit.Assert.assertTrue;
import pages.10Page;

public class 10Steps {
    private 10Page page;

    public 10Steps() {
        page = new 10Page();
    }

    @Given("I perform Action 10")
    public void iPerformAction10() {
        page.performAction10();
    }

    @Then("I should see Expected 10")
    public void iShouldSeeExpected10() {
        assertTrue(page.isExpected10Visible());
    }
}