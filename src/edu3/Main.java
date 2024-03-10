package Edu3;

import java.util.Scanner;

public class Person {
    private String firsName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public Person(String firsName, String lastName, int birthYear) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void input() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Input the first name: ");
        this.firsName = scann.nextLine();
        System.out.println("Input the last name: ");
        this.lastName = scann.nextLine();
        System.out.println("Input the birthday year: ");
        this.birthYear = scann.nextInt();

    }

    public void output() {
        System.out.println("First name: " + firsName + "; Last name: " + lastName + "; The birthday year: " + birthYear +
                "; Age " + getAge());

    }

    public void changeName() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Input new first name: ");
        this.firsName = scann.nextLine();
        System.out.println("Input new last name: ");
        this.lastName = scann.nextLine();

    }

    public int getAge() {
        int currentYear = 2024;
        return currentYear - birthYear;
    }


}