package homeWork7.payment;

class SalariedEmployee extends Employee implements Payment {
    private final String name;
    private final double fixedMonthlyPayment;
    private final String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeeId);
        this.name = name;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " +
                "name='" + name + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ".";
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String getEmployeeName() {
        return name;
    }


}
