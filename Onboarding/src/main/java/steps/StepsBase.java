package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.PageObjectBase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class StepsBase {
    PageObjectBase pageBaseSteps;
    WebDriver driver;

    protected static Logger log = LoggerFactory.getLogger(StepsBase.class);


    @Step("Navigate to the url {0}")
    public void navigateToUrl(String url) {
        pageBaseSteps.getDriverToUrl(url);
    }

    @Step("Expected: Your Cart header exists")
    public void verifyHeaderGenericCart() {
        assertThat(pageBaseSteps.verifyHeaderCart(), is(true));
    }

    @Step("Expected: Header Label is: {0}")
    public void verifyYourCartHeaderText(String headerLabelText) {
        assertThat(pageBaseSteps.getHeaderTextCart(), is(headerLabelText));
    }

    @Step("Expected: Quantity Label is: {0}")
    public void verifyYourCartQtyLabel(String qtyLabel) {
        assertThat(pageBaseSteps.getQtyLabel(), is(qtyLabel));
    }

    @Step("Expected: Description Label is: {0}")
    public void verifyYourCartDescrLabel(String descrLabel) {
        assertThat(pageBaseSteps.getDescrLabel(), is(descrLabel));
    }

}
