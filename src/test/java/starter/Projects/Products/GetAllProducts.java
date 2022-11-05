package starter.Projects.Products;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetAllProducts {

    private String url;

    public void setUrlApi(){
        url = "https://alta-shop.herokuapp.com/api/products";
    }

    public void requestProducts(){
        given().header("Content-Type","application/json")
                .when().get(url);
    }

    public void verifyStatusCode200(){
        then().statusCode(200);
    }

}
