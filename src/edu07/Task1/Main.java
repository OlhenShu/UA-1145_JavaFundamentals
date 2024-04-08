package edu07.Task1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee employee32001 = new SalariedEmployee("32001", 13, "356084512", 160);
        Employee employee12021 = new SalariedEmployee("12021", 45, "789456123", 158);
        Employee employee05081 = new ContractEmployee("05081", 3205, "984561234");
        Employee employee19704 = new ContractEmployee("19704", 4526, "123456852");


        Employee[] employees = {employee32001, employee12021, employee05081, employee19704};


        Arrays.sort(employees, new SalaryComparator());
        for (Employee employee : employees) {

            employee.getInfo();
        }
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.calculatePay() - o1.calculatePay();
    }
}

