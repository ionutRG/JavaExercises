package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.LoginPageObject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LoginSteps extends StepsBase {
    LoginPageObject loginPage;

    //Login method for {0} = username and {1} = password
    @Step("Enter credentials in boxes with username {0} and password {1}")
    public void login(String username, String password) {
        loginPage.loginUser(username, password);
    }


    @Step("Expected: User is a Locked Out user and cannot log in.\nUser remains on Login page with getEmptyAndLockedOutErrorMessage: {0}")
    public void verifyEmptyAndLockedOutUserErrorMessage(String expectedErrorMessage) {
        assertThat("User is not prompted with error", loginPage.getEmptyAndLockedOutErrorMessage(), is(expectedErrorMessage));
    }

    @Step("Expected: User is NOT logged in - Problem User with problemUserElement: {0}")
    public void verifyProblemUserElement(boolean problemUserElement) {
        assertThat("User is a Problem user and", loginPage.isProblemUserElementDisplayed(), is(problemUserElement));
    }

    // ***** PARAMETERIZED RUN: Username and password using array Error message check
    @Step("Expected: PARAMETRIZED RUN, error message check! - Empty/LockedOut user with EmptyLockedOutErrorMessage: {0}")
    public void emptyAndLockedOutUserErrorCheck(String emptyLockedOutErrorMessage) {
        assertThat("User is a PARAMETRIZED LockedOut user and", loginPage.getEmptyAndLockedOutErrorMessage(), is(emptyLockedOutErrorMessage));
    }

}