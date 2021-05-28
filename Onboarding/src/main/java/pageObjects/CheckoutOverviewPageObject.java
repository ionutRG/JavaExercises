package pageObjects;

import org.openqa.selenium.By;
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

    By labelInfoLocator = By.xpath("//div[contains(@class, 'summary_info_label')]");
    By labelValueLocator = By.xpath("//div[contains(@class, 'summary_value_label')]");

    public WebElement getInfoLabel(String labelInfo) {
        for (WebElement label : checkoutLabelList) {
            String currentLabelInfo = label.findElement(labelInfoLocator).getText();
            if (labelInfo.equals(currentLabelInfo)) {
                return label;
            }
        }
        return null;
    }


//    public WebElement getInfoLabel(String labelInfo) {
//        for (WebElement label : checkoutLabelList) {
//            String currentLabelInfo = label.findElement(labelInfoTextLocator).getText();
//            if (labelInfo.equals(currentLabelInfo)) {
//                return label;
//            }
//        }
//        return null;
//    }

    public WebElement getInfoLabelValues(String labelValue) {
        for (WebElement label : checkoutLabelValues) {
            String currentLabelValue = label.findElement(labelValueLocator).getText();
            if (labelValue.equals(currentLabelValue)) {
                return label;
            }
        }
        return null;
    }

    public String getLabelInfo(String labelTitle) {
        return getInfoLabel(labelTitle).findElement(labelInfoLocator).getText();
    }

    public String getLabelValue(String labelText) {
        return getInfoLabelValues(labelText).findElement(labelValueLocator).getText();
    }

    public void clickFinish() {
        finishButton.click();
    }


}
