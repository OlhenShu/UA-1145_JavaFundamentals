package edu08.clon;

public class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullName = (FullName) copyOfPerson.fullName.clone();
        return copyOfPerson;
    }

    public static void main(String[] args) {
        Person person = new Person(new FullName("Mike", "Green"), 25);
        Person copyOfPerson;
        try {
            copyOfPerson = (Person) person.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Original: " + person.fullName.firstName + " " + person.fullName.lastName + ", " + person.age);
        System.out.println("Cloned: " + copyOfPerson.fullName.firstName + " " + copyOfPerson.fullName.lastName + ", " + copyOfPerson.age);
        copyOfPerson.fullName.firstName = "Nick";
        copyOfPerson.fullName.lastName = "Brown";
        copyOfPerson.age = 37;

        System.out.println("=========================");

        System.out.println("Original: " + person.fullName.firstName + " " + person.fullName.lastName + ", " + person.age);
        System.out.println("Cloned: " + copyOfPerson.fullName.firstName + " " + copyOfPerson.fullName.lastName + ", " + copyOfPerson.age);
    }
}



