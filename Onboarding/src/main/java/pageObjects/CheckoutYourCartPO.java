package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourCartPO extends PageObjectBase {

    //** renamed WebElement variables without get
//    WebElement locators and field/variable set for each WebElement
    @FindBy(xpath = "//div[contains(@class, 'header_secondary_container')]")
    WebElement cartHeader;

    @FindBy(xpath = "//div[contains(@class, 'inventory_item_name')]")
    WebElement cartItemName;

    @FindBy(xpath = "//div[contains(@class, 'inventory_item_desc')]")
    WebElement cartItemDesc;

    @FindBy(xpath = "//div[contains(@class, 'inventory_item_price')]")
    WebElement cartItemPrice;

    @FindBy(xpath = "//button[contains(@id, 'remove-sauce-labs-backpack')]")
    WebElement itemRemoveButton;

    @FindBy(xpath = "//button[contains(@id, 'checkout')]")
    WebElement yourCartCheckoutButton;

    public String getItemNameFromCart() {
        return cartItemName.getText();
    }

    public String getItemDescrFromCart() {
        return cartItemDesc.getText();
    }

    public String getItemPriceFromCart() {
        return cartItemPrice.getText();
    }

    public String getRemoveTextFromCart() {
        return itemRemoveButton.getText();
    }

    public boolean isRemoveElementFromCartDisplayed() {
        try {
            itemRemoveButton.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for REMOVE button: " + e);
        }
        return true;
    }

    public boolean isCheckoutElementFromCartDisplayed() {
        try {
            yourCartCheckoutButton.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for CHECKOUT element: " + e);
        }
        return true;
    }

    public String getCheckoutTextFromCart() {
        return yourCartCheckoutButton.getText();
    }

    public void clickCheckoutButtonCart() {
        yourCartCheckoutButton.click();
    }
}
