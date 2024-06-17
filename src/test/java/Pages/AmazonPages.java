package Pages;

import Util.ConfigReader;
import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    static By acceptCookie = By.id("sp-cc-accept");
    static By clickSearch = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By filterAmazon = By.xpath("//span[contains(text(),'Amazon tarafından gönderilir')]");
    static By filterApple = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Apple']");
    static By firstProduct = By.xpath("//img[@alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");
    static By addCart = By.xpath("//input[@id='add-to-cart-button']");
    static By checkCart = By.xpath("//a[@href='/cart?ref_=sw_gtc']");

    public AmazonPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void acceptCookie() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(acceptCookie);
    }

    public static void clickSearch() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(clickSearch);
    }

    public static void writeProduct() {
        ConfigReader.waitBetweenOperations();
        elementHelper.findElement(clickSearch).sendKeys("AirPods");
    }

    public static void searchButton() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(filterAmazon);
    }

    public static void filterApple() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(filterApple);
    }

    public static void firstProduct() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(firstProduct);
    }

    public static void addCart() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(addCart);
    }

    public static void checkCart() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(checkCart);
    }
}
