package starter.stepdefinitions.Projects.Authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Authentication.GetUserInfomation;

public class GetUserInformationStep {

    @Steps
    GetUserInfomation getUserInfomation;
    @Given("I set valid url")
    public void iSetValidUrl() {
        getUserInfomation.setValidUrl();
    }

    @When("I request get user information")
    public void iRequestGetUserInformation() {
        getUserInfomation.requestGetUserInformation();
    }

    @Then("I will get message 401")
    public void iWillGetMessage401() {
        getUserInfomation.statusCodeMessage401();
    }

}
