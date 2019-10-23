package com.youtube.pages;

import com.youtube.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {

    By confirmationTextOfHomePage = By.id("title");

    public String getConfirmationTextFromHomePage(){
        return getTextFromElement(confirmationTextOfHomePage);
    }
}
