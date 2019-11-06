package uk.co.appearhere.loadproperty;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty {
    static Properties prop;
    static FileInputStream input;
    String projectPath = System.getProperty("user.dir");

    public String getProperty(String key){
        prop = new Properties();
        try{
            input = new FileInputStream(projectPath+"\\src\\test\\java\\resources\\properties\\config.properties");
            prop.load(input);
        }catch (Exception e){
            e.printStackTrace();
        }return prop.getProperty(key);

    }
}
