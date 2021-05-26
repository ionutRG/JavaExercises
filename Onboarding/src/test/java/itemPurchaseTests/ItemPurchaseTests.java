package itemPurchaseTests;

import entities.Product;
import entities.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageObjects.InventoryPageObject;
import steps.ItemPurchaseSteps;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class ItemPurchaseTests {
    protected EnvironmentVariables environmentVariables;
    private String baseUrl;
    private User userStandard;
    private Product itemBackpack;
    private Product itemLight;
    private Product itemTshirt;
    private Product itemJacket;
    private Product itemOnesie;
    private Product itemTestAll;

    @Managed
    WebDriver driver;

    @Steps
    LoginSteps loginSteps;
    ItemPurchaseSteps itemPurchaseSteps;
    InventoryPageObject inventoryPageObject;

    @Before
    public void setupInventory() {
        baseUrl = environmentVariables.getProperty("base.url");
//    initialize test data -> user with username and password
        userStandard = new User("standard_user", "secret_sauce");

//    initialize inventory items test data -> item with name/description/price
        itemBackpack = new Product(
                "Sauce Labs Backpack",
                "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
                "29.99");

        itemLight = new Product(
                "Sauce Labs Bike Light",
                "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.",
                "9.99");

        itemTshirt = new Product(
                "Sauce Labs Bolt T-Shirt",
                "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.",
                "15.99");

        itemJacket = new Product(
                "Sauce Labs Fleece Jacket",
                "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.",
                "49.99");

        itemOnesie = new Product(
                "Sauce Labs Onesie",
                "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.",
                "7.99");

        itemTestAll = new Product(
                "Test.allTheThings() T-Shirt (Red)",
                "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.",
                "15.99");

////////////////////////////////////////////////////////
//        Product itemsFromList = new Product(
//                "getProductsItemNameList",
//                "getProductsItemDescriptionList",
//                "getProductsItemPriceList"
//        );
//
//        Product itemsFromList2 = new Product(
//                itemsFromList.getProductsItemNameList("items name list"),
//                itemsFromList.getProductsItemDescriptionList("items description list"),
//                itemsFromList.getProductsItemPriceList("item prices list")
//        );
////////////////////////////////////////////////////////
//
//        Product itemBackpackFromList = new Product(
//                itemBackpack.getItemName(),
//                itemBackpack.getItemDescription(),
//                itemBackpack.getItemPrice()
//        );
//
//        Product itemLightFromList = new Product(
//                itemLight.getItemName(),
//                itemLight.getItemDescription(),
//                itemLight.getItemPrice()
//        );
//
//        Product itemTshirttFromList = new Product(
//                itemTshirt.getItemName(),
//                itemTshirt.getItemDescription(),
//                itemTshirt.getItemPrice()
//        );
//
//        Product itemJacketFromList = new Product(
//                itemJacket.getItemName(),
//                itemJacket.getItemDescription(),
//                itemJacket.getItemPrice()
//        );
//
//        Product itemOnesieFromList = new Product(
//                itemOnesie.getItemName(),
//                itemOnesie.getItemDescription(),
//                itemOnesie.getItemPrice()
//        );
//
//        Product itemTestAllFromList = new Product(
//                itemTestAll.getItemName(),
//                itemTestAll.getItemDescription(),
//                itemTestAll.getItemPrice()
//        );
    }

//    @Test
//    @Title("Check Backpack details: name, description, price")
//    public void checkBackpackDetails() {
//        //get Backpack name, description, price
//        itemPurchaseTests.itemBackpack.getItemName();
//        itemPurchaseTests.itemBackpack.getItemDescription();
//        itemPurchaseTests.itemBackpack.getItemPrice();
//        //expected results:
//        itemPurchaseSteps.verifyBackpackName(itemBackpack.getItemName());
//        itemPurchaseSteps.verifyBackpackDescription(itemBackpack.getItemDescription());
//        itemPurchaseSteps.verifyBackpackPrice(itemBackpack.getItemPrice());
//    }

    @Test
    @Title("Login with StandardUser; Check if Cart is empty; Add BP to Cart; Check BP added to Cart")
    public void loginAndAddBackpackToCart() {
        //navigate to site
        loginSteps.navigateToUrl("https://www.saucedemo.com");
        //login user to site
        loginSteps.login(userStandard.getUsername(), userStandard.getPassword());
        //expected results: url is correct
        loginSteps.verifyUsernameUrlsAreCorrect("https://www.saucedemo.com/inventory.html");
        //expected results: check if cart is empty
        itemPurchaseSteps.verifyCartIsEmpty(false);
        //add BP to Cart
        inventoryPageObject.addToCartBackpackFromInventoryClick();
        //verify Backpack successfully added to Cart
        itemPurchaseSteps.verifyRemoveButtonIsPresent(true);
        //check BP added to cart: WebElement isDisplayed and text is REMOVE
        itemPurchaseSteps.verifyRemoveButtonText("REMOVE");
        //check Cart items number
        itemPurchaseSteps.verifyCartItemsNumber("1");
        //click on Cart button
        inventoryPageObject.clickCartButton();
    }
}


//        itemsList = new Product(itemsList.getItemName(), itemsList.getItemDescription(), itemsList.getItemPrice());
//                System.out.println(itemsList);