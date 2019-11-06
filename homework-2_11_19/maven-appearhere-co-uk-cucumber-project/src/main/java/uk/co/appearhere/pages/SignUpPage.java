package uk.co.appearhere.pages;

import org.openqa.selenium.By;
import uk.co.appearhere.utility.Util;

public class SignUpPage extends Util {
    By signupemail = By.xpath("//span[contains(text(),'Sign up with Email')]");
    By first_name = By.id("firstName");
    By last_name = By.id("lastName");
    By _email = By.id("email");
    By _password = By.id("password");
    By _signupBtn = By.xpath("//button[@class='Bloom__root_bg Bloom__widthFull_a5 Bloom__mtr_46 Bloom__primary_bk']");
    By verifyAfterSignUp = By.xpath("//span[contains(text(),'Space here for every idea')]");
    By dashboard = By.xpath("//ul[@class='right']//a[contains(text(),'Dashboard')]");


    public void clickOnSignUpWithEmail() {
        clickOnElement(signupemail);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(first_name, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(last_name, lastname);
    }

    public void enterEmail(String email) {
        sendTextToElement(_email, generateRandomNumber()+email);
    }
    public void enterPassword(String password){
        sendTextToElement(_password,password);
    }
    public void clickOnSignUpButton(){
        clickOnElement(_signupBtn);
    }
//    public String AfterSignUpVerification(){
//        return getTextFromElement(verifyAfterSignUp);
//    }

    public boolean isDashboardDisplayed()
    {
        return verifyThatElementIsDisplayed(dashboard);
    }
}
