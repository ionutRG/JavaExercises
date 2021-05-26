package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageObjectBase extends PageObject {

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
}