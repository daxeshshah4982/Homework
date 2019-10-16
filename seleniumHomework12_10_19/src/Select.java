import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select {
    WebDriver driver;

    public Select(WebDriver driver) {
        this.driver = driver;
    }
    public void selectWebElementFromDropDown(By by){
        driver.findElement(by).click();
    }
    public void selectcheckbox(By by){
        driver.findElement(by).click();
    }

}
