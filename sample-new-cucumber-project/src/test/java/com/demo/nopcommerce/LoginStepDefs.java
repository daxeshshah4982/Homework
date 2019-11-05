package com.demo.nopcommerce;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on LoginLink$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @And("^I enter email address \"([^\"]*)\" into email field$")
    public void iEnterEmailAddressIntoEmailField(String email) {
        new LoginPage().enterEmail((email));

    }

    @And("^I enter password \"([^\"]*)\" into password field$")
    public void iEnterPasswordIntoPasswordField(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should successfully login to my account$")
    public void iShouldSuccessfullyLoginToMyAccount() {
        String expectedText = "Welcome to our store";
        Assert.assertEquals(new LoginPage().LoginSuccessMessage(),expectedText);
    }


    @Then("^I should not login to my account$")
    public void iShouldNotLoginToMyAccount() {
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(new LoginPage().welcomeText(),expectedText);
    }
}
