package edu07.Task1;

public abstract class Employee {
    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public abstract void getInfo();


    public int calculatePay() {
        return 1;
    }
}
