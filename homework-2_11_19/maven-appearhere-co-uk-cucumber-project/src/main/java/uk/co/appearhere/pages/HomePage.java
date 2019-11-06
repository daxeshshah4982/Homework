package uk.co.appearhere.pages;



import org.openqa.selenium.By;
import uk.co.appearhere.utility.Util;


public class HomePage extends Util {
   // By verificationText = By.xpath("");
    By signuplink = By.xpath("//button[contains(text(),'Sign up')]");

    public String veriryHomePage(){
      return  driver.getCurrentUrl();
    }
    public void clickOnSignUpLink(){
       clickOnElement(signuplink);
    }

}
