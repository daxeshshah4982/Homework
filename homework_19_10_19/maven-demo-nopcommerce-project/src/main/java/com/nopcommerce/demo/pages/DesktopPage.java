package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class DesktopPage extends Util {
    By desktopLink = By.xpath("//li[@class='inactive']//a[@href='/desktops']");
    By confirmationTextFromDesktop = By.xpath("//strong[contains(text(),'Filter by price')]");
    By pickFirstItem = By.xpath("//h2[@class='product-title']//a[@href='/build-your-own-computer']");

    public void clickOnDeskTopElementOnComputerPage() {
        clickOnElement(desktopLink);
    }

    public String getConfirmationTextFromDeskTopPage() {
        return getTextFromElement(confirmationTextFromDesktop);
    }

    public void mouseHoverToFirstItemFromListAndClick(){
        mouseHoverToElementAndClick(pickFirstItem);
    }
}
