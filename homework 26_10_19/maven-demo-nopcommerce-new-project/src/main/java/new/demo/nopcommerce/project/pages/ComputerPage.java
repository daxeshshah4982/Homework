package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Util {

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/computers']")
    WebElement _computerLink;
    @FindBy(xpath = "//strong[contains(text(),'Categories')]")
            WebElement _computerConfirmationText;

    //By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']");
    //By computerConfirmationText = By.xpath("//strong[contains(text(),'Categories')]");
  //  By desktopLink = By.xpath("//li[@class='inactive']//a[@href='/desktops']");

    public void mouseHoverToComputerAndClick() {
        mouseHoverToElementAndClick((By) _computerLink);
    }

    public String getConfirmationTextFromComputerPage() {
        return getTextFromElement((By)_computerConfirmationText);
    }



}
