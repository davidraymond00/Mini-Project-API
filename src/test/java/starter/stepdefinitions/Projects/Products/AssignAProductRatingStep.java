package starter.stepdefinitions.Projects.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Products.AssignAProductRating;

public class AssignAProductRatingStep {

    @Steps
    AssignAProductRating assignAProductRating;

    @Given("I set valid url rating")
    public void iSetValidUrlRating() {
        assignAProductRating.setValidUrl();
    }

    @When("I request product rating")
    public void iRequestProductRating() {
        assignAProductRating.requestProductRating();
    }

    @Then("I get status codee 401")
    public void iGetStatusCodee401() {
        assignAProductRating.statusCode401();
    }

    @Given("I set invalid url rating")
    public void iSetInvalidUrlRating() {
        assignAProductRating.setInvalidUrl();
    }

    @When("I request invalid product rating")
    public void iRequestInvalidProductRating() {
        assignAProductRating.requestInvalidProductRating();
    }

//    @Then("I get code status 500")
//    public void iGetCodeStatus500() {
//        assignAProductRating.statusCode500();
//    }

    @And("I get error messagee record not found")
    public void iGetErrorMessageeRecordNotFound() {
        assignAProductRating.getErrorMessage();
    }


}
