package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjectsHomework.*;

public class sauceDemoTests {
    ChromeDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutSuccessPage checkoutSuccessPage;


    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutSuccessPage = new CheckoutSuccessPage(driver);
    }

    @Test
    public void loginTest() {
        driver.get("https://www.saucedemo.com/");
        loginPage.setUserName("standard_user");
        loginPage.setPasswordLogin("secret_sauce");
        loginPage.clickLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        inventoryPage.clickProductButton();
        inventoryPage.clickCartButton();
        Assert.assertEquals(cartPage.getProductLink().getText(), "Sauce Labs Bolt T-Shirt");
        cartPage.clickCheckoutButton();
        checkoutPage.setFirstName("Bobby");
        checkoutPage.setLastName("Hill");
        checkoutPage.setPostalCode("1337");
        checkoutPage.clickCheckoutContinueButton();
        Assert.assertEquals(checkoutOverviewPage.getCheckoutProductLink().getText(), "Sauce Labs Bolt T-Shirt");
        checkoutOverviewPage.clickFinishCheckout();
        Assert.assertEquals(checkoutSuccessPage.getSuccessfulCheckout().getText(), "THANK YOU FOR YOUR ORDER");
        checkoutSuccessPage.clickBackHone();
    }

    @Test
    public void fieldTest() {
        driver.get("https://www.saucedemo.com/");
        loginPage.setUserName("standard_user");
        loginPage.setPasswordLogin("secret_sauce");
        loginPage.clickLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        inventoryPage.clickCartButton();
        cartPage.clickCheckoutButton();
        checkoutPage.clickCheckoutContinueButton();
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: First Name is required");
        checkoutPage.setFirstName("Jabadayah");
        checkoutPage.clickCheckoutContinueButton();
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Last Name is required");
        checkoutPage.setLastName("Abernathy");
        checkoutPage.clickCheckoutContinueButton();
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Postal Code is required");
        checkoutPage.setPostalCode("16541654");
        checkoutPage.clickCheckoutContinueButton();
    }



    @AfterMethod(alwaysRun = true)
    public void closwBrowser() {
        driver.close();
    }

}




