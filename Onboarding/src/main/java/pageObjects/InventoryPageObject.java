package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryPageObject extends PageObjectBase {

//    get cart button item number badge (when NOT empty)
    @FindBy(xpath = "//span[contains(@class, 'shopping_cart_badge')]")
    WebElement shoppingCartBadge;

//    get Backpack remove button
    @FindBy(xpath = "//button[contains(@id, 'remove-sauce-labs-backpack')]")
    WebElement itemRemoveButton;
//    get Cart button
    @FindBy(xpath = "//div[contains(@class, 'shopping_cart_container')]")
    WebElement cartButton;

    @FindBy(xpath = "//div[@class='inventory_item']")
    List<WebElement> itemsList;



    By itemNameTextLocator = By.xpath("//div[contains(@class, 'inventory_item_name')]");
    By itemDescriptionTextLocator = By.xpath("//div[contains(@class, 'inventory_item_desc')]");
    By addToCartBtnLocator = By.xpath("//button[contains(@class, 'btn_inventory') and contains(@class, 'btn_primary')]");

    @FindBy(xpath = "//div[contains(@class, 'inventory_item_price')]")
    WebElement itemPriceText;

    public WebElement getItemWebElementByName(String itemName) {
        for (WebElement item : itemsList) {
            String currentItemName = item.findElement(itemNameTextLocator).getText();
            if (itemName.equals(currentItemName)) {
                return  item;
            }
        }
        return null;
    }

    public void addItemToCart(String itemName) {
        WebElement addToCartBtn = getItemWebElementByName(itemName).findElement(addToCartBtnLocator);
        addToCartBtn.click();
    }

    public String getBackpackNameFromInventory(String itemName) {
        return getItemWebElementByName(itemName).findElement(itemNameTextLocator).getText();
    }

    public String getBackpackDescriptionFromInventory(String itemName) {
        return getItemWebElementByName(itemName).findElement(itemDescriptionTextLocator).getText();
    }

    public String getBackpackPriceFromInventory() {
        return itemPriceText.getText();
    }

    public boolean isCartBadgeDisplayed() {
        try {
            return shoppingCartBadge.isDisplayed();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public String getCartItemsNumber() {
        return shoppingCartBadge.getText();
    }

    public String getBackpackRemoveButtonText() {
       return itemRemoveButton.getText();
    }

    public boolean getBackpackRemoveButtonDisplayed() {
        return itemRemoveButton.isDisplayed();
    }

    public void clickCartButton() {
        cartButton.click();
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
