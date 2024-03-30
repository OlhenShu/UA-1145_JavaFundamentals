package homework7.hw7_task1;

public abstract class Employee {
    private String employeeId;
    private double salary;
    private String name;

    public Employee(String employeeId, double salary, String name) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.name = name;
    }

    public Employee() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
