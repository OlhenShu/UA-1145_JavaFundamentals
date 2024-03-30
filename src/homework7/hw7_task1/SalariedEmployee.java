package homework7.hw7_task1;

public class SalariedEmployee extends Employee implements Payment,Comparable<Employee>{
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, double salary, String name, String socialSecurityNumber) {
        super(employeeId, salary, name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Salaried Employee {" +
                "ID: " + getEmployeeId() +
                ", name: '" + getName() +
                ", salary: " + getSalary() +
                '}';
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.getSalary(), this.getSalary());
    }
}
