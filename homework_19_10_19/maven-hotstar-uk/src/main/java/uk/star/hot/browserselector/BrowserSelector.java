package uk.star.hot.browserselector;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import uk.star.hot.basepage.BasePage;
import uk.star.hot.loadingproperties.LoadingProperties;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    String projectPath = System.getProperty("user.dir");
    String baseURL = new LoadingProperties().getProperty("baseurl");

    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        }else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver",projectPath+"/drivers/MicrosoftWebDriver.exe");
            driver = new InternetExplorerDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        }else {
            System.out.println("Browser name,spell incorrectly, check config.properties file");
        }

    }
}
