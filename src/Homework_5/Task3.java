package Homework_5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Car[] cars = {
                new Car("Sedan", 2020, 2.0),
                new Car("SUV", 2018, 3.5),
                new Car("Hatchback", 2018, 1.6),
                new Car("Coupe", 2017, 2.2),
                new Car("Convertible", 2020, 1.8),
        };

        System.out.println("Enter the year of production: ");

        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();

        // Output result for cars with certain model year:

        if (!isFound(cars, inputYear)) {
            System.out.println("There are no cars with year of production #" + inputYear);
        }

        //  Output result for sorted cars:

        System.out.println("\nThe sorted array of cars by year: ");

        sortCars(cars);
        for (var car : cars) {
            System.out.println(car);
        }
    }

    public static boolean isFound(Car[] cars, int inputYear) {
        boolean found = false;

        for (var car : cars) {
            if (inputYear == car.getYear()) {
                System.out.println(car);
                found = true;
            }
        }
        return found;
    }

    public static void sortCars(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getYear() > cars[j + 1].getYear()) {
                    var tmp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = tmp;
                }
            }
        }
    }
}

class Car {
    private String type;
    private int year;
    private double engineCapacity;

    public Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car {" +
                "type = '" + type + '\'' +
                ", year = " + year +
                ", engineCapacity = " + engineCapacity +
                '}';
    }
}
