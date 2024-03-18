package edu06.employeeproject;

// Main class to test Employee and Developer classes
public class Main {
    public static void main(String[] args) {
        // Create an Employee object and a Developer object
        Employee employee = new Employee("Vitalii", 42, 78000);
        Developer developer = new Developer("Antoine", 35, 32735.35, "Average Java developer");

        System.out.println("Employee: " + employee.report());
        System.out.print("\n----------------------------------------------------------------------------------\n");
        System.out.println("Developer: " + developer.report());
    }
}