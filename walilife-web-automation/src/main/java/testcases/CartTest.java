package testcases;

import org.testng.annotations.Test;
import pages.*;
import utilities.DriversSetup;

import static org.testng.Assert.assertEquals;

public class CartTest extends DriversSetup {
    CartPage cartPage = new CartPage();
    ProductTest productTest = new ProductTest();

    @Test
    public void cartTest(){
        productTest.productDetailTest();
        cartPage.clickOnElement(cartPage.preOrder);
        cartPage.clickOnElement(cartPage.cart);
        cartPage.clickOnElement(cartPage.order);
        cartPage.takeScreenShot("Successful Cart");
        assertEquals(cartPage.getElement(cartPage.checkOut).getText(),cartPage.checkOutMessage);
    }

}
