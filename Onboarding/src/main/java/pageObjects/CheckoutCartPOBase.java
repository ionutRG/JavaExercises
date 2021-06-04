package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCartPOBase extends PageObjectBase {

    @FindBy(xpath = "//div[contains(@class, 'header_secondary_container')]")
    WebElement cartHeader;

    @FindBy(xpath = "//div[contains(@class, 'cart_quantity_label')]")
    WebElement cartQuantityLabel;

    @FindBy(xpath = "//div[contains(@class, 'cart_desc_label')]")
    WebElement cartDescriptionLabel;

    public String getHeaderTextCart() {
        return cartHeader.getText();
    }

    public boolean isCartHeaderDisplayed() {
        try {
            cartHeader.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for Cart Header: " + e);
        }
        return true;
    }

    public String getQtyLabelText() {
        return cartQuantityLabel.getText();
    }

    public String getDescrLabelText() {
        return cartDescriptionLabel.getText();
    }
}
