package edu07.task01;


public class SalariedContractEmployee extends ContractEmployee {
    private double hourlyRate;
    private int numberOfHoursWorked;

    public SalariedContractEmployee(String employeeId, String federalTaxIdMember, String name, double hourlyRate, int numberOfHoursWorked) {
        super(employeeId, name, federalTaxIdMember);

        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }
}
