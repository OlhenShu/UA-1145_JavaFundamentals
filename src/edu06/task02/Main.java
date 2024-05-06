package edu06.task02;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Petro", 20, 52500.35);
        Employee devEmp = new Developer("Katerina", 28, 33735.0, "Middle SQL developer");
        Developer developer = new Developer("Taras", 32, 34000.0, "Average Java developer");
        System.out.println(employee.report());

        System.out.println(devEmp.report());
        System.out.println(developer.report());
        //better idea
        // Employee[] employees = new Employee[3];
        //    employees[0] = new Employee("Petro", 20, 52500.35);
        //    employees[1] = new Developer("Katerina", 28, 33735.0, "Middle SQL developer");
        //    employees[2] = new Developer("Taras", 32, 34000.0, "Average Java developer");
        //
        //    for (Employee emp : employees) {
        //        System.out.println(emp.report());
        //    }

    }
    //or an example with instanceof
//    public static void main(String[] args) {
//        Employee employee = new Employee("Petro", 20, 52500.35);
//        Employee devEmp = new Developer("Katerina", 28, 33735.0, "Middle SQL developer");
//        Developer developer = new Developer("Taras", 32, 34000.0, "Average Java developer");
//
//        printReport(employee);
//        printReport(devEmp);
//        printReport(developer);
//    }
//
//    public static void printReport(Employee employee) {
//        if (employee instanceof Developer) {
//            System.out.println("Developer's Report: " + employee.report());
//        } else {
//            System.out.println("Employee's Report: " + employee.report());
//        }
//    }
}