package HomeWorks.HW7.Ex1;

import java.util.Collections;

public class RunnerEmployee {

    public static void main(String[] args) {

        ContractEmployee contractEmployee1 = new ContractEmployee("001", "Bob", 1000);
        ContractEmployee contractEmployee2 = new ContractEmployee("002", "Tod", 2000);
        ContractEmployee contractEmployee3 = new ContractEmployee("003", "Ann", 3000);
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("101", "Kate", 100, 40);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("102", "Dan", 200, 20);
        SalariedEmployee salariedEmployee3 = new SalariedEmployee("103", "Jim", 300, 15);

        Employee.employeeList.sort(new Comparator());
        Collections.reverse(Employee.employeeList);
        System.out.println(Employee.employeeList);


    }

    public static class Comparator implements java.util.Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getMonthlySalary() - o2.getMonthlySalary();
        }
    }
}
