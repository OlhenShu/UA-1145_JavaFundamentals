package edu07.HomeWork01;


public class SalariedEmployee extends Employee implements Payment, Comparable<Employee> {

    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, int monthlySalary, String socialSecurityNumber) {
        super(employeeId, name, monthlySalary);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.getSalary(), this.getSalary());
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Salary Employee {" +
                "ID: " + getEmployeeId() +
                ", name: '" + getName() +
                ", salary: " + getSalary() +
                '}';
    }

}
