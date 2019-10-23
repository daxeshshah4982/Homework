package com.youtube.testsuite;

import com.youtube.pages.HomePage;
import com.youtube.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();
    @Test
    public void userShouldNavigateToHomePage(){
        String expectedText ="Trending";
        Assert.assertEquals(homePage.getConfirmationTextFromHomePage(),expectedText);

    }
}
