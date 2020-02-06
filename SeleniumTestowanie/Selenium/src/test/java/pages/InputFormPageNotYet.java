package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Utils;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputFormPageNotYet {
    WebDriver driver;
    public InputFormPageNotYet(WebDriver driver){this.driver = driver;}

    private final By FirstNameLabel =By.xpath("//*[@id='contact_form']/fieldset/div[1]/div/div/input");
    private final By LastNameLabel = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input");
    private final By EmailLabel = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input");
    private final By PhoneLabel = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input");
    private final By AdressLabel = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input");
    private final By CityLabel = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input");
    private final By StateList = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select");
    private final By StateListElement = By.xpath("//*[@id='contact_form']/fieldset/div[7]/div/div/select/option[43]");
    private final By ZipCodeLabel = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input");
    private final By WebsiteLabel = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[9]/div/div/input");
    private final By HostingRadio = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[2]/label/input");
    private final By ProjectDescription = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea");
    private final By SendButton = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button");


    public void StateClick()
    {
        driver.findElement(StateList).click();
        driver.findElement(StateListElement).click();
    }

    public void RadioClick()
    {
        driver.findElement(HostingRadio).click();

    }
    public void setShowMessageButtonClick()
    {
        driver.findElement(HostingRadio).click();
        driver.findElement(SendButton).click();

    }

    public void NameValidation()
    {
        String firstName = "Adam";
        Pattern pattern = Pattern.compile("[a-zA-Z&&[^1-9]]*");
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.matches() == true)
        {
            driver.findElement(FirstNameLabel).sendKeys(firstName);
        }
        else
        {
            System.out.println("Invalid name");
        }
        //System.out.println("String matches the given Regex: " + matcher.matches());
    }
    public void LastNameValidation()
    {
        String LastName = "Nowak";
        Pattern pattern = Pattern.compile("[a-zA-Z&&[^1-9]]*");
        Matcher matcher = pattern.matcher(LastName);

        if(matcher.matches() == true)
        {
            driver.findElement(LastNameLabel).sendKeys(LastName);
        }
        else
        {
            System.out.println("Invalid Last name");
        }
    }

    public void EmailValidation()
    {
        String email = "gmail@gmail.com";
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches() == true)
        {
            driver.findElement(EmailLabel).sendKeys(email);
        }
        else
        {
            System.out.println("Invalid email");
        }
    }
    public void PhoneNumberValidation()
    {
        String phoneNumber = "(845)555-1212";
        Pattern pattern = Pattern.compile("[(]+[1-9]{3}+[)]+[1-9]{3}+[-]+[1-9]{4}");
        Matcher matcher = pattern.matcher(phoneNumber);

        if(matcher.matches() == true)
        {
            driver.findElement(PhoneLabel).sendKeys(phoneNumber);
        }
        else
        {
            System.out.println("Invalid phoneNumber!");
        }
    }
    public void AdressValidation()
    {
        String Adress = "Krakowska 33";

        Pattern pattern = Pattern.compile("[a-zA-z]+[ ]+[1-9]{2}");
        Matcher matcher = pattern.matcher(Adress);

        if(matcher.matches() == true)
        {
            driver.findElement(AdressLabel).sendKeys(Adress);
        }
        else
        {
            System.out.println("Invalid Adress");
        }
    }
    public void CityValidation() throws InterruptedException {
        String CityName = "Lodz Jeziorna";
        Pattern pattern = Pattern.compile("[A-Za-z]*|[A-Za-z]*+[ ]+[A-Za-z]*|[A-Za-z]*+[-]+[A-Za-z]*");
        Matcher matcher = pattern.matcher(CityName);

        if(matcher.matches() == true)
        {
            driver.findElement(CityLabel).sendKeys(CityName);
            Utils.scrollElementIntoView(PhoneLabel);
        }
        else
        {
            System.out.println("Invalid City name");
        }
        //System.out.println("String matches the given Regex: " + matcher.matches());
    }

    public void WebsiteValidation()  {

        String WebsiteName = "www.9GaG.com";
        Pattern pattern = Pattern.compile("^[w]{3}+[.]+[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*" + "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(WebsiteName);

        if(matcher.matches() == true)
        {
            driver.findElement(WebsiteLabel).sendKeys(WebsiteName);
        }
        else
        {
            System.out.println("Invalid website name");
        }
        //System.out.println("String matches the given Regex: " + matcher.matches());
    }


    public void ZipCodeValidation() {
        String ZipCode = "12345";
        Pattern pattern = Pattern.compile("[1-9]{5}");
        Matcher matcher = pattern.matcher(ZipCode);

        if(matcher.matches() == true)
        {
            driver.findElement(ZipCodeLabel).sendKeys(ZipCode);
        }
        else
        {
            System.out.println("Invalid ZipCode");
        }
        //System.out.println("String matches the given Regex: " + matcher.matches());
    }

    public void CommentValidation()  {
        String Comment = "Testowanie oprogramowania";
        Pattern pattern = Pattern.compile("(.+)");
        Matcher matcher = pattern.matcher(Comment);

        if(matcher.matches() == true)
        {
            driver.findElement(ProjectDescription).sendKeys(Comment);
        }
        else
        {
            System.out.println("Invalid Description");
        }
        //System.out.println("String matches the given Regex: " + matcher.matches());
    }

}
