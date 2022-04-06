package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FodReactivePage extends Testbase {
    private static String FODNumber;
    @FindBy(xpath = "//input[@id=\"username\"]")
    WebElement username;
    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//button[@id=\"login\"]")
    WebElement login;
    @FindBy(xpath = "//button[@id=\"menu-newrequest\"]")
    WebElement Newrequest;
    @FindBy(xpath = "//input[@id=\"text-input\"]")
    WebElement SelectAnAddress;
    @FindBy(xpath = "//button[@id=\"next-button\"]")
    WebElement NextButton;
    @FindBy(xpath = "//input[@id=\"tags-outlined\"]")
    WebElement Problem;
    @FindBy(xpath = "//input[@id=\"contact-name\"]")
    WebElement Name;
    @FindBy(xpath = "//input[@id=\"contact-number\"]")
    WebElement Number;
    @FindBy(xpath = "//input[@id=\"contact-email\"]")
    WebElement Email;
    @FindBy(xpath = "//textarea[@id=\"detailed-description\"]")
    WebElement description;
    @FindBy(xpath = "//textarea[@id=\"site-access\"]")
    WebElement openinghours;
    @FindBy(xpath = "//textarea[@id=\"access-equipment\"]")
    WebElement equipmentaccess;
    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    WebElement confirmcheckbox;
    @FindBy(xpath = "//button[@id=\"next-button-desktop\"]")
    WebElement createrequest;
    @FindBy(xpath = "//p[contains(@class,'MuiTypography-root MuiTypography-body1 MuiTypography-noWrap')]")
    static
    WebElement FODNumberText;



    public FodReactivePage() {
        PageFactory.initElements(driver, this);
    }


    public void createNewrequest(){
        Newrequest.click();
    }

    public void SelectAnAddress() throws InterruptedException {

        SelectAnAddress.sendKeys("loca");
        SelectAnAddress.sendKeys(Keys.ARROW_DOWN);
        SelectAnAddress.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        NextButton.click();
    }

    public void SelectProblem() throws InterruptedException {
        Problem.sendKeys("Air Conditioning > Air Conditioning Too Cold");
        Problem.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        Problem.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        NextButton.click();

    }

    public void ContactForm(){
        Name.sendKeys("kkota");
        Number.sendKeys("07309321005");
        Email.sendKeys("kumar.kota@integral.co.uk");
        description.sendKeys("Details added to this will display in maximo and also to be displayed to the engineer on the device.");
        openinghours.sendKeys("24/7");
        equipmentaccess.sendKeys("Tall ladder");
        NextButton.click();
    }

    public void AddAttachments(){
        NextButton.click();
    }

    public void SummaryPage(){
        confirmcheckbox.click();
        createrequest.click();

    }

    public static String copyFODNumber() throws InterruptedException, IOException {
        Thread.sleep(2000);
        FODNumber = FODNumberText.getAttribute("innerHTML").trim();
        //String[] WorkOrderNumber1 = WO.split(" ");
        //String WONumber = WorkOrderNumber1[7].trim();
        //  FODNumber = WONumber.replaceAll("\\..*", "");
        System.out.println("FOD Number is :" + FODNumber);

        File file = new File("SmokeTest_PRD40_Results.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter FW1 = new FileWriter(file, true);
        BufferedWriter BW1 = new BufferedWriter(FW1);
        BW1.newLine();
        BW1.write("...Test..");
        BW1.newLine();
        BW1.write( "FODNumber is:" + FODNumber); // Writing In To File.
        BW1.close();
        return FODNumber;

    }






}



