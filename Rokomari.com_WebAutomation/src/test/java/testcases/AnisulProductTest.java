package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnisulProductPage;
import pages.NavmanuPage;
import utilities.DriverSetup;

public class AnisulProductTest extends DriverSetup {
    AnisulProductPage anisulProductPage = new AnisulProductPage();
    NavmanuPage navmanuPage=new NavmanuPage();

    @Test
    public void categoryFiltering() throws InterruptedException {


        getDriver().get(anisulProductPage.anisulProduct_url);

        //navmanuPage.waitUntilElementVisible(navmanuPage.getElement(navmanuPage.popup_dailog));
        navmanuPage.clickElement(navmanuPage.popup_dailog);
        anisulProductPage.scrollToElement(anisulProductPage.getElement(anisulProductPage.somokalin_upo));

        anisulProductPage.waitUntilClickable((anisulProductPage.somokalin_upo));
        anisulProductPage.clickElement(anisulProductPage.somokalin_upo);

        anisulProductPage.scrollToElement(anisulProductPage.getElement(anisulProductPage.sisukishor_golpo));
        anisulProductPage.waitUntilClickable(anisulProductPage.sisukishor_golpo);
        anisulProductPage.clickElement(anisulProductPage.sisukishor_golpo);

        anisulProductPage.scrollToElement(anisulProductPage.getElement(anisulProductPage.romantic_upo));
        anisulProductPage.waitUntilClickable(anisulProductPage.romantic_upo);
        anisulProductPage.clickElement(anisulProductPage.romantic_upo);

        anisulProductPage.scrollToElement(anisulProductPage.getElement(anisulProductPage.second_page_navigate));
        anisulProductPage.waitUntilClickable(anisulProductPage.second_page_navigate);
        anisulProductPage.clickElement(anisulProductPage.second_page_navigate);

    }
    @Test
 public  void anisulProductAddToCart() throws InterruptedException {
        getDriver().navigate().to(anisulProductPage.anisulProduct_url);
        navmanuPage.clickElement(navmanuPage.popup_dailog);
        anisulProductPage.scrollToElement(anisulProductPage.getElement(anisulProductPage.rokte_aka_vor_Book));
        anisulProductPage.hoverElement(anisulProductPage.rokte_aka_vor_Book);
        anisulProductPage.clickOnButtonJs(anisulProductPage.rokte_aka_vor_Add_to_cart_button);



 }

}
