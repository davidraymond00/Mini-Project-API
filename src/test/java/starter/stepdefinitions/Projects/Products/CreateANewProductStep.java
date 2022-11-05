package starter.stepdefinitions.Projects.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Products.CreateANewProduct;

public class CreateANewProductStep {

    @Steps
    CreateANewProduct createANewProduct;

    @Given("I set url create new product")
    public void iSetUrlCreateNewProduct() {
        createANewProduct.setUrlValid();
    }

    @When("I input valid body")
    public void iInputNullBody() {
        createANewProduct.requestRegValidBody();
    }

    @Then("I get status code 200")
    public void iGetStatusCode200() {
        createANewProduct.verifyStatusCode200();
    }

    @When("I input invalid body")
    public void iInputInvalidBody() {
        createANewProduct.requestRegInvalidBody();
    }

    @Then("I get status codee 400")
    public void iGetStatusCodee400() {
        createANewProduct.verifyStatusCode400();
    }

    @And("Get error message invalid character")
    public void getErrorMessageInvalidCharacter() {
        createANewProduct.getErrorMessage();
    }
}
