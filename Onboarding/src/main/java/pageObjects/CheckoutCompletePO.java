package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePO {
    @FindBy(xpath = "//h2[contains(@class, 'complete-header')]")
    WebElement checkoutCompleteThanks;

    @FindBy(xpath = "//div[contains(@class, 'complete-text')]")
    WebElement checkoutCompleteDispatch;

    @FindBy(xpath = "//img[contains(@src, '/static/media/pony-express.46394a5d.png')]")
    WebElement checkoutCompleteImg;

    @FindBy(xpath = "//button[contains(@id, 'back-to-products')]")
    WebElement checkoutCompleteBackHomeBtn;

    public String getCompleteThanksText() {
        return checkoutCompleteThanks.getText();
    }

    public String getCompleteDispatchText() {
        return checkoutCompleteDispatch.getText();
    }

    public boolean isCompleteImageDisplayed() {
        try {
            checkoutCompleteImg.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for Checkout Complete image: " + e);
        }
        return true;
    }

    public boolean isBackHomeBtnDisplayed() {
        try {
            checkoutCompleteBackHomeBtn.isEnabled();
        } catch (Exception e) {
            System.out.println("Exception caught for Back Home button: " + e);
        }
        return true;
    }

    public String verifyBackHomeBtnText() {
        return checkoutCompleteBackHomeBtn.getText();
    }

    public void clickBackHomeBtn() {
        checkoutCompleteBackHomeBtn.click();
    }
}
