package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    private By productButton = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    public void clickProductButton(){driver.findElement(productButton).click();}

    private By cartButton = By.id("shopping_cart_container");
    public void clickCartButton(){driver.findElement(cartButton).click();}
}