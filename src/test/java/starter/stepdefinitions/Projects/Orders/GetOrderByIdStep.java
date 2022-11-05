package starter.stepdefinitions.Projects.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Orders.GetOrderById;

public class GetOrderByIdStep {

    @Steps
    GetOrderById getOrderById;
    @Given("I set url order by id")
    public void iSetUrlOrderById() {
        getOrderById.setUrl();
    }

    @When("I request get order by id")
    public void iRequestGetOrderById() {
        getOrderById.requestOrderById();
    }

    @Then("I will status code 401")
    public void iWillStatusCode200() {
        getOrderById.statusCodee401();
    }
}
