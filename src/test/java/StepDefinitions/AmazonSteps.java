package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);
    @Given("Kullanici anasayfaya gitsin")
    public void userIsOnHomepage() {
        AmazonPages.HomePage();
    }

    @When("Cerezleri kabul etsin")
    public void clickAcceptCookies() {
        AmazonPages.acceptCookie();
    }

    @And("Arama inputuna tiklasin")
    public void clickTheSearchInput() {
        AmazonPages.clickSearch();
    }

    @And("Urun ismini yazsin")
    public void writeTheProductName() {
        AmazonPages.writeProduct();
    }

    @And("Ara butonuna tiklasin")
    public void clickSearchButton() {
        AmazonPages.searchButton();
    }

    @And("Amazon tarafindan gonderilir filtresini secsin")
    public void filterForShippedByAmazon() {
        AmazonPages.filterAmazon();
    }

    @And("Markalar kismindan Apple filtresini secsin")
    public void filterForApple() {
        AmazonPages.filterApple();
    }

    @And("Karsisina gelen ilk urune tiklasin")
    public void clickTheFirstProduct() {
        AmazonPages.firstProduct();
    }

    @And("Sepete eklesin")
    public void addToCart() {
        AmazonPages.addCart();
    }

    @And("Sepete gitsin")
    public void checkAtCartPage() {
        AmazonPages.checkCart();
    }
}
