package edu06.task02;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Petro", 20, 52500.35);
        Employee devEmp = new Developer("Katerina", 28, 33735.0, "Middle SQL developer");
        Developer developer = new Developer("Taras", 32, 34000.0, "Average Java developer");
        System.out.println(employee.report());

        System.out.println(devEmp.report());
        System.out.println(developer.report());

    }

}
