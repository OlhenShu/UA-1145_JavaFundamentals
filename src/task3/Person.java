import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
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
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(this.birthYear, 1, 1); // Assuming January 1st for simplicity
        Period period = Period.between(birthDate, today);
        return period.getYears();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        this.firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        this.lastName = scanner.nextLine();
        System.out.println("Enter birth year:");
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty()) {
            this.firstName = fn;
        }
        if (ln != null && !ln.isEmpty()) {
            this.lastName = ln;
        }
    }

    public static void main(String[] args) {
        Person[] people = new Person[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for person " + (i + 1));
            Person person = new Person();
            person.input();
            people[i] = person;
        }

        System.out.println("\nOutputting information about the people:");
        for (Person person : people) {
            person.output();
            System.out.println();
        }

        System.out.println("\nChanging the name of the first person:");
        System.out.println("Enter new first name:");
        String newFirstName = scanner.nextLine();
        people[0].changeName(newFirstName, null);
        people[0].output();
    }
}
