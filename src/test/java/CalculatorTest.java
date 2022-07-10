import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAddMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(10, 20), 30);
    }


    @Test
    public void testSubtractMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(10.00, 20.00), -10.00);
    }

    @Test
    public void testDivideMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(6.00, 3.00), 2.00);
    }

    @Test
    public void testMultiplyMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(2.00, 6.00), 12.00);
    }
}
