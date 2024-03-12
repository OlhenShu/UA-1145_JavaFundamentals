package edu03.person;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person();
        Person person2=new Person("Anna", "Vetrova");
        Person person3=new Person("Anna", "Vetrova", 1984);

        //Test output method
        person1.output();
        person2.output();
        person3.output();

        //Test changeName method
        System.out.println("Before changes: ");
        person1.output();
        person1.changeName("Anna", "Vetrove");
        System.out.println("After changes: ");
        person1.output();

        //Test input method
        System.out.println("Before changes: ");
        person2.output();
        person2.input();
        System.out.println("After changes: ");
        person2.output();

        //Test getAge method (Antonio Banderas was born 1960)
        System.out.print("Age: ");
        System.out.println(person3.getAge());
    }
}