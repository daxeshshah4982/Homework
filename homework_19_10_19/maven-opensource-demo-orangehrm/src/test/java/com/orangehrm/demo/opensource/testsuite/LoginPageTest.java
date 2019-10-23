package com.orangehrm.demo.opensource.testsuite;

import com.orangehrm.demo.opensource.loadproperty.LoadingProperties;
import com.orangehrm.demo.opensource.pages.LoginPage;
import com.orangehrm.demo.opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    LoadingProperties loadingProperties = new LoadingProperties();

    @Test
    public void userShouldLogInSuccessfully() {
        loginPage.enterUserName(loadingProperties.getProperty("username"));
        loginPage.enterPassword(loadingProperties.getProperty("password"));
        loginPage.clickOnLoginButton();
        String URL = loginPage.afterLogInPageUrl();
        Assert.assertEquals(URL, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    }
}
