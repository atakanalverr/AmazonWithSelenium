package Util;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.Properties;

public class Hooks {

    WebDriver driver;
    Properties properties;
    @Before
    public void before() {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties = Util.ConfigReader.initialize_Properties();
        driver = Util.DriverFactory.initialize_Driver(browser);
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After
    public void after() {
        driver.quit();
    }
}

/*
    Hooks class'ı, Cucumber senaryoları için önemli işlemleri otomatik olarak yönetmek için kullanılır.
    Cucumber senaryoları test adımlarını (steps) otomatik olarak bir araya getirir ve bu adımların öncesinde
    veya sonrasında belirli işlemleri gerçekleştirmek amacıyla @Before ve @After gibi annotasyonları kullanır.
*/