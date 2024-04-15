package edu07.task01;


abstract class SalariedEmployee extends Employee implements Payment {
    private String name;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        super(employeeId);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public abstract double calculatePay();
}

