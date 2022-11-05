package starter.stepdefinitions.Projects.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.ProductCategories.CreateACategory;

public class CreateACategoryStep {

    @Steps
    CreateACategory createACategory;
    @Given("I set url create a category")
    public void iSetUrlCreateACategory() {
        createACategory.setValidUrl();
    }

    @When("I request create a category with valid name and description")
    public void iRequestCreateACategoryWithValidNameAndDescription() {
        createACategory.requestCreateCategory();
    }

    @Then("I gett status code 200")
    public void iGettStatusCode200() {
        createACategory.statusCodeOk();
    }

    @When("I request create a category with null name")
    public void iRequestCreateACategoryWithNullName() {
        createACategory.requestNullName();
    }

    @Then("I gett status code 500")
    public void iGettStatusCode500() {
        createACategory.statusCode500();
    }

    @And("I gett error message")
    public void iGettErrorMessage() {
        createACategory.getErrorMessage();
    }

    @When("I request create a category with null name description")
    public void iRequestCreateACategoryWithNullNameDescription() {
        createACategory.requestNullNameAndDesc();
    }
}
