package com.webappsecurity.zero.pages;

import com.webappsecurity.zero.basepage.BasePage;
import com.webappsecurity.zero.utility.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends Utils {
    HomePage homePage;

    @FindBy(id ="user_login")
    WebElement _login;
    @FindBy(id ="user_password")
    WebElement _password;


    public void sendTextToLogin(String email){
        sendTextToElement(_login, "emailid");
    }
    public void sendTextToPassword(String password){
        sendTextToElement(_password,"password");
    }

}
