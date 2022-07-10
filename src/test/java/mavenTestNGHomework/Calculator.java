package mavenTestNGHomework;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculator {
    Calculator calculator;

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

    @BeforeTest
    public void beforeEverything() {
        calculator = new Calculator();
    }

    @BeforeMethod
    public void beforeCalculator() {
        System.out.println("Tests ir sācies.");

    }

    @Test
    public void testAddMethod() {
        Assert.assertEquals(calculator.add(10, 20), 30);
    }

    @Test
    public void testSubtractMethod() {
        Assert.assertEquals(calculator.subtract(10.00, 20.00), -10.00);
    }

    @Test
    public void testDivideMethod() {
        Assert.assertEquals(calculator.divide(6.00, 3.00), 2.00);
    }

    @Test
    public void testMultiplyMethod() {
        Assert.assertEquals(calculator.multiply(2.00, 6.00), 12.00);
    }
}

