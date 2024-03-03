package Homework_3;

// Homework 3 Task 3

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Enter information for person 1:");
        person1.input();

        Person person2 = new Person();
        System.out.println("Enter information for person 2:");
        person2.input();

        Person person3 = new Person();
        System.out.println("Enter information for person 3:");
        person3.input();

        Person person4 = new Person();
        System.out.println("Enter information for person 4:");
        person4.input();

        Person person5 = new Person();
        System.out.println("Enter information for person 5:");
        person5.input();

        System.out.println();
        System.out.println("Information about the people:");
        person1.output();
        System.out.println();
        person2.output();
        System.out.println();
        person3.output();
        System.out.println();
        person4.output();
        System.out.println();
        person5.output();
        System.out.println();
    }
}
