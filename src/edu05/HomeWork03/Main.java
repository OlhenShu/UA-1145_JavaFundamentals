package edu05.HomeWork03;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        Car[] cars = {
                new Car("Cabriolet", 1986, 1600),
                new Car("Hatchback", 2008, 1300),
                new Car("Universal", 2008, 2500),
                new Car("Coupe", 2022, 2200),
        };
        System.out.print("Enter year of production: ");
        int yearOfProduction = scan.nextInt();
        boolean found = false;
        for (var car : cars) {
            if (car.getYearOfProduction() == yearOfProduction) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no cars produced in " + yearOfProduction + " year.");
        }
        System.out.println("=".repeat(40));
        sort(cars);
        for (var car : cars) {
            System.out.println(car);
        }
    }

    static void sort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()) {
                    var swap = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = swap;
                }
            }
        }
    }
}
