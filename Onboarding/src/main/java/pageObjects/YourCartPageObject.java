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

    public boolean isCartHeaderDisplayed() {
        try {
            getHeader.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for Cart Header: " + e);
        }
        return true;
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

    public boolean isRemoveElementFromCartDisplayed() {
        try {
            getItemRemoveButton.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for REMOVE button: " + e);
        }
        return true;
    }

    public boolean isCheckoutElementFromCartDisplayed() {
        try {
            getYourCartCheckoutButton.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for CHECKOUT element: " + e);
        }
        return true;
    }

    public String getCheckoutTextFromCart() {
        return getYourCartCheckoutButton.getText();
    }

    public void clickCheckoutButtonCart() {
        getYourCartCheckoutButton.click();
    }
}
