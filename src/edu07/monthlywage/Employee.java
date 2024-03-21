package edu07.monthlywage;

abstract class Employee {
    private String employeeid;
    private String name;

    public Employee(String employeeid, String name) {
        this.employeeid = employeeid;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeid = employeeld;
    }
}
