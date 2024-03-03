package Third;

import java.util.Scanner;
import static Third.Person.input;
import static Third.Person.getAge;
import static Third.Person.output;
import static Third.Person.changeName;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please, enter information about first person");
        Person person1 = new Person();
        input(person1);
        output(person1);

        System.out.println("Please, enter information about second person");
        Person person2 = new Person();
        input(person2);
        getAge(person2);
        output(person2);

        System.out.println("Please, enter information third person");
        Person person3 = new Person();
        input(person3);
        changeName(person3);

        System.out.println("Please, enter information about forth person");
        Person person4 = new Person();
        input(person4);
        output(person4);
        changeName(person4);
        output(person4);

        System.out.println("Please, enter information about fifth person");
        Person person5 = new Person();
        input(person5);
        getAge(person5);
    }
}
