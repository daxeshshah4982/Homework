package com.cricinfo.espn.pages;


import com.cricinfo.espn.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {
    By confirmationTextFromHomePage = By.xpath("//section[@class='col-three']//h1[@class='module__header'][contains(text(),'Top Headlines')]");
    public String getConfirmationTextFromHomepage(){
        return getTextFromElement(confirmationTextFromHomePage);
    }
}
