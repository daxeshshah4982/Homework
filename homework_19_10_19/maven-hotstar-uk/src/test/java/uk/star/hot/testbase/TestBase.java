package uk.star.hot.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.star.hot.basepage.BasePage;
import uk.star.hot.browserselector.BrowserSelector;
import uk.star.hot.loadingproperties.LoadingProperties;

public class TestBase extends BasePage {
    String browser = new LoadingProperties().getProperty("browser");
        BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp(){
         browserSelector.selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
