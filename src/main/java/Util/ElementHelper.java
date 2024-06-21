package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action = new Actions(driver);
    }

    public WebElement findElement(By key) {
        WebElement element = presenceElement(key);
        scrollToElement(element);
        return element;
    }

    public List<WebElement> findElements(By key) {
        List<WebElement> elements = presenceElements(key);
        scrollToElement(elements.get(0));
        return elements;
    }

    public void click(By key) {
        findElement(key).click();
    }

    public void sendKey(By key, String text) {
        findElement(key).sendKeys(text);
    }

    public String getText(By key) {
        return findElement(key).getText();
    }

    public boolean checkElementText(By key, String text) {
        return wait.until(ExpectedConditions.textToBe(key, text));
    }

    public String getAttribute(By key, String attr) {
        return findElement(key).getAttribute(attr);
    }

    public WebElement presenceElement(By key) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public List<WebElement> presenceElements(By key) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(key));
    }

    public void scrollToElement(WebElement element) {

        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);
    }
}

/*
    ElementHelper class'ı, Selenium WebDriver ile web uygulamalarında sık kullanılan işlemleri
    (element bulma, tıklama, metin yazma, metin kontrolü, öznitelik kontrolü, sayfa beklemeleri vb.)
    gerçekleştirmek için geliştirilmiş bir yardımcıdır. Bu sayede test senaryolarınız veya otomasyon
    işlemlerinizde tekrar eden işlemleri daha kolay ve düzenli bir şekilde yapabilirsiniz.
 */