package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstName = By.id("first-name");

    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }

    public void setFirstName(String value) {
        driver.findElement(firstName).sendKeys(value);
    }

    private By lastName = By.id("last-name");

    public WebElement getLastName() {
        return driver.findElement(lastName);
    }

    public void setLastName(String value) {
        driver.findElement(lastName).sendKeys(value);
    }

    private By postalCode = By.id("postal-code");

    public WebElement getPostalCode() {
        return driver.findElement(postalCode);
    }

    public void setPostalCode(String value) {
        driver.findElement(postalCode).sendKeys(value);
    }

    private By checkoutContinueButton = By.id("continue");

    public void clickCheckoutContinueButton() {
        driver.findElement(checkoutContinueButton).click();
    }


    private By errorMessage = By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]");
    public WebElement getErrorMessage() {
        return driver.findElement(errorMessage);
    }
}
