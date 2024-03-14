package edu05.Practical;

import java.util.Scanner;

import static java.lang.System.in;

public class PracticalTask04 {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alice", 1, 10000),
                new Employee("Bob", 2, 9000),
                new Employee("Jack", 2, 12000),
                new Employee("John", 3, 11000),
                new Employee("Marc", 3, 15000),
        };
        System.out.println("Enter department number: ");
        int departmentNumber = SCANNER.nextInt();
        boolean found = false;
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no employees from " + departmentNumber +
                    " department");
        }
        System.out.println("=".repeat(40));
        sort(employees);
        for (var employee : employees) {
            System.out.println(employee);
        }
    }

    static void sort(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }
            }
        }
    }
}

class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}