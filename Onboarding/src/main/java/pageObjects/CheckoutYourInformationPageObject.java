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
		//todo if continueButton is not displayed on the page. this code will return an exception;
		// you need to handle the exception (we already talked about how to do this on both onboarding and java course)
		continueButton.isDisplayed();
		return true;
	}

	public String continueBtnText() {
		continueButton.getAttribute("value");
		return null; //todo; this method will always return null. You need to return the continueButton.getAttribute("value") value. How you do this?
	}

	public boolean verifyUserDetailsBox() {
		return getUserDetails.isDisplayed(); //todo: smae here; code will throw error if element not found; need to handle exception
	}


}
