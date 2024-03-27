package edu07.HomeWork01;

public class ContractEmployee extends Employee implements Payment, Comparable<Employee> {

    private int hourlyRate;
    private int workedHours;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, int hourlyRate, int workedHours, String federalTaxIdmember) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
        this.federalTaxIdMember = federalTaxIdmember;
    }

    public void setId(String employeeId) {
        this.setEmployeeId(employeeId);
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdMember = federalTaxIdmember;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * workedHours;
    }

    @Override
    public double getSalary() {
        return calculatePay();
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.getSalary(), this.getSalary());
    }

    @Override
    public String toString() {
        return "Contract Employee {" +
                "ID: " + getEmployeeId() +
                ", hourlyRate: " + hourlyRate +
                ", workedHours: " + workedHours +
                ", federalTaxIdMember: '" + federalTaxIdMember + '\'' +
                ", name: " + getName() +
                ", salary: " + getSalary() +
                '}';
    }
}
