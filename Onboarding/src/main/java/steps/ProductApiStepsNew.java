package steps;

import apis.ProductRequestsNew;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProductApiStepsNew extends StepsBase {
    Response response;
    ProductRequestsNew productApiNew = new ProductRequestsNew();

    @Step("Get all products")
    public void getAllProducts() {
        response = productApiNew.getProductsRequestsNew();
    }

    @Step("Get all Products and verify response status code")
    public void verifyProductsStatusCode(int expectedStatusCode) {
        assertThat("Status code is NOT the expected one: " + expectedStatusCode,
                response.statusCode(),
                is(expectedStatusCode));
    }

    @Step("Get a specific book from store by name: {0}")
    public String getBookByName(String bookNameToSearch) {

        log.info("\n===================\n");
        log.info("\nBody with getBody\n" + response.getBody().asString());
        log.info("\n===================\n");

        response.getBody().prettyPrint();
        return response.jsonPath().get("store.book.find { it.title == '" + bookNameToSearch + "'}").toString();
    }
}
