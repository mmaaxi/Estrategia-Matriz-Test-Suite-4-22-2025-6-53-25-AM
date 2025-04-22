package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.9Page;

public class 9Steps {
    WebDriver driver;
    9Page testCase9Page;

    public 9Steps() {
        this.driver = Hooks.getDriver();
        testCase9Page = PageFactory.initElements(driver, 9Page.class);
    }

    @Given("I am on the test case 9 page")
    public void i_am_on_the_test_case_9_page() {
        testCase9Page.navigateTo9Page();
    }

    @When("I perform action 9")
    public void i_perform_action_9() {
        testCase9Page.performAction9();
    }

    @Then("I should see expected 9")
    public void i_should_see_expected_9() {
        assert testCase9Page.isExpected9Visible() : "Expected 9 is not visible";
    }
}