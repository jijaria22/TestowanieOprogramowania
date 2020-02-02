package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class TablePaginationPage {
    WebDriver driver;
    public TablePaginationPage(WebDriver driver){this.driver = driver;}

    private final By SecondPageButton = By.xpath("//*[@id=\"myPager\"]/li[3]/a");
    private final By ThirdPageButton = By.xpath("//*[@id=\"myPager\"]/li[4]/a");
    private final By PreviousPageButton = By.xpath("//*[@id=\"myPager\"]/li[1]/a");
    private final By NextPageButton = By.xpath("//*[@id=\"myPager\"]/li[5]/a");

    public final By CheckNumberOfRecordsOnSinglePage = By.xpath(".//*[@id='myTable']/tr[contains(@style,'display: table-row')]");
    public final By CheckSummaryNumberOfRecords = By.xpath(".//*[@id='myTable']/tr");

    public void secondPageClick()
    {
        driver.findElement(SecondPageButton).click();
    }
    public void ThirdPageClick()
    {
        driver.findElement(ThirdPageButton).click();
    }

    public void CheckPreviousAndNextButtons()
    {
        Assert.assertEquals(true, driver.findElement(PreviousPageButton).
                isDisplayed(),"Przycisk poprzedniej strony nie zostal wyswietlony");
        Assert.assertEquals(true, driver.findElement(PreviousPageButton).
                isEnabled(),"Przycisk poprzedniej strony nie jest gotowy do uzycia");


        Assert.assertEquals(true, driver.findElement(NextPageButton).
                isDisplayed(),"Przycisk nastepnej strony nie zostal wyswietlony");
        Assert.assertEquals(true, driver.findElement(PreviousPageButton).
                isEnabled(),"Przycisk nastepnej strony nie jest gotowy do uzycia");
    }

    public void CheckNumberOfRecords()
    {
        List  rows = driver.findElements(CheckSummaryNumberOfRecords); //number of rows
        //System.out.println("Number of records: " + rows.size());
        if(rows.size() > 15)
        {
            System.out.println("Tabela posiada wiecej niz 15 rekordow");
        }
    }

    public void CheckNumberOfRecordsOnSinglePage()
    {
        List  singlePageRows = driver.findElements(CheckNumberOfRecordsOnSinglePage);
        //System.out.println("Number of records on single page: " + singlePageRows.size());
        if(singlePageRows.size() > 5)
        {
            System.out.println("Na pojedynczej stronie znajduje sie wiecej niz 5 rekordow");
        }
    }

}
