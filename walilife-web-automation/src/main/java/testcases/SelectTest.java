package testcases;

import org.testng.annotations.Test;
import pages.LogInPage;
import pages.SelectPage;
import utilities.DriversSetup;

import static org.testng.Assert.assertEquals;

public class SelectTest extends DriversSetup {

    LogInPage logInPage = new LogInPage();
    SelectPage selectPage = new SelectPage();

//  Click Author from the menu
    @Test
    public void selectAuthorTest(){
        getDriver().get(logInPage.logInPageURL);
        selectPage.clickOnElement(selectPage.author);
        logInPage.takeScreenShot("Successful Select Author");
        assertEquals(selectPage.getElement(selectPage.authors).getText(),selectPage.authorsMessage);
    }

//  Select any Author
    @Test
    public void selectAnyAuthorTest(){
        selectAuthorTest();
        selectPage.clickOnElement(selectPage.anyAuthor);
        selectPage.takeScreenShot("Successful Select Any Author");
        assertEquals(selectPage.getElement(selectPage.anyAuthors).getText(),selectPage.anyAuthorsMessage);
    }

}
