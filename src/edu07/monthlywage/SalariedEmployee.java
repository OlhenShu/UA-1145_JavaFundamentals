package edu07.monthlywage;

public class SalariedEmployee extends Employee implements Payment {

    final float RATE_PER_HOUR = 100;
    private String socialSecurityNumber;
    private int workHours;

    public SalariedEmployee(String employeeld, String socialSecurityNumber, int workHours) {
        super(employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.workHours = workHours;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    /*public float getRatePerHour() {
        return RATE_PER_HOUR;
    }*/

    @Override
    public void calculatePay() {
       System.out.print("Compensation: " + this.getWorkHours() * this.RATE_PER_HOUR);
    }
}
