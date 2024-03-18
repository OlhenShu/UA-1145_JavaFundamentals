package Alt;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Employee {
    public static final Scanner SCANNER = new Scanner(in);
    String name;
    int departmentNumber;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 2, 1000);
        Employee employee2 = new Employee("Alice", 1, 900);
        Employee employee3 = new Employee("Alice", 3, 800);
        Employee employee4 = new Employee("Alice", 3, 1500);
        Employee employee5 = new Employee("Alice", 5, 2000);
        Employee employees[] = {employee1, employee2, employee3, employee4, employee5};
        System.out.println("input departmentNumber, to check employee department");
        sort(employees);
        int salaryEmp[] = new int[5];

        for (int i = 0; i < employees.length; i++) {
            salaryEmp[i] = employees[i].salary;
        }
        //Arrays.sort(salaryEmp);
        for (int i = 0; i < salaryEmp.length - 1; i++) {
            for (int j = 0; j < salaryEmp.length - i - 1; j++) {
                if (salaryEmp[j] < salaryEmp[j + 1]) {
                    int temp = salaryEmp[j];
                    salaryEmp[j] = salaryEmp[j + 1];
                    salaryEmp[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(salaryEmp));

/*        for (Employee employee : employees) {

            System.out.println(employee.salary);

        }*/
        Integer inputDepartment = SCANNER.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if (inputDepartment == employees[i].departmentNumber) {
                // if (inputDepartment.equals(employees.departmentNumber)){
                System.out.println("There is employee with that department " + inputDepartment);
            }

        }
    }

    private static Employee[] sort(Employee[] employees) {

        return employees;
    }

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }


}
