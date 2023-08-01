package pages;
import com.sun.javafx.image.impl.ByteRgb;
import org.openqa.selenium.By;

public class CheckOutPage extends BasePage {
    public String checkout_page_url = "https://www.saucedemo.com/";
    public String checkout_pagee_urlty = "https://www.saucedemo.com/checkout-step-two.html";
    public By first_name_field = By.id("first-name");
    public By last_name_field = By.id("last-name");
    public By postal_code_field = By.id("postal-code");
    public By continue_btn = By.id("continue");
    public By finish_btn = By.id("finish");
    //public By filter = By.xpath("//input[@value='450']");


}


