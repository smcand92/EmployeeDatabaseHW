package Staff;

public abstract class Employee {
    public String name;
    public String ni;
    public double salary;

    public Employee(String name, String ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNi(){
        return this.ni;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increase){
        salary += increase;
    }

    public double payBonus() {
        return (salary * 0.01);
    }


    }

