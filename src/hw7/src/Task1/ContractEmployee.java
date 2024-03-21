package Task1;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIdmember;
    private int hourlyRate;
    private int hoursWorked;
    public ContractEmployee(String employeeld, String federalTaxIdmember, int hourlyRate, int hoursWorked) {
        super(employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return "Information about employee: " +
                "\nID: " + getEmployeeld() +
                "\nFederal tax member`s id: " + federalTaxIdmember +
                "\nHourly rate: " + hourlyRate +
                "\nNumber of worked hours: " + hoursWorked +
                "\nAverage monthly wage: " + calculatePay()
                + " ";
    }

    @Override
    public String output() {
        return "The number " + getEmployeeld() + " is hourly-paid worker\n" + toString() +"\n";
    }
}
