package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.CheckoutCompletePO;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutCartCompleteSteps extends StepsBase {
    CheckoutCompletePO cartCompletePage;

    @Step("Expected: Thanks text is: {0}")
    public void verifyThanksText(String expectedText) {
        assertThat(cartCompletePage.getCompleteThanksText(), is(expectedText));
    }

    @Step("Expected: Dispatch text is: {0}")
    public void verifyDispatchGenericCartText(String expectedText) {
        assertThat(cartCompletePage.getCompleteDispatchText(), is(expectedText));
    }

    @Step("Expected: Pony Express image is displayed")
    public void verifyCompleteImageDisplayed() {
        assertThat(cartCompletePage.isCompleteImageDisplayed(), is(true));
    }

    @Step("Expected: Back Home button is displayed")
    public void isBackHomeBtnDisplayed() {
        assertThat(cartCompletePage.isBackHomeBtnDisplayed(), is(true));
    }

    @Step("Expected: Back Home button text is: {0}")
    public void verifyBackHomeBtnText(String expectedText) {
        assertThat(cartCompletePage.verifyBackHomeBtnText(), is(expectedText));
    }

    @Step("Back Home button clicked")
    public void clickBackHome() {
        cartCompletePage.clickBackHomeBtn();
    }
}
