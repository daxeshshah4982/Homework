package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;


public class RegisterPage extends Util {
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
        clickOnElement(register);
    }

    public String getTextFromRegisterPage() {
        return getTextFromElement(registerText);
    }

    public void clickOnFemaleRadioBtn() {
        clickOnElement(female);
    }

    public void sendTextToFirstName() {
        sendTextToElement(first_Name, "jennifer" + generateRandomNumber());
    }

    public void sendTextToLastName() {
        sendTextToElement(last_Name, generateRandomNumber() + "Anniston");
    }

    public void selectDayInDobByValueFromDropdown() {
        selectByValueFromDropDown(day, "29");
    }

    public void selectMonthInDobByIndexFromDropDown() {
        selectByIndexFromDropDown(month, 2);
    }

    public void selectYearInDobByVisibleTextFromDropDown() {
        selectByVisibleTextFromDropDown(year, "1990");
    }

    public void sendTextToEmailId() {
        sendTextToElement(emailId, "jennifer" + generateRandomNumber() + "anniston@gmail.com");
    }
    public void sendTextToCompanyName(){
        sendTextToElement(company,"jennifer Production");
    }
    public void clickOnNewsletter(){
        clickOnElement(newsletter);
    }
    public void sendTextToPassword(){
        sendTextToElement(password,"Abc123456");
    }
    public void sendTextToConfirmPassword(){
        sendTextToElement(confirmPassword,"Abc123456");
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerBtn);
    }
    public String getTextFromRegistrationConfirmationPage(){
        return getTextFromElement(registrationConfirmationText);
    }
}
