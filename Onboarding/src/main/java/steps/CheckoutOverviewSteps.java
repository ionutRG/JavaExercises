package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.CheckoutOverviewPO;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutOverviewSteps {
    //** renamed to checkoutOverviewPage
    //** renamed CheckoutOverviewPageObject (+ all) as CheckoutOverviewPO
    CheckoutOverviewPO checkoutOverviewPage;


    @Step("Expected: Payment information label text is: {0}")
    public void verifyPaymentInfoText(String expectedText) {
        assertThat(checkoutOverviewPage.getLabelInfoText(expectedText), is(expectedText));
    }

    @Step("Expected: Payment information value text is: {0}")
    public void verifyShippingInfoValue(String expectedText) {
        assertThat(checkoutOverviewPage.getLabelValueText(expectedText), is(expectedText));
    }

    @Step("Expected: Shipping information label text is: {0}")
    public void verifyShippingInfoText(String expectedText) {
        assertThat(checkoutOverviewPage.getLabelInfoText(expectedText), is(expectedText));
    }

    @Step("Expected: Shipping information value text is: {0}")
    public void verifyPaymentInfoValue(String expectedText) {
        assertThat(checkoutOverviewPage.getLabelValueText(expectedText), is(expectedText));
    }

    @Step("Click FINISH button")
    public void clickFinishButton() {
        checkoutOverviewPage.clickFinish();
    }
}
