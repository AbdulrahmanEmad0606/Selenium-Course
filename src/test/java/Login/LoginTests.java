package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testLoginSuccessfully(){
        LoginPage loginPage = homePage.authPage();
        loginPage.setUserName("tomsmith");
        loginPage.SetPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getFlashMessage().contains("You logged into a secure area!"),
               "Alert text is incorrect");
    }

}
