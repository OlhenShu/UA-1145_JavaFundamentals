package edu07.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Bob", "1", 5000, "2949-838-345");
        employees[1] = new SalariedEmployee("Alice", "2", 5000, "2949-838-345");
        employees[2] = new ContractEmployee("John", "3", 20, 160, "7385-28384-345");
        employees[3] = new ContractEmployee("Kate", "4", 25, 160, "49595-34885");

        sortEmployeesByAverageMonthlyWage(employees);

        for (Employee employee : employees) {
            System.out.println("Employee name " + employee.getName());
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Average Monthly Wage: $" + employee.calculatePay());
            System.out.println();
        }
    }

    private static void sortEmployeesByAverageMonthlyWage(Employee[] employees) {
        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.calculatePay(), e1.calculatePay()));
    }


}

interface Payment {
    double calculatePay();
}

abstract class Employee {
    protected String name;
    protected String employeeId;


    public Employee(String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Getter method for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();
}

class SalariedEmployee extends Employee implements Payment {
    private String name;
    private double fixedSalary;
    private String socialSecurityNumber;

    public SalariedEmployee(String name, String employeeId, double fixedSalary, String socialSecurityNumber) {
        super(employeeId);
        this.name = name;
        this.fixedSalary = fixedSalary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

}

class ContractEmployee extends Employee implements Payment {
    private String name;
    private double hourlyRate; // Remove 'final' modifier
    private int hoursWorked;   // Remove 'final' modifier
    private String federalTaxId;

    public ContractEmployee(String name, String employeeId, double hourlyRate, int hoursWorked, String federalTaxId) {
        super(employeeId);
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.federalTaxId = federalTaxId;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    public String getName() {
        return name;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }
}

