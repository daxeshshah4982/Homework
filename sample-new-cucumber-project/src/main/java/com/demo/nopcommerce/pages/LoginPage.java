package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Util {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "Email")
    WebElement _emailField;
    @FindBy(id = "Password")
    WebElement _passwordField;
    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _welcomeText;
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement _loginVerification;

    public void enterEmail(String email) {
        log.info("Enter email");
        sendTextToElement(_emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        sendTextToElement(_passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("click on Login button");
        clickOnElement(_loginBtn);
    }

    public String welcomeText() {
        return getTextFromElement(_welcomeText);
    }
    public String LoginSuccessMessage(){
        return getTextFromElement(_loginVerification);
    }
}

