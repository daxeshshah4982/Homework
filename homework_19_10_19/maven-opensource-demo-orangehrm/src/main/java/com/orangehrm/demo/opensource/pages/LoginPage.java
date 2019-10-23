package com.orangehrm.demo.opensource.pages;

import com.orangehrm.demo.opensource.utility.Util;
import org.openqa.selenium.By;

public class LoginPage extends Util {
    By userNameField = By.id("txtUsername");
    By passWordField = By.id("txtPassword");
    By loginBtn = By.id("btnLogin");


    public void enterUserName(String username) {
        sendKeysToElement(userNameField,username);
    }

    public void enterPassword(String password) {
        sendKeysToElement(passWordField,password);
    }

    public void clickOnLoginButton() {
        clickOnWebElement(loginBtn);
    }
    public String afterLogInPageUrl(){
        return getCurrentURLOfPage();
    }

}
