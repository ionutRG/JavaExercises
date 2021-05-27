package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectBase extends PageObject {

    @FindBy(xpath = "//div[contains(@class, 'header_secondary_container')]")
    WebElement getHeader;

    @FindBy(xpath = "//div[contains(@class, 'cart_quantity_label')]")
    WebElement getCartQuantityLabel;

    @FindBy(xpath = "//div[contains(@class, 'cart_desc_label')]")
    WebElement getCartDescriptionLabel;



    public PageObjectBase() {
        getDriver();
    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    public void getDriverToUrl(String url) {
        getDriver().manage().window().maximize();
        getDriver().get(url);
    }

    public String getHeaderTextCart() {
        return getHeader.getText();
    }

    public boolean verifyHeaderCart() {
        return getHeader.isDisplayed();
    }

    public String getQtyLabel() {
        return getCartQuantityLabel.getText();
    }

    public String getDescrLabel() {
        return getCartDescriptionLabel.getText();
    }
}