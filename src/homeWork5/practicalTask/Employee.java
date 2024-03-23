package homeWork5.practicalTask;

import java.util.Scanner;

public class Employee {
    private final String name;
    private final int departmentNumber;
    private final double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public static void filterByDepartment(Employee[] employees, int departmentNumber) {
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee.getName() + " belongs to the department " + departmentNumber);
            }
        }
    }

    public static void sortBySalaryDescending(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        System.out.println("Employees sorted by salary (descending):");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has the salary ->> " + employee.getSalary());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = {
                new Employee("John", 1, 65345.45),
                new Employee("Jane", 2, 70000.00),
                new Employee("Alice", 2, 56000.50),
                new Employee("Bob", 1, 48000.75),
                new Employee("Charlie", 3, 82000.25)
        };

        System.out.println("Please enter the department number --> ");
        int department = scanner.nextInt();

        filterByDepartment(employees, department);
        sortBySalaryDescending(employees);
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

}












