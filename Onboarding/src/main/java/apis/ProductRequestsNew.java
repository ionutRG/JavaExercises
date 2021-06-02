package apis;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

public class ProductRequestsNew {
    public Response getProductsRequestsNew() {
        RestAssured.baseURI = "https://run.mocky.io";

        RequestSpecification request = SerenityRest.given();
        return request.contentType(ContentType.JSON)
                .when()
                .get("/v3/112f5bc0-854c-4772-94db-ec5358693dc9");

//        return RestAssured.get("/v3/3622b9d6-16e6-4685-a3a8-3c66484754b9");
    }
}
