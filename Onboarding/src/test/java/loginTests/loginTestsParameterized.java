package loginTests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;
import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class loginTestsParameterized {

    @TestData
    public static Collection <Object[]> testDataUsers() {
        return Arrays.asList(new Object[][]{
                {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."},
                {"", "", "Epic sadface: Username is required"},
                {"standard_user", "secret_sauce", "Epic sadface: Username is required"},
                {"", "", "Epic sadface: Username is required"},
                {"", "", "Epic sadface: Username is required"}
        });
    }

    private final String USERNAME;
    private final String PASSWORD;
    private final String MESSAGE;

    public loginTestsParameterized(String username, String password, String message) {
        this.USERNAME = username;
        this.PASSWORD = password;
        this.MESSAGE = message;
    }

    @Managed
    WebDriver driver;

    @Steps
    LoginSteps loginSteps;

//    @Before
//    public void parameterizedSetup() {
//        baseUrl = environmentVariables.getProperty("base.url");
//    }

    @Title("Parameterized Test run with array of username and password - lockedOut/Empty Users")
    @Test
    public void loginCheckAndValidationLockedOutUser() {
//        GIVEN User navigates to the Login page/ navigates to URL
        loginSteps.navigateToUrl("https://www.saucedemo.com/");
//        WHEN User enters a username and a password
        loginSteps.login(USERNAME, PASSWORD);
//        THEN login check and validate username and password
        loginSteps.emptyAndLockedOutUserErrorCheck(MESSAGE);
//        loginSteps.lockedOutUserErrorCheck("Epic sadface: Sorry, this user has been locked out.");
//        loginSteps.emptyUserErrorCheck("Epic sadface: Username is required");
    }
}
