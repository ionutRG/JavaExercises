package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPageObject extends PageObjectBase {

	//todo remane all webelements by removing "get" keyword. objects are always nouns and methods are verbs, get is used for methods names
//    WebElement locators and field/variable set for each WebElement
	@FindBy(xpath = "//div[contains(@class, 'header_secondary_container')]")
	WebElement getHeader;

	@FindBy(xpath = "//div[contains(@class, 'inventory_item_name')]")
	WebElement getItemName;

	@FindBy(xpath = "//div[contains(@class, 'inventory_item_desc')]")
	WebElement getItemDesc;

	@FindBy(xpath = "//div[contains(@class, 'inventory_item_price')]")
	WebElement getItemPrice;

	@FindBy(xpath = "//button[contains(@id, 'remove-sauce-labs-backpack')]")
	WebElement getItemRemoveButton;

	@FindBy(xpath = "//button[contains(@id, 'checkout')]")
	WebElement getYourCartCheckoutButton;

	//    WebElement info retrieval methods for element presence
	public String getHeaderTextCart() {
		return getHeader.getText();
	}

	public boolean verifyHeaderCart() {
		return getHeader.isDisplayed();
	}

	public String getItemNameFromCart() {
		return getItemName.getText();
	}

	public String getItemDescrFromCart() {
		return getItemDesc.getText();
	}

	public String getItemPriceFromCart() {
		return getItemPrice.getText();
	}

	public String getRemoveTextFromCart() {
		return getItemRemoveButton.getText();
	}

	public boolean getRemoveElementFromCart() {
		return getItemRemoveButton.isDisplayed();
	}

	public boolean getCheckoutElementFromCart() {
		return getYourCartCheckoutButton.isDisplayed();
	}

	public String getCheckoutTextFromCart() {
		return getYourCartCheckoutButton.getText();
	}

	public void clickCheckoutButtonCart() {
		getYourCartCheckoutButton.click();
	}
}
