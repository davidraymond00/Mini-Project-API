package starter.stepdefinitions.Projects.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Products.GetProductComment;

public class GetProductCommentStep {

    @Steps
    GetProductComment getProductComment;

    @Given("I set url product comment")
    public void iSetUrlProductComment() {
        getProductComment.setUrlComment();
    }

    @When("I request product comment")
    public void iRequestProductComment() {
        getProductComment.requestComment();
    }

    @Then("I get stat code 404")
    public void iGetStatCode404() {
        getProductComment.statCode();
    }
}
