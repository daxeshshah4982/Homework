package uk.co.appearhere;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.co.appearhere.basepage.BasePage;
import uk.co.appearhere.browserselector.BrowserSelector;
import uk.co.appearhere.loadproperty.LoadProperty;

public class Hooks extends BasePage {
    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector ;

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
