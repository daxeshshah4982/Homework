package com.webappsecurity.zero.pages;

import com.webappsecurity.zero.utility.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.rmi.CORBA.Util;

public class HomePage extends Utils {
    @FindBy(xpath = "//a[@class='brand']")
    WebElement _verificationText;

    @FindBy(id = "signin_button")
    WebElement _signBtn;

    public void clickOnSignInPage(){
        clickOnElement(_signBtn);
    }
    public String getTextFromHomePage(){
        return getTextFromElement(_verificationText);
    }
}
