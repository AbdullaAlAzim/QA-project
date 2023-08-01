package pages;


import org.openqa.selenium.By;

public class SelectPage extends BasePage{

    public By author = By.xpath("//span[text() ='লেখক']");
    public By authors = By.xpath("//h1[contains(text(),'লেখক')]");
    public String authorsMessage = "লেখক";
    public By anyAuthor = By.xpath("//h3[contains(text(),'Dr. Muhammad Moniuzzaman')]");
    public By anyAuthors = By.xpath("//h1[@class='heading-title page-title']");
    public String anyAuthorsMessage = " DR. MUHAMMAD MONIUZZAMAN";

}
