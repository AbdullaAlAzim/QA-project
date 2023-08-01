package pages;

import org.openqa.selenium.By;

public class CartPage  extends BasePage {
    public By checkout_btn = By.id("checkout");
    public By cart_page_title = By.className("title");
    public String cart_page_url = ("https://www.saucedemo.com/cart.html");
    public By remove_btn_id = By.id("remove-sauce-labs-backpack");



}
