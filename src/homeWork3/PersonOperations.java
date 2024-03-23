package homeWork3;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person1 = new Person();
        person1.setFirstName("Anna");
        person1.setLastName("SomeLN");
        person1.setBirthYear(1997);
        person1.changeName("AnnaEdited", "SomeLNEdited");
        person1.output();

        Person person2 = new Person();
        person2.input(sc);
        person2.output();
    }
}

class Person {
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

    public int getAge() {
        return LocalDate.now().getYear() - getBirthYear();
    }

    public void input(Scanner scanner) {
        System.out.println("Input the First name of the person:");
        setFirstName(scanner.nextLine());
        System.out.println("Input the Last name of the person:");
        setLastName(scanner.nextLine());
        System.out.println("Input the Birth Year of the person:");
        setBirthYear(scanner.nextInt());
    }

    public void output() {
        System.out.println("The First name of the person is:" + getFirstName());
        System.out.println("The Last name of the person is:" + getLastName());
        System.out.println("The Birth Year of the person is:" + getBirthYear());
        System.out.println("The Age of the person is:" + getAge());

    }

    public void changeName(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }
}

