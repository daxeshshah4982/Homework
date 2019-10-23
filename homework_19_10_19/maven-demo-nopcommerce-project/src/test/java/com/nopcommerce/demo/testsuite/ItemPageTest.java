package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.ItemPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemPageTest extends TestBase {
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    ItemPage itemPage = new ItemPage();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test
    public void userShouldNavigateToItemPage() throws InterruptedException {
        computerPage.mouseHoverToComputerAndClick();
        desktopPage.clickOnDeskTopElementOnComputerPage();
        Thread.sleep(5000);
        desktopPage.mouseHoverToFirstItemFromListAndClick();
        js.executeScript("window.scrollBy(0,-450)");
        String expectedText = "Processor";
        Assert.assertEquals(itemPage.getConfirmationTextFromItemPage(),expectedText);
    }
    @Test
    public void userShouldAddItemToCart() throws InterruptedException {
        computerPage.mouseHoverToComputerAndClick();
        desktopPage.clickOnDeskTopElementOnComputerPage();
        Thread.sleep(5000);
        desktopPage.mouseHoverToFirstItemFromListAndClick();
        itemPage.clickOnHDDToAddTheItem();
        itemPage.clickOnAddToCartButton();
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(itemPage.getConfirmationTextForAddToCart(),expectedText);
    }
}
