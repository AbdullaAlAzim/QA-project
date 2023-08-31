package pages;

import org.openqa.selenium.By;

public class MyCartPage extends BasePage{

    public By cart_icon = By.xpath("//a[@id='js-cart-menu']//*[name()='svg']");
    public By place_order_button= By.xpath("//span[normalize-space()='Place Order']");

}
