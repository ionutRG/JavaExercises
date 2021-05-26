package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectBase;

public class StepsBase {
    PageObjectBase page;
    WebDriver driver;

    @Step("Navigate to the url {0}")
    public void navigateToUrl(String url) {
        page.getDriverToUrl(url);
    }
}
