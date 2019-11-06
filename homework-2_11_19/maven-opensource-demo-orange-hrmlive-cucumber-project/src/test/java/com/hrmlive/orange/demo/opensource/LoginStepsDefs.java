package com.hrmlive.orange.demo.opensource;

import com.hrmlive.orange.demo.opensource.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepsDefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        Assert.assertTrue(new HomePage().verifyHomePage(),true);
    }

    @When("^I enter \"([^\"]*)\" into username field$")
    public void iEnterIntoUsernameField(String username){
        new HomePage().enterUserName(username);
    }

    @And("^I enter \"([^\"]*)\" into the password field$")
    public void iEnterIntoThePasswordField(String password){
        new HomePage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton()  {

        new HomePage().clickOnLoginButton();

    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        try {
            Assert.assertTrue(new HomePage().verificationOfLoginPage());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
