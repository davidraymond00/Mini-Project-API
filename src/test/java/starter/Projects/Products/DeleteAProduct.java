package starter.Projects.Products;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class DeleteAProduct {

    private String url, urll;

    public void setValidUrl(){
        url = "https://alta-shop.herokuapp.com/api/products/15";
    }

    public void setInvalidUrl(){
        urll = "https://alta-shop.herokuapp.com/api/products/00";
    }

    public void requestDeleteProduct(){
        given().header("Content-Type", "application/json")
                .when().delete(url);
    }

    public void requestInvalidDelete(){
        given().header("Content-Type", "application/json")
                .when().delete(urll);
    }

    public void verifyStatusCode200(){
        then().statusCode(200);
    }

    public void verifyStatusCode500(){
        then().statusCode(500);
    }

    public void getBodyData(){
        then().body("data", equalTo(null));
    }

    public void getErrorBody(){
        then().body("error", equalTo("WHERE conditions required"));
    }
}
