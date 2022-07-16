package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userName = By.id("user-name");

    public WebElement getUserName() { return driver.findElement(userName);
    }

    public void setUserName(String value) {
        getUserName().sendKeys(value);
    }

    private By passwordLogin = By.id("password");

    public WebElement getPasswordLogin() {
        return driver.findElement(passwordLogin);
    }

    public void setPasswordLogin(String value) {
        getPasswordLogin().sendKeys(value);
    }

    private By loginButton = By.id("login-button");
    public void clickLoginButton(){driver.findElement(loginButton).click();}

}
