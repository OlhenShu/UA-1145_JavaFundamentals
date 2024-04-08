package edu07.Task1;

public class ContractEmployee extends Employee implements Payment {

    private final int fixedPayment;
    private final String federalTaxIdMember;

    public ContractEmployee(String employeeId, int fixedPayment, String federalTaxIdMember) {
        super(employeeId);
        this.fixedPayment = fixedPayment;
        this.federalTaxIdMember = federalTaxIdMember;
    }


    @Override
    public int calculatePay() {
        return fixedPayment;
    }

    @Override
    public void getInfo() {
        System.out.println("Employee ID" + employeeId + "\n" +
                "Payment per month: " + fixedPayment + "\n" +
                "FEIN: " + federalTaxIdMember);
    }
}
