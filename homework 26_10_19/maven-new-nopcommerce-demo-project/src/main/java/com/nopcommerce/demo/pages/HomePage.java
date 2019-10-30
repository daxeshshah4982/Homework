package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

    @FindBy(xpath = "//div[@class='topic-block-title'] //h2[contains(text(),'Welcome')]")
    WebElement _welcomeText;
    @FindBy(id = "customerCurrency")
    WebElement _selectCurrency;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    WebElement _computer;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]")
    WebElement _electronics;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]")
    WebElement _apparel;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[4]")
    WebElement _digitalDownload;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[5]")
    WebElement _books;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[6]")
    WebElement _jewelry;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[7]")
    WebElement _giftCards;
    @FindBy(linkText = "Register")
    WebElement _registerLink;
    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    public String verifyWelcomeText() {
        return getTextFromElement(_welcomeText);
    }

    public void selectCurrency() {
        selectByVisibleTextFromDropDown(_selectCurrency, "Euro");
    }

    public void mouseHoverToComputerAndClick() {
        mouseHoverToElement(_computer);
    }

    public void mouseHoverToElectronicAndClick() {
        mouseHoverToElement(_electronics);
    }

    public void mouseHoverToApparelAndClick() {
        mouseHoverToElement(_apparel);
    }

    public void mouseHoverToDigitalDownloadAndClick() {
        mouseHoverToElement(_digitalDownload);
    }

    public void mouseHoverToBooksAndClick() {
        mouseHoverToElement(_books);
    }

    public void mouseHoverToJewelryAndClick() {
        mouseHoverToElement(_jewelry);
    }

    public void mouseHoverToGiftCardsAndClick() {
        mouseHoverToElement(_giftCards);
    }

    public void clickOnRegisterLink() {
        clickOnElement(_registerLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(_loginLink);
    }
}