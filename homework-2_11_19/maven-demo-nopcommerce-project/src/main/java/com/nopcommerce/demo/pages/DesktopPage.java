package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class DesktopPage extends Util {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());
    By desktopLink = By.xpath("//li[@class='inactive']//a[@href='/desktops']");
    By confirmationTextFromDesktop = By.xpath("//strong[contains(text(),'Filter by price')]");
    By pickFirstItem = By.xpath("//h2[@class='product-title']//a[@href='/build-your-own-computer']");

    public void clickOnDeskTopElementOnComputerPage() {
        log.info("click on Desktop element on computer page");
        clickOnElement(desktopLink);
    }

    public String getConfirmationTextFromDeskTopPage() {
        log.info("verify desktop page");
        return getTextFromElement(confirmationTextFromDesktop);
    }

    public void mouseHoverToFirstItemFromListAndClick(){
        log.info("pick first item on desktop page");
        clickOnElement(pickFirstItem);
    }
}
