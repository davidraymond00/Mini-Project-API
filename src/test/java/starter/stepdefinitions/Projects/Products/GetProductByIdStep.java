package starter.stepdefinitions.Projects.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Products.GetProductById;

public class GetProductByIdStep {

    @Steps
    GetProductById getProductById;

    @Given("I set url product")
    public void iSetUrlProduct() {
        getProductById.setValidUrl();
    }

    @When("I request get product with valid id")
    public void iRequestGetProductWithValidId() {
        getProductById.requestBody();
    }

    @Then("I get status code 200 ok")
    public void iGetStatusCode200Ok() {
        getProductById.verifyStatusCode200();
    }

    @Given("I set url product invalid id")
    public void iSetUrlProductInvalidId() {
        getProductById.setInvalidUrl();
    }

    @When("I request get product with invalid id")
    public void iRequestGetProductWithInvalidId() {
        getProductById.requestInvalidBody();
    }

    @Then("I get status code 404")
    public void iGetStatusCode404() {
        getProductById.verifyStatusCode404();
    }

    @And("I get error message record not found")
    public void iGetErrorMessageRecordNotFound() {
        getProductById.getErrorMessage();
    }
}
