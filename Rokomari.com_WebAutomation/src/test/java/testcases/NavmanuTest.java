package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnisulProductPage;
import pages.NavmanuPage;
import utilities.DriverSetup;

public class NavmanuTest extends DriverSetup {
    NavmanuPage navmanuPage = new NavmanuPage();
    AnisulProductPage anisulProductPage = new AnisulProductPage();

    @Test
    public void navigateAnisulPage()  {
        getDriver().get(navmanuPage.homepage_url);
        navmanuPage.waitUntilElementVisible((navmanuPage.getElement(navmanuPage.popup_dailog)));

        navmanuPage.clickElement(navmanuPage.popup_dailog);
        navmanuPage.hoverElement(navmanuPage.writer);
        navmanuPage.clickElement(navmanuPage.anisul_haque);

        Assert.assertEquals(getDriver().getCurrentUrl(), anisulProductPage.anisulProduct_url);
    }


}
