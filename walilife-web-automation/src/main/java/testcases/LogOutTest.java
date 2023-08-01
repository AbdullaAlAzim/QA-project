package testcases;

import org.testng.annotations.Test;
import pages.LogInPage;
import pages.LogOutPage;
import utilities.DriversSetup;

import static org.testng.Assert.assertEquals;

public class LogOutTest extends DriversSetup {
    LogInPage logInPage = new LogInPage();
    LogOutPage logOutPage = new LogOutPage();
    LogInTest logInTest = new LogInTest();


    @Test
    public void LogOutTest(){
        logInTest.LogInTest();
        logOutPage.clickOnElement(logOutPage.logOut);
        logOutPage.takeScreenShot("Successful Logout");
        assertEquals(logInPage.getElement(logInPage.myAccount).getText(),logInPage.logInMessage);
    }


}
