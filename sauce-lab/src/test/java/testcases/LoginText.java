package testcases;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;
import utilities.DataSet;
import utilities.DriverSetup;

import static org.testng.AssertJUnit.assertEquals;

public class LoginText extends DriverSetup {
     LoginPage loginpage = new LoginPage();
     ProductPage productPage = new ProductPage();
   @Test(description = "Test description from testNG")
   @Description("Test description from Allure")
    public void testloginWithValidCredentials(){

        getDriver().get(loginpage.login_page_url);
        loginpage.writeOnAElement(loginpage.username_input_field, "standard_user");
        loginpage.writeOnAElement(loginpage.password_input_field, "secret_sauce");
        loginpage.clickOnElement(loginpage.login_button);
        loginpage.takeScreenShot("Login with valid Credentials");

        assertEquals(getDriver().getCurrentUrl(), productPage.product_page_url);

    }

    @Test
    public void testloginWithInvalidPassword(){

        getDriver().get(loginpage.login_page_url);
        loginpage.writeOnAElement(loginpage.username_input_field, "standard_user");
        loginpage.writeOnAElement(loginpage.password_input_field, "secret_sauc");
        loginpage.clickOnElement(loginpage.login_button);
        loginpage.takeScreenShot("Unsuccessfull login");
        assertEquals(loginpage.getElementText(loginpage.error_msg_locator), loginpage.error_msg);

    }

   @Test
    public void testLoginWithInvalidUsername(){

        getDriver().get(loginpage.login_page_url);
        loginpage.writeOnAElement(loginpage.username_input_field,"standard_use");
        loginpage.writeOnAElement(loginpage.password_input_field, "secret_sauce");
       loginpage.clickOnElement(loginpage.login_button);
       loginpage.takeScreenShot("Login with valid Credentials");
       assertEquals(loginpage.getElementText(loginpage.error_msg_locator), loginpage.error_msg);


   }

    @Test(dataProvider = "invalidCredentials", dataProviderClass = DataSet.class)
    public void testLoginWithInvalidCredentials(String username, String password){
        getDriver().get(loginpage.login_page_url);
        loginpage.writeOnAElement(loginpage.username_input_field, username);
        loginpage.writeOnAElement(loginpage.password_input_field, password);
        loginpage.clickOnElement(loginpage.login_button);
        loginpage.takeScreenShot("Login with valid Credentials");
        assertEquals(loginpage.getElementText(loginpage.error_msg_locator), loginpage.error_msg);
    }

}
