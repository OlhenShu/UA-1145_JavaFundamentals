package edu06.HomeWork02;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Mark", 43, 132000, "Average Java developer");
        Employee employee = new Employee("John", 29, 96000);

        System.out.println(developer.report());
        System.out.println(employee.report());
    }

}
