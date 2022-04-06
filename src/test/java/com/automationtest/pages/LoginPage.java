package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends Testbase {
    @FindBy(id = "username")
    WebElement UsernameField;
    @FindBy(xpath = "//input[@id='password']")
    WebElement PasswordField;
    @FindBy(xpath = "//*[@id='loginbutton']")
    WebElement SignIntoMaximo;
    @FindBy(xpath = "//input[@name='Email']")
    WebElement PreProdLoginEmailField;
    @FindBy(xpath = "//input[@name='HomeRealmByEmail']")
    WebElement PreProdLoginNextButton;
    @FindBy(xpath = "//input[@id=\"username\"]")
    WebElement FODUsername;
    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement FODPassword;
    @FindBy(xpath = "//button[@id=\"login\"]")
    WebElement FODlogin;

    public LoginPage() {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void EnterUserName(String Username) {
        UsernameField.sendKeys(Username);

    }

    public void EnterPassword(String Password) {
        PasswordField.sendKeys(Password);

    }

    public HomePage login() {
        SignIntoMaximo.click();
        return new HomePage();

    }

    public void PreProdLogin(String Email) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PreProdLoginEmailField.sendKeys(Email);
        PreProdLoginNextButton.click();
    }
    public void FODlogin(){
        FODUsername.sendKeys("kumar.kota@integral.co.uk");
        FODPassword.sendKeys("Integral123@");
        FODlogin.click();
    }


}
