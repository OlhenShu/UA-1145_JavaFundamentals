package Third;
import static Third.Main.SCANNER;
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this("N/A","N/A"); // transfers the logic of creating an object of the Person class in any constructor;
    }

    public static void getAge(Person person) {
        int age = 2024 - person.getBirthYear();
        System.out.println("The age of person " + person.getFirstName() + " " + person.getLastName() + " is: " + age);
    }


    public static void input(Person person) {
        System.out.println(" ");
        System.out.println("Enter person`s name: ");
        person.setFirstName(SCANNER.nextLine());

        System.out.println("Enter person`s last name: ");
        person.setLastName(SCANNER.nextLine());

        System.out.println("Enter person`s birth year: ");
        person.setBirthYear(SCANNER.nextInt());
        SCANNER.nextLine();
    }

    public static void output(Person person) {
        System.out.println(" ");
        System.out.println("Information about person: " + person.toString());
        System.out.println(" ");
    }

    public static void changeName(Person person) {
        System.out.println(" ");
        System.out.println("For changing person`s name enter his new first name: ");
        String newFirstName = SCANNER.nextLine();
        person.setFirstName(newFirstName);

        System.out.println("For changing person`s name enter his new last name: ");
        String newLastName = SCANNER.nextLine();
        person.setLastName(newLastName);

        System.out.println("Person`s new name is: " + person.getFirstName() + " " + person.getLastName());
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "\n" +
                "Person`s name: " + firstName + "\n" +
                "Person`s last name: " + lastName + "\n" +
                "Person`s birthYear: " + birthYear;
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
}
