
import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Steven", "ND984637D", 20000);
    }


    @Test
    public void hasName(){
        assertEquals("Steven", databaseAdmin.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("ND984637D", databaseAdmin.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canChangeSalary(){
        databaseAdmin.setSalary(25000);
        assertEquals(25000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2000);
        assertEquals(22000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, databaseAdmin.payBonus(), 0);
    }
}
