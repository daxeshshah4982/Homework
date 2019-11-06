package com.webappsecurity.zero.pages;

import com.webappsecurity.zero.pages.HomePage;
import com.webappsecurity.zero.utility.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends Utils {
    HomePage homePage;

    @FindBy(id ="user_login")
    WebElement _login;
    @FindBy(id ="user_password")
    WebElement _password;
    @FindBy(xpath = "//input[@name='submit']")
    WebElement _signInBtn;
    @FindBy(xpath = "//a[@class='brand']")
    WebElement _verificationText;
    @FindBy(xpath = "//button[@id='signin_button']")
    WebElement _signBtn;

    public void clickOnSignInLink(){
        System.out.println(driver);
        clickOnElement(_signBtn);
    }


    public void sendTextToLogin(String emailid){
        sendTextToElement(_login, emailid);
    }
    public void sendTextToPassword(String password){
        sendTextToElement(_password,password);
    }
    public void clickOnSignInBtn(){
        clickOnElement(_signInBtn);
    }
    public String getTextFromHomePage(){
        return getTextFromElement(_verificationText);
    }

}
