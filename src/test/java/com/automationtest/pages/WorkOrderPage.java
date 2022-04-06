package com.automationtest.pages;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class WorkOrderPage extends PreventiveMaintenancePage {
    public static String WorkOrderNumber;
    @FindBy(xpath = "//a[@id='m4326cf1d-tab_anchor']")
    WebElement WorkTab;
    @FindBy(xpath = "//img[@id='m6dfccb0d_tdrow_[C:0]_tgdet-ti[R:0]_img']")
    WebElement ExpandWorkOrderList;
    @FindBy(xpath = "//input[@id='mf2d9df82-tb']")
    static WebElement WOnumber;
    static String WOFILE = "WO.txt";
    @FindBy(xpath = "//input[@id='input_39']")
    static
    WebElement WorkOrderField;
    @FindBy(xpath = "//input[@id='quicksearch']")
    static
    WebElement FindWO;
    @FindBy(xpath = "//input[@id='quicksearchQSImage']")
    static
    WebElement Searchbutton;
    @FindBy(xpath = "//input[@id='m6a7dfd2f_tfrow_[C:1]_txt-tb']")
    static
    WebElement WOfield;
    @FindBy(css = "#m9a787af-tb")
    static
    WebElement BillBatchWorkOderField;
    @FindBy(xpath = "//img[@id='m6a7dfd2f-ti2_img']")
    static
    WebElement WOsearchButton;
    @FindBy(xpath = "//span[@id='m6a7dfd2f_tdrow_[C:1]_ttxt-lb[R:0]']")
    static
    WebElement ClickonWOlink;
    @FindBy(xpath = "//input[@id='m6271c2a9-tb']")
    WebElement ActualStartDateField;
    @FindBy(xpath = "//input[@id='mfb789313-tb']")
    WebElement ActualFinishDateField;
    @FindBy(xpath = "//*[@id='m15b88ed6-cb_img']")
    WebElement MobileOverRideCheckbox;
    @FindBy(xpath = "//*[@id='mddc79f39-tb']")
    WebElement MobileOverRideReason;
    @FindBy(xpath = "//img[@id='toolactions_SAVE-tbb_image']")
    WebElement Savebutton;
    @FindBy(xpath = "//*[@id='m37917b04-pb']")
    WebElement OKbutton;
   // @FindBy(xpath = "//img[@id='ROUTEWF_MEUWO_-tbb_image']")
    @FindBy(xpath = "//img[@role='button' and @alt='Route Workflow']")
    WebElement WorkflowButton;
    @FindBy(xpath = "//input[@id='mad3161b5-tb2']")
    WebElement LongDescription;
    @FindBy(css = "#m1e2cbe37-tb")
    WebElement DocumentcheckStatus;

    @FindBy(xpath="(//input[@value='SPECIAL'])[1]")
    WebElement skilllevel;

    @FindBy(xpath = "//img[@id='mfe7bb84-img']")
    WebElement VendorCompanyExpansionButton;
    @FindBy(xpath = "(//td/span[text()='1st preferred'])[1]")
    WebElement OneEnvironmentalLTD;
    @FindBy(xpath = "//span[@id='NORMAL_normal0_a_tnode']")
    WebElement SelectValueButton;
    @FindBy(css = "img[id='m5cd7ac0f-img']")
    WebElement VendorButton;



    public WorkOrderPage() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void ClickonWorkTab() {
        //WorkTab.click();
    }

    public void ClickonExpandWorkOrder() throws InterruptedException {
        Thread.sleep(3000);
        ExpandWorkOrderList.click();
    }

    /*public static String CopyWorkOrderNumber() {
        WorkOrderNumber = WOnumber.getText();
        System.out.println(WorkOrderNumber);

        return WorkOrderNumber;*/
    public static String CopyWorkOrderNumber() throws IOException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WorkOrderNumber = WOnumber.getAttribute("value");
        System.out.println("WorkOrderNumber is :" + WorkOrderNumber);
        File FC = new File("WO.txt");
        FC.createNewFile();
        // Writing in to File
        FileWriter FW = new FileWriter("WO.txt");
        BufferedWriter BW = new BufferedWriter(FW);
        BW.write(WorkOrderNumber); // Writing In To File.
        BW.close();

        File  file = new File("SmokeTest_FT_Results.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter FW1 = new FileWriter(file, true);
        BufferedWriter BW1 = new BufferedWriter(FW1);
        BW1.newLine();
       // BW1.write("...Test..");
        BW1.newLine();
        BW1.write( "WorkOrderNumber is:" + WorkOrderNumber); // Writing In To File.
        BW1.close();
        return WorkOrderNumber;


    }

    public void readWorkOrderNumber() throws IOException {
       /* FileReader FR = new FileReader(WOFILE);
        BufferedReader BR = new BufferedReader(FR);
        String Content = "";
       // while ((Content = BR.readLine()) != null);
        System.out.println("wo"+FR);*/
        System.out.println(WorkOrderNumber);
    }

    public static void searchWO(String[] args) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(WorkOrderField)).sendKeys(WorkOrderNumber);


    }
    public static void entertheWorkOrderNumber(String[] args){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(BillBatchWorkOderField)).sendKeys(WorkOrderNumber);
    }

    public static void searchandClickonWO(String[] args) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(WOfield)).sendKeys(WorkOrderNumber);
        WOsearchButton.click();
        Thread.sleep(4000);
        ClickonWOlink.click();
        Thread.sleep(4000);

    }

    public void enterLongDescription() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        LongDescription.click();
        LongDescription.sendKeys("TEST");
    }

    public void enterActualStartDate() throws InterruptedException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date date = new Date();
        System.out.println(date);


        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        ActualStartDateField.clear();
        Thread.sleep(1000);
       // SimpleDateFormat dfdate = new SimpleDateFormat("DD/MM/YYYY");
        String currentdate=formatter.format(date);
        System.out.println(currentdate);

        Calendar now = Calendar.getInstance();
        now.add(Calendar.MINUTE, -30);

        SimpleDateFormat df = new SimpleDateFormat("hh:mm");
        String time= df.format(now.getTime());
       System.out.println(time);
        Actions actions = new Actions(driver);
        actions.sendKeys(ActualStartDateField,currentdate+" "+time ).perform();
        Thread.sleep(4000);
        ActualStartDateField.sendKeys(Keys.TAB);
       /*String val = "5/1/2020 03:00 PM";
        WebElement element = ActualStartDateField;
        element.clear();
        for (int i = 0; i < val.length(); i++) {
            char c = val.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);*/
    }

    public void enterActualFinishDate() throws InterruptedException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date date = new Date();
        System.out.println(date);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        ActualFinishDateField.clear();
        Thread.sleep(1000);
        String currentdate=formatter.format(date);
        System.out.println(currentdate);

        Calendar now = Calendar.getInstance();
       // now.add(Calendar.MINUTE, -30);

        SimpleDateFormat df = new SimpleDateFormat("hh:mm");
        String time= df.format(now.getTime());
        System.out.println(time);
        Actions actions = new Actions(driver);
        actions.sendKeys(ActualFinishDateField,currentdate+" "+time ).perform();
        Thread.sleep(4000);
        ActualFinishDateField.sendKeys(Keys.TAB);

       /* String val1 = "5/1/2020 03:30 PM";
        WebElement element1 = ActualFinishDateField;
        element1.clear();

        for (int i = 0; i < val1.length(); i++){
            char c = val1.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element1.sendKeys(s);*/
    }

    public void checkMobileOverRideCheckbox() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        if (!MobileOverRideCheckbox.isSelected()) {
            Thread.sleep(2000);
            MobileOverRideCheckbox.click();
        }
    }

    public void entertheMobileOverrideReason() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        MobileOverRideReason.click();
        MobileOverRideReason.sendKeys("Testing");
    }

    public void clickonSavebutton() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //Savebutton.click();
        WebElement element = Savebutton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickonOKbutton() throws InterruptedException, AWTException {
        Thread.sleep(5000);
/*  WebDriverWait wait = new WebDriverWait(driver, 60);
  wait.until(ExpectedConditions.elementToBeClickable(OKbutton)).click();*/
        Actions act1 = new Actions(driver);
        act1.moveToElement(OKbutton).click().build().perform();



    }



    public void clickonWorkflowButton() throws InterruptedException {

        Thread.sleep(10000);
        System.out.println("before clicking workflow");
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(WorkflowButton)).click();
        System.out.println("after clicking workflow");

    }

    public void clickonWorkflowButtonThrice() throws InterruptedException {
        for(int i=0;i<4;i++) {
            Thread.sleep(10000);
            System.out.println("before clicking workflow");
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.elementToBeClickable(WorkflowButton)).click();
            Thread.sleep(2000);
            System.out.println("after clicking workflow");
        }
        OKbutton.click();
    }

    public void VendorDetailsFilling(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        VendorButton.click();
        SelectValueButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(OneEnvironmentalLTD));
        OneEnvironmentalLTD.click();


    }

    public void clickonWorkflowButtonFINCOMP() throws InterruptedException {
        Thread.sleep(5000);
        WorkflowButton.click();
        Thread.sleep(1000);


    }


    public void userFindWO() throws InterruptedException {

        Thread.sleep(5000);
        FindWO.sendKeys(WorkOrderNumber);
        Thread.sleep(2000);
        FindWO.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

    }

    public void VerifySkillLevel() throws InterruptedException {

        Thread.sleep(2000);
        String actual=skilllevel.getAttribute("value");
        System.out.println("skill level is "+actual);
        Assert.assertEquals("SPECIAL",actual);
    }

    public void enterDocumentRequired() throws InterruptedException {
        Thread.sleep(2000);
        String status = "COMPLETE";
        WebElement element = DocumentcheckStatus;
        element.clear();
        for (int i = 0; i < status.length(); i++) {
            char c = status.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);
            Thread.sleep(2000);

        }
    }

    }







