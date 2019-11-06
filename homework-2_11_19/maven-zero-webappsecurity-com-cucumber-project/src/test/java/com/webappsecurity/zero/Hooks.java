package com.webappsecurity.zero;

import com.webappsecurity.zero.basepage.BasePage;
import com.webappsecurity.zero.browserselector.BrowserSelector;
import com.webappsecurity.zero.loadproperty.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String browser = new LoadProperty().getProperty("browser");

    @Before
    public void setUP() {
        browserSelector.selectBrowser(browser);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

