import java.util.Scanner;

// Homework 3 Task 3

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return 2024 - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter birth year: ");
        birthYear = scanner.nextInt();
        System.out.println();
    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String firstN, String lastN) {
        this.firstName = firstN;
        this.lastName = lastN;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Enter information for person 1:");
        person1.input();

        Person person2 = new Person();
        System.out.println("Enter information for person 2:");
        person2.input();

        Person person3 = new Person();
        System.out.println("Enter information for person 3:");
        person3.input();

        Person person4 = new Person();
        System.out.println("Enter information for person 4:");
        person4.input();

        Person person5 = new Person();
        System.out.println("Enter information for person 5:");
        person5.input();

        System.out.println();
        System.out.println("Information about the people:");
        person1.output();
        System.out.println();
        person2.output();
        System.out.println();
        person3.output();
        System.out.println();
        person4.output();
        System.out.println();
        person5.output();
        System.out.println();
    }
}
