package homeWork10;


import java.util.*;

public class Person {
    private final String firstName;
    private final String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public static void iterate(HashMap<String, String> a){

        for (HashMap.Entry<String, String> entry : a.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Sam", "Smith");
        Person person3 = new Person("Sam", "Swan");
        HashMap<String, String> personList = new HashMap<>();
        personList.put(person1.getFirstName(), person1.getLastName());
        personList.put(person2.getFirstName(), person2.getLastName());
        personList.put(person3.getFirstName(), person3.getLastName());
        iterate(personList);
        personList.remove("John");
        System.out.println("Resulting map after the removal.");
        iterate(personList);

    }
}

