package edu01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the radius");
        double radius = scanner.nextDouble();

        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
        scanner.close();
    }
}

class Task2 {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        name = scanner.nextLine();

        String address;
        System.out.println("Where do you live," + name+"?");
        address = scanner.nextLine();
        System.out.println(name +" "+address);
        scanner.close();
    }
}

class Task3 {
    public static void main(String[] args) {
        double c1=100;
        double c2=102;
        double c3=108;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the duration of phone call t1");
        double t1 = scanner.nextDouble();

        System.out.println("Type the duration of phone call t2");
        double t2 = scanner.nextDouble();

        System.out.println("Type the duration of phone call t3");
        double t3 = scanner.nextDouble();

        System.out.println("Cost for duration" + " "+ t1 + " "+ "is = "+ (c1 * t1));
        System.out.println("Cost for duration" + " "+ t2 + " "+ "is = "+ (c2 * t2));
        System.out.println("Cost for duration" + " "+ t3 + " "+ "is = "+ (c3 * t3));

        System.out.println("Total cost is =" + ((c1 * t1)+(c2 * t2)+(c3 * t3)));
        scanner.close();
    }
}