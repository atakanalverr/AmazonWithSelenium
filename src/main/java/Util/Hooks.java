package Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.Properties;

public class Hooks {

    private WebDriver driver;
    private Properties properties;

    @Before
    public void beforeScenario() {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties = Util.ConfigReader.initialize_Properties();
        driver = Util.DriverFactory.initialize_Driver(browser);
    }

    @After
    public void afterScenario() throws InterruptedException {
        Thread.sleep(3000); {
            driver.quit();
        }
    }
}

/*
    Hooks class'ı, Cucumber senaryoları için önemli işlemleri otomatik olarak yönetmek için kullanılır.
    Cucumber senaryoları test adımlarını (steps) otomatik olarak bir araya getirir ve bu adımların öncesinde
    veya sonrasında belirli işlemleri gerçekleştirmek amacıyla @Before ve @After gibi annotasyonları kullanır.
*/