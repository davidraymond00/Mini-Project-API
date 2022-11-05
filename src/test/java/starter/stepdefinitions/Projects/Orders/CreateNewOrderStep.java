package starter.stepdefinitions.Projects.Orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Orders.CreateNewOrder;

public class CreateNewOrderStep {

    @Steps
    CreateNewOrder createNewOrder;
    @Given("I set url order and valid token to create order")
    public void iSetUrlOrderAndValidTokenToCreateOrder() {
        createNewOrder.setUrlAndValidToken();
    }

    @When("I request with valid email")
    public void iRequestWithValidEmail() {
        createNewOrder.requestValidEmail();
    }

    @Then("I will get 400 ok")
    public void iWillGet400Ok() {
        createNewOrder.statusCode400OK();
    }

    @And("I can verify the detail response")
    public void iCanVerifyTheDetailResponse() {
        createNewOrder.verifyDetailResponse();
    }
}
