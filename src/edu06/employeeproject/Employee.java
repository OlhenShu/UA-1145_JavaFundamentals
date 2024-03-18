package edu06.employeeproject;

// Employee class to represent an employee
public class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor to initialize Employee object with name, age, and salary
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to generate a report about the employee
    public String report() {
        return String.format("\nName: %s, Age: %d, Salary: ₴ %.2f", name, age, salary);
    }

    // Getters and setters for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
