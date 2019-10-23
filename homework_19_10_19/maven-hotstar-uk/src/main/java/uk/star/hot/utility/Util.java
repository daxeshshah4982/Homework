package uk.star.hot.utility;

import org.openqa.selenium.By;
import uk.star.hot.basepage.BasePage;

public class Util extends BasePage {
    /**
     * This method will return text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
}
