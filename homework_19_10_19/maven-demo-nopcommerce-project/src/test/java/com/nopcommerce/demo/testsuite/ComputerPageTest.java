package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {
    ComputerPage computerPage = new ComputerPage();

    @Test
    public void userShouldNavigateToComputerPage() {
        computerPage.mouseHoverToComputerAndClick();
        String expectedText = "Categories";
        Assert.assertEquals(computerPage.getConfirmationTextFromComputerPage(), expectedText);
    }


}
