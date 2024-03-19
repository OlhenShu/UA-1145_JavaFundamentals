package homework_edu05.Practical05;

import java.util.Scanner;

public class PrTask4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alice", 1, 10_000),
                new Employee("Bob", 2, 1_000),
                new Employee("Nastia", 3, 12_000),
                new Employee("Anna", 2, 5_000),
                new Employee("Jon", 3, 17_000),

        };
        System.out.println("Enter department number: ");
        int departmentNumbers = SCANNER.nextInt();
        boolean found = false;
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumbers) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("The are no employees from " + departmentNumbers + " department.");
        }
        System.out.println("=".repeat(100));

        sort(employees);
        for (var employee : employees) {
            System.out.println(employee);
        }

    }

    static void sort(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].getSalary() < employees[j +1].getSalary()){
                    var swap = employees[j];
                    employees[j]=employees[j+1];
                    employees[j+1] = swap;
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
