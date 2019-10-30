package com.youtube.testbase;

import com.youtube.basepage.BasePage;
import com.youtube.browserselector.BrowserSelector;
import com.youtube.loadproperties.LoadProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String browser = new LoadProperties().getProperties("browser");

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
