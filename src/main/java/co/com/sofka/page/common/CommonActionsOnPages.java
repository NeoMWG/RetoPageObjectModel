package co.com.sofka.page.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActionsOnPages {

    private WebDriver driver;
    private final WebDriverWait wait;


    //CONSTRUCTOR

    public CommonActionsOnPages(WebDriver driver, int waitTime) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, waitTime);
    }


    //ALL FUNTIONS

    protected void typeInto(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    protected void clearText(By locator) {
        driver.findElement(locator).clear();
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void pressEnter(By locator) {
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    protected void pressRightArrow(By locator) {
        driver.findElement(locator).sendKeys(Keys.ARROW_RIGHT);
    }

    protected void pressDownArrow(By locator) {
        driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
    }

    protected void pressSpaceKey(By locator) {
        driver.findElement(locator).sendKeys(Keys.SPACE);
    }

    //WAITS

    protected void waitClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void waitUntil(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    //SCROLLS

    protected void scrollTo(By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));
    }

    protected void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    protected void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
    }


}
