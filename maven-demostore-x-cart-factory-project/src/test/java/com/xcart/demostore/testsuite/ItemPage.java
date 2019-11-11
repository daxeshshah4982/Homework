package com.xcart.demostore.testsuite;

import com.xcart.demostore.loadproperty.LoadProperty;
import com.xcart.demostore.pages.HomePage;
import com.xcart.demostore.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ItemPage extends TestBase {
    HomePage homePage;
    LoadProperty loadProperty;

    @Test
    public void buyLaceUpBoots(){
        homePage = new HomePage();
        loadProperty = new LoadProperty();
        homePage.clickOnSignInSignUp();
        homePage.clickOnCreateAccount();
        homePage.enterEmail(loadProperty.getProperty("email"));
        homePage.enterPassword(loadProperty.getProperty("password"));
        homePage.enterConfirmPassword(loadProperty.getProperty("password"));
        homePage.clickOnCreate();
//                                                                   System.out.println(homePage.getUrl());
        homePage.navigateToShippingPage(loadProperty.getProperty("urlshipping"));
 /*
                                                                      String expectedText1 = "My account";
                                                     Assert.assertEquals(homePage.verificationOfSingUp(),expectedText1);
                                                                     homePage.clickOnShipping();
                                                                      homePage.pickSaleFromHotDeals("Sale");
*/
        homePage.navigateToSalesPage(loadProperty.getProperty("urlsales"));
//                                                                         homePage.clickOnLaceUpBoots();
        homePage.navigateToLaceUpBoots(loadProperty.getProperty("urlboots"));
        String expectedText = "Lace-Up Boots in Light Brown";
        Assert.assertEquals(homePage.verifyItemPage(),expectedText);


    }

}
