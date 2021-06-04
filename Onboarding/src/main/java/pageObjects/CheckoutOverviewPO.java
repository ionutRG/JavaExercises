package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutOverviewPO extends PageObjectBase {
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

    public WebElement getInfoLabelValues(String labelValue) {
        for (WebElement label : checkoutLabelValues) {
            String currentLabelValue = label.getText();
            if (labelValue.equals(currentLabelValue)) {
                return label;
            }
        }
        return null;
    }

    public String getLabelInfoText(String labelTitle) {
        return getInfoLabel(labelTitle).getText();
    }

    public String getLabelValueText(String labelText) {
        return getInfoLabelValues(labelText).getText();
    }

    public void clickFinish() {
        finishButton.click();
    }


}
