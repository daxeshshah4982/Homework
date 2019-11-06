package com.nopcommerce.demo.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static WebDriver driver;

    public BasePage() {

        PageFactory.initElements(driver,this);
        String projectPath = System.getProperty("user.dir");

        PropertyConfigurator.configure(projectPath+"\\src\\test\\java\\com\\nopcommerce\\demo\\resorces\\propertyfiles\\log4j.properties");
    }
}
