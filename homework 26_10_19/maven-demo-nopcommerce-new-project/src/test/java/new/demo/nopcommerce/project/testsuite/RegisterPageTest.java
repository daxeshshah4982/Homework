package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        String expectedText = "Register";
        Assert.assertEquals(registerPage.getTextFromRegisterPage(), expectedText);
        Thread.sleep(5000);
    }

    @Test
    public void userShouldRegisterOnNopCommerceApplication() throws InterruptedException {
        homePage.clickOnRegisterLink();
        registerPage.clickOnFemaleRadioBtn();
        registerPage.sendTextToFirstName();
        registerPage.sendTextToLastName();
        registerPage.selectDayInDobByValueFromDropdown();
        registerPage.selectMonthInDobByIndexFromDropDown();
        registerPage.selectYearInDobByVisibleTextFromDropDown();
        registerPage.sendTextToEmailId();
        registerPage.sendTextToCompanyName();
        registerPage.clickOnNewsletter();
        registerPage.sendTextToPassword();
        registerPage.sendTextToConfirmPassword();
        registerPage.clickOnRegisterButton();
        Thread.sleep(5000);
        String expectedText = "Your registration completed";
        Assert.assertEquals(registerPage.getTextFromRegistrationConfirmationPage(),expectedText);
    }
}
