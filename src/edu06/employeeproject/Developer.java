package edu06.employeeproject;

// Developer class that extends Employee class
public class Developer extends Employee {
    private final String position;

    // Constructor to initialize Developer object with name, age, salary, and position
    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    // Override the report method to include position information
    @Override
    public String report() {
        return String.format("\nName: %s, Age: %d years, Position: %s, Salary: ₴ %.2f",
                getName(), getAge(), position, getSalary());
    }
}
