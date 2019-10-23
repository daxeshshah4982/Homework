package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class ComputerPage extends Util {

    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']");
    By computerConfirmationText = By.xpath("//strong[contains(text(),'Categories')]");
    By desktopLink = By.xpath("//li[@class='inactive']//a[@href='/desktops']");

    public void mouseHoverToComputerAndClick() {
        mouseHoverToElementAndClick(computerLink);
    }

    public String getConfirmationTextFromComputerPage() {
        return getTextFromElement(computerConfirmationText);
    }



}
