package com.webappsecurity.zero.testbase;

import com.webappsecurity.zero.basepage.BasePage;
import com.webappsecurity.zero.browserselector.BrowserSelector;
import com.webappsecurity.zero.loadproperty.LoadProperty;
import com.webappsecurity.zero.pages.HomePage;
import com.webappsecurity.zero.pages.SignInPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends BasePage {
    HomePage homepage;
    SignInPage loginpage;

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();


    @BeforeMethod
    public void setUP(){
        browserSelector.selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
