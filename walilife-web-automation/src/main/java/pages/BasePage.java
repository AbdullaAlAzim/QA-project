package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.ByteArrayInputStream;

import static utilities.DriversSetup.getDriver;

public class BasePage {

    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }
    public void writeByOnLocator(By locator, String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }
    public void selectItemByIndex(WebElement element, int index) {
        Select selectItems = new Select(element);
        selectItems.selectByIndex(index);
    }
    public void selectItemByVisibleText(WebElement element, String value) {
        Select selectItems = new Select(element);
        selectItems.selectByVisibleText(value);
    }
    public void takeScreenShot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)(getDriver())).getScreenshotAs(OutputType.BYTES)));
    }

}

