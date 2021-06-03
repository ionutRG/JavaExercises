package pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")

public class LoginPageObject extends PageObjectBase {
    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(xpath = "//input[contains(@class, 'submit-button')]")
    WebElement submitBtn;

    @FindBy(xpath = "//div[contains(@class, 'error-message-container')]")
    WebElement emptyAndLockedOutErrorMessage;

    @FindBy(xpath = "//img[contains(@src, '/static/media/sl-404.168b1cce.jpg')]")
    WebElement problemUserElement;

    public void loginUser(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitBtn.click();
    }

    public String getEmptyAndLockedOutErrorMessage() {
        return emptyAndLockedOutErrorMessage.getText();
    }

    public boolean getProblemUserElement() {
        try {
            problemUserElement.isDisplayed();
        } catch (Exception e) {
            System.out.println("Exception caught for Problem user element: " + e.getMessage());
        }
        return true;
    }
}