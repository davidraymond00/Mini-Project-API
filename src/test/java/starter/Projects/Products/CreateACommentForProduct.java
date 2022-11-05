package starter.Projects.Products;

import netscape.javascript.JSObject;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class CreateACommentForProduct {

    private String url;

    public void setUrl(){
        url = "https://alta-shop.herokuapp.com/api/products/108/comments";
    }

    public JSONObject validComment(){
        JSONObject body = new JSONObject();
        body.put("Comment", "the games are great including Gran Turismo 7 but sadly GT4 is much better");
        return body;
    }

    public JSONObject invalidComment(){
        JSONObject body = new JSONObject();
        body.put("Comment", null);
        return body;
    }

    public void validCommenttt(){
        given().header("Content-Type", "application/json");
        given().body(validComment());
        when().post(url);
    }

    public void invalidCommenttt(){
        given().header("Content-Type", "application/json");
        given().body(invalidComment());
        when().post(url);
    }

    public void verifyStatCode401(){
        then().statusCode(401);
    }



}
