package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class SimpleFormDataPage {
    WebDriver driver;
    public SimpleFormDataPage(WebDriver driver){this.driver = driver;}
    private final By userMessageInput = By.xpath("//*[@id=\"user-message\"]");
    private final By showMessageButton = By.xpath("//*[@id=\"get-input\"]/button");
    private final By checkValidationMessageLabel = By.xpath("//*[@id=\"display\"]");
    private final By firstSumInput = By.xpath("//*[@id=\"sum1\"]");
    private final By secondSumInput = By.xpath("//*[@id=\"sum2\"]");
    private final By getTotalButton = By.xpath("//*[@id=\"gettotal\"]/button");
    private final By DisplayValueLabel = By.xpath("//*[@id=\"displayvalue\"]");

    public void fillUserMessage()
    {
        driver.findElement(userMessageInput).sendKeys("Sprawdzam mozliwosc dodania wiadomosci");
    }

    public void setShowMessageButtonClick()
    {
        driver.findElement(showMessageButton).click();

    }
    public void checkValidationMessage()
    {
        Assert.assertEquals("Sprawdzam mozliwosc dodania wiadomosci", driver.findElement(checkValidationMessageLabel).
                getText(), "Wiadomość nie zostala wyswietlona");

    }
    public void getCalculation()
    {
        driver.findElement(firstSumInput).sendKeys("4");
        driver.findElement(secondSumInput).sendKeys("3");
        driver.findElement(getTotalButton).click();
        driver.findElement(DisplayValueLabel).click();
        Assert.assertEquals("7", driver.findElement(DisplayValueLabel).getText(),"Kalkulacja wykonana blednie");


    }


}

