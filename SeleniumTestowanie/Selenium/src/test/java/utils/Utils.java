package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
    static WebDriver driver;
    public Utils(WebDriver driver)//tworzenie instancji klasy - konstruktor
    {
        this.driver = driver;
    }

    public static void scrollElementIntoView(By by) throws InterruptedException {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(300);
    }
}
