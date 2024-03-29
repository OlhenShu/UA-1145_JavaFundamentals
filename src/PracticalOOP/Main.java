package PracticalOOP;

import java.util.Scanner;


import static PracticalOOP.Employee.printStatistics;

public class Main {
    public static void main(String[] args) {
        // Practical task 1
        Numbers.getNumber();
        Numbers.getTotal(6,7);

        // Practical task 2
        Employee employee1 = new Employee("Anna", 20.5, 8);
        printStatistics(employee1);
        Employee employee2 = new Employee( 2.5, 1);
        printStatistics(employee2);
        employee2.setName("Ira");
        Employee employee3 = new Employee();
        employee3.setName("Ivan");
        employee3.setRate(98);
        employee3.setHours(10);
        printStatistics(employee3);
    }
}
