package com.webappsecurity.zero.testsuite;

import com.webappsecurity.zero.loadproperty.LoadProperty;
import com.webappsecurity.zero.pages.SignInPage;
import com.webappsecurity.zero.testbase.TestBase;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {
    SignInPage signInPage;
    LoadProperty loadProperty;

    @Test
    public void userShouldNotLogInWithInvalidCredential(){
        signInPage = new SignInPage();
        loadProperty = new LoadProperty();
        signInPage.sendTextToLogin(loadProperty.getProperty("emailid"));
        signInPage.sendTextToPassword(loadProperty.getProperty("password"));
    }
}
