package denys.serdiuk.homework6OOP2.task1;

public class SalariedEmployee extends Employee implements Payment {
	private String socialSecurityNumber;
	private int hourlyRate;
	private int hoursWorked;
	private int averageWage = 0;

	public SalariedEmployee(String employeeID, String socialSecurityNumber, int hourlyRate, int hoursWorked) {
		super(employeeID);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public int calculatePay() {
		setAverageWage(getHoursWorked() * getHourlyRate());
		return getHoursWorked() * getHourlyRate();
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

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getAverageWage() {
		return averageWage;
	}

	public void setAverageWage(int averageWage) {
		this.averageWage = averageWage;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", hourlyRate=" + hourlyRate
				+ ", hoursWorked=" + hoursWorked + ", averageWage=" + averageWage + "]";
	}

}
