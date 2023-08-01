package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.DriverSetup;

import static org.testng.AssertJUnit.assertEquals;

public class CartTest extends DriverSetup {
    LoginPage loginpage = new LoginPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage  = new CartPage();
    @Test
    public void cartpagedetails() throws InterruptedException {

        getDriver().get(loginpage.login_page_url);
        loginpage.writeOnAElement(loginpage.username_input_field, "standard_user");
        loginpage.writeOnAElement(loginpage.password_input_field, "secret_sauce");
        loginpage.clickOnElement(loginpage.login_button);
        productPage.clickOnElement(productPage.back_pack_add_to_cart_btn);
        productPage.clickOnElement(productPage.bike_light_add_to_cart_bike);
        Thread.sleep(5000);
        getDriver().get(cartPage.cart_page_url);
        cartPage.clickOnElement(cartPage.remove_btn_id);
        Thread.sleep(5000);

        //all assert
        assertEquals(cartPage.getElementText(cartPage.cart_page_title),"Your Cart");
        System.out.println(cartPage.getElementText(cartPage.cart_page_title));







    }




}
