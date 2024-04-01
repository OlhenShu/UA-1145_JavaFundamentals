package practical_tasks.pt5.employee;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeesList = new ArrayList<>(5);

        employeesList.add(new Employee("Betty", 4, 1080));
        employeesList.add(new Employee("Barry", 7, 1540));
        employeesList.add(new Employee("Harry", 4, 2190));
        employeesList.add(new Employee("Nata", 7, 1235.5));
        employeesList.add(new Employee("Alice", 5, 1800.3));

        System.out.println(employeesList);
        System.out.println(getEmployeesByDepartment(employeesList, scanner.nextInt()));
        System.out.println(sortEmployeesBySalaryInDescendingOrder(employeesList));
    }

    public static List<Employee> getEmployeesByDepartment(List<Employee> employeeList, int departmentNumber) {
        List<Employee> employeesByDepartment = new ArrayList<>(5);
        for (Employee employee : employeeList) {
            if (employee.getDepartment() == departmentNumber) {
                employeesByDepartment.add(employee);
            }
        }
        return employeesByDepartment;
    }

    public static List<Employee> sortEmployeesBySalaryInDescendingOrder(List<Employee> employeeList) {
        return employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
    }
}
