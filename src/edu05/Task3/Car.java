package src.edu05.Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    public String type;
    public int yearOfProduction;
    public int engineCapacity;

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Sedan", 2000, 500);
        Car car2 = new Car("Minivan", 2006, 450);
        Car car3 = new Car("Pickup", 2004, 350);
        Car car4 = new Car("Crossover", 2010, 510);

        Car[] cars = {car1, car2, car3, car4};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write year of production: ");

        int yearToFind = scanner.nextInt();
        for (Car car : cars) {
            if (car.yearOfProduction == yearToFind) {
                System.out.println(car);
            }
        }

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].yearOfProduction > cars[i + 1].yearOfProduction) {
                    Car temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                    isSorted = false;

                }
            }
        }

        System.out.println(Arrays.toString(cars));

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

