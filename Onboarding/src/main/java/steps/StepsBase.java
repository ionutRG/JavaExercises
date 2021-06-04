package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectBase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StepsBase {
    PageObjectBase pageBaseSteps;
    WebDriver driver;

    @Step("Navigate to the url {0}")
    public void navigateToUrl(String url) {
        pageBaseSteps.getDriverToUrl(url);
    }

    @Step("Expected: URL is correct: {0}")
    public void verifyCurrentUrlIsCorrect(String expectedUrl) {
        assertThat(pageBaseSteps.getCurrentUrl(), is(expectedUrl));
    }

}
