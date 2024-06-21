package Pages;

import Util.ConfigReader;
import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private ElementHelper elementHelper;
    private By acceptCookie = By.id("sp-cc-accept");
    private By searchInput = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }

    public void acceptCookies() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(acceptCookie);
    }

    public void clickSearchInput() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(searchInput);
    }

    public void writeProduct(String productName) {
        ConfigReader.waitBetweenOperations();
        elementHelper.findElement(searchInput).sendKeys(productName);
    }

    public void clickSearchButton() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(searchButton);
    }
}
