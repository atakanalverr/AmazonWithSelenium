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
    Bu ConfigReader class'ı, proje içindeki yapılandırma dosyalarından (config.properties gibi)
    veri okumak ve bu verilere erişim sağlamak için kullanılır.
    Util package'ı altında bulunan ConfigReader class'ı, projenin genel yapılandırma ayarlarını yönetmek için kullanılır.
    initialize_Properties metodu, config.properties adlı dosyadan verileri yükler ve Properties objesine yüklenen verileri atar.
    FileInputStream ile config.properties dosyası okunur.
    properties.load(fileInputStream) satırıyla dosyadaki veriler Properties objesine yüklenir.
    Hata durumlarında (FileNotFoundException veya IOException) RuntimeException fırlatılır.
    Son olarak getProperties() metodu çağrılarak yüklenen Properties objesi döndürülür.
    getProperties metodu, yüklenen Properties objesini döndürür. Bu sayede diğer sınıflar veya metodlar bu objeye erişebilir
    ve içindeki ayarları okuyabilir.
    waitBetweenOperations metodu, WaitHelper sınıfındaki waitForSeconds metodunu çağırarak operasyonlar arasında belirli
    bir süre beklemeyi sağlar. Burada 1 saniye beklenmesi belirtilmiştir.
    Bu şekilde, ConfigReader class'ı genel yapılandırma dosyası (config.properties) içindeki verilere erişim sağlar
    ve bu verileri projenin farklı yerlerinde kullanılabilir hale getirir. Ayrıca operasyonlar arasında belirli sürelerde
    beklemeyi sağlayan bir yardımcı metod da içerir.
 */