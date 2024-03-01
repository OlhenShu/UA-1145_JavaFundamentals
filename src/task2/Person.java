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


    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        firstName = scanner.nextLine();
        System.out.println("Enter Last Name:");
        lastName = scanner.nextLine();
        System.out.println("Enter Birth Year:");
        birthYear = scanner.nextInt();
        scanner.close();
    }


    public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alla", "fghj");
        person1.input();
        person1.output();
        Person person2 = new Person();
        person2.setFirstName("Anyal");
        person2.setLastName("Woldemort");
        person2.setBirthYear(2003);
        person2.output();
        Person person3 = new Person("Sonia", "Hode");
        person3.output();
        Person person4 = new Person("Ignacio", "Ubi");
        person4.output();
        Person person5 = new Person("Olesia", "Sagh");
        person5.output();
    }
}




