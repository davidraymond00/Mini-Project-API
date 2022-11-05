package starter.Projects.Products;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class AssignAProductRating {

    private String url, urll;

    public void setValidUrl(){
        url = "https://alta-shop.herokuapp.com/api/products/16/ratings";
    }

    public void setInvalidUrl() { urll = "https://alta-shop.herokuapp.com/api/products/0/ratings";}

    public JSONObject productRating(){
        JSONObject body = new JSONObject();
        body.put("Ratings", 4);
        return body;
    }

    public void requestProductRating(){
        given().header("Content-Type", "application/json");
        given().body(productRating());
        when().post(url);
    }

    public void requestInvalidProductRating(){
        given().header("Content-Type", "application/json");
        given().body(productRating());
        when().post(urll);
    }

    public void statusCode401(){
        then().statusCode(401);
    }

//    public void statusCode500(){ then().statusCode(500);}

    public void getErrorMessage() { then().body("error", equalTo("unauthorized"));}
}
