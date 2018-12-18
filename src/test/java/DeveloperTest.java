import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Steven", "ND984637D", 20000);
    }


    @Test
    public void hasName(){
        assertEquals("Steven", developer.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("ND984637D", developer.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, developer.getSalary(), 0);
    }

    @Test
    public void canChangeSalary(){
        developer.setSalary(25000);
        assertEquals(25000, developer.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000);
        assertEquals(22000, developer.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, developer.payBonus(), 0);
    }
}

