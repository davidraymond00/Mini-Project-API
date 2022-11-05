package starter.Projects.Authentication;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class Login {

    private String url, body;

    public void setUrl(){
        url = "https://alta-shop.herokuapp.com/api/auth/login";
    }

    public JSONObject inputBody(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "123123");
        return body;
    }

    public JSONObject inputValidBody(){
        JSONObject body = new JSONObject();
        body.put("email", "siboro321@gmail.com");
        body.put("password", "123123");
        return body;
    }

    public JSONObject inputWrongPassword(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "000999");
        return body;
    }

    public void requestLogin(){
        given().body(inputBody());
        when().post(url);
    }

    public void requestLoginWithValidBody(){
        given().body(inputValidBody());
        given().header("Content-Type", "application/json");
        when().post(url);
    }

    public void requestLoginWithWrongPassword(){
        given().body(inputWrongPassword());
        given().header("Content-Type", "application/json");
        when().post(url);
    }

    public void statusCode200(){
        then().statusCode(200);
    }

    public void ValidateErorMessage400(){
        then().statusCode(400);
    }


}
