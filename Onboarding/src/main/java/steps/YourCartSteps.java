package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.YourCartPageObject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class YourCartSteps extends StepsBase {
    YourCartPageObject cartPage;

    @Step("Expected: Item name from Cart is: {0}")
    public void verifyYourCartItemName(String itemNameCart) {
        assertThat(cartPage.getItemNameFromCart(), is(itemNameCart));
    }

    @Step("Expected: Item description from Cart is: {0}")
    public void verifyYourCartItemDescr(String itemDescrCart) {
        assertThat(cartPage.getItemDescrFromCart(), is(itemDescrCart));
    }

    @Step("Expected: Item price from Cart is: {0}")
    public void verifyYourCartItemPrice(String itemPriceCart) {
        assertThat(cartPage.getItemPriceFromCart(), is(itemPriceCart));
    }

    @Step("Expected: REMOVE button for Your Cart items exists")
    public void verifyYourCartRemoveButton() {
        assertThat(cartPage.isRemoveElementFromCartDisplayed(), is(true));
    }

    @Step("Expected: REMOVE button text from Cart is: {0}")
    public void verifyYourCartRemoveButton(String removeButtonText) {
        assertThat(cartPage.getRemoveTextFromCart(), is(removeButtonText));
    }

    @Step("Expected: CHECKOUT button for Your Cart items exists")
    public void verifyYourCartCheckoutButton() {
        assertThat(cartPage.isCheckoutElementFromCartDisplayed(), is(true));
    }

    @Step("Expected: CHECKOUT button text from Cart is: {0}")
    public void verifyYourCartCheckoutButton(String checkoutText) {
        assertThat(cartPage.getCheckoutTextFromCart(), is(checkoutText));
    }

    @Step("Go to CHECKOUT")
    public void clickCheckoutButton() {
        cartPage.clickCheckoutButtonCart();
    }
}
