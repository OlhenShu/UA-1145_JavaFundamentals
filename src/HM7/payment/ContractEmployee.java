package HM7.payment;

public class ContractEmployee extends Employee implements Payment {
    final float compensationRate = 1000.56f;
    private String federalTaxiIDMember;

    public ContractEmployee(String employeeID, String name, String federalTaxiIDMember) {
        super(employeeID, name);
        this.federalTaxiIDMember = federalTaxiIDMember;
    }

    public String getFederalTaxiIDMember() {
        return federalTaxiIDMember;
    }

    public void setFederalTaxiIDMember(String federalTaxiIDMember) {
        this.federalTaxiIDMember = federalTaxiIDMember;
    }

    @Override
    public void calculatePay() {
        System.out.println(this.compensationRate);
    }
}
