package starter.Projects.Products;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetProductRating {

    private String url, urll;

    public void setValidUrl(){
        url = "https://alta-shop.herokuapp.com/api/products/17/ratings";
    }

    public void setInvalidUrl(){
        urll = "https://alta-shop.herokuapp.com/api/products/00/ratings";
    }

    public void requestProductRating(){
        given().header("Content-Type", "application/json")
                .when().get(url);
    }

    public void requestInvalidProductRating(){
        given().header("Content-Type", "application/json")
                .when().get(urll);
    }

    public void verifyStatuCode200(){
        then().statusCode(200);
    }

    public void getData(){
        then().body("data", equalTo(4));
    }

}
