package testcases;

import org.testng.annotations.Test;
import pages.LogInPage;
import utilities.DriversSetup;

import static org.testng.Assert.assertEquals;

public class LogInTest extends DriversSetup {
    LogInPage logInPage = new LogInPage();

    @Test
    public void RegisterTest(){
        getDriver().get(logInPage.logInPageURL);
        getDriver().get(logInPage.registerPageURL);
        logInPage.writeByOnLocator(logInPage.regName, "Azim");
        assertEquals(logInPage.getElement(logInPage.regName).getAttribute("value"),"Azim");
        logInPage.writeByOnLocator(logInPage.regPhone, "01621858132");
        assertEquals(logInPage.getElement(logInPage.regPhone).getAttribute("value"),"01621858132");
        logInPage.writeByOnLocator(logInPage.regEmail, "azim@jmail.com");
        assertEquals(logInPage.getElement(logInPage.regEmail).getAttribute("value"),"azim@jmail.com");
        logInPage.writeByOnLocator(logInPage.regPasswordord, "123456");
        assertEquals(logInPage.getElement(logInPage.regPasswordord).getAttribute("value"),"123456");
        logInPage.writeByOnLocator(logInPage.regConfirmPassword, "123456");
        assertEquals(logInPage.getElement(logInPage.regConfirmPassword).getAttribute("value"),"123456");
        logInPage.clickOnElement(logInPage.register);
        logInPage.takeScreenShot("Successful Register");
        assertEquals(logInPage.getElement(logInPage.myAccount).getText(),logInPage.logInMessage);
    }

    @Test
    public void LogInTest(){
        getDriver().get(logInPage.logInPageURL);
        getDriver().get(logInPage.registerPageURL);
        logInPage.writeByOnLocator(logInPage.userName, "azim@gmail.com");
        assertEquals(logInPage.getElement(logInPage.userName).getAttribute("value"),"azim@gmail.com");
        logInPage.writeByOnLocator(logInPage.passWord, "123456");
        assertEquals(logInPage.getElement(logInPage.passWord).getAttribute("value"),"123456");
        logInPage.clickOnElement(logInPage.logIn);
        logInPage.takeScreenShot("Successful Login");
        assertEquals(logInPage.getElement(logInPage.myAccount).getText(),logInPage.logInMessage);
    }


}
