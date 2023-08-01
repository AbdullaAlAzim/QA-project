package pages;


import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    public By book = By.xpath("//span[text() ='বই']");
    public By books = By.xpath("//h1[contains(text(),'বই')]");
    public String booksMessage = "বই";
    public By bookSelect = By.xpath("//body/div[contains(@class,'body-wrapper')]/div[contains(@class,'wd-content')]/div[@id='template-wrapper']/div[@id='main-module-container']/div[@id='container']/div[@id='content']/div[@id='main']/div[@id='container-main']/div[contains(@class,'main-content')]/article[@id='post-23109']/div[contains(@class,'entry-content-post')]/div[contains(@class,'cls_results')]/div[contains(@class,'wdm_resultContainer')]/div[contains(@class,'wdm_results woocommerce')]/div[contains(@class,'results-by-facets')]/ul[contains(@class,'products')]/li[4]/div[1]/div[1]/a[1]");
    public By bookDetails = By.xpath("//h1[contains(text(),'দ্য পারফেক্ট ওয়াইফ')]");
    public String bookDetailsMessage = "দ্য পারফেক্ট ওয়াইফ";
    public By scrollDown = By.xpath("//div[@class='paginate_div']//li[14]//a[1]");
}
