package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.CheckoutOverviewPageObject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutOverviewSteps {
	//todo the name of the page object should not include "steps" keyword since it doesn't contain step methods
	// "steps" keyword is used for step classes objects
	// CheckoutOverviewPageObject should reference an page object => rename the object as checkoutOverviewPO
	CheckoutOverviewPageObject checkoutOverviewSteps;


	@Step("Expected: Payment information label text is: {0}")
	public void verifyPaymentInfoText(String expectedText) {
		assertThat(checkoutOverviewSteps.getLabelInfo(expectedText), is(expectedText));
	}

	@Step("Expected: Payment information value text is: {0}")
	public void verifyShippingInfoValue(String expectedText) {
		assertThat(checkoutOverviewSteps.getLabelValue(expectedText), is(expectedText));
	}

	@Step("Expected: Shipping information label text is: {0}")
	public void verifyShippingInfoText(String expectedText) {
		assertThat(checkoutOverviewSteps.getLabelInfo(expectedText), is(expectedText));
	}

	@Step("Expected: Shipping information value text is: {0}")
	public void verifyPaymentInfoValue(String expectedText) {
		assertThat(checkoutOverviewSteps.getLabelValue(expectedText), is(expectedText));
	}

	@Step("Click FINISH button")
	public void clickFinishButton() {
		checkoutOverviewSteps.clickFinish();
	}
}
