package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.InventoryPageObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ItemPurchaseSteps extends StepsBase {
    InventoryPageObject inventoryPage;

//    @Step ("Expected: Backpack item name is correct: {0}")
//    public void verifyBackpackName(String expectedName) {
//        assertThat("Backpack name is:", inventoryPage.getBackpackNameFromInventory(), is(expectedName));
//    }
//
//    @Step ("Expected: Backpack item description is correct: {0}")
//    public void verifyBackpackDescription(String expectedDesc) {
//        assertThat("Backpack description is: ", inventoryPage.getBackpackDescriptionFromInventory(), is(expectedDesc));
//    }
//
//    @Step ("Expected: Backpack item price is correct: {0}")
//    public void verifyBackpackPrice(String expectedPrice) {
//        assertThat("Backpack price is: ", inventoryPage.getBackpackPriceFromInventory(), is(expectedPrice));
//    }

    @Step ("Expected: Cart is empty? {0}")
    public void verifyCartIsEmpty(boolean isCartEmpty) {
        assertThat("Cart is empty", inventoryPage.emptyCartButtonDisplayed(), is(isCartEmpty));
    }

    @Step ("Expected: REMOVE button for Backpack exists:")
    public void verifyRemoveButtonIsPresent(boolean removeButtonPresent) {
        assertThat("REMOVE for BP exists", inventoryPage.getBackpackRemoveButtonDisplayed(), is(removeButtonPresent));
    }

    @Step ("Expected: REMOVE button for Backpack has correct text: {0}")
    public void verifyRemoveButtonText(String removeButtonText) {
        assertThat("Backpack REMOVE button text: ", inventoryPage.getBackpackRemoveButtonText(), is(removeButtonText));
    }

    @Step ("Expected: Cart items number is: {0}")
    public void verifyCartItemsNumber(String cartItemNumber) {
        assertThat("Cart items number: ", inventoryPage.getCartItemsNumber(), is(cartItemNumber));
    }

}
