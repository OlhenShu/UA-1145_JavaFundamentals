package HomeWorks.HW7.Ex1;

import java.util.ArrayList;

public abstract class Employee {
    private String employeeId;
    private int monthlySalary;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public static ArrayList<Employee> employeeList = new ArrayList<>();

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                '}';
    }
}
