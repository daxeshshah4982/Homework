import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility {
    WebDriver driver;

    public Utility(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnWebElement(By by) {
        driver.findElement(by).click();
    }

    public void clearKeysToWebElement(By by) {
        driver.findElement(by).clear();
    }

    public void sendKeysToWebElement(By by, String str) {
        driver.findElement(by).sendKeys(str);
    }


}
