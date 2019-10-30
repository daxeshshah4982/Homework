package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DesktopPageTest extends TestBase {
    ComputerPage computerPage;
    DesktopPage desktopPage;
    JavascriptExecutor js;
    SoftAssert sa;

    @Test(groups = {"regression","sanity"})
    public void userShouldNavigateToDeskTopPage() {
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        sa = new SoftAssert();
        computerPage.mouseHoverToComputerAndClick();
        desktopPage.clickOnDeskTopElementOnComputerPage();
        String expectedText = "Filter by price";
        Assert.assertEquals(desktopPage.getConfirmationTextFromDeskTopPage(), expectedText);
    }

    @Test(groups = {"regression"})
    public void userShouldPickItemFromDesktop() //throws InterruptedException
     {
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        js = (JavascriptExecutor) driver;
        sa = new SoftAssert();
        computerPage.mouseHoverToComputerAndClick();
        desktopPage.clickOnDeskTopElementOnComputerPage();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //js.executeScript("window.scrollBy(0,500)");
        desktopPage.mouseHoverToFirstItemFromListAndClick();
        js.executeScript("window.scrollBy(0,-450)");
    }
}
