package uk.star.hot.pages;


import org.openqa.selenium.By;
import uk.star.hot.utility.Util;


public class HomePage extends Util {
    By confirmationTextOfHomePage = By.xpath("//div[@class='signIn']");
    public String getConfirmationTextFromHomePage(){
        return getTextFromElement(confirmationTextOfHomePage);
    }
}
