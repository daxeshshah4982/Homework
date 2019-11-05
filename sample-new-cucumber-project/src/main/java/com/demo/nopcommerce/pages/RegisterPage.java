package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends Util {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
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
    @FindBy(xpath = "//strong[contains(text(),'Your Password')]")
    WebElement _registrationNotComplete;


    public void clickOnRegister() {
        log.info("click on Register link");
        clickOnElement(_register);
    }

    public String getTextFromRegisterPage() {
        log.info("Verifying register page");
        return getTextFromElement(_registerText);
    }

    public void clickOnFemaleRadioBtn() {
        log.info("click on female radio button");
        clickOnElement(_female);
    }

    public void sendTextToFirstName(String first_name) {
        log.info("Enter first name");
        sendTextToElement(_first_Name, first_name );
    }

    public void sendTextToLastName(String last_name) {
        log.info("Enter last name");
        sendTextToElement(_last_Name, last_name );
    }

    public void selectDayInDobByValueFromDropdown(String date) {
        log.info("Select day for date of birth");
        selectByVisibleTextFromDropDown(_day, "29");
    }

    public void selectMonthInDobByIndexFromDropDown(String month) {
        log.info("Select month for date of birth");
        selectByIndexFromDropDown(_month, 2);
    }

    public void selectYearInDobByVisibleTextFromDropDown(String year) {
        log.info("Select yeat for date of birth");
        selectByVisibleTextFromDropDown(_year, "1990");
    }

    public void sendTextToEmailId(String email) {
        log.info("Enter Email");
        sendTextToElement(_emailId,  generateRandomNumber()+ email);
    }

    public void sendTextToCompanyName(String company) {
        log.info("Enter comapny name");
        sendTextToElement(_company, company);
    }

    public void clickOnNewsletter() {
        log.info("click on newsletter checkbox");
        clickOnElement(_newsletter);
    }

    public void sendTextToPassword(String password) {
        log.info("Enter password");
        sendTextToElement(_password, password);
    }

    public void sendTextToConfirmPassword(String confirmed_password) {
        log.info("Enter confirmed password");
        sendTextToElement(_confirmationPassword, confirmed_password);
    }

    public void clickOnRegisterButton() {
        log.info("click on register button");
        clickOnElement(_registerBtn);
    }

    public String getTextFromRegistrationConfirmationPage() {
        log.info("Verify registration");
        return getTextFromElement(_registrationConfirmationText);
    }

    public String verifyRegistrationNotComplete(){
        log.info("Registration incomplete");
        return getTextFromElement(_registrationNotComplete);
    }
}
