package com.cricinfo.espn.testbase;

import com.cricinfo.espn.basepage.BasePage;
import com.cricinfo.espn.browserselector.BrowserSelector;
import com.cricinfo.espn.loadproperties.LoadProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sun.rmi.server.LoaderHandler;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String browser = new LoadProperties().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
