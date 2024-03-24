package HM2;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    //default constructor
    public Person() {
    }

    //constructors with 2 parameters
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //constructor with 3 parameters
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first name: ");
        this.firstName = sc.nextLine();
        System.out.print("Input last name: ");
        this.lastName = sc.nextLine();
        System.out.print("Input birth year: ");
        this.birthYear = sc.nextInt();
    }

    public void output() {
        System.out.println("Check information: ");
        System.out.println("first name: " + firstName + "\n"
                + "last name: " + lastName + "\n" +
                "Birth year: " + birthYear);
    }

    public int getAge() {
        this.birthYear = birthYear;//delete, it's not necessary
        int thisYear = 2024;//Year.now().getValue();
        int yourAge = thisYear - birthYear;
        System.out.println("You are: " + yourAge);
        return 0;//return yourAge; or method void

    }

    public void changeName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input new first name: ");
        this.firstName = sc.nextLine();
        System.out.println("Input new last name: ");
        this.lastName = sc.nextLine();
    }

    public void check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("All information are correct?(yes or no)");
        String check;
        check = sc.nextLine();
        if ("yes".equalsIgnoreCase(check)) {//method compares two strings, ignoring lower case
            // and upper case differences
            System.out.println("Continue");
        } else {
            changeName();
        }

    }
}

class inputInf {//naming for class InputInfo
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.input();
        person1.output();
        person1.getAge();
        person1.check();
        Person person2 = new Person();
        person2.input();
        person2.output();
        person2.getAge();
        person2.check();
        Person person3 = new Person();
        person3.input();
        person3.output();
        person3.getAge();
        person3.check();
        Person person4 = new Person();
        person4.input();
        person4.output();
        person4.getAge();
        person4.check();
        Person person5 = new Person();
        person5.input();
        person5.output();
        person5.getAge();
        person5.check();

    }
}

