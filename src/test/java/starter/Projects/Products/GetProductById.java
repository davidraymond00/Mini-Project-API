package starter.Projects.Products;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetProductById {

    private String url, urll;

    public void setValidUrl(){
        url = "https://alta-shop.herokuapp.com/api/products/25";
    }

    public void setInvalidUrl(){
        urll = "https://alta-shop.herokuapp.com/api/products/0";
    }

    public void requestBody(){
        given().header("Content-Type", "application/json")
                .when().get(url);
    }

    public void requestInvalidBody(){
        given().header("Content-Type", "application/json")
                .when().get(urll);
    }

    public void verifyStatusCode200(){
        then().statusCode(200);
    }

    public void verifyStatusCode404(){
        then().statusCode(404);
    }

    public void getErrorMessage(){
        then().body("error", equalTo("record not found"));
    }
}
