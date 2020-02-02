package tests;

import data.BaseData;
import org.testng.annotations.Test;
import pages.*;


public class SeleniumTest extends BaseTest {

    @Test
    private static void SimpleFormDataPageTest() throws  InterruptedException
    {
        driver.get(BaseData.SIMPLE_FORM_DATA_URL);
        SimpleFormDataPage simpleFormDataPage = new SimpleFormDataPage(driver);
        simpleFormDataPage.fillUserMessage();
        simpleFormDataPage.setShowMessageButtonClick();
        simpleFormDataPage.checkValidationMessage();
        Thread.sleep(2000);
        simpleFormDataPage.getCalculation();
        Thread.sleep(2000);

    }
    @Test
    private static void CheckboxDemoPageTest() throws  InterruptedException
    {
        driver.get(BaseData.BASIC_CHECKBOX_DEMO_URL);
        CheckboxDemoPage checkboxDemoPage = new CheckboxDemoPage(driver);
        checkboxDemoPage.setFirstCheckboxClick();
        Thread.sleep(3000);
        checkboxDemoPage.checkBoxMessage();

        checkboxDemoPage.setCheckAllButtonClick();
        Thread.sleep(2000);
        checkboxDemoPage.compareButtonText();
        checkboxDemoPage.UncheckOneClick();
        Thread.sleep(2000);
        checkboxDemoPage.checkButtonText();
    }

    @Test
    private static void RadiobuttonDemoPageTest() throws  InterruptedException
    {
        driver.get(BaseData.BASIC_RADIOBUTTON_DEMO_URL);
        RadiobuttonDemoPage radiobuttonDemoPage = new RadiobuttonDemoPage(driver);
        radiobuttonDemoPage.setMaleRadioButtonClick();
        Thread.sleep(2000);
        radiobuttonDemoPage.checkAssertion();
        radiobuttonDemoPage.setSexAndAgeRadioButtonClick();
        Thread.sleep(2000);
        radiobuttonDemoPage.checkDoubleAssertion();
    }

    @Test
    private static void DropDownListPageTest() throws  InterruptedException
    {
        driver.get(BaseData.BASIC_SELECT_DROPDOWN_URL);
        DropDownListPage dropDownListPage = new DropDownListPage(driver);
        dropDownListPage.setDropDownListElementClick();
        dropDownListPage.checkValidationMessage();
        Thread.sleep(3000);
        dropDownListPage.setListElementAndButtonClick();
        Thread.sleep(3000);
        dropDownListPage.checkSecondValidationMessage();
    }

    @Test
    private static void InputFormPageNotYetTest() throws  InterruptedException
    {
        driver.get(BaseData.INPUT_FORM_URL);
        InputFormPageNotYet inputFormPage = new InputFormPageNotYet(driver);
        inputFormPage.NameValidation();
        inputFormPage.LastNameValidation();
        inputFormPage.EmailValidation();
        inputFormPage.PhoneNumberValidation();
        inputFormPage.AdressValidation();
        inputFormPage.CityValidation();
        Thread.sleep(2000);
        inputFormPage.StateClick();
        inputFormPage.ZipCodeValidation();
        inputFormPage.WebsiteValidation();
        inputFormPage.RadioClick();
        inputFormPage.CommentValidation();
        Thread.sleep(2000);
        inputFormPage.setShowMessageButtonClick();
    }

    @Test
    private static void TablePaginationPageTest() throws  InterruptedException
    {
        driver.get(BaseData.TABLE_PAGINATION_URL);
        TablePaginationPage tablePaginationPage = new TablePaginationPage(driver);
        tablePaginationPage.CheckNumberOfRecords();
        tablePaginationPage.CheckNumberOfRecordsOnSinglePage();
        Thread.sleep(2000);
        tablePaginationPage.secondPageClick();
        tablePaginationPage.CheckNumberOfRecordsOnSinglePage();
        Thread.sleep(2000);
        tablePaginationPage.CheckPreviousAndNextButtons();
        tablePaginationPage.ThirdPageClick();
        tablePaginationPage.CheckNumberOfRecordsOnSinglePage();

    }

    @Test
    private static void BootstrappAlertPage() throws  InterruptedException
    {
        driver.get(BaseData.BOOTSTRAP_ALERT_URL);
        BootstrappAlertPage bootstrappAlertPage = new BootstrappAlertPage(driver);
        bootstrappAlertPage.autoCloseableSuccessButtonClick();
        bootstrappAlertPage.autoCloseableSuccessShowAssertion();
        Thread.sleep(6000);
        bootstrappAlertPage.autoCloseableSuccessCloseAssertion();

        bootstrappAlertPage.NormalSuccessButtonClick();
        bootstrappAlertPage.NormalSuccessShowAssertion();
        bootstrappAlertPage.NormalSuccessCloseButtonClick();
        bootstrappAlertPage.NormalSuccessCloseAssertion();
    }

    @Test
    private static void BootstrapModalDemoPage() throws  InterruptedException
    {
        driver.get(BaseData.BOOTSTRAP_MODAL_DEMO_URL);
        BootstrapModalDemoPage bootstrappModalDemo = new BootstrapModalDemoPage(driver);
        bootstrappModalDemo.launchButtonClick();
        Thread.sleep(1000);
        bootstrappModalDemo.CheckLaunchModalapperance();

        bootstrappModalDemo.SecondModalButtonClick();
        Thread.sleep(1000);
        bootstrappModalDemo.CheckSecondModalapperance();

        bootstrappModalDemo.saveButtonClick();
        Thread.sleep(1000);
        bootstrappModalDemo.CheckPageRefresh();
    }

    @Test
    private static void JQueryProgressBarPage() throws  InterruptedException
    {
        driver.get(BaseData.JQUERY_PROGRESS_BAR_URL);
        JQueryProgressBar jQueryProgressBar = new JQueryProgressBar(driver);
        jQueryProgressBar.downloadButtonClick();
        jQueryProgressBar.checkButtonTag();
        Thread.sleep(15000);
        jQueryProgressBar.progressLabelAssertion();
        jQueryProgressBar.closeButtonClick();
    }
    @Test
    private static void AjaxFormSubmitPage() throws  InterruptedException
    {
        driver.get(BaseData.AJAX_FORM_SUBMIT_URL);
        AjaxFormSubmitPage ajaxFormSubmitPage = new AjaxFormSubmitPage(driver);
        ajaxFormSubmitPage.NampeInputData();
        ajaxFormSubmitPage.CommentInput();
        ajaxFormSubmitPage.SubmitButtonClick();
        ajaxFormSubmitPage.ProgressLabelCheck();
    }
}