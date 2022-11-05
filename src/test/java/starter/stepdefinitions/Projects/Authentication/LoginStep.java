package starter.stepdefinitions.Projects.Authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Authentication.Login;

public class LoginStep {

    @Steps
    Login login;

    @Given("I set url")
    public void iSetUrl() {
        login.setUrl();
    }

    @When("I request login")
    public void iRequestLogin() {
        login.requestLogin();
    }

    @Then("I will get 200")
    public void iWillGet200() {
        login.statusCode200();
    }

    @When("I request login With valid body")
    public void iRequestLoginWithInvalidBody() {
        login.requestLoginWithValidBody();
    }

    @Then("I will get status code 400")
    public void iWillGetStatusCode400() {
        login.ValidateErorMessage400();
    }

    @When("I request login with wrong password")
    public void iRequestLoginWithWrongPassword() {
        login.requestLoginWithWrongPassword();
    }
}
