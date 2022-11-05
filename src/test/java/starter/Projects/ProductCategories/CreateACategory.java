package starter.Projects.ProductCategories;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class CreateACategory {

    private String url;

    public void setValidUrl(){
        url = "https://alta-shop.herokuapp.com/api/categories";
    }

    public JSONObject validNameCategories(){
        JSONObject body = new JSONObject();
        body.put("name", "gaming");
        body.put("description", "for gaming purposes");
        return body;
    }

    public JSONObject nullName(){
        JSONObject body = new JSONObject();
        body.put("name", null);
        body.put("description", "for gaming purposes");
        return body;
    }

    public JSONObject nullNameAndDesc(){
        JSONObject body = new JSONObject();
        body.put("name", null);
        body.put("description", null);
        return body;
    }

    public void requestCreateCategory(){
        given().header("Content-Type", "application/json");
        given().body(validNameCategories());
        when().post(url);
    }

    public void requestNullName(){
        given().header("Content-Type", "application/json");
        given().body(nullName());
        when().post(url);
    }

    public void requestNullNameAndDesc(){
        given().header("Content-Type", "application/json");
        given().body(nullNameAndDesc());
        when().post(url);
    }

    public void statusCodeOk(){
        then().statusCode(200);
    }

    public void statusCode500(){
        then().statusCode(500);
    }

    public void getErrorMessage(){
        then().body("error", equalTo("ERROR: new row for relation \"categories\" violates check constraint \"categories_name_check\" (SQLSTATE 23514)"));
    }
}
