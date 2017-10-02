package ch.hslu.plab.sw01;

import ch.hslu.plab.sw01.*;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


@CucumberOptions(features = "src/test/resources/")

public class BackofenSteps {
    Backofen backofen = null;

    @Given("^a instance of backofen$")
    public void a_instance_of_backofen() throws Throwable {
        backofen = null;
    }

    @When("^i instanciate it$")
    public void i_instanciate_it() throws Throwable {
        backofen = new Backofen("Backofen 2000", new Heizelement[]{new Heizelement(new HeizelementTyp("Röhre"))}, new Uhr(), new Tuere());
    }

    @Then("^the instance is not null$")
    public void the_instance_is_not_null() throws Throwable {
        Assert.assertNotNull(backofen);
    }
}
