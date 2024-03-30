package HomeWorks.HW7.Ex1;

public class ContractEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private int fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String name, int fixedMonthlyPayment) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.setMonthlySalary(calculatePay());

        employeeList.add(this);
    }


    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
}
