package edu06.task2;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 35, 35683.29);
        Developer dev = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(emp.report());
        System.out.println(dev.report());
    }
}
