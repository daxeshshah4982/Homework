package com.hrmlive.orange.demo.opensource.pages;

import com.hrmlive.orange.demo.opensource.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

    @FindBy(id = "logInPanelHeading")
    WebElement _verificationText;
    @FindBy(id = "txtUsername")
    WebElement _userName;
    @FindBy(id = "txtPassword")
    WebElement _password;
    @FindBy(id = "btnLogin")
    WebElement _loginBtn;
    @FindBy(id = "MP_link")
    WebElement _loginVerification;

    public String verifyHomePage() {
        return getTextFromElement(_verificationText);
    }

    public void enterUserName(String username) {

        sendTextToElement(_userName, username);
    }

    public void enterPassword(String password) {

        sendTextToElement(_password,password);
    }

    public void clickOnLoginButton() {
        clickOnElement(_loginBtn);
    }

    public boolean verificationOfLoginPage() {
        return verifyThatElementIsDisplayed(_loginVerification);
    }
}
