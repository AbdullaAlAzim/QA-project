package pages;


import org.openqa.selenium.By;

public class ShippingPage extends BasePage{

    public By billingState = By.xpath("//select[contains(@id,'billing_state')]");
    public By billingZone = By.xpath("//select[@id='billing_area']//option[@value='466'][contains(text(),'ময়মনসিংহ সদর')]");
    public By billingArea = By.xpath("//select[contains(@id,'billing_area')]");
    public By billingAddress = By.id("billing_address_1");
    public By placeOrder = By.xpath("//button[@id='place_order']");
    public  By thankYou = By.xpath("//p[contains(text(),'আপনাকে ধন্যবাদ। আপনার অর্ডার পেয়েছি।')]");
    public  String thankyouMessage = ("আপনাকে ধন্যবাদ। আপনার অর্ডার পেয়েছি।");

}
