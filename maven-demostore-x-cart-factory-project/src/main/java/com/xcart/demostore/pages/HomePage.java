package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]")
    WebElement _signup;
    @FindBy(xpath = "//a[contains(@class,'popup-button default-popup-button create-account-link')]")
    WebElement _accountCreation;
    @FindBy(id = "login")
    WebElement _emailfield;
    @FindBy(id = "password")
    WebElement _passwordfield;
    @FindBy(id = "password-conf")
    WebElement _confirmpasswordfield;
    @FindBy(xpath = "//div[contains(@class,'button submit')]//button[starts-with(@class,'btn')]")
    WebElement _submit;
    //    @FindBy(id = "page-title")
//    WebElement _verifysignup;
//    @FindBy(xpath = "//ul[@class='mm-listview']//li[@class='leaf']//a[@href='shipping']")
//    WebElement _shipping;
//    @FindBy(xpath = "//div[@class='collapse navbar-collapse']//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf active has-sub']//span[contains(text(),'Hot deals')]")
//    WebElement _hotdeals;
//    @FindBy(xpath = "//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf active has-sub']//span[contains(text(),'Sale')]")
//    WebElement _hotdeals;
//    @FindBy(xpath = "//div[@class='product productid-26']//img[@class='photo ls-is-cached lazyloaded']")
//    WebElement _laceupboots;
    @FindBy(xpath = "//h1[@class='fn title']")
    WebElement _verificationText;

    public void clickOnSignInSignUp() {
        log.info("click on signin/signup");
        clickOnElement(_signup);
    }

    public void clickOnCreateAccount() {
        log.info("click on create account");
        clickOnElement(_accountCreation);
    }

    public void enterEmail(String email) {
        log.info("Enter email");
        sendTextToElement(_emailfield, generateRandomNumber() + email);
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        sendTextToElement(_passwordfield, password);
    }

    public void enterConfirmPassword(String password) {
        log.info("Enter confirm password");
        sendTextToElement(_confirmpasswordfield, password);
    }

    public void clickOnCreate() {
        log.info("click on create button");
        clickOnElement(_submit);
    }
    /*
        Here in below method we can get the current url of the web application

        public String getUrl() {
            return driver.getCurrentUrl();
        }

         Here in this programme locators are not able to move page from one to another so
            navigating the whole page bu using url

                public void clickOnShipping() {
                mouseHoverToElement(_shipping);
                clickOnElement(_shipping);
            }

         */
    public void navigateToShippingPage(String urlshipping) {
        log.info("After refreshing the webpage page will navigate to shipping page");
        driver.navigate().refresh();
        driver.navigate().to(urlshipping);
    }

    /*     public void pickSaleFromHotDeals(String Sale) {
         selectByVisibleTextFromDropDown(_hotdeals, Sale);
         clickOnElement(_hotdeals);
     }

     */
    public void navigateToSalesPage(String urlsales) {
        log.info("page will navigate ro sale page");
        driver.navigate().to(urlsales);
    }

    /*
   public String verificationOfSingUp(){
        return getTextFromElement(_verifysignup);
   }
     */
    public void navigateToLaceUpBoots(String urlboots) {
        log.info("page will navigate ro shopping list,here in this case boots");
        driver.navigate().to(urlboots);
    }

    /*
           public void clickOnLaceUpBoots() {
           clickOnElement(_laceupboots);
        }
    */
    public String verifyItemPage() {
        log.info("Verifying the item page");
        return getTextFromElement(_verificationText);
    }
}
