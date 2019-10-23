package uk.star.hot.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.star.hot.pages.HomePage;
import uk.star.hot.testbase.TestBase;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();
    @Test
    public void userShouldNavigateToHotStarHomepage(){
        String expectedText ="LOG IN";
        Assert.assertEquals(homePage.getConfirmationTextFromHomePage(),expectedText);

    }
}
