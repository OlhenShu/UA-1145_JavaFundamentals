package edu06.HomeWork02;

public class Developer extends Employee {
    String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return ("Name: " + name + ", Age: "
                + age + " years, Position: "
                + position + ", Salary: " + salary);
    }
}
