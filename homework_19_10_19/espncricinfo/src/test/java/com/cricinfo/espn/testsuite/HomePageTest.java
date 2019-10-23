package com.cricinfo.espn.testsuite;

import com.cricinfo.espn.pages.HomePage;
import com.cricinfo.espn.testbase.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToHomePageSuccessfully() {
        String expectedText = "Top Headlines";
        Assert.assertEquals(homePage.getConfirmationTextFromHomepage(),expectedText);

    }
}
