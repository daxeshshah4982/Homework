package com.webappsecurity.zero;

import com.webappsecurity.zero.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomepageSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLink();
    }

    @Then("^I should reach to sign in page$")
    public void iShouldReachToSignInPage() {
        String expectedText = "Zero Bank";
        Assert.assertEquals(new HomePage().getTextFromHomePage(),expectedText);

    }
}
