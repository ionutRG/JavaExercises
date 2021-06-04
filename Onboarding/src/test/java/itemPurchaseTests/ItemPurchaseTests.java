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
import steps.*;

@RunWith(SerenityRunner.class)
public class ItemPurchaseTests {
    protected EnvironmentVariables environmentVariables;
    private String baseUrl;
    private User userStandard;
    private Product itemBackpack;

    @Managed
    WebDriver driver;

    @Steps
    StepsBase baseSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    ItemPurchaseSteps itemPurchaseSteps;

    @Steps
    YourCartSteps yourCartSteps;

    @Steps
    CheckoutOverviewSteps checkoutOverviewSteps;

    @Steps
    CheckoutYourInformationSteps checkoutYourInfoSteps;

    @Steps
    CheckoutCartCompleteSteps checkoutCompleteSteps;

    @Steps
    CheckoutCartBaseSteps cartBaseSteps;


    @Before
    public void setupInventory() {
        baseUrl = environmentVariables.getProperty("base.url");

        // initialize test data -> user with username and password
        userStandard = new User("standard_user", "secret_sauce", "John", "Smith", "123456");

        // initialize inventory items test data -> item with name/description/price
        itemBackpack = new Product(
                "Sauce Labs Backpack",
                "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
                "$29.99");
    }

    @Test
    @Title("Login, add Backpack item, go through Cart/checkout and confirm order details")
    public void checkoutProduct() {


//*****        LOGIN PAGE
        //navigate to site
        loginSteps.navigateToUrl("https://www.saucedemo.com");

        //login user to site
        loginSteps.login(userStandard.getUsername(), userStandard.getPassword());

        //expected results: INVENTORY URL is correct
        baseSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/inventory.html");


//*****         INVENTORY PAGE/MAIN PAGE
        //expected results: check if cart is empty
        itemPurchaseSteps.isCartIsEmpty();

        //check if Backpack item name is correct
        itemPurchaseSteps.verifyBackpackName(itemBackpack.getName());

        //check if Backpack item description is correct
        itemPurchaseSteps.verifyBackpackDescription(itemBackpack.getDescription());

        //check if Backpack item price is correct
        itemPurchaseSteps.verifyBackpackPrice(itemBackpack.getPrice());

        //add BP to Cart
        itemPurchaseSteps.addItemToCart(itemBackpack.getName());

        //verify Backpack successfully added to Cart
        itemPurchaseSteps.isRemoveButtonPresent();

        //check BP added to cart: WebElement isDisplayed and text is REMOVE
        itemPurchaseSteps.verifyRemoveButtonText("REMOVE");

        //check Cart items number
        itemPurchaseSteps.verifyCartItemsNumber("1");

        //click on Cart button
        itemPurchaseSteps.goToCart();


//*****     YOUR CART PAGE
        //check Cart URL is correct
        baseSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/cart.html");

        //check Your Cart header
        cartBaseSteps.isGenericCartHeaderDisplayed();

        //check Your Cart header text
        cartBaseSteps.verifyYourCartHeaderText("YOUR CART");

        //check Your Cart QTY label text
        cartBaseSteps.verifyYourCartQtyLabel("QTY");

        //check Your Cart DESCRIPTION label text
        cartBaseSteps.verifyYourCartDescrLabel("DESCRIPTION");

        //check Your Cart item names
        yourCartSteps.verifyYourCartItemName(itemBackpack.getName());

        //check Your Cart item descriptions
        yourCartSteps.verifyYourCartItemDescr(itemBackpack.getDescription());

        //check Your Cart item prices
        yourCartSteps.verifyYourCartItemPrice(itemBackpack.getPrice());

        //check Your Cart items REMOVE button
        yourCartSteps.verifyYourCartRemoveButton();

        //check Your Cart items REMVOE button text
        yourCartSteps.verifyYourCartRemoveButton("REMOVE");

        //check Your Cart CHECKOUT button
        yourCartSteps.verifyYourCartCheckoutButton();

        //check Your Cart CHECKOUT button text
        yourCartSteps.verifyYourCartCheckoutButton("CHECKOUT");

        //go to CHECKOUT
        yourCartSteps.clickCheckoutButton();


//*****     CHECKOUT: YOUR INFORMATION Page

        //expected results: CHECKOUT URL is correct
        baseSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/checkout-step-one.html");

        //check CHECKOUT Your Information header
        cartBaseSteps.isGenericCartHeaderDisplayed();

        //check CHECKOUT YOUR INFORMATION header text
        cartBaseSteps.verifyYourCartHeaderText("CHECKOUT: YOUR INFORMATION");

        //check User details box
        checkoutYourInfoSteps.verifyUserDetailsBoxDisplayed();

        //check CONTINUE button
        checkoutYourInfoSteps.verifyContinueButtonDisplayed();

        //enter User details for Checkout: first name, last name, zip code
        checkoutYourInfoSteps.enterUserDetails(userStandard.getFirstName(), userStandard.getLastName(), userStandard.getZipCode());


//*****     CHECKOUT: OVERVIEW Page

        //expected results: CHECKOUT OVERVIEW URL is correct
        baseSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/checkout-step-two.html");

        // check CHECKOUT OVERVIEW header
        cartBaseSteps.isGenericCartHeaderDisplayed();

        //check CHECKOUT OVERVIEW header text
        cartBaseSteps.verifyYourCartHeaderText("CHECKOUT: OVERVIEW");

        //check CHECKOUT OVERVIEW QTY label text
        cartBaseSteps.verifyYourCartQtyLabel("QTY");

        //check CHECKOUT OVERVIEW DESCRIPTION label text
        cartBaseSteps.verifyYourCartDescrLabel("DESCRIPTION");

        //check Payment Information label info text
        checkoutOverviewSteps.verifyPaymentInfoText("Payment Information:");

        //check Payment Information label value text
        checkoutOverviewSteps.verifyPaymentInfoValue("SauceCard #31337");

        //check Shipping Information label info text
        checkoutOverviewSteps.verifyShippingInfoText("Shipping Information:");

        //check Shipping Information label info text
        checkoutOverviewSteps.verifyShippingInfoValue("FREE PONY EXPRESS DELIVERY!");

        //click FINISH button
        checkoutOverviewSteps.clickFinishButton();


//*****     CHECKOUT: COMPLETE Page

        //check CHECKOUT COMPLETE URL is correct
        baseSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/checkout-complete.html");

        //check Cart header is displayed
        cartBaseSteps.isGenericCartHeaderDisplayed();

        //check Cart header text
        cartBaseSteps.verifyYourCartHeaderText("CHECKOUT: COMPLETE!");

        //check Thanks text
        checkoutCompleteSteps.verifyThanksText("THANK YOU FOR YOUR ORDER");

        //check dispatched text
        checkoutCompleteSteps.verifyDispatchGenericCartText("Your order has been dispatched, and will arrive just as fast as the pony can get there!");

        //check Pony express image
        checkoutCompleteSteps.verifyCompleteImageDisplayed();

        //check Back Home button displayed
        checkoutCompleteSteps.isBackHomeBtnDisplayed();

        //check Back Home button text
        checkoutCompleteSteps.verifyBackHomeBtnText("Back Home");

        //click Back Home button
        checkoutCompleteSteps.clickBackHome();

        //check URL is correct
        baseSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/inventory.html");
    }
}