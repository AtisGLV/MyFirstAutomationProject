package mavenTestNGHomework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserTest {
    ChromeDriver driver;


    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void pageGoogle() {
        driver.get("http://google.lv");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test
    public void pageReuters() {
        driver.get("https://www.reuters.com/");
        Assert.assertEquals(driver.getTitle(), "Breaking International News & Views | Reuters");


    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.close();
    }
}