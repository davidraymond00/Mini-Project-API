package starter.stepdefinitions.Projects.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Products.GetProductRating;

public class GetProductRatingStep {

    @Steps
    GetProductRating getProductRating;

    @Given("I set url product rating with valid url")
    public void iSetUrlProductRatingWithValidUrl() {
        getProductRating.setValidUrl();
    }

    @When("I request get product rating with valid url")
    public void iRequestGetProductRatingWithValidUrl() {
        getProductRating.requestProductRating();
    }

    @Then("I get statu code 200")
    public void iGetStatuCode200() {
        getProductRating.verifyStatuCode200();
    }

    @And("I get data")
    public void iGetData() {
        getProductRating.getData();
    }

    @Given("I set url product rating with invalid url")
    public void iSetUrlProductRatingWithInvalidUrl() {
        getProductRating.setInvalidUrl();
    }

    @When("I request get product rating with invalid url")
    public void iRequestGetProductRatingWithInvalidUrl() {
        getProductRating.requestInvalidProductRating();
    }


}
