package homework3;

import java.util.Scanner;

public class Employee {
    static public final Scanner SCANNER = new Scanner(System.in);
    private String firstName, lastName;
    private int birthYear;

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public void getAge(){
        System.out.println("Age of this employee is:"+getBirthYear());
    }
    public static void promptParameters(Employee employee) {
        System.out.println("Input first name:");
        String firstName = SCANNER.nextLine();
        employee.setFirstName(firstName);
        System.out.println("Input last name:");
        String lastName = SCANNER.nextLine();
        employee.setLastName(lastName);
        System.out.println("Input age for employee '" +
                employee.getFirstName() + employee.getLastName() + "':");
        int birthYear = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setBirthYear(birthYear);
    }
    public void output(){
        System.out.println("Employee first name:"+getFirstName()+"\nEmployee last name:"+getLastName()+"\nEmployee birth year:"+getBirthYear());
    }
    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
        System.out.println("New first name is:"+getFirstName()+"\nNew last name is:"+getLastName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
