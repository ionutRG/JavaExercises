package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.CheckoutCartPOBase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutCartBaseSteps extends StepsBase {
    CheckoutCartPOBase checkoutCartSteps;

    // moved to specific generic Cart Checkout class
    @Step("Expected: Your Cart header exists")
    public void isGenericCartHeaderDisplayed() {
        assertThat(checkoutCartSteps.isCartHeaderDisplayed(), is(true));
    }

    // moved to specific generic Cart Checkout class
    @Step("Expected: Header Label is: {0}")
    public void verifyYourCartHeaderText(String headerLabelText) {
        assertThat(checkoutCartSteps.getHeaderTextCart(), is(headerLabelText));
    }

    // moved to specific generic Cart Checkout class
    @Step("Expected: Quantity Label is: {0}")
    public void verifyYourCartQtyLabel(String qtyLabel) {
        assertThat(checkoutCartSteps.getQtyLabelText(), is(qtyLabel));
    }

    // moved to specific generic Cart Checkout class
    @Step("Expected: Description Label is: {0}")
    public void verifyYourCartDescrLabel(String descrLabel) {
        assertThat(checkoutCartSteps.getDescrLabelText(), is(descrLabel));
    }
}