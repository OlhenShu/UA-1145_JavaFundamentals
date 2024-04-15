package edu07.task01;

abstract class Employee {
    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;

    }

    //тут я зробив "заглушки", прошу поправити, якщо це помилка
    public abstract double calculatePay();

    public abstract String getName();

}
