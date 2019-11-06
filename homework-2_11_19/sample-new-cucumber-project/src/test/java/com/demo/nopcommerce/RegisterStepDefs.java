package com.demo.nopcommerce;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterStepDefs {

    @And("^un click on newsletter tab$")
    public void unClickOnNewsletterTab() {
        new RegisterPage().clickOnNewsletter();
    }

    @And("^enter on Register button$")
    public void enterOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I should register successfully on demo nop commerce web application$")
    public void iShouldRegisterSuccessfullyOnDemoNopCommerceWebApplication() {
        String expectedText = "Your registration completed";
        try {
            Assert.assertEquals(new RegisterPage().getTextFromRegistrationConfirmationPage(), expectedText);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @And("^select day into <day> from dropdown list of Date of birth$")
    public void selectDayIntoDayFromDropdownListOfDateOfBirth() {
        new RegisterPage().selectDayInDobByValueFromDropdown("29");

    }

    @And("^pick month into <month> from dropdown list of Date of birth$")
    public void pickMonthIntoMonthFromDropdownListOfDateOfBirth() {
        new RegisterPage().selectMonthInDobByIndexFromDropDown("February");

    }

    @And("^pick Year into <year> from dropdown list of Date of birth$")
    public void pickYearIntoYearFromDropdownListOfDateOfBirth() {
        new RegisterPage().selectYearInDobByVisibleTextFromDropDown("1970");
    }

    @And("^enter first name in \"([^\"]*)\" field$")
    public void enterFirstNameInField(String first_name) {
        new RegisterPage().sendTextToFirstName((first_name));
    }

    @And("^enter last name into \"([^\"]*)\" field$")
    public void enterLastNameIntoField(String last_name) {
        new RegisterPage().sendTextToLastName((last_name));
    }

    @And("^enter email in \"([^\"]*)\" field$")
    public void enterEmailInField(String email) {
        new RegisterPage().sendTextToEmailId((email));
    }

    @And("^enter company name in \"([^\"]*)\" field$")
    public void enterCompanyNameInField(String company) {
        new RegisterPage().sendTextToCompanyName((company));
    }

    @And("^enter password in \"([^\"]*)\" field$")
    public void enterPasswordInField(String password) {
        new RegisterPage().sendTextToPassword((password));
    }

    @And("^enter confirmed password in \"([^\"]*)\" field$")
    public void enterConfirmedPasswordInField(String confirmed_password) {
        new RegisterPage().sendTextToConfirmPassword((confirmed_password));
    }

    @And("^select day (\\d+) from dropdown list of Date of birth$")
    public void selectDayFromDropdownListOfDateOfBirth(int index) {
        new RegisterPage().selectDayInDobByValueFromDropdown("29");
    }

    @And("^pick month February from dropdown list of Date of birth$")
    public void pickMonthFebruaryFromDropdownListOfDateOfBirth() {
        new RegisterPage().selectMonthInDobByIndexFromDropDown("2");
    }

    @And("^pick Year (\\d+) from dropdown list of Date of birth$")
    public void pickYearFromDropdownListOfDateOfBirth(int year) {
        new RegisterPage().selectMonthInDobByIndexFromDropDown("1970");
    }

    @And("^I reached on registration page$")
    public void iReachedOnRegistrationPage() {
    }

    @When("^I click on female gender$")
    public void iClickOnFemaleGender() {
        new RegisterPage().clickOnFemaleRadioBtn();
    }

    @Then("^I should not register successfully on demo nop commerce web application$")
    public void iShouldNotRegisterSuccessfullyOnDemoNopCommerceWebApplication() {
        new RegisterPage().verifyRegistrationNotComplete();
    }


    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I reached at registration page$")
    public void iReachedAtRegistrationPage() {
    }
}
