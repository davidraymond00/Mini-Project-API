package starter.stepdefinitions.Projects.Hello;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Hello.Index;

public class IndexStep {

    @Steps
    Index index;

    @Given("I set url hello")
    public void iSetUrlHello() {
        index.setValidUrl();
    }

    @When("I request get index hello")
    public void iRequestGetIndexHello() {
        index.requestGetIndex();
    }

    @Then("I will get message 200")
    public void iWillGetMessage200() {
        index.getMessage200();
    }

    @Given("I set invalid hello")
    public void iSetInvalidHello() {
        index.setInvalidUrl();
    }

    @Then("I will get message 404")
    public void iWillGetMessage404() {
        index.getMessage400();
    }
}
