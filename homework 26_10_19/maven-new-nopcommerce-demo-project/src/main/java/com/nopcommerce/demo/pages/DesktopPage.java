package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Util {

    @FindBy(xpath = "//li[@class='inactive']//a[@href='/desktops']")
    WebElement _desktopLink;
    @FindBy(xpath = "//strong[contains(text(),'Filter by price')]")
    WebElement _confirmationTextFromDesktop;
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Build your own computer')]")
    WebElement _pickFirstItem;

    public void clickOnDeskTopElementOnComputerPage() {
        clickOnElement(_desktopLink);
    }

    public String getConfirmationTextFromDeskTopPage() {
        return getTextFromElement(_confirmationTextFromDesktop);
    }

    public void mouseHoverToFirstItemFromListAndClick() {
        clickOnElement(_pickFirstItem);
    }
}
