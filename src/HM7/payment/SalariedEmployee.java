package HM7.payment;

class SalariedEmployee extends Employee implements Payment {
    final int hourlyRate = 100;
    private int workHours;
    private String socialSecurityNum;

    public SalariedEmployee(String employeeID, String name, int workHours, String socialSecurityNum) {
        super(employeeID, name);
        this.workHours = workHours;
        this.socialSecurityNum = socialSecurityNum;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public String getSocialSecurityNum() {
        return socialSecurityNum;
    }

    public void setSocialSecurityNum(String socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }

    @Override
    public void calculatePay() {
        int pay = this.getWorkHours() * this.hourlyRate;
        System.out.println("Pay for " + getName() + " is: $" + pay);
    }

}

