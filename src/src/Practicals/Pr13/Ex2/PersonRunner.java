package Practicals.Pr13.Ex2;

import java.util.ArrayList;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Alice", 30);
        Person p3 = new Person("Bob", 40);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(list);

        list.sort(Person::compareTo);
        System.out.println(list);

    }


}
