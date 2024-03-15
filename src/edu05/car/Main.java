package edu05.car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford Fusion", 2015, 3.6);
        Car car2 = new Car("Renault Megan", 2019, 1.8);
        Car car3 = new Car("Toyota Rav4", 2017, 2.5);
        Car car4 = new Car("Ford Explorer", 2018, 3.6);

        Car[] cars = {car1, car2, car3, car4};

        Scanner in = new Scanner(System.in);

        // Point 1 - Display information about the car according to the entered year
        System.out.print("Input year of production: ");
        int yearOfProduction = in.nextInt();

        boolean foundYear = false; // Check the availability of cars for the entered year
        for (int i = 0; i < cars.length; i++) {
            if (yearOfProduction == cars[i].getYearOfProduction()) {
                System.out.println("Cars produced in " + yearOfProduction + ":");
                cars[i].showInfo();
                foundYear = true;
                break;
            }
        }
        if (!foundYear) {
            System.out.println("No cars found for the specified year.");
        }

        // Point 2 - Sort the cars from the entered year in ascending order.
        Arrays.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));

        // Alternatively, we can use custom comparator instead of the method Arrays.sort.
        /*Arrays.sort(cars, new Comparator<>() {

            @Override
            public int compare(Car x, Car y) {
                if (x.getYearOfProduction() >= yearOfProduction && y.getYearOfProduction() >= yearOfProduction) {
                    return Integer.compare(x.getYearOfProduction(), y.getYearOfProduction());
                } else if (x.getYearOfProduction() >= yearOfProduction) {
                    return -1; // x > y
                } else if (y.getYearOfProduction() >= yearOfProduction) {
                    return 1; // y > x
                } else {
                    return Integer.compare(x.getYearOfProduction(), y.getYearOfProduction());
                }
            }
        });*/

        boolean foundCars = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfProduction() >= yearOfProduction) {
                if (!foundCars) {
                    System.out.println("\nCars sorted by year of production starting from " + yearOfProduction + ":");
                    foundCars = true;
                }
                cars[i].showInfo();
            }
        }

        // If the entered year is not found, we can display all available cars sorted by year (requirements should be clarified).
        if (!foundYear && !foundCars) {
            System.out.println("\nAll available cars sorted by year of production:");
            for (int i = 0; i < cars.length; i++) {
                cars[i].showInfo();
            }
        }

        // Alternatively, if the entered year is not found, we can display corresponding information.
        // To use the condition below, comment out the condition above "if (!foundYear && !foundCars)" and uncomment the condition below "if (!foundCars)".
        /*if (!foundCars) {
            System.out.println("\nCars sorted by year of production starting from " + yearOfProduction + ":" + System.lineSeparator() + "No cars found for the specified year.");
         }*/

        in.close();
    }
}