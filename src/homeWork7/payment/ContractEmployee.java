package homeWork7.payment;

class ContractEmployee extends Employee implements Payment {
    private final String name;
    private final double hourlyRate;
    private final int numbOfHoursWorked;
    private final String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, double hourlyRate, int numbOfHoursWorked, String federalTaxIdMember) {
        super(employeeId);
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.numbOfHoursWorked = numbOfHoursWorked;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ContractEmployee: " +
                "name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", numbOfHoursWorked=" + numbOfHoursWorked +
                ", federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ".";
    }

    @Override
    public double calculatePay() {
        return (hourlyRate * numbOfHoursWorked);
    }


    @Override
    public String getEmployeeName() {
        return name;
    }
}
