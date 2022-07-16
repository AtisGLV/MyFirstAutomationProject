package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSuccessPage {
    private WebDriver driver;

    public CheckoutSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By successfulCheckout = By.xpath("//*[@id='checkout_complete_container']/h2");
    public WebElement getSuccessfulCheckout() {
        return driver.findElement(successfulCheckout);
    }
    private By backHome = By.id("back-to-products");
    public void clickBackHone(){driver.findElement(backHome).click();}
}


