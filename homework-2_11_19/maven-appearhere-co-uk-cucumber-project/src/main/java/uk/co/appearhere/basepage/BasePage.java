package uk.co.appearhere.basepage;



import org.openqa.selenium.WebDriver;

public class BasePage {
    public static WebDriver driver;

    public BasePage() {
        String projectPath = System.getProperty("user.dir");
    }
}
