package steps;

import apis.ProductRequests;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class ProductApiSteps extends StepsBase {
    public Response response;
    ProductRequests productApi = new ProductRequests();

    @Step("Get all products and verify the response status code")
    public void getAllProducts() {
        response = productApi.getProductsRequests();
    }

    @Step("Get all products")
    public void verifyProductStatus(int expectedStatusCode) {
        assertThat(
                "Status code is NOT the expected one: " + expectedStatusCode,
                response.statusCode(),
                is(expectedStatusCode));
    }
}
