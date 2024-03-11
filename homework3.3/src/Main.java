import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Person[] people = new Person[5];
       Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for person "+(i+1)+":");
            Person person = new Person();
            person.input(scanner);
            people[i]=person;

        }

        System.out.println("Information about the people:");
        for(Person person:people){
            person.output();
        }
        scanner.close();
    }
}