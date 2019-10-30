package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ComputerPageTest extends TestBase {
    ComputerPage computerPage;
    HomePage homePage;
    SoftAssert sa;

    @Test(groups ={"regression","sanity"})
    public void userShouldNavigateToComputerPage() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        computerPage.mouseHoverToComputerAndClick();
        String expectedText = "Categories";
        Assert.assertEquals(computerPage.getConfirmationTextFromComputerPage(), expectedText);
    }
}
