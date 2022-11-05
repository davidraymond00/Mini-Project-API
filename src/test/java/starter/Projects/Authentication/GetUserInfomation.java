package starter.Projects.Authentication;

import static net.serenitybdd.rest.SerenityRest.*;

public class GetUserInfomation {

    private String url;

    public void setValidUrl(){
        url = "https://alta-shop.herokuapp.com/api/auth/info";
    }

    public void requestGetUserInformation(){
        given().when().get(url);
    }

    public void statusCodeMessage401(){
        then().statusCode(401);
    }


}
