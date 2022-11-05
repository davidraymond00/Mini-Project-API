package starter.stepdefinitions.Projects.Authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Authentication.Register;

public class RegisterStep {

    @Steps
    Register register;

    @Given("I set url register")
    public void iSetUrlRegister() {
        register.setUrlRegister();
    }

    @When("I input null email null password null fullname")
    public void iInputNullEmailNullPasswordNullFullname() {
        register.requestRegWithNull();
    }

    @Then("I will get email is required")
    public void iWillGetEmailIsRequired() {
        register.emailIsRequired();
    }

    @When("I input valid email null password null fullname")
    public void iInputValidEmailNullPasswordNullFullname() {
        register.requestRegWithValidEmail();
    }

    @Then("I will get password is required")
    public void iWillGetPasswordIsRequired() {
        register.passwordIsRequired();
    }

    @When("I input null email valid password null password")
    public void iInputNullEmailValidPasswordNullPassword() {
        register.requestRegWithValidPass();
    }

    @When("I input null email null password valid fullname")
    public void iInputNullEmailNullPasswordValidFullname() {
        register.requestRegWithValidName();
    }

    @When("I input valid email valid password null fullname")
    public void iInputValidEmailValidPasswordNullFullname() {
        register.requestRegWithValidEmailPassword();
    }

    @Then("I will get fullname is required")
    public void iWillGetFullnameIsRequired() {
        register.fullnameIsRequired();
    }

    @When("I input valid email null password valid fullname")
    public void iInputValidEmailNullPasswordValidFullname() {
        register.requestRegWithValidEmailFullname();
    }

    @When("I input null email valid password valid fullname")
    public void iInputNullEmailValidPasswordValidFullname() {
        register.requestRegWithValidPasswordFullname();
    }

    @When("I input valid email valid password valid fullname")
    public void iInputValidEmailValidPasswordValidFullname() {
        register.requestRegWithValidEmailPasswordFullname();
    }

    @Then("I will get status code 400 Bad Request")
    public void iWillGetStatusCode400() {
        register.statusCode400();
    }
}
