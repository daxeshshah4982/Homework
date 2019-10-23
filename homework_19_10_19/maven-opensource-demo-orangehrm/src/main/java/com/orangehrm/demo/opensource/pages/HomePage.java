package com.orangehrm.demo.opensource.pages;

import com.orangehrm.demo.opensource.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {

    By verificationText = By.id("logInPanelHeading");
    /**
     * This method will verify that element is displayed
     */
    public String verifyTextOnHomePage(){
        return getTextFromElement(verificationText);
    }

}
