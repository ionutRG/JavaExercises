package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.CheckoutYourInformationPageObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutYourInformationSteps {
    CheckoutYourInformationPageObject checkoutYourInfoSteps;



    @Step("Expected: User details element on Checkout Your Information is present {0}")
    public void verifyUserDetails() {
        assertThat(checkoutYourInfoSteps.verifyUserDetailsBox(), is(true));
    }

    @Step("Enter User checkout details: First name: {0}, Last name: {1}, Zip code: {2}")
    public void enterDetails(String fName, String lName, String zipCode) {
        checkoutYourInfoSteps.enterUserDetails(fName, lName, zipCode);
    }

    @Step ("Go to CONTINUE")
    public void clickContinueButton() {
        checkoutYourInfoSteps.clickContinue();
    }
}
