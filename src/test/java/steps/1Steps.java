package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.1Page;

public class 1Steps {

    1Page page = new 1Page();

    @Given("I perform Action 1")
    public void iPerformAction1() {
        page.performAction1();
    }

    @Then("I should see Expected 1")
    public void iShouldSeeExpected1() {
        Assert.assertTrue("Expected 1 is not visible", page.isExpected1Visible());
    }
}