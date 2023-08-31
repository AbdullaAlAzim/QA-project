package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavmanuPage;
import pages.SignupPage;
import utilities.DataSet;
import utilities.DriverSetup;

import static org.testng.Assert.assertEquals;

public class SignupTest extends DriverSetup {
    SignupPage signupPage = new SignupPage();
    NavmanuPage homePage = new NavmanuPage();


    @Test(dataProvider = "validCredentials", dataProviderClass = DataSet.class)
    public void signupWithValidCredential(String username, String password) {
        getDriver().get(homePage.homepage_url);
        signupPage.clickElement(signupPage.signin_button_click);
        signupPage.clickElement(signupPage.signin_with_google_button);

        signupPage.sendText(signupPage.email_phone_field,username);
        signupPage.clickElement(signupPage.next_button);
        signupPage.waitVisibilityOfElementLocated(signupPage.pass_field);
        signupPage.sendText(signupPage.pass_field,password);
        signupPage.clickElement(signupPage.next_button);
        Assert.assertEquals(getDriver().getCurrentUrl(),homePage.homepage_url);


    }


    @Test(dataProvider = "invalidCredentials", dataProviderClass = DataSet.class)
    public void testLoginWithInvalidCredentials(String username, String password){
        getDriver().get(homePage.homepage_url);
        signupPage.clickElement(signupPage.signin_button_click);
        signupPage.clickElement(signupPage.signin_with_google_button);
//        String parentWindow = getDriver().getWindowHandle();
//        for (String windowHandle : getDriver().getWindowHandles()) {
//            if (!windowHandle.equals(parentWindow)) {
//                getDriver().switchTo().window(windowHandle);
//                break;
//            }
//        }
        signupPage.sendText(signupPage.email_phone_field,username);
        signupPage.clickElement(signupPage.next_button);
        signupPage.waitVisibilityOfElementLocated(signupPage.pass_field);
        signupPage.sendText(signupPage.pass_field,password);
        signupPage.clickElement(signupPage.next_button);
//        getDriver().switchTo().window(parentWindow);

        Assert.assertEquals(getDriver().getCurrentUrl(),homePage.homepage_url);

    }
}
