package denys.serdiuk.homework5OOP.task2;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee denys = new Employee("Denys", 24, 280000);
		Employee taras = new Developer("Taras", 28, "Java developer", 2000000);
		
		System.out.println(denys.report());
		System.out.println(taras.report());
	}

}
