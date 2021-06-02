package pageObjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryPageObject extends PageObjectBase {

	//    get cart button item number badge (when NOT empty)
	@FindBy(xpath = "//span[contains(@class, 'shopping_cart_badge')]")
	WebElementFacade shoppingCartBadge;

	//    get Backpack remove button
	@FindBy(xpath = "//button[contains(@id, 'remove-sauce-labs-backpack')]")
	WebElement itemRemoveButton;
	//    get Cart button
	@FindBy(xpath = "//div[contains(@class, 'shopping_cart_container')]")
	WebElement cartButton;

	@FindBy(xpath = "//div[@class='inventory_item']")
	List<WebElement> itemsList;

	By itemNameTextLocator = By.xpath("//div[contains(@class, 'inventory_item_name')]");
	By itemDescriptionTextLocator = By.xpath("//div[contains(@class, 'inventory_item_desc') and not (contains(@class, 'inventory_item_description'))]");
	By addToCartBtnLocator = By.xpath("//button[contains(@class, 'btn_inventory') and contains(@class, 'btn_primary')]");

	@FindBy(xpath = "//div[contains(@class, 'inventory_item_price')]")
	WebElement itemPriceText;

	public WebElement getItemWebElementByName(String itemName) {
		for (WebElement item : itemsList) {
			String currentItemName = item.findElement(itemNameTextLocator).getText();
			if (itemName.equals(currentItemName)) {
				return item;
			}
		}
		return null;
	}


	public WebElement getItemWebElementByDescription(String itemDescr) {
		for (WebElement item : itemsList) {
			String currentItemDescr = item.findElement(itemDescriptionTextLocator).getText();
			if (itemDescr.equals(currentItemDescr)) {
				return item;
			}
		}
		return null;
	}

	public void addItemToCart(String itemName) {
		WebElement addToCartBtn = getItemWebElementByName(itemName).findElement(addToCartBtnLocator);
		addToCartBtn.click();
	}

	public String getBackpackName(String itemName) {
		return getItemWebElementByName(itemName).findElement(itemNameTextLocator).getText();
	}

	public String getBackpackDescription(String itemDescr) {
		return getItemWebElementByDescription(itemDescr).findElement(itemDescriptionTextLocator).getText();
	}

	public String getBackpackPrice() {
		return itemPriceText.getText();
	}

	public boolean isCartBadgeVisible() {
//        if using isDisplayed, exception will be thrown; only handled with try/catch
//        try {
//            return shoppingCartBadge.isDisplayed();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return false;
		return shoppingCartBadge.isVisible(); //todo try/catch block is the correct solution
	}

	public String getCartItemsNumber() {
		return shoppingCartBadge.getText();
	}

	public String getBackpackRemoveButtonText() {
		return itemRemoveButton.getText();
	}

	public boolean getBackpackRemoveButtonDisplayed() {
		return itemRemoveButton.isDisplayed(); //todo use try/catch as above
	}

	public void clickCartButton() {
		cartButton.click();
	}
}
