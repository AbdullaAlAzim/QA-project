package testcases;
import org.testng.annotations.Test;
import pages.*;
import utilities.DriverSetup;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.CartPage;
import static org.testng.AssertJUnit.assertEquals;

public class CheckOutTest extends DriverSetup {
    LoginPage loginpage = new LoginPage();
    CartPage cartPage  = new CartPage();
    ProductPage productPage = new ProductPage();
    CheckOutPage checkoutpage = new CheckOutPage();

    @Test
    public void checkoutpagedetails() throws InterruptedException {

        getDriver().get(loginpage.login_page_url);
        loginpage.writeOnAElement(loginpage.username_input_field, "standard_user");
        loginpage.writeOnAElement(loginpage.password_input_field, "secret_sauce");
        loginpage.clickOnElement(loginpage.login_button);
        productPage.clickOnElement(productPage.back_pack_add_to_cart_btn);
        productPage.clickOnElement(productPage.bike_light_add_to_cart_bike);
        assertEquals(productPage.getElementText(productPage.item_4_title_link),"Sauce Labs Backpack");
        Thread.sleep(5000);
        assertEquals(getDriver().getCurrentUrl(), productPage.product_page_url);

        getDriver().get(cartPage.cart_page_url);
        cartPage.clickOnElement(cartPage.remove_btn_id);
        cartPage.waitForElement(cartPage.checkout_btn);
        cartPage.clickOnElement(cartPage.checkout_btn);
        Thread.sleep(5000);
        checkoutpage.writeOnAElement(checkoutpage.first_name_field, "Russell");
        assertEquals(getDriver().findElement(checkoutpage.first_name_field).getAttribute("value"),"Russell");
        checkoutpage.writeOnAElement(checkoutpage.last_name_field, "Azim");
        assertEquals(getDriver().findElement(checkoutpage.last_name_field).getAttribute("value"),"Azim");
        checkoutpage.writeOnAElement(checkoutpage.postal_code_field, "450");
        assertEquals(getDriver().findElement(checkoutpage.postal_code_field).getAttribute("value"),"450");
        checkoutpage.clickOnElement(checkoutpage.continue_btn);
        Thread.sleep(5000);
        checkoutpage.clickOnElement(checkoutpage.finish_btn);

//      assertEquals(checkoutpage.getElementText(checkoutpage.first_name_field),"Russell");
//      assertEquals(checkoutpage.getElementText(checkoutpage.last_name_field),"Azim");
//      assertEquals(checkoutpage.getElementText(checkoutpage.postal_code_field),"1230");



    }
}


