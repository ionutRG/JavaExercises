package loginTests;

import entities.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class LoginTests {
    protected EnvironmentVariables environmentVariables;
    private String baseUrl;
    private User userStandard;
    private User userLockedOut;
    private User userProblem;
    private User userPerformance;
    private User userEmpty;

    @Managed
    WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Before
    public void setup() {
        baseUrl = environmentVariables.getProperty("base.url");
        //initialize test data -> user with username and password
        userStandard = new User("standard_user", "secret_sauce");
        userLockedOut = new User("locked_out_user", "secret_sauce");
        userProblem = new User("problem_user", "secret_sauce");
        userPerformance = new User("performance_glitch_user", "secret_sauce");
        userEmpty = new User("", "");
    }

    @Test
    @Title("Login user with valid credentials - StandardUser")
    public void loginValidUserStandard() {
        //navigate to site
//  all 3 do the same thing below:
        loginSteps.navigateToUrl("https://www.saucedemo.com");
//        loginSteps.navigateToUrl(baseUrl);
//        driver.get("https://www.saucedemo.com/");
        //login user to site
        loginSteps.login(userStandard.getUsername(), userStandard.getPassword());
        //expected results:
        loginSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/inventory.html");
    }

    @Test
    @Title("Login user with valid credentials - LockedOutUser")
    public void loginValidUserLockedOut() {
        //navigate to site
        loginSteps.navigateToUrl("https://www.saucedemo.com/");
        //login user to site
        loginSteps.login(userLockedOut.getUsername(), userLockedOut.getPassword());
        //expected results:
        loginSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/");
        loginSteps.verifyEmptyAndLockedOutUserErrorMessage("Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    @Title("Login user with valid credentials - ProblemUser")
    public void loginValidUserProblem() {
        //navigate to site
        loginSteps.navigateToUrl("https://www.saucedemo.com/");
        //login user to site
        loginSteps.login(userProblem.getUsername(), userProblem.getPassword());
        //expected results:
        loginSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/inventory.html");
        loginSteps.verifyProblemUserElement(true);
    }

    @Test
    @Title("Login user with valid credentials - PerformanceUser")
    public void loginValidUserPerformance() {
        //navigate to site
        loginSteps.navigateToUrl("https://www.saucedemo.com/");
        //login user to site
        loginSteps.login(userPerformance.getUsername(), userPerformance.getPassword());
        //expected results:
        loginSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/inventory.html");
    }

    @Test
    @Title("Login user with empty credentials - EmptyUser")
    public void verifyEmptyUserSuccessfullyLoggedIn() {
        //navigate to site
        loginSteps.navigateToUrl("https://www.saucedemo.com/");
        //login user to site
        loginSteps.login(userEmpty.getUsername(), userEmpty.getPassword());
        //expected results:
        loginSteps.verifyCurrentUrlIsCorrect("https://www.saucedemo.com/");
        loginSteps.verifyEmptyAndLockedOutUserErrorMessage("Epic sadface: Username is required");
    }
}