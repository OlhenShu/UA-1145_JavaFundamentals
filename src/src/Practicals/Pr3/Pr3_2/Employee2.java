package Practicals.Pr3.Pr3_2;

public class Employee2 {
    public static void main(String[] args) {
        Employee employeeIvan = new Employee("Ivan", 20, 50);
        Employee employeeAnn = new Employee("Ann", 50, 30);
        Employee employeeSirko = new Employee("Sirko", 30, 10);

        System.out.println("The total salary of " + employeeIvan.getName() + " is " + (Employee.getSalary(employeeIvan.getRate(), employeeIvan.getHours()) + Employee.getBonuses(employeeIvan.getRate(), employeeIvan.getHours())));
        System.out.println("The total salary of " + employeeAnn.getName() + " is " + (Employee.getSalary(employeeAnn.getRate(), employeeAnn.getHours()) + Employee.getBonuses(employeeAnn.getRate(), employeeAnn.getHours())));
        System.out.println("The total salary of " + employeeSirko.getName() + " is " + (Employee.getSalary(employeeSirko.getRate(), employeeSirko.getHours())  + Employee.getBonuses(employeeSirko.getRate(), employeeSirko.getHours())));
    }
}
