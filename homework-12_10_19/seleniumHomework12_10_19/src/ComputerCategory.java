import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ComputerCategory {
    private WebDriver driver;
    private Utility utility;
    private Select sel;
    private Actions action;
    private JavascriptExecutor js;

    public String randomEmail() {
        return "jennifer-" + UUID.randomUUID().toString() + "@aniston.com";
    }

    @Before
    public void setUp() {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        utility = new Utility(driver);
        sel = new Select(driver);
        action = new Actions(driver);
        js = (JavascriptExecutor) driver;


        //clicking on register using click method created in utility class
        utility.clickOnWebElement(By.xpath("//a[@href ='/register?returnUrl=%2F']"));

        //picking the gender by clicking on it
        utility.clickOnWebElement(By.xpath("//div//input[@id ='gender-female']"));

        //entering first name by sending texts in it
        utility.sendKeysToWebElement(By.id("FirstName"), "Jennifer");

        //entering last name by sending texts in it
        utility.sendKeysToWebElement(By.xpath("//input[@id='LastName']"), "Aniston");

        //Selecting DOB from dropdown menu by using select method
        sel.selectWebElementFromDropDown(By.xpath("//select[@name='DateOfBirthDay']//option[contains(text(),'29')]"));
        sel.selectWebElementFromDropDown(By.xpath(
                "//select[@name='DateOfBirthMonth']//option[contains(text(), 'February')]"));
        sel.selectWebElementFromDropDown(By.xpath("//select[@name='DateOfBirthYear']//option[contains(text(),'1970')]"));

        // entering an email by sending email address in it
        WebElement email = driver.findElement(By.xpath("//div//input[@name = 'Email']"));
        email.sendKeys(randomEmail());

        //entering company name by sending company name
        utility.sendKeysToWebElement(By.xpath("//input[@type = 'text' and @name ='Company']"), "Imagine production");

        //clicking on checkbox of newsletter
        utility.clickOnWebElement(By.xpath("//input[@type ='checkbox' and @id = 'Newsletter' and @name ='Newsletter']"));

        //entering password and confirmation password
        utility.sendKeysToWebElement(By.xpath("//input[@type ='password' and @id ='Password']"), "aniston1970");
        utility.sendKeysToWebElement(By.xpath("//input[@type ='password' and @id ='ConfirmPassword']"), "aniston1970");

        //clicking on register
        utility.clickOnWebElement(By.xpath("//input[@type ='submit' and @id ='register-button']"));
    }

    @Test
    public void computerCategory() {
        //moving cursor to computer category
        WebElement Computer = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']"));
        action.moveToElement(Computer).perform();

        //selection notebook from computer category
        sel.selectWebElementFromDropDown(By.xpath(
                "//ul[@class='top-menu notmobile']//a[@href='/computers']//parent::li//a[@href='/notebooks']"));

        //sorting the products in notebook pricewise
        js.executeScript("window.scrollBy(0,500)");
        action.moveToElement(driver.findElement(By.xpath("//select[@id='products-orderby']"))).click();
        sel.selectWebElementFromDropDown(By.xpath("//option[contains(text(),'Price: High to Low')]"));

        //sorting the products as it shows maximum 9 items
        action.moveToElement(driver.findElement(By.xpath("//select[@id='products-pagesize']"))).click();
        sel.selectWebElementFromDropDown(By.xpath("//select[@id='products-pagesize']//option[contains(text(),'9')]"));

//        //picking cpu type of notebook
//        js.executeScript("window.scrollBy(0,500)");
//        action.moveToElement(driver.findElement
//                (By.xpath("//a[@href='//demo.nopcommerce.com/notebooks?specs=7']"))).click();
//        // utility.clickOnWebElement(By.xpath("//a[@href='//demo.nopcommerce.com/notebooks?specs=7']"));
//
//        //picking apple macbook pro 13inch
//        utility.clickOnWebElement(By.xpath("//div[@class='picture']//a[@href='/apple-macbook-pro-13-inch']"));
    }
    @After
    public void closeTheWebBrowser() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
