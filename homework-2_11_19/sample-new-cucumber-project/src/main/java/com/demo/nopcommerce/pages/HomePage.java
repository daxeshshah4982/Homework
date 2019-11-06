package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

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
    @FindBy(linkText = "Log in")
    WebElement _loginLink;
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _registerLink;

    public void mouseHoverToComputerAndClick() {
        log.info("click on computer");
        mouseHoverToElement(_computer);
    }

    public void mouseHoverToElectronicAndClick() {
        log.info("click on electronics");
        mouseHoverToElement(_electronics);
    }

    public void mouseHoverToApparelAndClick() {
        log.info("click on Apparel");
        mouseHoverToElement(_apparel);
    }

    public void mouseHoverToDigitalDownloadAndClick() {
        log.info("click on Digital Download");
        mouseHoverToElement(_digitalDownload);
    }

    public void mouseHoverToBooksAndClick() {
        log.info("click on Books");
        mouseHoverToElement(_books);
    }

    public void mouseHoverToJewelryAndClick() {
        log.info("click on Jewelry");
        mouseHoverToElement(_jewelry);
    }

    public void mouseHoverToGiftCardsAndClick() {
        log.info("click on Gift cards");
        mouseHoverToElement(_giftCards);
    }

    public void clickOnLoginLink() {
        log.info("click on Login Link");
        clickOnElement(_loginLink);
    }
    public void clickOnRegisterLink(){
        log.info("click on Register link");
        clickOnElement(_registerLink);
    }
}