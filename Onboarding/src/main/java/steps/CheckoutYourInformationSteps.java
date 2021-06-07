package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.CheckoutYourInformationPO;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutYourInformationSteps {
    //** changed from checkoutYourInfoSteps to checkoutYourInfoPage
    CheckoutYourInformationPO checkoutYourInfoPage;

    //** modified method names based on info above
    @Step("Expected: User details element on Checkout Your Information is present")
    public void verifyUserDetailsBoxDisplayed() {
        assertThat(checkoutYourInfoPage.isUserDetailsBoxDisplayed(), is(true));
    }

    //** renamed verifyContinueBtn to isContinueButtonDisplayed
    @Step("Expected: CONTINUE Button is present")
    public void verifyContinueButtonDisplayed() {
        assertThat(checkoutYourInfoPage.isContinueButtonDisplayed(), is(true));
    }

    @Step("Expected: CONTINUE Button text is: {0}")
    public void verifyContinueBtnText(String expectedValue) {
        assertThat(checkoutYourInfoPage.continueBtnText(), is(expectedValue));
    }

    // combined in CheckYourInfoPO: added click into enterUserDetails method from PO
    @Step("Enter User checkout details: First name: {0}, Last name: {1}, Zip code: {2}")
    public void enterUserDetails(String fName, String lName, String zipCode) {
        checkoutYourInfoPage.enterUserDetails(fName, lName, zipCode);
    }
}
