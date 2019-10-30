package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.ItemPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ItemPageTest extends TestBase {
    ComputerPage computerPage;
    DesktopPage desktopPage;
    ItemPage itemPage;
    JavascriptExecutor js;
    SoftAssert sa;

    @Test(groups = {"regression","sanity"})
    public void userShouldNavigateToItemPage() throws InterruptedException {
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        js = (JavascriptExecutor) driver;
        sa = new SoftAssert();
        computerPage.mouseHoverToComputerAndClick();
        desktopPage.clickOnDeskTopElementOnComputerPage();
        Thread.sleep(5000);
        //js.executeScript("window.scrollBy(0,500)");
        desktopPage.mouseHoverToFirstItemFromListAndClick();
        js.executeScript("window.scrollBy(0,-450)");
        String expectedText = "Processor";
        Assert.assertEquals(itemPage.getConfirmationTextFromItemPage(), expectedText);
    }

    @Test(groups = {"regression"})
    public void userShouldAddItemToCart() throws InterruptedException {
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        itemPage = new ItemPage();
        js = (JavascriptExecutor) driver;
        sa = new SoftAssert();
        computerPage.mouseHoverToComputerAndClick();
        desktopPage.clickOnDeskTopElementOnComputerPage();
        Thread.sleep(5000);
        //js.executeScript("window.scrollBy(0,500)");
        desktopPage.mouseHoverToFirstItemFromListAndClick();
        js.executeScript("window.scrollBy(0,-450)");
        itemPage.clickOnHDDToAddTheItem();
        itemPage.clickOnAddToCartButton();
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(itemPage.getConfirmationTextForAddToCart(), expectedText);
    }
}
