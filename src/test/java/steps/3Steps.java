package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.3Page;

public class 3Steps {

    WebDriver driver;
    3Page page;

    public 3Steps() {
        this.driver = Hooks.getDriver();
        page = new 3Page(driver);
    }

    @Given("the user is on the initial page")
    public void userOnInitialPage() {
        page.navigateToInitialPage();
    }

    @When("the user performs Action 3")
    public void userPerformsAction3() {
        page.performAction3();
    }

    @Then("the user should see Expected 3")
    public void userShouldSeeExpected3() {
        Assert.assertTrue(page.verifyExpected3());
    }
}