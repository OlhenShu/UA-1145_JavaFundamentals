package Task1;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private int fixedMonthlyPayment;

    public SalariedEmployee(String employeeld, String socialSecurityNumber, int fixedMonthlyPayment) {
        super(employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "Information about employee: " +
                "\nID: " + getEmployeeld() +
                "\nSocial Security Number: " + socialSecurityNumber +
                "\nAverage monthly wage: " + calculatePay()
                + " ";
    }

    @Override
    public String output() {
        return "The number " + getEmployeeld() + " has fixed monthly payment\n" + toString() + "\n";
    }

}
