package Hometask2;

import java.util.Calendar;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setBirthYear(2001);
        person1.setFirstName("Andrea");
        person1.setLastName("Novyy");
        System.out.println(person1.output());
        person1.changeName("Iryna", "This");
        System.out.println(person1.getFirstName());
        System.out.println(person1.output());

        Person person2 = new Person();
        person2.input();
        System.out.println(person2.output());

        Person person3 = new Person();
        person2.input();
        System.out.println(person3.output());
        person3.setBirthYear(1980);
        person3.getAge(1980);
        System.out.println(person3.output());

        Person person4 = new Person("Olena", "Ilkiv");
        person3.setBirthYear(1980);
        person3.getAge(1980);
        System.out.println(person4.output());

        Person person5 = new Person("Vadym", "Lisnyy");
        person5.setBirthYear(2010);
        person5.getAge(2010);
        System.out.println("Last name is " + person5.getLastName());
        System.out.println("Year of birth is " + person5.getBirthYear());
        System.out.println(person5.output());
    }
}
class Person{
    private String firstName;
    private String lastName;
    private int birthYear;

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
    public int getAge(int birthYear) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year - birthYear);
        return year - birthYear;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new first name");
        firstName = scanner.nextLine();
        System.out.println("Enter new last name");
        lastName = scanner.nextLine();
        System.out.println("Enter new birth year");
        birthYear = scanner.nextInt();
    }

    public void changeName(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }

    public String output() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", BirthYear=" + birthYear +
                '}';
    }

}
