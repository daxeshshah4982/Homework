package gb.com.netflix.testsuite;

import gb.com.netflix.basepage.BasePage;
import gb.com.netflix.pages.HomePage;
import gb.com.netflix.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToHomepage(){
        String expectedText ="FIRST BILL";
        Assert.assertEquals(homePage.getConfirmationTextFromHomePage(),expectedText);
    }
}
