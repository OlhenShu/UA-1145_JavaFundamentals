package practical_tasks.pt3.employee;

import static practical_tasks.pt3.employee.Employee.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jerry", 12, 130.5);
        Employee emp2 = new Employee("Bob", 25, 142.5);
        Employee emp3 = new Employee("Mary", 18.5, 128.3);

        System.out.println("Salary first employee: " + getSalary(emp1));
        System.out.println("Salary second employee: " + getSalary(emp2));
        System.out.println("Salary third employee: " + getSalary(emp3));

        System.out.println("Bonus first employee: " + getBonus(emp1));
        System.out.println("Bonus first employee: " + getBonus(emp2));
        System.out.println("Bonus first employee: " + getBonus(emp3));

        System.out.println("Total salary sum: " + totalSum);
    }
}
