package pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasePage{
    public String shippping_url="https://www.rokomari.com/shipping?isgift=0";
    public By home_radio_button = By.xpath("//label[@class='focus'][normalize-space()='Home']");
    public By office_radio_button = By.xpath("///label[@class='focus'][normalize-space()='Office']");

    public By name_text_filed= By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By phone_text_filed= By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By alternativePhone_text_filed= By.xpath("//fieldset[@class='group']//input[@id='phone2']");
    public By country_selection= By.xpath("//select[@id='js--country']");
    public By city_selection= By.xpath("//select[@id='js--city']");
    public By area_selection= By.xpath("//select[@id='js--area']");
    public By address_textarea_field= By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
    public By cashOnDelivery_button= By.xpath("//label[@for='cod']");
    public By confirm_order=By.xpath("//span[normalize-space()='Confirm Order']");

}
