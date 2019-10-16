// Registration on demo-nop commerce web application

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class RegistrationPage {
    private WebDriver driver;
    private Utility utility;
    private Select sel;
    private Actions action;

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
    }

    public String randomEmail() {
        return "jennifer-" + UUID.randomUUID().toString() + "@aniston.com";
    }

    @Test
    public void navigateTORegisterPageSuccessfully() {
        //clicking on register using click method created in utility class
        driver.findElement(By.xpath("//a[@href ='/register?returnUrl=%2F']")).click();

        //Now verifying that page is navigated to registration page by comparing name element Register on that page
        String expectedResult = "Register";
        WebElement actualResultOfWebElement = driver.findElement(By.xpath("//div//a[@class='ico-register']"));
        String actualResult = actualResultOfWebElement.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void registrationOnDemoNopCommerce() {

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

        String expectedResult = "Your registration completed";
        WebElement element = driver.findElement(By.xpath("//div[@class='result']"));
        String actualResult = element.getText();
        Assert.assertEquals(expectedResult, actualResult);
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

