import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    Employee employee;
    Manager manager;

    @Test
    public void verifyEmployeeIncreaseAge(){
        employee = new Employee("pooja", 59 );
        Assertions.assertEquals(60, employee.incAge());



    }

    public void manager
}
