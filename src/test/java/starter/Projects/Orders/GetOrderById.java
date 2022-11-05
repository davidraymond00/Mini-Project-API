package starter.Projects.Orders;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetOrderById {

    private String url;

    public void setUrl(){
        url = "https://alta-shop.herokuapp.com/api/orders/1";
    }

    public void requestOrderById(){
        given().when().get(url);
    }

    public void statusCodee401(){
        then().statusCode(401);}
}
