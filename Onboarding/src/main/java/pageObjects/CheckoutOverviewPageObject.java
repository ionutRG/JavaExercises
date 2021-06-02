package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutOverviewPageObject extends PageObjectBase {
	@FindBy(xpath = "//button[contains(@id, 'finish')]")
	WebElement finishButton;

	@FindBy(xpath = "//div[contains(@class, 'summary_info_label')]")
	List<WebElement> checkoutLabelList;

	@FindBy(xpath = "//div[contains(@class, 'summary_value_label')]")
	List<WebElement> checkoutLabelValues;

	public WebElement getInfoLabel(String labelInfo) {
		for (WebElement label : checkoutLabelList) {
			String currentLabelInfo = label.getText();
			if (labelInfo.equals(currentLabelInfo)) {
				return label;
			}
		}
		return null;
	}

	//todo you already have a method were you get the label object
	// to get the label value for a specific object you need to call the above getInfoLabel
	// and on the returned WebElement search the value and return its text
	// You don't need to duplicate the code
	public WebElement getInfoLabelValues(String labelValue) {
		for (WebElement label : checkoutLabelValues) {
			String currentLabelValue = label.getText();
			if (labelValue.equals(currentLabelValue)) {
				return label;
			}
		}
		return null;
	}

	public String getLabelInfo(String labelTitle) {
		return getInfoLabel(labelTitle).getText();
	}

	public String getLabelValue(String labelText) {
		return getInfoLabelValues(labelText).getText();
	}

	public void clickFinish() {
		finishButton.click();
	}


}
