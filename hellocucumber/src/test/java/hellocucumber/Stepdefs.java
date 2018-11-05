package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

class IsAlive {
    static String isAlive(String today) {
	if (today.equals("Princesse")) {
	    return "True";
	}
    return "False";
    }
}

public class Stepdefs {
    private String today;
    private String actualAnswer;

    @Given("^blanche neige is a \"([^\"]*)\"$")
    public void today_is(String today) {
        this.today = today;
    }

    @When("^I ask whether she is alive$")
    public void i_ask_whether_is_s_Friday_yet() {
        this.actualAnswer = IsAlive.isAlive(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
