package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.browserselector.BrowserSelector;
import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends BasePage {
    HomePage homepage;
    DesktopPage desktopPage;
    ComputerPage computerPage;
    ItemPage itemPage;
    RegisterPage registerPage;

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();


    @BeforeMethod(alwaysRun = true )
    public void setUP(){
        browserSelector.selectBrowser(browser);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
