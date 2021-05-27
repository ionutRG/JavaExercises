package apiTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.ProductApiSteps;

@RunWith(SerenityRunner.class)
public class ProductApiTests {

    @Steps
    ProductApiSteps productSteps;

    @Test
    @Title("Check that API returns 200 status code")
    public void productApiTest() {
        productSteps.verifyProductStatus(200);
    }

    @Test
    public void getAllProducts() {
        productSteps.getAllProducts();
    }
}
