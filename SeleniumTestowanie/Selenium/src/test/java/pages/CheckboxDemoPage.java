package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Utils;



public class CheckboxDemoPage {
    WebDriver driver;
    public CheckboxDemoPage(WebDriver driver){this.driver = driver;}
    private final By ClickOnCheckbox = By.xpath("//*[@id=\"isAgeSelected\"]");
    private final By CheckValueLabel = By.xpath("//*[@id=\"txtAge\"]");

    private final By showCheckAllButton = By.xpath("//*[@id=\"check1\"]");
    private final By checkBox1 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input");
    private final By checkBox2 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input");
    private final By checkBox3 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input");
    private final By checkBox4 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input");

    public void setFirstCheckboxClick()
    {
        driver.findElement(ClickOnCheckbox).click();

    }
    public void checkBoxMessage()
    {
        Assert.assertEquals(true, driver.findElement(CheckValueLabel).
                isDisplayed(), "Pierwsze pole nie zostalo zaznaczone");

    }

    public void setCheckAllButtonClick() throws InterruptedException
    {
        Utils.scrollElementIntoView(showCheckAllButton);
        driver.findElement(showCheckAllButton).click();

    }

    public void compareButtonText()
    {
        Assert.assertEquals("Uncheck All", driver.findElement(showCheckAllButton).
                getAttribute("value"), "Opcje w pierwszym panelu nie zostaly zaznaczone");

    }

    public void UncheckOneClick()  {
        driver.findElement(checkBox1).click();
        driver.findElement(checkBox2).click();
        driver.findElement(checkBox3).click();
        driver.findElement(checkBox4).click();
    }

    public void checkButtonText()
    {
        Assert.assertEquals("Check All", driver.findElement(showCheckAllButton).
                getAttribute("value"), "Opcje w drugim panelu nie zostaly zaznaczone");
    }

}