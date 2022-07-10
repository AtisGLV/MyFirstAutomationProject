package mavenTestNGHomework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {


        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.lv");

        @Test
        public void testAddMethod () {
            Calculator calculator = new Calculator();
            Assert.assertEquals(calculator.add(10, 20), 30);
        }


        @Test
        public void testSubtractMethod () {
            Calculator calculator = new Calculator();
            Assert.assertEquals(calculator.subtract(10.00, 20.00), -10.00);
        }

        @Test
        public void testDivideMethod () {
            Calculator calculator = new Calculator();
            Assert.assertEquals(calculator.divide(6.00, 3.00), 2.00);
        }

        @Test
        public void testMultiplyMethod () {
            Calculator calculator = new Calculator();
            Assert.assertEquals(calculator.multiply(2.00, 6.00), 12.00);
        }
    }}
