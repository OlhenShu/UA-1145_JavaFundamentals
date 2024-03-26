package HomeWorks.HW3;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static int getAge(int birthYear) {
        int age = Year.now().getValue() - birthYear;
        return age;
    }

    public void input(String newFirstName, String newLastName, int newBirthYear) {
        firstName = newFirstName;
        lastName = newLastName;
        birthYear = newBirthYear;
    }

    public void changeName(String newFirstName, String newLastName) {
        firstName = newFirstName;
        lastName = newLastName;
    }

    public String output() {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person("Alla", "Kit");
        Person person2 = new Person("Mary", "Vovk");
        Person person3 = new Person("Igor", "Pes");
        Person person4 = new Person("Ivan", "Ptah");
        Person person5 = new Person();

        System.out.println(person1.output());

        System.out.println("Do you want to change first and last name of the person2? Type + or -");
        String answer = scanner.next();
        if (answer.equals("+")){
            System.out.println("What is the new first name of the person2?");
            String newFirstName = scanner.next();
            System.out.println("What is the new last name of the person2?");
            String newLastName = scanner.next();
            person2.changeName(newFirstName, newLastName);
            System.out.println("Congrats! You have change the person2");
            System.out.println(person2.output());
        }


        System.out.print("Input the first name of person5: ");
        String firstName = scanner.next();
        System.out.print("Input the last name of person5: ");
        String lastName = scanner.next();
        System.out.print("Input the birth year of person5: ");
        int birthYear = scanner.nextInt();

        person5.input(firstName, lastName, birthYear);

        System.out.println(person5.output());

        System.out.println("The age of person5 is " + getAge(person5.getBirthYear()));
    }
}
