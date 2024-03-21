package Task1;

abstract public class Employee {
    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public abstract String output();
    public abstract int calculatePay();

    public String getEmployeeld() {
        return employeeld;
    }
}
