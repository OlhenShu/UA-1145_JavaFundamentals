package Homework_6.Task2;

public class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, " + "Salary: \u20B4 %.2f.", name, age, salary);
    }
}
