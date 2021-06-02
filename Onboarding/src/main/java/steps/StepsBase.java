package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectBase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StepsBase {
	PageObjectBase pageBaseSteps;
	WebDriver driver;

	@Step("Navigate to the url {0}")
	public void navigateToUrl(String url) {
		pageBaseSteps.getDriverToUrl(url);
	}

	// todo this is a method specific for the cart/checkout steps, you should move it to the specific step class
	@Step("Expected: Your Cart header exists")
	public void verifyHeaderGenericCart() {
		assertThat(pageBaseSteps.verifyHeaderCart(), is(true));
	}

	// todo this is a method specific for the cart/checkout steps, you should move it to the specific step class
	@Step("Expected: Header Label is: {0}")
	public void verifyYourCartHeaderText(String headerLabelText) {
		assertThat(pageBaseSteps.getHeaderTextCart(), is(headerLabelText));
	}

	// todo this is a method specific for the cart/checkout steps, you should move it to the specific step class
	@Step("Expected: Quantity Label is: {0}")
	public void verifyYourCartQtyLabel(String qtyLabel) {
		assertThat(pageBaseSteps.getQtyLabel(), is(qtyLabel));
	}

	// todo this is a method specific for the cart/checkout steps, you should move it to the specific step class
	@Step("Expected: Description Label is: {0}")
	public void verifyYourCartDescrLabel(String descrLabel) {
		assertThat(pageBaseSteps.getDescrLabel(), is(descrLabel));
	}

}
