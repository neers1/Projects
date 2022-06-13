import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void creditScoreToolTest(){
        Customer customer = new Customer("Neha", 20, 0.4);
        Account account = new Account(customer);
        Assertions.assertEquals(1.0, account.getInterest());



    }
    @Test
    public void creditScoreToolTest1(){
        Customer customer = new Customer("Neha", 25, 1);
        Account account = new Account(customer);
        Assertions.assertEquals(1.31, account.getInterest());

    }
}

