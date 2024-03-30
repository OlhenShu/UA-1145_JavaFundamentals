package homework7.hw7_task1;

public class ContractEmployee extends Employee implements Payment, Comparable<Employee>{
    private String federalTaxIdMember;
    private int numberOfHoursWorked;
    private int hourlyRate;

    public ContractEmployee(String employeeId, double salary, String name, String federalTaxIdMember, int numberOfHoursWorked, int hourlyRate) {
        super(employeeId, salary, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "Contract Employee {" +
                "ID: " + getEmployeeId() +
                ", hourlyRate: " + hourlyRate +
                ", workedHours: " + numberOfHoursWorked +
                ", federalTaxIdMember: '" + federalTaxIdMember + '\'' +
                ", name: " + getName() +
                ", salary: " + getSalary() +
                '}';
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.getSalary(), this.getSalary());
    }
}
