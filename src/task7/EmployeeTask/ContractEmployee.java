package EmployeeTask;

public class ContractEmployee extends Employee {
    private int numberOfHoursWorked;
    private int hourlyRate;
    private String federalTaxIdmember;

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, int numberOfHoursWorked, int hourlyRate) {
        super(employeeId, name, numberOfHoursWorked * hourlyRate);
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public double calculatePay() {
        return numberOfHoursWorked * hourlyRate;
    }
}
