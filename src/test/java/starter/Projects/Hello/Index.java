package starter.Projects.Hello;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Index {

    private String url;

    public void setValidUrl(){
        url = "https://alta-shop.herokuapp.com/api/hello";
    }

    public void setInvalidUrl() { url = "https://alta-shop.herokuapp.com/api/hellooo";}

    public void requestGetIndex(){
        given().when().get(url);
    }

    public void getMessage200(){
        then().statusCode(200);
    }

    public void getMessage400() { then().statusCode(404);}

}
