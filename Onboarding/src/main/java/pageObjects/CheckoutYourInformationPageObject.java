package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPageObject extends PageObjectBase {
    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(xpath = "//input[contains(@class, 'submit-button btn btn_primary cart_button btn_action')]")
    WebElement clickOnContinueButtonOnCheckoutYourInfoPage;

//    WebElementFacade firstNameF;
//    WebElementFacade lastNameF;
//    WebElementFacade zipCodeF;
//    WebElementFacade continueButton;
//
////    RELEVANT?
////    public FindAJobPage(WebDriver driver) {
////        super(driver);
////    }
//
//    public void addFirstName(String values) {
//        typeInto(firstNameF, values);
//        }
//
//    public void addLastName(String values) {
//        typeInto(lastNameF, values);
//    }
//
//    public void addZipCode(String values) {
//        typeInto(zipCodeF, values);
//    }
//
//    public void pressContinue(String values) {
//        continueButton.click();
//    }

    public void enterCheckoutYourInformationDetails(String fName, String lname, int pCode) {
        firstName.sendKeys("John");
        lastName.sendKeys("Smith");
        postalCode.sendKeys("12345");
    }

    public void setClickOnContinueButtonOnCheckoutYourInfoPag() {
        clickOnContinueButtonOnCheckoutYourInfoPage.click();
    }

}
