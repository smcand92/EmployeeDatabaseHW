import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Betty", "KE8654325B", 30000, 50000);
    }

    @Test
    public void canGetBudget(){
        assertEquals(50000, director.getBudget());
    }

    @Test
    public void hasName() {
        assertEquals("Betty", director.getName());
    }

    @Test
    public void hasNi() {
        assertEquals("KE8654325B", director.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, director.getSalary(), 0);
    }

    @Test
    public void canChangeSalary() {
        director.setSalary(25000);
        assertEquals(25000, director.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(2000);
        assertEquals(32000, director.getSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(600, director.payBonus(), 0);
    }
}
