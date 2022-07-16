package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By productLink = By.id("item_1_title_link");
public WebElement getProductLink() {
    return driver.findElement(productLink);

}

    private By checkoutButton = By.id("checkout");
    public void clickCheckoutButton(){driver.findElement(checkoutButton).click();}
    }