package starter.Projects.Products;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class CreateANewProduct {
    private String url;

    public void setUrlValid(){
        url = "https://alta-shop.herokuapp.com/api/products";
    }

    public JSONObject inputValidBody(){
        JSONObject body = new JSONObject();
        body.put("name", "Sony PS5");
        body.put("description", "play has no limits");
        body.put("price", 299);
        body.put("Ratings", 4);
        return body;
    }

    public JSONObject inputInvalidBody(){
        JSONObject body = new JSONObject();
        body.put("name", "");
        body.put("description", "");
        return body;
    }

    public void verifyStatusCode200(){
        then().statusCode(200);
    }

    public void verifyStatusCode400(){
        then().statusCode(500);
    }

    public void requestRegValidBody(){
        given().header("Content-Type", "application/json");
        given().body(inputValidBody());
        when().post(url);
    }

    public void requestRegInvalidBody(){
        given().header("Content-Type", "application/json");
        given().body(inputInvalidBody());
        when().post(url);
    }

    public void getErrorMessage(){
        then().body("error", equalTo("ERROR: new row for relation \"products\" violates check constraint \"products_name_check\" (SQLSTATE 23514)"));
    }


}
