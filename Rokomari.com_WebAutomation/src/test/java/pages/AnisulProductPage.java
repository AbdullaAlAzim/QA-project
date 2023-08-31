package pages;

import org.openqa.selenium.By;

public class AnisulProductPage extends BasePage {

    public String anisulProduct_url= "https://www.rokomari.com/book/author/50/anisul-hoque?ref=mm_p5";
    public By somokalin_upo= By.cssSelector("div[data-search-key='সমকালীন উপন্যাস Contemporary Novel ']");
    public By sisukishor_golpo= By.cssSelector("div[data-search-key='শিশু-কিশোর গল্প Story: Children and Teens']");
    public By romantic_upo= By.cssSelector("div[data-search-key='রোমান্টিক উপন্যাস Novel: Romance ']");
    public By second_page_navigate= By.xpath("//a[normalize-space()='2']");
    public By showing_text= By.xpath("//p[normalize-space()='(Showing 61 to 120 of 146 items)']");
    public By rokte_aka_vor_Book=By.xpath("//img[@alt='Rokte Aka Vor image']");

    public By rokte_aka_vor_Add_to_cart_button = By.xpath("//button[@class='btn cart-btn js--add-to-cart'][@product-id='218363']");


}
