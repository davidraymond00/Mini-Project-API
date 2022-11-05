package starter.Projects.Orders;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class CreateNewOrder {

    private String url, token;

    public void setUrlAndValidToken(){
        url = "https://alta-shop.herokuapp.com/api/orders";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.qWDOcd2UDoTGumbak_fRlZZtf-H7va3sH2a339KGiKU";
    }

    public JSONObject bodyCreateOrder(){
        JSONObject body = new JSONObject();
        body.put("Email", "someone@mail.com");
        return body;
    }

    public void requestValidEmail(){
        given().header("Authorization ", " Bearer " + token)
                .header("Content-Type", "application/json")
                .body(bodyCreateOrder().toJSONString());
        when().post(url);
    }

    public void statusCode400OK(){
        then().statusCode(400);
    }

    public void verifyDetailResponse(){
        then().body("Email", equalTo("someone@mail.com"));
    }


}
