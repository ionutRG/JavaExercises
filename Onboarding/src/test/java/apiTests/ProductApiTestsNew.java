package apiTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import steps.ProductApiStepsNew;

@RunWith(SerenityRunner.class)
public class ProductApiTestsNew {

    private static Logger log = LoggerFactory.getLogger(ProductApiTests.class);

    @Steps
    ProductApiStepsNew productStepsNew;

    @Test
    @Title("Check if API returns 200 status code")
    public void productApiTestNew() {
        productStepsNew.getAllProducts();
        productStepsNew.verifyProductsStatusCode(200);
        String booksByName = productStepsNew.getBookByName("Sayings of the Century");
        log.info("Book json: " + booksByName);

    }

}
