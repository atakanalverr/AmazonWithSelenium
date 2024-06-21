    package testRunners;

    import Util.DriverFactory;
    import io.cucumber.testng.AbstractTestNGCucumberTests;
    import io.cucumber.testng.CucumberOptions;
    import org.openqa.selenium.WebDriver;

    @CucumberOptions(
            features = {"src/test/java/Features"},
            glue = {"StepDefinitions", "Util"},
            tags = "",
            plugin = {"summary", "pretty", "html:Reports/CucumberReport/Reports.html"}
    )

    public class Runner extends AbstractTestNGCucumberTests {
        static WebDriver driver = DriverFactory.getDriver();
    }

/*
    testRunners package'ı altında bulunan bu class, test senaryolarının çalıştırılmasını sağlayacaktır.
    DriverFactory class'ını ve Selenium WebDriver'ı kullanmak için gerekli importlar yukarıda yapılmış.
    @CucumberOptions anotasyonu, Cucumber testlerini nasıl yapılandıracağımızı belirtir. (8-12. satırlar)
    features: Test senaryolarının yer aldığı dosya veya dizinleri belirtir. Burada
    "src/test/java/Features" dizinindeki senaryolar kullanılacak demektir.
    glue: Test senaryolarındaki adımların (step definitions) ve yardımcı sınıfların bulunduğu paketleri
    veya dizinleri belirtir. Burada "StepDefinitions" ve "Util" paketleri kullanılacak demektir.
    tags: Çalıştırılacak senaryoların etiketlerini belirtir. Boş bırakıldığı için tüm senaryoları çalıştıracaktır.
    plugin: Test sonuçlarının nasıl raporlanacağını belirtir. Burada summary, pretty ve html raporlama formatları
    seçilmiştir. HTML raporu "Reports/CucumberReport/Reports.html" dizinine kaydedilecektir.
*/
