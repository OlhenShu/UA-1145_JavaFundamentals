package edu07.monthlywage;

public class ContractEmployee extends Employee implements Payment {
    final float COMPENSATION_RATE = 1000.56F;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeld, String name, String federalTaxIdMember) {
        super(employeeld, name);
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    /*public float getCompensation() {
        return compensation;
    }*/

    @Override
    public void calculatePay() {
        System.out.print(this.COMPENSATION_RATE);
    }
}
