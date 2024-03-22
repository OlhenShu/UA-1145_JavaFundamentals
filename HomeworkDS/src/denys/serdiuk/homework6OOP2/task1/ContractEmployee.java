package denys.serdiuk.homework6OOP2.task1;

public class ContractEmployee extends Employee implements Payment {
	private boolean federalTaxIdMember;
	private int fixedMonthly;
	private int averageWage = 0;

	public ContractEmployee(String employeeID, boolean federalTaxIdMember, int fixedMonthly) {
		super(employeeID);
		this.setFederalTaxIdMember(federalTaxIdMember);
		this.fixedMonthly = fixedMonthly;
	}

	@Override
	public int calculatePay() {
		setAverageWage(getFixedMonthly());
		return getFixedMonthly();
	}

	public int getFixedMonthly() {
		return fixedMonthly;
	}

	public void setFixedMonthly(int fixedMonthly) {
		this.fixedMonthly = fixedMonthly;
	}

	public int getAverageWage() {
		return averageWage;
	}

	public void setAverageWage(int averageWage) {
		this.averageWage = averageWage;
	}

	public boolean isFederalTaxIdMember() {
		return federalTaxIdMember;
	}

	public void setFederalTaxIdMember(boolean federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdMember=" + federalTaxIdMember + ", fixedMonthly=" + fixedMonthly
				+ ", averageWage=" + averageWage + "]";
	}

}
