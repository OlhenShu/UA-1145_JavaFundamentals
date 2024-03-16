package HomeWork03;

import java.time.Year;
import java.util.Scanner;

import static java.lang.System.in;


public class Person {

    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println("Enter information about first person");
        person1.input();
        person1.changeName("Taras", "Sadiv");
        System.out.println("First name and last name have been changed");

        Person person2 = new Person();
        System.out.println("Enter information about second person");
        person2.input();

        Person person3 = new Person();
        System.out.println("Enter information about third person");
        person3.input();

        Person person4 = new Person();
        System.out.println("Enter information about fourth person");
        person4.input();

        Person person5 = new Person();
        System.out.println("Enter information about fifth person");
        person5.input();

        // Виведення інформації про кожну особу

        System.out.println("Information about first person:");
        person1.output();
        System.out.println("Information about second person:");
        person2.output();
        System.out.println("Information about third person:");
        person3.output();
        System.out.println("Information about fourth person:");
        person4.output();
        System.out.println("Information about fifth person:");
        person5.output();

    }

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        int correctYear = Year.now().getValue();
        return correctYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter the firs name: ");
        setFirstName(scanner.nextLine());
        System.out.print("Enter the last name: ");
        setLastName(scanner.nextLine());
        System.out.print("Enter the birth year: ");
        setBirthYear(scanner.nextInt());
        scanner.nextLine();
    }

    public void output() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("birthYear: " + getBirthYear());
        System.out.println("Age: " + getAge());
        System.out.println();
    }

    public void changeName(String newFirstName, String newLastName) {
        setFirstName(newFirstName);
        setLastName(newLastName);
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

