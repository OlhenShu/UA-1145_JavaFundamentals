package Practicals.Pr5.Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee1 = new Employee("Bob", 5, 50);
        Employee employee2 = new Employee("Den", 2, 30);
        Employee employee3 = new Employee("Ket", 1, 20);
        Employee employee4 = new Employee("Nick", 5, 25);
        Employee employee5 = new Employee("Susi", 5, 40);

        ArrayList <Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);
        employeeArrayList.add(employee5);

        System.out.print("Workers what department do you want to find? Input here: ");
        int depNumb = scanner.nextInt();
        ArrayList tempList = Employee.findWorkersOfDepartment(employeeArrayList, depNumb);
        if (tempList.isEmpty()){
            System.out.println("There are no workers in department #" + depNumb);
        } else {
            System.out.println(tempList);
        }

        Employee.sortByTheSalary(employeeArrayList);
        for (var names: employeeArrayList ) {
            System.out.print(names.getName() + " ");
        }
    }
}
