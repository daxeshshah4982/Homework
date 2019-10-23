package gb.com.netflix.utility;

import gb.com.netflix.basepage.BasePage;
import org.openqa.selenium.By;

public class Util extends BasePage {
    /**
     * This method will return text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

}
