package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPageObject {
    @FindBy(xpath = "//div[contains(@class, 'inventory_item_price')]")
    WebElement getItemPriceOnCheckoutOverviewPage;

    @FindBy(xpath = "//div[contains(@class, 'summary_subtotal_label')]")
    WebElement getTotalPriceOnCheckoutOverviewPage;

    @FindBy(xpath = "//button[contains(@class, 'btn btn_action btn_medium cart_button')]")
    WebElement clickOnFinishButtonOnCheckoutOverviewPage;

    public String getItemsPrice() {
        return getItemPriceOnCheckoutOverviewPage.getText();
    }

    public String getTotalPrice() {
        return getTotalPriceOnCheckoutOverviewPage.getText();
    }

    public void clickOnFinish() {
        clickOnFinishButtonOnCheckoutOverviewPage.click();
    }



}
