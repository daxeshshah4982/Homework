package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Util {

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
        return getTextFromElement(welcomeText);
    }

    public void selectCurrencyEuroFromDropDown() {
        selectByVisibleTextFromDropDown(currency, "Euro");
        //selectByValueFromDropDown(currency, "Euro");
        //selectByIndexFromDropDown(currency, 1);
    }

    public void mouseHoverToComputerAndClick() {
        mouseHoverToElementAndClick(computer);
    }

    public void mouseHoverToElectronicAndClick() {
        mouseHoverToElementAndClick(electronics);
    }

    public void mouseHoverToApparelAndClick() {
        mouseHoverToElementAndClick(apparel);
    }

    public void mouseHoverToDigitalDownloadAndClick() {
        mouseHoverToElementAndClick(digitalDownload);
    }

    public void mouseHoverToBooksAndClick() {
        mouseHoverToElementAndClick(books);
    }

    public void mouseHoverToJewelryAndClick() {
        mouseHoverToElementAndClick(jewelry);
    }

    public void mouseHoverToGiftCardsAndClick() {
        mouseHoverToElementAndClick(giftCards);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }
}