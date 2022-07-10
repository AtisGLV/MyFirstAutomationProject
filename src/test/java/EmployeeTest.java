import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest {
    @Test
    public void employeeNameTest() {
        Employee emp = new Employee();
        emp.setName("Buberts");
        Assert.assertEquals(emp.getName(), "Buberts");

    }

    @Test
    public void employeeSurnameTest() {
        Employee emp = new Employee();
        emp.setSurname("Jojo");
        Assert.assertEquals(emp.getSurname(), "Jojo");

    }
    @Test
    public void employeeYearTest() {
        Employee emp = new Employee();
        emp.setYear(1988);
        Assert.assertEquals(emp.getYear(), 1988);

    }
    @Test
    public void employeeRoleTest() {
        Employee emp = new Employee();
        emp.setRole("Rabbit");
        Assert.assertEquals(emp.getRole(), "Rabbit");

    }
@Test
    public void testAllArguments() {
        Employee emp = new Employee("Buberts", "Jojo", 1988, "Rabbit");
        Assert.assertEquals(emp.getName(), "Buberts");
        Assert.assertEquals(emp.getSurname(), "Jojo");
        Assert.assertEquals(emp.getYear(), 1988);
        Assert.assertEquals(emp.getRole(), "Rabbit");



}
}
