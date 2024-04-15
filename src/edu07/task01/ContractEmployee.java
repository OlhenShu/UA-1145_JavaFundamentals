package edu07.task01;


abstract class ContractEmployee extends Employee implements Payment {
    private String name;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember) {
        super(employeeId);
        this.name = name;
        this.federalTaxIdMember = federalTaxIdMember;

    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override

    public abstract double calculatePay();
}
