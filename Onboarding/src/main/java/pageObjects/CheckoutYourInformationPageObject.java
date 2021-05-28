package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPageObject extends PageObjectBase {
    @FindBy(id = "first-name")
    WebElement firstNameField;

    @FindBy(id = "last-name")
    WebElement lastNameField;

    @FindBy(id = "postal-code")
    WebElement postalCodeField;

    @FindBy(xpath = "//div[@class='checkout_buttons']/input[@id='continue']")
    WebElement continueButton;

//    @FindBy(xpath = "//input[contains(@id, 'continue')]")
//    WebElement continueButton;

    @FindBy(xpath = "//div[contains(@class, 'checkout_info')]")
    WebElement getUserDetails;


    public void enterUserDetails(String fName, String lName, String zipCode) {
        firstNameField.sendKeys(fName);
        lastNameField.sendKeys(lName);
        postalCodeField.sendKeys(zipCode);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public boolean continueBtnExists() {
        continueButton.isDisplayed();
        return true;
    }

    public String continueBtnText() {
        continueButton.getAttribute("value");
        return null;
    }

    public boolean verifyUserDetailsBox() {
        return getUserDetails.isDisplayed();
    }


}
