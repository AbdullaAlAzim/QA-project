package testcases;

import org.testng.annotations.Test;
import pages.LogInPage;
import pages.ProductPage;
import utilities.DriversSetup;

import static org.testng.Assert.assertEquals;

public class ProductTest extends DriversSetup {
    LogInPage logInPage = new LogInPage();
    ProductPage productPage = new ProductPage();

//  Scroll Down and go to the Next Page
    @Test
    public void productNetPageTest() throws InterruptedException {
        getDriver().get(logInPage.logInPageURL);
        productPage.clickOnElement(productPage.book);
        assertEquals(productPage.getElement(productPage.books).getText(),productPage.booksMessage);
        productPage.clickOnElement(productPage.scrollDown);
        Thread.sleep(3000);
        logInPage.takeScreenShot("Successful Product Next Page");
        assertEquals(productPage.getElement(productPage.books).getText(),productPage.booksMessage);
    }

//  View any Book Details
    @Test
    public void productDetailTest(){
        getDriver().get(logInPage.logInPageURL);
        productPage.clickOnElement(productPage.book);
        assertEquals(productPage.getElement(productPage.books).getText(),productPage.booksMessage);
        productPage.clickOnElement(productPage.bookSelect);
        productPage.takeScreenShot("Successful Product Details");
        assertEquals(productPage.getElement(productPage.bookDetails).getText(),productPage.bookDetailsMessage);
    }




}
