package homework2;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Input information for person " + (i + 1) + ":");
            people[i] = new Person();
            people[i].input(scanner);
        }

        System.out.println("Information about people:");
        for (Person person : people) {
            person.output();
        }
    }
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        // Default constructor
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return 2024 - birthYear;
    }

    public void input(Scanner scanner) {
        System.out.print("Input first name: ");
        firstName = scanner.nextLine();

        System.out.print("Input last name: ");
        lastName = scanner.nextLine();

        System.out.print("Input birth year: ");
        birthYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
        System.out.println();
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty()) {
            firstName = fn;
        }
        if (ln != null && !ln.isEmpty()) {
            lastName = ln;
        }
    }

    // Properties
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
