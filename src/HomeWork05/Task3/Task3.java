package HomeWork05.Task3;

import java.util.Scanner;

class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

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
}

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = {
                new Car("Sedan", 2015, 2.0),
                new Car("SUV", 2018, 3.5),
                new Car("Hatchback", 2016, 1.6),
                new Car("Universal", 2019, 2.4)
        };


        System.out.print("Enter a year to filter cars: ");
        int filterYear = scanner.nextInt();

        System.out.println("\nCars produced in year " + filterYear + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == filterYear) {
                System.out.println(car);
            }
        }

        sort(cars);

        System.out.println("\nCars sorted by year of production:");
        for (Car car : cars) {
            System.out.println(car);
        }

        scanner.close();
    }

    public static void sort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }
}
