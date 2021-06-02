package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectBase extends PageObject {

	//todo do not add any WebElements or locators to the PageObjectBase
	// this class should be reserved only for generic methods
	// e.g isElementDisplayed(WebElement element) or scrollToElement(WebElement element)

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

	//todo do not add any methods specific to a pages or component to the PageObjectBase
	// this class should be reserved only for generic methods
	// e.g isElementDisplayed(WebElement element) or scrollToElement(WebElement element)
	// header elements with be extracted to a specific page object class e.g HeaderComponentPO where you can add both locators/webelement and methods

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