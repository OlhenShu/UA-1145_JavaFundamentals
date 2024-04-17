package HomeWork07.Task1;

public class ContractEmployee extends Employee implements Payment, Comparable<Employee> {
    private String federalTaxIdMember;
    private int hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember,
                            int hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double CalculatePay() {
        return getHourlyRate() * getHoursWorked();
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.getSalary(), this.getSalary());
    }

    @Override
    public String toString() {
        return "Contract Employee {" +
                "ID: " + getEmployeeId() + ", name " + getName() +
                ", hourlyRate: " + getHourlyRate() +
                ", worked hours: " + getHoursWorked() +
                ", federalTaxIdMember: " + getFederalTaxIdMember() +
                ", salary: " + CalculatePay() +
                '}';
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


}

