package com.webappsecurity.zero.testsuite;

import com.webappsecurity.zero.basepage.BasePage;
import com.webappsecurity.zero.pages.HomePage;
import com.webappsecurity.zero.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage ;

    @Test
    public void navigateToSignInPage(){
        homePage = new HomePage();
        System.out.println("driver = "+driver);
        String expectedText = "Zero Bank";
        Assert.assertEquals(homePage.getTextFromHomePage(),expectedText);
        homePage.clickOnSignInPage();

    }
}
