package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutYourInformationPageObject extends PageObjectBase {
    @FindBy(id = "first-name")
    WebElement firstNameField;

    @FindBy(id = "last-name")
    WebElement lastNameField;

    @FindBy(id = "postal-code")
    WebElement postalCodeField;

    @FindBy(xpath = "//input[contains(@id, 'continue')]")
    WebElement clickOnContinueButton;

    @FindBy(xpath = "//div[contains(@class, 'checkout_info')]")
    WebElement getUserDetails;



    public void enterUserDetails(String fName, String lName, String zipCode) {
        firstNameField.sendKeys(fName);
        lastNameField.sendKeys(lName);
        postalCodeField.sendKeys(zipCode);
    }

    public void clickContinue() {
        clickOnContinueButton.click();
    }

    public boolean verifyUserDetailsBox() {
        return getUserDetails.isDisplayed();
    }





}
