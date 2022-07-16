package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {
    private WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    private By checkoutProductLink = By.id("item_1_title_link");
    public WebElement getCheckoutProductLink() {
        return driver.findElement(checkoutProductLink);
    }

    private By finishCheckout = By.id("finish");
        public void clickFinishCheckout(){driver.findElement(finishCheckout).click();}
}
