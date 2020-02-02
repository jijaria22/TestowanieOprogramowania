package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JQueryProgressBar {
    WebDriver driver;
    public JQueryProgressBar(WebDriver driver){this.driver = driver;}

    private final By downloadButton = By.xpath("//*[@id=\"downloadButton\"]");
    private final By closeButton = By.xpath("/html/body/div[3]/div[3]/div/button");
    private final By progressLabel = By.xpath("//*[@id='dialog']/div[1]");


    public void downloadButtonClick()
    {
        driver.findElement(downloadButton).click();
    }

    public void progressLabelAssertion() throws InterruptedException {


        Assert.assertEquals("Complete!", driver.findElement(progressLabel).
                getText(), "Pobieranie nie zostalo ukonczone po 15 sekundach");
        Assert.assertEquals("Close", driver.findElement(closeButton).
                getText(), "Przycisk Close nie wyswietlil sie");

    }
    public void closeButtonClick()
    {
        driver.findElement(closeButton).click();
    }
    public void checkButtonTag()
    {
        Assert.assertEquals("Cancel Download", driver.findElement(closeButton).
                getText(), "Przycisk cancel donload nie wyswietlil sie");
    }


}
