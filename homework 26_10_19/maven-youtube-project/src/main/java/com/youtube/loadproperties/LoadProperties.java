package com.youtube.loadproperties;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperties {
    static Properties prop;
    static FileInputStream input;
    String projectPath = System.getProperty("user.dir");

    public String getProperties(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath+"\\src\\test\\java\\com\\youtube\\resources\\propertyfiles\\config.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }

}
