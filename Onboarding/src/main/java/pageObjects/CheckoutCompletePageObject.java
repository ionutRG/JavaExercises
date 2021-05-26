package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePageObject {
    @FindBy(xpath = "//h2[contains(@class, 'complete-header')]")
    WebElement checkCheckoutComplete;

    public String getItemsPrice() {
        return checkCheckoutComplete.getText();
    }
}
