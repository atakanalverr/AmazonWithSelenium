package Pages;

import Util.ConfigReader;
import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
    private WebDriver driver;
    private ElementHelper elementHelper;
    private By addToCartButton = By.xpath("//input[@id='add-to-cart-button']");
    private By viewCartLink = By.xpath("//a[@href='/cart?ref_=sw_gtc']");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }

    public void addToCart() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(addToCartButton);
    }

    public void viewCart() {
        ConfigReader.waitBetweenOperations();
        elementHelper.click(viewCartLink);
    }
}
