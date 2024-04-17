package HomeWork07.Task1;

import HomeWork04.Task5.Dog;

public class SalariedEmployee extends Employee implements Payment, Comparable<Employee>{
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double salary, String socialSecurityNumber) {
        super(employeeId, name, salary);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double CalculatePay() {
        return getSalary();
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.getSalary(),this.getSalary());
    }

    @Override
    public String toString() {
        return "Salary Employee {" +
                "ID: " + getEmployeeId() +
                ", name: " + getName() +
                ", salary: " + getSalary() +
                ", socialSecurityNumber: " + getSocialSecurityNumber() + '}';
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

}
