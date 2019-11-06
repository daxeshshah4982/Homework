package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


public class RegisterPage extends Util {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    By register = By.xpath("//a[@class='ico-register']");
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By female = By.id("gender-female");
    By first_Name = By.id("FirstName");
    By last_Name = By.id("LastName");
    By day = By.xpath("//select[@name='DateOfBirthDay']");
    By month = By.xpath("//select[@name='DateOfBirthMonth']");
    By year = By.xpath("//select[@name='DateOfBirthYear']");
    By emailId = By.id("Email");
    By company = By.id("Company");
    By newsletter = By.id("Newsletter");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");
    By registrationConfirmationText = By.xpath("//div[@class ='result']");

    public void clickOnRegister() {
        log.info("click on register");
        clickOnElement(register);
    }

    public String getTextFromRegisterPage() {
        log.info("verify register page");
        return getTextFromElement(registerText);
    }

    public void clickOnFemaleRadioBtn() {
        log.info("enter female in radio button");
        clickOnElement(female);
    }

    public void sendTextToFirstName() {
        log.info("enter first name");
        sendTextToElement(first_Name, "jennifer" + generateRandomNumber());
    }

    public void sendTextToLastName() {
        log.info("enter last name");
        sendTextToElement(last_Name, generateRandomNumber() + "Anniston");
    }

    public void selectDayInDobByValueFromDropdown() {
        log.info("select date for dob");
        selectByValueFromDropDown(day, "29");
    }

    public void selectMonthInDobByIndexFromDropDown() {
        log.info("select month for dob");
        selectByIndexFromDropDown(month, 2);
    }

    public void selectYearInDobByVisibleTextFromDropDown() {
        log.info("enter year for dob");
        selectByVisibleTextFromDropDown(year, "1990");
    }

    public void sendTextToEmailId() {
        log.info("enter email");
        sendTextToElement(emailId, "jennifer" + generateRandomNumber() + "anniston@gmail.com");
    }
    public void sendTextToCompanyName(){
        log.info("enter company name");
        sendTextToElement(company,"jennifer Production");
    }
    public void clickOnNewsletter(){
        log.info("click on newsletter");
        clickOnElement(newsletter);
    }
    public void sendTextToPassword(){
        log.info("enter password");
        sendTextToElement(password,"Abc123456");
    }
    public void sendTextToConfirmPassword(){
        log.info("enter confirmed password");
        sendTextToElement(confirmPassword,"Abc123456");
    }
    public void clickOnRegisterButton(){
        log.info("click on registration button");
        clickOnElement(registerBtn);
    }
    public String getTextFromRegistrationConfirmationPage(){
        log.info("verify text after registration ");
        return getTextFromElement(registrationConfirmationText);
    }
}
