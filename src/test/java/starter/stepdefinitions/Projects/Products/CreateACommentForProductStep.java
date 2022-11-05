package starter.stepdefinitions.Projects.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Products.CreateACommentForProduct;

public class CreateACommentForProductStep {

    @Steps
    CreateACommentForProduct createACommentForProduct;

    @Given("I set url comment")
    public void iSetUrlComment() {
        createACommentForProduct.setUrl();
    }

    @When("I request valid comment")
    public void iRequestValidComment() {
        createACommentForProduct.validCommenttt();
    }

    @Then("I stat code 401")
    public void iStatCode401() {
        createACommentForProduct.verifyStatCode401();
    }

    @When("I request invalid comment")
    public void iRequestInvalidComment() {
        createACommentForProduct.invalidCommenttt();
    }



}
