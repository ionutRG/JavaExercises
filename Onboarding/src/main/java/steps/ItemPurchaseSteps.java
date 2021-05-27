package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.InventoryPageObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ItemPurchaseSteps extends StepsBase {
    InventoryPageObject inventoryPage;

    @Step ("Expected: Backpack item name is correct: {0}")
    public void verifyBackpackName(String expectedName) {
        assertThat("Backpack name is:", inventoryPage.getBackpackName(expectedName), is(expectedName));
    }

    @Step ("Expected: Backpack item description is correct: {0}")
    public void verifyBackpackDescription(String expectedDesc) {
        assertThat("Backpack description is: ", inventoryPage.getBackpackDescription(expectedDesc), is(expectedDesc));
    }

    @Step ("Expected: Backpack item price is correct: {0}")
    public void verifyBackpackPrice(String expectedPrice) {
        assertThat("Backpack price is: ", inventoryPage.getBackpackPrice(), is(expectedPrice));
    }

    @Step ("Expected: Is Cart empty?")
    public void verifyCartIsEmpty() {
        assertThat("Cart is empty", inventoryPage.isCartBadgeVisible(), is(false));
    }

    @Step ("Expected: REMOVE button for Backpack exists:")
    public void verifyRemoveButtonIsPresent() {
        assertThat("REMOVE for BP exists", inventoryPage.getBackpackRemoveButtonDisplayed(), is(true));
    }

    @Step ("Expected: REMOVE button for Backpack has correct text: {0}")
    public void verifyRemoveButtonText(String removeButtonText) {
        assertThat("Backpack REMOVE button text: ", inventoryPage.getBackpackRemoveButtonText(), is(removeButtonText));
    }

    @Step ("Expected: Cart items number is: {0}")
    public void verifyCartItemsNumber(String cartItemNumber) {
        assertThat("Cart items number: ", inventoryPage.getCartItemsNumber(), is(cartItemNumber));
    }

    @Step ("Backpack added to cart")
    public void addItemToCart(String itemName) {
        inventoryPage.addItemToCart(itemName);
    }

    @Step ("Go to Cart")
    public void goToCart() {
        inventoryPage.clickCartButton();
    }

}
