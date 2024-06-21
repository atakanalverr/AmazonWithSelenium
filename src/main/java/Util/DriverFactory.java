package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;
    private static Properties properties;

    public static WebDriver initialize_Driver(String browser) {
        properties = Util.ConfigReader.getProperties();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        String url = properties.getProperty("url");
        int impWait = Integer.parseInt(properties.getProperty("implicityWait"));
        int pageWait = Integer.parseInt(properties.getProperty("pageLoadTimeout"));

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(impWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(pageWait, TimeUnit.SECONDS);

        return getDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}

/*
    DriverFactory class'ı, WebDriver'ı yapılandırmak ve kullanmak için gerekli olan paketleri içerir.
    ConfigReader aracılığıyla yapılandırma ayarlarını alır ve bu ayarlara göre WebDriver'ı yapılandırır ve başlatır.
 */