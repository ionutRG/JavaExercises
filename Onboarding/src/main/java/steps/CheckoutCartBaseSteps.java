package steps;

import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutCartBaseSteps extends StepsBase {

    // todo this is a method specific for the cart/checkout steps, you should move it to the specific step class
    @Step("Expected: Your Cart header exists")
    public void verifyHeaderGenericCart() {
        assertThat(checkoutCartSteps.isCartHeaderDisplayed(), is(true));
    }

    // todo this is a method specific for the cart/checkout steps, you should move it to the specific step class
    @Step("Expected: Header Label is: {0}")
    public void verifyYourCartHeaderText(String headerLabelText) {
        assertThat(checkoutCartSteps.getHeaderTextCart(), is(headerLabelText));
    }

    // todo this is a method specific for the cart/checkout steps, you should move it to the specific step class
    @Step("Expected: Quantity Label is: {0}")
    public void verifyYourCartQtyLabel(String qtyLabel) {
        assertThat(checkoutCartSteps.getQtyLabel(), is(qtyLabel));
    }

    // todo this is a method specific for the cart/checkout steps, you should move it to the specific step class
    @Step("Expected: Description Label is: {0}")
    public void verifyYourCartDescrLabel(String descrLabel) {
        assertThat(checkoutCartSteps.getDescrLabel(), is(descrLabel));
    }
}