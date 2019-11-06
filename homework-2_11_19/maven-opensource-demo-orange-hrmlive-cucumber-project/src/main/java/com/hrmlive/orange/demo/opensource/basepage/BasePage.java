package com.hrmlive.orange.demo.opensource.basepage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static WebDriver driver;

    public BasePage() {
        String projectPath = System.getProperty("user.dir");
        PageFactory.initElements(driver,this);
    }
}
