package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static java.lang.Thread.sleep;

public class HomePageTest extends TestBase {
    HomePage homePage;
    LoadProperty loadProperty;
    JavascriptExecutor js;
    SoftAssert sa;

    @Test(groups = {"regression","sanity"})
    public void userShouldNavigateToHomePage() throws InterruptedException {
        homePage = new HomePage();
        loadProperty = new LoadProperty();
        LoadProperty loadProperty = new LoadProperty();
        sa = new SoftAssert();
        js = (JavascriptExecutor) driver;
        sleep(5000);
        js.executeScript("window.scrollBy(0,500)");
        String expectedText = "Welcome to our store";
        String welcome = homePage.verifyWelcomeText();
        Assert.assertEquals(welcome, expectedText);
        sleep(5000);
        js.executeScript("window.scrollBy(0,-500)");
        sleep(5000);
        homePage.selectCurrency();
        sleep(5000);
        homePage.mouseHoverToComputerAndClick();
        sleep(5000);
        homePage.mouseHoverToElectronicAndClick();
        sleep(5000);
        homePage.mouseHoverToApparelAndClick();
        sleep(5000);
        homePage.mouseHoverToDigitalDownloadAndClick();
        sleep(5000);
        homePage.mouseHoverToBooksAndClick();
        sleep(5000);
        homePage.mouseHoverToJewelryAndClick();
        sleep(5000);
        homePage.mouseHoverToGiftCardsAndClick();
    }


}
