package denys.serdiuk.homework6OOP2.task1;

public abstract class Employee {
	public static int AverageWage;
	private String employeeID;
	public Employee(String employeeID) {
		this.employeeID = employeeID;
	}

	public abstract int calculatePay();
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + "]";
	}
}
