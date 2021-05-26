package entities;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Product {
    private String itemName;
    private String itemDescription;
    private String itemPrice;

    public Product(String itemName, String itemDescription, String itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    @Managed
    WebDriver driver;

    @FindBy(xpath = "//div[contains(@class, 'inventory_item')]")
    List<WebElement> findProductListFromProductsPage;

//    List<WebElement> elements = driver.findElements(By.className("inventory_item"));
//    public By findProductItemName = By.xpath("//div[contains(@class, 'inventory_item')]");
    public By findProductItemName = By.xpath("//div[contains(@class, 'inventory_item_name')]");
    public By findProductItemDescription = By.xpath("//div[contains(@class , 'inventory_item_desc')]");
    public By findProductItemPrice = By.xpath("//div[contains(@class, 'inventory_item_price')]");

//    get product items name, description and price list
    public WebElement getProductsItemNameList (String itemsNameList) {
        for (WebElement nameList: findProductListFromProductsPage) {
            if (itemsNameList.equals(nameList.findElement(findProductItemName).getText())) {
                System.out.println(itemsNameList);
                return nameList;
            }
        }
        return null;
    }

    public WebElement getProductsItemDescriptionList (String itemsDescriptionList) {
        for (WebElement descriptionList: findProductListFromProductsPage) {
            if (itemsDescriptionList.equals(descriptionList.findElement(findProductItemDescription).getText())) {
                return descriptionList;
            }
        }
        return null;
    }

    public WebElement getProductsItemPriceList (String itemsPriceList) {
        for (WebElement priceList: findProductListFromProductsPage) {
            if (itemsPriceList.equals(priceList.findElement(findProductItemPrice).getText())) {
                return priceList;
            }
        }
        return null;
    }

    public void convertProductListToString () {
        WebElement webElementText = driver.findElement(By.xpath("//div[contains(@class, 'inventory_item')]"));

    }

//    public static WebElement createProductsListAsString () {
//        String products =
//    }

//    Product items = new Product(getProductsItemNameList(itemName), getProductsItemDescriptionList(itemDescription), getProductsItemPriceList(itemPrice));

//    item Price returned as $10,99. Method to remove $ from price and convert price String value to int value
//    public String itemPricesWithoutDollar() {
//        String priceWithoutDollar = getProductsItemPriceList().toString(itemPrice);
//        priceWithoutDollar = priceWithoutDollar.replace("$", "");
//        System.out.println("Prices without $ sign are: " + priceWithoutDollar);
//        return priceWithoutDollar;
//    }


//    Product[] items = {
//            new Product(getProductsItemNameList()),
//            new Product()
//    }




}
