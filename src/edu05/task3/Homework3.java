package edu05.task3;

import java.util.Scanner;

public class Homework3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Car[] cars = {
                new Car("Mercedes", 1995, 2.5),
                new Car("Smart", 2018, 1.0),
                new Car("Volkswagen", 2018, 2.0),
                new Car("Audi", 2009, 2.5),
        };
        System.out.println("Enter the year of production:");
        int yearToFilter = SCANNER.nextInt();
        boolean found = false;
        for (var car : cars) {
            if (car.getYearOfProduction() == yearToFilter) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cars found");
        }
        System.out.println("=".repeat(40));
        ascendingSort(cars);
        for (var car : cars) {
            System.out.println(car);
        }
    }

    static void ascendingSort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getYearOfProduction() > cars[j + 1].getYearOfProduction()) {
                    var swap = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = swap;
                }
            }
        }
    }
}

class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}