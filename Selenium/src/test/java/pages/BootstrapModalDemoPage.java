package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BootstrapModalDemoPage
{
    WebDriver driver;
    public BootstrapModalDemoPage(WebDriver driver){this.driver = driver;}

    private final By MultipleLaunchModalButton = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a");
    private final By FirstWindowModalButton = By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/a");
    private final By SaveChangesButton = By.xpath("//*[@id='myModal2']/div/div/div[6]/a[2]");

    private final By FirstModalApperance = By.xpath("//*[@id=\"myModal\"]");
    private final By secondModalApperance = By.xpath("//*[@id=\"myModal2\"]");


public void launchButtonClick()
{
    driver.findElement(MultipleLaunchModalButton).click();

}
    public void CheckLaunchModalapperance()
    {
        Assert.assertEquals("modal fade in",driver.findElement(FirstModalApperance).
                getAttribute("class"),"Nie otwarto pierwszego okna");

    }

    public void SecondModalButtonClick()
    {
        driver.findElement(FirstWindowModalButton).click();

    }

    public void CheckSecondModalapperance()
    {
        Assert.assertEquals("modal fade rotate in",driver.findElement(secondModalApperance).
                getAttribute("class"),"Nie otwarto drugiego okna");

    }

    public void saveButtonClick()
    {
        driver.findElement(SaveChangesButton).click();

    }

    public void CheckPageRefresh()
    {
        Assert.assertEquals("modal fade",driver.findElement(FirstModalApperance).
                getAttribute("class"),"Nie odswiezono strony");

        Assert.assertEquals("modal fade rotate",driver.findElement(secondModalApperance).
                getAttribute("class"),"Nie odswiezono strony");

    }
}
