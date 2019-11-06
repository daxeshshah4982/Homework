package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class ComputerPage extends Util {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']");
    By computerConfirmationText = By.xpath("//strong[contains(text(),'Categories')]");
    By desktopLink = By.xpath("//li[@class='inactive']//a[@href='/desktops']");

    public void mouseHoverToComputerAndClick() {
        log.info("click on computer");
        mouseHoverToElementAndClick(computerLink);
    }

    public String getConfirmationTextFromComputerPage() {
        log.info("verify computer page");
        return getTextFromElement(computerConfirmationText);
    }
    public void clickOnDeskTopElementOnComputerPage() {

        clickOnElement(desktopLink);
    }


}
