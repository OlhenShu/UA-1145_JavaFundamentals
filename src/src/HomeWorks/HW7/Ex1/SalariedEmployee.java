package HomeWorks.HW7.Ex1;

public class SalariedEmployee extends Employee implements Payment {

    private int rate;
    private String federalTaxIdMember;
    private int hoursWorked;

    public SalariedEmployee(String employeeId, String name, int rate, int hoursWorked) {
        super(employeeId, name);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
        this.setMonthlySalary(calculatePay());

        employeeList.add(this);
    }

    @Override
    public int calculatePay() {
        return getHoursWorked() * getRate();
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
