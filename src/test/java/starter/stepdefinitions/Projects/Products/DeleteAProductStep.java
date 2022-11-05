package starter.stepdefinitions.Projects.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Products.DeleteAProduct;

public class DeleteAProductStep {

    @Steps
    DeleteAProduct deleteAProduct;
    @Given("I set valid url delete a product")
    public void iSetValidUrlDeleteAProduct() {
        deleteAProduct.setValidUrl();
    }

    @When("I request delete a product")
    public void iRequestDeleteAProduct() {
        deleteAProduct.requestDeleteProduct();
    }

    @Then("I get 200 okk")
    public void iGet200Okk() {
        deleteAProduct.verifyStatusCode200();
    }

    @And("I get see my product")
    public void iGetSeeMyProduct() {
        deleteAProduct.getBodyData();
    }

    @Given("I set invalid url delete a product")
    public void iSetInvalidUrlDeleteAProduct() {
        deleteAProduct.setInvalidUrl();
    }

    @When("I request invalid delete a product")
    public void iRequestInvalidDeleteAProduct() {
        deleteAProduct.requestInvalidDelete();
    }

    @Then("I get status code 500")
    public void iGetStatusCode500() {
        deleteAProduct.verifyStatusCode500();
    }

    @And("I get error message where condition")
    public void iGetErrorMessageWhereCondition() {
        deleteAProduct.getErrorBody();
    }
}
