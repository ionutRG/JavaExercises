package pageObjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPageObject extends PageObjectBase {
    @FindBy(xpath = "//div[contains(@class, 'header_secondary_container')]")
    WebElement getHeader;

    @FindBy(xpath = "//div[contains(@class, 'cart_quantity_label')]")
    WebElement getCartQuantityLabel;

    @FindBy(xpath = "//div[contains(@class, 'cart_desc_label')]")
    WebElement getCartDescriptionLabel;

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

    @FindBy(xpath="//div[@class = \"cart_item\"]")
    List<WebElement> cartItems;


    public By itemNameLocator = By.xpath("//div[@class='inventory_item_name']");

    public String getHeaderText() {
        return getHeader.getText();
    }

    public String getQtyLabel() {
        return getCartQuantityLabel.getText();
    }

    public String getDescrLabel() {
        return getCartDescriptionLabel.getText();
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

    public String getCheckoutTextFromCart() {
        return getYourCartCheckoutButton.getText();
    }

    public boolean getCheckoutElementFromCart() {
        return getYourCartCheckoutButton.isDisplayed();
    }

    public void clickCheckoutButtonCart() {
        getYourCartCheckoutButton.click();
    }

    public WebElement getCartItem(String itemName) {
        for (WebElement item: cartItems) {
            if (itemName.equals(item.findElement(itemNameLocator).getText())) {
                return item;
            }
        }
        return null;
    }

//    public void removeItemFormCart(String itemName) {
//        WebElement item = getCartItem(itemName);
//        item.findElement(...remove btn locator).click();
//    }

//    public void removeItemFormCart(WebElement item) {
//        item.findElement(...remove btn locator).click();
//    }
}
