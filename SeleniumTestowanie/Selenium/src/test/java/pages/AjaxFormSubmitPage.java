package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AjaxFormSubmitPage {
    WebDriver driver;
    public AjaxFormSubmitPage(WebDriver driver){this.driver = driver;}

    private final By NameInput = By.xpath("//*[@id=\"title\"]");
    private final By CommentInput = By.xpath("//*[@id=\"description\"]");
    private final By SubmitButton = By.xpath("//*[@id=\"btn-submit\"]");
    private final By ProgressLabel = By.xpath("//*[@id=\"submit-control\"]");

    public void NampeInputData()
    {
        driver.findElement(NameInput).sendKeys("Adam Nowak");
    }

    public void CommentInput()
    {
        driver.findElement(CommentInput).sendKeys("Testowanie oprogramowania");
    }

    public void SubmitButtonClick()
    {
        driver.findElement(SubmitButton).click();
    }

    public void ProgressLabelCheck() throws InterruptedException {
        Boolean newElement = new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(SubmitButton));
        if(newElement == true)
        {
            Assert.assertEquals("Ajax Request is Processing!", driver.findElement(ProgressLabel).
                    getText(), "Nie polaczono z serverem");
            //System.out.println(driver.findElement(ProgressLabel).getText());
            Thread.sleep(2000);

            Assert.assertEquals("Form submited Successfully!", driver.findElement(ProgressLabel).
                    getText(), "Danenie zostaly wprowadzone poprawnie");
            //System.out.println(driver.findElement(ProgressLabel).getText());

        }

    }






}
