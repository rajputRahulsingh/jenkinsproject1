package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static Properties init_prop() {

        prop = new Properties();

        try {

            FileInputStream ip = new FileInputStream(
                    "src/test/resources/config.properties");

            prop.load(ip);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return prop;
    }
}