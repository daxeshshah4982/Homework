package com.demo.nopcommerce;


import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import com.demo.nopcommerce.loadproperty.LoadProperty;


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