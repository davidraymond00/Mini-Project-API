package starter.stepdefinitions.Projects.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Products.GetAllProducts;

public class GetAllProductsStep {

    @Steps
    GetAllProducts getAllProducts;
    @Given("I set url api get all products")
    public void iSetUrlApiGetAllProducts() {
        getAllProducts.setUrlApi();
    }

    @When("I request list products")
    public void iRequestListProducts() {
        getAllProducts.requestProducts();
    }

    @Then("I will get status code is 200")
    public void iWillGetStatusCodeIs200() {
        getAllProducts.verifyStatusCode200();
    }

}
