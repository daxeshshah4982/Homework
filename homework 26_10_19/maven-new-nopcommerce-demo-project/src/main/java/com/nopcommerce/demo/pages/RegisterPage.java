package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends Util {
    @FindBy(id = "gender-female")
    WebElement _female;
    @FindBy(id = "FirstName")
    WebElement _first_Name;
    @FindBy(id = "LastName")
    WebElement _last_Name;
    @FindBy(id = "Email")
    WebElement _emailId;
    @FindBy(id = "Company")
    WebElement _company;
    @FindBy(id = "Newsletter")
    WebElement _newsletter;
    @FindBy(id = "Password")
    WebElement _password;
    @FindBy(id = "ConfirmPassword")
    WebElement _confirmationPassword;
    @FindBy(id = "register-button")
    WebElement _registerBtn;
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _register;
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement _registerText;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement _month;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement _day;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement _year;
    @FindBy(xpath = "//div[@class ='result']")
    WebElement _registrationConfirmationText;


    public void clickOnRegister() {
        clickOnElement(_register);
    }

    public String getTextFromRegisterPage() {
        return getTextFromElement(_registerText);
    }

    public void clickOnFemaleRadioBtn() {
        clickOnElement(_female);
    }

    public void sendTextToFirstName() {
        sendTextToElement(_first_Name, "jennifer" + generateRandomNumber());
    }

    public void sendTextToLastName() {
        sendTextToElement(_last_Name, generateRandomNumber() + "Anniston");
    }

    public void selectDayInDobByValueFromDropdown() {
        selectByVisibleTextFromDropDown(_day, "29");
    }

    public void selectMonthInDobByIndexFromDropDown() {
        selectByIndexFromDropDown(_month, 2);
    }

    public void selectYearInDobByVisibleTextFromDropDown() {
        selectByVisibleTextFromDropDown(_year, "1990");
    }

    public void sendTextToEmailId() {
        sendTextToElement(_emailId, "jennifer" + generateRandomNumber() + "anniston@gmail.com");
    }

    public void sendTextToCompanyName() {
        sendTextToElement(_company, "jennifer Production");
    }

    public void clickOnNewsletter() {
        clickOnElement(_newsletter);
    }

    public void sendTextToPassword() {
        sendTextToElement(_password, "Abc123456");
    }

    public void sendTextToConfirmPassword() {
        sendTextToElement(_confirmationPassword, "Abc123456");
    }

    public void clickOnRegisterButton() {
        clickOnElement(_registerBtn);
    }

    public String getTextFromRegistrationConfirmationPage() {
        return getTextFromElement(_registrationConfirmationText);
    }
}
