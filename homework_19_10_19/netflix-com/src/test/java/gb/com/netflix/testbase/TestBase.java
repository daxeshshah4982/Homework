package gb.com.netflix.testbase;

import gb.com.netflix.basepage.BasePage;
import gb.com.netflix.browserselector.BrowserSelector;
import gb.com.netflix.loadingproperties.LoadingProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String browser = new LoadingProperties().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
