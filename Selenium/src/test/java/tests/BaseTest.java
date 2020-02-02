package tests;

import data.BaseData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Utils;

public class BaseTest {

    public static WebDriver driver;
    @BeforeClass
     protected void beforeClass()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        new Utils(driver);
        driver.manage().window().maximize();
        driver.get(BaseData.SELENIUM_EASY_BASE_URL);
    }
    @AfterClass
    protected void aftercalss()
    {
        driver.switchTo().window(driver.getWindowHandle()).close();
        driver.quit();

    }
}
