package testcases;

import org.testng.annotations.Test;
import pages.ShippingPage;
import utilities.DriverSetup;


public class ShippingPageTest extends DriverSetup {
    ShippingPage shippingPage = new ShippingPage();
    @Test
    public void shippingPageWithValidCredential(){
        getDriver().navigate().to(shippingPage.shippping_url);
        shippingPage.clickElement(shippingPage.office_radio_button);
        shippingPage.sendText(shippingPage.name_text_filed,"Rashed");
        shippingPage.sendText(shippingPage.phone_text_filed,"01932111520");
        shippingPage.sendText(shippingPage.alternativePhone_text_filed,"01632111720");
        shippingPage.selectByVisibleText(shippingPage.country_selection,"Bangladesh");
        shippingPage.selectByIndex(shippingPage.city_selection,0);
        shippingPage.selectByIndex(shippingPage.area_selection,10);
        shippingPage.sendText(shippingPage.area_selection,"Nikunja-2, Khilkhet, Dhaka, Bangladesh");
        shippingPage.clickElement(shippingPage.cashOnDelivery_button);

    }


}
