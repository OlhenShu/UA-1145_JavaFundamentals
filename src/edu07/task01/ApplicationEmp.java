package edu07.task01;


import java.util.*;

public class ApplicationEmp {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new HourlySalariedEmployee("343-765-1253",
                "123-45-6789 ", "Doofus", 24.3, 120);
        employees[1] = new FixedSalariedEmployee("917-555-4242",
                "111-11-1111", "George", 8888.8);
        employees[2] = new SalariedContractEmployee("917-555-4262",
                "453-16-3516", "Shmoe", 48.7, 80);
        employees[3] = new FixedContractEmployee("917-232-5622",
                "453-32-3576", "Joe", 5000);

        for (Employee employee : employees) {
            System.out.println(" Employee ID of that person is " + employee.getEmployeeId() +
                    ", name is '" + employee.getName() + "' and the wage: " + employee.calculatePay());
        }
        System.out.println("=".repeat(60));
        
        Arrays.sort(employees, new SalaryComparator());

        //Second realisation
       /* Arrays.sort(
                employees, new Comparator<>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return Double.compare(o2.calculatePay(), o1.calculatePay());
                    }
                });*/


        for (Employee employee : employees) {
            System.out.println(" Employee ID of that person is " + employee.getEmployeeId() +
                    ", name is '" + employee.getName() + "' and the wage: " + employee.calculatePay());

        }
    }
    }

