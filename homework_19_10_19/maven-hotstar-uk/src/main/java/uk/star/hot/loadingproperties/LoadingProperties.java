package uk.star.hot.loadingproperties;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadingProperties {
    String projectPath = System.getProperty("user.dir");

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key){
        prop = new Properties();
        try {
            input = new FileInputStream(projectPath + "\\src\\test\\java\\uk\\star\\hot\\resources\\propertyfiles\\config.properties");
            prop.load(input);
        }catch (Exception e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
