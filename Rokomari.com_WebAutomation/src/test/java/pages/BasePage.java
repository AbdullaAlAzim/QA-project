package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverSetup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static utilities.DriverSetup.getDriver;

public class BasePage {

    private WebDriverWait wait;

    public WebElement getElement(By locator){
         return getDriver().findElement(locator);
    }

    public void clickElement(By locator){
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();

    }

    public void sendText(By locator,String Text){
        getElement(locator).clear();
        getElement(locator).sendKeys(Text);}

    public void selectByIndex(By locator,int index){

        Select select = new Select(getElement(locator));
        select.selectByIndex(index);

    }
    public void selectByVisibleText(By locator, String optionText) {
        Select dropdown = new Select(getElement(locator));
        dropdown.selectByVisibleText(optionText);
    }

    public  String getElementText(By locator){ return getElement(locator).getText();}

    public String currentPageUrl(By locator){return getDriver().getCurrentUrl();}

    public void hoverElement(By locator){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getElement(locator)).build().perform();
    }


    public List<String> windowHandling() {
        // Get all window handles and hold them in a list.
        Set<String> windowHandles = getDriver().getWindowHandles(); // driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandles);

        // Write to total window handle number to the console.
        @SuppressWarnings("unused")
        int size = windowHandlesList.size();
        return windowHandlesList;
    }

    public void waitForElement(By locator) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitUntilClickable(By locator) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void waitVisibilityOfElementLocated(By locator) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public void waitUntilElementVisible(WebElement element) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void clickOnButtonJs(By element){
        WebElement button = getElement(element);
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("arguments[0].click();", button);
    }

    public void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
