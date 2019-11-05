package com.demo.nopcommerce;

import com.demo.nopcommerce.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefs {


    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String category) {
        if (category.equalsIgnoreCase("computer")) {
            new HomePage().mouseHoverToComputerAndClick();
        } else if (category.equalsIgnoreCase("electronics")) {
            new HomePage().mouseHoverToElectronicAndClick();
        } else if (category.equalsIgnoreCase("apparel")) {
            new HomePage().mouseHoverToApparelAndClick();
        } else if (category.equalsIgnoreCase("Digital Downloads")) {
            new HomePage().mouseHoverToDigitalDownloadAndClick();
        } else if (category.equalsIgnoreCase("books")) {
            new HomePage().mouseHoverToBooksAndClick();
        } else if (category.equalsIgnoreCase("jewelry")) {
            new HomePage().mouseHoverToJewelryAndClick();
        } else if (category.equalsIgnoreCase("gift cards")) {
            new HomePage().mouseHoverToGiftCardsAndClick();
        }
    }


    @Then("^it should show dropdown list of \"([^\"]*)\"$")
    public void itShouldShowDropdownListOf(String arg0) {
    }
}
