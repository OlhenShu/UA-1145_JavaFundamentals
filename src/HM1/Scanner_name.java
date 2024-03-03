package HM1;

import java.util.Scanner;
public class Scanner_name {
        public static void main(String[] args) {
            System.out.println("You need to write your full name and age");
            int age;
            String surname,name;
            Scanner sc = new Scanner(System.in);
            System.out.print("Surname: ");
            surname = sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Age: ");
            age = sc.nextInt();
            System.out.print("Age: ");
            System.out.println(age);
            System.out.print("Name: ");
            System.out.println(name);
            System.out.print("Surname: ");
            System.out.println(surname);
        }
    }

