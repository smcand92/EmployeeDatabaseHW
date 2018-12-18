import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "UE984930C", 25000, "Finance");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNi() {
        assertEquals("UE984930C", manager.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, manager.getSalary(), 0);
    }

    @Test
    public void canChangeSalary() {
        manager.setSalary(25000);
        assertEquals(25000, manager.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(2000);
        assertEquals(27000, manager.getSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, manager.payBonus(), 0);
    }
}