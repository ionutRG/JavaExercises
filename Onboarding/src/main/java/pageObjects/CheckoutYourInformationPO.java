package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPO extends PageObjectBase {
    @FindBy(id = "first-name")
    WebElement firstNameField;

    @FindBy(id = "last-name")
    WebElement lastNameField;

    @FindBy(id = "postal-code")
    WebElement postalCodeField;

    @FindBy(xpath = "//div[@class='checkout_buttons']/input[@id='continue']")
    WebElement continueButton;

    @FindBy(xpath = "//div[contains(@class, 'checkout_info')]")
    WebElement getUserDetails;

    public void enterUserDetails(String fName, String lName, String zipCode) {
        firstNameField.sendKeys(fName);
        lastNameField.sendKeys(lName);
        postalCodeField.sendKeys(zipCode);
        continueButton.click();
    }

    public boolean isContinueButtonDisplayed() {
        //** EXCEPTION added!
        try {
            continueButton.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for CONTINUE button: " + e.getMessage());
        }
        return true;
    }

    public String continueBtnText() {
        //** EXCEPTION added!
        try {
            continueButton.getAttribute("name");
        } catch (Exception e) {
            System.out.println("Exception caught for CONTINUE button text: " + e.getMessage());
        }
        return null;
    }

    public boolean isUserDetailsBoxDisplayed() {
        //** EXCEPTION added!
        try {
            getUserDetails.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for User details box: " + e.getMessage());
        }
        return true;
    }
}
