package StepDefinitions;

import Pages.HomePage;
import Pages.ProductsPage;
import Pages.AddToCartPage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver;
    HomePage homePage;
    ProductsPage productsPage;
    AddToCartPage addToCartPage;

    public AmazonSteps() {
        this.driver = DriverFactory.getDriver();
        this.homePage = new HomePage(driver);
        this.productsPage = new ProductsPage(driver);
        this.addToCartPage = new AddToCartPage(driver);
    }

    @Given("Kullanici anasayfaya gitsin")
    public void userIsOnHomepage() {
        driver.get("https://www.amazon.com"); // veya ana sayfa URL'nizi buraya yazın
        homePage.acceptCookies();
    }

    @When("Arama inputuna tiklasin")
    public void clickTheSearchInput() {
        homePage.clickSearchInput();
    }

    @And("Urun ismini yazsin {string}")
    public void writeTheProductName(String productName) {
        homePage.writeProduct(productName);
    }

    @And("Ara butonuna tiklasin")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

    @And("Amazon tarafindan gonderilir filtresini secsin")
    public void filterForShippedByAmazon() {
        productsPage.filterAmazon();
    }

    @And("Markalar kismindan Apple filtresini secsin")
    public void filterForApple() {
        productsPage.filterApple();
    }

    @And("Karsisina gelen ilk urune tiklasin")
    public void clickTheFirstProduct() {
        productsPage.clickFirstProduct();
    }

    @And("Sepete eklesin")
    public void addToCart() {
        addToCartPage.addToCart();
    }

    @And("Sepete gitsin")
    public void checkAtCartPage() {
        addToCartPage.viewCart();
    }
}
