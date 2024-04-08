package edu05.Hometask;

import java.util.Scanner;

public class Task03 {
    public static void main(String... str) {
        Scanner SCANNER = new Scanner(System.in);
        Car[] cars = {
                new Car("Citroen", 2009, 1.4),
                new Car("Mercedes", 2019, 2.0),
                new Car("BMW", 2024, 2.0),
                new Car("Renault", 2020, 1.6),
        };
        System.out.println("Enter year of production of the car: ");
        int i = SCANNER.nextInt();
        boolean found = false;
        for (var car : cars) {
            if (car.getYearOfProduction() == i) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is no car from #" + i + " year of production.");
        }
        System.out.println("=".repeat(40));
        sort(cars);
        for (var car : cars) {
            System.out.println(car);
        }
    }

    static void sort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++)
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getYearOfProduction() > cars[j + 1].getYearOfProduction()) {
                    var swap = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = swap;
                }
            }
    }
}

class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
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

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }
}