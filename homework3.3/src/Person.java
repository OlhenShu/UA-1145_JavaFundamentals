import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){
    }

    public Person(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName=lastName;
    }

    public int getAge() {
        return 2024- birthYear;
    }

    public void input(Scanner scanner){
        System.out.print("Enter first name: ");
        this.firstName=scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName=scanner.nextLine();

        System.out.print("Enter birth year: ");
        this.birthYear=scanner.nextInt();
        scanner.nextLine();
    }

    public void output(){
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Birth Year: "+ birthYear);
        System.out.println("Age: "+getAge());
    }
    public void changeName(String fn, String ln){
        this.firstName=fn;
        this.lastName=ln;
    }
}
