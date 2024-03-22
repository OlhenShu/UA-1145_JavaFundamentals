package denys.serdiuk.homework6OOP2.task1;

public class OOP2Main {

	public static void main(String[] args) {
		Employee employee1 = new SalariedEmployee("1000", "987-65-4321", 18, 160);
		Employee employee2 = new SalariedEmployee("1001", "123-45-6789", 22, 160);
		Employee employee3 = new ContractEmployee("2000", true, 5000);
		Employee employee4 = new ContractEmployee("2001", true, 4500);

		Employee[] employees = { employee1, employee2, employee3, employee4 };

		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = 0; j < employees.length - i - 1; j++) {
				if (employees[j].calculatePay() < employees[j + 1].calculatePay()) {
					Employee temp = employees[j];
					employees[j] = employees[j + 1];
					employees[j + 1] = temp;
				}
			}
		}
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}
}
