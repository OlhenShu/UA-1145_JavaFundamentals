package Practicals.Pr5.Ex4;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public static ArrayList<Employee> sortByTheSalary(ArrayList<Employee> employeeArrayList) {
        for (int i = 0; i < employeeArrayList.size() - 1; i++) {
            Employee temp1 = employeeArrayList.get(i);
            Employee temp2 = employeeArrayList.get(i + 1);
            if (temp1.getSalary() < temp2.getSalary()) {
                Employee temp = temp1;
                employeeArrayList.remove(i);
                employeeArrayList.add((i + 1), temp);
                i = 0;
            }
        }
        return employeeArrayList;
    }

    public static ArrayList<String> findWorkersOfDepartment(ArrayList<Employee> employeeArrayList, int departmentNumber) {
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < employeeArrayList.size(); i++) {
            Employee temp = employeeArrayList.get(i);
            int depNumbOfTempEmployee = temp.getDepartmentNumber();
            if (depNumbOfTempEmployee == departmentNumber) {
                resultList.add(temp.getName());
            }
        }
        return resultList;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getDepartmentNumber() {

        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {

        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }
}
