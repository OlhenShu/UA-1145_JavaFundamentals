package Homework_7.Task1;

import java.util.Arrays;
import java.util.Comparator;

interface Payment {
    int calculatePay();
}

public class HomeworkTask1 {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("1", "Olha", "203948", 100),
                new ContractEmployee("2", "Natalia", "484858", 130),
                new SalariedEmployee("3", "Petro", "585834939", 36_000),
                new SalariedEmployee("4", "Ivan,", "498499894", 28_960)
        };

        Arrays.sort(employees, new EmployeeResultComparator());

        for (var employee : employees) {
            System.out.println("My name is: " + employee.getName() + ", ID number is: "
                    + employee.getEmployeeld() + ", my monthly wage is: " + employee.getAverageSalary());
        }
    }
}

abstract class Employee {
    private String employeeld;
    private String name;

    public Employee(String employeeld, String name) {
        this.employeeld = employeeld;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    abstract int getAverageSalary();
}

class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdmember;
    private int workingHours;
    private int hourlyRate = 300;

    public ContractEmployee(String employeeld, String name, String federalTaxIdmember, int workingHours) {
        super(employeeld, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.workingHours = workingHours;
    }

    public int getAverageSalary() {
        return calculatePay();
    }

    @Override
    public int calculatePay() {
        return workingHours * hourlyRate;
    }
}

class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private int fixedMonthlyPayment;

    public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, int fixedMonthlyPayment) {
        super(employeeld, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public int getAverageSalary() {
        return calculatePay();
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }
}

class EmployeeResultComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp2.getAverageSalary(), emp1.getAverageSalary());
    }


}