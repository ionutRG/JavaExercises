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
import steps.ItemPurchaseSteps;
import steps.LoginSteps;
import steps.YourCartSteps;

// Am adaugat linia asta
// Am adaugat si linia asta, 3rd push
// Am adaugat linia asta pentru Onboarding Branch

@RunWith(SerenityRunner.class)
public class ItemPurchaseTests {
    protected EnvironmentVariables environmentVariables;
    private String baseUrl;
    private User userStandard;
    private Product itemBackpack;

    @Managed
    WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    ItemPurchaseSteps itemPurchaseSteps;

    @Steps
    YourCartSteps yourCart;

    @Before
    public void setupInventory() {
        baseUrl = environmentVariables.getProperty("base.url");

        // initialize test data -> user with username and password
        userStandard = new User("standard_user", "secret_sauce", "John", "Smith", "123456");

        // initialize inventory items test data -> item with name/description/price
        itemBackpack = new Product(
                "Sauce Labs Backpack",
                "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
                "29.99");
    }

    @Test
    @Title("Login with StandardUser; Check if Cart is empty; Add BP to Cart; Check BP added to Cart")
    public void checkoutProduct() {
        //navigate to site
        loginSteps.navigateToUrl("https://www.saucedemo.com");

        //login user to site
        loginSteps.login(userStandard.getUsername(), userStandard.getPassword());

        //expected results: url is correct
        loginSteps.verifyUsernameUrlsAreCorrect("https://www.saucedemo.com/inventory.html");

        //expected results: check if cart is empty
        itemPurchaseSteps.verifyCartIsEmpty();

        //add BP to Cart
        itemPurchaseSteps.addItemToCart(itemBackpack.getName());

        //verify Backpack successfully added to Cart
        itemPurchaseSteps.verifyRemoveButtonIsPresent();

        //check BP added to cart: WebElement isDisplayed and text is REMOVE
        itemPurchaseSteps.verifyRemoveButtonText("REMOVE");

        //check Cart items number
        itemPurchaseSteps.verifyCartItemsNumber("1");

        //click on Cart button
        itemPurchaseSteps.goToCart();


    }
}