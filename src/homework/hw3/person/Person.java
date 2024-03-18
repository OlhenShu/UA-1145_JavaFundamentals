package homework.hw3.person;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private String birthDate;

    public Person(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Person input(String... values) {
        return new Person(values[0], values[1], values[2]);
    }

    public void output() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Birth Year: " + getBirthDate());
        System.out.println("Age: " + getAge());
    }

    public void changeName(String firstName, String lastName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }


    public int getAge() {
        return Period.between(LocalDate.parse(birthDate), LocalDate.now()).getYears();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
