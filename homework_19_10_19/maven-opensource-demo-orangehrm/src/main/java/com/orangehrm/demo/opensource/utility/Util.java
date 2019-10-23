package com.orangehrm.demo.opensource.utility;

import com.orangehrm.demo.opensource.basepage.BasePage;
import org.openqa.selenium.By;

public class Util extends BasePage {

    /**
     * This method will click on element
     */
    public void clickOnWebElement(By by){
        driver.findElement(by).click();
    }
    /**
     * This method will send text to element or field
     */

    public void sendKeysToElement(By by,String str){
        driver.findElement(by).sendKeys(str);
    }
    /**
     * This method will return text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will return URL of the web application
     */
    public String getCurrentURLOfPage(){
        return driver.getCurrentUrl();

    }

}

