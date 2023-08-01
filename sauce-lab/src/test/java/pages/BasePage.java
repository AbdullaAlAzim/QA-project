package pages;

import com.github.javafaker.Faker;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.Locale;

import static utilities.DriverSetup.getDriver;

public class BasePage {

   public WebElement getElement(By locator){
      return getDriver().findElement(locator);
   }

   public void clickOnElement(By locator){
       getElement(locator).click();
   }
   public void writeOnAElement(By locator, String text){
       getElement(locator).clear();
       getElement(locator).sendKeys(text);

   }
   public String getElementText(By locator){
       return getElement(locator).getText();

   }

   public String getCurrentPage(){
       return getDriver().getCurrentUrl();
   }

    /****************************
     * Faker Related Task *
     ****************************
     */

    static Faker faker = new Faker(new Locale("en-US"));

    public String emailGenerate() {
        return faker.bothify("????##@mail.com");
    }

    public String firstNameGenerate() {
        return faker.name().firstName();
    }

    public String lastNameGenerate() {
        return faker.name().lastName();
    }

    public String phoneNumberGenerate() {
        return faker.numerify("###-###-####");
    }

    public String passwordGenerate() {
        return faker.animal().name();
    }

    public void takeScreenShot(String name){

        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)(getDriver())).getScreenshotAs(OutputType.BYTES)));

    }


    /************************************************
     * Handle Select Tag Related Element Task *
     *
     * @param element locator of Select tag *
     * @param value   attribute value of option tag *
     ************************************************
     */

    public void selectItemByValue(WebElement element, String value) {
        Select selectItems = new Select(element);
        selectItems.selectByValue(value);
    }

    public void selectItemByVisibleText(WebElement element, String value) {
        Select selectItems = new Select(element);
        selectItems.selectByVisibleText(value);
    }

    public void selectItemByIndex(WebElement element, int index) {
        Select selectItems = new Select(element);
        selectItems.selectByIndex(index);
    }


    public void waitForElement(By element) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }



}
