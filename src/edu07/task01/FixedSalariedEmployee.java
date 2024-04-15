package edu07.task01;


public class FixedSalariedEmployee extends SalariedEmployee {
    private double fixedPayment;

    public FixedSalariedEmployee(String employeeId, String socialSecurityNumber, String name, double fixedPayment) {
        super(employeeId, name, socialSecurityNumber);

        this.fixedPayment = fixedPayment;

    }

    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(int fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    @Override
    public double calculatePay() {
        return fixedPayment;
    }

}
