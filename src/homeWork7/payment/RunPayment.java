package homeWork7.payment;

import java.util.Arrays;
import java.util.Comparator;

class RunPayment {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new ContractEmployee("qwerty1", "John", 12.5, 40,
                        "CE-12345"),
                new ContractEmployee("qwerty2", "Sam", 10.5, 30,
                        "CE-67890"),
                new SalariedEmployee("qwerty3", "Patrick", 2500,
                        "SE-54321"),
                new SalariedEmployee("qwerty4", "Andrea", 2800,
                        "SE-54567")
        };

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return Double.compare(b.calculatePay(), a.calculatePay());
            }
        });
        for (Employee employee : employees) {
            System.out.println(employee +
                    " \n and average monthly wage of the " + employee.getEmployeeName() +
                    " is " + employee.calculatePay());
        }
    }

}
