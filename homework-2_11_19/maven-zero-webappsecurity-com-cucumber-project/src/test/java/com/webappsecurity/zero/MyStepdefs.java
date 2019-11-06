package com.webappsecurity.zero;

import com.webappsecurity.zero.pages.HomePage;
import com.webappsecurity.zero.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @When("^I click on signin link$")
    public void iClickOnSigninLink() {
        new SignInPage().clickOnSignInLink();
    }

    @And("^I reached at SignIn page$")
    public void iReachedAtSignInPage() {

    }

    @And("^I enter email in into \"([^\"]*)\" field$")
    public void iEnterEmailInIntoField(String email) {
        new SignInPage().sendTextToLogin(email);
    }

    @And("^enter password in into \"([^\"]*)\" field$")
    public void enterPasswordInIntoField(String password) {
        new SignInPage().sendTextToPassword(password);
    }

    @And("^click on sign in button$")
    public void clickOnSignInButton() {
        new SignInPage().clickOnSignInBtn();
    }

    @Then("^I should not sign in into application$")
    public void iShouldNotSignInIntoApplication() {
    }
}
