package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CheckoutOverviewPageObject extends PageObjectBase {
    @FindBy(xpath = "//button[contains(@id, 'finish')]")
    WebElement finishButton;

    @FindBy(xpath = "//div[contains(@class, 'summary_info')]")
    List<WebElement> checkoutLabelList;

    By labelInfoTextLocator = By.xpath("//div[contains(@class, 'summary_info_label')]");
    By labelValueTextLocator =  By.xpath("//div[contains(@class, 'summary_value_label')]");

    public WebElement getInfoLabel(String labelInfo) {
        for (WebElement label : checkoutLabelList) {
            String currentLabelInfo = label.findElement(labelInfoTextLocator).getText();
            if (labelInfo.equals(currentLabelInfo)) {
                return label;
            }
        }
        return null;
    }

    public WebElement getInfoLabelValues(String labelValue) {
        for (WebElement label : checkoutLabelList) {
            String currentLabelValue =  label.findElement(labelValueTextLocator).getText();
            if (labelValue.equals(currentLabelValue)) {
                return label;
            }
        }
        return null;
    }

    public String getLabelInfo(String labelInfo) {
        return getInfoLabel(labelInfo).findElement(labelInfoTextLocator).getText();
    }

    public String getLabelValue(String labelValue) {
        return getInfoLabelValues(labelValue).findElement(labelValueTextLocator).getText();
    }

    public void clickFinish() {
        finishButton.click();
    }


}
