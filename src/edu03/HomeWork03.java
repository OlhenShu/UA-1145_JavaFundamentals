package edu03;

import java.time.Year;
import java.util.Scanner;

import static java.lang.System.in;

public class HomeWork03 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input();
        person2.input();
        person3.input();
        person4.input();
        person5.input();

        System.out.println("Person1 = " + person1.output());
        System.out.println("Person2 = " + person2.output());
        System.out.println("Person3 = " + person3.output());
        System.out.println("Person4 = " + person4.output());
        System.out.println("Person5 = " + person5.output());


    }
}

class Person {
    /*
     firstName, lastName and birthYear
    */
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void input() {
        Scanner scan = new Scanner(in);
        System.out.print("Введіть ім'я: ");
        firstName = scan.nextLine();
        System.out.print("Введіть прізвище: ");
        lastName = scan.nextLine();
        System.out.print("Введіть рік народження: ");
        birthYear = scan.nextInt();
    }

    public String output() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear + '\'' +
                ", age=" + getAge() + '}';
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setAge(int age) {
    }

    //Метод по обчисленню віку персони
    public int getAge() {
        return Year.now().getValue() - birthYear;
    }
}
