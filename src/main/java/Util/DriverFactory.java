package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static WebDriver driver;
    static Properties properties;
    public static WebDriver initialize_Driver(String browser) {
        properties = ConfigReader.getProperties();
        browser.equals("Chrome");
            System.setProperty("webdriver.chrome.driver", "/Users/atakanalver/Downloads/chromedriver-mac-arm64/chromedriver");
                driver = new ChromeDriver();
        String url = properties.getProperty("url");
        int pageWait = Integer.parseInt(properties.getProperty("pageLoadTimeout"));
        int impWait = Integer.parseInt(properties.getProperty("implicityWait"));
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(pageWait, TimeUnit.SECONDS);
        return getDriver();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
