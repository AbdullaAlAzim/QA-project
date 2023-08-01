package pages;


import org.openqa.selenium.By;

public class CartPage extends BasePage{

   public By cart = By.xpath("//a[@title='View your shopping cart']//i[@class='fa fa-shopping-cart']");
   public By preOrder = By.xpath("//button[contains(text(),'প্রি-অর্ডার করুন')]");
   public By order = By.xpath("//a[@class='button checkout wc-forward']");
   public By checkOut = By.xpath("//td[@class='product-name']");
   public String checkOutMessage = "দ্য পারফেক্ট ওয়াইফ × 1";

}
