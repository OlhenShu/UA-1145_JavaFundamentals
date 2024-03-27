package edu07.HomeWork01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("126", "Evan", 12, 36, "3487569568"), //432
                new ContractEmployee("118", "Mark", 23, 22, "15463657879"), //506
                new ContractEmployee("116", "Sancho", 5, 40, ""), //200
                new ContractEmployee("120", "Robert", 120, 10, "00000056"), //1200
                new SalariedEmployee("301", "Bill", 118000, "3247593834"),
                new SalariedEmployee("306", "Jeff", 96000, "7847528549"),
        };

        Arrays.sort(employees);

        for (Employee employee : employees) {

            if (employee instanceof ContractEmployee) {
                System.out.println(employee);
            } else if (employee instanceof SalariedEmployee) {
                System.out.println(employee);
            }


        }

    }
}