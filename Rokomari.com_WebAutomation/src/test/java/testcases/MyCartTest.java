package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnisulProductPage;
import pages.MyCartPage;
import pages.ShippingPage;
import utilities.DriverSetup;

public class MyCartTest extends DriverSetup {

    AnisulProductPage anisulProductPage= new AnisulProductPage();
    MyCartPage myCartPage = new MyCartPage();
    ShippingPage shippingPage = new ShippingPage();

    @Test
    public void cartPageTest(){
        getDriver().navigate().to(anisulProductPage.anisulProduct_url);
        myCartPage.clickElement(myCartPage.cart_icon);
        myCartPage.clickElement(myCartPage.place_order_button);
        Assert.assertEquals(getDriver().getCurrentUrl(),shippingPage.shippping_url);

    }

}
