package pages;


import org.openqa.selenium.By;

public class LogInPage extends BasePage{
    public String logInPageURL = "https://www.wafilife.com/";
    public String registerPageURL = "https://www.wafilife.com/my-account/";
    public By regName = By.id("reg_billing_first_name");
    public By regPhone = By.id("reg_billing_phone");
    public By regEmail = By.id("reg_email");
    public By regPasswordord = By.id("reg_password");
    public By regConfirmPassword = By.id("reg_confirm_password");
    public By myAccount = By.xpath("//h1[contains(text(),'আমার অ্যাকাউন্ট')]");
    public String logInMessage = "আমার অ্যাকাউন্ট";
    public By register = By.xpath("//input[contains(@value, 'রেজিস্টার')]");
    public By userName = By.id("username");
    public By passWord = By.id("password");
    public By logIn = By.cssSelector("input[value='লগইন']");
}
