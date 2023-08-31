package pages;

import org.openqa.selenium.By;

public class NavmanuPage extends BasePage {
    public String homepage_url= "https://www.rokomari.com";
    public By writer= By.xpath("//a[@id='js--authors']");
    public By anisul_haque = By.xpath("//a[contains(text(),'আনিসুল হক')]");
    //public By popup_dailog= By.xpath("(//button[@class='popup-modal__close-btn js--popup-modal__close-btn'])[2]");
    public By popup_dailog= By.xpath("//img[@alt='close']");
}
