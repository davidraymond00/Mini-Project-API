package starter.Projects.Orders;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetAllOrder {

    private String url, token;

    public void setUrlAndValidToken(){
        url = "https://alta-shop.herokuapp.com/api/orders";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }

    public void requestGetAllOrder(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json")
        .when().get(url);
    }

    public void status401(){
        then().statusCode(401);
    }

//    public void getList(){
//        then().body("data", equalTo("[]"));
//    }
}
