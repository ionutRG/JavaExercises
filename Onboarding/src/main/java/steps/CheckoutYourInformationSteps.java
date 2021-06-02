package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.CheckoutYourInformationPageObject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutYourInformationSteps {
	//todo the name of the page object should not include "steps" keyword since it doesn't contain step methods
	// "steps" keyword is used for step classes objects
	CheckoutYourInformationPageObject checkoutYourInfoSteps;


	//todo verifyUserDetailsBox returns boolean and checks if the detail box is displayed
	// when naming methods use very specific names
	// e.g verifyUserDetailsBox() should be isUserDetailsBoxDisplayed(), "is" keyword implies that the method returns boolean value
	// and verifyUserDetails() should be verifyUserDetailsBoxIsDisplayed(), "verify" keyword implies that an assert is executed
	@Step("Expected: User details element on Checkout Your Information is present")
	public void verifyUserDetails() {
		assertThat(checkoutYourInfoSteps.verifyUserDetailsBox(), is(true));
	}


	@Step("Expected: CONTINUE Button is present")
	public void verifyContinueBtn() { //todo same here, verifyContinueBtn doesn't express what is actual verified
		assertThat(checkoutYourInfoSteps.continueBtnExists(), is(true));
	}

//    @Step("Expected: CONTINUE Button text is: {0}")
//    public void verifyContinueBtnText(String expectedValue) {
//        assertThat(checkoutYourInfoSteps.continueBtnText(), is(expectedValue));
//    }

	// todo you can combine the next 2 methods into a single one => checkoutCart()
	@Step("Enter User checkout details: First name: {0}, Last name: {1}, Zip code: {2}")
	public void enterDetails(String fName, String lName, String zipCode) {
		checkoutYourInfoSteps.enterUserDetails(fName, lName, zipCode);
	}

	@Step("Go to CONTINUE")
	public void clickContinueButton() {
		checkoutYourInfoSteps.clickContinue();
	}
}
