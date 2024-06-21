package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static java.lang.System.getProperties;

public class ConfigReader {
    private static Properties properties;
    public static Properties initialize_Properties() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/config.properties");
            try {
                properties.load(fileInputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return getProperties();
    }
    public static Properties getProperties() {
        return properties;
    }
    public static void waitBetweenOperations() {
        WaitHelper.waitForSeconds(1);
    }

}

/*
    ConfigReader class'ı genel yapılandırma dosyası (config.properties) içindeki verilere erişim sağlar
    ve bu verileri projenin farklı yerlerinde kullanılabilir hale getirir. Ayrıca operasyonlar arasında belirli sürelerde
    beklemeyi sağlayan bir yardımcı metod da içerir.
 */