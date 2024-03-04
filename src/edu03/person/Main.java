package edu03.person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person("Dami", "Lee");
        Person p5 = new Person("Charlie", "Brown", 2000);

        //Тут трохи намудрив, взявши regex в методі inputInfo(input), може вийти незграбно
        System.out.println("You should put info in line, with spaces or comas, and in that" +
                " direction: firstname lastname birthYear");

        System.out.println("Input information for person 1:");
        String line1 = sc.nextLine();
        p1.inputInfo(line1);
        System.out.println("Input information for person 2:");
        String line2 = sc.nextLine();
        p2.inputInfo(line2);
        System.out.println("Input information for person 3:");
        String line3 = sc.nextLine();
        p2.inputInfo(line3);
        //add value in missing place
        p4.setBirthYear(2000);

        System.out.println("Output information for person 1:" + p1.output());
        System.out.println("Output information for person 2:" + p2.output());
        System.out.println("Output information for person 3:" + p3.output());
        System.out.println("Output information for person 4:" + p4.output());
        System.out.println("Output information for person 5:" + p5.output());

        sc.close();
    }
}
