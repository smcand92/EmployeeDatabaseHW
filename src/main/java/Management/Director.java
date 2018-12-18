package Management;

import Staff.Employee;

public class Director extends Employee {

    private int budget;

    public Director(String name, String ni, double salary, int budget) {
        super(name, ni, salary);
        this.budget = budget;

    }




    public double payBonus() {
        return (salary * 0.02);
    }

    public int getBudget() {
        return budget;
    }
}
