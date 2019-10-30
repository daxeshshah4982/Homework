package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopPageTest extends TestBase {
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test
    public void userShouldNavigateToDeskTopPage() {
        computerPage.mouseHoverToComputerAndClick();
        desktopPage.clickOnDeskTopElementOnComputerPage();
        String expectedText = "Filter by price";
        Assert.assertEquals(desktopPage.getConfirmationTextFromDeskTopPage(), expectedText);
    }

    @Test
    public void userShouldPickItemFromDesktop() throws InterruptedException {
        computerPage.mouseHoverToComputerAndClick();
        desktopPage.clickOnDeskTopElementOnComputerPage();
        Thread.sleep(5000);
        desktopPage.mouseHoverToFirstItemFromListAndClick();
        js.executeScript("window.scrollBy(0,-450)");

    }
}
