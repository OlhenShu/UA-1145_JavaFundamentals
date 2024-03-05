package edu03.task3;

import java.time.Year;

import static edu03.task3.Main.SCAN;


//Homework Task3

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this("N/A", "N/A");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void promptParameters(Person person) {
        System.out.println("What is first name?");
        String firstName = SCAN.nextLine();
        person.setFirstName(firstName);
        System.out.println("What is last name for " + person.getFirstName() + "?");
        String lastName = SCAN.nextLine();
        person.setLastName(lastName);
        System.out.println("What is birth year for " + person.getFirstName() + " " + person.getLastName() + "?");
        int birthYear = SCAN.nextInt();
        SCAN.nextLine();
        person.setBirthYear(birthYear);
    }

    /**
     * To change name of Person
     *
     * @param fn - new firstName
     * @param ln - new lastName
     */
    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public Person(String lastName, String firstName, int birthYear) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    /**
     * to calculate how many years
     *
     * @return age of the person
     */
    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
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