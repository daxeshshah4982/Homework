package com.orangehrm.demo.opensource.testbase;

import com.orangehrm.demo.opensource.basepage.BasePage;
import com.orangehrm.demo.opensource.browserselector.BrowserSelector;
import com.orangehrm.demo.opensource.loadproperty.LoadingProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String browser = new LoadingProperties().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
