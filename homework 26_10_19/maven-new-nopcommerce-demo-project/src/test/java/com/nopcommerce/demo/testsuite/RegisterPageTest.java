package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends TestBase {
    HomePage homePage ;
    RegisterPage registerPage ;
    LoadProperty loadProperty;
    SoftAssert sa ;


    @Test(groups = {"regression","sanity"})
    public void userShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        homePage = new HomePage();
        registerPage = new RegisterPage();
        sa = new SoftAssert();
        homePage.clickOnRegisterLink();
        String expectedText = "Register";
        sa.assertEquals(registerPage.getTextFromRegisterPage(), expectedText);
        Thread.sleep(5000);
    }

    @Test(groups = {"regression"})
    public void userShouldRegisterOnNopCommerceApplication() throws InterruptedException {
        homePage = new HomePage();
        registerPage = new RegisterPage();
        loadProperty = new LoadProperty();
        sa = new SoftAssert();
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
        sa.assertEquals(registerPage.getTextFromRegistrationConfirmationPage(),expectedText);
    }
}
