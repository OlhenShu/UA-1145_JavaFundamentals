package homeworks.homework_edu07.homework;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {
        Employee[] employees = {new SalariedEmployee("1", 2000.00, "120-20"),
                new SalariedEmployee("5", 5000.00, "15-02"),
                new ContractEmployee("2", 20.0, 8, "18")
        };
        Arrays.sort(employees, Comparator.comparing(Employee::theAverageMonthlySalary).reversed());

        for (Employee employee : employees){
            System.out.println("Employees ID: " + employee.getEmployeeId() + ", average monthly wage: " + employee.theAverageMonthlySalary());
        }
    }
}

interface Payment {
    void calculatePay();
}

abstract class Employee implements Payment {
    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }
    public abstract double theAverageMonthlySalary();
}

class SalariedEmployee extends Employee implements Payment {

    private double fixedMonthlyPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee(String employeeId) {
        super(employeeId);
    }

    @Override
    public double theAverageMonthlySalary() {
        return fixedMonthlyPayment;
    }

    @Override
    public void calculatePay() {
    }
}

class ContractEmployee extends Employee implements Payment {
    private double hourlyRate;
    private int numberOfHoursWorked;
    private String federalTaxIdmember;

    public ContractEmployee(String employeeId, double hourlyRate, int numberOfHoursWorked, String federalTaxIdmember) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public ContractEmployee(String employeeId) {
        super(employeeId);
    }

    @Override
    public double theAverageMonthlySalary() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public void calculatePay() {
    }

}