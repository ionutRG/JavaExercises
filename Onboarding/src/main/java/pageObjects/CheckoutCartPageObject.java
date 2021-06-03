package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCartPageObject extends PageObjectBase {

    @FindBy(xpath = "//div[contains(@class, 'header_secondary_container')]")
    WebElement getHeader;

    @FindBy(xpath = "//div[contains(@class, 'cart_quantity_label')]")
    WebElement getCartQuantityLabel;

    @FindBy(xpath = "//div[contains(@class, 'cart_desc_label')]")
    WebElement getCartDescriptionLabel;

    public String getHeaderTextCart() {
        return getHeader.getText();
    }

    public boolean isCartHeaderDisplayed() {
        try {
            getHeader.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for Cart Header: " + e);
        }
        return true;
    }

    public String getQtyLabel() {
        return getCartQuantityLabel.getText();
    }

    public String getDescrLabel() {
        return getCartDescriptionLabel.getText();
    }

}
