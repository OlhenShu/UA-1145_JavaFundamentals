package homework.hw3.person;

import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var person1 = Person.input(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        var person2 = Person.input(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        var person3 = Person.input(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        var person4 = Person.input(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        var person5 = Person.input(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}
