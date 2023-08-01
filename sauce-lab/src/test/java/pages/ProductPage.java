package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    public String product_page_title = "Swag Labs";
    public String product_page_url = "https://www.saucedemo.com/inventory.html";
    public By back_pack_add_to_cart_btn = By.id("add-to-cart-sauce-labs-backpack");
    public By bike_light_add_to_cart_bike = By.id("add-to-cart-sauce-labs-bike-light");
    public By item_4_title_link = By.id("item_4_title_link");
    public By inventory_item_desc = By.className("inventory_item_desc");
    public By remove_backpack = By.id("remove-sauce-labs-backpack");
    public By inventory_item_price = By.className("inventory_item_price");
    public By product_sort_container = By.className("product_sort_container");

    public By filter = By.className("product_sort_container");
    public By xpathproduct = By.xpath("//option[@value='za']");



}
