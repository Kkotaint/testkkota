package com.automationtest.base;

import SmokeTest.util.TestUtil;
import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Testbase {

    public static WebDriver driver;
    public static Properties prop;
    public static Object ldriver;
    // public WebDriver driver;

   // public static WebDriverManager wmdriver;
    public Scenario scenario;

    public Testbase() {
        {
            PageFactory.initElements( driver, this );
        }

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    "src\\main\\java\\SmokeTest\\config\\configuration.properties");

            prop.load( ip );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static String  intialization() {
        String browserName = prop.getProperty( "browser" );

        // To Open the Browser
        if (browserName.equals("IE")) {
            System.setProperty( "webdriver.ie.driver", prop.getProperty( "IEPath" ) );
            driver = new InternetExplorerDriver();

        } else if (browserName.equals( "chrome" )) {

            WebDriverManager.chromedriver().setup();
            //System.setProperty( "webdriver.chrome.driver", prop.getProperty( "ChromePath" ) );
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability( CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE );
            dc.setCapability("acceptSslCerts", true);
            dc.setCapability("acceptInsecureCerts", false);
           driver = new ChromeDriver();

        } else if (browserName.equals( "firefox" )) {
            System.setProperty( "webdriver.gecko.driver", prop.getProperty( "FFPath" ) );
            driver = new FirefoxDriver();

        }
        else if (browserName.equals( "Edge" )) {
            System.setProperty("webdriver.edge.driver", prop.getProperty("EdgePath"));
            driver = new EdgeDriver();

        }


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout( TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS );
        driver.manage().timeouts().implicitlyWait( TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS );
        // To navigate to the URL
        driver.get( prop.getProperty( "url" ) );
        return browserName;
    }
    public static String FSOintialization() {
        String browserName = prop.getProperty( "browser" );

        // To Open the Browser
        if (browserName.equals("IE")) {
            System.setProperty( "webdriver.ie.driver", prop.getProperty( "IEPath" ) );
            driver = new InternetExplorerDriver();

        } else if (browserName.equals( "chrome" )) {
           //System.setProperty( "webdriver.chrome.driver", prop.getProperty( "ChromePath" ) );
            WebDriverManager.chromedriver().setup();
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability( CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE );
            dc.setCapability("acceptSslCerts", true);
            dc.setCapability("acceptInsecureCerts", false);
            driver = new ChromeDriver();

        } else if (browserName.equals( "firefox" )) {
            System.setProperty( "webdriver.gecko.driver", prop.getProperty( "FFPath" ) );
            driver = new FirefoxDriver();

        }
        else if (browserName.equals( "Edge" )) {
            System.setProperty("webdriver.edge.driver", prop.getProperty("EdgePath"));
            driver = new EdgeDriver();

        }


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout( TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS );
        driver.manage().timeouts().implicitlyWait( TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS );
        // To navigate to the URL
        driver.get( prop.getProperty( "FSOurl" ) );
        return browserName;
    }
    public static String PrePRODintialization() {
        String browserName = prop.getProperty("browser");
        // To Open the Browser
        if (browserName == "IE") {
            System.setProperty("webdriver.ie.driver", prop.getProperty("IEPath"));
            driver = new InternetExplorerDriver();

        } else if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromePath"));
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
            dc.setCapability("acceptSslCerts", true);
            dc.setCapability("acceptInsecureCerts", false);
            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", prop.getProperty("FFPath"));
            DesiredCapabilities cap = DesiredCapabilities.firefox();
            cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
            cap.setCapability("marionette", true);
            cap.setCapability("acceptSslCerts", true);
            cap.setCapability("acceptInsecureCerts", false);
            driver = new FirefoxDriver();

        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        // To navigate to the URL
        driver.get(prop.getProperty("PreProdURL"));
        return browserName;

    }
    public static void FODintializationNonHeadless() {
        String browserName = prop.getProperty("browser");
        // To Open the Browser
        if (browserName == "IE") {
            System.setProperty("webdriver.ie.driver", prop.getProperty("IEPath"));
            driver = new InternetExplorerDriver();

        } else if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            // System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromePath"));
            //  ChromeOptions options =new ChromeOptions();
            //  options.addArguments("--headless");
            DesiredCapabilities dc = new DesiredCapabilities();
            //  dc.setCapability(ChromeOptions.CAPABILITY,options);
            //   options.merge(dc);
            dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
            dc.setCapability("acceptSslCerts", true);
            dc.setCapability("acceptInsecureCerts", false);
            driver = new ChromeDriver();
            // driver.manage().deleteAllCookies();
            //  System.out.println("deleted all cookies");

        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", prop.getProperty("FFPath"));
            driver = new FirefoxDriver();

        }
        driver.manage().window().maximize();
        //  driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        // To navigate to the URL
        driver.get(prop.getProperty("FODURL"));

    }

    public static void cleanUp() {
        driver.close();
        //driver.quit();
    }

}