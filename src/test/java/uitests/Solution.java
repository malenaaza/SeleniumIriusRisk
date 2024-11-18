package uitests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import base.WebDriverTestCase;
import org.testng.annotations.*;
import pages.Home;
import pages.Login;

public class Solution extends WebDriverTestCase {

    @Test
    public void emailPassArePresent() {
        var login = Login.login(driver);
        login.goToLoginPage();

        assertTrue(login.usermail().isDisplayed()&&login.password().isDisplayed());
    }

    @Test
    public void loginButtonIsPresent() {
        var login = Login.login(driver);
        login.goToLoginPage();

        assertTrue(login.loginButton().isDisplayed());
    }

    @Test
    public void loginOK() {

        var login = Login.login(driver);
        login.goToLoginPage();
        login.fillUsername("valid@username.com");
        login.fillPassword("password");
        login.clickLoginButton();

        assertEquals(Home.home(driver).okAlert().getText(), "Welcome to APP.");
    }

    @Test
    public void loginNotOK() {

        var login = Login.login(driver);
        login.goToLoginPage();
        login.fillUsername("unknown@username.com");
        login.fillPassword("password");
        login.clickLoginButton();

        assertEquals(login.failAlert().getText(), "You shall not pass!");
    }


}
