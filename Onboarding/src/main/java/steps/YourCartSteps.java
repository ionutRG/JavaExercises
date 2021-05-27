package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.CartPageObject;
import pageObjects.InventoryPageObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class YourCartSteps extends StepsBase {
    CartPageObject cartPage;

    @Step ("Expected: Header Label is: {0}")
    public void verifyYourCartHeaderLabel(String headerLabel) {
        assertThat("", cartPage.getHeaderText(), is(headerLabel));
    }

    @Step ("Expected: Quantity Label is: {0}")
    public void verifyYourCartQtyLabel(String qtyLabel) {
        assertThat("", cartPage.getQtyLabel(), is(qtyLabel));
    }

    @Step ("Expected: Description Label is: {0}")
    public void verifyYourCartDescrLabel(String descrLabel) {
        assertThat("", cartPage.getDescrLabel(), is(descrLabel));
    }

    @Step ("Expected: Item name from Cart is: {0}")
    public void verifyYourCartItemName(String itemNameCart) {
        assertThat("", cartPage.getItemNameFromCart(), is(itemNameCart));
    }

    @Step ("Expected: Item description from Cart is: {0}")
    public void verifyYourCartItemDescr(String itemDescrCart) {
        assertThat("", cartPage.getItemDescrFromCart(), is(itemDescrCart));
    }

    @Step ("Expected: Item price from Cart is: {0}")
    public void verifyYourCartItemPrice(String itemPriceCart) {
        assertThat("", cartPage.getItemPriceFromCart(), is(itemPriceCart));
    }

    @Step ("Expected: REMOVE button text from Cart is: {0}")
    public void verifyYourCartRemoveButton(String removeButtonText) {
        assertThat("", cartPage.getRemoveTextFromCart(), is(removeButtonText));
    }
    @Step ("Expected: REMOVE button for Your Cart items exists:")
    public void verifyYourCartRemoveButton(boolean removeButtonPresent) {
        assertThat("REMOVE button for cart item exists", cartPage.getRemoveElementFromCart(), is(removeButtonPresent));
    }

    @Step ("Expected: Checkout button text from Cart is: {0}")
    public void verifyYourCartCheckoutText(String itemPriceCart) {
        assertThat("", cartPage.getCheckoutTextFromCart(), is(itemPriceCart));
    }

    @Step ("Expected: REMOVE button for Your Cart items exists:")
    public void verifyYourCartCheckoutButton(boolean checkoutButtonPresent) {
        assertThat("Checkout button for cart item exists", cartPage.getCheckoutElementFromCart(), is(checkoutButtonPresent));
    }
}
