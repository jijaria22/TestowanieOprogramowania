package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Utils;

public class DropDownListPage {
    WebDriver driver;
    public DropDownListPage(WebDriver driver){this.driver = driver;}

    private final By FirstForm = By.xpath("//select[@id='select-demo']");
    private final By FirstFormElement = By.xpath("//*[@id=\"select-demo\"]/option[4]");
    private final By FirstFormLabel = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]");

    private final By MultiSelectList = By.xpath("//*[@id=\"multi-select\"]");
    private final By GetAllSelectedButton = By.xpath("//*[@id='printAll']");
    private final By GetAllSelectedLabel = By.xpath("//p[@class='getall-selected']");

    private final By FirstValue = By.xpath("//select[@id='multi-select']//option[@value='California']");
    private final By SecondValue = By.xpath("//select[@id='multi-select']//option[@value='Ohio']");
    private final By ThirdValue = By.xpath("//select[@id='multi-select']//option[@value='Washington']");


    public void setDropDownListElementClick()
    {
        driver.findElement(FirstForm).click();
        driver.findElement(FirstFormElement).click();

    }
    public void checkValidationMessage()
    {
        Assert.assertEquals("Day selected :- Tuesday", driver.findElement(FirstFormLabel).
                getText(), "Wiadomość nie zostala wyswietlona");

    }

    public void setListElementAndButtonClick() throws InterruptedException
    {
        Utils.scrollElementIntoView(MultiSelectList);

        WebElement california = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(FirstValue));
        WebElement ohio = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(SecondValue));
        WebElement washington = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(ThirdValue));

        new Actions(driver).moveToElement(california).click().build().perform();
        new Actions(driver).keyDown(Keys.CONTROL).click(ohio).keyUp(Keys.CONTROL).build().perform();
        new Actions(driver).keyDown(Keys.CONTROL).click(washington).keyUp(Keys.CONTROL).build().perform();

        driver.findElement(GetAllSelectedButton).click();
        //System.out.println(driver.findElement((By.xpath("//p[@class='getall-selected']"))).getText());
    }

    public void checkSecondValidationMessage()
    {
        Assert.assertEquals("Options selected are : California,Ohio,Washington", driver.findElement(GetAllSelectedLabel).
                getText(), "Wiadomosc nie zostala wyswietlona poprawnie");

    }

}
