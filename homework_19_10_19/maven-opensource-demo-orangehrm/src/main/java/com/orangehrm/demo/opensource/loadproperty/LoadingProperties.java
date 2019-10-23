package com.orangehrm.demo.opensource.loadproperty;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadingProperties {
    static Properties prop;
    static FileInputStream input;
    String projectPath = System.getProperty("user.dir");

    public String getProperty(String key){
        prop = new Properties();
        try{
            input = new FileInputStream(projectPath+"\\src\\test\\java\\com\\orangehrm\\demo\\opensource\\resources\\properties\\config.properties");
            prop.load(input);
        }catch (Exception e){
            e.printStackTrace();
        }return prop.getProperty(key);
    }
}
