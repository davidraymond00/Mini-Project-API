package starter.Projects.Authentication;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class Register {

    private String url;

    public void setUrlRegister() {
        url = "https://alta-shop.herokuapp.com/api/auth/register";
    }

    public JSONObject inputNullEmailPasswordFullname(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "");
        body.put("fullname", "");
        return body;
    }

    public JSONObject inputValidEmail(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "");
        body.put("fullname", "");
        return body;
    }

    public JSONObject inputValidPassword(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "123123");
        body.put("fullname", "");
        return body;
    }

    public JSONObject inputValidFullname(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "");
        body.put("fullname", "Firstname Lastname");
        return body;
    }

    public JSONObject inputValidEmailPass(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "123123");
        body.put("fullname", "");
        return body;
    }

    public JSONObject inputValidEmailFullname(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "");
        body.put("fullname", "Firstname Lastname");
        return body;
    }

    public JSONObject inputValidPassFullname(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "123123");
        body.put("fullname", "Firstname Lastname");
        return body;
    }

    public JSONObject inputValidEmailPassName(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "123123");
        body.put("fullname", "Firstname Lastname");
        return body;
    }

    public void requestRegWithNull(){
        given().header("Content-Type", "application/json");
        given().body(inputNullEmailPasswordFullname());
        when().post(url);
    }

    public void requestRegWithValidEmail(){
        given().header("Content-Type", "application/json");
        given().body(inputValidEmail());
        when().post(url);
    }

    public void requestRegWithValidPass(){
        given().header("Content-Type", "application/json");
        given().body(inputValidPassword());
        when().post(url);
    }

    public void requestRegWithValidName(){
        given().header("Content-Type", "application/json");
        given().body(inputValidFullname());
        when().post(url);
    }

    public void requestRegWithValidEmailPassword(){
        given().header("Content-Type", "application/json");
        given().body(inputValidEmailPass());
        when().post(url);
    }

    public void requestRegWithValidEmailFullname(){
        given().header("Content-Type", "application/json");
        given().body(inputValidEmailFullname());
        when().post(url);
    }

    public void requestRegWithValidPasswordFullname(){
        given().header("Content-Type", "application/json");
        given().body(inputValidPassFullname());
        when().post(url);
    }

    public void requestRegWithValidEmailPasswordFullname(){
        given().header("Content-Type", "application/json");
        given().body(inputValidEmailPassName());
        when().post(url);
    }

    public void emailIsRequired(){
        then().body("error", equalTo("email is required"));
    }

    public void passwordIsRequired(){
        then().body("error", equalTo("password is required"));
    }

    public void fullnameIsRequired() { then().body("error", equalTo("fullname is required"));}

    public void statusCode400() { then().statusCode(400);}
}
