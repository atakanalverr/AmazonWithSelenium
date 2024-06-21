package Pages;

import Util.ConfigReader;
import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private WebDriver driver;
    private ElementHelper elementHelper;
    private By filterAmazon = By.xpath("//span[contains(text(),'Amazon tarafından gönderilir')]");
    private By filterApple = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Apple']");
    private By firstProduct = By.xpath("//img[@alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }

    public void filterAmazon() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(filterAmazon);
    }

    public void filterApple() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(filterApple);
    }

    public void clickFirstProduct() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(firstProduct);
    }
}
