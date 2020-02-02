package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BootstrappAlertPage {
    WebDriver driver;
    public BootstrappAlertPage(WebDriver driver){this.driver = driver;}
    private final By autoCloseableSuccessButton = By.xpath("//*[@id=\"autoclosable-btn-success\"]");
    private final By autoCloseableSuccessAlert = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]");

    private final By normalSuccessButton = By.xpath("//*[@id=\"normal-btn-success\"]");
    private final By normalSuccessAlert = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]");
    private final By normalSuccessCloseButton = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/button");
    long time = System.currentTimeMillis();

    public void autoCloseableSuccessButtonClick()
    {

        driver.findElement(autoCloseableSuccessButton).click();
        //System.out.println(String.format("Alert show after %d miliseconds", System.currentTimeMillis() - time));
    }

    public void autoCloseableSuccessShowAssertion()
    {
        Assert.assertEquals(true, driver.findElement(autoCloseableSuccessAlert).
            isDisplayed(),"AutoClose Alert nie zostal wyswietlony poprawnie");

    }

    public void autoCloseableSuccessCloseAssertion()
    {

        Assert.assertEquals(false, driver.findElement(autoCloseableSuccessAlert).
                isDisplayed(),"AutoClose alert nie zostal zamkniety poprawnie");
        //System.out.println(String.format("The message closed after %d miliseconds", System.currentTimeMillis() - time));
    }

    public void NormalSuccessButtonClick()
    {
        driver.findElement(normalSuccessButton).click();
    }

    public void NormalSuccessShowAssertion() throws InterruptedException
    {
        Assert.assertEquals(true, driver.findElement(normalSuccessAlert).
                isDisplayed(),"Alert nie zostal wyswietlony poprawnie");

    }

    public void NormalSuccessCloseButtonClick()
    {
        driver.findElement(normalSuccessCloseButton).click();
    }

    public void NormalSuccessCloseAssertion() throws InterruptedException
    {
        Assert.assertEquals(false, driver.findElement(normalSuccessAlert).
                isDisplayed(),"Alert nie zostal zamkniety");
    }
}
