package EmployeeTask;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Employee implements Payment {
    String employeeId;
    double averageMonthlySalary;
    String name;

    public Employee(String employeeId, String name, double averageMonthlySalary) {
        this.employeeId = employeeId;
        this.averageMonthlySalary = averageMonthlySalary;
        this.name = name;
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new SalariedEmployee("001", "Sasha", 5000, "123-45-6789"));
        list.add(new ContractEmployee("002", "Veronika", "333-45-0005", 100, 20));
        list.add(new ContractEmployee("003", "Olesia", "111-67-7895", 120, 30));

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1 instanceof SalariedEmployee && !(e2 instanceof SalariedEmployee)) {
                    return -1;
                } else if (!(e1 instanceof SalariedEmployee) && e2 instanceof SalariedEmployee) {
                    return 1;
                } else {
                    return Double.compare(e1.getAverageMonthlySalary(), e2.getAverageMonthlySalary());
                }
            }
        });

        System.out.println("Employee id | Name | Average Monthly Wage");
        for (Employee employee : list) {
            System.out.println(employee.getEmployeeId() + " | " + employee.getName() + " | " + employee.getAverageMonthlySalary());
        }
    }

}

