package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPageObject {
    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(xpath = "//input[contains(@class, 'submit-button btn btn_primary cart_button btn_action')]")
    WebElement clickOnContinueButtonOnCheckoutYourInfoPage;

    public void enterCheckoutYourInformationDetails(String fName, String lname, int pCode) {
        firstName.sendKeys("John");
        lastName.sendKeys("Smith");
        postalCode.sendKeys("12345");
    }

    public void setClickOnContinueButtonOnCheckoutYourInfoPag() {
        clickOnContinueButtonOnCheckoutYourInfoPage.click();
    }

}
