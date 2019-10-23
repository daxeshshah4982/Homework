package com.orangehrm.demo.opensource.testsuite;

import com.orangehrm.demo.opensource.pages.HomePage;
import com.orangehrm.demo.opensource.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToHomePage(){
        homePage.verifyTextOnHomePage();
        String expectedText = "LOGIN Panel";
        Assert.assertEquals(homePage.verifyTextOnHomePage(),expectedText);
    }
}
