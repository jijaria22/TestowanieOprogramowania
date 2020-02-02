package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Utils;



public class RadiobuttonDemoPage {

    WebDriver driver;
    public RadiobuttonDemoPage(WebDriver driver){this.driver = driver;}

    private final By maleRadioButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input");
    private final By getCheckedValueButton = By.xpath("//button[@id='buttoncheck']");
    private final By checkLabelValue = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]");

    private final By femaleRadioButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input");
    private final By AgeRadioButton515 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input");
    private final By GetValuesButton = By.xpath("//button[text()='Get values']");
    private final By checkLabel1Value = By.xpath("//p[@class='groupradiobutton'][1]");





    public void setMaleRadioButtonClick()
    {
        driver.findElement(maleRadioButton).click();
        driver.findElement(getCheckedValueButton).click();
    }

    public void checkAssertion()
    {
        Assert.assertEquals("Radio button 'Male' is checked", driver.findElement(checkLabelValue).
                getText(), "Pierwszy radiobutton nie zostal zaznaczony");

    }

    public void setSexAndAgeRadioButtonClick() throws InterruptedException
    {
        Utils.scrollElementIntoView(femaleRadioButton);

        driver.findElement(femaleRadioButton).click();
        driver.findElement(AgeRadioButton515).click();
        driver.findElement(GetValuesButton).click();
    }

    public void checkDoubleAssertion()
    {
        Assert.assertEquals("Sex : Female\n" + "Age group: 5 - 15", driver.findElement(checkLabel1Value).
                getText(), "Plec lub wiek nie zostaly zaznaczone'");

    }





}

