package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.7Page;
import static org.junit.Assert.assertEquals;

public class 7Steps {

    WebDriver driver;
    7Page page;

    @Given("the user navigates to the application")
    public void the_user_navigates_to_the_application() {
        driver = new ChromeDriver();
        driver.get("http://www.example.com");
        page = new 7Page(driver);
    }

    @When("the user performs Action 7")
    public void the_user_performs_Action_7() {
        page.performAction7();
    }

    @Then("the result should be Expected 7")
    public void the_result_should_be_Expected_7() {
        String result = page.getAction7Result();
        assertEquals("Expected 7", result);
        driver.quit();
    }
}