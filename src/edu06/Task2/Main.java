package edu06.Task2;

public class Main {


    public static void main(String[] args) {
        Developer developer = new Developer("Maks Markus", 32, 3250, "Junior Java Developer", "Java");
        Employee employee = new Employee("Roman Barabash", 45, 5421);


        System.out.println(developer.report() + "\n"
                + employee.report());

    }
}
