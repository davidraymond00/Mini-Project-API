package starter.Projects.Products;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetProductComment {

    private String url;

    public void setUrlComment(){
        url = "https://alta-shop.herokuapp.com/api/products/109/Comment";
    }

    public void requestComment(){
        given().header("Content-Type", "text/plain; charset=utf-8")
                .when().get(url);
    }

    public void statCode(){
        then().statusCode(404);
    }
}
