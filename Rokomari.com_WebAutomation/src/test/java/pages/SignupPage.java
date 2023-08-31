package pages;

import org.openqa.selenium.By;

public class SignupPage extends BasePage {
    public String signup_url="https://www.rokomari.com/login";
    public By signin_button_click= By.xpath("//a[@class='logged-out-user-menu-btn btn btn-secondary']");
    public By signin_with_google_button = By.xpath("//button[@class='btn btn-social-google']");
    public By email_phone_field= By.xpath("//input[@id='identifierId']");
    public By pass_field= By.xpath("//input[@name='password'][@type='password']");
    public By next_button= By.xpath("//span[normalize-space()='Next']");



}
