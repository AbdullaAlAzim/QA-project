import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class AnyTest extends DriverSetup {
    @Test
    public void ProductpageTravel() throws InterruptedException {
        getDriver().get("https://www.rokomari.com");
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//img[@alt='close']")).click();
        WebElement writer = getDriver().findElement(By.xpath("//a[@id='js--authors']"));
        //Hover working here
        Actions actions = new Actions(getDriver());
        actions.clickAndHold(writer).build().perform();

        getDriver().findElement(By.xpath("//a[contains(text(),'আনিসুল হক')]")).click();

    }



        @Test
        public void AddToCart(){


     // Navigate to the product page
        getDriver().get("https://www.rokomari.com/book/author/50/anisul-hoque?ref=mm_p5");

     // Locate the image element to hover over
     WebElement imageElement = getDriver().findElement(By.xpath("//img[@class='product-image']"));

     // Create an instance of Actions class
     Actions actions = new Actions(getDriver());

     // Perform a hover action on the image element
                actions.moveToElement(imageElement).

     perform();

     // Locate and click the "Add to Cart" button
     WebElement addToCartButton = getDriver().findElement(By.xpath("//button[contains(text(), 'Add to Cart')]"));
                addToCartButton.click();

     // Wait for the cart to update (you can add explicit waits here)

     // Verify if the product is added to the cart by checking for a success message or cart quantity update
     WebElement cartQuantity = getDriver().findElement(By.xpath("//span[@class='js-minicart-qty']"));
                if(cartQuantity.isDisplayed())

     {
         System.out.println("Product added to cart successfully!");
         System.out.println("Cart Quantity: " + cartQuantity.getText());
     } else

     {
         System.out.println("Failed to add the product to cart.");
     }


 }}

