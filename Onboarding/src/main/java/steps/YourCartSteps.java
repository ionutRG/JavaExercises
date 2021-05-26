package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.CartPageObject;
import pageObjects.InventoryPageObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class YourCartSteps extends StepsBase {
    CartPageObject cartPage;

//    @Step() ("Expected: Header Label is: {0}")
//    public void verifyYourCartHeaderLabel(String headerLabel) {
//        assertThat("", cartPage.getHeaderText(), is(headerLabel));
//    }
}
