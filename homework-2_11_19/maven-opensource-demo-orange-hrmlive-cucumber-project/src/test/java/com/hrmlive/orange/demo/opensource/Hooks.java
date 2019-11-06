package com.hrmlive.orange.demo.opensource;

import com.hrmlive.orange.demo.opensource.basepage.BasePage;
import com.hrmlive.orange.demo.opensource.browserselector.BrowserSelector;
import com.hrmlive.orange.demo.opensource.loadproperty.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {
    BrowserSelector browserSelector;
    String browser = new LoadProperty().getProperty("browser");

    @Before
    public void setUp(){
        browserSelector = new BrowserSelector();
        browserSelector.selectBrowser(browser);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
