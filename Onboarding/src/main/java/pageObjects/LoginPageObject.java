package pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")

public class LoginPageObject extends PageObjectBase{
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
        return problemUserElement.isDisplayed();
    }

//    public boolean getProblemUserElementCounts() {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println("Am intrat in FOR pentru ProblemUser cu numar: " + i + "si element gasit: " + problemUserElement);
//            problemUserElement.isDisplayed();
//        }
//        System.out.println("am gasit: " + getProblemUserElementCounts());
//    }
}