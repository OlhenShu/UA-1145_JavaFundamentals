package edu07.Task1;

public class SalariedEmployee extends Employee implements Payment {

    private final int hourPayment;

    private final String socialSecurityNumber;

    private final int workHours;



    public SalariedEmployee(String employeeId, int hourPayment, String socialSecurityNumber, int workHours) {
        super(employeeId);
        this.hourPayment = hourPayment;
        this.socialSecurityNumber = socialSecurityNumber;
        this.workHours = workHours;
    }


    @Override
    public int calculatePay() {
        return hourPayment * workHours;
    }


    @Override
    public void getInfo() {
        System.out.println("Employee ID: " + employeeId + "\n" +
                "SSN: " + socialSecurityNumber + "\n" +
                "Total worked hours: " + workHours + "\n" +
                "Payment per hour: " + hourPayment + "\n" +
                "Payment for this month: " + calculatePay());

    }
}
