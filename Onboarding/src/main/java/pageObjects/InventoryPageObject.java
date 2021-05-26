package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPageObject extends PageObjectBase {

//    get Backpack AddToCart WebElement
    @FindBy(xpath = "//button[contains(@name, 'add-to-cart-sauce-labs-backpack')]")
    WebElement addToCartBackpackFromInventoryPage;

//    get Backpack name/description/price WebElement
    @FindBy(xpath = "//div[contains(@class, 'inventory_item_name')]")
    WebElement getBackpackNameFromInventoryPage;
    @FindBy(xpath = "//div[contains(@class, 'inventory_item_desc')]")
    WebElement getBackpackDescriptionFromInventoryPage;
    @FindBy(xpath = "//div[contains(@class, 'inventory_item_price')]")
    WebElement getBackpackPriceFromInventoryPage;

//    get cart button item number badge (when NOT empty)
    @FindBy(xpath = "//span[contains(@class, 'shopping_cart_badge')]")
    WebElement emptyCartButtonFromInventoryPage;

//    get Backpack remove button
    @FindBy(xpath = "//button[contains(@id, 'remove-sauce-labs-backpack')]")
    WebElement getBackpackRemoveButton;
//    get Cart button
    @FindBy(xpath = "//div[contains(@class, 'shopping_cart_container')]")
    WebElement getCartButton;

    public void addToCartBackpackFromInventoryClick() {
        addToCartBackpackFromInventoryPage.click();
    }

//    public String getBackpackNameFromInventory() {
//        return getBackpackNameFromInventoryPage.getText();
//    }
//
//    public String getBackpackDescriptionFromInventory() {
//        return getBackpackDescriptionFromInventoryPage.getText();
//    }
//
//    public String getBackpackPriceFromInventory() {
//        return getBackpackPriceFromInventoryPage.getText();
//    }

    public boolean emptyCartButtonDisplayed() {
        return emptyCartButtonFromInventoryPage.isDisplayed();
    }

    public String getCartItemsNumber() {
        return emptyCartButtonFromInventoryPage.getText();
    }

    public String getBackpackRemoveButtonText() {
       return getBackpackRemoveButton.getText();
    }

    public boolean getBackpackRemoveButtonDisplayed() {
        return getBackpackRemoveButton.isDisplayed();
    }

    public void clickCartButton() {
        getCartButton.click();
    }

// Convert item price from String/text to int
//    public int convertPriceFromTextToInt() {
//        int itemPriceInt;
//        itemPriceInt = Integer.valueOf(getBackpackFromInventory());
//        return itemPriceInt;
//    }
//
//    public List listItemPricesAsList() {
//        List itemPrices = new ArrayList();
//        itemPrices.get(convertPriceFromTextToInt());
//        System.out.println(itemPrices);
//        return itemPrices;
//    }
}
