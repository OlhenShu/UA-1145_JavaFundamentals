package homeWork7.payment;

abstract class Employee implements Payment {
    String employeeID;

    public Employee(String employeeID) {
        this.employeeID = employeeID;
    }

    public abstract String getEmployeeName();

}
