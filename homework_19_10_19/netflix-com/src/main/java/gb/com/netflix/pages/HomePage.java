package gb.com.netflix.pages;

import gb.com.netflix.utility.Util;
import org.openqa.selenium.By;

public class HomePage extends Util {

    By confirmationTextOfHomePage = By.xpath("//span[@class='bill-label']");
    public String getConfirmationTextFromHomePage(){
       return getTextFromElement(confirmationTextOfHomePage);
    }
}
