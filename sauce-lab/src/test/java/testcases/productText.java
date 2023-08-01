package testcases;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;
import utilities.DriverSetup;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class productText extends DriverSetup {
    LoginPage loginpage = new LoginPage();
    ProductPage productPage = new ProductPage();

    LoginText loginText = new LoginText();
    @Test
    public void productdescription() throws InterruptedException {
          loginText.testloginWithValidCredentials();
//        getDriver().get(loginpage.login_page_url);
//        loginpage.writeOnAElement(loginpage.username_input_field, "standard_user");
//        loginpage.writeOnAElement(loginpage.password_input_field, "secret_sauce");
//        loginpage.clickOnElement(loginpage.login_button);

        productPage.clickOnElement(productPage.back_pack_add_to_cart_btn);
        productPage.clickOnElement(productPage.bike_light_add_to_cart_bike);
        Thread.sleep(5000);
        //productPage.clickOnElement(productPage.product_sort_container);
        //Thread.sleep(5000);

        assertEquals(productPage.getElementText(productPage.item_4_title_link),"Sauce Labs Backpack");
        assertEquals(productPage.getElementText(productPage.inventory_item_desc),"carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
        assertEquals(productPage.getElementText(productPage.remove_backpack),"Remove");
        assertEquals(productPage.getElementText(productPage.inventory_item_price),"$29.99");
        //assertEquals(productPage.getElementText(productPage.inventory_imagee),  "https://www.saucedemo.com/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg");

        System.out.println(productPage.getElementText(productPage.remove_backpack));
        System.out.println(productPage.getElementText(productPage.item_4_title_link));
        System.out.println(productPage.getElementText(productPage.inventory_item_desc));
        System.out.println(productPage.getElementText(productPage.inventory_item_price));

    }

    @Test
    public void productFilterTest() throws InterruptedException {
        getDriver().get(loginpage.login_page_url);
        loginpage.writeOnAElement(loginpage.username_input_field, "standard_user");
        loginpage.writeOnAElement(loginpage.password_input_field, "secret_sauce");
        loginpage.clickOnElement(loginpage.login_button);

//        Thread.sleep(3000);
//        WebElement filter = getDriver().findElement(productPage.filter);
//        Select selectFilter = new Select(filter);
//        selectFilter.selectByIndex(2);
//        filter = getDriver().findElement(productPage.filter);
//         selectFilter = new Select(filter);
//        Thread.sleep(5000);
//          assertEquals(selectFilter.getFirstSelectedOption().getText(),"Price (low to high)");
//        Thread.sleep(5000);
          productPage.selectItemByIndex(productPage.getElement(productPage.filter), 1);
         assertEquals(productPage.getElementText(productPage.xpathproduct), "Name (Z to A)");
         System.out.println("result:"+ (productPage.getElementText(productPage.xpathproduct)));
         Thread.sleep(5000);
    }

    @Test
    public void testFakeDataCreate(){

        System.out.println(productPage.emailGenerate());
        System.out.println(productPage.firstNameGenerate());
        System.out.println(productPage.lastNameGenerate());
    }
}
