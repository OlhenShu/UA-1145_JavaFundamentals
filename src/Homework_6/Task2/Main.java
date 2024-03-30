package Homework_6.Task2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Olena", 28, 48398.50);
        Developer developer = new Developer("Pavlo", 32, 44465.30, "Middle Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
