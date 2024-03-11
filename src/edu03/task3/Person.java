package task3;

import java.util.Scanner;

import java.time.YearMonth;

public class Person {
    private String firstName;
    private String lastName;
    static private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public static void input(Person person) {
        Scanner infoScan = new Scanner(System.in);
        System.out.println("Input first name: ");
        String firstName = infoScan.nextLine();
        person.setFirstName(firstName);
        System.out.println("Input last name: ");
        String lastName = infoScan.nextLine();
        person.setLastName(lastName);
        System.out.println("Input birth year: ");
        int birthYear = infoScan.nextInt();
        person.setBirthYear(birthYear);

    }

    public static int getAge() {
        int currentYear = YearMonth.now().getYear();
        return currentYear - birthYear;
    }

    public static void output(Person person) {
        System.out.println("First name: " + person.firstName + " / " + "Last name:  " + person.lastName + " / " + "Age: " + getAge());
    }

    public void changeName(Person person) {
        Scanner newInfoScanner = new Scanner(System.in);
        System.out.println("If you want to change first name please write new one :" + getFirstName());
        String firstName = newInfoScanner.nextLine();
        person.setFirstName(firstName);

        System.out.println("If you want to change last name please write new one :" + getLastName());
        String lastName = newInfoScanner.nextLine();
        person.setLastName(lastName);
    }
}


