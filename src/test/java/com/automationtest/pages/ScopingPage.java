package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ScopingPage extends Testbase {
    @FindBy(xpath = "//a[@id='m655e0d4a-tab_anchor']")
    WebElement ScopingTab;
    @FindBy(xpath = "//input[@id='mac1e0044-tb2']")
    WebElement CopyText;
    @FindBy(xpath = "//textarea[@id='m94e1a975-ta']")
    WebElement ProjectDescriptionField;
    @FindBy(xpath = "//textarea[@id='m8af8819f-ta']")
    WebElement ProjectJustificationField;
    @FindBy(xpath = "//textarea[@id='m13f1d025-ta']")
    WebElement ProjectDeliverablesField;
    @FindBy(xpath = "//textarea[@id='m64f6e0b3-ta']")
    WebElement ProjectObjectivesField;
    @FindBy(xpath = "//textarea[@id='mfa927510-ta']")
    WebElement PricingObjectivesField;
    @FindBy(xpath = "//textarea[@id='m8d954586-ta']")
    WebElement ScheduleObejectivesField;
    @FindBy(xpath = "//textarea[@id='m149c143c-ta']")
    WebElement AcceptanceCriteriaField;
    @FindBy(xpath = "//textarea[@id='m639b24aa-ta']")
    WebElement OutofScopeItemsField;
    @FindBy(xpath = "//textarea[@id='mf324393b-ta']")
    WebElement ConstraintsField;
    @FindBy(xpath = "//textarea[@id='m842309ad-ta']")
    WebElement AssumptionsField;
    @FindBy(xpath = "//input[@id='m1eb61c58-tb']")
    WebElement ProceedtoPricingInputField;
    @FindBy(xpath = "//button[@id='m37917b04-pb']")
    WebElement OKbutton;
    @FindBy(xpath = "//input[@id='m5ae08665-tb']")
    WebElement TargetStartDate;
    @FindBy(xpath = "//input[@id='m2de7b6f3-tb']")
    WebElement TargetFinishDate;
    @FindBy(xpath = "//input[@id='mac1e0044-tb']")
    WebElement QuoteNumberField;



    public ScopingPage() {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void ClickonScopingTab() throws InterruptedException{
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.moveToElement(ScopingTab).click().build().perform();
        Thread.sleep(2000);
    }
    public void Filltherequiredfields() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String text = CopyText.getAttribute("value");
        ProjectDescriptionField.clear();
        Thread.sleep(1000);
        ProjectDescriptionField.sendKeys(text);
        ProjectJustificationField.clear();
        ProjectJustificationField.sendKeys(text);
        Thread.sleep(1000);
        ProjectDeliverablesField.clear();
        ProjectDeliverablesField.sendKeys(text);
        Thread.sleep(1000);
        ProjectObjectivesField.clear();
        ProjectObjectivesField.sendKeys(text);
        Thread.sleep(1000);
        PricingObjectivesField.clear();
        PricingObjectivesField.sendKeys(text);
        Thread.sleep(1000);
        ScheduleObejectivesField.clear();
        ScheduleObejectivesField.sendKeys(text);
        Thread.sleep(1000);
        AcceptanceCriteriaField.clear();
        AcceptanceCriteriaField.sendKeys(text);
        Thread.sleep(1000);
        OutofScopeItemsField.clear();
        OutofScopeItemsField.sendKeys(text);
        Thread.sleep(1000);
        ConstraintsField.clear();
        ConstraintsField.sendKeys(text);
        Thread.sleep(1000);
        AssumptionsField.clear();
        AssumptionsField.sendKeys(text);
        Thread.sleep(1000);

    }
    public void MemoProceedtoPricing() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        ProceedtoPricingInputField.sendKeys("Proceed");
        Actions act = new Actions(driver);
        act.moveToElement(OKbutton).click().build().perform();
        Thread.sleep(2000);

    }
    public void FilltheTargetStartDate() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        DateFormat dateFormat = new SimpleDateFormat("d/M/yy");
        Date date = new Date();
        String date1 = dateFormat.format(date).trim();
        //System.out.println(date1);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(TargetStartDate));
        Thread.sleep(1000);
        TargetStartDate.click();
        TargetStartDate.sendKeys(date1);

    }
    public void FilltheTargetFinishDate() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        DateFormat dateFormat = new SimpleDateFormat("d/M/yy");
        Date date = new Date();
        String date1 = dateFormat.format(date).trim();
        //System.out.println(date1);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(TargetFinishDate));
        Thread.sleep(1000);
        TargetFinishDate.click();
        TargetFinishDate.sendKeys(date1);

    }
    public void CopyQuoteNumber() throws IOException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String QuoteNumber = QuoteNumberField.getAttribute("value");
        System.out.println("QuoteNumber is:"+QuoteNumber);

        File file = new File("SmokeTest_FT_Results.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter FW = new FileWriter(file, true);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.newLine();
       // BW.write("...Test..");
        BW.newLine();
        BW.write( "QuoteNumber is:" + QuoteNumber); // Writing In To File.
        BW.close();

    }

}