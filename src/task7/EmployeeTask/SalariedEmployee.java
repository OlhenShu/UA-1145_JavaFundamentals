package EmployeeTask;

public class SalariedEmployee extends Employee {
    private double fixedMonthlyPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeeId, name, fixedMonthlyPayment);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
