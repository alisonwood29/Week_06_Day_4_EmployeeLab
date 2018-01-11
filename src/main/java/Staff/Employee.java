package Staff;

public class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }


    public void raiseSalary(double amount) {
        this.salary = salary + amount;

    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
