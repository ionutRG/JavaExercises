package apis;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

public class ProductRequests {

    public Response getProductsRequests() {
        RestAssured.baseURI = "https://run.mocky.io/";

        RequestSpecification request = SerenityRest.given();
        return request.contentType(ContentType.JSON)
                .when()
                .get("/v3/3622b9d6-16e6-4685-a3a8-3c66484754b9");
    }
}
