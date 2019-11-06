package com.hrmlive.orange.demo.opensource.browserselector;


import com.hrmlive.orange.demo.opensource.basepage.BasePage;
import com.hrmlive.orange.demo.opensource.loadproperty.LoadProperty;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    String projectPath = System.getProperty("user.dir");
    String baseURL = new LoadProperty().getProperty("baseurl");



    public void selectBrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            try {
                driver.manage().getCookies();
                driver.manage().deleteAllCookies();
            }catch (Exception e){
                e.printStackTrace();
            }

        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            try {
                driver.manage().getCookies();
                driver.manage().deleteAllCookies();
            }catch (Exception e){
                e.printStackTrace();
            }

        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver",projectPath+"/drivers/MicrosoftWebDriver.exe");
            driver = new InternetExplorerDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            try {
                driver.manage().getCookies();
                driver.manage().deleteAllCookies();
            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            System.out.println("enter the correct browser name in config.properties file");
        }

    }
}

