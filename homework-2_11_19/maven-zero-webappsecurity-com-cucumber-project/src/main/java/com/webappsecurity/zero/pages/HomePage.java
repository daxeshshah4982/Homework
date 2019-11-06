package com.webappsecurity.zero.pages;

import com.webappsecurity.zero.utility.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utils {
    @FindBy(xpath = "//a[@class='brand']")
    WebElement _verificationText;

    @FindBy(xpath = "//button[@id='signin_button']")
    WebElement _signBtn;

    public void clickOnSignInLink(){
        System.out.println(driver);
        clickOnElement(_signBtn);
    }
    public String getTextFromHomePage(){
        return getTextFromElement(_verificationText);
    }
}
