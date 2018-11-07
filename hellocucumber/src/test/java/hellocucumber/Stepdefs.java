package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;






class IsAlive {
    static String isAlive(String fruit) {
	if (fruit.equals("apple")) {
	    return "No";
	}
    return "Yes";
    }
 
   static String isWaked(String prince) {
	if (prince.equals("charmant")) {
	    return "Yes";
	}
    return "No";
    }
}

public class Stepdefs {
    private String fruit;
    private String actualAnswer;
    private String Prince;

    @Given("^blanche neige ate \"([^\"]*)\"$")
    public void fruit_is(String fruit) {
        this.fruit = fruit;
    }
	
    @Given("^blanche neige kissed by \"([^\"]*)\"$")
    public void blanche_neige_kissed_by(String arg1) {
    // Write code here that turns the phrase above into concrete actions
	this.Prince=arg1;
}


    @When("^I ask whether she is alive$")
    public void i_ask_whether_she_is_alive() {
        this.actualAnswer = IsAlive.isAlive(fruit);
    }

    @When("^I ask whether she is waked$")
    public void i_ask_whether_is_awake() {
        this.actualAnswer = IsAlive.isWaked(Prince);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    

}
