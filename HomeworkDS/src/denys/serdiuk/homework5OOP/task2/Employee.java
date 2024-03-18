package denys.serdiuk.homework5OOP.task2;

public class Employee {
	private String name;
	private int age;
	private double salary;
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String report(){
		return String.format("Name: %s, Age: %d years, " + 
				"Salary: \u20B4 %.2f.", getName(), getAge(), getSalary());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


}
