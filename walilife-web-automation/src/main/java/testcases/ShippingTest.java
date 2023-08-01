package testcases;

import org.testng.annotations.Test;
import pages.*;
import utilities.DriversSetup;

import static org.testng.Assert.assertEquals;

public class ShippingTest extends DriversSetup {
    CartPage cartPage = new CartPage();
    ShippingPage shippingPage = new ShippingPage();
    LogInTest logInTest = new LogInTest();
    CartTest cartTest = new CartTest();
    ProductTest productTest =new ProductTest();


//    Provide all Information of  আপনার বিলিং এবং শিপিং তথ্য
    @Test
    public void shippingTest() throws InterruptedException {
        logInTest.LogInTest();
        productTest.productDetailTest();
        cartPage.clickOnElement(cartPage.preOrder);
        cartPage.clickOnElement(cartPage.cart);
        cartPage.clickOnElement(cartPage.order);
        assertEquals(cartPage.getElement(cartPage.checkOut).getText(),cartPage.checkOutMessage);
        shippingPage.selectItemByVisibleText(shippingPage.getElement(shippingPage.billingState), "Mymensingh");
        Thread.sleep(3000);
        shippingPage.selectItemByIndex(shippingPage.getElement(shippingPage.billingArea), 12);
        assertEquals(shippingPage.getElement(shippingPage.billingZone).getText(),"ময়মনসিংহ সদর");
        shippingPage.writeByOnLocator(shippingPage.billingAddress, "bau");
        assertEquals(getDriver().findElement(shippingPage.billingAddress).getAttribute("value"),"bau");
        shippingPage.clickOnElement(shippingPage.placeOrder);
        shippingPage.takeScreenShot("Successful Register");
        assertEquals(shippingPage.getElement(shippingPage.thankYou).getText(),shippingPage.thankyouMessage);
        Thread.sleep(5000);

    }

}
