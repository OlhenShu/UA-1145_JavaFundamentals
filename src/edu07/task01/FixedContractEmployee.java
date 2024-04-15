package edu07.task01;


public class FixedContractEmployee extends ContractEmployee {
    private double fixedPayment;

    public FixedContractEmployee(String employeeId, String federalTaxIdMember, String name, double fixedPayment) {
        super(employeeId, name, federalTaxIdMember);

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
