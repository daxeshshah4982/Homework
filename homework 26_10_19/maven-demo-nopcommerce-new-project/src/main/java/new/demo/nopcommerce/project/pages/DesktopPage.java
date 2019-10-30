package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Util {
    @FindBy(xpath = "//li[@class='inactive']//a[@href='/desktops']")
    WebElement _desktopLink;
    @FindBy(xpath = "//strong[contains(text(),'Filter by price')]")
            WebElement _confirmationTextFromDesktop;
    @FindBy(xpath = "//h2[@class='product-title']//a[@href='/build-your-own-computer']")
            WebElement _pickFirstItem;

    By desktopLink = By.xpath("//li[@class='inactive']//a[@href='/desktops']");
    By confirmationTextFromDesktop = By.xpath("//strong[contains(text(),'Filter by price')]");
    By pickFirstItem = By.xpath("//h2[@class='product-title']//a[@href='/build-your-own-computer']");

    public void clickOnDeskTopElementOnComputerPage() {
        clickOnElement((By) _desktopLink);
    }

    public String getConfirmationTextFromDeskTopPage() {
        return getTextFromElement((By) _confirmationTextFromDesktop);
    }

    public void mouseHoverToFirstItemFromListAndClick(){
        mouseHoverToElementAndClick(_pickFirstItem);
    }
}
