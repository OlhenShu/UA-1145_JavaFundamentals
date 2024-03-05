package edu03.task3;

import java.util.Scanner;

import static java.lang.System.in;

//Homework Task3
public class Main {
    static public final Scanner SCAN = new Scanner(in);

    public static void main(String[] args) {

        Person person1 = new Person();
        Person.promptParameters(person1);
        System.out.println("Full information about person1 = " + person1 + " " + person1.getAge());

        Person person2 = new Person();
        Person.promptParameters(person2);
        System.out.println("Full information about person2 = " + person2 + " " + person2.getAge());

        Person person3 = new Person();
        Person.promptParameters(person3);
        System.out.println("Full information about person3 = " + person3 + " " + person3.getAge());

        Person person4 = new Person();
        Person.promptParameters(person4);
        System.out.println("Full information about person4 = " + person4 + " " + person4.getAge());

        Person person5 = new Person();
        Person.promptParameters(person5);
        System.out.println("Full information about person5 = " + person5 + " " + person5.getAge());

    }


}
