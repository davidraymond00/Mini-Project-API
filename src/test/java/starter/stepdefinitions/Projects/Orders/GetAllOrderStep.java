package starter.stepdefinitions.Projects.Orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Orders.GetAllOrder;

public class GetAllOrderStep {

    @Steps
    GetAllOrder getAllOrder;
    @Given("I set url get all order")
    public void iSetUrlGetAllOrder() {
        getAllOrder.setUrlAndValidToken();
    }

    @When("I request get all order")
    public void iRequestGetAllOrder() {
        getAllOrder.requestGetAllOrder();
    }

    @Then("I will get status 401")
    public void iWillGetStatus401() {
        getAllOrder.status401();
    }

//    @And("Get list my order")
//    public void getListMyOrder() {
//        getAllOrder.getList();
//    }
}
