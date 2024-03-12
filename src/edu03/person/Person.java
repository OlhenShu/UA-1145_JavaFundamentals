package edu03.person;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Person() {
        this.firstName = "Antonio";
        this.lastName = "Banderos";
        this.birthYear = 1960;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 1930;
    }

    public void input() {
        System.out.print("Firstname input: ");
        Scanner in = new Scanner(System.in);
        String fN = in.next();
        System.out.print("Lastname input: ");
        String lN = in.next();
        System.out.print("Birthday year input: ");
        int year = in.nextInt();
        in.close();//it`s not good to close the scanner, because it will close the System.in,
        // and you will not be able to use it again in the program
        //better to close it in main method
        firstName = fN;
        lastName = lN;
        birthYear = year;
    }

    public void output() {
        System.out.print("Firstname: " + firstName +
                '\n' + "Lastname: " + lastName +
                '\n' + "Birthday year: " + birthYear +
                '\n' + "___________________\n");
    }

    public void changeName(String fN, String lN) {
        firstName = fN;
        lastName = lN;
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        int temp = calendar.get(Calendar.YEAR) - birthYear;
        return temp;
        //return Calendar.getInstance().get(Calendar.YEAR) - birthYear; // this is the same as the above 3 lines
    }
}
