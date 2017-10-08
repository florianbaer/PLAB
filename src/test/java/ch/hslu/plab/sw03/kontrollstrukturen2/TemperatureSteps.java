package ch.hslu.plab.sw03.kontrollstrukturen2;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

@CucumberOptions(features = "src/test/resources/")
public class TemperatureSteps{


        private ConfigurableGaseousElement getNElement(){
            return new ConfigurableGaseousElement("N", "Stickstoff", 234.32,630.2);
        }

        private ConfigurableGaseousElement getHgElement(){
            return new ConfigurableGaseousElement("Hg", "Quecksilber", 234.32,630.2);
        }

        private ConfigurableGaseousElement getPbElement(){
            return new ConfigurableGaseousElement("Pb", "Blei", 63.05,77.15);
        }

    private ConfigurableGaseousElement element;
    private Temperature temperature;

    @Given("^A temperature of \"([^\"]*)\" Kelvin$")
    public void a_temperature_of_Kelvin(float temperature) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.temperature = new Temperature(temperature);
    }

    @When("^a check the gaseous state of pb$")
    public void a_check_the_gaseous_state_of_pb() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.element = getPbElement();
    }

    @Then("^then the gaseous state should be \"([^\"]*)\"$")
    public void then_the_gaseous_state_should_be(String state) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(state, this.temperature.getGaseousState(this.element).name());
    }


}
