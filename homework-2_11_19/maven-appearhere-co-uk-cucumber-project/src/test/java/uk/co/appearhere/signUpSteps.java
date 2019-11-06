package uk.co.appearhere;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.appearhere.pages.HomePage;
import uk.co.appearhere.pages.SignUpPage;

public class signUpSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        String expectedText = "https://www.appearhere.co.uk/";
        Assert.assertEquals(new HomePage().veriryHomePage(),expectedText);
    }
    @When("^I click on signup link$")
    public void iClickOnSignupLink() {
        new HomePage().clickOnSignUpLink();
    }


    @And("^I click on signup with email$")
    public void iClickOnSignupWithEmail() {
        new SignUpPage().clickOnSignUpWithEmail();
    }

    @And("^I enter \"([^\"]*)\" into the firstname field$")
    public void iEnterIntoTheFirstnameField(String firstname) {
        new SignUpPage().enterFirstName(firstname);
    }

    @And("^I enter \"([^\"]*)\" into the lastname field$")
    public void iEnterIntoTheLastnameField(String lastname) {
        new SignUpPage().enterLastName(lastname);
    }

    @And("^I enter \"([^\"]*)\" into the email field$")
    public void iEnterIntoTheEmailField(String email) {
        new SignUpPage().enterEmail(email);
    }

    @And("^I enter \"([^\"]*)\" into the password field$")
    public void iEnterIntoThePasswordField(String password) {
        new SignUpPage().enterPassword(password);
    }
    @And("^I enter on signup button$")
    public void iEnterOnSignupButton() {
        new SignUpPage().clickOnSignUpButton();
    }

    @Then("^I should able to sign up successfylly and I should see dashboard$")
    public void iShouldAbleToSignUpSuccessfyllyAndIShouldSeeDashboard() {
//        String expectedText = "Space here for every idea";
//        Assert.assertEquals(new SignUpPage().AfterSignUpVerification(),expectedText);
        Assert.assertTrue(new SignUpPage().isDashboardDisplayed());
    }




}
