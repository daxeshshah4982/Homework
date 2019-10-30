package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Util {

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/computers']")
    WebElement _computerLink;
    @FindBy(xpath = "//strong[contains(text(),'Categories')]")
    WebElement _computerConfirmationText;


    public void mouseHoverToComputerAndClick() {
        clickOnElement(_computerLink);
    }

    public String getConfirmationTextFromComputerPage() {
        return getTextFromElement(_computerConfirmationText);
    }


}
