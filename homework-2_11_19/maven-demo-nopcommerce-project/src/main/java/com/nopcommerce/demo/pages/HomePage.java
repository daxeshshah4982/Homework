package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Util {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By welcomeText = By.xpath("//div[@class='topic-block-title'] //h2[contains(text(),'Welcome')]");
    By currency = By.xpath("//select[@id='customerCurrency']");
    By computer = By.xpath("//ul[@class='top-menu notmobile']/li[1]");
    By electronics = By.xpath("//ul[@class='top-menu notmobile']/li[2]");
    By apparel = By.xpath("//ul[@class='top-menu notmobile']/li[3]");
    By digitalDownload = By.xpath("//ul[@class='top-menu notmobile']/li[4]");
    By books = By.xpath("//ul[@class='top-menu notmobile']/li[5]");
    By jewelry = By.xpath("//ul[@class='top-menu notmobile']/li[6]");
    By giftCards = By.xpath("//ul[@class='top-menu notmobile']/li[7]");
    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");

    public String verifyWelcomeText() {
        log.info("verify homepage");
        return getTextFromElement(welcomeText);
    }

    public void selectCurrencyEuroFromDropDown() {
        log.info("select currency on homepage");
        selectByVisibleTextFromDropDown(currency, "Euro");
        //selectByValueFromDropDown(currency, "Euro");
        //selectByIndexFromDropDown(currency, 1);
    }

    public void mouseHoverToComputerAndClick() {
        log.info("click on computer on homepage");
        mouseHoverToElementAndClick(computer);
    }

    public void mouseHoverToElectronicAndClick() {
        log.info("click on electronics on homepage");
        mouseHoverToElementAndClick(electronics);
    }

    public void mouseHoverToApparelAndClick() {
        log.info("click on apparel ");
        mouseHoverToElementAndClick(apparel);
    }

    public void mouseHoverToDigitalDownloadAndClick() {
        log.info("click on digital download");
        mouseHoverToElementAndClick(digitalDownload);
    }

    public void mouseHoverToBooksAndClick() {
        log.info("click on books");
        mouseHoverToElementAndClick(books);
    }

    public void mouseHoverToJewelryAndClick() {
        log.info("click on jewelry");
        mouseHoverToElementAndClick(jewelry);
    }

    public void mouseHoverToGiftCardsAndClick() {
        log.info("click on gift cards");
        mouseHoverToElementAndClick(giftCards);
    }

    public void clickOnRegisterLink() {
        log.info("click on register link");
        clickOnElement(registerLink);
    }

    public void clickOnLoginLink() {
        log.info("click on login link");
        clickOnElement(loginLink);
    }
}